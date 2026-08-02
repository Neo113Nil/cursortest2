package xsna;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TooltipWrapper.kt */
/* loaded from: classes17.dex */
public final class q6p0 {
    public static final pqo a = new pqo(new vo50(20));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, gzs gzsVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> fxVar;
        final wh50 wh50Var;
        int i2;
        androidx.compose.runtime.a M = aVar.M(540370694);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(540370694, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.TooltipWrapper (TooltipWrapper.kt:28)");
            }
            if (str == null) {
                M.K(646079508);
                jaiVar.invoke(M, 6);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    fxVar = new p2(i, 3, str, gzsVar, jaiVar);
                    s.d = fxVar;
                }
                return;
            }
            jaiVar2 = jaiVar;
            M.K(645021788);
            M.j();
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new Rect());
                M.R(x);
            }
            final wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = Float.valueOf(context.getResources().getDisplayMetrics().heightPixels);
                M.R(x3);
            }
            final float floatValue = ((Number) x3).floatValue();
            boolean z = !((Boolean) M.r(a)).booleanValue();
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = (Boolean) wh50Var3.getValue();
            bool.getClass();
            int i4 = i3 & 14;
            boolean l = (i4 == 4) | M.l(z) | M.y(context) | ((i3 & 112) == 32);
            Object x4 = M.x();
            if (l || x4 == c0012a) {
                wh50Var = wh50Var3;
                i2 = i4;
                p6p0 p6p0Var = new p6p0(1000L, str, z, context, gzsVar, wh50Var, wh50Var2, null);
                M.R(p6p0Var);
                x4 = p6p0Var;
            } else {
                wh50Var = wh50Var3;
                i2 = i4;
            }
            aVar2 = M;
            bap.e(str, valueOf, bool, (wzs) x4, aVar2, i2);
            Object x5 = aVar2.x();
            if (x5 == c0012a) {
                x5 = new izs() { // from class: xsna.o6p0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tny tnyVar = (tny) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (tnyVar.D(0L) & 4294967295L));
                        boolean z2 = false;
                        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= intBitsToFloat && intBitsToFloat <= floatValue) {
                            z2 = true;
                        }
                        wh50Var.setValue(Boolean.valueOf(z2));
                        zhf0 j = jgz.j(tnyVar, true);
                        wh50Var2.setValue(new Rect(an10.b(j.a), an10.b(j.b), an10.b(j.c), an10.b(j.d)));
                        return s3q0.a;
                    }
                };
                aVar2.R(x5);
            }
            q630 o = egi.o(q630.a.a, (izs) x5);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, o);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c, cri.a.d);
            jaiVar2.invoke(aVar2, 6);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            fxVar = new fx(i, 4, str, gzsVar, jaiVar2);
            s.d = fxVar;
        }
    }
}
