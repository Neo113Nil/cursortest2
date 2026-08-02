package xsna;

import androidx.compose.runtime.a;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.ui.components.chat_profile.tabs.ChatProfileTabsContainerLayout;
import com.vk.lists.DefaultEmptyView;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class uxb implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uxb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i2 = ChatProfileTabsContainerLayout.A;
                ((VKTabLayout) obj).setSelectedTabIndicatorColor(((kkm) obj3).f(R.attr.vk_ui_stroke_accent));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = isc.t1;
                ((isc) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                StickerAttachment stickerAttachment = (StickerAttachment) obj;
                xwb0 xwb0Var = (xwb0) obj2;
                e2g0 e2g0Var = ((CommunityReviewsFragment) obj3).S;
                if (e2g0Var != null) {
                    e2g0Var.s(stickerAttachment, xwb0Var);
                }
                break;
            case 3:
                ImageSize imageSize = (ImageSize) ixj0.c(((Image) obj3).b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                if (imageSize != null) {
                    break;
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((axq) obj3).i(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultEmptyView defaultEmptyView = ((GeoPostsFragment) obj3).d0;
                if (defaultEmptyView != null) {
                    defaultEmptyView.setVisibility(booleanValue ? 0 : 8);
                }
                break;
            case 6:
                f910 f910Var = (f910) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1579358621, intValue, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.MarketMultiSelectPickerView.configureSaveResultButtonHolder.<anonymous>.<anonymous> (MarketMultiSelectPickerView.kt:163)");
                    }
                    int intValue2 = ((wak0) f910Var.s).getIntValue();
                    boolean y = aVar.y(f910Var);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new gbj(f910Var, 25);
                        aVar.R(x);
                    }
                    p540.a(intValue2, 0, aVar, (gzs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 7:
                fc30 fc30Var = (fc30) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-328108779, intValue3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:40)");
                    }
                    aVar2.E(fc30Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 8:
                qcy<Object>[] qcyVarArr2 = tl50.h1;
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i3 = dbi0.r1;
                ((dbi0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.c((UserProfileBaseInfoState.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                k2u0 k2u0Var = (k2u0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(408468814, intValue4, -1, "com.vk.catalog2.common.ui.mvp.holder.poll.ViewVideoDynamicPollRenderer.createView.<anonymous>.<anonymous> (ViewVideoDynamicPollRenderer.kt:69)");
                    }
                    y0u0 y0u0Var = (y0u0) nr2.u(k2u0Var.c, aVar3).getValue();
                    if (y0u0Var == null) {
                        aVar3.K(1052191382);
                    } else {
                        aVar3.K(1052191383);
                        ic0.a(y0u0Var, txj0.f(q630.a.a, 1.0f), k2u0Var.b, aVar3, 48);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                ((e5y0) obj3).f.push(new kv50((z4y0) obj, (NativeAdLoader) obj2));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uxb(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
