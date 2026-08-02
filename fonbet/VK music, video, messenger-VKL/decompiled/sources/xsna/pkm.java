package xsna;

import android.database.Cursor;
import android.os.Trace;
import java.util.HashMap;

/* compiled from: DialogThemeDb.kt */
/* loaded from: classes2.dex */
public final class pkm {
    public final tgl0 b;
    public final /* synthetic */ sgl0 a = new sgl0("dialog_themes", a.class);
    public final int c = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogThemeDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a APPEARANCE_ID;
        public static final a BACKGROUND_ID;
        public static final a ID;
        public static final a IS_HIDDEN;
        public static final a LAST_SYNC_TIME_MS;
        public static final a SORT;
        public static final a UPDATE_TIME;
        private final String key;

        static {
            a aVar = new a("ID", 0, "id");
            ID = aVar;
            a aVar2 = new a("UPDATE_TIME", 1, "update_time");
            UPDATE_TIME = aVar2;
            a aVar3 = new a("APPEARANCE_ID", 2, "appearance_id");
            APPEARANCE_ID = aVar3;
            a aVar4 = new a("BACKGROUND_ID", 3, "background_id");
            BACKGROUND_ID = aVar4;
            a aVar5 = new a("IS_HIDDEN", 4, "is_hidden");
            IS_HIDDEN = aVar5;
            a aVar6 = new a("SORT", 5, "sort");
            SORT = aVar6;
            a aVar7 = new a("LAST_SYNC_TIME_MS", 6, "last_sync_time_ms");
            LAST_SYNC_TIME_MS = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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

        public final int h() {
            return ordinal() + 1;
        }
    }

    public pkm(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    public static HashMap a(Cursor cursor) {
        HashMap hashMap = new HashMap(cursor.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        hashMap.put(fl3.E(cursor, a.ID.getKey()), c(cursor));
                        cursor.moveToNext();
                    }
                }
                return hashMap;
            } finally {
                cursor.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public static okm c(Cursor cursor) {
        String E = fl3.E(cursor, a.ID.getKey());
        long C = fl3.C(cursor, a.UPDATE_TIME.getKey());
        return new okm(fl3.A(cursor, a.SORT.getKey()), E, fl3.E(cursor, a.APPEARANCE_ID.getKey()), fl3.E(cursor, a.BACKGROUND_ID.getKey()), C, fl3.x(cursor, a.IS_HIDDEN.getKey()), fl3.C(cursor, a.LAST_SYNC_TIME_MS.getKey()));
    }

    public final okm b(String str) {
        return (okm) a(this.b.b().d(this.a.a(a.ID, str), null)).get(str);
    }
}
