package xsna;

import android.content.Context;
import android.graphics.RectF;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class w1k implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w1k(String str, String str2, RectF rectF, lyd0 lyd0Var, CoverCropActivity coverCropActivity) {
        this.c = str;
        this.d = str2;
        this.e = rectF;
        this.f = lyd0Var;
        this.g = coverCropActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ls5 ls5Var;
        androidx.compose.runtime.a aVar;
        wh50 wh50Var;
        wh50 wh50Var2;
        agw r;
        int i;
        int i2 = this.b;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                String str = (String) obj7;
                final String str2 = (String) obj6;
                RectF rectF = (RectF) obj5;
                final lyd0 lyd0Var = (lyd0) obj4;
                final CoverCropActivity coverCropActivity = (CoverCropActivity) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = CoverCropActivity.w;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-261200016, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity.Content.<anonymous> (CoverCropActivity.kt:137)");
                    }
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new ls5();
                        aVar2.R(x);
                    }
                    ls5 ls5Var2 = (ls5) x;
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar2.R(x2);
                    }
                    wh50 wh50Var3 = (wh50) x2;
                    Object[] objArr = new Object[0];
                    Object x3 = aVar2.x();
                    if (x3 == c0012a) {
                        x3 = new xv0(8);
                        aVar2.R(x3);
                    }
                    wh50 wh50Var4 = (wh50) crx0.A(objArr, (gzs) x3, aVar2, 48);
                    Object[] objArr2 = new Object[0];
                    Object x4 = aVar2.x();
                    if (x4 == c0012a) {
                        x4 = new vi0(14);
                        aVar2.R(x4);
                    }
                    final wh50 wh50Var5 = (wh50) crx0.A(objArr2, (gzs) x4, aVar2, 48);
                    if (str == null) {
                        aVar2.K(1071379215);
                        aVar2.j();
                        wh50Var2 = wh50Var3;
                        wh50Var = wh50Var4;
                        aVar = aVar2;
                        ls5Var = ls5Var2;
                        r = null;
                    } else {
                        aVar2.K(1071379216);
                        ls5Var = ls5Var2;
                        aVar = aVar2;
                        wh50Var = wh50Var4;
                        wh50Var2 = wh50Var3;
                        r = xus.r(str, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0, 62);
                        aVar.j();
                    }
                    boolean J = aVar.J(r);
                    Object x5 = aVar.x();
                    if (J || x5 == c0012a) {
                        x5 = bbk0.b(new wf9(r, rectF, ls5Var, 3));
                        aVar.R(x5);
                    }
                    mtk0 mtk0Var = (mtk0) x5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(706432430, 0, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.rememberCoverSize (CoverCropActivity.kt:452)");
                    }
                    Object x6 = aVar.x();
                    if (x6 == c0012a) {
                        x6 = androidx.compose.runtime.k.b(null);
                        aVar.R(x6);
                    }
                    wh50 wh50Var6 = (wh50) x6;
                    Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
                    boolean y = aVar.y(context) | aVar.J(str2);
                    Object x7 = aVar.x();
                    if (y || x7 == c0012a) {
                        i = 0;
                        x7 = new c2k(context, str2, wh50Var6, i);
                        aVar.R(x7);
                    } else {
                        i = 0;
                    }
                    bap.c(str2, (izs) x7, aVar, i);
                    mxj0 mxj0Var = (mxj0) wh50Var6.getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    final njw njwVar = new njw(mxj0Var, xus.r(str2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0, 62), (agw) mtk0Var.getValue());
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    final wh50 wh50Var7 = wh50Var2;
                    final wh50 wh50Var8 = wh50Var;
                    a4h0.a(null, null, null, kai.c(1547893686, new y1k(njwVar, wh50Var8, lyd0Var, wh50Var7), aVar), null, null, 0, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0L, 0L, ylu0Var.getBackground().g, 0L, kai.c(680396206, new yzs() { // from class: xsna.z1k
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.yzs
                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                            s890 s890Var = (s890) obj8;
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj9;
                            int intValue2 = ((Integer) obj10).intValue();
                            int i4 = CoverCropActivity.w;
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= aVar3.J(s890Var) ? 4 : 2;
                            }
                            if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(680396206, intValue2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity.Content.<anonymous>.<anonymous> (CoverCropActivity.kt:183)");
                                }
                                njw njwVar2 = njw.this;
                                if (((agw) njwVar2.b) == null || ((mxj0) njwVar2.a) == null) {
                                    aVar3.K(1725088532);
                                } else {
                                    aVar3.K(1732801363);
                                    wh50 wh50Var9 = wh50Var8;
                                    boolean J2 = aVar3.J(wh50Var9);
                                    Object x8 = aVar3.x();
                                    Object obj11 = a.C0011a.a;
                                    if (J2 || x8 == obj11) {
                                        x8 = new t1k(0, wh50Var9);
                                        aVar3.R(x8);
                                    }
                                    wh50 wh50Var10 = wh50Var5;
                                    o5d0 o5d0Var = new o5d0((gzs) x8, ((Number) wh50Var10.getValue()).intValue(), s890Var);
                                    q630 G = f9t.G(txj0.f(q630.a.a, 1.0f));
                                    dt1.a.getClass();
                                    cp10 d = ja8.d(dt1.a.b, false);
                                    int hashCode = Long.hashCode(n34.n(aVar3));
                                    sy90 D = aVar3.D();
                                    q630 c = qri.c(aVar3, G);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar4 = cri.a.b;
                                    if (aVar3.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar3.H();
                                    if (aVar3.L()) {
                                        aVar3.I(aVar4);
                                    } else {
                                        aVar3.f();
                                    }
                                    k9q0.w(aVar3, d, cri.a.f);
                                    k9q0.w(aVar3, D, cri.a.e);
                                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(aVar3, cri.a.h);
                                    k9q0.w(aVar3, c, cri.a.d);
                                    Object obj12 = coverCropActivity;
                                    boolean y2 = aVar3.y(obj12);
                                    Object x9 = aVar3.x();
                                    if (y2 || x9 == obj11) {
                                        Object aVar5 = new CoverCropActivity.a(0, obj12, CoverCropActivity.class, "finishWithCancel", "finishWithCancel()V", 0);
                                        aVar3.R(aVar5);
                                        x9 = aVar5;
                                    }
                                    fcy fcyVar = (fcy) x9;
                                    Object x10 = aVar3.x();
                                    wh50 wh50Var11 = wh50Var7;
                                    if (x10 == obj11) {
                                        x10 = new u1k(0, wh50Var11);
                                        aVar3.R(x10);
                                    }
                                    gzs gzsVar = (gzs) x10;
                                    gzs gzsVar2 = (gzs) fcyVar;
                                    boolean y3 = aVar3.y(obj12);
                                    Object obj13 = str2;
                                    boolean J3 = y3 | aVar3.J(obj13);
                                    Object x11 = aVar3.x();
                                    if (J3 || x11 == obj11) {
                                        x11 = new p37(obj12, obj13, wh50Var11, 1);
                                        aVar3.R(x11);
                                    }
                                    izs izsVar = (izs) x11;
                                    boolean J4 = aVar3.J(wh50Var10);
                                    Object x12 = aVar3.x();
                                    if (J4 || x12 == obj11) {
                                        x12 = new v1k(0, wh50Var10);
                                        aVar3.R(x12);
                                    }
                                    j2k.b(njwVar2, o5d0Var, gzsVar, gzsVar2, izsVar, (izs) x12, lyd0Var, aVar3, 384);
                                    aVar3.G();
                                }
                                aVar3.j();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 3072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ive0.b((h17) obj7, (rg50) obj6, (dz40.s) obj5, (q630) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(25009));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w1k(h17 h17Var, rg50 rg50Var, dz40.s sVar, q630 q630Var, jai jaiVar, int i) {
        this.c = h17Var;
        this.d = rg50Var;
        this.e = sVar;
        this.f = q630Var;
        this.g = jaiVar;
    }
}
