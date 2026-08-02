package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* loaded from: classes8.dex */
public final class U4 extends DatabaseScript {
    public final int a = 2000;
    public final String b = "number";
    public final String c = "global_number";
    public final String d = "number_of_type";
    public final String e = "name";
    public final String f = "value";
    public final String g = "type";
    public final String h = "time";
    public final String i = "session_id";
    public final String j = "error_environment";
    public final String k = "session_type";
    public final String l = "app_environment";
    public final String m = "app_environment_revision";
    public final String n = "truncated";
    public final String o = "custom_type";
    public final String p = "encrypting_mode";
    public final String q = "profile_id";
    public final String r = "first_occurrence_status";
    public final String s = "source";
    public final String t = "attribution_id_changed";
    public final String u = "open_id";
    public final String v = HandleInvocationsFromAdViewer.KEY_EXTRAS;
    public final String w = "reports";
    public final C5136r7 x = new C5136r7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C5111q7 c5111q7) {
        Long l;
        EnumC5037nb enumC5037nb;
        Long l2;
        Long l3;
        Long l4 = c5111q7.a;
        if (l4 == null || l4.longValue() < 10000000000L || c5111q7.b == null || (l = c5111q7.c) == null || l.longValue() < 0 || (enumC5037nb = c5111q7.d) == null || enumC5037nb == EnumC5037nb.EVENT_TYPE_UNDEFINED || (l2 = c5111q7.e) == null || l2.longValue() < 0 || (l3 = c5111q7.f) == null || l3.longValue() < 0) {
            return false;
        }
        Long l5 = c5111q7.g.d;
        if (l5 != null && l5.longValue() < 0) {
            return false;
        }
        Integer num = c5111q7.g.i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.w, null, null, null, null, null, null, String.valueOf(this.a));
                while (cursor.moveToNext()) {
                    try {
                        C5111q7 a = a(cursor);
                        if (a != null && a(a)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.x.fromModel(a));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.EnumC5316y9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC5088pa.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5111q7 a(Cursor cursor) {
        EnumC4840fl enumC4840fl;
        int i;
        U8 u8;
        EnumC5316y9 enumC5316y9;
        int i2;
        int i3;
        int i4;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.i)));
            int i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.k));
            EnumC4840fl enumC4840fl2 = EnumC4840fl.FOREGROUND;
            boolean z = true;
            try {
                if (i5 != 0) {
                    enumC4840fl2 = EnumC4840fl.BACKGROUND;
                    if (i5 != 1) {
                        enumC4840fl = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
                        EnumC5037nb a = EnumC5037nb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
                        i = cursor.getInt(cursor.getColumnIndexOrThrow(this.p));
                        U8 u82 = U8.NONE;
                        if (i != 0) {
                            u82 = U8.AES_VALUE_ENCRYPTION;
                            if (i != 2) {
                                u82 = U8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i != 1) {
                                    u8 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                                    i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
                                    EnumC5088pa enumC5088pa = EnumC5088pa.FIRST_OCCURRENCE;
                                    if (i4 != 1) {
                                        enumC5088pa = EnumC5088pa.NON_FIRST_OCCURENCE;
                                        if (i4 != 2) {
                                            EnumC5088pa enumC5088pa2 = EnumC5088pa.UNKNOWN;
                                            enumC5088pa = enumC5088pa2;
                                        }
                                    }
                                    EnumC5088pa enumC5088pa3 = enumC5088pa;
                                    i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                                    EnumC5316y9 enumC5316y92 = EnumC5316y9.NATIVE;
                                    if (i3 != 0) {
                                        enumC5316y92 = EnumC5316y9.JS;
                                        if (i3 != 1) {
                                            enumC5316y9 = null;
                                        }
                                    }
                                    enumC5316y9 = enumC5316y92;
                                }
                            }
                        }
                        u8 = u82;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
                        EnumC5088pa enumC5088pa4 = EnumC5088pa.FIRST_OCCURRENCE;
                        if (i4 != 1) {
                        }
                        EnumC5088pa enumC5088pa32 = enumC5088pa4;
                        i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                        EnumC5316y9 enumC5316y922 = EnumC5316y9.NATIVE;
                        if (i3 != 0) {
                        }
                        enumC5316y9 = enumC5316y922;
                    }
                }
            } catch (Throwable unused) {
            }
            enumC4840fl = enumC4840fl2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
            EnumC5037nb a2 = EnumC5037nb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
            i = cursor.getInt(cursor.getColumnIndexOrThrow(this.p));
            U8 u822 = U8.NONE;
            if (i != 0) {
            }
            u8 = u822;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
            EnumC5088pa enumC5088pa42 = EnumC5088pa.FIRST_OCCURRENCE;
            if (i4 != 1) {
            }
            EnumC5088pa enumC5088pa322 = enumC5088pa42;
            i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
            EnumC5316y9 enumC5316y9222 = EnumC5316y9.NATIVE;
            if (i3 != 0) {
            }
            enumC5316y9 = enumC5316y9222;
            z = false;
            Boolean valueOf9 = Boolean.valueOf(z);
            try {
                i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.u));
            } catch (Throwable unused2) {
                i2 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i2);
            int columnIndex = cursor.getColumnIndex(this.v);
            return new C5111q7(valueOf, enumC4840fl, valueOf22, a2, valueOf32, valueOf42, new C5085p7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, u8, string522, enumC5088pa322, enumC5316y9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i2);
            int columnIndex2 = cursor.getColumnIndex(this.v);
            return new C5111q7(valueOf, enumC4840fl, valueOf22, a2, valueOf32, valueOf42, new C5085p7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, u8, string522, enumC5088pa322, enumC5316y9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
