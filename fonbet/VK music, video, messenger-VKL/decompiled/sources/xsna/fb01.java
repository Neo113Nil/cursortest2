package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzeh;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzkp;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class fb01 extends kj01 implements bwz0 {
    public final zk3 g;

    @VisibleForTesting
    public final zk3 h;

    @VisibleForTesting
    public final zk3 i;

    @VisibleForTesting
    public final zk3 j;
    public final zk3 k;
    public final zk3 l;

    @VisibleForTesting
    public final eb01 m;
    public final pm01 n;
    public final zk3 o;
    public final zk3 p;
    public final zk3 q;

    public fb01(qj01 qj01Var) {
        super(qj01Var);
        this.g = new zk3();
        this.h = new zk3();
        this.i = new zk3();
        this.j = new zk3();
        this.k = new zk3();
        this.o = new zk3();
        this.p = new zk3();
        this.q = new zk3();
        this.l = new zk3();
        this.m = new eb01(this);
        this.n = new pm01(this);
    }

    public static final zk3 s(zzff zzffVar) {
        zk3 zk3Var = new zk3();
        if (zzffVar != null) {
            for (zzfj zzfjVar : zzffVar.zzn()) {
                zk3Var.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return zk3Var;
    }

    @Override // xsna.bwz0
    public final String b(String str, String str2) {
        k();
        q(str);
        Map map = (Map) this.g.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final zzff o(String str, byte[] bArr) {
        mb01 mb01Var = (mb01) this.b;
        if (bArr == null) {
            return zzff.zzg();
        }
        try {
            zzff zzffVar = (zzff) ((zzfe) sj01.D(zzff.zze(), bArr)).zzaC();
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.c("Parsed config. version, gmp_app_id", zzffVar.zzs() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzr() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (zzkp e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.l.c("Unable to merge remote config. appId", k901.r(str), e);
            return zzff.zzg();
        } catch (RuntimeException e2) {
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            k901Var3.l.c("Unable to merge remote config. appId", k901.r(str), e2);
            return zzff.zzg();
        }
    }

    public final void p(String str, zzfe zzfeVar) {
        mb01 mb01Var = (mb01) this.b;
        HashSet hashSet = new HashSet();
        zk3 zk3Var = new zk3();
        zk3 zk3Var2 = new zk3();
        zk3 zk3Var3 = new zk3();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzfb) it.next()).zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            zzfc zzfcVar = (zzfc) zzfeVar.zzb(i).zzby();
            if (zzfcVar.zzc().isEmpty()) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.l.a("EventConfig contained null event name");
            } else {
                String zzc = zzfcVar.zzc();
                String c = bbq.c(zzfcVar.zzc(), yiz.e, yiz.g);
                if (!TextUtils.isEmpty(c)) {
                    zzfcVar.zzb(c);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    zk3Var.put(zzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    zk3Var2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        k901 k901Var2 = mb01Var.j;
                        mb01.k(k901Var2);
                        k901Var2.l.c("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        zk3Var3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.h.put(str, hashSet);
        this.i.put(str, zk3Var);
        this.j.put(str, zk3Var2);
        this.l.put(str, zk3Var3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(String str) {
        Throwable th;
        Cursor cursor;
        a9o0 a9o0Var;
        l();
        k();
        exc0.f(str);
        zk3 zk3Var = this.k;
        if (zk3Var.get(str) != 0) {
            return;
        }
        ayz0 ayz0Var = this.e.d;
        qj01.I(ayz0Var);
        mb01 mb01Var = (mb01) ayz0Var.b;
        exc0.f(str);
        ayz0Var.k();
        ayz0Var.l();
        Cursor cursor2 = null;
        try {
            cursor = ayz0Var.C().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.c("Error querying remote config. appId", k901.r(str), e);
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
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            byte[] blob = cursor.getBlob(0);
            String string = cursor.getString(1);
            String string2 = mb01Var.h.t(null, s701.k0) ? cursor.getString(2) : null;
            if (cursor.moveToNext()) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b(k901.r(str), "Got multiple records for app config, expected one. appId");
            }
            if (blob != null) {
                a9o0Var = new a9o0(blob, string, string2);
                cursor.close();
                zk3 zk3Var2 = this.q;
                zk3 zk3Var3 = this.p;
                zk3 zk3Var4 = this.o;
                zk3 zk3Var5 = this.g;
                if (a9o0Var == null) {
                    zzfe zzfeVar = (zzfe) o(str, (byte[]) a9o0Var.a).zzby();
                    p(str, zzfeVar);
                    zk3Var5.put(str, s((zzff) zzfeVar.zzaC()));
                    zk3Var.put(str, (zzff) zzfeVar.zzaC());
                    r(str, (zzff) zzfeVar.zzaC());
                    zk3Var4.put(str, zzfeVar.zze());
                    zk3Var3.put(str, (String) a9o0Var.b);
                    zk3Var2.put(str, (String) a9o0Var.c);
                    return;
                }
                zk3Var5.put(str, null);
                this.i.put(str, null);
                this.h.put(str, null);
                this.j.put(str, null);
                zk3Var.put(str, null);
                zk3Var4.put(str, null);
                zk3Var3.put(str, null);
                zk3Var2.put(str, null);
                this.l.put(str, null);
                return;
            }
        }
        cursor.close();
        a9o0Var = null;
        zk3 zk3Var22 = this.q;
        zk3 zk3Var32 = this.p;
        zk3 zk3Var42 = this.o;
        zk3 zk3Var52 = this.g;
        if (a9o0Var == null) {
        }
    }

    public final void r(final String str, zzff zzffVar) {
        mb01 mb01Var = (mb01) this.b;
        int zza = zzffVar.zza();
        eb01 eb01Var = this.m;
        if (zza == 0) {
            eb01Var.remove(str);
            return;
        }
        k901 k901Var = mb01Var.j;
        k901 k901Var2 = mb01Var.j;
        mb01.k(k901Var);
        k901Var.q.b(Integer.valueOf(zzffVar.zza()), "EES programs found");
        zzgt zzgtVar = (zzgt) zzffVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: xsna.bb01
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new l36(fb01.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: xsna.cb01
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final fb01 fb01Var = fb01.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: xsna.ab01
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            fb01 fb01Var2 = fb01.this;
                            ayz0 ayz0Var = fb01Var2.e.d;
                            qj01.I(ayz0Var);
                            String str3 = str2;
                            qd01 D = ayz0Var.D(str3);
                            HashMap a = hq.a("platform", "android", "package_name", str3);
                            ((mb01) fb01Var2.b).h.p();
                            a.put("gmp_version", 74029L);
                            if (D != null) {
                                String H = D.H();
                                if (H != null) {
                                    a.put(CallAnalyticsApiRequest.KEY_APP_VERSION, H);
                                }
                                a.put("app_version_int", Long.valueOf(D.B()));
                                a.put("dynamite_version", Long.valueOf(D.C()));
                            }
                            return a;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: xsna.db01
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(fb01.this.n);
                }
            });
            zzcVar.zzc(zzgtVar);
            eb01Var.put(str, zzcVar);
            mb01.k(k901Var2);
            k901Var2.q.c("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
            for (zzgr zzgrVar : zzgtVar.zza().zzd()) {
                mb01.k(k901Var2);
                k901Var2.q.b(zzgrVar.zzb(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            mb01.k(k901Var2);
            k901Var2.i.b(str, "Failed to load EES program. appId");
        }
    }

    public final int t(String str, String str2) {
        Integer num;
        k();
        q(str);
        Map map = (Map) this.l.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzff u(String str) {
        l();
        k();
        exc0.f(str);
        q(str);
        return (zzff) this.k.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String v(String str) {
        k();
        q(str);
        return (String) this.o.get(str);
    }

    public final boolean w(String str) {
        k();
        zzff u = u(str);
        if (u == null) {
            return false;
        }
        return u.zzq();
    }

    public final boolean x(String str, String str2) {
        Boolean bool;
        k();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.j.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean y(String str, String str2) {
        Boolean bool;
        k();
        q(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && sk01.T(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && sk01.U(str2)) {
            return true;
        }
        Map map = (Map) this.i.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0312, code lost:
    
        r1 = r14.j;
        xsna.mb01.k(r1);
        r1.i.c("Error storing event filter. appId", xsna.k901.r(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03fc, code lost:
    
        r9.l();
        r9.k();
        xsna.exc0.f(r29);
        r0 = r9.C();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x041f, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02c6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026c, code lost:
    
        r0 = r14.j;
        xsna.mb01.k(r0);
        r0 = r0.l;
        r4 = xsna.k901.r(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0281, code lost:
    
        if (r7.zzp() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0283, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0293, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0291, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x059d, code lost:
    
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x05a0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0324, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0334, code lost:
    
        if (r3.hasNext() == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0336, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzet) r3.next();
        r9.l();
        r9.k();
        xsna.exc0.f(r29);
        xsna.exc0.i(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0350, code lost:
    
        if (r5.zze().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037c, code lost:
    
        r6 = r5.zzbu();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0395, code lost:
    
        if (r5.zzj() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0397, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03a1, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03b3, code lost:
    
        if (r5.zzk() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03b5, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03bf, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03d1, code lost:
    
        if (r9.C().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03e6, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03d3, code lost:
    
        r0 = r14.j;
        xsna.mb01.k(r0);
        r0.i.b(xsna.k901.r(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03ec, code lost:
    
        r1 = r14.j;
        xsna.mb01.k(r1);
        r1.i.c("Error storing property filter. appId", xsna.k901.r(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03be, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03a0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0352, code lost:
    
        r0 = r14.j;
        xsna.mb01.k(r0);
        r0 = r0.l;
        r3 = xsna.k901.r(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0367, code lost:
    
        if (r5.zzj() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0369, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0373, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0372, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0202, code lost:
    
        r6 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020e, code lost:
    
        if (r6.hasNext() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021a, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r6.next()).zzj() != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021c, code lost:
    
        r0 = r14.j;
        xsna.mb01.k(r0);
        r0.l.c("Property filter with no ID. Audience definition ignored. appId, audienceId", xsna.k901.r(r29), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0232, code lost:
    
        r6 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x023e, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024e, code lost:
    
        if (r6.hasNext() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0250, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzek) r6.next();
        r9.l();
        r9.k();
        xsna.exc0.f(r29);
        xsna.exc0.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026a, code lost:
    
        if (r7.zzg().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a0, code lost:
    
        r25 = r3;
        r3 = r7.zzbu();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put("app_id", r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02bb, code lost:
    
        if (r7.zzp() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02bd, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c7, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d7, code lost:
    
        if (r7.zzq() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d9, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02e3, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f5, code lost:
    
        if (r9.C().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f7, code lost:
    
        r0 = r14.j;
        xsna.mb01.k(r0);
        r0.i.b(xsna.k901.r(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0307, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0311, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        byte[] bArr2;
        zzfe zzfeVar;
        zk3 zk3Var;
        boolean z;
        l();
        k();
        exc0.f(str);
        zzfe zzfeVar2 = (zzfe) o(str, bArr).zzby();
        p(str, zzfeVar2);
        r(str, (zzff) zzfeVar2.zzaC());
        zzff zzffVar = (zzff) zzfeVar2.zzaC();
        zk3 zk3Var2 = this.k;
        zk3Var2.put(str, zzffVar);
        this.o.put(str, zzfeVar2.zze());
        this.p.put(str, str2);
        this.q.put(str, str3);
        this.g.put(str, s((zzff) zzfeVar2.zzaC()));
        qj01 qj01Var = this.e;
        ayz0 ayz0Var = qj01Var.d;
        qj01.I(ayz0Var);
        ArrayList arrayList = new ArrayList(zzfeVar2.zzf());
        mb01 mb01Var = (mb01) ayz0Var.b;
        int i = 0;
        while (i < arrayList.size()) {
            zzeh zzehVar = (zzeh) ((zzei) arrayList.get(i)).zzby();
            if (zzehVar.zza() != 0) {
                zzfeVar = zzfeVar2;
                zk3Var = zk3Var2;
                int i2 = 0;
                while (i2 < zzehVar.zza()) {
                    zzej zzejVar = (zzej) zzehVar.zze(i2).zzby();
                    zzej zzejVar2 = (zzej) zzejVar.clone();
                    qj01 qj01Var2 = qj01Var;
                    String c = bbq.c(zzejVar.zze(), yiz.e, yiz.g);
                    if (c != null) {
                        zzejVar2.zzb(c);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        zzem zzd = zzejVar.zzd(i3);
                        boolean z2 = z;
                        zzej zzejVar3 = zzejVar;
                        String c2 = bbq.c(zzd.zze(), atv0.f, atv0.g);
                        if (c2 != null) {
                            zzel zzelVar = (zzel) zzd.zzby();
                            zzelVar.zza(c2);
                            zzejVar2.zzc(i3, (zzem) zzelVar.zzaC());
                            z = true;
                        } else {
                            z = z2;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                    }
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        arrayList.set(i, (zzei) zzehVar.zzaC());
                    }
                    i2++;
                    qj01Var = qj01Var2;
                }
            } else {
                zzfeVar = zzfeVar2;
                zk3Var = zk3Var2;
            }
            qj01 qj01Var3 = qj01Var;
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    zzet zzf = zzehVar.zzf(i4);
                    String c3 = bbq.c(zzf.zze(), fd01.a, fd01.b);
                    if (c3 != null) {
                        zzes zzesVar = (zzes) zzf.zzby();
                        zzesVar.zza(c3);
                        zzehVar.zzd(i4, zzesVar);
                        arrayList.set(i, (zzei) zzehVar.zzaC());
                    }
                }
            }
            i++;
            zzfeVar2 = zzfeVar;
            zk3Var2 = zk3Var;
            qj01Var = qj01Var3;
        }
        zzfe zzfeVar3 = zzfeVar2;
        zk3 zk3Var3 = zk3Var2;
        qj01 qj01Var4 = qj01Var;
        ayz0Var.l();
        ayz0Var.k();
        exc0.f(str);
        SQLiteDatabase C = ayz0Var.C();
        C.beginTransaction();
        try {
            ayz0Var.l();
            ayz0Var.k();
            exc0.f(str);
            SQLiteDatabase C2 = ayz0Var.C();
            C2.delete("property_filters", "app_id=?", new String[]{str});
            C2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzei zzeiVar = (zzei) it.next();
                ayz0Var.l();
                ayz0Var.k();
                exc0.f(str);
                exc0.i(zzeiVar);
                if (zzeiVar.zzk()) {
                    int zza = zzeiVar.zza();
                    Iterator it2 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!((zzek) it2.next()).zzp()) {
                            k901 k901Var = mb01Var.j;
                            mb01.k(k901Var);
                            k901Var.l.c("Event filter with no ID. Audience definition ignored. appId, audienceId", k901.r(str), Integer.valueOf(zza));
                            break;
                        }
                    }
                } else {
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.l.b(k901.r(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = C;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                zzei zzeiVar2 = (zzei) it3.next();
                arrayList2.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            exc0.f(str);
            ayz0Var.l();
            ayz0Var.k();
            SQLiteDatabase C3 = ayz0Var.C();
            try {
                long x = ayz0Var.x("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, mb01Var.h.o(str, s701.F)));
                if (x > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String join = TextUtils.join(StringUtils.COMMA, arrayList3);
                            StringBuilder sb = new StringBuilder();
                            sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb.append("(" + join + ")");
                            sb.append(" order by rowid desc limit -1 offset ?)");
                            C3.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                k901 k901Var3 = mb01Var.j;
                mb01.k(k901Var3);
                k901Var3.i.c("Database error querying filters. appId", k901.r(str), e);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zzfeVar3.zzc();
                bArr2 = ((zzff) zzfeVar3.zzaC()).zzbu();
            } catch (RuntimeException e2) {
                k901 k901Var4 = ((mb01) this.b).j;
                mb01.k(k901Var4);
                k901Var4.l.c("Unable to serialize reduced-size config. Storing full config instead. appId", k901.r(str), e2);
                bArr2 = bArr;
            }
            ayz0 ayz0Var2 = qj01Var4.d;
            qj01.I(ayz0Var2);
            mb01 mb01Var2 = (mb01) ayz0Var2.b;
            exc0.f(str);
            ayz0Var2.k();
            ayz0Var2.l();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            kwz0 kwz0Var = mb01Var2.h;
            k901 k901Var5 = mb01Var2.j;
            if (kwz0Var.t(null, s701.k0)) {
                contentValues.put("e_tag", str3);
            }
            try {
                if (ayz0Var2.C().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    mb01.k(k901Var5);
                    k901Var5.i.b(k901.r(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e3) {
                mb01.k(k901Var5);
                k901Var5.i.c("Error storing remote config. appId", k901.r(str), e3);
            }
            zk3Var3.put(str, (zzff) zzfeVar3.zzaC());
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = C;
        }
    }

    @Override // xsna.kj01
    public final void n() {
    }
}
