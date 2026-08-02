package one.video.calls.sdk_private;

/* compiled from: TransportError.java */
/* loaded from: classes8.dex */
public final class bJ extends Exception {
    final ap$a a;

    public bJ(ap$a ap_a) {
        super(ap_a.toString());
        this.a = ap_a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "TransportError (" + this.a + ")";
    }

    public bJ(ap$a ap_a, String str) {
        super(ap_a + ": " + str);
        this.a = ap_a;
    }
}
