package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class ayz0 extends kj01 {
    public static final String[] i = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] j = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] k = {CallAnalyticsApiRequest.KEY_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    public static final String[] l = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] m = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] n = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] o = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] p = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final txz0 g;
    public final gj01 h;

    public ayz0(qj01 qj01Var) {
        super(qj01Var);
        this.h = new gj01(((mb01) this.b).o);
        ((mb01) this.b).getClass();
        this.g = new txz0(this, ((mb01) this.b).b);
    }

    public static final void w(ContentValues contentValues, Object obj) {
        exc0.f("value");
        exc0.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @VisibleForTesting
    public final long A(String str) {
        long z;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f("first_open_count");
        k();
        l();
        SQLiteDatabase C = C();
        C.beginTransaction();
        long j2 = 0;
        try {
            try {
                z = z("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (z == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (C.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.i.c("Failed to insert column (got -1). appId", k901.r(str), "first_open_count");
                        C.endTransaction();
                        return -1L;
                    }
                    z = 0;
                }
            } catch (Throwable th) {
                C.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + z));
            if (C.update("app2", contentValues2, "app_id = ?", new String[]{str}) != 0) {
                C.setTransactionSuccessful();
                C.endTransaction();
                return z;
            }
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.c("Failed to update column (got 0). appId", k901.r(str), "first_open_count");
            C.endTransaction();
            return -1L;
        } catch (SQLiteException e2) {
            e = e2;
            j2 = z;
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            k901Var3.i.d("Error inserting column. appId", k901.r(str), "first_open_count", e);
            C.endTransaction();
            return j2;
        }
    }

    public final long B(String str) {
        exc0.f(str);
        return z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    public final SQLiteDatabase C() {
        k();
        try {
            return this.g.getWritableDatabase();
        } catch (SQLiteException e) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.b(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qd01 D(String str) {
        Cursor cursor;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        k();
        l();
        Cursor cursor2 = null;
        try {
            cursor = C().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", CallAnalyticsApiRequest.KEY_APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    qd01 qd01Var = new qd01(this.e.m, str);
                    mb01 mb01Var2 = qd01Var.a;
                    qd01Var.c(cursor.getString(0));
                    qd01Var.r(cursor.getString(1));
                    qd01Var.y(cursor.getString(2));
                    qd01Var.v(cursor.getLong(3));
                    qd01Var.w(cursor.getLong(4));
                    qd01Var.u(cursor.getLong(5));
                    qd01Var.e(cursor.getString(6));
                    qd01Var.d(cursor.getString(7));
                    qd01Var.s(cursor.getLong(8));
                    qd01Var.n(cursor.getLong(9));
                    qd01Var.x(cursor.isNull(10) || cursor.getInt(10) != 0);
                    qd01Var.m(cursor.getLong(11));
                    qd01Var.k(cursor.getLong(12));
                    qd01Var.j(cursor.getLong(13));
                    qd01Var.h(cursor.getLong(14));
                    qd01Var.g(cursor.getLong(15));
                    qd01Var.p(cursor.getLong(16));
                    qd01Var.f(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                    qd01Var.q(cursor.getString(18));
                    qd01Var.i(cursor.getLong(19));
                    qd01Var.l(cursor.getLong(20));
                    qd01Var.t(cursor.getString(21));
                    boolean z = cursor.isNull(23) || cursor.getInt(23) != 0;
                    kb01 kb01Var = mb01Var2.k;
                    mb01.k(kb01Var);
                    kb01Var.k();
                    qd01Var.C |= qd01Var.p != z;
                    qd01Var.p = z;
                    qd01Var.b(cursor.getString(24));
                    qd01Var.o(cursor.isNull(25) ? 0L : cursor.getLong(25));
                    if (!cursor.isNull(26)) {
                        qd01Var.z(Arrays.asList(cursor.getString(26).split(StringUtils.COMMA, -1)));
                    }
                    zzpd.zzc();
                    if (mb01Var.h.t(null, s701.h0) && mb01Var.h.t(str, s701.j0)) {
                        String string = cursor.getString(28);
                        kb01 kb01Var2 = mb01Var2.k;
                        mb01.k(kb01Var2);
                        kb01Var2.k();
                        qd01Var.C = (true ^ c4g0.G(qd01Var.u, string)) | qd01Var.C;
                        qd01Var.u = string;
                    }
                    kb01 kb01Var3 = mb01Var2.k;
                    mb01.k(kb01Var3);
                    kb01Var3.k();
                    qd01Var.C = false;
                    if (cursor.moveToNext()) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.i.b(k901.r(str), "Got multiple records for app, expected one. appId");
                    }
                    cursor.close();
                    return qd01Var;
                } catch (SQLiteException e) {
                    e = e;
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.i.c("Error querying app. appId", k901.r(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac E(String str, String str2) {
        String str3;
        Cursor cursor;
        qj01 qj01Var = this.e;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f(str2);
        k();
        l();
        Cursor cursor2 = null;
        try {
            cursor = C().query("conditional_properties", new String[]{"origin", "value", SignalingProtocol.KEY_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object I = I(cursor, 1);
                    boolean z = cursor.getInt(2) != 0;
                    String string2 = cursor.getString(3);
                    long j2 = cursor.getLong(4);
                    sj01 sj01Var = qj01Var.h;
                    sj01 sj01Var2 = qj01Var.h;
                    qj01.I(sj01Var);
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) sj01Var.A(blob, creator);
                    long j3 = cursor.getLong(6);
                    qj01.I(sj01Var2);
                    zzaw zzawVar2 = (zzaw) sj01Var2.A(cursor.getBlob(7), creator);
                    long j4 = cursor.getLong(8);
                    long j5 = cursor.getLong(9);
                    qj01.I(sj01Var2);
                    str3 = str2;
                    try {
                        zzac zzacVar = new zzac(str, str4, new zzkw(j4, I, str3, str4), j3, z, string2, zzawVar, j2, zzawVar2, j5, (zzaw) sj01Var2.A(cursor.getBlob(10), creator));
                        if (cursor.moveToNext()) {
                            k901 k901Var = mb01Var.j;
                            mb01.k(k901Var);
                            k901Var.i.c("Got multiple records for conditional property, expected one", k901.r(str), mb01Var.n.f(str3));
                        }
                        cursor.close();
                        return zzacVar;
                    } catch (SQLiteException e) {
                        e = e;
                        k901 k901Var2 = mb01Var.j;
                        mb01.k(k901Var2);
                        k901Var2.i.d("Error querying conditional property", k901.r(str), mb01Var.n.f(str3), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final kxz0 F(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        k();
        l();
        String[] strArr = {str};
        kxz0 kxz0Var = new kxz0();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase C = C();
                Cursor query = C.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.l.b(k901.r(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return kxz0Var;
                }
                if (query.getLong(0) == j2) {
                    kxz0Var.b = query.getLong(1);
                    kxz0Var.a = query.getLong(2);
                    kxz0Var.c = query.getLong(3);
                    kxz0Var.d = query.getLong(4);
                    kxz0Var.e = query.getLong(5);
                }
                if (z) {
                    kxz0Var.b += j3;
                }
                if (z2) {
                    kxz0Var.a += j3;
                }
                if (z3) {
                    kxz0Var.c += j3;
                }
                if (z4) {
                    kxz0Var.d += j3;
                }
                if (z5) {
                    kxz0Var.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(kxz0Var.a));
                contentValues.put("daily_events_count", Long.valueOf(kxz0Var.b));
                contentValues.put("daily_conversions_count", Long.valueOf(kxz0Var.c));
                contentValues.put("daily_error_events_count", Long.valueOf(kxz0Var.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(kxz0Var.e));
                C.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return kxz0Var;
            } catch (SQLiteException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.c("Error updating daily counts. appId", k901.r(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return kxz0Var;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kzz0 G(String str, String str2) {
        Cursor cursor;
        Boolean bool;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f(str2);
        k();
        l();
        Cursor cursor2 = null;
        try {
            cursor = C().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j2 = cursor.getLong(0);
                    long j3 = cursor.getLong(1);
                    long j4 = cursor.getLong(2);
                    long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                    Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                    Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                    Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                    if (cursor.isNull(7)) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(cursor.getLong(7) == 1);
                    }
                    kzz0 kzz0Var = new kzz0(str, str2, j2, j3, cursor.isNull(8) ? 0L : cursor.getLong(8), j4, j5, valueOf, valueOf2, valueOf3, bool);
                    if (cursor.moveToNext()) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.i.b(k901.r(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursor.close();
                    return kzz0Var;
                } catch (SQLiteException e) {
                    e = e;
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.i.d("Error querying events. appId", k901.r(str), mb01Var.n.d(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uj01 H(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f(str2);
        k();
        l();
        Cursor cursor2 = null;
        try {
            cursor = C().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j2 = cursor.getLong(0);
                    Object I = I(cursor, 1);
                    if (I == null) {
                        cursor.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        uj01 uj01Var = new uj01(str3, cursor.getString(2), str4, j2, I);
                        if (cursor.moveToNext()) {
                            k901 k901Var = mb01Var.j;
                            mb01.k(k901Var);
                            k901Var.i.b(k901.r(str3), "Got multiple records for user property, expected one. appId");
                        }
                        cursor.close();
                        return uj01Var;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        k901 k901Var2 = mb01Var.j;
                        mb01.k(k901Var2);
                        k901Var2.i.d("Error querying user property. appId", k901.r(str3), mb01Var.n.f(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
        }
    }

    @VisibleForTesting
    public final Object I(Cursor cursor, int i2) {
        mb01 mb01Var = (mb01) this.b;
        int type = cursor.getType(i2);
        if (type == 0) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        k901 k901Var3 = mb01Var.j;
        mb01.k(k901Var3);
        k901Var3.i.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String J() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase C = C();
        ?? r1 = 0;
        try {
            try {
                cursor = C.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    k901 k901Var = ((mb01) this.b).j;
                    mb01.k(k901Var);
                    k901Var.i.b(e, "Database error getting next bundle app id");
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = C;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
    }

    public final List K(String str, String str2, String str3) {
        exc0.f(str);
        k();
        l();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return L(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r0 = r2.j;
        xsna.mb01.k(r0);
        r0.i.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List L(String str, String[] strArr) {
        qj01 qj01Var = this.e;
        mb01 mb01Var = (mb01) this.b;
        k();
        l();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase C = C();
                String[] strArr2 = {"app_id", "origin", "name", "value", SignalingProtocol.KEY_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                mb01Var.getClass();
                cursor = C.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        break;
                    }
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object I = I(cursor, 3);
                    boolean z = cursor.getInt(4) != 0;
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    sj01 sj01Var = qj01Var.h;
                    sj01 sj01Var2 = qj01Var.h;
                    qj01.I(sj01Var);
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) sj01Var.A(blob, creator);
                    long j3 = cursor.getLong(8);
                    qj01.I(sj01Var2);
                    zzaw zzawVar2 = (zzaw) sj01Var2.A(cursor.getBlob(9), creator);
                    long j4 = cursor.getLong(10);
                    long j5 = cursor.getLong(11);
                    qj01.I(sj01Var2);
                    arrayList.add(new zzac(string, string2, new zzkw(j4, I, string3, string2), j3, z, string4, zzawVar, j2, zzawVar2, j5, (zzaw) sj01Var2.A(cursor.getBlob(12), creator)));
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.i.b(e, "Error querying conditional user property value");
                List list = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List M(String str) {
        String str2;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        k();
        l();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                mb01Var.getClass();
                cursor = C().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j2 = cursor.getLong(2);
                        Object I = I(cursor, 3);
                        if (I == null) {
                            k901 k901Var = mb01Var.j;
                            mb01.k(k901Var);
                            k901Var.i.b(k901.r(str), "Read invalid user property value, ignoring it. appId");
                            str2 = str;
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new uj01(str2, str3, string, j2, I));
                            } catch (SQLiteException e) {
                                e = e;
                                k901 k901Var2 = mb01Var.j;
                                mb01.k(k901Var2);
                                k901Var2.i.c("Error querying user properties. appId", k901.r(str2), e);
                                List list = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return list;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            cursor.close();
                            return arrayList;
                        }
                        str = str2;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        xsna.mb01.k(r13);
        r13.i.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List N(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        k();
        l();
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str5 = str;
            arrayList2.add(str5);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(str3 + "*");
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb2 = sb.toString();
            mb01Var.getClass();
            k901 k901Var = mb01Var.j;
            Cursor query = C().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (!query.moveToFirst()) {
                        query.close();
                        return arrayList;
                    }
                    str4 = str2;
                    while (true) {
                        try {
                            if (arrayList.size() < 1000) {
                                String string = query.getString(0);
                                long j2 = query.getLong(1);
                                Object I = I(query, 2);
                                String string2 = query.getString(3);
                                if (I == null) {
                                    try {
                                        mb01.k(k901Var);
                                        k901Var.i.d("(2)Read invalid user property value, ignoring it", k901.r(str5), string2, str3);
                                    } catch (SQLiteException e) {
                                        e = e;
                                        cursor = query;
                                        str4 = string2;
                                        try {
                                            k901 k901Var2 = mb01Var.j;
                                            mb01.k(k901Var2);
                                            k901Var2.i.d("(2)Error querying user properties", k901.r(str), str4, e);
                                            List list = Collections.EMPTY_LIST;
                                            if (cursor != null) {
                                            }
                                            return list;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    arrayList.add(new uj01(str5, string2, string, j2, I));
                                }
                                if (!query.moveToNext()) {
                                    break;
                                }
                                str5 = str;
                                str4 = string2;
                            } else {
                                break;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor = query;
                            k901 k901Var22 = mb01Var.j;
                            mb01.k(k901Var22);
                            k901Var22.i.d("(2)Error querying user properties", k901.r(str), str4, e);
                            List list2 = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return list2;
                        }
                    }
                    query.close();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str4 = str2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final void O() {
        l();
        C().beginTransaction();
    }

    public final void P() {
        l();
        C().endTransaction();
    }

    @VisibleForTesting
    public final void Q(ArrayList arrayList) {
        mb01 mb01Var = (mb01) this.b;
        k();
        l();
        exc0.i(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (mb01Var.b.getDatabasePath("google_app_measurement.db").exists()) {
            String a = zr.a("(", TextUtils.join(StringUtils.COMMA, arrayList), ")");
            if (x("SELECT COUNT(1) FROM queue WHERE rowid IN " + a + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.l.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                C().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + a + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void R() {
        mb01 mb01Var = (mb01) this.b;
        k();
        l();
        if (mb01Var.b.getDatabasePath("google_app_measurement.db").exists()) {
            qj01 qj01Var = this.e;
            long a = qj01Var.j.h.a();
            mb01Var.o.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) s701.y.a(null)).longValue()) {
                qj01Var.j.h.b(elapsedRealtime);
                k();
                l();
                if (mb01Var.b.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase C = C();
                    mb01Var.o.getClass();
                    int delete = C.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) s701.D.a(null)).longValue())});
                    if (delete > 0) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.q.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void o(String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f(str2);
        k();
        l();
        try {
            C().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.d("Error deleting user property. appId", k901.r(str), mb01Var.n.f(str2), e);
        }
    }

    public final void p() {
        l();
        C().setTransactionSuccessful();
    }

    public final void q(qd01 qd01Var) {
        mb01 mb01Var = (mb01) this.b;
        k();
        l();
        String F = qd01Var.F();
        exc0.i(F);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", F);
        contentValues.put("app_instance_id", qd01Var.G());
        contentValues.put("gmp_app_id", qd01Var.J());
        mb01 mb01Var2 = qd01Var.a;
        kb01 kb01Var = mb01Var2.k;
        mb01.k(kb01Var);
        kb01Var.k();
        contentValues.put("resettable_device_id_hash", qd01Var.e);
        kb01 kb01Var2 = mb01Var2.k;
        mb01.k(kb01Var2);
        kb01Var2.k();
        contentValues.put("last_bundle_index", Long.valueOf(qd01Var.g));
        kb01 kb01Var3 = mb01Var2.k;
        mb01.k(kb01Var3);
        kb01Var3.k();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(qd01Var.h));
        kb01 kb01Var4 = mb01Var2.k;
        mb01.k(kb01Var4);
        kb01Var4.k();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(qd01Var.i));
        contentValues.put(CallAnalyticsApiRequest.KEY_APP_VERSION, qd01Var.H());
        kb01 kb01Var5 = mb01Var2.k;
        mb01.k(kb01Var5);
        kb01Var5.k();
        contentValues.put("app_store", qd01Var.l);
        kb01 kb01Var6 = mb01Var2.k;
        mb01.k(kb01Var6);
        kb01Var6.k();
        contentValues.put("gmp_version", Long.valueOf(qd01Var.m));
        kb01 kb01Var7 = mb01Var2.k;
        mb01.k(kb01Var7);
        kb01Var7.k();
        contentValues.put("dev_cert_hash", Long.valueOf(qd01Var.n));
        kb01 kb01Var8 = mb01Var2.k;
        mb01.k(kb01Var8);
        kb01Var8.k();
        contentValues.put("measurement_enabled", Boolean.valueOf(qd01Var.o));
        kb01 kb01Var9 = mb01Var2.k;
        mb01.k(kb01Var9);
        kb01Var9.k();
        contentValues.put("day", Long.valueOf(qd01Var.v));
        kb01 kb01Var10 = mb01Var2.k;
        mb01.k(kb01Var10);
        kb01Var10.k();
        contentValues.put("daily_public_events_count", Long.valueOf(qd01Var.w));
        mb01.k(kb01Var10);
        kb01Var10.k();
        contentValues.put("daily_events_count", Long.valueOf(qd01Var.x));
        mb01.k(kb01Var10);
        kb01Var10.k();
        contentValues.put("daily_conversions_count", Long.valueOf(qd01Var.y));
        kb01 kb01Var11 = mb01Var2.k;
        mb01.k(kb01Var11);
        kb01Var11.k();
        contentValues.put("config_fetched_time", Long.valueOf(qd01Var.D));
        kb01 kb01Var12 = mb01Var2.k;
        mb01.k(kb01Var12);
        kb01Var12.k();
        contentValues.put("failed_config_fetch_time", Long.valueOf(qd01Var.E));
        contentValues.put("app_version_int", Long.valueOf(qd01Var.B()));
        contentValues.put("firebase_instance_id", qd01Var.I());
        mb01.k(kb01Var10);
        kb01Var10.k();
        contentValues.put("daily_error_events_count", Long.valueOf(qd01Var.z));
        mb01.k(kb01Var10);
        kb01Var10.k();
        contentValues.put("daily_realtime_events_count", Long.valueOf(qd01Var.A));
        mb01.k(kb01Var10);
        kb01Var10.k();
        contentValues.put("health_monitor_sample", qd01Var.B);
        kb01 kb01Var13 = mb01Var2.k;
        mb01.k(kb01Var13);
        kb01Var13.k();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(qd01Var.A()));
        contentValues.put("admob_app_id", qd01Var.D());
        contentValues.put("dynamite_version", Long.valueOf(qd01Var.C()));
        kb01 kb01Var14 = mb01Var2.k;
        mb01.k(kb01Var14);
        kb01Var14.k();
        contentValues.put("session_stitching_token", qd01Var.u);
        kb01 kb01Var15 = mb01Var2.k;
        mb01.k(kb01Var15);
        kb01Var15.k();
        ArrayList arrayList = qd01Var.t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.l.b(F, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(StringUtils.COMMA, arrayList));
            }
        }
        zznt.zzc();
        kwz0 kwz0Var = mb01Var.h;
        k901 k901Var2 = mb01Var.j;
        if (kwz0Var.t(null, s701.f0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase C = C();
            if (C.update("apps", contentValues, "app_id = ?", new String[]{F}) == 0 && C.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mb01.k(k901Var2);
                k901Var2.i.b(k901.r(F), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            mb01.k(k901Var2);
            k901Var2.i.c("Error storing app. appId", k901.r(F), e);
        }
    }

    public final void r(kzz0 kzz0Var) {
        mb01 mb01Var = (mb01) this.b;
        exc0.i(kzz0Var);
        k();
        l();
        ContentValues contentValues = new ContentValues();
        String str = kzz0Var.a;
        contentValues.put("app_id", str);
        contentValues.put("name", kzz0Var.b);
        contentValues.put("lifetime_count", Long.valueOf(kzz0Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(kzz0Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(kzz0Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(kzz0Var.g));
        contentValues.put("last_bundled_day", kzz0Var.h);
        contentValues.put("last_sampled_complex_event_id", kzz0Var.i);
        contentValues.put("last_sampling_rate", kzz0Var.j);
        contentValues.put("current_session_count", Long.valueOf(kzz0Var.e));
        Boolean bool = kzz0Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (C().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.i.b(k901.r(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.c("Error storing event aggregates. appId", k901.r(str), e);
        }
    }

    public final void s(String str, Long l2, long j2, zzft zzftVar) {
        k();
        l();
        exc0.i(zzftVar);
        exc0.f(str);
        byte[] zzbu = zzftVar.zzbu();
        mb01 mb01Var = (mb01) this.b;
        k901 k901Var = mb01Var.j;
        k901 k901Var2 = mb01Var.j;
        mb01.k(k901Var);
        k901Var.q.c("Saving complex main event, appId, data size", mb01Var.n.d(str), Integer.valueOf(zzbu.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", zzbu);
        try {
            if (C().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                mb01.k(k901Var2);
                k901Var2.i.b(k901.r(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            mb01.k(k901Var2);
            k901Var2.i.c("Error storing complex main event. appId", k901.r(str), e);
        }
    }

    public final boolean t(zzac zzacVar) {
        mb01 mb01Var = (mb01) this.b;
        k();
        l();
        String str = zzacVar.b;
        exc0.i(str);
        if (H(str, zzacVar.d.c) == null) {
            long x = x("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            mb01Var.getClass();
            if (x >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.c);
        contentValues.put("name", zzacVar.d.c);
        Object zza = zzacVar.d.zza();
        exc0.i(zza);
        w(contentValues, zza);
        contentValues.put(SignalingProtocol.KEY_ACTIVE, Boolean.valueOf(zzacVar.f));
        contentValues.put("trigger_event_name", zzacVar.g);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.i));
        sk01 sk01Var = mb01Var.m;
        k901 k901Var = mb01Var.j;
        sk01 sk01Var2 = mb01Var.m;
        mb01.i(sk01Var);
        contentValues.put("timed_out_event", sk01.X(zzacVar.h));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.e));
        mb01.i(sk01Var2);
        contentValues.put("triggered_event", sk01.X(zzacVar.j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.d.d));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.k));
        mb01.i(sk01Var2);
        contentValues.put("expired_event", sk01.X(zzacVar.l));
        try {
            if (C().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            mb01.k(k901Var);
            k901Var.i.b(k901.r(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            mb01.k(k901Var);
            k901Var.i.c("Error storing conditional user property", k901.r(str), e);
            return true;
        }
    }

    public final boolean u(uj01 uj01Var) {
        mb01 mb01Var = (mb01) this.b;
        String str = uj01Var.b;
        k();
        l();
        String str2 = uj01Var.a;
        String str3 = uj01Var.c;
        if (H(str2, str3) == null) {
            if (sk01.U(str3)) {
                if (x("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(mb01Var.h.o(str2, s701.G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long x = x("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                mb01Var.getClass();
                if (x >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(uj01Var.d));
        w(contentValues, uj01Var.e);
        try {
            if (C().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.b(k901.r(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.c("Error storing user property. appId", k901.r(str2), e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j2, long j3, oj01 oj01Var) {
        String string;
        String str;
        String[] strArr;
        mb01 mb01Var = (mb01) this.b;
        ?? r4 = "select app_id, metadata_fingerprint from raw_events where ";
        k();
        l();
        ?? r5 = 0;
        String str2 = null;
        try {
            try {
                SQLiteDatabase C = C();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor rawQuery = C.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j3 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str2 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        Cursor rawQuery2 = C.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j3 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null});
                        if (!rawQuery2.moveToFirst()) {
                            rawQuery2.close();
                            return;
                        } else {
                            string = rawQuery2.getString(0);
                            rawQuery2.close();
                        }
                    }
                    Cursor query = C.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, string}, null, null, "rowid", "2");
                    if (!query.moveToFirst()) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.i.b(k901.r(str2), "Raw event metadata record is missing. appId");
                        query.close();
                        return;
                    }
                    try {
                        zzgd zzgdVar = (zzgd) ((zzgc) sj01.D(zzgd.zzt(), query.getBlob(0))).zzaC();
                        if (query.moveToNext()) {
                            k901 k901Var2 = mb01Var.j;
                            mb01.k(k901Var2);
                            k901Var2.l.b(k901.r(str2), "Get multiple raw event metadata records, expected one. appId");
                        }
                        query.close();
                        exc0.i(zzgdVar);
                        oj01Var.a = zzgdVar;
                        if (j3 != -1) {
                            str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{str2, string, String.valueOf(j3)};
                        } else {
                            str = "app_id = ? and metadata_fingerprint = ?";
                            strArr = new String[]{str2, string};
                        }
                        Cursor query2 = C.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str, strArr, null, null, "rowid", null);
                        if (!query2.moveToFirst()) {
                            k901 k901Var3 = mb01Var.j;
                            mb01.k(k901Var3);
                            k901Var3.l.b(k901.r(str2), "Raw event data disappeared while in transaction. appId");
                            query2.close();
                            return;
                        }
                        do {
                            long j4 = query2.getLong(0);
                            try {
                                zzfs zzfsVar = (zzfs) sj01.D(zzft.zze(), query2.getBlob(3));
                                zzfsVar.zzi(query2.getString(1));
                                zzfsVar.zzm(query2.getLong(2));
                                if (!oj01Var.a((zzft) zzfsVar.zzaC(), j4)) {
                                    query2.close();
                                    return;
                                }
                            } catch (IOException e) {
                                k901 k901Var4 = mb01Var.j;
                                mb01.k(k901Var4);
                                k901Var4.i.c("Data loss. Failed to merge raw event. appId", k901.r(str2), e);
                            }
                        } while (query2.moveToNext());
                        query2.close();
                    } catch (IOException e2) {
                        k901 k901Var5 = mb01Var.j;
                        mb01.k(k901Var5);
                        k901Var5.i.c("Data loss. Failed to merge raw event metadata. appId", k901.r(str2), e2);
                        query.close();
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    k901 k901Var6 = mb01Var.j;
                    mb01.k(k901Var6);
                    k901Var6.i.c("Data loss. Error selecting raw event. appId", k901.r(null), e);
                    if (r4 != 0) {
                        r4.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r5 = "select app_id, metadata_fingerprint from raw_events where ";
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            r4 = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r5 != 0) {
            }
            throw th;
        }
    }

    public final long x(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = C().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                k901 k901Var = ((mb01) this.b).j;
                mb01.k(k901Var);
                k901Var.i.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void y(String str, String str2) {
        mb01 mb01Var = (mb01) this.b;
        exc0.f(str);
        exc0.f(str2);
        k();
        l();
        try {
            C().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.d("Error deleting conditional property", k901.r(str), mb01Var.n.f(str2), e);
        }
    }

    public final long z(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = C().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j2;
                }
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            } catch (SQLiteException e) {
                k901 k901Var = ((mb01) this.b).j;
                mb01.k(k901Var);
                k901Var.i.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // xsna.kj01
    public final void n() {
    }
}
