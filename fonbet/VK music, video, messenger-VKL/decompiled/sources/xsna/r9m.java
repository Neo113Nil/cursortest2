package xsna;

import android.database.Cursor;
import android.os.Trace;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: DialogAppearanceDb.kt */
/* loaded from: classes2.dex */
public final class r9m {
    public final tgl0 b;
    public final /* synthetic */ sgl0 a = new sgl0("dialog_appearance", a.class);
    public final int c = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogAppearanceDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DARK_THEME_DATA;
        public static final a IS_HIDDEN;
        public static final a LIGHT_THEME_DATA;
        public static final a NAME;
        public static final a SORT;
        public static final a UPDATE_TIME;
        private final String key;

        static {
            a aVar = new a("NAME", 0, "name");
            NAME = aVar;
            a aVar2 = new a("UPDATE_TIME", 1, "update_time");
            UPDATE_TIME = aVar2;
            a aVar3 = new a("LIGHT_THEME_DATA", 2, "light_theme_data");
            LIGHT_THEME_DATA = aVar3;
            a aVar4 = new a("DARK_THEME_DATA", 3, "dark_theme_data");
            DARK_THEME_DATA = aVar4;
            a aVar5 = new a("IS_HIDDEN", 4, "is_hidden");
            IS_HIDDEN = aVar5;
            a aVar6 = new a("SORT", 5, "sort");
            SORT = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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

    public r9m(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    public static HashMap a(Cursor cursor) {
        HashMap hashMap = new HashMap(cursor.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        hashMap.put(fl3.E(cursor, a.NAME.getKey()), c(cursor));
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

    public static q9m c(Cursor cursor) {
        String E = fl3.E(cursor, a.NAME.getKey());
        return new q9m(fl3.A(cursor, a.SORT.getKey()), fl3.C(cursor, a.UPDATE_TIME.getKey()), E, fl3.E(cursor, a.LIGHT_THEME_DATA.getKey()), fl3.E(cursor, a.DARK_THEME_DATA.getKey()), fl3.x(cursor, a.IS_HIDDEN.getKey()));
    }

    public final Collection<q9m> b() {
        e0w b = this.b.b();
        StringBuilder sb = new StringBuilder("SELECT ");
        sgl0 sgl0Var = this.a;
        sb.append(sgl0Var.c());
        sb.append(" FROM ");
        sb.append(sgl0Var.a);
        sb.append(" ORDER BY ");
        sb.append(a.SORT.getKey());
        sb.append(" ASC");
        return a(b.d(sb.toString(), null)).values();
    }
}
