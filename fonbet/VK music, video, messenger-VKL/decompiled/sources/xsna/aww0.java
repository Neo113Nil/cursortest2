package xsna;

/* compiled from: VoipQrCodeScannerState.kt */
/* loaded from: classes7.dex */
public interface aww0 extends km50 {

    /* compiled from: VoipQrCodeScannerState.kt */
    public static final class a implements aww0 {
        public static final a b = new a();
    }

    /* compiled from: VoipQrCodeScannerState.kt */
    public interface b extends aww0 {

        /* compiled from: VoipQrCodeScannerState.kt */
        public static final class a implements b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            @Override // xsna.aww0.b
            public final Throwable getError() {
                return this.b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("DirectJoinFailed(error="), this.b, ')');
            }
        }

        /* compiled from: VoipQrCodeScannerState.kt */
        /* renamed from: xsna.aww0$b$b, reason: collision with other inner class name */
        public static final class C2578b implements b {
            public final String b;
            public final Throwable c;

            public C2578b(String str, Throwable th) {
                this.b = str;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2578b)) {
                    return false;
                }
                C2578b c2578b = (C2578b) obj;
                return epx.f(this.b, c2578b.b) && epx.f(this.c, c2578b.c);
            }

            @Override // xsna.aww0.b
            public final Throwable getError() {
                return this.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("JoinByLinkFailed(link=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        Throwable getError();
    }

    /* compiled from: VoipQrCodeScannerState.kt */
    public static final class c implements aww0 {
        public static final c b = new c();
    }

    /* compiled from: VoipQrCodeScannerState.kt */
    public static final class d implements aww0 {
        public final Throwable b;

        public d(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("NotOperable(error="), this.b, ')');
        }
    }

    /* compiled from: VoipQrCodeScannerState.kt */
    public interface e extends aww0 {

        /* compiled from: VoipQrCodeScannerState.kt */
        public static final class a implements e {
            public final String b;
            public final String c;

            public a(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("JoinByLink(callLink=");
                sb.append(this.b);
                sb.append(", qrCode=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: VoipQrCodeScannerState.kt */
        public static final class b implements e {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("JoinDirectly(qrCode="), this.b, ')');
            }
        }
    }

    /* compiled from: VoipQrCodeScannerState.kt */
    public interface f extends aww0 {

        /* compiled from: VoipQrCodeScannerState.kt */
        public static final class a implements f {
            public static final a b = new a();
        }

        /* compiled from: VoipQrCodeScannerState.kt */
        public static final class b implements f {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ScanningForJoinByLink(link="), this.b, ')');
            }
        }
    }
}
