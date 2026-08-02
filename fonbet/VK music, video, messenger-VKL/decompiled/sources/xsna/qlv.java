package xsna;

/* compiled from: PlatformMapping.java */
/* loaded from: classes8.dex */
public final class qlv {
    public static int a;

    /* compiled from: PlatformMapping.java */
    public static class a implements nsu {
        @Override // xsna.nsu
        public final String a(int i) {
            if (i == 256) {
                return "SHA256withRSA/PSS";
            }
            if (i == 384) {
                return "SHA384withRSA/PSS";
            }
            if (i == 512) {
                return "SHA512withRSA/PSS";
            }
            throw new IllegalArgumentException(lhg.a(i, "Unsupported hash length: "));
        }
    }

    /* compiled from: PlatformMapping.java */
    public static class b implements nsu {
        @Override // xsna.nsu
        public final String a(int i) {
            return "RSASSA-PSS";
        }
    }
}
