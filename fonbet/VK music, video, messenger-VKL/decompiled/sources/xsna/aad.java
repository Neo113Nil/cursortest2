package xsna;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import ru.ok.gl.tf.TensorflowModel;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aad implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ aad(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                return Integer.valueOf(((ise) obj2).getId());
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1591275138, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.shimmers.market.ComposableSingletons$CommunityProfileContentGoodsShimmerKt.lambda$1591275138.<anonymous> (CommunityProfileContentGoodsShimmer.kt:46)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, aVar);
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
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    iih.a(0, 0L, aVar2, null);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1003656221, intValue2, -1, "com.vk.games.presentation.catalog.screen.ComposableSingletons$GamesCatalogMainTabScreenKt.lambda$1003656221.<anonymous> (GamesCatalogMainTabScreen.kt:207)");
                    }
                    f9t.e(txj0.f(aVar, 1.0f), aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-422538487, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$ServicesItemKt.lambda$-422538487.<anonymous> (ServicesItem.kt:352)");
                    }
                    q630 f = txj0.f(aVar, 1.0f);
                    Object x = aVar5.x();
                    if (x == a.C0011a.a) {
                        x = new lt0(25);
                        aVar5.R(x);
                    }
                    lqy.a(f, null, null, null, null, null, false, null, (izs) x, aVar5, 805306374, 510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                vso.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                o7t.a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                List list = (List) obj;
                list.add((Result) obj2);
                return list;
            case 7:
                ((DialogInterface) obj).dismiss();
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                xd70.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                L.l("Cannot load models " + Arrays.toString((TensorflowModel[]) obj2) + " with error " + ((Throwable) obj));
                return s3q0.a;
            case 10:
                return new Pair((jbh) obj, (Boolean) obj2);
            case 11:
                ((Integer) obj2).getClass();
                kxe0.a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                ((FrameLayout) obj).setBackgroundColor(((kkm) obj2).f(R.attr.vk_ui_background_modal));
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(1303202881);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1303202881, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:198)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.j0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
        }
    }

    public /* synthetic */ aad(int i, int i2) {
        this.b = i2;
    }
}
