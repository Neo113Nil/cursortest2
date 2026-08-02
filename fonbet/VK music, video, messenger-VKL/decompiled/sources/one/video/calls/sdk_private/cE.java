package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlockReason.java */
/* loaded from: classes8.dex */
public final class cE {
    public static final cE a;
    public static final cE b;
    public static final cE c;
    private static final /* synthetic */ cE[] d;

    static {
        cE cEVar = new cE("DATA_BLOCKED", 0);
        a = cEVar;
        cE cEVar2 = new cE("STREAM_DATA_BLOCKED", 1);
        b = cEVar2;
        cE cEVar3 = new cE("NOT_BLOCKED", 2);
        c = cEVar3;
        d = new cE[]{cEVar, cEVar2, cEVar3};
    }

    public cE() {
        throw null;
    }

    public static cE valueOf(String str) {
        return (cE) Enum.valueOf(cE.class, str);
    }

    public static cE[] values() {
        return (cE[]) d.clone();
    }
}
