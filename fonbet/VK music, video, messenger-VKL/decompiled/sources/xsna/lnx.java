package xsna;

import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tra0;

/* compiled from: InternalTabs.kt */
/* loaded from: classes17.dex */
public final class lnx {
    public static final dtp0 a = jq2.d(250, 0, luo.a, 2);

    public static final void a(final float f, final ue2 ue2Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(870481695);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.J(ue2Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(870481695, i2, -1, "com.vk.core.compose.component.internal.Fade (InternalTabs.kt:436)");
            }
            ja8.a(hr80.l(txj0.s(q630Var, 16, f), ue2Var, null, 6), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, ue2Var, q630Var, i) { // from class: xsna.knx
                public final /* synthetic */ float b;
                public final /* synthetic */ ue2 c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    lnx.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, final long j, final float f, final float f2, final q630 q630Var, boolean z, final float f3, long j2, final jai jaiVar, final jai jaiVar2, final yzs yzsVar, final wzs wzsVar, final jai jaiVar3, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        float f4;
        float f5;
        boolean z2;
        int i5;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        final long j3;
        androidx.compose.runtime.f s;
        int i6;
        long a2;
        androidx.compose.runtime.a M = aVar.M(88237030);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.p(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f4 = f;
            i4 |= M.n(f4) ? 256 : 128;
        } else {
            f4 = f;
        }
        if ((i2 & 3072) == 0) {
            f5 = f2;
            i4 |= M.n(f5) ? 2048 : 1024;
        } else {
            f5 = f2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            z2 = z;
            i4 |= M.l(z2) ? 131072 : 65536;
            if ((i2 & 1572864) == 0) {
                i4 |= M.n(f3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((i2 & 12582912) == 0) {
                i4 |= 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i4 |= M.y(jaiVar) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) == 0) {
                i4 |= M.y(jaiVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            i5 = 384 | (!M.y(yzsVar) ? 4 : 2) | (!M.y(wzsVar) ? 32 : 16);
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i5 & 147) != 146)) {
                M.h();
                aVar2 = M;
                z3 = z2;
                j3 = j2;
            } else {
                M.V();
                if ((i2 & 1) == 0 || M.i()) {
                    if (i7 != 0) {
                        z2 = true;
                    }
                    i6 = i4 & (-29360129);
                    a2 = l9g.a((i4 >> 3) & 14, j, M);
                } else {
                    M.h();
                    i6 = i4 & (-29360129);
                    a2 = j2;
                }
                final boolean z4 = z2;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(88237030, i6, i5, "com.vk.core.compose.component.internal.InternalScrollableTabRow (InternalTabs.kt:264)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new khx();
                    M.R(x);
                }
                final khx khxVar = (khx) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new anx(khxVar);
                    M.R(x2);
                }
                final anx anxVar = (anx) x2;
                final float f6 = f4;
                final float f7 = f5;
                uov0.a(q630Var, null, j, a2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1050359507, new wzs() { // from class: xsna.gnx
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        yzs yzsVar2;
                        int i8;
                        float f8;
                        wzs wzsVar2;
                        final nhh0 nhh0Var;
                        wzs wzsVar3;
                        int i9;
                        q630.a aVar3;
                        Object obj3;
                        final rg50 rg50Var;
                        int i10;
                        int i11;
                        int i12;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1050359507, intValue, -1, "com.vk.core.compose.component.internal.InternalScrollableTabRow.<anonymous> (InternalTabs.kt:272)");
                            }
                            jgh0 x3 = p490.x(aVar4);
                            Object x4 = aVar4.x();
                            a.C0011a.C0012a c0012a2 = a.C0011a.a;
                            if (x4 == c0012a2) {
                                x4 = bap.j(EmptyCoroutineContext.b, aVar4);
                                aVar4.R(x4);
                            }
                            yvj yvjVar = (yvj) x4;
                            boolean J = aVar4.J(x3) | aVar4.J(yvjVar);
                            Object x5 = aVar4.x();
                            if (J || x5 == c0012a2) {
                                x5 = new nhh0(x3, yvjVar);
                                aVar4.R(x5);
                            }
                            nhh0 nhh0Var2 = (nhh0) x5;
                            aVar4.K(-78153870);
                            q630.a aVar5 = q630.a.a;
                            q630 f9 = txj0.f(aVar5, 1.0f);
                            yzs yzsVar3 = yzs.this;
                            float f10 = f6;
                            if (yzsVar3 != null) {
                                yzsVar2 = yzsVar3;
                                q630 g = f9.g(s200.H(aVar5, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
                                if (g != null) {
                                    f9 = g;
                                }
                            } else {
                                yzsVar2 = yzsVar3;
                            }
                            wzs wzsVar4 = wzsVar;
                            if (wzsVar4 != null) {
                                bpn0 bpn0Var = npv0.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-50412826, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.getTabsRightPaddingWithFixedIcon (VkTabsDefault.kt:211)");
                                }
                                aVar4.K(1390226751);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1023965441, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.fixedIconOuterPaddingRight (VkTabsDefault.kt:203)");
                                }
                                float f11 = kqu0.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                float f12 = f10 - kqu0.v;
                                float f13 = 0;
                                if (f12 < f13) {
                                    f12 = f13;
                                }
                                aVar4.j();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                i8 = -1;
                                f8 = f10;
                                wzsVar2 = wzsVar4;
                                q630 g2 = f9.g(s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11));
                                if (g2 != null) {
                                    f9 = g2;
                                }
                            } else {
                                i8 = -1;
                                f8 = f10;
                                wzsVar2 = wzsVar4;
                            }
                            aVar4.j();
                            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, 1, f9);
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar4, 48);
                            int hashCode = Long.hashCode(n34.n(aVar4));
                            sy90 D = aVar4.D();
                            q630 c = qri.c(aVar4, F);
                            cri.h7.getClass();
                            LayoutNode.a aVar6 = cri.a.b;
                            if (aVar4.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar4.H();
                            if (aVar4.L()) {
                                aVar4.I(aVar6);
                            } else {
                                aVar4.f();
                            }
                            cri.a.c cVar = cri.a.f;
                            k9q0.w(aVar4, a3, cVar);
                            cri.a.e eVar = cri.a.e;
                            k9q0.w(aVar4, D, eVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            k9q0.w(aVar4, valueOf, bVar);
                            cri.a.C2678a c2678a = cri.a.h;
                            k9q0.t(aVar4, c2678a);
                            cri.a.d dVar = cri.a.d;
                            k9q0.w(aVar4, c, dVar);
                            final int i13 = i;
                            final anx anxVar2 = anxVar;
                            if (yzsVar2 == null) {
                                aVar4.K(-243831338);
                                aVar4.j();
                                wzsVar3 = wzsVar2;
                                nhh0Var = nhh0Var2;
                                i9 = 0;
                            } else {
                                aVar4.K(-243831337);
                                nhh0Var = nhh0Var2;
                                cp10 d = ja8.d(dt1.a.b, false);
                                int hashCode2 = Long.hashCode(n34.n(aVar4));
                                wzsVar3 = wzsVar2;
                                sy90 D2 = aVar4.D();
                                q630 c2 = qri.c(aVar4, aVar5);
                                if (aVar4.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar4.H();
                                if (aVar4.L()) {
                                    aVar4.I(aVar6);
                                } else {
                                    aVar4.f();
                                }
                                k9q0.w(aVar4, d, cVar);
                                k9q0.w(aVar4, D2, eVar);
                                ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                                k9q0.w(aVar4, c2, dVar);
                                yzsVar2.invoke(anxVar2, aVar4, 6);
                                aVar4.G();
                                i9 = 0;
                                lnx.d(i13 != 0, aVar4, 0);
                                s3q0 s3q0Var = s3q0.a;
                                aVar4.j();
                            }
                            azl azlVar = (azl) aVar4.r(uvi.h);
                            Object x6 = aVar4.x();
                            if (x6 == c0012a2) {
                                x6 = androidx.compose.runtime.k.b(new pco(i9));
                                aVar4.R(x6);
                            }
                            wh50 wh50Var = (wh50) x6;
                            Object x7 = aVar4.x();
                            if (x7 == c0012a2) {
                                x7 = androidx.compose.runtime.i.a(i8);
                                aVar4.R(x7);
                            }
                            rg50 rg50Var2 = (rg50) x7;
                            final yzs yzsVar4 = yzsVar2;
                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            xpy xpyVar = new xpy(1.0f, true);
                            boolean J2 = aVar4.J(azlVar);
                            Object x8 = aVar4.x();
                            if (J2 || x8 == c0012a2) {
                                x8 = new u9(19, azlVar, wh50Var);
                                aVar4.R(x8);
                            }
                            q630 A = hr80.A(xpyVar, (izs) x8);
                            cp10 d2 = ja8.d(dt1.a.b, false);
                            int hashCode3 = Long.hashCode(n34.n(aVar4));
                            sy90 D3 = aVar4.D();
                            q630 c3 = qri.c(aVar4, A);
                            if (aVar4.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar4.H();
                            if (aVar4.L()) {
                                aVar4.I(aVar6);
                            } else {
                                aVar4.f();
                            }
                            k9q0.w(aVar4, d2, cVar);
                            k9q0.w(aVar4, D3, eVar);
                            ur.d(hashCode3, aVar4, bVar, aVar4, c2678a);
                            k9q0.w(aVar4, c3, dVar);
                            q630 f14 = txj0.f(aVar5, 1.0f);
                            ty6 ty6Var = dt1.a.e;
                            q630 b = egi0.b(p490.r(txj0.B(f14, ty6Var, 2), x3, 14), false, new t6c0(4));
                            final float f15 = f8;
                            boolean n = aVar4.n(f15);
                            final float f16 = f3;
                            boolean n2 = n | aVar4.n(f16);
                            final jai jaiVar4 = jaiVar3;
                            final wzs wzsVar5 = wzsVar3;
                            boolean J3 = n2 | aVar4.J(jaiVar4) | aVar4.J(yzsVar4) | aVar4.J(wzsVar5);
                            final boolean z5 = z4;
                            boolean l = J3 | aVar4.l(z5);
                            final jai jaiVar5 = jaiVar;
                            boolean J4 = l | aVar4.J(jaiVar5);
                            final jai jaiVar6 = jaiVar2;
                            boolean J5 = J4 | aVar4.J(jaiVar6) | aVar4.y(nhh0Var) | aVar4.o(i13);
                            Object x9 = aVar4.x();
                            if (J5 || x9 == c0012a2) {
                                aVar3 = aVar5;
                                final khx khxVar2 = khxVar;
                                rg50Var = rg50Var2;
                                obj3 = new wzs() { // from class: xsna.jnx
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj4, Object obj5) {
                                        final ztm0 ztm0Var = (ztm0) obj4;
                                        final o6j o6jVar = (o6j) obj5;
                                        final int r0 = ztm0Var.r0(f15);
                                        final int r02 = ztm0Var.r0(f16);
                                        List<zo10> t1 = ztm0Var.t1(ntn0.Tabs, new jai(1934988955, new z85(4, jaiVar4, anxVar2), true));
                                        final ArrayList arrayList = new ArrayList(c5g.u(t1, 10));
                                        Iterator<T> it = t1.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((zo10) it.next()).N(o6jVar.a));
                                        }
                                        rg50Var.C(e43.h(arrayList));
                                        final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                        final yzs yzsVar5 = yzsVar4;
                                        wzs wzsVar6 = wzsVar5;
                                        ref$IntRef.element = (yzsVar5 == null || wzsVar6 == null) ? (yzsVar5 == null && wzsVar6 == null) ? (r0 * 2) + ((arrayList.size() - 1) * r02) : ((arrayList.size() - 1) * r02) + r0 : (arrayList.size() - 1) * r02;
                                        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            tra0 tra0Var = (tra0) it2.next();
                                            ref$IntRef.element += tra0Var.b;
                                            ref$IntRef2.element = Math.max(ref$IntRef2.element, tra0Var.c);
                                        }
                                        int i14 = ref$IntRef.element;
                                        int i15 = ref$IntRef2.element;
                                        final boolean z6 = z5;
                                        final jai jaiVar7 = jaiVar6;
                                        final nhh0 nhh0Var3 = nhh0Var;
                                        final int i16 = i13;
                                        final jai jaiVar8 = jaiVar5;
                                        final khx khxVar3 = khxVar2;
                                        return ztm0Var.Q(i14, i15, jgp.b, new izs() { // from class: xsna.dnx
                                            /* JADX WARN: Type inference failed for: r5v12, types: [kotlin.coroutines.d, kotlinx.coroutines.CoroutineStart, xsna.spj] */
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj6) {
                                                Throwable th;
                                                tra0.a aVar7 = (tra0.a) obj6;
                                                ArrayList arrayList2 = new ArrayList();
                                                Integer valueOf2 = Integer.valueOf(r0);
                                                if (yzsVar5 != null) {
                                                    valueOf2 = null;
                                                }
                                                int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
                                                ArrayList arrayList3 = arrayList;
                                                Iterator it3 = arrayList3.iterator();
                                                int i17 = intValue2;
                                                int i18 = 0;
                                                while (true) {
                                                    boolean hasNext = it3.hasNext();
                                                    int i19 = r02;
                                                    if (!hasNext) {
                                                        boolean z7 = z6;
                                                        ztm0 ztm0Var2 = ztm0Var;
                                                        jai jaiVar9 = jaiVar8;
                                                        khx khxVar4 = khxVar3;
                                                        o6j o6jVar2 = o6jVar;
                                                        if (z7) {
                                                            th = null;
                                                            Iterator<T> it4 = ztm0Var2.t1(ntn0.Indicator, new jai(2094405415, new yi1(jaiVar9, khxVar4, arrayList2, 4), true)).iterator();
                                                            while (it4.hasNext()) {
                                                                tra0.a.x(aVar7, ((zo10) it4.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 10)), 0, 0);
                                                            }
                                                        } else {
                                                            th = null;
                                                        }
                                                        int i20 = intValue2;
                                                        int i21 = 0;
                                                        for (Object obj7 : arrayList3) {
                                                            int i22 = i21 + 1;
                                                            if (i21 < 0) {
                                                                e43.t();
                                                                throw th;
                                                            }
                                                            tra0 tra0Var2 = (tra0) obj7;
                                                            tra0.a.x(aVar7, tra0Var2, i20, 0);
                                                            i20 += i21 < e43.h(arrayList3) ? tra0Var2.b + i19 : tra0Var2.b;
                                                            i21 = i22;
                                                        }
                                                        for (zo10 zo10Var : ztm0Var2.t1(ntn0.Divider, jaiVar7)) {
                                                            long j4 = o6jVar2.a;
                                                            int i23 = ref$IntRef.element;
                                                            tra0 N = zo10Var.N(o6j.b(i23, j4, i23, 0, 0, 8));
                                                            tra0.a.x(aVar7, N, 0, ref$IntRef2.element - N.c);
                                                        }
                                                        if (!z7) {
                                                            Iterator<T> it5 = ztm0Var2.t1(ntn0.Indicator, new jai(1708707152, new ss0(jaiVar9, khxVar4, arrayList2), true)).iterator();
                                                            while (it5.hasNext()) {
                                                                tra0.a.x(aVar7, ((zo10) it5.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 10)), 0, 0);
                                                            }
                                                        }
                                                        nhh0 nhh0Var4 = nhh0Var3;
                                                        jgh0 jgh0Var = nhh0Var4.a;
                                                        Integer num = nhh0Var4.c;
                                                        int i24 = i16;
                                                        if (num == null || num.intValue() != i24) {
                                                            nhh0Var4.c = Integer.valueOf(i24);
                                                            dtn0 dtn0Var = (dtn0) j5g.b0(i24, arrayList2);
                                                            if (dtn0Var != null) {
                                                                dtn0 dtn0Var2 = (dtn0) j5g.i0(arrayList2);
                                                                int r03 = ztm0Var2.r0(dtn0Var2.a + dtn0Var2.b) + intValue2;
                                                                int f17 = r03 - jgh0Var.f();
                                                                int r04 = ztm0Var2.r0(dtn0Var.a) - ((f17 / 2) - (ztm0Var2.r0(dtn0Var.b) / 2));
                                                                int i25 = r03 - f17;
                                                                if (i25 < 0) {
                                                                    i25 = 0;
                                                                }
                                                                int g3 = swe0.g(r04, 0, i25);
                                                                if (((wak0) jgh0Var.a).getIntValue() != g3) {
                                                                    ?? r5 = th;
                                                                    myc0.h(nhh0Var4.b, r5, r5, new mhh0(nhh0Var4, g3, r5), 3);
                                                                }
                                                            }
                                                        }
                                                        return s3q0.a;
                                                    }
                                                    Object next = it3.next();
                                                    int i26 = i18 + 1;
                                                    if (i18 < 0) {
                                                        e43.t();
                                                        throw null;
                                                    }
                                                    tra0 tra0Var3 = (tra0) next;
                                                    arrayList2.add(new dtn0(aVar7.j1(i17), aVar7.j1(tra0Var3.b)));
                                                    i17 += i18 < e43.h(arrayList3) ? tra0Var3.b + i19 : tra0Var3.b;
                                                    i18 = i26;
                                                }
                                            }
                                        });
                                    }
                                };
                                i10 = i13;
                                aVar4.R(obj3);
                            } else {
                                obj3 = x9;
                                aVar3 = aVar5;
                                rg50Var = rg50Var2;
                                i10 = i13;
                            }
                            xtm0.a(b, (wzs) obj3, aVar4, 0, 0);
                            ra8 ra8Var = ra8.a;
                            if (yzsVar4 == null || i10 == 0) {
                                aVar4.K(-1733759041);
                            } else {
                                aVar4.K(-1717269242);
                                q630 b2 = ra8Var.b(aVar3, ty6Var);
                                float f17 = ((pco) wh50Var.getValue()).b;
                                bpn0 bpn0Var2 = npv0.a;
                                if (androidx.compose.runtime.b.d()) {
                                    i12 = 0;
                                    androidx.compose.runtime.b.f(1483871877, 0, i8, "com.vk.core.compose.component.defaults.VkTabsDefault.<get-fixedTabFadeBrush> (VkTabsDefault.kt:218)");
                                } else {
                                    i12 = 0;
                                }
                                ue2 a4 = dxu0.a(GradientDrawable.Orientation.RIGHT_LEFT, aVar4);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                lnx.a(f17, a4, b2, aVar4, i12);
                            }
                            aVar4.j();
                            if (wzsVar5 == null || i10 == rg50Var.getIntValue()) {
                                aVar4.K(-1733759041);
                            } else {
                                aVar4.K(-1716938937);
                                q630 b3 = ra8Var.b(aVar3, dt1.a.g);
                                float f18 = ((pco) wh50Var.getValue()).b;
                                bpn0 bpn0Var3 = npv0.a;
                                if (androidx.compose.runtime.b.d()) {
                                    i11 = 0;
                                    androidx.compose.runtime.b.f(7036161, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.<get-fixedIconFadeBrush> (VkTabsDefault.kt:221)");
                                } else {
                                    i11 = 0;
                                }
                                ue2 a5 = dxu0.a(GradientDrawable.Orientation.LEFT_RIGHT, aVar4);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                lnx.a(f18, a5, b3, aVar4, i11);
                            }
                            aVar4.j();
                            aVar4.G();
                            if (wzsVar5 == null) {
                                aVar4.K(-238218850);
                            } else {
                                aVar4.K(-238218849);
                                lnx.d(i10 != rg50Var.getIntValue(), aVar4, 0);
                                wzsVar5.invoke(aVar4, 0);
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            aVar4.j();
                            aVar4.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i6 >> 12) & 14) | 1572864 | ((i6 << 3) & 896), 50);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                z3 = z4;
                j3 = a2;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.hnx
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i2 | 1);
                        lnx.b(i, j, f, f2, q630Var, z3, f3, j3, jaiVar, jaiVar2, yzsVar, wzsVar, jaiVar3, (androidx.compose.runtime.a) obj, I, i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i5 = 384 | (!M.y(yzsVar) ? 4 : 2) | (!M.y(wzsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i5 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final long j, final q630 q630Var, boolean z, final float f, final float f2, final float f3, long j2, final jai jaiVar, final jai jaiVar2, final jai jaiVar3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        androidx.compose.runtime.a aVar2;
        final long j3;
        androidx.compose.runtime.f s;
        int i4;
        final boolean z4;
        long j4;
        androidx.compose.runtime.a M = aVar.M(744489839);
        int i5 = (M.p(j) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i5 |= M.l(z2) ? 256 : 128;
            i3 = i5 | (!M.n(f) ? 2048 : 1024) | (!M.n(f2) ? 16384 : 8192) | (!M.n(f3) ? 131072 : 65536) | 524288;
            if (M.t(i3 & 1, (306783379 & i3) == 306783378)) {
                M.h();
                z3 = z2;
                aVar2 = M;
                j3 = j2;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    if (i6 != 0) {
                        z2 = true;
                    }
                    long a2 = l9g.a(i3 & 14, j, M);
                    i4 = i3 & (-3670017);
                    z4 = z2;
                    j4 = a2;
                } else {
                    M.h();
                    i4 = i3 & (-3670017);
                    z4 = z2;
                    j4 = j2;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(744489839, i4, -1, "com.vk.core.compose.component.internal.InternalTabRow (InternalTabs.kt:172)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new khx();
                    M.R(x);
                }
                final khx khxVar = (khx) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new anx(khxVar);
                    M.R(x2);
                }
                final anx anxVar = (anx) x2;
                uov0.a(egi0.b(q630Var, false, new t6c0(4)), null, j, j4, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-813861898, new wzs(f, f2, f3, jaiVar3, z4, jaiVar, jaiVar2, anxVar, khxVar) { // from class: xsna.enx
                    public final /* synthetic */ float b;
                    public final /* synthetic */ float c;
                    public final /* synthetic */ jai d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ jai f;
                    public final /* synthetic */ jai g;
                    public final /* synthetic */ anx h;
                    public final /* synthetic */ khx i;

                    {
                        this.d = jaiVar3;
                        this.e = z4;
                        this.f = jaiVar;
                        this.g = jaiVar2;
                        this.h = anxVar;
                        this.i = khxVar;
                    }

                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-813861898, intValue, -1, "com.vk.core.compose.component.internal.InternalTabRow.<anonymous> (InternalTabs.kt:180)");
                            }
                            aVar3.K(-668919133);
                            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.c, 1, txj0.f(q630.a.a, 1.0f));
                            final jai jaiVar4 = this.d;
                            boolean J = aVar3.J(jaiVar4);
                            final float f4 = this.b;
                            boolean n = J | aVar3.n(f4);
                            final boolean z5 = this.e;
                            boolean l = n | aVar3.l(z5);
                            final jai jaiVar5 = this.f;
                            boolean J2 = l | aVar3.J(jaiVar5);
                            final jai jaiVar6 = this.g;
                            boolean J3 = J2 | aVar3.J(jaiVar6);
                            Object x3 = aVar3.x();
                            if (J3 || x3 == a.C0011a.a) {
                                final anx anxVar2 = this.h;
                                final khx khxVar2 = this.i;
                                wzs wzsVar = new wzs() { // from class: xsna.bnx
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Object obj5;
                                        final ztm0 ztm0Var = (ztm0) obj3;
                                        final o6j o6jVar = (o6j) obj4;
                                        int i7 = o6j.i(o6jVar.a);
                                        List<zo10> t1 = ztm0Var.t1(ntn0.Tabs, new jai(534475473, new o9d(4, jaiVar4, anxVar2), true));
                                        int size = t1.size();
                                        float f5 = f4;
                                        final int r0 = ztm0Var.r0(f5);
                                        final int a3 = jq.a(r0, 2, i7, size);
                                        List<zo10> list = t1;
                                        final ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                        Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((zo10) it.next()).N(o6j.b(a3, o6jVar.a, a3, 0, 0, 12)));
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (it2.hasNext()) {
                                            Object next = it2.next();
                                            if (it2.hasNext()) {
                                                int i8 = ((tra0) next).c;
                                                do {
                                                    Object next2 = it2.next();
                                                    int i9 = ((tra0) next2).c;
                                                    if (i8 < i9) {
                                                        next = next2;
                                                        i8 = i9;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                            obj5 = next;
                                        } else {
                                            obj5 = null;
                                        }
                                        tra0 tra0Var = (tra0) obj5;
                                        final int i10 = tra0Var != null ? tra0Var.c : 0;
                                        final ArrayList arrayList2 = new ArrayList(size);
                                        for (int i11 = 0; i11 < size; i11++) {
                                            arrayList2.add(new dtn0((ztm0Var.j1(a3) * i11) + f5, ztm0Var.j1(a3)));
                                        }
                                        final boolean z6 = z5;
                                        final jai jaiVar7 = jaiVar6;
                                        final jai jaiVar8 = jaiVar5;
                                        final khx khxVar3 = khxVar2;
                                        return ztm0Var.Q(i7, i10, jgp.b, new izs() { // from class: xsna.inx
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj6) {
                                                tra0.a aVar4 = (tra0.a) obj6;
                                                boolean z7 = z6;
                                                ztm0 ztm0Var2 = ztm0Var;
                                                jai jaiVar9 = jaiVar8;
                                                khx khxVar4 = khxVar3;
                                                ArrayList arrayList3 = arrayList2;
                                                o6j o6jVar2 = o6jVar;
                                                if (z7) {
                                                    Iterator<T> it3 = ztm0Var2.t1(ntn0.Indicator, new jai(-1257555082, new fe4(jaiVar9, khxVar4, arrayList3), true)).iterator();
                                                    while (it3.hasNext()) {
                                                        tra0.a.x(aVar4, ((zo10) it3.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 10)), 0, 0);
                                                    }
                                                }
                                                int i12 = 0;
                                                for (Object obj7 : arrayList) {
                                                    int i13 = i12 + 1;
                                                    if (i12 < 0) {
                                                        e43.t();
                                                        throw null;
                                                    }
                                                    tra0.a.x(aVar4, (tra0) obj7, (i12 * a3) + r0, 0);
                                                    i12 = i13;
                                                }
                                                Iterator<T> it4 = ztm0Var2.t1(ntn0.Divider, jaiVar7).iterator();
                                                while (it4.hasNext()) {
                                                    tra0 N = ((zo10) it4.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 11));
                                                    tra0.a.x(aVar4, N, 0, i10 - N.c);
                                                }
                                                if (!z7) {
                                                    Iterator<T> it5 = ztm0Var2.t1(ntn0.Indicator, new jai(1187672287, new opq(jaiVar9, khxVar4, arrayList3, 1), true)).iterator();
                                                    while (it5.hasNext()) {
                                                        tra0.a.x(aVar4, ((zo10) it5.next()).N(o6j.b(0, o6jVar2.a, 0, 0, 0, 10)), 0, 0);
                                                    }
                                                }
                                                return s3q0.a;
                                            }
                                        });
                                    }
                                };
                                aVar3.R(wzsVar);
                                x3 = wzsVar;
                            }
                            xtm0.a(F, (wzs) x3, aVar3, 0, 0);
                            aVar3.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i4 << 6) & 896) | 1572864, 50);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                j3 = j4;
                z3 = z4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.fnx
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        lnx.c(j, q630Var, z3, f, f2, f3, j3, jaiVar, jaiVar2, jaiVar3, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        i3 = i5 | (!M.n(f) ? 2048 : 1024) | (!M.n(f2) ? 16384 : 8192) | (!M.n(f3) ? 131072 : 65536) | 524288;
        if (M.t(i3 & 1, (306783379 & i3) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void d(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1491913860);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1491913860, i2, -1, "com.vk.core.compose.component.internal.TabRowDivider (InternalTabs.kt:423)");
            }
            q630 a2 = o19.a(q630.a.a, z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f = 1;
            bpn0 bpn0Var = npv0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-363442508, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.dividerHeight (VkTabsDefault.kt:175)");
            }
            float f2 = 24;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 s = txj0.s(a2, f, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(182905673, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.dividerColor (VkTabsDefault.kt:179)");
            }
            M.K(-1370444704);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.p().a;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jqu0.a(s, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(z, i) { // from class: xsna.cnx
                public final /* synthetic */ boolean b;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    lnx.d(this.b, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
