package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Role.java */
/* loaded from: classes8.dex */
public final class bI {
    public static final bI a;
    public static final bI b;
    private static final /* synthetic */ bI[] c;

    static {
        bI bIVar = new bI("Client", 0);
        a = bIVar;
        bI bIVar2 = new bI("Server", 1);
        b = bIVar2;
        c = new bI[]{bIVar, bIVar2};
    }

    public bI() {
        throw null;
    }

    public static bI valueOf(String str) {
        return (bI) Enum.valueOf(bI.class, str);
    }

    public static bI[] values() {
        return (bI[]) c.clone();
    }
}
