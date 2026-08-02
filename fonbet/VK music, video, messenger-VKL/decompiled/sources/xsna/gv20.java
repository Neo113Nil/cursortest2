package xsna;

/* compiled from: ModalAuthContract.kt */
/* loaded from: classes15.dex */
public abstract class gv20 {
    public final String a;
    public final int b;
    public final gzs<s3q0> c;

    /* compiled from: ModalAuthContract.kt */
    public static final class a extends gv20 {
        public final String d;

        public a(String str, String str2, int i, cm cmVar) {
            super(i, str, cmVar);
            this.d = str2;
        }
    }

    /* compiled from: ModalAuthContract.kt */
    public static final class b extends gv20 {
        public final String d;
        public final String e;

        public b() {
            throw null;
        }

        public b(String str, String str2, String str3, int i) {
            super(i, str, null);
            this.d = str2;
            this.e = str3;
        }
    }

    /* compiled from: ModalAuthContract.kt */
    public static final class c extends gv20 {
    }

    public gv20() {
        throw null;
    }

    public gv20(int i, String str, gzs gzsVar) {
        this.a = str;
        this.b = i;
        this.c = gzsVar;
    }
}
