package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EncryptionLevel.java */
/* loaded from: classes8.dex */
public final class aF {
    public static final aF a;
    public static final aF b;
    public static final aF c;
    public static final aF d;
    private static final /* synthetic */ aF[] e;

    /* compiled from: EncryptionLevel.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aF.values().length];
            a = iArr;
            try {
                iArr[aF.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[aF.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[aF.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[aF.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        aF aFVar = new aF("Initial", 0);
        a = aFVar;
        aF aFVar2 = new aF("ZeroRTT", 1);
        b = aFVar2;
        aF aFVar3 = new aF("Handshake", 2);
        c = aFVar3;
        aF aFVar4 = new aF("App", 3);
        d = aFVar4;
        e = new aF[]{aFVar, aFVar2, aFVar3, aFVar4};
    }

    public aF() {
        throw null;
    }

    public static aF valueOf(String str) {
        return (aF) Enum.valueOf(aF.class, str);
    }

    public static aF[] values() {
        return (aF[]) e.clone();
    }

    public final aG h() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return aG.c;
        }
        if (i == 2) {
            return aG.a;
        }
        if (i == 3) {
            return aG.b;
        }
        if (i != 4) {
            return null;
        }
        return aG.c;
    }
}
