package xsna;

import android.annotation.SuppressLint;
import com.vk.music.audioeffect.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import xsna.hn40;
import xsna.ztp;

/* compiled from: AudioEffectSettingsImpl.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public final class dn4 implements com.vk.music.audioeffect.a {
    public final com.vk.music.pref.a b;
    public final g950 c;
    public final bpn0 d = new bpn0(new xu0(1));
    public final bpn0 e;
    public final b8f0 f;
    public final bpn0 g;
    public final bpn0 h;

    public dn4(com.vk.music.pref.a aVar, g950 g950Var) {
        this.b = aVar;
        this.c = g950Var;
        bpn0 bpn0Var = new bpn0(new s4(this, 6));
        this.e = bpn0Var;
        this.f = rsr.f((xh50) bpn0Var.getValue());
        this.g = new bpn0(new ry0(this, 3));
        this.h = new bpn0(new ji0(this, 4));
        g950Var.a().subscribe(new hz(new mb(this, 6), 6));
    }

    @Override // com.vk.music.audioeffect.a
    public final b8f0 a() {
        return rsr.f((xh50) this.g.getValue());
    }

    public final boolean b() {
        return this.b.c() && k();
    }

    @Override // com.vk.music.audioeffect.a
    public final b8f0 c() {
        return this.f;
    }

    @Override // com.vk.music.audioeffect.a
    public final ztp.g d() {
        ztp a = ztp.f.a("custom", this.b.w0());
        if (a instanceof ztp.g) {
            return (ztp.g) a;
        }
        return null;
    }

    @Override // com.vk.music.audioeffect.a
    public final void e(boolean z) {
        this.b.W(z);
        ((xh50) this.e.getValue()).setValue(Boolean.valueOf(b()));
    }

    @Override // com.vk.music.audioeffect.a
    public final hn40 f() {
        return (hn40) this.d.getValue();
    }

    @Override // com.vk.music.audioeffect.a
    public final void g(boolean z) {
        this.b.P0(z);
        ((xh50) this.g.getValue()).setValue(Boolean.valueOf(z));
    }

    @Override // com.vk.music.audioeffect.a
    public final b8f0 h() {
        return rsr.f((xh50) this.h.getValue());
    }

    @Override // com.vk.music.audioeffect.a
    public final void i(short s, short s2) {
        Collection a;
        ztp ztpVar = (ztp) ((xh50) this.h.getValue()).getValue();
        if (ztpVar instanceof ztp.g) {
            a = ((ztp.g) ztpVar).d;
        } else {
            com.vk.music.audioeffect.a.a.getClass();
            a = a.C1320a.a(ztpVar);
        }
        ArrayList arrayList = new ArrayList(a);
        arrayList.set(s, Short.valueOf(s2));
        j(new ztp.g(arrayList));
    }

    @Override // com.vk.music.audioeffect.a
    public final void j(ztp ztpVar) {
        String str = ztpVar.a;
        com.vk.music.pref.a aVar = this.b;
        aVar.y0(str);
        if (ztpVar instanceof ztp.g) {
            aVar.t0(j5g.g0(((ztp.g) ztpVar).d, StringUtils.COMMA, null, null, 0, null, 62));
        }
        ((xh50) this.h.getValue()).setValue(ztpVar);
    }

    @Override // com.vk.music.audioeffect.a
    public final boolean k() {
        hn40 f = f();
        if (f instanceof hn40.b) {
            return ((hn40.b) f).b || this.c.b();
        }
        return false;
    }
}
