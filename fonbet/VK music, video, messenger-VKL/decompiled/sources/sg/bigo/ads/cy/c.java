package sg.bigo.ads.cy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.g;
import xsna.m5k;

/* loaded from: classes9.dex */
public final class c {
    public static final c a = new c();
    public sg.bigo.ads.az.a c;
    public Context d;
    private long e = 0;
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<b>> f = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Boolean> g = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();

    public static final class a {

        @Nullable
        public final sg.bigo.ads.api.core.b a;

        @NonNull
        public final String b;

        public a(@Nullable sg.bigo.ads.api.core.b bVar, @NonNull String str) {
            this.a = bVar;
            this.b = str;
        }
    }

    private c() {
    }

    public static c a() {
        return a;
    }

    public final void b() {
        if (System.currentTimeMillis() - this.e > 3600000) {
            c();
        }
    }

    public final void c() {
        if (this.d == null) {
            return;
        }
        this.e = System.currentTimeMillis();
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.cy.c.2
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.a, c.this.d);
            }
        }, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(File file) {
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    return new File(file, ".bigo_playable_extract_ok").isFile();
                }
            } catch (Throwable th) {
                sg.bigo.ads.bn.a.a("PlayableZip", "isCacheReady: " + th.getMessage());
            }
        }
        return false;
    }

    public final void a(@NonNull final Context context, @NonNull final o oVar, @NonNull final b bVar) {
        final String aA = oVar.aA();
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) oVar, 0, aA, 0L, 0L, (String) null);
        if (TextUtils.isEmpty(aA)) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) oVar, 2, "", 0L, 0L, "empty url");
            bVar.a("", 2, "empty zip url");
            return;
        }
        final String a2 = sg.bigo.ads.cy.a.a(aA);
        if (TextUtils.isEmpty(a2)) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) oVar, 2, aA, 0L, 0L, "cacheKey 为空(MD5 异常)");
            bVar.a("", 6, "cacheKey is null");
            return;
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.cy.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File file = new File(sg.bigo.ads.an.o.c(context, a2));
                    File file2 = new File(file, "package.zip");
                    if (c.c(file)) {
                        long length = file2.isFile() ? file2.length() : 0L;
                        if (file2.isFile() && !file2.delete()) {
                            sg.bigo.ads.bn.a.a("PlayableZip", "cache hit: delete legacy package.zip failed");
                        }
                        sg.bigo.ads.da.b.a(oVar, 1, aA, length, 0L, (String) null, 0);
                        bVar.a(a2, file, false);
                        return;
                    }
                    sg.bigo.ads.ay.b bVar2 = sg.bigo.ads.core.player.b.a().c;
                    if (bVar2 == null) {
                        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) oVar, 2, aA, 0L, 0L, "DownloadManager not ready");
                        bVar.a(a2, 1, "DownloadManager not ready");
                        return;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) c.this.f.putIfAbsent(a2, copyOnWriteArrayList);
                    if (copyOnWriteArrayList2 != null) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                    }
                    copyOnWriteArrayList.add(bVar);
                    if (c.this.g.putIfAbsent(a2, Boolean.TRUE) != null) {
                        return;
                    }
                    c.this.b.put(a2, new a(oVar, aA));
                    c.a(c.a, context, aA, a2, bVar2);
                } catch (Throwable th) {
                    sg.bigo.ads.bn.a.a("PlayableZip", "downloadAndExtract setup failed: " + th.getMessage());
                    c.this.g.remove(a2);
                    sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) oVar, 2, aA, 0L, 0L, m5k.b(th, new StringBuilder("download zip error: ")));
                    bVar.a(a2, 6, "download zip error: " + th.getMessage());
                }
            }
        };
        if (sg.bigo.ads.bh.d.a()) {
            runnable.run();
        } else {
            sg.bigo.ads.bh.d.a(1, runnable);
        }
    }

    private void a(@NonNull File file, @NonNull sg.bigo.ads.az.a aVar) {
        File[] listFiles;
        sg.bigo.ads.az.a aVar2;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory()) {
                arrayList.add(file2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new Comparator<File>() { // from class: sg.bigo.ads.cy.c.3
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file3, File file4) {
                long lastModified = file3.lastModified() - file4.lastModified();
                if (lastModified > 0) {
                    return -1;
                }
                return lastModified < 0 ? 1 : 0;
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (i < arrayList.size()) {
            File file3 = (File) arrayList.get(i);
            String name = file3.getName();
            if (this.g.containsKey(name) || this.f.containsKey(name) || this.b.containsKey(name)) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                Pair<Boolean, Boolean> a2 = aVar2.a(i, file3.lastModified(), currentTimeMillis);
                if (((Boolean) a2.first).booleanValue() || ((Boolean) a2.second).booleanValue()) {
                    g.b(file3);
                }
            }
            i++;
            aVar = aVar2;
        }
    }

    public final void a(@NonNull String str, int i, @Nullable String str2) {
        this.g.remove(str);
        CopyOnWriteArrayList<b> remove = this.f.remove(str);
        if (remove == null) {
            return;
        }
        Iterator<b> it = remove.iterator();
        while (it.hasNext()) {
            it.next().a(str, i, str2);
        }
    }

    public final void a(@NonNull String str, @NonNull File file) {
        this.g.remove(str);
        CopyOnWriteArrayList<b> remove = this.f.remove(str);
        if (remove == null) {
            return;
        }
        Iterator<b> it = remove.iterator();
        while (it.hasNext()) {
            it.next().a(str, file, true);
        }
    }

    public static /* synthetic */ void a(c cVar, Context context) {
        if (cVar.c == null) {
            cVar.c = new sg.bigo.ads.az.a();
        }
        cVar.a(new File(sg.bigo.ads.an.o.i(context)), cVar.c);
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, sg.bigo.ads.ay.b bVar) {
        File file;
        try {
            file = new File(sg.bigo.ads.an.o.c(context, str2));
        } catch (Throwable th) {
            th = th;
            file = null;
        }
        try {
            g.b(file);
            if (file.mkdirs()) {
                bVar.a(new sg.bigo.ads.ay.a(str, file.getAbsolutePath(), "package.zip", false, true, false, null), false);
                return;
            }
            a remove = cVar.b.remove(str2);
            sg.bigo.ads.da.b.a(remove != null ? remove.a : null, 2, str, 0L, 0L, "zip cacheDir mkdirs failed: " + file.getAbsolutePath());
            cVar.a(str2, 5, "zip cacheDir mkdirs failed: " + file.getAbsolutePath());
        } catch (Throwable th2) {
            th = th2;
            sg.bigo.ads.bn.a.a("PlayableZip", "prepareAndStartDownload: " + th.getMessage());
            a remove2 = cVar.b.remove(str2);
            sg.bigo.ads.da.b.a(remove2 != null ? remove2.a : null, 2, str, 0L, 0L, m5k.b(th, new StringBuilder("prepareAndStartDownload: ")));
            if (file != null) {
                g.b(file);
            }
            cVar.a(str2, 6, "prepareAndStartDownload: " + th.getMessage());
        }
    }

    public static boolean a(@NonNull Context context, @NonNull sg.bigo.ads.ay.a aVar) {
        return sg.bigo.ads.an.o.a(context, aVar.c, aVar.d);
    }

    public static boolean a(@NonNull File file) {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file2 = new File(file, ".bigo_playable_extract_ok");
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                boolean isFile = file2.isFile();
                try {
                    fileOutputStream.close();
                    return isFile;
                } catch (IOException e) {
                    sg.bigo.ads.bn.a.a("PlayableZip", "writeExtractionDoneMarker close: " + e.getMessage());
                    return isFile;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    sg.bigo.ads.bn.a.a("PlayableZip", "writeExtractionDoneMarker: " + th.getMessage());
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e2) {
                        sg.bigo.ads.bn.a.a("PlayableZip", "writeExtractionDoneMarker close: " + e2.getMessage());
                        return false;
                    }
                } catch (Throwable th3) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            sg.bigo.ads.bn.a.a("PlayableZip", "writeExtractionDoneMarker close: " + e3.getMessage());
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
        }
    }
}
