package xsna;

import com.vk.superapp.qr.web2app.modal.errors.QrExpiredException;

/* compiled from: CheckSignInState.kt */
/* loaded from: classes6.dex */
public interface k1c extends km50 {

    /* compiled from: CheckSignInState.kt */
    public static abstract class a implements k1c {
        public final Throwable b;

        /* compiled from: CheckSignInState.kt */
        /* renamed from: xsna.k1c$a$a, reason: collision with other inner class name */
        public static final class C3158a extends a {
        }

        /* compiled from: CheckSignInState.kt */
        public static final class b extends a {
            public static final b c = new b(new QrExpiredException());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 883660972;
            }

            public final String toString() {
                return "ExpiredQrErrorDialog";
            }
        }

        public a(Throwable th) {
            this.b = th;
        }
    }

    /* compiled from: CheckSignInState.kt */
    public static final class b implements k1c {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1375463333;
        }

        public final String toString() {
            return "PeriodicallyCheckingStatus";
        }
    }
}
