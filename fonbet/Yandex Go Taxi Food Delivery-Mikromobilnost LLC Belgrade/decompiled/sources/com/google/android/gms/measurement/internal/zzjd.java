package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.measurement.internal.zzjd;
import defpackage.baa1;
import defpackage.bb1;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.do91;
import defpackage.efa1;
import defpackage.f3a1;
import defpackage.fwt;
import defpackage.h491;
import defpackage.hhe0;
import defpackage.hxj;
import defpackage.i0a1;
import defpackage.ieb1;
import defpackage.jdb1;
import defpackage.ju61;
import defpackage.kl40;
import defpackage.kz;
import defpackage.l1a1;
import defpackage.lda1;
import defpackage.na3;
import defpackage.nw91;
import defpackage.ny61;
import defpackage.obb1;
import defpackage.oca1;
import defpackage.p8a1;
import defpackage.pcb1;
import defpackage.rba1;
import defpackage.s891;
import defpackage.udq0;
import defpackage.vda1;
import defpackage.vz;
import defpackage.w1l;
import defpackage.wba1;
import defpackage.y1a1;
import defpackage.y391;
import defpackage.yb91;
import defpackage.zaa1;
import defpackage.zdb1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzjd extends zzga {
    private final n zza;
    private Boolean zzb;
    private String zzc;

    public zzjd(n nVar, String str) {
        cvw.l(nVar);
        this.zza = nVar;
        this.zzc = null;
    }

    private final void zzM(zzbg zzbgVar, zzr zzrVar) {
        n nVar = this.zza;
        nVar.w();
        nVar.e(zzbgVar, zzrVar);
    }

    private final void zzN(zzr zzrVar, boolean z) {
        cvw.l(zzrVar);
        String str = zzrVar.zza;
        cvw.i(str);
        zzO(str, false);
        this.zza.e0().Kg(zzrVar.zzb);
    }

    private final void zzO(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.zza.B0().z.a("Measurement Service called without app package");
            ny61.z("Measurement Service called without app package");
            return;
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        n nVar = this.zza;
                        if (!bb1.x(Binder.getCallingUid(), nVar.E.a) && !com.google.android.gms.common.c.a(nVar.E.a).c(Binder.getCallingUid())) {
                            z2 = false;
                        }
                    }
                    this.zzb = Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.zza.B0().z.b(y1a1.Og(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.zzc == null) {
            Context context = this.zza.E.a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = fwt.a;
            if (bb1.Q(context, callingUid, str)) {
                this.zzc = str;
            }
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzA(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new rba1(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzB(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        cvw.l(str);
        this.zza.M1().Pg(new kz(this, str, zzooVar, zzghVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzC(zzr zzrVar, zzaf zzafVar) {
        zzN(zzrVar, false);
        zzd(new ju61(11, this, zzrVar, zzafVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzD(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        cvw.l(str);
        this.zza.M1().Pg(new vz(this, zzrVar, bundle, zzgeVar, str, 5));
    }

    public final void zzE(Runnable runnable) {
        cvw.l(runnable);
        n nVar = this.zza;
        if (nVar.M1().Mg()) {
            runnable.run();
        } else {
            nVar.M1().Rg(runnable);
        }
    }

    public final /* synthetic */ void zzF(zzr zzrVar) {
        n nVar = this.zza;
        nVar.w();
        nVar.g0(zzrVar);
    }

    public final /* synthetic */ void zzG(zzr zzrVar) {
        n nVar = this.zza;
        nVar.w();
        nVar.h0(zzrVar);
    }

    public final void zzH(zzr zzrVar, Bundle bundle, zzge zzgeVar, String str) {
        n nVar = this.zza;
        nVar.w();
        try {
            zzgeVar.zze(nVar.X(zzrVar, bundle));
        } catch (RemoteException e) {
            this.zza.B0().z.c("Failed to return trigger URIs for app", str, e);
        }
    }

    public final void zzI(String str, zzoo zzooVar, zzgh zzghVar) {
        n nVar = this.zza;
        nVar.w();
        nVar.M1().Gg();
        nVar.f0();
        b bVar = nVar.c;
        n.O(bVar);
        List<jdb1> Lg = bVar.Lg(str, zzooVar, ((Integer) nw91.B.a(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (jdb1 jdb1Var : Lg) {
            if (nVar.n(str, jdb1Var.e())) {
                int i = jdb1Var.i();
                if (i > 0) {
                    if (i <= ((Integer) nw91.z.a(null)).intValue()) {
                        long min = Math.min(((Long) nw91.x.a(null)).longValue() * (1 << (i - 1)), ((Long) nw91.y.a(null)).longValue());
                        ((kl40) nVar.q4()).getClass();
                        if (System.currentTimeMillis() >= jdb1Var.h() + min) {
                        }
                    }
                    nVar.B0().H.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(jdb1Var.c()), Long.valueOf(jdb1Var.h()));
                }
                zzom b = jdb1Var.b();
                try {
                    baa1 baa1Var = (baa1) f3a1.th(i0.y(), b.zzb);
                    for (int i2 = 0; i2 < ((i0) baa1Var.b).s(); i2++) {
                        zaa1 zaa1Var = (zaa1) ((i0) baa1Var.b).t(i2).k();
                        ((kl40) nVar.q4()).getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        zaa1Var.d();
                        ((j0) zaa1Var.b).h0(currentTimeMillis);
                        baa1Var.d();
                        ((i0) baa1Var.b).A(i2, (j0) zaa1Var.f());
                    }
                    b.zzb = ((i0) baa1Var.f()).d();
                    if (Log.isLoggable(nVar.B0().Qg(), 2)) {
                        f3a1 f3a1Var = nVar.z;
                        n.O(f3a1Var);
                        b.zzg = f3a1Var.jh((i0) baa1Var.f());
                    }
                    arrayList.add(b);
                } catch (zzmr unused) {
                    nVar.B0().C.b(str, "Failed to parse queued batch. appId");
                }
            } else {
                nVar.B0().H.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(jdb1Var.c()), jdb1Var.e());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            zzghVar.zze(zzoqVar);
            this.zza.B0().H.c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.zza.size()));
        } catch (RemoteException e) {
            this.zza.B0().z.c("[sgtm] Failed to return upload batches for app", str, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzJ(zzr zzrVar, zzaf zzafVar) {
        Cursor cursor;
        Cursor cursor2;
        n nVar = this.zza;
        nVar.w();
        String str = zzrVar.zza;
        cvw.l(str);
        HashMap hashMap = nVar.Z;
        nVar.M1().Gg();
        nVar.f0();
        b bVar = nVar.c;
        n.O(bVar);
        long j = zzafVar.zza;
        bVar.Gg();
        bVar.Hg();
        Cursor cursor3 = null;
        r20 = null;
        jdb1 jdb1Var = null;
        try {
            cursor = bVar.vh().query("upload_queue", new String[]{"rowId", CommonUrlParts.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j)}, null, null, null, "1");
            try {
            } catch (SQLiteException e) {
                e = e;
                cursor2 = cursor;
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            if (jdb1Var == null) {
                nVar.B0().C.c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j));
                return;
            }
            String e3 = jdb1Var.e();
            if (zzafVar.zzb != zzlr.SUCCESS.a()) {
                if (zzafVar.zzb == zzlr.BACKOFF.a()) {
                    pcb1 pcb1Var = (pcb1) hashMap.get(e3);
                    if (pcb1Var == null) {
                        pcb1Var = new pcb1(nVar);
                        hashMap.put(e3, pcb1Var);
                    } else {
                        pcb1Var.a();
                    }
                    ((kl40) nVar.q4()).getClass();
                    nVar.B0().H.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, e3, Long.valueOf((pcb1Var.c() - System.currentTimeMillis()) / 1000));
                }
                b bVar2 = nVar.c;
                n.O(bVar2);
                Long valueOf = Long.valueOf(zzafVar.zza);
                bVar2.Sg(valueOf);
                nVar.B0().H.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
                return;
            }
            if (hashMap.containsKey(e3)) {
                hashMap.remove(e3);
            }
            b bVar3 = nVar.c;
            n.O(bVar3);
            Long valueOf2 = Long.valueOf(j);
            bVar3.Ng(valueOf2);
            nVar.B0().H.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
            long j2 = zzafVar.zzc;
            if (j2 > 0) {
                b bVar4 = nVar.c;
                n.O(bVar4);
                g gVar = (g) bVar4.b;
                bVar4.Gg();
                bVar4.Hg();
                Long valueOf3 = Long.valueOf(j2);
                ContentValues contentValues = new ContentValues();
                contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.a()));
                kl40 kl40Var = gVar.D;
                y1a1 y1a1Var = gVar.y;
                kl40Var.getClass();
                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                try {
                    if (bVar4.vh().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.a())}) != 1) {
                        g.g(y1a1Var);
                        y1a1Var.C.c("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                    }
                    nVar.B0().H.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                    nVar.o(str);
                    return;
                } catch (SQLiteException e4) {
                    g.g(y1a1Var);
                    y1a1Var.z.d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j2), e4);
                    throw e4;
                }
            }
            return;
        }
        String string = cursor.getString(1);
        cvw.l(string);
        cursor2 = cursor;
        try {
            jdb1Var = bVar.hh(string, j, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
            cursor2.close();
        } catch (SQLiteException e5) {
            e = e5;
            cursor = cursor2;
            try {
                y1a1 y1a1Var2 = ((g) bVar.b).y;
                g.g(y1a1Var2);
                y1a1Var2.z.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j), e);
                if (cursor != null) {
                }
                if (jdb1Var == null) {
                }
            } catch (Throwable th3) {
                th = th3;
                cursor3 = cursor;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (jdb1Var == null) {
        }
    }

    public final void zzK(Bundle bundle, String str, zzr zzrVar) {
        n nVar = this.zza;
        boolean Qg = nVar.Y().Qg(null, nw91.V0);
        if (bundle.isEmpty() && Qg) {
            b bVar = this.zza.c;
            n.O(bVar);
            bVar.Gg();
            bVar.Hg();
            try {
                bVar.vh().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e) {
                y1a1 y1a1Var = ((g) bVar.b).y;
                g.g(y1a1Var);
                y1a1Var.z.b(e, "Error clearing default event params");
                return;
            }
        }
        b bVar2 = nVar.c;
        n.O(bVar2);
        g gVar = (g) bVar2.b;
        bVar2.Gg();
        bVar2.Hg();
        s891 s891Var = new s891((g) bVar2.b, "", str, "dep", 0L, 0L, bundle);
        f3a1 f3a1Var = bVar2.c.z;
        n.O(f3a1Var);
        byte[] d = f3a1Var.ih(s891Var).d();
        y1a1 y1a1Var2 = gVar.y;
        y1a1 y1a1Var3 = gVar.y;
        g.g(y1a1Var2);
        y1a1Var2.H.c("Saving default event parameters, appId, data size", str, Integer.valueOf(d.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("parameters", d);
        try {
            if (bVar2.vh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                g.g(y1a1Var3);
                y1a1Var3.z.b(y1a1.Og(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e2) {
            g.g(y1a1Var3);
            y1a1Var3.z.c("Error storing default event parameters. appId", y1a1.Og(str), e2);
        }
        n nVar2 = this.zza;
        b bVar3 = nVar2.c;
        n.O(bVar3);
        long j = zzrVar.zzD;
        try {
            if (bVar3.rh(0L, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j)}) > 0) {
                return;
            }
            if (bVar3.rh(0L, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j)}) > 0) {
                b bVar4 = nVar2.c;
                n.O(bVar4);
                bVar4.Yg(str, Long.valueOf(j), null, bundle);
            }
        } catch (SQLiteException e3) {
            y1a1 y1a1Var4 = ((g) bVar3.b).y;
            g.g(y1a1Var4);
            y1a1Var4.z.b(e3, "Error checking backfill conditions");
        }
    }

    public final /* synthetic */ n zzL() {
        return this.zza;
    }

    public final void zzb(zzbg zzbgVar, zzr zzrVar) {
        n nVar = this.zza;
        p8a1 p8a1Var = nVar.a;
        n.O(p8a1Var);
        String str = zzrVar.zza;
        yb91 yb91Var = TextUtils.isEmpty(str) ? null : (yb91) p8a1Var.D.c(str);
        if (yb91Var == null) {
            this.zza.B0().H.b(zzrVar.zza, "EES not loaded for");
            zzM(zzbgVar, zzrVar);
            return;
        }
        try {
            h491 h491Var = yb91Var.c;
            n.O(nVar.z);
            HashMap wh = f3a1.wh(true, zzbgVar.zzb.zzf());
            String str2 = zzbgVar.zza;
            String Z = udq0.Z(str2, cma1.e, cma1.c);
            if (Z != null) {
                str2 = Z;
            }
            if (yb91Var.a(new y391(str2, zzbgVar.zzd, wh))) {
                if (h491Var.c().equals(h491Var.a())) {
                    zzM(zzbgVar, zzrVar);
                } else {
                    n nVar2 = this.zza;
                    nVar2.B0().H.b(zzbgVar.zza, "EES edited event");
                    n.O(nVar2.z);
                    zzM(f3a1.Kg(h491Var.c()), zzrVar);
                }
                if (((ArrayList) h491Var.d()).isEmpty()) {
                    return;
                }
                Iterator it = ((ArrayList) h491Var.d()).iterator();
                while (it.hasNext()) {
                    y391 y391Var = (y391) it.next();
                    n nVar3 = this.zza;
                    nVar3.B0().H.b(y391Var.b(), "EES logging created event");
                    n.O(nVar3.z);
                    zzM(f3a1.Kg(y391Var), zzrVar);
                }
                return;
            }
        } catch (zzd unused) {
            this.zza.B0().z.c("EES error. appId, eventName", zzrVar.zzb, zzbgVar.zza);
        }
        this.zza.B0().H.b(zzbgVar.zza, "EES was not applied to event");
        zzM(zzbgVar, zzrVar);
    }

    public final zzbg zzc(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        if ("_cmp".equals(zzbgVar.zza) && (zzbeVar = zzbgVar.zzb) != null && zzbeVar.zze() != 0) {
            String zzd = zzbeVar.zzd("_cis");
            if ("referrer broadcast".equals(zzd) || "referrer API".equals(zzd)) {
                this.zza.B0().F.b(zzbgVar.toString(), "Event has been filtered ");
                return new zzbg("_cmpx", zzbeVar, zzbgVar.zzc, zzbgVar.zzd);
            }
        }
        return zzbgVar;
    }

    public final void zzd(Runnable runnable) {
        cvw.l(runnable);
        n nVar = this.zza;
        if (nVar.M1().Mg()) {
            runnable.run();
        } else {
            nVar.M1().Pg(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbg zzbgVar, zzr zzrVar) {
        cvw.l(zzbgVar);
        zzN(zzrVar, false);
        zzd(new w1l(2, this, zzbgVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzpl zzplVar, zzr zzrVar) {
        cvw.l(zzplVar);
        zzN(zzrVar, false);
        zzd(new w1l(3, this, zzplVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new na3(11, this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzbg zzbgVar, String str, String str2) {
        cvw.l(zzbgVar);
        cvw.i(str);
        zzO(str, true);
        zzd(new ju61(this, zzbgVar, str, false, 10));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new lda1(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final List zzj(zzr zzrVar, boolean z) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        cvw.l(str);
        try {
            List<zdb1> list = (List) this.zza.M1().Ng(new hhe0(this, str, 3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zdb1 zdb1Var : list) {
                if (!z && ieb1.dh(zdb1Var.c)) {
                }
                arrayList.add(new zzpl(zdb1Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.B0().z.c("Failed to get user properties. appId", y1a1.Og(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbg zzbgVar, String str) {
        cvw.i(str);
        cvw.l(zzbgVar);
        zzO(str, true);
        n nVar = this.zza;
        l1a1 l1a1Var = nVar.B0().G;
        g gVar = nVar.E;
        i0a1 i0a1Var = gVar.C;
        String str2 = zzbgVar.zza;
        l1a1Var.b(i0a1Var.a(str2), "Log and bundle. event");
        ((kl40) nVar.q4()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) nVar.M1().Og(new hxj(this, zzbgVar, str)).get();
            if (bArr == null) {
                nVar.B0().z.b(y1a1.Og(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((kl40) nVar.q4()).getClass();
            nVar.B0().G.d("Log and bundle processed. event, size, time_ms", gVar.C.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            n nVar2 = this.zza;
            nVar2.B0().z.d("Failed to log and bundle. appId, event, error", y1a1.Og(str), nVar2.E.C.a(zzbgVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzl(long j, String str, String str2, String str3) {
        zzd(new wba1(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final String zzm(zzr zzrVar) {
        zzN(zzrVar, false);
        n nVar = this.zza;
        try {
            return (String) nVar.M1().Ng(new obb1(nVar, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            nVar.B0().z.c("Failed to get app instance id. appId", y1a1.Og(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        cvw.l(zzahVar);
        cvw.l(zzahVar.zzc);
        zzN(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new ju61(this, zzahVar2, zzrVar, false, 9));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzo(zzah zzahVar) {
        cvw.l(zzahVar);
        cvw.l(zzahVar.zzc);
        cvw.i(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new do91((Object) this, (Object) new zzah(zzahVar), false, 24));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        cvw.l(str3);
        try {
            List<zdb1> list = (List) this.zza.M1().Ng(new oca1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zdb1 zdb1Var : list) {
                if (!z && ieb1.dh(zdb1Var.c)) {
                }
                arrayList.add(new zzpl(zdb1Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.B0().z.c("Failed to query user properties. appId", y1a1.Og(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z) {
        zzO(str, true);
        try {
            List<zdb1> list = (List) this.zza.M1().Ng(new oca1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zdb1 zdb1Var : list) {
                if (!z && ieb1.dh(zdb1Var.c)) {
                }
                arrayList.add(new zzpl(zdb1Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.B0().z.c("Failed to get user properties as. appId", y1a1.Og(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        cvw.l(str3);
        try {
            return (List) this.zza.M1().Ng(new oca1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.B0().z.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) {
        zzO(str, true);
        try {
            return (List) this.zza.M1().Ng(new oca1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.B0().z.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzt(zzr zzrVar) {
        String str = zzrVar.zza;
        cvw.i(str);
        zzO(str, false);
        zzd(new rba1(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzu(final Bundle bundle, final zzr zzrVar) {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        cvw.l(str);
        zzd(new Runnable() { // from class: rga1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzjd.this.zzK(bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzv(zzr zzrVar) {
        cvw.i(zzrVar.zza);
        cvw.l(zzrVar.zzs);
        zzE(new vda1(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(zzr zzrVar) {
        zzN(zzrVar, false);
        cvw.i(zzrVar.zza);
        try {
            return (zzao) this.zza.M1().Og(new hhe0(this, zzrVar, 4)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zza.B0().z.c("Failed to get consent. appId", y1a1.Og(zzrVar.zza), e);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final List zzx(zzr zzrVar, Bundle bundle) {
        int i = 0;
        zzN(zzrVar, false);
        cvw.l(zzrVar.zza);
        n nVar = this.zza;
        if (!nVar.Y().Qg(null, nw91.Y0)) {
            try {
                return (List) this.zza.M1().Ng(new efa1(this, zzrVar, bundle, 1)).get();
            } catch (InterruptedException | ExecutionException e) {
                this.zza.B0().z.c("Failed to get trigger URIs. appId", y1a1.Og(zzrVar.zza), e);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) nVar.M1().Og(new efa1(this, zzrVar, bundle, i)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.zza.B0().z.c("Failed to get trigger URIs. appId", y1a1.Og(zzrVar.zza), e2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzy(zzr zzrVar) {
        cvw.i(zzrVar.zza);
        cvw.l(zzrVar.zzs);
        zzE(new vda1(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzga, com.google.android.gms.measurement.internal.zzgb
    public final void zzz(zzr zzrVar) {
        cvw.i(zzrVar.zza);
        cvw.l(zzrVar.zzs);
        zzE(new lda1(this, zzrVar, 1));
    }
}
