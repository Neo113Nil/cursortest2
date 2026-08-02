package xsna;

/* compiled from: SubscriptionContract.kt */
/* loaded from: classes6.dex */
public abstract class lym0 {
    public final int a;

    /* compiled from: SubscriptionContract.kt */
    public static final class a extends lym0 {
        public final boolean b;

        public a(boolean z) {
            super(2);
            this.b = z;
        }
    }

    /* compiled from: SubscriptionContract.kt */
    public static final class b extends lym0 {
        public final String b;
        public final String c;

        public b(String str, String str2) {
            super(1);
            this.b = str;
            this.c = str2;
        }
    }

    /* compiled from: SubscriptionContract.kt */
    public static final class c extends lym0 {
        public final String b;
        public final boolean c;

        public c(String str, boolean z) {
            super(3);
            this.b = str;
            this.c = z;
        }
    }

    public lym0(int i) {
        this.a = i;
    }
}
