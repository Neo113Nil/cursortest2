package com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.b;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bb1;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.d190;
import defpackage.did;
import defpackage.dmw0;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.is8;
import defpackage.jeb1;
import defpackage.js41;
import defpackage.jx41;
import defpackage.l690;
import defpackage.ljs0;
import defpackage.lnb1;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.m810;
import defpackage.o430;
import defpackage.ohd;
import defpackage.pdb1;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qjf0;
import defpackage.qv10;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.sw41;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn41;
import defpackage.tse;
import defpackage.uo5;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.y7m;
import defpackage.y9m;
import defpackage.ys0;
import defpackage.yx40;
import defpackage.z640;
import defpackage.z910;
import defpackage.zeb1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(f530 f530Var, float f, int i, sls slsVar, jx41 jx41Var, boolean z, fid fidVar, int i2) {
        f530 f530Var2;
        int i3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-147059731);
        if ((i2 & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i2;
        } else {
            f530Var2 = f530Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar2.b(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar2.c(i) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(jx41Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar2.a(z) ? 131072 : 65536;
        }
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            f530 h = ljs0.h(f530Var, f);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new is8(i, slsVar, 18);
                btsVar2.o0(Q);
            }
            f530 m = an91.m(d.a(h, (tls) Q), 16.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
            jeb1.f(jx41Var.a, an91.m(c530.a, 8.0f, 0.0f, 2), z ? AppColor$Palette.Text : AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 48, 0, 16376);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z640(f530Var2, f, i, slsVar, jx41Var, z, i2);
        }
    }

    public static final void b(List list, final int i, final tls tlsVar, final tls tlsVar2, final f530 f530Var, int i2, float f, d190 d190Var, fid fidVar, final int i3) {
        bts btsVar;
        final int i4;
        final float f2;
        final d190 d190Var2;
        aii0 v;
        wls wlsVar;
        float f3;
        dmw0 dmw0Var;
        final d190 d190Var3;
        int i5;
        int i6;
        int i7;
        d190 d190Var4;
        androidx.compose.foundation.lazy.b bVar;
        float f4;
        Throwable th;
        final float f5;
        final List list2 = list;
        uo5 uo5Var = x4c.b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-661315461);
        dmw0 dmw0Var2 = btsVar2.a;
        int i8 = i3 | (btsVar2.e(list2) ? 4 : 2) | (btsVar2.c(i) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128) | (btsVar2.e(tlsVar2) ? 2048 : 1024) | 5963776;
        if (btsVar2.V(i8 & 1, (4793491 & i8) != 4793490)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                f3 = 56.0f;
                dmw0Var = dmw0Var2;
                d190Var3 = new d190(tje.n(AppColor$Palette.BgMinor, btsVar2));
                i5 = i8 & (-29360129);
                i6 = 6;
            } else {
                btsVar2.Y();
                f3 = f;
                i5 = i8 & (-29360129);
                dmw0Var = dmw0Var2;
                i6 = i2;
                d190Var3 = d190Var;
            }
            btsVar2.u();
            if (list2.isEmpty()) {
                btsVar2.e0(-233576694);
                z910 d = pi6.d(uo5Var, false);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar2, f530Var);
                ohd.G1.getClass();
                sls slsVar = androidx.compose.ui.node.d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                qje.M(btsVar2, androidx.compose.ui.node.d.h);
                qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                btsVar2.t(true);
                btsVar2.t(false);
                v = btsVar2.v();
                if (v != null) {
                    final int i9 = i6;
                    final int i10 = 0;
                    final float f6 = f3;
                    wlsVar = new wls(list2, i, tlsVar, tlsVar2, f530Var, i9, f6, d190Var3, i3, i10) { // from class: kx41
                        public final /* synthetic */ float A;
                        public final /* synthetic */ d190 B;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ List b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ tls x;
                        public final /* synthetic */ f530 y;
                        public final /* synthetic */ int z;

                        {
                            this.a = i10;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i11) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(24577);
                                    b.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(24577);
                                    b.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            float f7 = f3;
            int i11 = i6;
            d190 d190Var5 = d190Var3;
            btsVar2.e0(-233518073);
            btsVar2.t(false);
            Object[] objArr = new Object[0];
            tig0 c = zeb1.c(new sw41(1), new js41(8));
            boolean a = btsVar2.a(false) | btsVar2.c(0);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                Q = new tn41(16);
                btsVar2.o0(Q);
            }
            final c cVar = (c) cvw.W(objArr, c, (sls) Q, btsVar2, 0);
            int b = qv10.b(i11, 2, 2, 1);
            float f8 = b * f7;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q2);
            }
            tse tseVar = (tse) Q2;
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.g(m810.b(fwiVar.w0(f7)));
                btsVar2.o0(Q3);
            }
            boolean c2 = btsVar2.c(b) | btsVar2.c(((yx40) Q3).getIntValue());
            Object Q4 = btsVar2.Q();
            if (c2 || Q4 == o430Var) {
                Q4 = Float.valueOf((fwiVar.w0(f8) - r14.getIntValue()) / 2.0f);
                btsVar2.o0(Q4);
            }
            float floatValue = ((Number) Q4).floatValue();
            boolean c3 = btsVar2.c(b);
            Object Q5 = btsVar2.Q();
            if (c3 || Q5 == o430Var) {
                Q5 = ly3.h(fwiVar.I(Math.abs(floatValue)), btsVar2);
            }
            float f9 = ((y7m) Q5).a;
            androidx.compose.foundation.lazy.b bVar2 = cVar.c;
            Boolean valueOf = Boolean.valueOf(bVar2.j.a());
            dmw0 dmw0Var3 = dmw0Var;
            boolean k = ((i5 & 7168) == 2048) | btsVar2.k(cVar);
            Object Q6 = btsVar2.Q();
            if (k || Q6 == o430Var) {
                Q6 = new WheelDatePickerKt$WheelDatePicker$3$1(tlsVar2, cVar, null);
                btsVar2.o0(Q6);
            }
            zpn.e(btsVar2, (wls) Q6, valueOf);
            int size = list2.size();
            boolean c4 = btsVar2.c(size);
            Object Q7 = btsVar2.Q();
            if (c4 || Q7 == o430Var) {
                Q7 = f.d(new ys0(cVar, size, 18));
                btsVar2.o0(Q7);
            }
            int intValue = ((Number) ((m3u0) Q7).getValue()).intValue();
            Integer valueOf2 = Integer.valueOf(i);
            int i12 = i5 & 112;
            boolean e = btsVar2.e(list2) | (i12 == 32) | btsVar2.k(cVar);
            Object Q8 = btsVar2.Q();
            if (e || Q8 == o430Var) {
                i7 = intValue;
                Q8 = new WheelDatePickerKt$WheelDatePicker$4$1(list2, i, cVar, null);
                btsVar2.o0(Q8);
            } else {
                i7 = intValue;
            }
            zpn.e(btsVar2, (wls) Q8, valueOf2);
            Boolean valueOf3 = Boolean.valueOf(bVar2.j.a());
            boolean k2 = btsVar2.k(cVar) | btsVar2.e(list2) | (i12 == 32) | ((i5 & 896) == 256);
            Object Q9 = btsVar2.Q();
            if (k2 || Q9 == o430Var) {
                d190Var4 = d190Var5;
                bVar = bVar2;
                f4 = f9;
                th = null;
                WheelDatePickerKt$WheelDatePicker$5$1 wheelDatePickerKt$WheelDatePicker$5$1 = new WheelDatePickerKt$WheelDatePicker$5$1(cVar, list2, i, tlsVar, null);
                cVar = cVar;
                list2 = list2;
                btsVar2.o0(wheelDatePickerKt$WheelDatePicker$5$1);
                Q9 = wheelDatePickerKt$WheelDatePicker$5$1;
            } else {
                d190Var4 = d190Var5;
                bVar = bVar2;
                f4 = f9;
                th = null;
            }
            zpn.e(btsVar2, (wls) Q9, valueOf3);
            f530 a2 = lnb1.a(ljs0.e(f530Var, f8 / 1.5313935f), Orientation.Vertical);
            z910 d3 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar2, a2);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (dmw0Var3 == null) {
                cma1.b0();
                throw th;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d3);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode2));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d4);
            androidx.compose.foundation.lazy.b bVar3 = cVar.c;
            f530 h = ljs0.h(c530.a, f8);
            boolean b2 = btsVar2.b(floatValue) | btsVar2.k(d190Var4);
            Object Q10 = btsVar2.Q();
            if (b2 || Q10 == o430Var) {
                Q10 = new qjf0(floatValue, d190Var4, 6);
                btsVar2.o0(Q10);
            }
            f530 h2 = bb1.h(h, (tls) Q10);
            boolean k3 = btsVar2.k(cVar) | btsVar2.e(tseVar);
            Object Q11 = btsVar2.Q();
            if (k3 || Q11 == o430Var) {
                Q11 = new y9m(3, cVar, tseVar);
                btsVar2.o0(Q11);
            }
            f530 a3 = exw0.a(h2, zy11.a, (PointerInputEventHandler) Q11);
            l690 b3 = an91.b(0.0f, f4, 1);
            androidx.compose.foundation.gestures.snapping.a c5 = pdb1.c(bVar, btsVar2);
            final int i13 = i7;
            boolean e2 = btsVar2.e(list2) | btsVar2.k(cVar) | btsVar2.c(i13);
            Object Q12 = btsVar2.Q();
            if (e2 || Q12 == o430Var) {
                f5 = f7;
                Q12 = new tls() { // from class: lx41
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        List list3 = list2;
                        ((m6y) ((u6y) obj)).f(list3.size(), null, new pcx0(list3, 11), new a(2039820996, new mx41(list3, f5, cVar, i13), true));
                        return zy11.a;
                    }
                };
                btsVar2.o0(Q12);
            } else {
                f5 = f7;
            }
            tls tlsVar3 = (tls) Q12;
            i4 = i11;
            adb1.a(a3, bVar3, b3, null, null, c5, false, null, tlsVar3, btsVar2, 0, 440);
            btsVar = btsVar2;
            btsVar.t(true);
            f2 = f5;
            d190Var2 = d190Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            i4 = i2;
            f2 = f;
            d190Var2 = d190Var;
        }
        v = btsVar.v();
        if (v != null) {
            final int i14 = 1;
            wlsVar = new wls(list2, i, tlsVar, tlsVar2, f530Var, i4, f2, d190Var2, i3, i14) { // from class: kx41
                public final /* synthetic */ float A;
                public final /* synthetic */ d190 B;
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ tls x;
                public final /* synthetic */ f530 y;
                public final /* synthetic */ int z;

                {
                    this.a = i14;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i112) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(24577);
                            b.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(24577);
                            b.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
