package xsna;

/* compiled from: QrCodeScannerViewEvent.kt */
/* loaded from: classes7.dex */
public interface lne0 {

    /* compiled from: QrCodeScannerViewEvent.kt */
    public static final class a implements lne0 {
        public static final a a = new a();
    }

    /* compiled from: QrCodeScannerViewEvent.kt */
    public static final class b implements lne0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ProcessQrCodeData(data="), this.a, ')');
        }
    }

    /* compiled from: QrCodeScannerViewEvent.kt */
    public static final class c implements lne0 {
        public static final c a = new c();
    }
}
