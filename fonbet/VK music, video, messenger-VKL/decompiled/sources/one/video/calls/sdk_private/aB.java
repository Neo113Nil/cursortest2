package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionIdStatus.java */
/* loaded from: classes8.dex */
public final class aB {
    public static final aB a;
    public static final aB b;
    public static final aB c;
    public static final aB d;
    private static final /* synthetic */ aB[] e;

    static {
        aB aBVar = new aB("NEW", 0);
        a = aBVar;
        aB aBVar2 = new aB("IN_USE", 1);
        b = aBVar2;
        aB aBVar3 = new aB("USED", 2);
        c = aBVar3;
        aB aBVar4 = new aB("RETIRED", 3);
        d = aBVar4;
        e = new aB[]{aBVar, aBVar2, aBVar3, aBVar4};
    }

    public aB() {
        throw null;
    }

    public static aB valueOf(String str) {
        return (aB) Enum.valueOf(aB.class, str);
    }

    public static aB[] values() {
        return (aB[]) e.clone();
    }
}
