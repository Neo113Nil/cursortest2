package com.yandex.go.user_profile.ui.am;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.spinner.SpinnerState;
import com.yandex.go.user_profile.ui.am.u;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.c3;
import com.yandex.passport.api.u2;
import defpackage.a12;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b12;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c12;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.crb1;
import defpackage.d12;
import defpackage.d17;
import defpackage.did;
import defpackage.e12;
import defpackage.eo1;
import defpackage.ep90;
import defpackage.exw0;
import defpackage.f12;
import defpackage.f530;
import defpackage.f5z;
import defpackage.ffb1;
import defpackage.ffx;
import defpackage.fid;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jeb1;
import defpackage.jl40;
import defpackage.ku0;
import defpackage.ljs0;
import defpackage.lz40;
import defpackage.m0;
import defpackage.m3u0;
import defpackage.o2d;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qk30;
import defpackage.qke;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.rb0;
import defpackage.sb0;
import defpackage.sb2;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.u02;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x02;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.y02;
import defpackage.yj70;
import defpackage.z02;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes14.dex */
public final class u {
    public final yj70 a;
    public final zuj0 b;
    public final u02 c;
    public final i3y d;
    public final i3y e;

    public u(yj70 yj70Var, zuj0 zuj0Var, u02 u02Var) {
        this.a = yj70Var;
        this.b = zuj0Var;
        this.c = u02Var;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: w02
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                u uVar = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) uVar.b).h(kyh0.common_unknown_error);
                    default:
                        return ((avj0) uVar.b).h(kyh0.common_retry);
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: w02
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                u uVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) uVar.b).h(kyh0.common_unknown_error);
                    default:
                        return ((avj0) uVar.b).h(kyh0.common_retry);
                }
            }
        });
    }

    public final void a(sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1610681134);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 k = an91.k(bzk0.c(ljs0.c, AppColor$Palette.Background, qke.q), 16.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = a12.b;
                btsVar.o0(Q);
            }
            f530 a = exw0.a(k, zy11.a, (PointerInputEventHandler) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            uo5 uo5Var = x4c.y;
            cj6 cj6Var = cj6.a;
            jeb1.f((String) this.d.getValue(), cj6Var.a(c, uo5Var), null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 0, 0, 16252);
            d17.c(cj6Var.a(ljs0.c(c530Var, 1.0f), x4c.B), false, null, ButtonStyle.Main, null, slsVar, wwg.S(-1074568368, true, new x02(this, i4), btsVar), btsVar, ((i3 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | 1575936, 22);
            btsVar.t(true);
            e(btsVar, (i3 >> 3) & 14);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(this, slsVar, i, 17);
        }
    }

    public final void b(Long l, String str, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(378118139);
        int i3 = i | (btsVar.k(l) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.k(this) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            btsVar.c0(-1700683550, l);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ffx.b(0, 1, BufferOverflow.SUSPEND);
                btsVar.o0(Q);
            }
            final lz40 lz40Var = (lz40) Q;
            Object Q2 = btsVar.Q();
            c12 c12Var = c12.a;
            if (Q2 == o430Var) {
                Q2 = androidx.compose.runtime.f.j(c12Var);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new defpackage.q(9, this, tlsVar, oz40Var);
                btsVar.o0(Q3);
            }
            tls tlsVar2 = (tls) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new z02();
                btsVar.o0(Q4);
            }
            z02 z02Var = (z02) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = ((ep90) this.a.a).a().s();
                btsVar.o0(Q5);
            }
            com.yandex.passport.api.c cVar = (com.yandex.passport.api.c) Q5;
            int i4 = i3 & 112;
            boolean k = (i4 == 32) | btsVar.k((e12) oz40Var.getValue());
            Object Q6 = btsVar.Q();
            if (k || Q6 == o430Var) {
                Q6 = androidx.compose.runtime.f.d(new sb0(4, this, str, oz40Var));
                btsVar.o0(Q6);
            }
            m3u0 m3u0Var = (m3u0) Q6;
            boolean k2 = btsVar.k((e12) m3u0Var.getValue());
            Object Q7 = btsVar.Q();
            if (k2 || Q7 == o430Var) {
                e12 e12Var = (e12) m3u0Var.getValue();
                u2 u2Var = new u2();
                this.c.getClass();
                u2Var.b = KPassportEnvironment.PRODUCTION;
                i2 = i3;
                u2Var.c = g8e.z("project", "go");
                u2Var.w = false;
                u2Var.x = e12Var instanceof d12;
                btsVar.o0(u2Var);
                Q7 = u2Var;
            } else {
                i2 = i3;
            }
            c3 c3Var = (c3) Q7;
            Object value = oz40Var.getValue();
            boolean e = (i4 == 32) | btsVar.e(lz40Var);
            Object Q8 = btsVar.Q();
            if (e || Q8 == o430Var) {
                Q8 = new AmProfileScreenHolder$KeyedScreen$1$1(oz40Var, str, lz40Var, null);
                btsVar.o0(Q8);
            }
            zpn.f(str, value, (wls) Q8, btsVar);
            boolean e2 = btsVar.e(z02Var);
            Object Q9 = btsVar.Q();
            if (e2 || Q9 == o430Var) {
                Q9 = new eo1(4, z02Var);
                btsVar.o0(Q9);
            }
            zpn.a(zy11.a, (tls) Q9, btsVar);
            sb2.b(f5z.a.a(z02Var), wwg.S(-582830610, true, new rb0(cVar, c3Var, tlsVar2, lz40Var), btsVar), btsVar, 48);
            Object Q10 = btsVar.Q();
            if (Q10 == o430Var) {
                Q10 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q10);
            }
            final tse tseVar = (tse) Q10;
            e12 e12Var2 = (e12) m3u0Var.getValue();
            if (jl40.l(e12Var2, b12.a)) {
                btsVar.e0(-1700639746);
                boolean e3 = btsVar.e(tseVar) | btsVar.e(lz40Var);
                Object Q11 = btsVar.Q();
                if (e3 || Q11 == o430Var) {
                    Q11 = new sls() { // from class: com.yandex.go.user_profile.ui.am.t
                        @Override // defpackage.sls
                        public final Object invoke() {
                            com.yandex.go.coroutines.b.g(tse.this, null, null, new AmProfileScreenHolder$KeyedScreen$4$1$1(lz40Var, null), 3);
                            return zy11.a;
                        }
                    };
                    btsVar.o0(Q11);
                }
                a((sls) Q11, btsVar, (i2 >> 6) & 112);
                z = false;
                btsVar.t(false);
            } else {
                z = false;
                if (jl40.l(e12Var2, c12Var)) {
                    btsVar.e0(-1700635639);
                    c(btsVar, (i2 >> 9) & 14);
                    btsVar.t(false);
                } else {
                    if (!jl40.l(e12Var2, d12.a)) {
                        throw unr0.y(-1700641425, btsVar, false);
                    }
                    btsVar.e0(-1700634177);
                    btsVar.t(false);
                }
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) this, (Object) l, (Object) str, tlsVar, i, 6);
        }
    }

    public final void c(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-308187554);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(this) : btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 c = bzk0.c(ljs0.c, AppColor$Palette.Background, qke.q);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = a12.c;
                btsVar.o0(Q);
            }
            f530 a = exw0.a(c, zy11.a, (PointerInputEventHandler) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            ffb1.d(cj6.a.a(c530.a, x4c.y), SpinnerState.LOADING, null, btsVar, 48, 4);
            btsVar.t(true);
            e(btsVar, i2 & 14);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new y02(this, i, 0);
        }
    }

    public final void d(f12 f12Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-17741591);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f12Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(this) : btsVar.e(this) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qy20.a(null, qy20.c, qy20.d, true, wwg.S(-964908793, true, new qk30(this, f12Var, tlsVar, i3), btsVar), btsVar, 27648, 1);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(this, f12Var, tlsVar, i, 6);
        }
    }

    public final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(218482164);
        int i2 = i & 1;
        if (btsVar.V(i2, i2 != 0)) {
            o2d.a.getClass();
            crb1.b(null, null, null, null, null, o2d.b, null, btsVar, ImageMetadata.EDGE_MODE, 95);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new y02(this, i, 1);
        }
    }
}
