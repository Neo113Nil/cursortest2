package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.vk.contacts.AndroidContact;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: AndroidContactStorageManager.kt */
/* loaded from: classes.dex */
public final class y62 {
    public final bpn0 a;
    public final bpn0 b = new bpn0(new w62(this, 0));

    public y62(Context context) {
        this.a = new bpn0(new v62(context, 0));
    }

    public static AndroidContact e(Cursor cursor) {
        Long D = fl3.D(cursor, "android_id");
        String E = fl3.E(cursor, "name");
        boolean x = fl3.x(cursor, "is_favorite");
        String F = fl3.F(cursor, "phones");
        Set R0 = F != null ? j5g.R0(drm0.c0(F, new String[]{StringUtils.COMMA}, 0, 6)) : new LinkedHashSet();
        String F2 = fl3.F(cursor, "original_phones");
        Set R02 = F2 != null ? j5g.R0(drm0.c0(F2, new String[]{StringUtils.COMMA}, 0, 6)) : new LinkedHashSet();
        String F3 = fl3.F(cursor, "emails");
        return new AndroidContact(D, E, x, R0, R02, F3 != null ? j5g.R0(drm0.c0(F3, new String[]{StringUtils.COMMA}, 0, 6)) : new LinkedHashSet());
    }

    public final void a() {
        ((SQLiteDatabase) this.b.getValue()).execSQL("DELETE FROM android_contacts");
    }

    public final void b(Collection<Long> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ((SQLiteDatabase) this.b.getValue()).execSQL(air.b(')', "DELETE FROM android_contacts WHERE id IN(", p4g.k(collection, StringUtils.COMMA, null)));
    }

    public final HashMap c() {
        Cursor rawQuery = ((SQLiteDatabase) this.b.getValue()).rawQuery("SELECT * FROM android_contacts", null);
        HashMap hashMap = new HashMap(rawQuery.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        hashMap.put(Long.valueOf(fl3.C(rawQuery, "id")), e(rawQuery));
                        rawQuery.moveToNext();
                    }
                }
                return hashMap;
            } finally {
                rawQuery.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void d(Collection<AndroidContact> collection) {
        if (collection.isEmpty()) {
            return;
        }
        fl3.k((SQLiteDatabase) this.b.getValue(), new x62(0, collection));
    }
}
