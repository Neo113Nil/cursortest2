package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.dto.donut.DonutLevel;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d3 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ wh50 c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ mtk0 e;
    public final /* synthetic */ wh50 f;

    public /* synthetic */ d3(izs izsVar, wh50 wh50Var, mtk0 mtk0Var, wh50 wh50Var2) {
        this.d = izsVar;
        this.c = wh50Var;
        this.e = mtk0Var;
        this.f = wh50Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1098663447, intValue, -1, "com.vk.superapp.presentation.about.compose.AboutAppToolbar.<anonymous> (AboutAppToolbar.kt:91)");
                    }
                    String N = d370.N(R.string.vk_back, 0, aVar);
                    izs izsVar = this.d;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    Object obj3 = a.C0011a.a;
                    if (J || x == obj3) {
                        x = new f3(izsVar, 0);
                        aVar.R(x);
                    }
                    TopBar$Before.e a = e.a.a((gzs) x, N, null, null, null, aVar, 196608, 28);
                    TopBar$Middle.a aVar2 = TopBar$Middle.a.c;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().b;
                    String N2 = d370.N(R.string.accessibility_actions, 0, aVar);
                    Object x2 = aVar.x();
                    wh50 wh50Var = this.c;
                    if (x2 == obj3) {
                        x2 = new g3(0, wh50Var);
                        aVar.R(x2);
                    }
                    muv0.h(aVar2, hr80.m(q630.a.a, ((l5g) this.e.getValue()).a, androidx.compose.ui.graphics.e.a), null, null, a, null, d.a.a(d.c.C0760d.a.a(a2, N2, (gzs) x2, null, new l5g(j), null, aVar, 1573256, 40), null, null, null, aVar, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 6, 0, 8108);
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.d;
                    long floatToRawIntBits = (Float.floatToRawIntBits(56) & 4294967295L) | (Float.floatToRawIntBits(-8) << 32);
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    Object x3 = aVar.x();
                    if (x3 == obj3) {
                        x3 = new h3(0, wh50Var);
                        aVar.R(x3);
                    }
                    oqu0.b(booleanValue, (gzs) x3, null, ty6Var, floatToRawIntBits, null, null, false, null, kai.c(-1865393635, new i3(izsVar, this.f), aVar), aVar, 27696, 6, 996);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                int c = kdd0.c(ztm0Var, o6jVar, "header", ne7.c);
                Iterator it = ((List) this.c.getValue()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    izs izsVar2 = this.d;
                    if (!hasNext) {
                        this.f.setValue(Integer.valueOf(kdd0.c(ztm0Var, o6jVar, "button", new jai(-2111791195, new lk1(izsVar2, 9), true)) + c));
                        return ztm0Var.Q(0, 0, jgp.b, new zos(18));
                    }
                    DonutLevel donutLevel = (DonutLevel) it.next();
                    c += kdd0.c(ztm0Var, o6jVar, "row_" + donutLevel.b, new jai(1880140699, new dr3(donutLevel, izsVar2, this.e, 4), true));
                }
        }
    }

    public /* synthetic */ d3(wh50 wh50Var, izs izsVar, wh50 wh50Var2, wh50 wh50Var3) {
        this.c = wh50Var;
        this.d = izsVar;
        this.e = wh50Var2;
        this.f = wh50Var3;
    }
}
