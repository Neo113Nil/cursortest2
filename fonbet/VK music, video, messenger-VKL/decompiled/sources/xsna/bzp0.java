package xsna;

/* compiled from: UiErrorData.kt */
/* loaded from: classes15.dex */
public abstract class bzp0 {
    public final String a;
    public final wz2 b;

    /* compiled from: UiErrorData.kt */
    public static final class a extends bzp0 {
        public final String c;

        public a(String str, String str2, wz2 wz2Var) {
            super(str, wz2Var);
            this.c = str2;
        }

        public final String b() {
            return this.c;
        }
    }

    /* compiled from: UiErrorData.kt */
    public static final class b extends bzp0 {
        public final String c;

        public b(String str, String str2, wz2 wz2Var) {
            super(str, wz2Var);
            this.c = str2;
        }
    }

    /* compiled from: UiErrorData.kt */
    public static final class c extends bzp0 {
    }

    public bzp0(String str, wz2 wz2Var) {
        this.a = str;
        this.b = wz2Var;
    }

    public final String a() {
        return this.a;
    }
}
