package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionViewHolder;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.jdt;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i87 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i87(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        ImageSize imageSize;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.setup.g) this.c).i((p87) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                rfr.b((ogr) this.c, (wh50) this.d, (wh50) this.e, (androidx.compose.runtime.a) obj, ne7.I(433));
                return s3q0.a;
            case 2:
                jdt.a aVar = (jdt.a) this.c;
                izs izsVar = (izs) this.e;
                lat latVar = (lat) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1492590619, intValue, -1, "com.vk.games.presentation.catalog.view.GamesCatalogContentView.WrappedGamesCatalogMainTabScreen.<anonymous> (GamesCatalogContentView.kt:64)");
                    }
                    boolean y = aVar2.y(latVar);
                    Object x = aVar2.x();
                    if (y || x == a.C0011a.a) {
                        x = new n1i(latVar, 9);
                        aVar2.R(x);
                    }
                    pct.a(aVar, izsVar, (gzs) x, latVar.f, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                GenreActionViewHolder genreActionViewHolder = (GenreActionViewHolder) this.c;
                ComposeView composeView = (ComposeView) this.d;
                UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1858277203, intValue2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (GenreActionViewHolder.kt:56)");
                    }
                    float f = genreActionViewHolder.c.b.c ? 163 : 128;
                    q630.a aVar4 = q630.a.a;
                    q630 d = rte0.d(txj0.q(aVar4, f), vog0.b(kqu0.v));
                    boolean J = aVar3.J(genreActionViewHolder) | aVar3.y(composeView) | aVar3.y(uIBlockActionOpenSection);
                    Object x2 = aVar3.x();
                    if (J || x2 == a.C0011a.a) {
                        x2 = new cv3(genreActionViewHolder, composeView, uIBlockActionOpenSection, 4);
                        aVar3.R(x2);
                    }
                    q630 c = ojc.c(d, false, null, null, (gzs) x2, 15);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c2 = qri.c(aVar3, c);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    String str = null;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d2, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c2, cri.a.d);
                    Image image = uIBlockActionOpenSection.F;
                    if (image != null && (arrayList = image.b) != null && (imageSize = (ImageSize) j5g.a0(arrayList)) != null) {
                        str = imageSize.d.d;
                    }
                    lg90 l = fwu0.l(str, null, null, null, aVar3, 0, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vjw.a(l, null, txj0.f(hr80.m(aVar4, l5g.c(14, ylu0Var.getImage().b, 0.6f), androidx.compose.ui.graphics.e.a), 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 56, 120);
                    q630 E = s200.E(txj0.f(aVar4, 1.0f), kqu0.w, kqu0.t);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(uIBlockActionOpenSection.z, E, l5g.d, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, aVar3, 384, 0, 8184);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                String str2 = (String) this.c;
                gzs gzsVar = (gzs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                zmt.b(ne7.I(1), (androidx.compose.runtime.a) obj, str2, gzsVar, q630Var);
                return s3q0.a;
            case 5:
                String str3 = (String) this.c;
                izs izsVar2 = (izs) this.e;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                saf0.c(ne7.I(1), (androidx.compose.runtime.a) obj, str3, izsVar2, q630Var2);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((khg0) this.c).h((uhg0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                csi0.a((zni0) this.c, (q630) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ i87(int i, String str, izs izsVar, q630 q630Var) {
        this.b = 5;
        this.c = str;
        this.e = izsVar;
        this.d = q630Var;
    }

    public /* synthetic */ i87(GenreActionViewHolder genreActionViewHolder, ComposeView composeView, UIBlockActionOpenSection uIBlockActionOpenSection) {
        this.b = 3;
        this.c = genreActionViewHolder;
        this.d = composeView;
        this.e = uIBlockActionOpenSection;
    }

    public /* synthetic */ i87(jdt.a aVar, izs izsVar, lat latVar) {
        this.b = 2;
        this.c = aVar;
        this.e = izsVar;
        this.d = latVar;
    }
}
