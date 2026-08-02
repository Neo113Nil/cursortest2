package xsna;

import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: DialogBackgroundDb.kt */
/* loaded from: classes2.dex */
public final class gam {
    public final tgl0 b;
    public final /* synthetic */ sgl0 a = new sgl0("dialog_background", a.class);
    public final int c = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogBackgroundDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DARK_THEME_DATA;
        public static final a DARK_URI;
        public static final a HASH;
        public static final a IS_ARCHIVED;
        public static final a IS_HIDDEN;
        public static final a LIGHT_THEME_DATA;
        public static final a LIGHT_URI;
        public static final a NAME;
        public static final a SORT;
        public static final a UPDATE_TIME;
        private final String key;

        static {
            a aVar = new a("NAME", 0, "name");
            NAME = aVar;
            a aVar2 = new a("HASH", 1, "hash");
            HASH = aVar2;
            a aVar3 = new a("LIGHT_URI", 2, "light_uri");
            LIGHT_URI = aVar3;
            a aVar4 = new a("DARK_URI", 3, "dark_uri");
            DARK_URI = aVar4;
            a aVar5 = new a("IS_ARCHIVED", 4, "is_archived");
            IS_ARCHIVED = aVar5;
            a aVar6 = new a("IS_HIDDEN", 5, "is_hidden");
            IS_HIDDEN = aVar6;
            a aVar7 = new a("UPDATE_TIME", 6, "update_time");
            UPDATE_TIME = aVar7;
            a aVar8 = new a("DARK_THEME_DATA", 7, "dark_theme_data");
            DARK_THEME_DATA = aVar8;
            a aVar9 = new a("LIGHT_THEME_DATA", 8, "light_theme_data");
            LIGHT_THEME_DATA = aVar9;
            a aVar10 = new a("SORT", 9, "sort");
            SORT = aVar10;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
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

    public gam(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    public static HashMap a(Cursor cursor) {
        HashMap hashMap = new HashMap(cursor.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        hashMap.put(fl3.E(cursor, a.NAME.getKey()), d(cursor));
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

    public static fam d(Cursor cursor) {
        String E = fl3.E(cursor, a.NAME.getKey());
        String E2 = fl3.E(cursor, a.HASH.getKey());
        Uri parse = Uri.parse(fl3.E(cursor, a.LIGHT_URI.getKey()));
        Uri parse2 = Uri.parse(fl3.E(cursor, a.DARK_URI.getKey()));
        boolean x = fl3.x(cursor, a.IS_HIDDEN.getKey());
        return new fam(E, E2, parse, parse2, fl3.A(cursor, a.SORT.getKey()), fl3.C(cursor, a.UPDATE_TIME.getKey()), fl3.E(cursor, a.LIGHT_THEME_DATA.getKey()), fl3.E(cursor, a.DARK_THEME_DATA.getKey()), x);
    }

    public final Collection<fam> b() {
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

    public final fam c(String str) {
        return (fam) a(this.b.b().d(this.a.a(a.NAME, str), null)).get(str);
    }
}
