package xsna;

/* compiled from: CacheStrategy.kt */
/* loaded from: classes11.dex */
public final class rx8 {
    public final okhttp3.p a;
    public final okhttp3.u b;

    /* compiled from: CacheStrategy.kt */
    public static final class a {
        public static boolean a(okhttp3.p pVar, okhttp3.u uVar) {
            int o = uVar.o();
            if (o != 200 && o != 410 && o != 414 && o != 501 && o != 203 && o != 204) {
                if (o != 307) {
                    if (o != 308 && o != 404 && o != 405) {
                        switch (o) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (okhttp3.u.r("Expires", uVar) == null && uVar.n().c == -1 && !uVar.n().f && !uVar.n().e) {
                    return false;
                }
            }
            return (uVar.n().b || pVar.a().b) ? false : true;
        }
    }

    public rx8(okhttp3.p pVar, okhttp3.u uVar) {
        this.a = pVar;
        this.b = uVar;
    }
}
