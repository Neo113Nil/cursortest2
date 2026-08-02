package xsna;

/* compiled from: StreamType.java */
/* loaded from: classes8.dex */
public enum rhy0 {
    ClientInitiatedBidirectional(0, "CIB"),
    ServerInitiatedBidirectional(1, "SIB"),
    ClientInitiatedUnidirectional(2, "CIU"),
    ServerInitiatedUnidirectional(3, "SIU");

    public final int a;
    public final String b;

    rhy0(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
