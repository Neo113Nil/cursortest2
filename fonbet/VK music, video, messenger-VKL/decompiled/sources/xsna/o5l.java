package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.dt1;
import xsna.q630;
import xsna.t2x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class o5l implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o5l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q630.a aVar;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1659341097, intValue, -1, "com.vk.debug.design.DebugFileManagerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugFileManagerScreen.kt:156)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new ks2(10, wh50Var, wh50Var2);
                        aVar2.R(x);
                    }
                    w5l.c((gzs) x, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                b7i0 b7i0Var = (b7i0) this.c;
                wh50 wh50Var3 = b7i0Var.c;
                t2x.b bVar = (t2x.b) this.d;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(spg0Var) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1854585533, intValue2, -1, "com.vk.core.compose.component.input.SelectClickableImpl.Content.<anonymous>.<anonymous> (SelectClickableImpl.kt:70)");
                    }
                    r2x r2xVar = (r2x) ((zak0) b7i0Var.i).getValue();
                    q630.a aVar4 = q630.a.a;
                    if (r2xVar == null) {
                        aVar3.K(501710011);
                        aVar3.j();
                        aVar = aVar4;
                    } else {
                        aVar3.K(154731526);
                        aVar = aVar4;
                        r2xVar.a(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), aVar3, 0);
                        aVar3.j();
                    }
                    String str = (String) ((zak0) wh50Var3).getValue();
                    if (str.length() == 0) {
                        str = (String) ((zak0) b7i0Var.e).getValue();
                    }
                    if (str == null) {
                        str = "";
                    }
                    long j = ((String) ((zak0) wh50Var3).getValue()).length() > 0 ? ((l5g) ((zak0) b7i0Var.f).getValue()).a : ((l5g) ((zak0) b7i0Var.g).getValue()).a;
                    q630 b = spg0Var.b(1.0f, aVar, true);
                    dt1.a.getClass();
                    yqv0.c(str, spg0Var.a(b, dt1.a.l), j, null, null, 0, 0, null, 0, false, 0, 0, null, (frv0) ((zak0) b7i0Var.h).getValue(), aVar3, 0, 0, 8184);
                    ((zak0) bVar.a).setValue(Boolean.valueOf(b7i0Var.b()));
                    bVar.a(s200.H(aVar, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
