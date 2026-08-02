package com.yandex.go.preorder.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import defpackage.avj0;
import defpackage.da0;
import defpackage.evu0;
import defpackage.fy01;
import defpackage.g18;
import defpackage.gu11;
import defpackage.h55;
import defpackage.hl50;
import defpackage.i130;
import defpackage.i5u;
import defpackage.jl50;
import defpackage.kyh0;
import defpackage.lg21;
import defpackage.mc;
import defpackage.n521;
import defpackage.nlw;
import defpackage.nwx0;
import defpackage.o521;
import defpackage.q521;
import defpackage.r521;
import defpackage.tje;
import defpackage.vpr0;
import defpackage.w030;
import defpackage.yio0;
import defpackage.yvf0;
import defpackage.zuj0;
import defpackage.zwx0;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class s extends h55 {
    public final zuj0 D;
    public final gu11 E;
    public final i130 F;
    public final jl50 G;
    public final fy01 H;
    public final r521 I;
    public final vpr0 J;
    public final o521 K;
    public g18 L;
    public boolean M;

    public s(zuj0 zuj0Var, gu11 gu11Var, i130 i130Var, jl50 jl50Var, fy01 fy01Var, yvf0 yvf0Var, r521 r521Var, vpr0 vpr0Var, o521 o521Var) {
        super(null);
        this.D = zuj0Var;
        this.E = gu11Var;
        this.F = i130Var;
        this.G = jl50Var;
        this.H = fy01Var;
        this.I = r521Var;
        this.J = vpr0Var;
        this.K = o521Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        g18 g18Var = this.L;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.L = null;
        this.M = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        s sVar;
        q521 q521Var = ((n521) obj).a;
        NearestZoneResponse nearestZoneResponse = q521Var.b;
        i5u i5uVar = q521Var.d;
        i5u i5uVar2 = q521Var.c;
        Address address = q521Var.a;
        String a = nearestZoneResponse != null ? nearestZoneResponse.a() : null;
        String str = nearestZoneResponse != null ? nearestZoneResponse.e : null;
        if (a == null || evu0.J(a)) {
            sVar = this;
            String q0 = address.q0();
            zuj0 zuj0Var = sVar.D;
            sVar.P(String.format(((avj0) zuj0Var).h(kyh0.address_region_not_supported), Arrays.copyOf(new Object[]{(q0 == null || q0.length() == 0) ? ((avj0) zuj0Var).h(kyh0.address_region_not_supported_default_prefix) : address.q0()}, 1)), str, null, null, i5uVar2, i5uVar);
        } else {
            String str2 = nearestZoneResponse.b;
            this.E.getClass();
            sVar = this;
            sVar.P(a, str, nearestZoneResponse.c(), nearestZoneResponse.b(), i5uVar2, i5uVar);
        }
        tje.N(sVar.o(), null, null, new UnsupportedZoneModalRouter$onLaunch$1(sVar, null), 3);
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        if (this.M) {
            w030 a = this.F.a();
            g18 g18Var = this.L;
            if (g18Var != null) {
                g18Var.cancel();
            }
            this.L = a.g(new nlw(2, this));
            this.J.a(this.K);
        }
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        g18 g18Var = this.L;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.L = null;
        this.J.b(this.K);
    }

    public final void P(String str, String str2, String str3, String str4, i5u i5uVar, i5u i5uVar2) {
        w030 a = this.F.a();
        a.a();
        g18 g18Var = this.L;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.L = a.g(new nlw(2, this));
        zwx0 cc = ((nwx0) this.H).a.c().cc();
        mc mcVar = this.G.a;
        da0 da0Var = new da0(13, (i130) mcVar.a.get(), cc, (lg21) mcVar.b.get());
        this.M = true;
        D(da0Var, new hl50(str, str2, str3, str4, i5uVar, i5uVar2), new yio0(28, this));
    }
}
