package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.room.util.CursorUtil$wrapMappedColumns$2;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.o0;
import defpackage.aaa1;
import defpackage.baa1;
import defpackage.cf11;
import defpackage.cvw;
import defpackage.e791;
import defpackage.eib1;
import defpackage.f3a1;
import defpackage.fdb1;
import defpackage.g8e;
import defpackage.gw91;
import defpackage.ieb1;
import defpackage.j691;
import defpackage.jcp;
import defpackage.jdb1;
import defpackage.jpb;
import defpackage.kju0;
import defpackage.kl40;
import defpackage.n3a1;
import defpackage.ndi0;
import defpackage.nw91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.reb1;
import defpackage.s891;
import defpackage.sab1;
import defpackage.unr0;
import defpackage.w891;
import defpackage.wia1;
import defpackage.x4e;
import defpackage.y1a1;
import defpackage.y691;
import defpackage.y7a1;
import defpackage.yeb1;
import defpackage.z0b1;
import defpackage.zaa1;
import defpackage.zdb1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes.dex */
public final class b extends sab1 {
    public final zzau x;
    public final jpb y;
    public static final String[] z = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] A = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] B = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] C = {StartupRequest.PARAM_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", StartupRequest.PARAM_ANDROID_ID, "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] D = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] E = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] F = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] G = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] H = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] I = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] J = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public b(n nVar) {
        super(nVar);
        this.y = new jpb(((g) this.b).D);
        ((g) this.b).getClass();
        this.x = new zzau(this, ((g) this.b).a, "google_app_measurement.db");
    }

    public static final String jh(List list) {
        return list.isEmpty() ? "" : oyr.p(" AND (upload_type IN (", TextUtils.join(Extension.FIX_SPACE, list), "))");
    }

    public static final void ph(ContentValues contentValues, Object obj) {
        cvw.i("value");
        cvw.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            ny61.g("Invalid value type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zdb1 Ah(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        g gVar = (g) this.b;
        cvw.i(str);
        cvw.i(str2);
        Gg();
        Hg();
        Cursor cursor2 = null;
        try {
            cursor = vh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        Object Tg = Tg(cursor, 1);
                        if (Tg != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                zdb1 zdb1Var = new zdb1(str3, cursor.getString(2), str4, j, Tg);
                                if (cursor.moveToNext()) {
                                    y1a1 y1a1Var = gVar.y;
                                    g.g(y1a1Var);
                                    y1a1Var.z.b(y1a1.Og(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return zdb1Var;
                            } catch (SQLiteException e) {
                                e = e;
                                sQLiteException = e;
                                y1a1 y1a1Var2 = gVar.y;
                                g.g(y1a1Var2);
                                y1a1Var2.z.d("Error querying user property. appId", y1a1.Og(str3), gVar.C.c(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
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
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
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
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List Bh(String str) {
        String str2;
        SQLiteException sQLiteException;
        g gVar = (g) this.b;
        cvw.i(str);
        Gg();
        Hg();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                gVar.getClass();
                cursor = vh().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursor.getLong(2);
                        Object Tg = Tg(cursor, 3);
                        if (Tg == null) {
                            try {
                                y1a1 y1a1Var = gVar.y;
                                g.g(y1a1Var);
                                y1a1Var.z.b(y1a1.Og(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                y1a1 y1a1Var2 = gVar.y;
                                g.g(y1a1Var2);
                                y1a1Var2.z.c("Error querying user properties. appId", y1a1.Og(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new zdb1(str2, str3, string, j, Tg));
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLiteException = e;
                                y1a1 y1a1Var22 = gVar.y;
                                g.g(y1a1Var22);
                                y1a1Var22.z.c("Error querying user properties. appId", y1a1.Og(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        str = str2;
                    }
                }
            } finally {
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        com.google.android.gms.measurement.internal.g.g(r13);
        r13.z.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List Ch(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        g gVar = (g) this.b;
        cvw.i(str);
        Gg();
        Hg();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb3 = sb.toString();
            gVar.getClass();
            y1a1 y1a1Var = gVar.y;
            cursor2 = vh().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb3, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor2.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    break;
                                }
                                String string = cursor2.getString(0);
                                long j = cursor2.getLong(1);
                                Object Tg = Tg(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (Tg == null) {
                                    try {
                                        g.g(y1a1Var);
                                        y1a1Var.z.d("(2)Read invalid user property value, ignoring it", y1a1.Og(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            y1a1 y1a1Var2 = gVar.y;
                                            g.g(y1a1Var2);
                                            y1a1Var2.z.d("(2)Error querying user properties", y1a1.Og(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string2;
                                    try {
                                        arrayList.add(new zdb1(str, str5, string, j, Tg));
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        y1a1 y1a1Var22 = gVar.y;
                                        g.g(y1a1Var22);
                                        y1a1Var22.z.d("(2)Error querying user properties", y1a1.Og(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursor2;
                                y1a1 y1a1Var222 = gVar.y;
                                g.g(y1a1Var222);
                                y1a1Var222.z.d("(2)Error querying user properties", y1a1.Og(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final boolean Dh(zzah zzahVar) {
        g gVar = (g) this.b;
        Gg();
        Hg();
        String str = zzahVar.zza;
        cvw.l(str);
        if (Ah(str, zzahVar.zzc.zzb) == null) {
            long qh = qh("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            gVar.getClass();
            if (qh >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put("name", zzahVar.zzc.zzb);
        Object zza = zzahVar.zzc.zza();
        cvw.l(zza);
        ph(contentValues, zza);
        contentValues.put(ClidProvider.APP_ACTIVE, Boolean.valueOf(zzahVar.zze));
        contentValues.put("trigger_event_name", zzahVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.zzh));
        zzbg zzbgVar = zzahVar.zzg;
        ieb1 ieb1Var = gVar.B;
        y1a1 y1a1Var = gVar.y;
        g.e(ieb1Var);
        contentValues.put("timed_out_event", ieb1.jh(zzbgVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.zzd));
        g.e(ieb1Var);
        contentValues.put("triggered_event", ieb1.jh(zzahVar.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", ieb1.jh(zzahVar.zzk));
        try {
            if (vh().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            g.g(y1a1Var);
            y1a1Var.z.b(y1a1.Og(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            g.g(y1a1Var);
            y1a1Var.z.c("Error storing conditional user property", y1a1.Og(str), e);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:37:0x00f0 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzah Eh(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        g gVar = (g) this.b;
        cvw.i(str);
        cvw.i(str2);
        Gg();
        Hg();
        Cursor cursor3 = null;
        try {
            try {
                cursor = vh().query("conditional_properties", new String[]{"origin", "value", ClidProvider.APP_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        String string = cursor.getString(0);
        if (string == null) {
            string = "";
        }
        String str4 = string;
        Object Tg = Tg(cursor, 1);
        boolean z2 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j = cursor.getLong(4);
        f3a1 f3a1Var = this.c.z;
        n.O(f3a1Var);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
        zzbg zzbgVar = (zzbg) f3a1Var.lh(blob, creator);
        long j2 = cursor.getLong(6);
        n.O(f3a1Var);
        zzbg zzbgVar2 = (zzbg) f3a1Var.lh(cursor.getBlob(7), creator);
        long j3 = cursor.getLong(8);
        long j4 = cursor.getLong(9);
        n.O(f3a1Var);
        str3 = str2;
        try {
            zzah zzahVar = new zzah(str, str4, new zzpl(str3, j3, Tg, str4), j2, z2, string2, zzbgVar, j, zzbgVar2, j4, (zzbg) f3a1Var.lh(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.z.c("Got multiple records for conditional property, expected one", y1a1.Og(str), gVar.C.c(str3));
            }
            cursor.close();
            return zzahVar;
        } catch (SQLiteException e3) {
            e = e3;
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.d("Error querying conditional property", y1a1.Og(str), gVar.C.c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void Fh(String str, String str2) {
        cvw.i(str);
        cvw.i(str2);
        Gg();
        Hg();
        try {
            vh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            g gVar = (g) this.b;
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.d("Error deleting conditional property", y1a1.Og(str), gVar.C.c(str2), e);
        }
    }

    public final List Gh(String str, String str2, String str3) {
        cvw.i(str);
        Gg();
        Hg();
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
        return Hh(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r0 = r1.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0.z.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List Hh(String str, String[] strArr) {
        g gVar = (g) this.b;
        Gg();
        Hg();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase vh = vh();
                String[] strArr2 = {CommonUrlParts.APP_ID, "origin", "name", "value", ClidProvider.APP_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                gVar.getClass();
                cursor = vh.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object Tg = Tg(cursor, 3);
                        boolean z2 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        f3a1 f3a1Var = this.c.z;
                        n.O(f3a1Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) f3a1Var.lh(blob, creator);
                        long j2 = cursor.getLong(8);
                        n.O(f3a1Var);
                        zzbg zzbgVar2 = (zzbg) f3a1Var.lh(cursor.getBlob(9), creator);
                        long j3 = cursor.getLong(10);
                        long j4 = cursor.getLong(11);
                        n.O(f3a1Var);
                        arrayList.add(new zzah(string, string2, new zzpl(string3, j3, Tg, string2), j2, z2, string4, zzbgVar, j, zzbgVar2, j4, (zzbg) f3a1Var.lh(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.z.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n3a1 Ih(String str) {
        Cursor cursor;
        Boolean valueOf;
        String string;
        g gVar = (g) this.b;
        cvw.i(str);
        Gg();
        Hg();
        Cursor cursor2 = null;
        try {
            cursor = vh().query(ClidProvider.APPS_TABLE_NAME, new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", StartupRequest.PARAM_APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", StartupRequest.PARAM_ANDROID_ID, "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.c("Error querying app. appId", y1a1.Og(str), e);
                    if (cursor != null) {
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
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        n nVar = this.c;
        n3a1 n3a1Var = new n3a1(nVar.E, str);
        g gVar2 = n3a1Var.a;
        wia1 a = nVar.a(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (a.i(zzjkVar)) {
            n3a1Var.F(cursor.getString(0));
        }
        boolean z2 = true;
        n3a1Var.H(cursor.getString(1));
        if (nVar.a(str).i(zzjk.AD_STORAGE)) {
            n3a1Var.I(cursor.getString(2));
        }
        n3a1Var.e(cursor.getLong(3));
        n3a1Var.L(cursor.getLong(4));
        n3a1Var.M(cursor.getLong(5));
        n3a1Var.O(cursor.getString(6));
        n3a1Var.R(cursor.getString(7));
        n3a1Var.S(cursor.getLong(8));
        n3a1Var.a(cursor.getLong(9));
        n3a1Var.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        n3a1Var.i(cursor.getLong(11));
        n3a1Var.j(cursor.getLong(12));
        n3a1Var.k(cursor.getLong(13));
        n3a1Var.l(cursor.getLong(14));
        n3a1Var.f(cursor.getLong(15));
        n3a1Var.g(cursor.getLong(16));
        n3a1Var.Q(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        n3a1Var.K(cursor.getString(18));
        n3a1Var.n(cursor.getLong(19));
        n3a1Var.m(cursor.getLong(20));
        n3a1Var.v(cursor.getString(21));
        boolean z3 = cursor.isNull(23) || cursor.getInt(23) != 0;
        aaa1 aaa1Var = gVar2.z;
        g.g(aaa1Var);
        aaa1Var.Gg();
        n3a1Var.Q |= n3a1Var.p != z3;
        n3a1Var.p = z3;
        n3a1Var.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            n3a1Var.x(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (nVar.a(str).i(zzjkVar)) {
            String string2 = cursor.getString(28);
            aaa1 aaa1Var2 = gVar2.z;
            g.g(aaa1Var2);
            aaa1Var2.Gg();
            n3a1Var.Q |= !Objects.equals(n3a1Var.t, string2);
            n3a1Var.t = string2;
        }
        boolean z4 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        aaa1 aaa1Var3 = gVar2.z;
        g.g(aaa1Var3);
        aaa1Var3.Gg();
        n3a1Var.Q |= n3a1Var.u != z4;
        n3a1Var.u = z4;
        n3a1Var.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        aaa1 aaa1Var4 = gVar2.z;
        g.g(aaa1Var4);
        aaa1Var4.Gg();
        n3a1Var.Q |= n3a1Var.C != string3;
        n3a1Var.C = string3;
        n3a1Var.z(cursor.getLong(30));
        n3a1Var.A(cursor.getLong(31));
        eib1.a();
        if (gVar.w.Qg(str, nw91.P0)) {
            int i = cursor.getInt(32);
            aaa1 aaa1Var5 = gVar2.z;
            g.g(aaa1Var5);
            aaa1Var5.Gg();
            n3a1Var.Q |= n3a1Var.x != i;
            n3a1Var.x = i;
            n3a1Var.B(cursor.getLong(35));
        }
        boolean z5 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        aaa1 aaa1Var6 = gVar2.z;
        g.g(aaa1Var6);
        aaa1Var6.Gg();
        n3a1Var.Q |= n3a1Var.y != z5;
        n3a1Var.y = z5;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        aaa1 aaa1Var7 = gVar2.z;
        g.g(aaa1Var7);
        aaa1Var7.Gg();
        n3a1Var.Q |= !Objects.equals(n3a1Var.q, valueOf);
        n3a1Var.q = valueOf;
        n3a1Var.p(cursor.getInt(37));
        n3a1Var.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = "";
        } else {
            string = cursor.getString(40);
            cvw.l(string);
        }
        aaa1 aaa1Var8 = gVar2.z;
        g.g(aaa1Var8);
        aaa1Var8.Gg();
        n3a1Var.Q |= n3a1Var.G != string;
        n3a1Var.G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            aaa1 aaa1Var9 = gVar2.z;
            g.g(aaa1Var9);
            aaa1Var9.Gg();
            n3a1Var.Q |= !Objects.equals(n3a1Var.z, valueOf2);
            n3a1Var.z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            aaa1 aaa1Var10 = gVar2.z;
            g.g(aaa1Var10);
            aaa1Var10.Gg();
            n3a1Var.Q |= !Objects.equals(n3a1Var.A, valueOf3);
            n3a1Var.A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        aaa1 aaa1Var11 = gVar2.z;
        g.g(aaa1Var11);
        aaa1Var11.Gg();
        n3a1Var.Q |= n3a1Var.H != blob;
        n3a1Var.H = blob;
        if (!cursor.isNull(44)) {
            int i2 = cursor.getInt(44);
            aaa1 aaa1Var12 = gVar2.z;
            g.g(aaa1Var12);
            aaa1Var12.Gg();
            boolean z6 = n3a1Var.Q;
            if (n3a1Var.I == i2) {
                z2 = false;
            }
            n3a1Var.Q = z2 | z6;
            n3a1Var.I = i2;
        }
        aaa1 aaa1Var13 = gVar2.z;
        g.g(aaa1Var13);
        aaa1Var13.Gg();
        n3a1Var.Q = false;
        if (cursor.moveToNext()) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(y1a1.Og(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return n3a1Var;
    }

    @Override // defpackage.sab1
    public final void Jg() {
    }

    public final void Jh(n3a1 n3a1Var, boolean z2) {
        g gVar = (g) this.b;
        g gVar2 = n3a1Var.a;
        Gg();
        Hg();
        String D2 = n3a1Var.D();
        cvw.l(D2);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, D2);
        n nVar = this.c;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (nVar.a(D2).i(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", n3a1Var.E());
        }
        contentValues.put("gmp_app_id", n3a1Var.G());
        if (nVar.a(D2).i(zzjk.AD_STORAGE)) {
            aaa1 aaa1Var = gVar2.z;
            g.g(aaa1Var);
            aaa1Var.Gg();
            contentValues.put("resettable_device_id_hash", n3a1Var.e);
        }
        aaa1 aaa1Var2 = gVar2.z;
        g.g(aaa1Var2);
        aaa1Var2.Gg();
        contentValues.put("last_bundle_index", Long.valueOf(n3a1Var.g));
        aaa1 aaa1Var3 = gVar2.z;
        g.g(aaa1Var3);
        aaa1Var3.Gg();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(n3a1Var.h));
        aaa1 aaa1Var4 = gVar2.z;
        g.g(aaa1Var4);
        aaa1Var4.Gg();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(n3a1Var.i));
        contentValues.put(StartupRequest.PARAM_APP_VERSION, n3a1Var.N());
        aaa1 aaa1Var5 = gVar2.z;
        g.g(aaa1Var5);
        aaa1Var5.Gg();
        contentValues.put("app_store", n3a1Var.l);
        aaa1 aaa1Var6 = gVar2.z;
        g.g(aaa1Var6);
        aaa1Var6.Gg();
        contentValues.put("gmp_version", Long.valueOf(n3a1Var.m));
        aaa1 aaa1Var7 = gVar2.z;
        g.g(aaa1Var7);
        aaa1Var7.Gg();
        contentValues.put("dev_cert_hash", Long.valueOf(n3a1Var.n));
        aaa1 aaa1Var8 = gVar2.z;
        g.g(aaa1Var8);
        aaa1Var8.Gg();
        contentValues.put("measurement_enabled", Boolean.valueOf(n3a1Var.o));
        aaa1 aaa1Var9 = gVar2.z;
        aaa1 aaa1Var10 = gVar2.z;
        g.g(aaa1Var9);
        aaa1Var9.Gg();
        contentValues.put("day", Long.valueOf(n3a1Var.J));
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("daily_public_events_count", Long.valueOf(n3a1Var.K));
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("daily_events_count", Long.valueOf(n3a1Var.L));
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("daily_conversions_count", Long.valueOf(n3a1Var.M));
        aaa1 aaa1Var11 = gVar2.z;
        g.g(aaa1Var11);
        aaa1Var11.Gg();
        contentValues.put("config_fetched_time", Long.valueOf(n3a1Var.R));
        aaa1 aaa1Var12 = gVar2.z;
        g.g(aaa1Var12);
        aaa1Var12.Gg();
        contentValues.put("failed_config_fetch_time", Long.valueOf(n3a1Var.S));
        contentValues.put("app_version_int", Long.valueOf(n3a1Var.P()));
        contentValues.put("firebase_instance_id", n3a1Var.J());
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("daily_error_events_count", Long.valueOf(n3a1Var.N));
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("daily_realtime_events_count", Long.valueOf(n3a1Var.O));
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("health_monitor_sample", n3a1Var.P);
        contentValues.put(StartupRequest.PARAM_ANDROID_ID, (Long) 0L);
        aaa1 aaa1Var13 = gVar2.z;
        g.g(aaa1Var13);
        aaa1Var13.Gg();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(n3a1Var.p));
        contentValues.put("dynamite_version", Long.valueOf(n3a1Var.b()));
        if (nVar.a(D2).i(zzjk.ANALYTICS_STORAGE)) {
            aaa1 aaa1Var14 = gVar2.z;
            g.g(aaa1Var14);
            aaa1Var14.Gg();
            contentValues.put("session_stitching_token", n3a1Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(n3a1Var.y()));
        aaa1 aaa1Var15 = gVar2.z;
        g.g(aaa1Var15);
        aaa1Var15.Gg();
        contentValues.put("target_os_version", Long.valueOf(n3a1Var.v));
        aaa1 aaa1Var16 = gVar2.z;
        g.g(aaa1Var16);
        aaa1Var16.Gg();
        contentValues.put("session_stitching_token_hash", Long.valueOf(n3a1Var.w));
        eib1.a();
        j691 j691Var = gVar.w;
        y1a1 y1a1Var = gVar.y;
        if (j691Var.Qg(D2, nw91.P0)) {
            aaa1 aaa1Var17 = gVar2.z;
            g.g(aaa1Var17);
            aaa1Var17.Gg();
            contentValues.put("ad_services_version", Integer.valueOf(n3a1Var.x));
            aaa1 aaa1Var18 = gVar2.z;
            g.g(aaa1Var18);
            aaa1Var18.Gg();
            contentValues.put("attribution_eligibility_status", Long.valueOf(n3a1Var.B));
        }
        aaa1 aaa1Var19 = gVar2.z;
        g.g(aaa1Var19);
        aaa1Var19.Gg();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(n3a1Var.y));
        contentValues.put("npa_metadata_value", n3a1Var.w());
        aaa1 aaa1Var20 = gVar2.z;
        g.g(aaa1Var20);
        aaa1Var20.Gg();
        contentValues.put("bundle_delivery_index", Long.valueOf(n3a1Var.F));
        contentValues.put("sgtm_preview_key", n3a1Var.C());
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("dma_consent_state", Integer.valueOf(n3a1Var.D));
        g.g(aaa1Var10);
        aaa1Var10.Gg();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(n3a1Var.E));
        contentValues.put("serialized_npa_metadata", n3a1Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(n3a1Var.t()));
        aaa1 aaa1Var21 = gVar2.z;
        g.g(aaa1Var21);
        aaa1Var21.Gg();
        ArrayList arrayList = n3a1Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                g.g(y1a1Var);
                y1a1Var.C.b(D2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((yeb1) reb1.b.a.get()).getClass();
        if (gVar.w.Qg(null, nw91.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        aaa1 aaa1Var22 = gVar2.z;
        g.g(aaa1Var22);
        aaa1Var22.Gg();
        contentValues.put("unmatched_pfo", n3a1Var.z);
        aaa1 aaa1Var23 = gVar2.z;
        g.g(aaa1Var23);
        aaa1Var23.Gg();
        contentValues.put("unmatched_uwa", n3a1Var.A);
        aaa1 aaa1Var24 = gVar2.z;
        g.g(aaa1Var24);
        aaa1Var24.Gg();
        contentValues.put("ad_campaign_info", n3a1Var.H);
        try {
            SQLiteDatabase vh = vh();
            if (vh.update(ClidProvider.APPS_TABLE_NAME, contentValues, "app_id = ?", new String[]{D2}) == 0 && vh.insertWithOnConflict(ClidProvider.APPS_TABLE_NAME, null, contentValues, 5) == -1) {
                g.g(y1a1Var);
                y1a1Var.z.b(y1a1.Og(D2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            g.g(y1a1Var);
            y1a1Var.z.c("Error storing app. appId", y1a1.Og(D2), e);
        }
    }

    public final long Kg(String str, i0 i0Var, String str2, Map map, zzls zzlsVar, Long l) {
        int delete;
        g gVar = (g) this.b;
        Gg();
        Hg();
        cvw.l(i0Var);
        cvw.i(str);
        Gg();
        Hg();
        if (nh()) {
            n nVar = this.c;
            long a = nVar.B.z.a();
            kl40 kl40Var = gVar.D;
            y1a1 y1a1Var = gVar.y;
            kl40Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) nw91.M.a(null)).longValue()) {
                nVar.B.z.b(elapsedRealtime);
                Gg();
                Hg();
                if (nh() && (delete = vh().delete("upload_queue", ih(), new String[0])) > 0) {
                    g.g(y1a1Var);
                    y1a1Var.H.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                cvw.i(str);
                Gg();
                Hg();
                try {
                    int Og = gVar.w.Og(str, nw91.A);
                    if (Og > 0) {
                        vh().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(Og)});
                    }
                } catch (SQLiteException e) {
                    g.g(y1a1Var);
                    y1a1Var.z.c("Error deleting over the limit queued batches. appId", y1a1.Og(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] d = i0Var.d();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("measurement_batch", d);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join(Constants.LINE_SEPARATOR, arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.a()));
        kl40 kl40Var2 = gVar.D;
        y1a1 y1a1Var2 = gVar.y;
        kl40Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = vh().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            g.g(y1a1Var2);
            y1a1Var2.z.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            g.g(y1a1Var2);
            y1a1Var2.z.c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    public final y691 Kh(long j, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return Lh(j, str, 1L, false, false, z2, false, z3, z4, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List Lg(String str, zzoo zzooVar, int i) {
        ?? r0;
        cvw.i(str);
        Gg();
        Hg();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase vh = vh();
                String[] strArr = {"rowId", CommonUrlParts.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String jh = jh(zzooVar.zza);
                String ih = ih();
                StringBuilder sb = new StringBuilder(jh.length() + 17 + ih.length());
                sb.append("app_id=?");
                sb.append(jh);
                sb.append(" AND NOT ");
                sb.append(ih);
                cursor = vh.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
                r0 = new ArrayList();
                while (cursor.moveToNext()) {
                    jdb1 hh = hh(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    if (hh != null) {
                        r0.add(hh);
                    }
                }
            } catch (SQLiteException e) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.z.c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                r0 = Collections.EMPTY_LIST;
            }
            return r0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final y691 Lh(long j, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        g gVar = (g) this.b;
        cvw.i(str);
        Gg();
        Hg();
        String[] strArr = {str};
        y691 y691Var = new y691();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase vh = vh();
                cursor = vh.query(ClidProvider.APPS_TABLE_NAME, new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        y691Var.b = cursor.getLong(1);
                        y691Var.a = cursor.getLong(2);
                        y691Var.c = cursor.getLong(3);
                        y691Var.d = cursor.getLong(4);
                        y691Var.e = cursor.getLong(5);
                        y691Var.f = cursor.getLong(6);
                        y691Var.g = cursor.getLong(7);
                    }
                    if (z2) {
                        y691Var.b += j2;
                    }
                    if (z3) {
                        y691Var.a += j2;
                    }
                    if (z4) {
                        y691Var.c += j2;
                    }
                    if (z5) {
                        y691Var.d += j2;
                    }
                    if (z6) {
                        y691Var.e += j2;
                    }
                    if (z7) {
                        y691Var.f += j2;
                    }
                    if (z8) {
                        y691Var.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(y691Var.a));
                    contentValues.put("daily_events_count", Long.valueOf(y691Var.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(y691Var.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(y691Var.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(y691Var.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(y691Var.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(y691Var.g));
                    vh.update(ClidProvider.APPS_TABLE_NAME, contentValues, "app_id=?", strArr);
                } else {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.C.b(y1a1.Og(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.c("Error updating daily counts. appId", y1a1.Og(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
            return y691Var;
        } finally {
        }
    }

    public final boolean Mg(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].a()));
        String jh = jh(arrayList);
        String ih = ih();
        return qh(g8e.r(new StringBuilder((jh.length() + 61) + ih.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", jh, " AND NOT ", ih), new String[]{str}) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cf11 Mh(String str) {
        Throwable th;
        Cursor cursor;
        g gVar = (g) this.b;
        cvw.i(str);
        Gg();
        Hg();
        ?? r2 = 0;
        try {
            try {
                cursor = vh().query(ClidProvider.APPS_TABLE_NAME, new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            y1a1 y1a1Var = gVar.y;
                            g.g(y1a1Var);
                            y1a1Var.z.b(y1a1.Og(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            cf11 cf11Var = new cf11(blob, string, string2);
                            cursor.close();
                            return cf11Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.c("Error querying remote config. appId", y1a1.Og(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void Ng(Long l) {
        g gVar = (g) this.b;
        Gg();
        Hg();
        try {
            if (vh().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final void Nh(j0 j0Var, boolean z2) {
        Gg();
        Hg();
        cvw.i(j0Var.r());
        cvw.o(j0Var.d2());
        Qg();
        g gVar = (g) this.b;
        kl40 kl40Var = gVar.D;
        y1a1 y1a1Var = gVar.y;
        kl40Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long e2 = j0Var.e2();
        gw91 gw91Var = nw91.R;
        if (e2 < currentTimeMillis - ((Long) gw91Var.a(null)).longValue() || j0Var.e2() > ((Long) gw91Var.a(null)).longValue() + currentTimeMillis) {
            g.g(y1a1Var);
            y1a1Var.C.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", y1a1.Og(j0Var.r()), Long.valueOf(currentTimeMillis), Long.valueOf(j0Var.e2()));
        }
        byte[] d = j0Var.d();
        try {
            f3a1 f3a1Var = this.c.z;
            n.O(f3a1Var);
            byte[] sh = f3a1Var.sh(d);
            g.g(y1a1Var);
            y1a1Var.H.b(Integer.valueOf(sh.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(CommonUrlParts.APP_ID, j0Var.r());
            contentValues.put("bundle_end_timestamp", Long.valueOf(j0Var.e2()));
            contentValues.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, sh);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (j0Var.r0()) {
                contentValues.put("retry_count", Integer.valueOf(j0Var.s0()));
            }
            try {
                if (vh().insert("queue", null, contentValues) == -1) {
                    g.g(y1a1Var);
                    y1a1Var.z.b(y1a1.Og(j0Var.r()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                g.g(y1a1Var);
                y1a1Var.z.c("Error storing bundle. appId", y1a1.Og(j0Var.r()), e);
            }
        } catch (IOException e3) {
            g.g(y1a1Var);
            y1a1Var.z.c("Data loss. Failed to serialize bundle. appId", y1a1.Og(j0Var.r()), e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Og() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase vh = vh();
        ?? r1 = 0;
        try {
            try {
                cursor = vh.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    y1a1 y1a1Var = ((g) this.b).y;
                    g.g(y1a1Var);
                    y1a1Var.z.b(e, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = vh;
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
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void Pg(long j) {
        Gg();
        Hg();
        try {
            if (vh().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.z.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void Qg() {
        Gg();
        Hg();
        if (nh()) {
            n nVar = this.c;
            long a = nVar.B.y.a();
            g gVar = (g) this.b;
            gVar.D.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) nw91.M.a(null)).longValue()) {
                nVar.B.y.b(elapsedRealtime);
                Gg();
                Hg();
                if (nh()) {
                    SQLiteDatabase vh = vh();
                    gVar.D.getClass();
                    int delete = vh.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) nw91.R.a(null)).longValue())});
                    if (delete > 0) {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.H.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void Rg(ArrayList arrayList) {
        g gVar = (g) this.b;
        Gg();
        Hg();
        cvw.l(arrayList);
        if (arrayList.size() == 0) {
            ny61.g("Given Integer is zero");
            return;
        }
        if (nh()) {
            String join = TextUtils.join(",", arrayList);
            String r = unr0.r(new StringBuilder(String.valueOf(join).length() + 2), Extension.O_BRAKE, join, Extension.C_BRAKE);
            if (qh(unr0.r(new StringBuilder(r.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", r, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase vh = vh();
                StringBuilder sb = new StringBuilder(r.length() + HProv.PP_VERSION_TIMESTAMP);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(r);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                vh.execSQL(sb.toString());
            } catch (SQLiteException e) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void Sg(Long l) {
        g gVar = (g) this.b;
        Gg();
        Hg();
        if (nh()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (qh(sb.toString(), null) > 0) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase vh = vh();
                gVar.D.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                vh.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object Tg(Cursor cursor, int i) {
        g gVar = (g) this.b;
        int type = cursor.getType(i);
        if (type == 0) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        y1a1 y1a1Var3 = gVar.y;
        g.g(y1a1Var3);
        y1a1Var3.z.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0.z.d("Error inserting column. appId", defpackage.y1a1.Og(r14), "first_open_count", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Ug(String str) {
        long j;
        long rh;
        g gVar = (g) this.b;
        cvw.i(str);
        cvw.i("first_open_count");
        Gg();
        Hg();
        SQLiteDatabase vh = vh();
        vh.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                rh = rh(-1L, sb.toString(), new String[]{str});
            } catch (SQLiteException e) {
                e = e;
            }
            if (rh == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(CommonUrlParts.APP_ID, str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (vh.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.c("Failed to insert column (got -1). appId", y1a1.Og(str), "first_open_count");
                    return j;
                }
                rh = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(CommonUrlParts.APP_ID, str);
            contentValues2.put("first_open_count", Long.valueOf(1 + rh));
            if (vh.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.c("Failed to update column (got 0). appId", y1a1.Og(str), "first_open_count");
            } else {
                vh.setTransactionSuccessful();
                j = rh;
            }
            return j;
        } finally {
            vh.endTransaction();
        }
    }

    public final boolean Vg(String str, String str2) {
        return qh("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long Wg(String str) {
        cvw.i(str);
        return rh(0L, "select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str});
    }

    public final void Xg(String str, Long l, long j, e0 e0Var) {
        Gg();
        Hg();
        cvw.l(e0Var);
        cvw.i(str);
        g gVar = (g) this.b;
        byte[] d = e0Var.d();
        y1a1 y1a1Var = gVar.y;
        y1a1 y1a1Var2 = gVar.y;
        g.g(y1a1Var);
        y1a1Var.H.c("Saving complex main event, appId, data size", gVar.C.a(str), Integer.valueOf(d.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", d);
        try {
            if (vh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                g.g(y1a1Var2);
                y1a1Var2.z.b(y1a1.Og(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            g.g(y1a1Var2);
            y1a1Var2.z.c("Error storing complex main event. appId", y1a1.Og(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029c A[Catch: SQLiteException -> 0x02b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02b8, blocks: (B:69:0x0281, B:71:0x029c), top: B:68:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Yg(String str, Long l, String str2, Bundle bundle) {
        String string;
        String u;
        Bundle bundle2;
        y1a1 y1a1Var;
        long update;
        e791 e791Var;
        j0 j0Var;
        Cursor query;
        b bVar = this;
        String str3 = str;
        Object obj = bVar.b;
        g gVar = (g) obj;
        bVar.Gg();
        bVar.Hg();
        ndi0 ndi0Var = l != null ? new ndi0(bVar, str3, l.longValue()) : new ndi0(bVar, str3);
        List<e791> e = ndi0Var.e();
        while (!e.isEmpty()) {
            for (e791 e791Var2 : e) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    j0 j0Var2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = bVar.vh().query("raw_events_metadata", new String[]{kju0.j}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(e791Var2.b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = query;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                j0Var = null;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            j0Var = null;
                        }
                        if (query.moveToFirst()) {
                            try {
                                j0Var = (j0) ((zaa1) f3a1.th(j0.W(), query.getBlob(0))).f();
                                try {
                                    if (query.moveToNext()) {
                                        y1a1 y1a1Var2 = gVar.y;
                                        g.g(y1a1Var2);
                                        y1a1Var2.C.b(y1a1.Og(str3), "Get multiple raw event metadata records, expected one. appId");
                                    }
                                    query.close();
                                    query.close();
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursor2 = query;
                                    y1a1 y1a1Var3 = gVar.y;
                                    g.g(y1a1Var3);
                                    y1a1Var3.z.c("Data loss. Error selecting raw event. appId", y1a1.Og(str3), e);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    j0Var2 = j0Var;
                                    if (j0Var2 != null) {
                                    }
                                    n nVar = bVar.c;
                                    f3a1 f3a1Var = nVar.z;
                                    n.O(f3a1Var);
                                    e0 e0Var = e791Var2.d;
                                    Bundle bundle3 = new Bundle();
                                    while (r7.hasNext()) {
                                    }
                                    e791 e791Var3 = e791Var2;
                                    string = bundle3.getString("_o");
                                    bundle3.remove("_o");
                                    u = e0Var.u();
                                    if (string == null) {
                                    }
                                    ieb1 ieb1Var = gVar.B;
                                    y1a1 y1a1Var4 = gVar.y;
                                    g.e(ieb1Var);
                                    if (u.equals("_cmp")) {
                                    }
                                    String str4 = string;
                                    ieb1Var.Rg(bundle3, bundle2);
                                    s891 s891Var = new s891((g) obj, str4, str3, e0Var.u(), e0Var.w(), e0Var.y(), bundle3);
                                    long j = e791Var3.a;
                                    long j2 = e791Var3.b;
                                    boolean z2 = e791Var3.c;
                                    Gg();
                                    Hg();
                                    String str5 = s891Var.a;
                                    cvw.i(str5);
                                    f3a1 f3a1Var2 = nVar.z;
                                    n.O(f3a1Var2);
                                    byte[] d = f3a1Var2.ih(s891Var).d();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put(CommonUrlParts.APP_ID, str5);
                                    contentValues.put("name", s891Var.b);
                                    contentValues.put(ClidProvider.TIMESTAMP, Long.valueOf(s891Var.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                                    contentValues.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, d);
                                    contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                                    update = vh().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                                    if (update != 1) {
                                    }
                                    bVar = this;
                                    str3 = str;
                                }
                                j0Var2 = j0Var;
                            } catch (IOException e5) {
                                y1a1 y1a1Var5 = gVar.y;
                                g.g(y1a1Var5);
                                y1a1Var5.z.c("Data loss. Failed to merge raw event metadata. appId", y1a1.Og(str3), e5);
                            }
                            if (j0Var2 != null) {
                                Iterator it = j0Var2.W1().iterator();
                                while (it.hasNext()) {
                                    if (((o0) it.next()).t().equals(str2)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            y1a1 y1a1Var6 = gVar.y;
                            g.g(y1a1Var6);
                            y1a1Var6.z.b(y1a1.Og(str3), "Raw event metadata record is missing. appId");
                        }
                        query.close();
                        if (j0Var2 != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                n nVar2 = bVar.c;
                f3a1 f3a1Var3 = nVar2.z;
                n.O(f3a1Var3);
                e0 e0Var2 = e791Var2.d;
                Bundle bundle32 = new Bundle();
                for (g0 g0Var : e0Var2.r()) {
                    if (g0Var.z()) {
                        e791Var = e791Var2;
                        bundle32.putDouble(g0Var.s(), g0Var.A());
                    } else {
                        e791Var = e791Var2;
                        if (g0Var.x()) {
                            bundle32.putFloat(g0Var.s(), g0Var.y());
                        } else if (g0Var.v()) {
                            bundle32.putLong(g0Var.s(), g0Var.w());
                        } else if (g0Var.t()) {
                            bundle32.putString(g0Var.s(), g0Var.u());
                        } else if (g0Var.B().isEmpty()) {
                            y1a1 y1a1Var7 = ((g) f3a1Var3.b).y;
                            g.g(y1a1Var7);
                            y1a1Var7.z.b(g0Var, "Unexpected parameter type for parameter");
                        } else {
                            bundle32.putParcelableArray(g0Var.s(), f3a1.vh((z0b1) g0Var.B()));
                        }
                    }
                    e791Var2 = e791Var;
                }
                e791 e791Var32 = e791Var2;
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                u = e0Var2.u();
                if (string == null) {
                    string = "";
                }
                ieb1 ieb1Var2 = gVar.B;
                y1a1 y1a1Var42 = gVar.y;
                g.e(ieb1Var2);
                if (u.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        String str7 = string;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        string = str7;
                    }
                }
                String str42 = string;
                ieb1Var2.Rg(bundle32, bundle2);
                s891 s891Var2 = new s891((g) obj, str42, str3, e0Var2.u(), e0Var2.w(), e0Var2.y(), bundle32);
                long j3 = e791Var32.a;
                long j22 = e791Var32.b;
                boolean z22 = e791Var32.c;
                Gg();
                Hg();
                String str52 = s891Var2.a;
                cvw.i(str52);
                f3a1 f3a1Var22 = nVar2.z;
                n.O(f3a1Var22);
                byte[] d2 = f3a1Var22.ih(s891Var2).d();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(CommonUrlParts.APP_ID, str52);
                contentValues2.put("name", s891Var2.b);
                contentValues2.put(ClidProvider.TIMESTAMP, Long.valueOf(s891Var2.d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j22));
                contentValues2.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, d2);
                contentValues2.put("realtime", Integer.valueOf(z22 ? 1 : 0));
                try {
                    update = vh().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
                    if (update != 1) {
                        g.g(y1a1Var42);
                        y1a1Var = y1a1Var42;
                        try {
                            y1a1Var.z.c("Failed to update raw event. appId, updatedRows", y1a1.Og(str52), Long.valueOf(update));
                        } catch (SQLiteException e6) {
                            e = e6;
                            g.g(y1a1Var);
                            y1a1Var.z.c("Error updating raw event. appId", y1a1.Og(str52), e);
                            bVar = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    y1a1Var = y1a1Var42;
                }
                bVar = this;
                str3 = str;
            }
            e = ndi0Var.e();
            bVar = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.measurement.internal.b, r8, sab1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wia1 Zg(String str) {
        Throwable th;
        SQLiteException e;
        g gVar = (g) this.b;
        cvw.l(str);
        Gg();
        Hg();
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        wia1 wia1Var = null;
        try {
            try {
                this = vh().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        wia1Var = wia1.c(this.getInt(1), this.getString(0));
                    } else {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.H.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.b(e, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = this;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        this.close();
        return wia1Var == null ? wia1.c : wia1Var;
    }

    public final void ah(String str, zzoh zzohVar) {
        Gg();
        Hg();
        cvw.i(str);
        g gVar = (g) this.b;
        kl40 kl40Var = gVar.D;
        y1a1 y1a1Var = gVar.y;
        kl40Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        gw91 gw91Var = nw91.v0;
        long longValue = currentTimeMillis - ((Long) gw91Var.a(null)).longValue();
        long j = zzohVar.zzb;
        if (j < longValue || j > ((Long) gw91Var.a(null)).longValue() + currentTimeMillis) {
            g.g(y1a1Var);
            y1a1Var.C.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", y1a1.Og(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        g.g(y1a1Var);
        y1a1Var.H.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.zza);
        contentValues.put("source", Integer.valueOf(zzohVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (vh().insert("trigger_uris", null, contentValues) == -1) {
                g.g(y1a1Var);
                y1a1Var.z.b(y1a1.Og(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            g.g(y1a1Var);
            y1a1Var.z.c("Error storing trigger URI. appId", y1a1.Og(str), e);
        }
    }

    public final void bh(String str, wia1 wia1Var) {
        cvw.l(str);
        cvw.l(wia1Var);
        Gg();
        Hg();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("consent_state", wia1Var.g());
        contentValues.put("consent_source", Integer.valueOf(wia1Var.b));
        dh(contentValues);
    }

    public final String ch(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = vh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.z.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void dh(ContentValues contentValues) {
        g gVar = (g) this.b;
        try {
            SQLiteDatabase vh = vh();
            if (contentValues.getAsString(CommonUrlParts.APP_ID) == null) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.B.b(y1a1.Og(CommonUrlParts.APP_ID), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (vh.update("consent_settings", contentValues, r5.toString(), new String[]{r4}) == 0 && vh.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.c("Failed to insert/update table (got -1). key", y1a1.Og("consent_settings"), y1a1.Og(CommonUrlParts.APP_ID));
            }
        } catch (SQLiteException e) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.z.d("Error storing into table. key", y1a1.Og("consent_settings"), y1a1.Og(CommonUrlParts.APP_ID), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w891 eh(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        g gVar = (g) this.b;
        cvw.i(str2);
        cvw.i(str3);
        Gg();
        Hg();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursor = vh().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.d("Error querying events. appId", y1a1.Og(str2), gVar.C.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        long j3 = cursor.getLong(2);
        long j4 = 0;
        long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        if (!cursor.isNull(8)) {
            j4 = cursor.getLong(8);
        }
        w891 w891Var = new w891(str2, str3, j, j2, j4, j3, j5, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(y1a1.Og(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return w891Var;
    }

    public final void fh(String str, w891 w891Var) {
        g gVar = (g) this.b;
        cvw.l(w891Var);
        Gg();
        Hg();
        ContentValues contentValues = new ContentValues();
        String str2 = w891Var.a;
        contentValues.put(CommonUrlParts.APP_ID, str2);
        contentValues.put("name", w891Var.b);
        contentValues.put("lifetime_count", Long.valueOf(w891Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(w891Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(w891Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(w891Var.g));
        contentValues.put("last_bundled_day", w891Var.h);
        contentValues.put("last_sampled_complex_event_id", w891Var.i);
        contentValues.put("last_sampling_rate", w891Var.j);
        contentValues.put("current_session_count", Long.valueOf(w891Var.e));
        Boolean bool = w891Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (vh().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.z.b(y1a1.Og(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.c("Error storing event aggregates. appId", y1a1.Og(str2), e);
        }
    }

    public final void gh(String str, String str2) {
        cvw.i(str2);
        Gg();
        Hg();
        try {
            vh().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.z.c("Error deleting snapshot. appId", y1a1.Og(str2), e);
        }
    }

    public final jdb1 hh(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        g gVar = (g) this.b;
        if (TextUtils.isEmpty(str2)) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.G.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            baa1 baa1Var = (baa1) f3a1.th(i0.y(), bArr);
            zzls b = zzls.b(i);
            if (b != zzls.GOOGLE_SIGNAL && b != zzls.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((i0) baa1Var.b).r()).iterator();
                while (it.hasNext()) {
                    zaa1 zaa1Var = (zaa1) ((j0) it.next()).k();
                    zaa1Var.d();
                    ((j0) zaa1Var.b).V0(i2);
                    arrayList.add((j0) zaa1Var.f());
                }
                baa1Var.d();
                ((i0) baa1Var.b).D();
                baa1Var.d();
                ((i0) baa1Var.b).C(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split(Constants.LINE_SEPARATOR);
                int length = split.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    String str4 = split[i3];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        y1a1 y1a1Var2 = gVar.y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i3++;
                }
            }
            fdb1 fdb1Var = new fdb1();
            fdb1Var.b(j);
            fdb1Var.c((i0) baa1Var.f());
            fdb1Var.d(str2);
            fdb1Var.e(hashMap);
            fdb1Var.f(b);
            fdb1Var.g(j2);
            fdb1Var.h(j3);
            fdb1Var.i(j4);
            fdb1Var.j(i2);
            return fdb1Var.a();
        } catch (IOException e) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.z.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String ih() {
        ((g) this.b).D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int a = zzlsVar.a();
        Long l = (Long) nw91.S.a(null);
        l.getClass();
        String str = "(upload_type = " + a + " AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + Extension.C_BRAKE;
        int a2 = zzlsVar.a();
        long longValue = ((Long) nw91.R.a(null)).longValue();
        StringBuilder sb = new StringBuilder("(upload_type != ");
        sb.append(a2);
        sb.append(" AND ABS(creation_timestamp - ");
        sb.append(currentTimeMillis);
        String l2 = g8e.l(longValue, ") > ", Extension.C_BRAKE, sb);
        StringBuilder sb2 = new StringBuilder(x4e.D(str.length(), 5, l2.length(), 1));
        g8e.D(sb2, Extension.O_BRAKE, str, " OR ", l2);
        sb2.append(Extension.C_BRAKE);
        return sb2.toString();
    }

    public final void kh(String str, wia1 wia1Var) {
        cvw.l(str);
        Gg();
        Hg();
        bh(str, Zg(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", wia1Var.g());
        dh(contentValues);
    }

    public final wia1 lh(String str) {
        cvw.l(str);
        Gg();
        Hg();
        return wia1.c(100, ch("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final w891 mh(String str, e0 e0Var, String str2) {
        w891 eh = eh("events", str, e0Var.u());
        if (eh != null) {
            long j = eh.e + 1;
            long j2 = eh.d + 1;
            return new w891(eh.a, eh.b, eh.c + 1, j2, j, eh.f, eh.g, eh.h, eh.i, eh.j, eh.k);
        }
        g gVar = (g) this.b;
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.C.c("Event aggregate wasn't created during raw event logging. appId, event", y1a1.Og(str), gVar.C.a(str2));
        return new w891(str, e0Var.u(), 1L, 1L, 1L, e0Var.w(), 0L, null, null, null, null);
    }

    public final boolean nh() {
        return ((g) this.b).a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oh(String str, long j, long j2, jcp jcpVar) {
        String str2;
        String str3;
        Cursor cursor;
        SQLiteDatabase vh;
        ?? isEmpty;
        String[] strArr;
        String str4;
        String string;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str5;
        long j3;
        g gVar = (g) this.b;
        Gg();
        Hg();
        Cursor cursor2 = null;
        cursor2 = null;
        CursorUtil$wrapMappedColumns$2 cursorUtil$wrapMappedColumns$2 = 0;
        try {
            try {
                vh = vh();
                isEmpty = TextUtils.isEmpty(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
            str2 = str;
        }
        try {
            if (isEmpty != 0) {
                String[] strArr5 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                str4 = j2 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb = new StringBuilder(str4.length() + 148);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str4);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = vh.rawQuery(sb.toString(), strArr5);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor == null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                str3 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor2 = cursor;
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.c("Data loss. Error selecting raw event. appId", y1a1.Og(str3), e);
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
            } else {
                try {
                    if (j2 != -1) {
                        String str6 = str;
                        strArr = new String[]{str6, String.valueOf(j2)};
                        isEmpty = str6;
                    } else {
                        String str7 = str;
                        strArr = new String[]{str7};
                        isEmpty = str7;
                    }
                    str4 = j2 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str4);
                    sb2.append(" order by rowid limit 1;");
                    cursor = vh.rawQuery(sb2.toString(), strArr);
                } catch (SQLiteException e4) {
                    e = e4;
                    str2 = isEmpty;
                }
                try {
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor2 = cursor;
                    str2 = isEmpty;
                    str3 = str2;
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.c("Data loss. Error selecting raw event. appId", y1a1.Og(str3), e);
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str3 = isEmpty;
                } else if (cursor == null) {
                }
            }
            cursor = vh.query("raw_events_metadata", new String[]{kju0.j}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    j0 j0Var = (j0) ((zaa1) f3a1.th(j0.W(), cursor.getBlob(0))).f();
                    if (cursor.moveToNext()) {
                        y1a1 y1a1Var3 = gVar.y;
                        g.g(y1a1Var3);
                        y1a1Var3.C.b(y1a1.Og(str3), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    jcpVar.b = j0Var;
                    if (gVar.w.Qg(null, nw91.k1)) {
                        long rh = rh(-1L, "select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str3, string});
                        if (j2 != -1) {
                            j3 = j2;
                        } else if (rh != -1) {
                            j3 = -1;
                        } else {
                            strArr2 = new String[]{str3, string};
                            strArr4 = strArr2;
                            str5 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        if (j3 != -1 && rh != -1) {
                            rh = Math.min(j3, rh);
                        } else if (j3 != -1) {
                            rh = j3;
                        }
                        strArr3 = new String[]{str3, string, String.valueOf(rh)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else if (j2 != -1) {
                        strArr3 = new String[]{str3, string, String.valueOf(j2)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else {
                        strArr2 = new String[]{str3, string};
                        strArr4 = strArr2;
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                    }
                    cursor2 = vh.query("raw_events", new String[]{"rowid", "name", ClidProvider.TIMESTAMP, io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA}, str5, strArr4, null, null, "rowid", null);
                    try {
                        if (cursor2.moveToFirst()) {
                            do {
                                long j4 = cursor2.getLong(0);
                                try {
                                    y7a1 y7a1Var = (y7a1) f3a1.th(e0.B(), cursor2.getBlob(3));
                                    String string2 = cursor2.getString(1);
                                    y7a1Var.d();
                                    ((e0) y7a1Var.b).H(string2);
                                    long j5 = cursor2.getLong(2);
                                    y7a1Var.d();
                                    ((e0) y7a1Var.b).I(j5);
                                    if (!jcpVar.d(j4, (e0) y7a1Var.f())) {
                                        break;
                                    }
                                } catch (IOException e6) {
                                    y1a1 y1a1Var4 = gVar.y;
                                    g.g(y1a1Var4);
                                    y1a1Var4.z.c("Data loss. Failed to merge raw event. appId", y1a1.Og(str3), e6);
                                }
                            } while (cursor2.moveToNext());
                        } else {
                            y1a1 y1a1Var5 = gVar.y;
                            g.g(y1a1Var5);
                            y1a1Var5.C.b(y1a1.Og(str3), "Raw event data disappeared while in transaction. appId");
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        y1a1 y1a1Var22 = gVar.y;
                        g.g(y1a1Var22);
                        y1a1Var22.z.c("Data loss. Error selecting raw event. appId", y1a1.Og(str3), e);
                        cursor = cursor2;
                        if (cursor == null) {
                        }
                    }
                    cursor = cursor2;
                } catch (IOException e8) {
                    y1a1 y1a1Var6 = gVar.y;
                    g.g(y1a1Var6);
                    y1a1Var6.z.c("Data loss. Failed to merge raw event metadata. appId", y1a1.Og(str3), e8);
                }
            } else {
                y1a1 y1a1Var7 = gVar.y;
                g.g(y1a1Var7);
                y1a1Var7.z.b(y1a1.Og(str3), "Raw event metadata record is missing. appId");
            }
            if (cursor == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            cursorUtil$wrapMappedColumns$2 = " order by rowid limit 1;";
            if (cursorUtil$wrapMappedColumns$2 != 0) {
                cursorUtil$wrapMappedColumns$2.close();
            }
            throw th;
        }
    }

    public final long qh(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = vh().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.z.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long rh(long j, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = vh().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.z.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void sh() {
        Hg();
        vh().beginTransaction();
    }

    public final void th() {
        Hg();
        vh().setTransactionSuccessful();
    }

    public final void uh() {
        Hg();
        vh().endTransaction();
    }

    public final SQLiteDatabase vh() {
        Gg();
        try {
            return this.x.getWritableDatabase();
        } catch (SQLiteException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error opening database");
            throw e;
        }
    }

    public final void wh(String str) {
        w891 eh;
        gh("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = vh().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (eh = eh("events", str, string)) != null) {
                            fh("events_snapshot", eh);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.z.c("Error creating snapshot. appId", y1a1.Og(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        fh("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xh(String str) {
        boolean z2;
        w891 eh;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        w891 eh2 = eh("events", str, "_f");
        w891 eh3 = eh("events", str, "_v");
        gh("events", str);
        Cursor cursor = null;
        boolean z3 = false;
        try {
            cursor = vh().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            z2 = false;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (eh2 == null) {
            }
            fh("events", eh2);
            gh("events_snapshot", str);
        }
        boolean z4 = false;
        z2 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z4 = true;
                    } else if ("_v".equals(string)) {
                        z2 = true;
                    }
                }
                if (string != null && (eh = eh("events_snapshot", str, string)) != null) {
                    fh("events", eh);
                }
            } catch (SQLiteException e2) {
                e = e2;
                z3 = z4;
                try {
                    y1a1 y1a1Var = ((g) this.b).y;
                    g.g(y1a1Var);
                    y1a1Var.z.c("Error querying snapshot. appId", y1a1.Og(str), e);
                    z4 = z3;
                    if (cursor != null) {
                    }
                    if (!z4) {
                    }
                    if (!z2) {
                    }
                    gh("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z3 && eh2 != null) {
                        fh("events", eh2);
                    } else if (!z2 && eh3 != null) {
                        fh("events", eh3);
                    }
                    gh("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = z4;
                if (cursor != null) {
                }
                if (z3) {
                }
                if (!z2) {
                    fh("events", eh3);
                }
                gh("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z4 || eh2 == null) {
            if (!z2) {
            }
            gh("events_snapshot", str);
        }
        fh("events", eh2);
        gh("events_snapshot", str);
    }

    public final void yh(String str, String str2) {
        cvw.i(str);
        cvw.i(str2);
        Gg();
        Hg();
        try {
            vh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            g gVar = (g) this.b;
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.d("Error deleting user property. appId", y1a1.Og(str), gVar.C.c(str2), e);
        }
    }

    public final boolean zh(zdb1 zdb1Var) {
        g gVar = (g) this.b;
        String str = zdb1Var.b;
        Gg();
        Hg();
        String str2 = zdb1Var.a;
        String str3 = zdb1Var.c;
        if (Ah(str2, str3) == null) {
            if (ieb1.Dh(str3)) {
                if (qh("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(gVar.w.Og(str2, nw91.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long qh = qh("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                gVar.getClass();
                if (qh >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(zdb1Var.d));
        ph(contentValues, zdb1Var.e);
        try {
            if (vh().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.b(y1a1.Og(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.c("Error storing user property. appId", y1a1.Og(str2), e);
            return true;
        }
    }
}
