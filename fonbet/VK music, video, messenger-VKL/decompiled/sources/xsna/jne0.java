package xsna;

/* compiled from: QrCodeScannerAction.kt */
/* loaded from: classes7.dex */
public interface jne0 extends kj50 {

    /* compiled from: QrCodeScannerAction.kt */
    public interface a extends jne0 {

        /* compiled from: QrCodeScannerAction.kt */
        /* renamed from: xsna.jne0$a$a, reason: collision with other inner class name */
        public static final class C3129a implements a {
            public final fhw0 b;

            public C3129a(fhw0 fhw0Var) {
                this.b = fhw0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3129a) && epx.f(this.b, ((C3129a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "DirectJoin(callInitializer=" + this.b + ')';
            }
        }

        /* compiled from: QrCodeScannerAction.kt */
        public static final class b implements a {
            public static final b b = new b();
        }

        /* compiled from: QrCodeScannerAction.kt */
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
                return ho8.a(new StringBuilder("JoinByLink(link="), this.b, ')');
            }
        }
    }

    /* compiled from: QrCodeScannerAction.kt */
    public static final class b implements jne0 {
        public static final b b = new b();
    }

    /* compiled from: QrCodeScannerAction.kt */
    public static final class c implements jne0 {
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
            return oq.c(new StringBuilder("JoinFailed(error="), this.b, ')');
        }
    }

    /* compiled from: QrCodeScannerAction.kt */
    public static final class d implements jne0 {
        public static final d b = new d();
    }

    /* compiled from: QrCodeScannerAction.kt */
    public static final class e implements jne0 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QrCodeScanned(decodedQrCode="), this.b, ')');
        }
    }

    /* compiled from: QrCodeScannerAction.kt */
    public static final class f implements jne0 {
        public static final f b = new f();
    }
}
