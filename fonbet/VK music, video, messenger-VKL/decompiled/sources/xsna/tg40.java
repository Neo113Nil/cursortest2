package xsna;

import java.util.LinkedHashMap;

/* compiled from: MusicDownloadDisposableManager.kt */
/* loaded from: classes.dex */
public final class tg40 {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashMap d = new LinkedHashMap();

    /* compiled from: MusicDownloadDisposableManager.kt */
    public static final class a {
        public static void a(io.reactivex.rxjava3.disposables.c cVar, tg40 tg40Var, String str) {
            LinkedHashMap linkedHashMap = tg40Var.d;
            int hashCode = str.hashCode();
            if (hashCode != -1908578897) {
                if (hashCode != 928856116) {
                    if (hashCode == 982884181 && str.equals("download_all_disposable")) {
                        tg40Var.b.b(cVar);
                        return;
                    }
                } else if (str.equals("common_disposable")) {
                    tg40Var.a.b(cVar);
                    return;
                }
            } else if (str.equals("cancel_common_disposable")) {
                tg40Var.c.b(cVar);
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(str);
            if (cVar2 != null) {
                cVar2.dispose();
            }
            linkedHashMap.put(str, cVar);
        }
    }

    public final void a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1908578897) {
            if (hashCode != 928856116) {
                if (hashCode == 982884181 && str.equals("download_all_disposable")) {
                    this.b.e();
                    return;
                }
            } else if (str.equals("common_disposable")) {
                this.a.e();
                return;
            }
        } else if (str.equals("cancel_common_disposable")) {
            this.c.e();
            return;
        }
        LinkedHashMap linkedHashMap = this.d;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(str);
        if (cVar != null) {
            cVar.dispose();
        }
        linkedHashMap.remove(str);
    }
}
