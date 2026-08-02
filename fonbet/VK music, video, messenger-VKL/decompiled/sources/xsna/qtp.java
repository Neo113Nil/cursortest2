package xsna;

import com.vk.music.audioeffect.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ztp;

/* compiled from: EqualizerControllerNew.kt */
/* loaded from: classes3.dex */
public final class qtp implements otp {
    public final com.vk.music.audioeffect.a b;
    public final ntp c;

    public qtp(com.vk.music.audioeffect.a aVar) {
        this.b = aVar;
        com.vk.music.audioeffect.a.a.getClass();
        short s = a.C1320a.d;
        short s2 = a.C1320a.e;
        List l = e43.l(60000, 230000, 910000, 3600000, 14000000);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(new i06(((Number) it.next()).intValue()));
        }
        this.c = new ntp(s, s2, (i06[]) arrayList.toArray(new i06[0]));
    }

    @Override // xsna.otp
    public final void b(ztp ztpVar) {
        if (!isEnabled()) {
            setEnabled(true);
        }
        this.b.j(ztpVar);
    }

    @Override // xsna.otp
    public final boolean c() {
        return true;
    }

    @Override // xsna.otp
    public final ztp d() {
        return (ztp) this.b.h().b.getValue();
    }

    @Override // xsna.otp
    public final ztp.g e() {
        ztp ztpVar = (ztp) this.b.h().b.getValue();
        if (ztpVar instanceof ztp.g) {
            return (ztp.g) ztpVar;
        }
        com.vk.music.audioeffect.a.a.getClass();
        return new ztp.g(a.C1320a.a(ztpVar));
    }

    @Override // xsna.otp
    public final void i(short s, short s2) {
        if (!isEnabled()) {
            setEnabled(true);
        }
        this.b.i(s, s2);
    }

    @Override // xsna.otp
    public final boolean isEnabled() {
        return ((Boolean) this.b.a().b.getValue()).booleanValue();
    }

    @Override // xsna.otp
    public final ntp j() {
        return this.c;
    }

    @Override // xsna.otp
    public final ztp.g k() {
        ztp.g d = this.b.d();
        return d == null ? e() : d;
    }

    @Override // xsna.otp
    public final void setEnabled(boolean z) {
        this.b.g(z);
    }

    @Override // xsna.otp
    public final void a(int i) {
    }

    @Override // xsna.otp
    public final void f(String str) {
    }

    @Override // xsna.otp
    public final void g(String str) {
    }

    @Override // xsna.otp
    public final void h(boolean z) {
    }

    @Override // xsna.otp
    public final void release(int i) {
    }
}
