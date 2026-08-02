package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import xsna.ztp;

/* compiled from: EqualizerControllerImpl.kt */
/* loaded from: classes3.dex */
public final class ptp implements otp {
    public static final ztp.g g = new ztp.g(e43.l(0, 0, 0, 0, 0));
    public final com.vk.music.pref.a b;
    public a1b0 d;
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashMap e = new LinkedHashMap();
    public ntp f = ntp.d.getSTUB();

    public ptp(com.vk.music.pref.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.otp
    public final void a(int i) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.e;
        if (linkedHashMap.containsKey(valueOf)) {
            return;
        }
        linkedHashMap.put(Integer.valueOf(i), new a1b0(i, this.b.a(), d()));
    }

    @Override // xsna.otp
    public final void b(ztp ztpVar) {
        com.vk.music.pref.a aVar = this.b;
        if (!aVar.a()) {
            setEnabled(true);
        }
        boolean z = false;
        for (Map.Entry entry : this.e.entrySet()) {
            z = z || ((z0b0) entry.getValue()).c();
            ((z0b0) entry.getValue()).b(ztpVar);
        }
        if (!z) {
            o();
            this.d.b(ztpVar);
        }
        aVar.y0(ztpVar.a);
        if (ztpVar instanceof ztp.g) {
            aVar.t0(j5g.g0(l().d, StringUtils.COMMA, null, null, 0, null, 62));
        }
        if (n()) {
            return;
        }
        p();
    }

    @Override // xsna.otp
    public final boolean c() {
        z0b0 m = m();
        if (!n()) {
            p();
        }
        return m.c();
    }

    @Override // xsna.otp
    public final ztp d() {
        com.vk.music.pref.a aVar = this.b;
        return ztp.f.a(aVar.R0(), aVar.w0());
    }

    @Override // xsna.otp
    public final ztp.g e() {
        ztp.g l = l();
        if (!n()) {
            p();
        }
        return l;
    }

    @Override // xsna.otp
    public final void f(String str) {
        LinkedHashSet linkedHashSet = this.c;
        linkedHashSet.remove(str);
        if (linkedHashSet.isEmpty()) {
            p();
        }
    }

    @Override // xsna.otp
    public final void g(String str) {
        this.c.add(str);
        if (this.e.isEmpty()) {
            o();
        }
    }

    @Override // xsna.otp
    public final void h(boolean z) {
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            ((z0b0) ((Map.Entry) it.next()).getValue()).setEnabled(z && this.b.a());
        }
    }

    @Override // xsna.otp
    public final void i(short s, short s2) {
        if (!this.b.a()) {
            setEnabled(true);
        }
        boolean z = false;
        for (Map.Entry entry : this.e.entrySet()) {
            z = z || ((z0b0) entry.getValue()).c();
            ((z0b0) entry.getValue()).a(s, s2);
        }
        if (!z) {
            o();
            this.d.a(s, s2);
        }
        if (n()) {
            return;
        }
        p();
    }

    @Override // xsna.otp
    public final boolean isEnabled() {
        return this.b.a();
    }

    @Override // xsna.otp
    public final ntp j() {
        ntp ntpVar;
        if (!epx.f(this.f, ntp.d.getSTUB())) {
            return this.f;
        }
        z0b0 m = m();
        if (m.c()) {
            int g2 = m.g();
            i06[] i06VarArr = new i06[g2];
            for (int i = 0; i < g2; i++) {
                short s = (short) i;
                m.f(s);
                i06VarArr[i] = new i06(m.e(s));
            }
            short[] d = m.d();
            if (!n()) {
                p();
            }
            ntpVar = new ntp(d[0], d[1], i06VarArr);
        } else {
            if (!n()) {
                p();
            }
            ntpVar = this.f;
        }
        this.f = ntpVar;
        return ntpVar;
    }

    @Override // xsna.otp
    public final ztp.g k() {
        ztp a = ztp.f.a("custom", this.b.w0());
        ztp.g gVar = a instanceof ztp.g ? (ztp.g) a : null;
        return gVar == null ? e() : gVar;
    }

    public final ztp.g l() {
        z0b0 m = m();
        if (!m.c()) {
            return g;
        }
        short g2 = m.g();
        ArrayList arrayList = new ArrayList(g2);
        for (int i = 0; i < g2; i++) {
            arrayList.add(Short.valueOf(m.h((short) i)));
        }
        return new ztp.g(arrayList);
    }

    public final z0b0 m() {
        Object obj;
        Iterator it = this.e.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((z0b0) obj).c()) {
                break;
            }
        }
        z0b0 z0b0Var = (z0b0) obj;
        if (z0b0Var != null) {
            return z0b0Var;
        }
        o();
        return this.d;
    }

    public final boolean n() {
        return !this.c.isEmpty();
    }

    public final void o() {
        if (this.d == null) {
            this.d = new a1b0(0, this.b.a(), d());
        }
    }

    public final void p() {
        a1b0 a1b0Var = this.d;
        if (a1b0Var != null) {
            a1b0Var.release();
        }
        this.d = null;
    }

    @Override // xsna.otp
    public final void release(int i) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.e;
        z0b0 z0b0Var = (z0b0) linkedHashMap.get(valueOf);
        if (z0b0Var != null) {
            z0b0Var.release();
        }
        linkedHashMap.remove(Integer.valueOf(i));
    }

    @Override // xsna.otp
    public final void setEnabled(boolean z) {
        this.b.P0(z);
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            ((z0b0) ((Map.Entry) it.next()).getValue()).setEnabled(z);
        }
        a1b0 a1b0Var = this.d;
        if (a1b0Var != null) {
            a1b0Var.setEnabled(z);
        }
    }
}
