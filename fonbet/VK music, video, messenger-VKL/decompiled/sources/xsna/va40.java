package xsna;

import java.util.LinkedHashMap;

/* compiled from: MusicAutoDownloadDisposableManager.kt */
/* loaded from: classes3.dex */
public final class va40 {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public static final void a(va40 va40Var, String str, io.reactivex.rxjava3.disposables.c cVar) {
        LinkedHashMap linkedHashMap = va40Var.b;
        LinkedHashMap linkedHashMap2 = va40Var.c;
        if (str == null) {
            va40Var.a.b(cVar);
            return;
        }
        if (str.equals("auto_download_disposable")) {
            io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) linkedHashMap2.get(str);
            if (cVar2 != null) {
                cVar2.dispose();
            }
            linkedHashMap2.put(str, cVar);
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(str);
        if (cVar3 != null) {
            cVar3.dispose();
        }
        linkedHashMap.put(str, cVar);
    }
}
