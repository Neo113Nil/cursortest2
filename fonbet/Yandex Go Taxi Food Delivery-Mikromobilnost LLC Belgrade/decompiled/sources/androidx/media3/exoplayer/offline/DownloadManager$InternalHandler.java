package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.exoplayer.scheduler.Requirements;
import defpackage.d6z;
import defpackage.k7m;
import defpackage.lk91;
import defpackage.ny61;
import defpackage.pb51;
import defpackage.tw21;
import defpackage.u6m;
import defpackage.v7m;
import defpackage.x6m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public final class DownloadManager$InternalHandler extends Handler {
    private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
    private int activeDownloadTaskCount;
    private final HashMap<String, d> activeTasks;
    private final pb51 downloadIndex;
    private final v7m downloaderFactory;
    private final ArrayList<u6m> downloads;
    private boolean downloadsPaused;
    private boolean hasActiveRemoveTask;
    private final Handler mainHandler;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    public boolean released;
    private final HandlerThread thread;

    public DownloadManager$InternalHandler(HandlerThread handlerThread, pb51 pb51Var, v7m v7mVar, Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.thread = handlerThread;
        this.downloadIndex = pb51Var;
        this.downloaderFactory = v7mVar;
        this.mainHandler = handler;
        this.maxParallelDownloads = i;
        this.minRetryCount = i2;
        this.downloadsPaused = z;
        this.downloads = new ArrayList<>();
        this.activeTasks = new HashMap<>();
    }

    private void addDownload(DownloadRequest downloadRequest, int i) {
        u6m download = getDownload(downloadRequest.id, true);
        long currentTimeMillis = System.currentTimeMillis();
        if (download != null) {
            Requirements requirements = e.o;
            int i2 = download.b;
            putDownload(new u6m(download.a.copyWithMergedRequest(downloadRequest), (i2 == 5 || i2 == 7) ? 7 : i != 0 ? 1 : 0, (i2 == 5 || i2 == 3 || i2 == 4) ? currentTimeMillis : download.c, currentTimeMillis, i));
        } else {
            putDownload(new u6m(downloadRequest, i != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, i));
        }
        syncTasks();
    }

    private boolean canDownloadsRun() {
        return !this.downloadsPaused && this.notMetRequirements == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareStartTimes(u6m u6mVar, u6m u6mVar2) {
        long j = u6mVar.c;
        long j2 = u6mVar2.c;
        int i = tw21.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private static u6m copyDownloadWithState(u6m u6mVar, int i, int i2) {
        return new u6m(u6mVar.a, i, u6mVar.c, System.currentTimeMillis(), u6mVar.e, i2, 0, u6mVar.h);
    }

    private u6m getDownload(String str, boolean z) {
        int downloadIndex = getDownloadIndex(str);
        if (downloadIndex != -1) {
            return this.downloads.get(downloadIndex);
        }
        if (!z) {
            return null;
        }
        try {
            return this.downloadIndex.getDownload(str);
        } catch (IOException e) {
            lk91.f("DownloadManager", "Failed to load download: " + str, e);
            return null;
        }
    }

    private int getDownloadIndex(String str) {
        for (int i = 0; i < this.downloads.size(); i++) {
            if (this.downloads.get(i).a.id.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private void initialize(int i) {
        this.notMetRequirements = i;
        x6m x6mVar = null;
        try {
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
                x6mVar = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                while (x6mVar.moveToNext()) {
                    this.downloads.add(x6mVar.getDownload());
                }
            } catch (IOException e) {
                lk91.f("DownloadManager", "Failed to load index.", e);
                this.downloads.clear();
            }
            this.mainHandler.obtainMessage(1, new ArrayList(this.downloads)).sendToTarget();
            syncTasks();
        } finally {
            tw21.g(x6mVar);
        }
    }

    private void onContentLengthChanged(d dVar, long j) {
        u6m download = getDownload(dVar.a.id, false);
        download.getClass();
        if (j == download.e || j == -1) {
            return;
        }
        putDownload(new u6m(download.a, download.b, download.c, System.currentTimeMillis(), j, download.f, download.g, download.h));
    }

    private void onDownloadTaskStopped(u6m u6mVar, Exception exc) {
        u6m u6mVar2 = new u6m(u6mVar.a, exc == null ? 3 : 4, u6mVar.c, System.currentTimeMillis(), u6mVar.e, u6mVar.f, exc == null ? 0 : 1, u6mVar.h);
        this.downloads.remove(getDownloadIndex(u6mVar2.a.id));
        try {
            this.downloadIndex.putDownload(u6mVar2);
        } catch (IOException e) {
            lk91.f("DownloadManager", "Failed to update index.", e);
        }
        this.mainHandler.obtainMessage(3, new k7m(u6mVar2, false, new ArrayList(this.downloads), exc)).sendToTarget();
    }

    private void onRemoveTaskStopped(u6m u6mVar) {
        int i = u6mVar.b;
        DownloadRequest downloadRequest = u6mVar.a;
        if (i == 7) {
            int i2 = u6mVar.f;
            putDownloadWithState(u6mVar, i2 == 0 ? 0 : 1, i2);
            syncTasks();
        } else {
            this.downloads.remove(getDownloadIndex(downloadRequest.id));
            try {
                this.downloadIndex.removeDownload(downloadRequest.id);
            } catch (IOException unused) {
                lk91.e("DownloadManager", "Failed to remove from database");
            }
            this.mainHandler.obtainMessage(3, new k7m(u6mVar, true, new ArrayList(this.downloads), null)).sendToTarget();
        }
    }

    private void onTaskStopped(d dVar) {
        String str = dVar.a.id;
        this.activeTasks.remove(str);
        boolean z = dVar.w;
        if (z) {
            this.hasActiveRemoveTask = false;
        } else {
            int i = this.activeDownloadTaskCount - 1;
            this.activeDownloadTaskCount = i;
            if (i == 0) {
                removeMessages(12);
            }
        }
        if (dVar.z) {
            syncTasks();
            return;
        }
        Exception exc = dVar.A;
        if (exc != null) {
            lk91.f("DownloadManager", "Task failed: " + dVar.a + Extension.FIX_SPACE + z, exc);
        }
        u6m download = getDownload(str, false);
        download.getClass();
        int i2 = download.b;
        if (i2 == 2) {
            d6z.x(!z);
            onDownloadTaskStopped(download, exc);
        } else if (i2 != 5 && i2 != 7) {
            ny61.k();
            return;
        } else {
            d6z.x(z);
            onRemoveTaskStopped(download);
        }
        syncTasks();
    }

    private u6m putDownload(u6m u6mVar) {
        int i = u6mVar.b;
        d6z.x((i == 3 || i == 4) ? false : true);
        int downloadIndex = getDownloadIndex(u6mVar.a.id);
        if (downloadIndex == -1) {
            this.downloads.add(u6mVar);
            Collections.sort(this.downloads, new c());
        } else {
            boolean z = u6mVar.c != this.downloads.get(downloadIndex).c;
            this.downloads.set(downloadIndex, u6mVar);
            if (z) {
                Collections.sort(this.downloads, new c());
            }
        }
        try {
            this.downloadIndex.putDownload(u6mVar);
        } catch (IOException e) {
            lk91.f("DownloadManager", "Failed to update index.", e);
        }
        this.mainHandler.obtainMessage(3, new k7m(u6mVar, false, new ArrayList(this.downloads), null)).sendToTarget();
        return u6mVar;
    }

    private u6m putDownloadWithState(u6m u6mVar, int i, int i2) {
        d6z.x((i == 3 || i == 4) ? false : true);
        return putDownload(copyDownloadWithState(u6mVar, i, i2));
    }

    private void release() {
        Iterator<d> it = this.activeTasks.values().iterator();
        while (it.hasNext()) {
            it.next().a(true);
        }
        try {
            this.downloadIndex.setDownloadingStatesToQueued();
        } catch (IOException e) {
            lk91.f("DownloadManager", "Failed to update index.", e);
        }
        this.downloads.clear();
        this.thread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    private void removeAllDownloads() {
        ArrayList<u6m> arrayList;
        ArrayList arrayList2 = new ArrayList();
        try {
            x6m downloads = this.downloadIndex.getDownloads(3, 4);
            while (downloads.moveToNext()) {
                try {
                    arrayList2.add(downloads.getDownload());
                } finally {
                }
            }
            downloads.close();
        } catch (IOException unused) {
            lk91.e("DownloadManager", "Failed to load downloads.");
        }
        for (int i = 0; i < this.downloads.size(); i++) {
            ArrayList<u6m> arrayList3 = this.downloads;
            arrayList3.set(i, copyDownloadWithState(arrayList3.get(i), 5, 0));
        }
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            arrayList = this.downloads;
            if (i2 >= size) {
                break;
            }
            arrayList.add(copyDownloadWithState((u6m) arrayList2.get(i2), 5, 0));
            i2++;
        }
        Collections.sort(arrayList, new c());
        try {
            this.downloadIndex.setStatesToRemoving();
        } catch (IOException e) {
            lk91.f("DownloadManager", "Failed to update index.", e);
        }
        ArrayList arrayList4 = new ArrayList(this.downloads);
        for (int i3 = 0; i3 < this.downloads.size(); i3++) {
            this.mainHandler.obtainMessage(3, new k7m(this.downloads.get(i3), false, arrayList4, null)).sendToTarget();
        }
        syncTasks();
    }

    private void removeDownload(String str) {
        u6m download = getDownload(str, true);
        if (download != null) {
            putDownloadWithState(download, 5, 0);
            syncTasks();
        } else {
            lk91.e("DownloadManager", "Failed to remove nonexistent download: " + str);
        }
    }

    private void setDownloadsPaused(boolean z) {
        this.downloadsPaused = z;
        syncTasks();
    }

    private void setMaxParallelDownloads(int i) {
        this.maxParallelDownloads = i;
        syncTasks();
    }

    private void setMinRetryCount(int i) {
        this.minRetryCount = i;
    }

    private void setNotMetRequirements(int i) {
        this.notMetRequirements = i;
        syncTasks();
    }

    private void setStopReason(String str, int i) {
        if (str == null) {
            for (int i2 = 0; i2 < this.downloads.size(); i2++) {
                setStopReason(this.downloads.get(i2), i);
            }
            try {
                this.downloadIndex.setStopReason(i);
            } catch (IOException e) {
                lk91.f("DownloadManager", "Failed to set manual stop reason", e);
            }
        } else {
            u6m download = getDownload(str, false);
            if (download != null) {
                setStopReason(download, i);
            } else {
                try {
                    this.downloadIndex.setStopReason(str, i);
                } catch (IOException e2) {
                    lk91.f("DownloadManager", "Failed to set manual stop reason: ".concat(str), e2);
                }
            }
        }
        syncTasks();
    }

    private void syncDownloadingDownload(d dVar, u6m u6mVar, int i) {
        d6z.x(!dVar.w);
        if (!canDownloadsRun() || i >= this.maxParallelDownloads) {
            putDownloadWithState(u6mVar, 0, 0);
            dVar.a(false);
        }
    }

    private d syncQueuedDownload(d dVar, u6m u6mVar) {
        if (dVar != null) {
            d6z.x(!dVar.w);
            dVar.a(false);
            return dVar;
        }
        if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
            return null;
        }
        u6m putDownloadWithState = putDownloadWithState(u6mVar, 2, 0);
        d dVar2 = new d(putDownloadWithState.a, this.downloaderFactory.createDownloader(putDownloadWithState.a), putDownloadWithState.h, false, this.minRetryCount, this);
        this.activeTasks.put(putDownloadWithState.a.id, dVar2);
        int i = this.activeDownloadTaskCount;
        this.activeDownloadTaskCount = i + 1;
        if (i == 0) {
            sendEmptyMessageDelayed(12, 5000L);
        }
        dVar2.start();
        return dVar2;
    }

    private void syncRemovingDownload(d dVar, u6m u6mVar) {
        if (dVar != null) {
            if (dVar.w) {
                return;
            }
            dVar.a(false);
        } else {
            if (this.hasActiveRemoveTask) {
                return;
            }
            d dVar2 = new d(u6mVar.a, this.downloaderFactory.createDownloader(u6mVar.a), u6mVar.h, true, this.minRetryCount, this);
            this.activeTasks.put(u6mVar.a.id, dVar2);
            this.hasActiveRemoveTask = true;
            dVar2.start();
        }
    }

    private void syncStoppedDownload(d dVar) {
        if (dVar != null) {
            d6z.x(!dVar.w);
            dVar.a(false);
        }
    }

    private void syncTasks() {
        int i = 0;
        for (int i2 = 0; i2 < this.downloads.size(); i2++) {
            u6m u6mVar = this.downloads.get(i2);
            d dVar = this.activeTasks.get(u6mVar.a.id);
            int i3 = u6mVar.b;
            if (i3 == 0) {
                dVar = syncQueuedDownload(dVar, u6mVar);
            } else if (i3 == 1) {
                syncStoppedDownload(dVar);
            } else if (i3 == 2) {
                dVar.getClass();
                syncDownloadingDownload(dVar, u6mVar, i);
            } else {
                if (i3 != 5 && i3 != 7) {
                    ny61.k();
                    return;
                }
                syncRemovingDownload(dVar, u6mVar);
            }
            if (dVar != null && !dVar.w) {
                i++;
            }
        }
    }

    private void updateProgress() {
        for (int i = 0; i < this.downloads.size(); i++) {
            u6m u6mVar = this.downloads.get(i);
            if (u6mVar.b == 2) {
                try {
                    this.downloadIndex.putDownload(u6mVar);
                } catch (IOException e) {
                    lk91.f("DownloadManager", "Failed to update index.", e);
                }
            }
        }
        sendEmptyMessageDelayed(12, 5000L);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = 0;
        switch (message.what) {
            case 1:
                initialize(message.arg1);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 2:
                setDownloadsPaused(message.arg1 != 0);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 3:
                setNotMetRequirements(message.arg1);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 4:
                setStopReason((String) message.obj, message.arg1);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 5:
                setMaxParallelDownloads(message.arg1);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 6:
                setMinRetryCount(message.arg1);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 7:
                addDownload((DownloadRequest) message.obj, message.arg1);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 8:
                removeDownload((String) message.obj);
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 9:
                removeAllDownloads();
                i = 1;
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 10:
                onTaskStopped((d) message.obj);
                this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                break;
            case 11:
                onContentLengthChanged((d) message.obj, tw21.k0(message.arg1, message.arg2));
                break;
            case 12:
                updateProgress();
                break;
            case 13:
                release();
                break;
            default:
                ny61.k();
                break;
        }
    }

    private void setStopReason(u6m u6mVar, int i) {
        if (i == 0) {
            if (u6mVar.b == 1) {
                putDownloadWithState(u6mVar, 0, 0);
            }
        } else if (i != u6mVar.f) {
            int i2 = u6mVar.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            putDownload(new u6m(u6mVar.a, i2, u6mVar.c, System.currentTimeMillis(), u6mVar.e, i, 0, u6mVar.h));
        }
    }
}
