package xsna;

/* compiled from: WatchCoverageHelper.kt */
/* loaded from: classes8.dex */
public final class qbx0 {
    public final vw3 a;
    public long b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WatchCoverageHelper.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INVALID_INTERVAL_STATE;
        public static final a INVALID_INTERVAL_STATE2;
        public static final a INVALID_POSITION;
        public static final a INVALID_POSITION2;
        public static final a UNKNOWN_POSITION_START;
        public static final a UNKNOWN_POSITION_STOP;
        private final String value;

        static {
            a aVar = new a("INVALID_POSITION", 0, "wc_inv_p");
            INVALID_POSITION = aVar;
            a aVar2 = new a("INVALID_POSITION2", 1, "wc_inv_p2");
            INVALID_POSITION2 = aVar2;
            a aVar3 = new a("INVALID_INTERVAL_STATE", 2, "wc_inv_int");
            INVALID_INTERVAL_STATE = aVar3;
            a aVar4 = new a("INVALID_INTERVAL_STATE2", 3, "wc_inv_int2");
            INVALID_INTERVAL_STATE2 = aVar4;
            a aVar5 = new a("UNKNOWN_POSITION_START", 4, "wc_unk_p_start");
            UNKNOWN_POSITION_START = aVar5;
            a aVar6 = new a("UNKNOWN_POSITION_STOP", 5, "wc_unk_p_stop");
            UNKNOWN_POSITION_STOP = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    public qbx0() {
        vw3 vw3Var = ryk0.a;
        this.a = ryk0.a;
        this.b = -1L;
    }

    public final boolean a() {
        return this.b >= 0;
    }

    public final void b(long j) {
        int i = wn80.a;
        boolean a2 = a();
        boolean z = j >= 0;
        a aVar = a.INVALID_INTERVAL_STATE;
        vw3 vw3Var = this.a;
        vw3Var.b(!a2, aVar, new uw3(0));
        vw3Var.b(z, a.UNKNOWN_POSITION_START, new uw3(0));
        if (a2 || !z) {
            return;
        }
        this.b = j;
    }

    public final String c(long j) {
        int i = wn80.a;
        boolean a2 = a();
        vw3 vw3Var = this.a;
        if (!a2) {
            vw3Var.b(false, a.INVALID_INTERVAL_STATE2, new uw3(0));
            return null;
        }
        long j2 = this.b;
        this.b = -1L;
        if (j < 0) {
            vw3Var.b(false, a.UNKNOWN_POSITION_STOP, new uw3(0));
            return null;
        }
        if (j2 > j) {
            vw3Var.b(false, a.INVALID_POSITION2, new uw3(0));
            return null;
        }
        return j2 + "-" + j;
    }
}
