package xsna;

import android.widget.ImageView;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.friend.FriendsBirthdayCellVh;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.im.engine.utils.StringMatchStrategy;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nhi implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nhi(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2085766862, intValue, -1, "com.vk.design.demo.presentation.screens.card.ComposableSingletons$MilkshakeCardScreenContentKt.lambda$2085766862.<anonymous> (MilkshakeCardScreenContent.kt:93)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    q630 D2 = s200.D(aVar2, 4.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Sample text", D2, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.T, aVar, 54, 0, 8188);
                    vjw.a(fwu0.l(null, "https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg", null, null, aVar, 48, 61), null, txj0.f(txj0.h(aVar2, 128.0f), 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 440, 120);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(858898076, intValue2, -1, "com.vk.ecomm.market.good.ui.ComposableSingletons$ProductButtonsBinderImplKt.lambda$858898076.<anonymous> (ProductButtonsBinderImpl.kt:48)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(253275604, intValue3, -1, "com.vk.core.compose.component.modal.card.ComposableSingletons$VkModalCardBottomSheetKt.lambda$253275604.<anonymous> (VkModalCardBottomSheet.kt:70)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                VkDiagonalUserStack vkDiagonalUserStack = (VkDiagonalUserStack) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                FriendsBirthdayCellVh.a aVar6 = fVar instanceof FriendsBirthdayCellVh.a ? (FriendsBirthdayCellVh.a) fVar : null;
                if (aVar6 != null) {
                    ArrayList arrayList = aVar6.a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        itj0.d((String) it.next(), arrayList2);
                    }
                    vkDiagonalUserStack.setAvatars(arrayList2);
                }
                return s3q0.a;
            case 4:
                return Boolean.TRUE;
            case 5:
                ((ImageView) obj).setColorFilter(new upj0(((kkm) obj2).f(R.attr.vk_ui_icon_accent)));
                return s3q0.a;
            case 6:
                return ((RecyclerView.e0) obj).itemView.findViewById(R.id.comment_author_liked_photo);
            case 7:
                return v11.b(((Integer) obj).intValue(), (Integer) obj2);
            case 8:
                StringMatchStrategy stringMatchStrategy = StringMatchStrategy.STRICT;
                return Boolean.valueOf(drm0.D((String) obj, (String) obj2, true));
            default:
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar7.K(-1227840265);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1227840265, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:164)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar7.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var2.B;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return frv0Var;
        }
    }
}
