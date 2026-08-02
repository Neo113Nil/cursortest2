package xsna;

/* compiled from: FoldersCountersDb.kt */
/* loaded from: classes2.dex */
public final class n0s {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FoldersCountersDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ID;
        public static final a UNREAD_MUTED;
        public static final a UNREAD_UNMUTED;
        private final String key;

        static {
            a aVar = new a("ID", 0, "folder_id");
            ID = aVar;
            a aVar2 = new a("UNREAD_UNMUTED", 1, "unread_unmuted");
            UNREAD_UNMUTED = aVar2;
            a aVar3 = new a("UNREAD_MUTED", 2, "unread_muted");
            UNREAD_MUTED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.key = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // xsna.qgl0
        public final String getKey() {
            return this.key;
        }
    }

    public n0s() {
        throw null;
    }

    public n0s(tgl0 tgl0Var) {
        this.a = new sgl0("folders_counters", a.class);
        this.b = tgl0Var;
    }
}
