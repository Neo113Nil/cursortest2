package xsna;

/* compiled from: WallAct.kt */
/* loaded from: classes18.dex */
public abstract class c9x0 {
    public final String a;

    /* compiled from: WallAct.kt */
    public static final class a {
        public static c9x0 a(String str) {
            return epx.f(str, "edit") ? b.b : c.b;
        }
    }

    /* compiled from: WallAct.kt */
    public static final class b extends c9x0 {
        public static final b b = new b("edit");
    }

    /* compiled from: WallAct.kt */
    public static final class c extends c9x0 {
        public static final c b = new c(null);
    }

    public c9x0(String str) {
        this.a = str;
    }
}
