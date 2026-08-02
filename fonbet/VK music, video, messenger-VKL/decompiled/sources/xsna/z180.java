package xsna;

/* compiled from: OnBoardingExternalEvent.kt */
/* loaded from: classes5.dex */
public interface z180 {

    /* compiled from: OnBoardingExternalEvent.kt */
    public static final class a implements z180 {
        public final boolean a;
        public final String b;

        public a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    /* compiled from: OnBoardingExternalEvent.kt */
    public static final class b implements z180 {
        public final boolean a;

        public b() {
            this(false);
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: OnBoardingExternalEvent.kt */
    public static final class c implements z180 {
        public final int a;

        public c(int i) {
            this.a = i;
        }
    }
}
