package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.profile.Donut;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: GroupsCache.java */
/* loaded from: classes11.dex */
public final class epu {

    /* compiled from: GroupsCache.java */
    /* loaded from: classes5.dex */
    public static class a extends SQLiteOpenHelper {
        public static volatile a b;

        public static void m() {
            synchronized (a.class) {
                if (b != null) {
                    try {
                        b.close();
                    } catch (Exception e) {
                        L.i(e);
                    }
                    b = null;
                }
            }
        }

        public static a n(Context context) {
            a aVar;
            a aVar2 = b;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (a.class) {
                try {
                    aVar = b;
                    if (aVar == null) {
                        aVar = new a(context, "groups.db", null, 46);
                        b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS groups");
            sQLiteDatabase.execSQL("CREATE TABLE groups (id int, title text, photo varchar(500), photo_base varchar(500), domain varchar(500), activity varchar(500), type int, event_time int, closed int, admin bool, admin_level int, members_count int, verified int, trending int, has_app_market bool, using_vkpay_market_app bool, donut blob, photo_avg_color varchar(20), has_cover bool, cover_image blob, leave_mode varchar(128), has_live_cover bool, has_payment_cabinet bool, wall_state int, can_upload_story bool, can_upload_clips bool)");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onCreate(sQLiteDatabase);
            Locale locale = Locale.US;
            L.g("vk", new SQLiteException(efz.a(i, i2, "Trying to downgrade db version from ", " to ")));
            egi.g();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onCreate(sQLiteDatabase);
            egi.g();
        }
    }

    public static ContentValues a(Group group) {
        byte[] e;
        byte[] e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(group.c.b));
        contentValues.put("title", group.d);
        contentValues.put("photo", group.e);
        contentValues.put("photo_base", group.f);
        contentValues.put("activity", group.z);
        contentValues.put("type", Integer.valueOf(group.p));
        contentValues.put("closed", Integer.valueOf(group.m));
        contentValues.put("admin", Boolean.valueOf(group.i));
        contentValues.put("admin_level", Integer.valueOf(group.s));
        contentValues.put("event_time", Integer.valueOf(group.q));
        VerifyInfo verifyInfo = group.y;
        contentValues.put("verified", Integer.valueOf(verifyInfo.b ? 1 : 0));
        contentValues.put("trending", Integer.valueOf(verifyInfo.c ? 1 : 0));
        contentValues.put(X3.j.D, group.h);
        contentValues.put("members_count", Integer.valueOf(group.v));
        contentValues.put("using_vkpay_market_app", Boolean.valueOf(group.G));
        contentValues.put("has_app_market", Boolean.valueOf(group.H));
        try {
            Donut donut = group.Q;
            if (donut == null) {
                e2 = null;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                e2 = Serializer.b.e(donut);
            }
            contentValues.put("donut", e2);
        } catch (Exception e3) {
            com.vk.metrics.eventtracking.b.a.a(e3);
        }
        contentValues.put("photo_avg_color", group.g0);
        contentValues.put("has_cover", Boolean.valueOf(group.g()));
        try {
            Image image = group.i0;
            if (image == null) {
                e = null;
            } else {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                e = Serializer.b.e(image);
            }
            contentValues.put("cover_image", e);
        } catch (Exception e4) {
            com.vk.metrics.eventtracking.b.a.a(e4);
        }
        GroupLeaveMode groupLeaveMode = group.j0;
        contentValues.put("leave_mode", groupLeaveMode != null ? groupLeaveMode.h() : null);
        contentValues.put("has_live_cover", Boolean.valueOf(group.m0));
        contentValues.put("has_payment_cabinet", group.y0);
        contentValues.put("wall_state", Integer.valueOf(group.n));
        contentValues.put("can_upload_story", Boolean.valueOf(group.E));
        contentValues.put("can_upload_clips", Boolean.valueOf(group.F));
        return contentValues;
    }

    public static Group b(ContentValues contentValues) {
        Group group = new Group();
        group.c = new UserId(contentValues.getAsLong("id").longValue());
        group.d = contentValues.getAsString("title");
        group.e = contentValues.getAsString("photo");
        group.f = contentValues.getAsString("photo_base");
        group.z = contentValues.getAsString("activity");
        group.h = contentValues.getAsString(X3.j.D);
        group.p = contentValues.getAsInteger("type").intValue();
        group.q = contentValues.getAsInteger("event_time").intValue();
        group.m = contentValues.getAsInteger("closed").intValue();
        group.i = contentValues.getAsBoolean("admin").booleanValue();
        group.s = contentValues.getAsInteger("admin_level").intValue();
        boolean z = contentValues.getAsInteger("verified").intValue() == 1;
        VerifyInfo verifyInfo = group.y;
        verifyInfo.b = z;
        verifyInfo.c = contentValues.getAsInteger("trending").intValue() == 1;
        group.v = contentValues.getAsInteger("members_count").intValue();
        group.G = contentValues.getAsBoolean("using_vkpay_market_app").booleanValue();
        group.H = contentValues.getAsBoolean("has_app_market").booleanValue();
        try {
            byte[] asByteArray = contentValues.getAsByteArray("donut");
            if (asByteArray != null) {
                ClassLoader classLoader = Donut.class.getClassLoader();
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                group.Q = (Donut) Serializer.b.a(asByteArray, classLoader);
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
        group.g0 = contentValues.getAsString("photo_avg_color");
        group.D(contentValues.getAsBoolean("has_cover").booleanValue());
        try {
            byte[] asByteArray2 = contentValues.getAsByteArray("cover_image");
            if (asByteArray2 != null) {
                ClassLoader classLoader2 = Image.class.getClassLoader();
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                group.i0 = (Image) Serializer.b.a(asByteArray2, classLoader2);
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
        group.j0 = GroupLeaveMode.a(contentValues.getAsString("leave_mode"));
        group.m0 = contentValues.getAsBoolean("has_live_cover").booleanValue();
        group.y0 = contentValues.getAsBoolean("has_payment_cabinet");
        Integer asInteger = contentValues.getAsInteger("wall_state");
        if (asInteger != null) {
            group.n = asInteger.intValue();
        }
        Boolean asBoolean = contentValues.getAsBoolean("can_upload_story");
        if (asBoolean != null) {
            group.E = asBoolean.booleanValue();
        }
        Boolean asBoolean2 = contentValues.getAsBoolean("can_upload_clips");
        if (asBoolean2 != null) {
            group.F = asBoolean2.booleanValue();
        }
        return group;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursor = null;
            try {
                try {
                    cursor = a.n(e43.a).getReadableDatabase().query("groups", null, null, null, null, null, null);
                    if (cursor != null && cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        ContentValues contentValues = new ContentValues();
                        do {
                            DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                            arrayList.add(b(contentValues));
                        } while (cursor.moveToNext());
                    }
                } catch (Exception e) {
                    L.f("vk", "Error reading groups cache DB!", e);
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
        return arrayList;
    }

    public static void d(Group group) {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = a.n(e43.a).getWritableDatabase();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            writableDatabase.beginTransaction();
            writableDatabase.delete("groups", "id=" + group.c, null);
            writableDatabase.insert("groups", null, a(group));
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Exception e2) {
            e = e2;
            sQLiteDatabase = writableDatabase;
            com.vk.metrics.eventtracking.b.a.a(e);
            L.f("vk", "Error writing groups cache DB!", e);
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
    }
}
