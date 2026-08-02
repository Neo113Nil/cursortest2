package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import defpackage.a9z0;
import defpackage.au1;
import defpackage.bo31;
import defpackage.k4h;
import defpackage.sf10;
import defpackage.tf10;
import defpackage.tw21;
import defpackage.uf10;
import defpackage.vyc0;
import defpackage.we10;
import defpackage.wzy;
import defpackage.xe10;
import defpackage.xzy;
import defpackage.z8z0;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes10.dex */
final class YandexDownloadHelper$MediaPreparer implements tf10, we10, Handler.Callback {
    private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
    private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
    private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
    private static final int MESSAGE_CONTINUE_LOADING = 3;
    private static final int MESSAGE_PREPARE_SOURCE = 1;
    private static final int MESSAGE_RELEASE = 4;
    private final f downloadHelper;
    private final boolean experimentalLiveDashPreloadEnabled;
    public xe10[] mediaPeriods;
    private final uf10 mediaSource;
    private final Handler mediaSourceHandler;
    private final HandlerThread mediaSourceThread;
    private boolean released;
    public a9z0 timeline;
    private final au1 allocator = new k4h();
    private final ArrayList<xe10> pendingMediaPeriods = new ArrayList<>();
    private final Handler downloadHelperHandler = tw21.o(new a(1, this));

    public YandexDownloadHelper$MediaPreparer(uf10 uf10Var, f fVar, boolean z) {
        this.mediaSource = uf10Var;
        this.downloadHelper = fVar;
        HandlerThread handlerThread = new HandlerThread("YP:YDownloadHelper");
        this.mediaSourceThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.mediaSourceHandler = handler;
        handler.sendEmptyMessage(1);
        this.experimentalLiveDashPreloadEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleDownloadHelperCallbackMessage(Message message) {
        if (this.released) {
            return false;
        }
        int i = message.what;
        if (i == 1) {
            try {
                f.a(this.downloadHelper);
                return true;
            } catch (ExoPlaybackException e) {
                this.downloadHelperHandler.obtainMessage(2, new IOException(e)).sendToTarget();
                return true;
            }
        }
        if (i != 2) {
            return false;
        }
        release();
        f fVar = this.downloadHelper;
        Object obj = message.obj;
        int i2 = tw21.a;
        Handler handler = fVar.e;
        handler.getClass();
        handler.post(new bo31(12, fVar, (IOException) obj));
        return true;
    }

    private boolean maybeThrowUnsupportedLivePreloadException(a9z0 a9z0Var) {
        if (this.experimentalLiveDashPreloadEnabled || !a9z0Var.n(0, new z8z0(), 0L).b()) {
            return false;
        }
        this.downloadHelperHandler.obtainMessage(2, new IOException() { // from class: androidx.media3.exoplayer.offline.YandexDownloadHelper$LiveContentUnsupportedException
        }).sendToTarget();
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.mediaSource.prepareSource(this, null, vyc0.d);
            this.mediaSourceHandler.sendEmptyMessage(2);
            return true;
        }
        int i2 = 0;
        if (i == 2) {
            try {
                if (this.mediaPeriods == null) {
                    this.mediaSource.maybeThrowSourceInfoRefreshError();
                } else {
                    while (i2 < this.pendingMediaPeriods.size()) {
                        this.pendingMediaPeriods.get(i2).j();
                        i2++;
                    }
                }
                this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100L);
                return true;
            } catch (IOException e) {
                this.downloadHelperHandler.obtainMessage(2, e).sendToTarget();
                return true;
            }
        }
        if (i == 3) {
            xe10 xe10Var = (xe10) message.obj;
            if (this.pendingMediaPeriods.contains(xe10Var)) {
                wzy wzyVar = new wzy();
                wzyVar.a = 0L;
                xe10Var.n(new xzy(wzyVar));
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        xe10[] xe10VarArr = this.mediaPeriods;
        if (xe10VarArr != null) {
            int length = xe10VarArr.length;
            while (i2 < length) {
                this.mediaSource.releasePeriod(xe10VarArr[i2]);
                i2++;
            }
        }
        this.mediaSource.releaseSource(this);
        this.mediaSourceHandler.removeCallbacksAndMessages(null);
        this.mediaSourceThread.quit();
        return true;
    }

    @Override // defpackage.trq0
    public void onContinueLoadingRequested(xe10 xe10Var) {
        if (this.pendingMediaPeriods.contains(xe10Var)) {
            this.mediaSourceHandler.obtainMessage(3, xe10Var).sendToTarget();
        }
    }

    @Override // defpackage.we10
    public void onPrepared(xe10 xe10Var) {
        this.pendingMediaPeriods.remove(xe10Var);
        if (this.pendingMediaPeriods.isEmpty()) {
            this.mediaSourceHandler.removeMessages(2);
            this.downloadHelperHandler.sendEmptyMessage(1);
        }
    }

    @Override // defpackage.tf10
    public void onSourceInfoRefreshed(uf10 uf10Var, a9z0 a9z0Var) {
        xe10[] xe10VarArr;
        if (this.timeline == null && !maybeThrowUnsupportedLivePreloadException(a9z0Var)) {
            this.timeline = a9z0Var;
            this.mediaPeriods = new xe10[a9z0Var.i()];
            int i = 0;
            while (true) {
                xe10VarArr = this.mediaPeriods;
                if (i >= xe10VarArr.length) {
                    break;
                }
                xe10 createPeriod = this.mediaSource.createPeriod(new sf10(a9z0Var.m(i)), this.allocator, 0L);
                this.mediaPeriods[i] = createPeriod;
                this.pendingMediaPeriods.add(createPeriod);
                i++;
            }
            for (xe10 xe10Var : xe10VarArr) {
                xe10Var.l(this, 0L);
            }
        }
    }

    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        this.mediaSourceHandler.sendEmptyMessage(4);
    }
}
