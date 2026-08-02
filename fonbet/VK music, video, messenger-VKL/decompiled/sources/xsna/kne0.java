package xsna;

/* compiled from: QrCodeScannerPatch.kt */
/* loaded from: classes7.dex */
public interface kne0 extends xl50 {

    /* compiled from: QrCodeScannerPatch.kt */
    public interface a extends kne0 {

        /* compiled from: QrCodeScannerPatch.kt */
        /* renamed from: xsna.kne0$a$a, reason: collision with other inner class name */
        public static final class C3189a implements a {
            public final Throwable b;

            public C3189a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3189a) && epx.f(this.b, ((C3189a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Failed(error="), this.b, ')');
            }
        }

        /* compiled from: QrCodeScannerPatch.kt */
        public static final class b implements a {
            public static final b b = new b();
        }

        /* compiled from: QrCodeScannerPatch.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("InitForJoinWithLink(link="), this.b, ')');
            }
        }
    }

    /* compiled from: QrCodeScannerPatch.kt */
    public static final class b implements kne0 {
        public static final b b = new b();
    }

    /* compiled from: QrCodeScannerPatch.kt */
    public static final class c implements kne0 {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("JoinDidFail(error="), this.b, ')');
        }
    }

    /* compiled from: QrCodeScannerPatch.kt */
    public static final class d implements kne0 {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QrCodeDidScan(qrCode="), this.b, ')');
        }
    }

    /* compiled from: QrCodeScannerPatch.kt */
    public static final class e implements kne0 {
        public static final e b = new e();
    }
}
