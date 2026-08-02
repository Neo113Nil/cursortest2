package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.b;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesTopBarSearchState;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonView;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import java.util.List;
import xsna.wbo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class uog implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uog(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = (CommunitiesSearchTopBarVh) this.c;
                wh50 wh50Var = communitiesSearchTopBarVh.m;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1962387869, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.bindData.<anonymous>.<anonymous> (CommunitiesSearchTopBarVh.kt:98)");
                    }
                    ijk.a((CommunitiesTopBarSearchState) ((zak0) wh50Var).getValue(), null, jq2.d(100, 0, null, 6), null, kai.c(-1313260820, new vog(communitiesSearchTopBarVh, 0), aVar), aVar, 24960, 10);
                    CommunitiesTopBarSearchState communitiesTopBarSearchState = (CommunitiesTopBarSearchState) ((zak0) wh50Var).getValue();
                    boolean y = aVar.y(communitiesSearchTopBarVh);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = communitiesSearchTopBarVh.new b(null);
                        aVar.R(x);
                    }
                    bap.g(communitiesTopBarSearchState, (wzs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                gxl gxlVar = (gxl) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(942076876, intValue2, -1, "com.vk.ecomm.cart.impl.points_map.ui.filters.DeliveryPointsMapFiltersBottomSheet.view$delegate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryPointsMapFiltersBottomSheet.kt:36)");
                    }
                    List<dcr> list = gxlVar.a;
                    boolean y2 = aVar2.y(gxlVar);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == a.C0011a.a) {
                        x2 = new yve(gxlVar, 11);
                        aVar2.R(x2);
                    }
                    bgr.c(384, aVar2, list, (izs) x2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                UIBlockList uIBlockList = (UIBlockList) obj;
                x76 x76Var = new x76((kym0) this.c, 6);
                for (UIBlock uIBlock : uIBlockList.y) {
                    x76Var.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        o19.w((UIBlockList) uIBlock, x76Var);
                    }
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((vn20) this.c).c(ne7.I(55), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                MsgSkeletonView msgSkeletonView = (MsgSkeletonView) this.c;
                int intValue3 = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                break;
            case 5:
                ote0 ote0Var = (ote0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2320057, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.Content.<anonymous> (RadioBigPlayerControls.kt:37)");
                    }
                    ote0Var.b(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 6:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view = reactionsFeedFragment.b0;
                if (view != null) {
                    view.setVisibility(booleanValue ? 0 : 8);
                }
                break;
            case 7:
                UIBlockList uIBlockList2 = (UIBlockList) this.c;
                ((Integer) obj).intValue();
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((wbo0.a) this.c).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((rjo0) this.c).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                ((izs) this.c).invoke(obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b) this.c).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uog(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
