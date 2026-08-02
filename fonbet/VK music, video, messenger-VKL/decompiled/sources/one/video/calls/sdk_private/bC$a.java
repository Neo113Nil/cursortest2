package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PacketProcessor.java */
/* loaded from: classes8.dex */
public final class bC$a {
    public static final bC$a a;
    public static final bC$a b;
    private static final /* synthetic */ bC$a[] c;

    static {
        bC$a bc_a = new bC$a("Continue", 0);
        a = bc_a;
        bC$a bc_a2 = new bC$a("Abort", 1);
        b = bc_a2;
        c = new bC$a[]{bc_a, bc_a2};
    }

    public bC$a() {
        throw null;
    }

    public static bC$a valueOf(String str) {
        return (bC$a) Enum.valueOf(bC$a.class, str);
    }

    public static bC$a[] values() {
        return (bC$a[]) c.clone();
    }
}
