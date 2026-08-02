package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.xla0;

/* compiled from: BasePinLockView.kt */
/* loaded from: classes15.dex */
public final class dk6 {
    public static final void a(final jai jaiVar, final jai jaiVar2, final String str, final String str2, final xla0 xla0Var, q630 q630Var, final String str3, final boolean z, final izs izsVar, final gzs gzsVar, int i, androidx.compose.runtime.a aVar, final int i2) {
        final q630 q630Var2;
        final int i3;
        androidx.compose.runtime.a M = aVar.M(638416352);
        int i4 = i2 | (M.J(str) ? 256 : 128) | (M.J(str2) ? 2048 : 1024) | (M.J(xla0Var) ? 16384 : 8192) | 196608 | (M.J(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z) ? 8388608 : 4194304) | (M.y(izsVar) ? 67108864 : 33554432) | (M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i4 & 1, (306783379 & i4) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(638416352, i4, 6, "com.vk.biometrics.lock.impl.presentation.base.view.BasePinLockView (BasePinLockView.kt:54)");
            }
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            if (x == a.C0011a.a) {
                HashSet hashSet = iah0.a;
                x = Boolean.valueOf(fnj.b(context));
                M.R(x);
            }
            final boolean booleanValue = ((Boolean) x).booleanValue();
            q630.a aVar2 = q630.a.a;
            ua8.a(txj0.d(aVar2, 1.0f), null, false, kai.c(1547480138, new yzs() { // from class: xsna.zj6
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:120:0x041e  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x02fa  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x035b  */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wh50 wh50Var;
                    f5j0 f5j0Var;
                    int i5;
                    q630 b;
                    q630 q630Var3;
                    frv0 frv0Var;
                    boolean z2;
                    a.C0011a.C0012a c0012a;
                    wh50 wh50Var2;
                    Object x2;
                    String str4;
                    boolean J;
                    Object x3;
                    bhk0 bhk0Var;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1547480138, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.view.BasePinLockView.<anonymous> (BasePinLockView.kt:61)");
                        }
                        Object x4 = aVar3.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (x4 == c0012a2) {
                            x4 = androidx.compose.runtime.k.b(new bhk0(pco.a(va8Var.g(), (float) 600) <= 0 ? 16 : 60, pco.a(va8Var.j(), (float) 360) <= 0 ? 52 : 72));
                            aVar3.R(x4);
                        }
                        wh50 wh50Var3 = (wh50) x4;
                        if (booleanValue) {
                            if (pco.a(va8Var.g(), va8Var.j()) < 0) {
                                bhk0 bhk0Var2 = (bhk0) wh50Var3.getValue();
                                float g = va8Var.g() / 20;
                                float j = va8Var.j() / ((float) 4.68d);
                                bhk0Var2.getClass();
                                bhk0Var = new bhk0(g, j);
                            } else {
                                bhk0 bhk0Var3 = (bhk0) wh50Var3.getValue();
                                float f = (float) 4.68d;
                                float j2 = va8Var.j() / f;
                                float j3 = va8Var.j() / f;
                                bhk0Var3.getClass();
                                bhk0Var = new bhk0(j2, j3);
                            }
                            wh50Var3.setValue(bhk0Var);
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 d = txj0.d(aVar4, 1.0f);
                        dt1.a.getClass();
                        ty6.a aVar5 = dt1.a.o;
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar5, aVar3, 48);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, d);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar6);
                        } else {
                            aVar3.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar3, a, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar3, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar3, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar3, c, dVar);
                        if (androidx.compose.runtime.b.d()) {
                            wh50Var = wh50Var3;
                            androidx.compose.runtime.b.f(-271038373, 0, -1, "com.vk.biometrics.lock.impl.presentation.base.view.rememberShakeController (BasePinLockView.kt:160)");
                        } else {
                            wh50Var = wh50Var3;
                        }
                        Object x5 = aVar3.x();
                        if (x5 == c0012a2) {
                            x5 = new f5j0();
                            aVar3.R(x5);
                        }
                        f5j0 f5j0Var2 = (f5j0) x5;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        Object x6 = aVar3.x();
                        if (x6 == c0012a2) {
                            x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                            aVar3.R(x6);
                        }
                        wh50 wh50Var4 = (wh50) x6;
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar5, aVar3, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c2 = qri.c(aVar3, aVar4);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar6);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a2, cVar);
                        k9q0.w(aVar3, D2, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c2, dVar);
                        f9t.e(txj0.h(aVar4, ((bhk0) wh50Var.getValue()).a), aVar3, 0);
                        jaiVar.invoke(aVar3, 0);
                        f9t.e(txj0.h(aVar4, 6), aVar3, 6);
                        float f2 = 12;
                        q630 E = s200.E(aVar4, 16, f2);
                        String str5 = str2;
                        if (str5 == null) {
                            aVar3.K(-620490936);
                            aVar3.j();
                            f5j0Var = f5j0Var2;
                            b = null;
                            i5 = 0;
                        } else {
                            aVar3.K(-620490935);
                            boolean J2 = aVar3.J(str5);
                            f5j0Var = f5j0Var2;
                            Object x7 = aVar3.x();
                            if (J2 || x7 == c0012a2) {
                                x7 = new pf5(str5, 1);
                                aVar3.R(x7);
                            }
                            i5 = 0;
                            b = egi0.b(aVar4, false, (izs) x7);
                            aVar3.j();
                        }
                        if (b == null) {
                            b = aVar4;
                        }
                        q630 g2 = E.g(b);
                        if (androidx.compose.runtime.b.d()) {
                            q630Var3 = g2;
                            androidx.compose.runtime.b.f(-473561179, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        } else {
                            q630Var3 = g2;
                        }
                        wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var2 = wuv0Var.X;
                        if (androidx.compose.runtime.b.d()) {
                            frv0Var = frv0Var2;
                            z2 = false;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            frv0Var = frv0Var2;
                            z2 = false;
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        wh50 wh50Var5 = wh50Var;
                        f5j0 f5j0Var3 = f5j0Var;
                        yqv0.c(str, q630Var3, ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar3, 0, 0, 8120);
                        xla0 xla0Var2 = xla0Var;
                        boolean J3 = aVar3.J(xla0Var2) | aVar3.J(f5j0Var3);
                        Object x8 = aVar3.x();
                        if (J3) {
                            c0012a = c0012a2;
                        } else {
                            c0012a = c0012a2;
                            if (x8 != c0012a) {
                                wh50Var2 = wh50Var4;
                                bap.g(xla0Var2, (wzs) x8, aVar3, 0);
                                q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, txj0.f(aVar4, 1.0f));
                                x2 = aVar3.x();
                                if (x2 == c0012a) {
                                    x2 = new bk6(0, wh50Var2);
                                    aVar3.R(x2);
                                }
                                q630 a3 = qri.a(F, a5x.a, new iif(2, f5j0Var3, (gzs) x2));
                                Context context2 = context;
                                boolean y = aVar3.y(context2);
                                str4 = str3;
                                J = y | aVar3.J(str4);
                                x3 = aVar3.x();
                                if (!J || x3 == c0012a) {
                                    x3 = new ml1(3, context2, str4);
                                    aVar3.R(x3);
                                }
                                q630 E2 = ahn.E(egi0.b(a3, false, (izs) x3), "EnteredSymbolsPinDots");
                                androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.k, aVar3, 6);
                                int hashCode3 = Long.hashCode(n34.n(aVar3));
                                sy90 D3 = aVar3.D();
                                q630 c3 = qri.c(aVar3, E2);
                                if (aVar3.N() != null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar3.H();
                                if (aVar3.L()) {
                                    aVar3.I(aVar6);
                                } else {
                                    aVar3.f();
                                }
                                k9q0.w(aVar3, a4, cVar);
                                k9q0.w(aVar3, D3, eVar);
                                ur.d(hashCode3, aVar3, bVar, aVar3, c2678a);
                                k9q0.w(aVar3, c3, dVar);
                                aVar3.K(285879154);
                                int i6 = 0;
                                while (i6 < 4) {
                                    yla0.a(i6 < str4.length() ? xla0Var2 : new xla0.a(), aVar3, 0);
                                    if (i6 != 3) {
                                        aVar3.K(-540939496);
                                        mq.d(aVar4, 20, aVar3, 6);
                                    } else {
                                        aVar3.K(-546857768);
                                        aVar3.j();
                                    }
                                    i6++;
                                }
                                aVar3.j();
                                aVar3.G();
                                f9t.e(txj0.h(aVar4, ((bhk0) wh50Var5.getValue()).a), aVar3, 0);
                                aVar3.G();
                                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    szw.a("invalid weight; must be greater than zero");
                                }
                                fma0.a(64, str4.length() < 4 ? izsVar : null, gzsVar, jaiVar2, ahn.E(new xpy(1.0f, true), "PinGrid"), z, 0L, ((bhk0) wh50Var5.getValue()).b, aVar3, 6);
                                if (xga0.c(aVar4, 24, aVar3, 6)) {
                                    androidx.compose.runtime.b.e();
                                }
                            }
                        }
                        wh50Var2 = wh50Var4;
                        x8 = new ck6(xla0Var2, f5j0Var3, wh50Var2, null);
                        aVar3.R(x8);
                        bap.g(xla0Var2, (wzs) x8, aVar3, 0);
                        q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, txj0.f(aVar4, 1.0f));
                        x2 = aVar3.x();
                        if (x2 == c0012a) {
                        }
                        q630 a32 = qri.a(F2, a5x.a, new iif(2, f5j0Var3, (gzs) x2));
                        Context context22 = context;
                        boolean y2 = aVar3.y(context22);
                        str4 = str3;
                        J = y2 | aVar3.J(str4);
                        x3 = aVar3.x();
                        if (!J) {
                        }
                        x3 = new ml1(3, context22, str4);
                        aVar3.R(x3);
                        q630 E22 = ahn.E(egi0.b(a32, false, (izs) x3), "EnteredSymbolsPinDots");
                        androidx.compose.foundation.layout.k a42 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.k, aVar3, 6);
                        int hashCode32 = Long.hashCode(n34.n(aVar3));
                        sy90 D32 = aVar3.D();
                        q630 c32 = qri.c(aVar3, E22);
                        if (aVar3.N() != null) {
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3078, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            i3 = 4;
        } else {
            M.h();
            q630Var2 = q630Var;
            i3 = i;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jaiVar2, str, str2, xla0Var, q630Var2, str3, z, izsVar, gzsVar, i3, i2) { // from class: xsna.ak6
                public final /* synthetic */ jai c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ xla0 f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ String h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ izs j;
                public final /* synthetic */ gzs k;
                public final /* synthetic */ int l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    dk6.a(jai.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
