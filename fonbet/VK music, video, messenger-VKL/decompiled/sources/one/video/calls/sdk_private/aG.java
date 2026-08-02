package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PnSpace.java */
/* loaded from: classes8.dex */
public final class aG {
    public static final aG a;
    public static final aG b;
    public static final aG c;
    private static final /* synthetic */ aG[] d;

    /* compiled from: PnSpace.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aG.values().length];
            a = iArr;
            try {
                iArr[aG.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[aG.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[aG.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        aG aGVar = new aG("Initial", 0);
        a = aGVar;
        aG aGVar2 = new aG("Handshake", 1);
        b = aGVar2;
        aG aGVar3 = new aG("App", 2);
        c = aGVar3;
        d = new aG[]{aGVar, aGVar2, aGVar3};
    }

    public aG() {
        throw null;
    }

    public static aG valueOf(String str) {
        return (aG) Enum.valueOf(aG.class, str);
    }

    public static aG[] values() {
        return (aG[]) d.clone();
    }

    public final aF h() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return aF.a;
        }
        if (i == 2) {
            return aF.c;
        }
        if (i != 3) {
            return null;
        }
        return aF.d;
    }
}
