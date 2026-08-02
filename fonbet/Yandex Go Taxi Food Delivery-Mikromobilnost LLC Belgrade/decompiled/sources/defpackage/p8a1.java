package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class p8a1 extends sab1 implements e691 {
    public final w53 A;
    public final w53 B;
    public final w53 C;
    public final v6a1 D;
    public final va90 E;
    public final w53 F;
    public final w53 G;
    public final w53 H;
    public final w53 x;
    public final w53 y;
    public final w53 z;

    public p8a1(n nVar) {
        super(nVar);
        this.x = new w53();
        this.y = new w53();
        this.z = new w53();
        this.A = new w53();
        this.B = new w53();
        this.F = new w53();
        this.G = new w53();
        this.H = new w53();
        this.C = new w53();
        this.D = new v6a1(this);
        this.E = new va90(this);
    }

    public static final w53 Qg(r rVar) {
        w53 w53Var = new w53();
        for (v vVar : rVar.v()) {
            w53Var.put(vVar.r(), vVar.s());
        }
        return w53Var;
    }

    public static final zzjk Rg(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return zzjk.AD_STORAGE;
        }
        if (i2 == 2) {
            return zzjk.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return zzjk.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return zzjk.AD_PERSONALIZATION;
    }

    @Override // defpackage.sab1
    public final void Jg() {
    }

    public final zzji Kg(String str, zzjk zzjkVar) {
        Gg();
        Mg(str);
        o bh = bh(str);
        if (bh == null) {
            return zzji.UNINITIALIZED;
        }
        for (l lVar : bh.w()) {
            if (Rg(lVar.s()) == zzjkVar) {
                int t = lVar.t() - 1;
                return t != 1 ? t != 2 ? zzji.UNINITIALIZED : zzji.DENIED : zzji.GRANTED;
            }
        }
        return zzji.UNINITIALIZED;
    }

    public final boolean Lg(String str) {
        Gg();
        Mg(str);
        o bh = bh(str);
        if (bh == null) {
            return false;
        }
        for (l lVar : bh.r()) {
            if (lVar.s() == 3 && lVar.u() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void Mg(String str) {
        Hg();
        Gg();
        cvw.i(str);
        w53 w53Var = this.B;
        if (w53Var.get(str) == null) {
            b bVar = this.c.c;
            n.O(bVar);
            cf11 Mh = bVar.Mh(str);
            w53 w53Var2 = this.H;
            w53 w53Var3 = this.G;
            w53 w53Var4 = this.F;
            w53 w53Var5 = this.x;
            if (Mh != null) {
                sz91 sz91Var = (sz91) Pg(str, (byte[]) Mh.a).k();
                Ng(str, sz91Var);
                w53Var5.put(str, Qg((r) sz91Var.f()));
                w53Var.put(str, (r) sz91Var.f());
                Og(str, (r) sz91Var.f());
                w53Var4.put(str, ((r) sz91Var.b).C());
                w53Var3.put(str, (String) Mh.b);
                w53Var2.put(str, (String) Mh.c);
                return;
            }
            w53Var5.put(str, null);
            this.z.put(str, null);
            this.y.put(str, null);
            this.A.put(str, null);
            w53Var.put(str, null);
            w53Var4.put(str, null);
            w53Var3.put(str, null);
            w53Var2.put(str, null);
            this.C.put(str, null);
        }
    }

    public final void Ng(String str, sz91 sz91Var) {
        g gVar = (g) this.b;
        HashSet hashSet = new HashSet();
        w53 w53Var = new w53();
        w53 w53Var2 = new w53();
        w53 w53Var3 = new w53();
        Iterator it = Collections.unmodifiableList(((r) sz91Var.b).B()).iterator();
        while (it.hasNext()) {
            hashSet.add(((p) it.next()).r());
        }
        for (int i = 0; i < ((r) sz91Var.b).w(); i++) {
            gz91 gz91Var = (gz91) ((r) sz91Var.b).x(i).k();
            if (gz91Var.i().isEmpty()) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.a("EventConfig contained null event name");
            } else {
                String i2 = gz91Var.i();
                String Z = udq0.Z(gz91Var.i(), cma1.c, cma1.e);
                if (!TextUtils.isEmpty(Z)) {
                    gz91Var.d();
                    ((q) gz91Var.b).y(Z);
                    sz91Var.d();
                    ((r) sz91Var.b).J(i, (q) gz91Var.f());
                }
                if (((q) gz91Var.b).s() && ((q) gz91Var.b).t()) {
                    w53Var.put(i2, Boolean.TRUE);
                }
                if (((q) gz91Var.b).u() && ((q) gz91Var.b).v()) {
                    w53Var2.put(gz91Var.i(), Boolean.TRUE);
                }
                if (((q) gz91Var.b).w()) {
                    if (((q) gz91Var.b).x() < 2 || ((q) gz91Var.b).x() > 65535) {
                        y1a1 y1a1Var2 = gVar.y;
                        g.g(y1a1Var2);
                        y1a1Var2.C.c("Invalid sampling rate. Event name, sample rate", gz91Var.i(), Integer.valueOf(((q) gz91Var.b).x()));
                    } else {
                        w53Var3.put(gz91Var.i(), Integer.valueOf(((q) gz91Var.b).x()));
                    }
                }
            }
        }
        this.y.put(str, hashSet);
        this.z.put(str, w53Var);
        this.A.put(str, w53Var2);
        this.C.put(str, w53Var3);
    }

    public final void Og(String str, r rVar) {
        g gVar = (g) this.b;
        int A = rVar.A();
        v6a1 v6a1Var = this.D;
        if (A == 0) {
            v6a1Var.e(str);
            return;
        }
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.H.b(Integer.valueOf(rVar.A()), "EES programs found");
        int i = 0;
        r0 r0Var = (r0) rVar.z().get(0);
        try {
            yb91 yb91Var = new yb91();
            gr91 gr91Var = yb91Var.a;
            gr91Var.d.a("internal.remoteConfig", new r7a1(this, str, 2));
            gr91Var.d.a("internal.appMetadata", new r7a1(this, str, i));
            gr91Var.d.a("internal.logger", new hxj(3, this));
            yb91Var.b(r0Var);
            v6a1Var.d(str, yb91Var);
            g.g(y1a1Var);
            l1a1 l1a1Var = y1a1Var.H;
            l1a1Var.c("EES program loaded for appId, activities", str, Integer.valueOf(r0Var.s().s()));
            for (q0 q0Var : r0Var.s().r()) {
                g.g(y1a1Var);
                l1a1Var.b(q0Var.r(), "EES program activity");
            }
        } catch (zzd unused) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(str, "Failed to load EES program. appId");
        }
    }

    public final r Pg(String str, byte[] bArr) {
        g gVar = (g) this.b;
        if (bArr == null) {
            return r.I();
        }
        try {
            r rVar = (r) ((sz91) f3a1.th(r.H(), bArr)).f();
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.c("Parsed config. version, gmp_app_id", rVar.r() ? Long.valueOf(rVar.s()) : null, rVar.t() ? rVar.u() : null);
            return rVar;
        } catch (zzmr e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.C.c("Unable to merge remote config. appId", y1a1.Og(str), e);
            return r.I();
        } catch (RuntimeException e2) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.C.c("Unable to merge remote config. appId", y1a1.Og(str), e2);
            return r.I();
        }
    }

    public final r Sg(String str) {
        Hg();
        Gg();
        cvw.i(str);
        Mg(str);
        return (r) this.B.get(str);
    }

    public final String Tg(String str) {
        Gg();
        Mg(str);
        return (String) this.F.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031c, code lost:
    
        r1 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r1);
        r1.z.c("Error storing event filter. appId", defpackage.y1a1.Og(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0406, code lost:
    
        r9.Hg();
        r9.Gg();
        defpackage.cvw.i(r29);
        r0 = r9.vh();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0429, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ec, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0276, code lost:
    
        r0 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0 = r0.C;
        r4 = defpackage.y1a1.Og(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028b, code lost:
    
        if (r7.r() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028d, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x029d, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029b, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0298, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x05c6, code lost:
    
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x05c9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032e, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.t().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x033e, code lost:
    
        if (r3.hasNext() == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0340, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.j) r3.next();
        r9.Hg();
        r9.Gg();
        defpackage.cvw.i(r29);
        defpackage.cvw.l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x035a, code lost:
    
        if (r5.t().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0386, code lost:
    
        r6 = r5.d();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x039f, code lost:
    
        if (r5.r() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03a1, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ab, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03bd, code lost:
    
        if (r5.x() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03bf, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c9, code lost:
    
        r7.put("session_scoped", r0);
        r7.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03db, code lost:
    
        if (r9.vh().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03f0, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03dd, code lost:
    
        r0 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0.z.b(defpackage.y1a1.Og(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03f6, code lost:
    
        r1 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r1);
        r1.z.c("Error storing property filter. appId", defpackage.y1a1.Og(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03c8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03aa, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x035c, code lost:
    
        r0 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0 = r0.C;
        r3 = defpackage.y1a1.Og(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0371, code lost:
    
        if (r5.r() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0373, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x037d, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x037c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020c, code lost:
    
        r6 = r0.t().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0218, code lost:
    
        if (r6.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0224, code lost:
    
        if (((com.google.android.gms.internal.measurement.j) r6.next()).r() != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0226, code lost:
    
        r0 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0.C.c("Property filter with no ID. Audience definition ignored. appId, audienceId", defpackage.y1a1.Og(r29), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x023c, code lost:
    
        r6 = r0.w().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0244, code lost:
    
        r7 = r6.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0248, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0258, code lost:
    
        if (r7 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025a, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.g) r6.next();
        r9.Hg();
        r9.Gg();
        defpackage.cvw.i(r29);
        defpackage.cvw.l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0274, code lost:
    
        if (r7.t().isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02aa, code lost:
    
        r25 = r3;
        r3 = r7.d();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID, r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c5, code lost:
    
        if (r7.r() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c7, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d1, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e1, code lost:
    
        if (r7.B() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e3, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ed, code lost:
    
        r5.put("session_scoped", r0);
        r5.put(io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ff, code lost:
    
        if (r9.vh().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0301, code lost:
    
        r0 = r14.y;
        com.google.android.gms.measurement.internal.g.g(r0);
        r0.z.b(defpackage.y1a1.Og(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0311, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x031b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x058e A[Catch: SQLiteException -> 0x059f, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x059f, blocks: (B:179:0x0577, B:181:0x058e), top: B:178:0x0577 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Ug(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        sz91 sz91Var;
        byte[] bArr2;
        b bVar;
        ContentValues contentValues;
        w53 w53Var;
        boolean z;
        Hg();
        Gg();
        cvw.i(str);
        sz91 sz91Var2 = (sz91) Pg(str, bArr).k();
        Ng(str, sz91Var2);
        Og(str, (r) sz91Var2.f());
        r rVar = (r) sz91Var2.f();
        w53 w53Var2 = this.B;
        w53Var2.put(str, rVar);
        this.F.put(str, ((r) sz91Var2.b).C());
        this.G.put(str, str2);
        this.H.put(str, str3);
        this.x.put(str, Qg((r) sz91Var2.f()));
        n nVar = this.c;
        b bVar2 = nVar.c;
        n.O(bVar2);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((r) sz91Var2.b).y()));
        g gVar = (g) bVar2.b;
        int i = 0;
        while (i < arrayList.size()) {
            xr91 xr91Var = (xr91) ((f) arrayList.get(i)).k();
            if (xr91Var.m() != 0) {
                w53Var = w53Var2;
                int i2 = 0;
                while (i2 < xr91Var.m()) {
                    hs91 hs91Var = (hs91) xr91Var.o(i2).k();
                    hs91 hs91Var2 = (hs91) hs91Var.clone();
                    n nVar2 = nVar;
                    sz91 sz91Var3 = sz91Var2;
                    String Z = udq0.Z(hs91Var.i(), cma1.c, cma1.e);
                    if (Z != null) {
                        hs91Var2.j(Z);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < hs91Var.l()) {
                        h m = hs91Var.m(i3);
                        boolean z2 = z;
                        hs91 hs91Var3 = hs91Var;
                        String Z2 = udq0.Z(m.y(), fga1.a, fga1.b);
                        if (Z2 != null) {
                            ts91 ts91Var = (ts91) m.k();
                            ts91Var.i(Z2);
                            hs91Var2.o(i3, (h) ts91Var.f());
                            z = true;
                        } else {
                            z = z2;
                        }
                        i3++;
                        hs91Var = hs91Var3;
                    }
                    if (z) {
                        xr91Var.p(i2, hs91Var2);
                        arrayList.set(i, (f) xr91Var.f());
                    }
                    i2++;
                    nVar = nVar2;
                    sz91Var2 = sz91Var3;
                }
            } else {
                w53Var = w53Var2;
            }
            sz91 sz91Var4 = sz91Var2;
            n nVar3 = nVar;
            if (xr91Var.i() != 0) {
                for (int i4 = 0; i4 < xr91Var.i(); i4++) {
                    j j = xr91Var.j(i4);
                    String Z3 = udq0.Z(j.t(), bb1.d, bb1.e);
                    if (Z3 != null) {
                        au91 au91Var = (au91) j.k();
                        au91Var.i(Z3);
                        xr91Var.l(i4, au91Var);
                        arrayList.set(i, (f) xr91Var.f());
                    }
                }
            }
            i++;
            w53Var2 = w53Var;
            nVar = nVar3;
            sz91Var2 = sz91Var4;
        }
        sz91 sz91Var5 = sz91Var2;
        w53 w53Var3 = w53Var2;
        n nVar4 = nVar;
        bVar2.Hg();
        bVar2.Gg();
        cvw.i(str);
        SQLiteDatabase vh = bVar2.vh();
        vh.beginTransaction();
        try {
            bVar2.Hg();
            bVar2.Gg();
            cvw.i(str);
            SQLiteDatabase vh2 = bVar2.vh();
            vh2.delete("property_filters", "app_id=?", new String[]{str});
            vh2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                bVar2.Hg();
                bVar2.Gg();
                cvw.i(str);
                cvw.l(fVar);
                if (fVar.r()) {
                    int s = fVar.s();
                    Iterator it2 = fVar.w().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!((com.google.android.gms.internal.measurement.g) it2.next()).r()) {
                            y1a1 y1a1Var = gVar.y;
                            g.g(y1a1Var);
                            y1a1Var.C.c("Event filter with no ID. Audience definition ignored. appId, audienceId", y1a1.Og(str), Integer.valueOf(s));
                            break;
                        }
                    }
                } else {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.C.b(y1a1.Og(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = vh;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                f fVar2 = (f) it3.next();
                arrayList2.add(fVar2.r() ? Integer.valueOf(fVar2.s()) : null);
            }
            cvw.i(str);
            bVar2.Hg();
            bVar2.Gg();
            SQLiteDatabase vh3 = bVar2.vh();
            try {
                long qh = bVar2.qh("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, gVar.w.Og(str, nw91.U)));
                if (qh > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append(Extension.O_BRAKE);
                            sb.append(join);
                            sb.append(Extension.C_BRAKE);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(sb2.length() + PollMessageDraft.MAX_ANSWER_LENGTH);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            vh3.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)});
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
                y1a1 y1a1Var3 = gVar.y;
                g.g(y1a1Var3);
                y1a1Var3.z.c("Database error querying filters. appId", y1a1.Og(str), e);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                sz91Var5.d();
                sz91Var = sz91Var5;
            } catch (RuntimeException e2) {
                e = e2;
                sz91Var = sz91Var5;
            }
            try {
                ((r) sz91Var.b).K();
                bArr2 = ((r) sz91Var.f()).d();
            } catch (RuntimeException e3) {
                e = e3;
                y1a1 y1a1Var4 = ((g) this.b).y;
                g.g(y1a1Var4);
                y1a1Var4.C.c("Unable to serialize reduced-size config. Storing full config instead. appId", y1a1.Og(str), e);
                bArr2 = bArr;
                bVar = nVar4.c;
                n.O(bVar);
                g gVar2 = (g) bVar.b;
                cvw.i(str);
                bVar.Gg();
                bVar.Hg();
                contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                contentValues.put("config_last_modified_time", str2);
                contentValues.put("e_tag", str3);
                if (bVar.vh().update(ClidProvider.APPS_TABLE_NAME, contentValues, "app_id = ?", new String[]{str}) == 0) {
                }
                sz91Var.d();
                ((r) sz91Var.b).L();
                w53Var3.put(str, (r) sz91Var.f());
            }
            bVar = nVar4.c;
            n.O(bVar);
            g gVar22 = (g) bVar.b;
            cvw.i(str);
            bVar.Gg();
            bVar.Hg();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (bVar.vh().update(ClidProvider.APPS_TABLE_NAME, contentValues, "app_id = ?", new String[]{str}) == 0) {
                    y1a1 y1a1Var5 = gVar22.y;
                    g.g(y1a1Var5);
                    y1a1Var5.z.b(y1a1.Og(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e4) {
                y1a1 y1a1Var6 = gVar22.y;
                g.g(y1a1Var6);
                y1a1Var6.z.c("Error storing remote config. appId", y1a1.Og(str), e4);
            }
            sz91Var.d();
            ((r) sz91Var.b).L();
            w53Var3.put(str, (r) sz91Var.f());
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = vh;
        }
    }

    public final boolean Vg(String str, String str2) {
        Boolean bool;
        Gg();
        Mg(str);
        if ("1".equals(a7(str, "measurement.upload.blacklist_internal")) && ieb1.dh(str2)) {
            return true;
        }
        if ("1".equals(a7(str, "measurement.upload.blacklist_public")) && ieb1.Dh(str2)) {
            return true;
        }
        Map map = (Map) this.z.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean Wg(String str, String str2) {
        Boolean bool;
        Gg();
        Mg(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.A.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int Xg(String str, String str2) {
        Integer num;
        Gg();
        Mg(str);
        Map map = (Map) this.C.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean Yg(String str) {
        Gg();
        Mg(str);
        w53 w53Var = this.y;
        if (w53Var.get(str) != null) {
            return ((Set) w53Var.get(str)).contains("os_version") || ((Set) w53Var.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean Zg(String str) {
        Gg();
        Mg(str);
        w53 w53Var = this.y;
        return w53Var.get(str) != null && ((Set) w53Var.get(str)).contains("app_instance_id");
    }

    @Override // defpackage.e691
    public final String a7(String str, String str2) {
        Gg();
        Mg(str);
        Map map = (Map) this.x.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean ah(String str, zzjk zzjkVar) {
        Gg();
        Mg(str);
        o bh = bh(str);
        if (bh == null) {
            return false;
        }
        Iterator it = bh.r().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            if (zzjkVar == Rg(lVar.s())) {
                if (lVar.t() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final o bh(String str) {
        Gg();
        Mg(str);
        r Sg = Sg(str);
        if (Sg == null || !Sg.D()) {
            return null;
        }
        return Sg.E();
    }
}
