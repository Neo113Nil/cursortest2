package one.video.calls.sdk_private;

/* compiled from: ConnectionTerminatedEvent.java */
/* loaded from: classes8.dex */
public final class al {
    public final a a;
    public final Long b;
    public final Long c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConnectionTerminatedEvent.java */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a("IdleTimeout", 0);
            a = aVar;
            a aVar2 = new a("ImmediateClose", 1);
            b = aVar2;
            a aVar3 = new a("StatelessReset", 2);
            c = aVar3;
            a aVar4 = new a("ConnectionLost", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public al(a aVar, boolean z, Long l, Long l2) {
        this.a = aVar;
        this.b = (l == null || l.longValue() == ((long) ap$a.NO_ERROR.n)) ? null : l;
        this.c = l2;
    }

    public al(a aVar) {
        this.a = aVar;
        this.b = null;
        this.c = null;
    }
}
