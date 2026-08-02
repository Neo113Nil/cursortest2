package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class pqn {
    public static final long[] f = new long[0];
    public final /* synthetic */ int a = 1;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public pqn(SerialDescriptor serialDescriptor, wls wlsVar) {
        this.c = serialDescriptor;
        this.d = wlsVar;
        int e = serialDescriptor.e();
        if (e <= 64) {
            this.b = e != 64 ? (-1) << e : 0L;
            this.e = f;
            return;
        }
        this.b = 0L;
        int i = (e - 1) >>> 6;
        long[] jArr = new long[i];
        if ((e & 63) != 0) {
            jArr[i - 1] = (-1) << e;
        }
        this.e = jArr;
    }

    public static pqn a(zzbg zzbgVar) {
        return new pqn(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x012b, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0 b(e0 e0Var, String str) {
        Cursor cursor;
        e0 e0Var2;
        long j;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String u = e0Var.u();
        List r = e0Var.r();
        r491 r491Var = (r491) this.e;
        n nVar = r491Var.c;
        n nVar2 = r491Var.c;
        g gVar = (g) r491Var.b;
        nVar.d0();
        g0 Og = f3a1.Og(e0Var, "_eid");
        Long l = (Long) (Og == null ? null : f3a1.Vg(Og));
        if (l != null) {
            if (u.equals("_ep")) {
                nVar.d0();
                g0 Og2 = f3a1.Og(e0Var, "_en");
                String str2 = (String) (Og2 == null ? null : f3a1.Vg(Og2));
                if (TextUtils.isEmpty(str2)) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.A.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((e0) this.c) == null || ((Long) this.d) == null || l.longValue() != ((Long) this.d).longValue()) {
                    b bVar = nVar.c;
                    n.O(bVar);
                    g gVar2 = (g) bVar.b;
                    bVar.Gg();
                    bVar.Hg();
                    try {
                        cursor2 = bVar.vh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    e0Var2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((e0) ((y7a1) f3a1.th(e0.B(), cursor2.getBlob(0))).f(), Long.valueOf(cursor2.getLong(1)));
                                            cursor2.close();
                                            pair2 = create;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            y1a1 y1a1Var2 = gVar2.y;
                                            g.g(y1a1Var2);
                                            y1a1Var2.z.b(e, "Error selecting main event");
                                        }
                                    } catch (IOException e2) {
                                        y1a1 y1a1Var3 = gVar2.y;
                                        g.g(y1a1Var3);
                                        j = 0;
                                        try {
                                            y1a1Var3.z.d("Failed to merge main event. appId, eventId", y1a1.Og(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            y1a1 y1a1Var22 = gVar2.y;
                                            g.g(y1a1Var22);
                                            y1a1Var22.z.b(e, "Error selecting main event");
                                        }
                                        cursor2.close();
                                        pair = e0Var2;
                                        if (pair != 0) {
                                        }
                                        y1a1 y1a1Var4 = gVar.y;
                                        g.g(y1a1Var4);
                                        y1a1Var4.A.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return e0Var2;
                                    }
                                } else {
                                    y1a1 y1a1Var5 = gVar2.y;
                                    g.g(y1a1Var5);
                                    y1a1Var5.H.a("Main event not found");
                                    cursor2.close();
                                    pair2 = null;
                                    e0Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                e0Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        e0Var2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        y1a1 y1a1Var42 = gVar.y;
                        g.g(y1a1Var42);
                        y1a1Var42.A.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return e0Var2;
                    }
                    this.c = (e0) obj;
                    this.b = ((Long) pair.second).longValue();
                    nVar2.d0();
                    this.d = (Long) f3a1.Pg((e0) this.c, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.b - 1;
                this.b = j2;
                if (j2 <= j) {
                    b bVar2 = nVar2.c;
                    n.O(bVar2);
                    g gVar3 = (g) bVar2.b;
                    bVar2.Gg();
                    y1a1 y1a1Var6 = gVar3.y;
                    g.g(y1a1Var6);
                    y1a1Var6.H.b(str, "Clearing complex main event info. appId");
                    try {
                        bVar2.vh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        y1a1 y1a1Var7 = gVar3.y;
                        g.g(y1a1Var7);
                        y1a1Var7.z.b(e6, "Error clearing complex main event");
                    }
                } else {
                    b bVar3 = nVar2.c;
                    n.O(bVar3);
                    bVar3.Xg(str, l, this.b, (e0) this.c);
                }
                ArrayList arrayList = new ArrayList();
                for (g0 g0Var : ((e0) this.c).r()) {
                    nVar2.d0();
                    if (f3a1.Og(e0Var, g0Var.s()) == null) {
                        arrayList.add(g0Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    y1a1 y1a1Var8 = gVar.y;
                    g.g(y1a1Var8);
                    y1a1Var8.A.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(r);
                    r = arrayList;
                }
                u = str2;
            } else {
                this.d = l;
                this.c = e0Var;
                nVar.d0();
                Object Pg = f3a1.Pg(e0Var, "_epc");
                long longValue = ((Long) (Pg != null ? Pg : 0L)).longValue();
                this.b = longValue;
                if (longValue <= 0) {
                    y1a1 y1a1Var9 = gVar.y;
                    g.g(y1a1Var9);
                    y1a1Var9.A.b(u, "Complex event with zero extra param count. eventName");
                } else {
                    b bVar4 = nVar.c;
                    n.O(bVar4);
                    bVar4.Xg(str, l, this.b, e0Var);
                }
            }
        }
        y7a1 y7a1Var = (y7a1) e0Var.k();
        y7a1Var.d();
        ((e0) y7a1Var.b).H(u);
        y7a1Var.d();
        ((e0) y7a1Var.b).F();
        y7a1Var.d();
        ((e0) y7a1Var.b).E(r);
        return (e0) y7a1Var.f();
    }

    public zzbg c() {
        return new zzbg((String) this.c, new zzbe(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = (String) this.d;
                String obj = ((Bundle) this.e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                g8e.D(sb, "origin=", str, ",name=", str2);
                return oyr.t(sb, ",params=", obj);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pqn(r491 r491Var) {
        this.e = r491Var;
    }

    public pqn(String str, String str2, Bundle bundle, long j) {
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }
}
