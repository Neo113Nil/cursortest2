package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.dto.common.data.VKList;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.BaseModalPostReactionsTabFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.q630;
import xsna.t130;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p00 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Iterable singletonList;
        int i = this.b;
        char c = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                UIBlockActionExpandBlock uIBlockActionExpandBlock = (UIBlockActionExpandBlock) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                for (UIBlock uIBlock : arrayList) {
                    if (epx.f(uIBlock, uIBlockActionExpandBlock)) {
                        singletonList = uIBlockActionExpandBlock.C;
                        if (singletonList == null) {
                            singletonList = EmptyList.b;
                        }
                    } else {
                        singletonList = Collections.singletonList(uIBlock);
                    }
                    g5g.y(singletonList, arrayList2);
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int i2 = BaseModalPostReactionsTabFragment.X;
                xn50.a.c((BaseModalPostReactionsTabFragment) obj3, new t130.d((VKList) obj, booleanValue));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((es7) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                UIBlockList uIBlockList2 = (UIBlockList) obj;
                edi.y(uIBlockList2, new ve0(8), new uw((izs) obj3, c == true ? 1 : 0));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i3 = z5h.j1;
                ((z5h) obj3).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                vmt vmtVar = (vmt) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                zlt zltVar = vmtVar.k;
                isiVar.c = new jct(isiVar.a(new ac0(sj50Var, zltVar)), isiVar.a(new yb0(sj50Var, zltVar)), isiVar.a(new xb0(sj50Var, zltVar)), isiVar.a(new zb0(zltVar, vmtVar.g, sj50Var)), 1);
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                break;
            case 7:
                eed0 eed0Var = (eed0) obj3;
                int intValue2 = ((Integer) obj).intValue();
                eed0Var.e = true;
                eed0Var.f = intValue2;
                eed0Var.g = (PostPrivacyData) obj2;
                break;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1611457290, intValue3, -1, "com.vk.ecomm.market.orders.ProductCardPropertyPickerBottomSheetBuilder.<anonymous> (ProductCardPropertyPickerBottomSheetBuilder.kt:37)");
                    }
                    fmd0.a(arrayList3, txj0.f(q630.a.a, 1.0f), aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 9:
                ote0 ote0Var = (ote0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(985313434, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.Content.<anonymous> (RadioBigPlayerControls.kt:36)");
                    }
                    ote0Var.c(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 10:
                ((afi0) obj3).g(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                break;
            default:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.d) obj3).c.invoke(new i.d((StoryUserViewer) obj, ((Integer) obj2).intValue()));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p00(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
