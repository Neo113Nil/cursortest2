package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HandshakeState.java */
/* loaded from: classes8.dex */
public final class bv {
    public static final bv a;
    public static final bv b;
    public static final bv c;
    public static final bv d;
    private static bv e;
    private static final /* synthetic */ bv[] f;

    static {
        bv bvVar = new bv("Initial", 0);
        a = bvVar;
        bv bvVar2 = new bv("HasHandshakeKeys", 1);
        b = bvVar2;
        bv bvVar3 = new bv("HasAppKeys", 2);
        c = bvVar3;
        bv bvVar4 = new bv("Completed", 3);
        e = bvVar4;
        bv bvVar5 = new bv("Confirmed", 4);
        d = bvVar5;
        f = new bv[]{bvVar, bvVar2, bvVar3, bvVar4, bvVar5};
    }

    public bv() {
        throw null;
    }

    public static bv valueOf(String str) {
        return (bv) Enum.valueOf(bv.class, str);
    }

    public static bv[] values() {
        return (bv[]) f.clone();
    }
}
