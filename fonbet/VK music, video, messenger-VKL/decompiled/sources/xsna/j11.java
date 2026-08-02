package xsna;

/* compiled from: AdsRequestError.kt */
/* loaded from: classes6.dex */
public abstract class j11 {
    public final int a;
    public final String b;

    /* compiled from: AdsRequestError.kt */
    public static final class a extends j11 {
        public final String c;

        public a(int i, String str, String str2) {
            super(i, str);
            this.c = str2;
        }

        @Override // xsna.j11
        public final String a() {
            return this.c;
        }
    }

    /* compiled from: AdsRequestError.kt */
    public static final class b extends j11 {
        @Override // xsna.j11
        public final String a() {
            return this.b;
        }
    }

    public j11(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public abstract String a();
}
