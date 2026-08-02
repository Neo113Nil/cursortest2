package one.video.calls.sdk_private;

/* compiled from: MissingKeysException.java */
/* loaded from: classes8.dex */
public final class aP extends Exception {
    public final a a;
    private final aF b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MissingKeysException.java */
    public static final class a {
        public static final a a;
        public static final a b;
        private static final /* synthetic */ a[] c;

        static {
            a aVar = new a("MissingKeys", 0);
            a = aVar;
            a aVar2 = new a("DiscardedKeys", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public aP(aF aFVar, boolean z) {
        super("Missing keys for encryption level " + aFVar + (z ? " (keys discarded)" : " (keys not installed)"));
        this.b = aFVar;
        this.a = z ? a.b : a.a;
    }
}
