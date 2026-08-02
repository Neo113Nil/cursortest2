package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkTextWithEndContent.kt */
/* loaded from: classes5.dex */
public final class jrv0 {
    public static final void a(final String str, final q630 q630Var, final long j, final int i, final a.e eVar, final frv0 frv0Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-1314198948);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.J(q630Var) ? 2048 : 1024) | (M.p(j) ? 16384 : 8192) | 196608 | (M.o(i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(frv0Var) ? 67108864 : 33554432);
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1314198948, i3, -1, "com.vk.profile.design.view.profileheader.VkTextWithEndContent (VkTextWithEndContent.kt:32)");
            }
            final wjo0 a = xjo0.a(0, 1, M);
            ua8.a(q630Var, null, false, kai.c(-612831290, new yzs() { // from class: xsna.hrv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4;
                    String str2;
                    cri.a.d dVar;
                    q630.a aVar2;
                    cri.a.e eVar2;
                    cri.a.C2678a c2678a;
                    cri.a.b bVar;
                    LayoutNode.a aVar3;
                    cri.a.c cVar;
                    pdo0 pdo0Var;
                    long j2;
                    float f;
                    frv0 frv0Var2;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(va8Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-612831290, intValue, -1, "com.vk.profile.design.view.profileheader.VkTextWithEndContent.<anonymous> (VkTextWithEndContent.kt:38)");
                        }
                        int i5 = o6j.i(va8Var.f());
                        frv0 frv0Var3 = frv0Var;
                        nmo0 nmo0Var = frv0Var3.a;
                        long b = s6j.b(0, i5, 0, 0, 13);
                        wjo0 wjo0Var = wjo0.this;
                        String str3 = str;
                        m540 m540Var = wjo0.a(wjo0Var, str3, nmo0Var, Integer.MAX_VALUE, b, 968).b;
                        int i6 = m540Var.f;
                        int f2 = m540Var.f(Math.min(1, i6 - 1));
                        q630.a aVar5 = q630.a.a;
                        q630 f3 = txj0.f(aVar5, 1.0f);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c = qri.c(aVar4, f3);
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
                        cri.a.c cVar2 = cri.a.f;
                        k9q0.w(aVar4, a2, cVar2);
                        cri.a.e eVar3 = cri.a.e;
                        k9q0.w(aVar4, D, eVar3);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar2 = cri.a.g;
                        k9q0.w(aVar4, valueOf, bVar2);
                        cri.a.C2678a c2678a2 = cri.a.h;
                        k9q0.t(aVar4, c2678a2);
                        cri.a.d dVar2 = cri.a.d;
                        k9q0.w(aVar4, c, dVar2);
                        long j3 = j;
                        int i7 = i;
                        if (f2 != 0) {
                            aVar4.K(627253509);
                            pdo0Var = null;
                            frv0Var2 = frv0Var3;
                            j2 = j3;
                            aVar3 = aVar6;
                            i4 = f2;
                            str2 = str3;
                            dVar = dVar2;
                            aVar2 = aVar5;
                            f = 1.0f;
                            eVar2 = eVar3;
                            c2678a = c2678a2;
                            bVar = bVar2;
                            cVar = cVar2;
                            yqv0.c(str3.substring(0, f2), txj0.f(aVar5, 1.0f), j2, null, null, 0, i7, null, 0, false, 0, i6 - 1, null, frv0Var2, aVar4, 48, 0, 6064);
                            aVar4 = aVar4;
                        } else {
                            i4 = f2;
                            str2 = str3;
                            dVar = dVar2;
                            aVar2 = aVar5;
                            eVar2 = eVar3;
                            c2678a = c2678a2;
                            bVar = bVar2;
                            aVar3 = aVar6;
                            cVar = cVar2;
                            pdo0Var = null;
                            j2 = j3;
                            f = 1.0f;
                            frv0Var2 = frv0Var3;
                            aVar4.K(625264146);
                        }
                        aVar4.j();
                        q630 f4 = txj0.f(aVar2, f);
                        androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(eVar, dt1.a.l, aVar4, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c2 = qri.c(aVar4, f4);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar3);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a3, cVar);
                        k9q0.w(aVar4, D2, eVar2);
                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c2, dVar);
                        String substring = str2.substring(i4);
                        if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        androidx.compose.runtime.a aVar7 = aVar4;
                        yqv0.c(substring, new xpy(f, false), j2, pdo0Var, null, 0, i7, null, 2, false, 0, 1, null, frv0Var2, aVar7, 0, 48, 5808);
                        jaiVar.invoke(aVar7, 0);
                        aVar7.G();
                        aVar7.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 9) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, q630Var, j, i, eVar, frv0Var, jaiVar, i2) { // from class: xsna.irv0
                public final /* synthetic */ String b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ a.e f;
                public final /* synthetic */ frv0 g;
                public final /* synthetic */ jai h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(817889713);
                    jrv0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
