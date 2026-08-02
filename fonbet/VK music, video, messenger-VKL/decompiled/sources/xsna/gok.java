package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzau;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes11.dex */
public final class gok implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gok(Object obj, Serializable serializable, Parcelable parcelable, int i) {
        this.b = i;
        this.e = obj;
        this.c = serializable;
        this.d = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzau zzauVar;
        AtomicReference atomicReference;
        x901 x901Var;
        switch (this.b) {
            case 0:
                ((kok) this.e).b.extraCallback((String) this.c, (Bundle) this.d);
                return;
            case 1:
                cd01 cd01Var = (cd01) this.e;
                String str = (String) this.c;
                Bundle bundle = (Bundle) this.d;
                ayz0 ayz0Var = cd01Var.a.d;
                qj01.I(ayz0Var);
                ayz0Var.k();
                ayz0Var.l();
                mb01 mb01Var = (mb01) ayz0Var.b;
                exc0.f(str);
                exc0.f("dep");
                TextUtils.isEmpty("");
                if (bundle == null || bundle.isEmpty()) {
                    zzauVar = new zzau(new Bundle());
                } else {
                    Bundle bundle2 = new Bundle(bundle);
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            k901 k901Var = mb01Var.j;
                            mb01.k(k901Var);
                            k901Var.i.a("Param name can't be null");
                            it.remove();
                        } else {
                            sk01 sk01Var = mb01Var.m;
                            mb01.i(sk01Var);
                            Object o = sk01Var.o(bundle2.get(next), next);
                            if (o == null) {
                                k901 k901Var2 = mb01Var.j;
                                mb01.k(k901Var2);
                                k901Var2.l.b(mb01Var.n.e(next), "Param value can't be null");
                                it.remove();
                            } else {
                                sk01 sk01Var2 = mb01Var.m;
                                mb01.i(sk01Var2);
                                sk01Var2.A(next, bundle2, o);
                            }
                        }
                    }
                    zzauVar = new zzau(bundle2);
                }
                Bundle bundle3 = zzauVar.b;
                sj01 sj01Var = ayz0Var.e.h;
                qj01.I(sj01Var);
                zzfs zze = zzft.zze();
                zze.zzl(0L);
                for (String str2 : bundle3.keySet()) {
                    zzfw zze2 = zzfx.zze();
                    zze2.zzj(str2);
                    Object obj = bundle3.get(str2);
                    exc0.i(obj);
                    sj01Var.J(zze2, obj);
                    zze.zze(zze2);
                }
                byte[] zzbu = ((zzft) zze.zzaC()).zzbu();
                k901 k901Var3 = mb01Var.j;
                mb01.k(k901Var3);
                k901Var3.q.c("Saving default event parameters, appId, data size", mb01Var.n.d(str), Integer.valueOf(zzbu.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("parameters", zzbu);
                try {
                    if (ayz0Var.C().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        mb01.k(k901Var3);
                        k901Var3.i.b(k901.r(str), "Failed to insert default event parameters (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    mb01.k(k901Var3);
                    k901Var3.i.c("Error storing default event parameters. appId", k901.r(str), e);
                    return;
                }
            default:
                synchronized (((AtomicReference) this.c)) {
                    try {
                        try {
                            x901Var = ((mb01) ((yh01) this.e).b).i;
                            mb01.i(x901Var);
                        } catch (RemoteException e2) {
                            k901 k901Var4 = ((mb01) ((yh01) this.e).b).j;
                            mb01.k(k901Var4);
                            k901Var4.i.b(e2, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.c;
                        }
                        if (x901Var.p().f(zzah.ANALYTICS_STORAGE)) {
                            yh01 yh01Var = (yh01) this.e;
                            v701 v701Var = yh01Var.g;
                            if (v701Var != null) {
                                ((AtomicReference) this.c).set(v701Var.f0((com.google.android.gms.measurement.internal.zzq) this.d));
                                String str3 = (String) ((AtomicReference) this.c).get();
                                if (str3 != null) {
                                    bf01 bf01Var = ((mb01) ((yh01) this.e).b).q;
                                    mb01.j(bf01Var);
                                    bf01Var.j.set(str3);
                                    x901 x901Var2 = ((mb01) ((yh01) this.e).b).i;
                                    mb01.i(x901Var2);
                                    x901Var2.i.b(str3);
                                }
                                ((yh01) this.e).v();
                                atomicReference = (AtomicReference) this.c;
                                atomicReference.notify();
                                return;
                            }
                            k901 k901Var5 = ((mb01) yh01Var.b).j;
                            mb01.k(k901Var5);
                            k901Var5.i.a("Failed to get app instance id");
                            ((AtomicReference) this.c).notify();
                        } else {
                            k901 k901Var6 = ((mb01) ((yh01) this.e).b).j;
                            mb01.k(k901Var6);
                            k901Var6.n.a("Analytics storage consent denied; will not get app instance id");
                            bf01 bf01Var2 = ((mb01) ((yh01) this.e).b).q;
                            mb01.j(bf01Var2);
                            bf01Var2.j.set(null);
                            x901 x901Var3 = ((mb01) ((yh01) this.e).b).i;
                            mb01.i(x901Var3);
                            x901Var3.i.b(null);
                            ((AtomicReference) this.c).set(null);
                        }
                        return;
                    } finally {
                        ((AtomicReference) this.c).notify();
                    }
                }
        }
    }
}
