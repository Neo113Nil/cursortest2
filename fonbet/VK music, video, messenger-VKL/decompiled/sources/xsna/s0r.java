package xsna;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.xnt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                v0r v0rVar = (v0r) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1520778393, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:131)");
                    }
                    v0rVar.n("имя + бейдж + многострочный текст", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                QuickMessageItem quickMessageItem = (QuickMessageItem) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1302841457, intValue2, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.QuickMessageBubbleItem.<anonymous> (ProductCardCommunityInfoHolder.kt:178)");
                    }
                    if (quickMessageItem.f) {
                        aVar2.K(-669561622);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-851827198, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageOutline24> (VkIcons.kt:7474)");
                        }
                        lg90 b = or.b(aVar2, -2117096287, R.drawable.vk_icon_message_outline_24, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(b, d370.N(R.string.market_write_seller_button, 0, aVar2), ahn.E(q630.a.a, "quick_message_chat_button"), 0L, aVar2, 392, 8);
                        aVar2.j();
                    } else {
                        aVar2.K(-669234634);
                        String str = quickMessageItem.b;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.O;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(str, null, ylu0Var.getText().c, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                Float f = (Float) obj2;
                View view = (View) obj3;
                ((rn10) obj).c(f.floatValue());
                float f2 = (swe0.f(f.floatValue(), 0.8f, 1.0f) - 0.8f) / 0.19999999f;
                xnt0.a aVar3 = ((xnt0) obj4).b;
                if (aVar3 != null) {
                    aVar3.d(view, f2);
                }
                break;
            case 3:
                Integer num = (Integer) obj2;
                num.intValue();
                Integer num2 = (Integer) obj3;
                num2.intValue();
                ((yzs) obj4).invoke((View) obj, num, num2);
                break;
            default:
                VkAlbumsFragment vkAlbumsFragment = (VkAlbumsFragment) obj4;
                int intValue3 = ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                int i2 = VkAlbumsFragment.Y;
                int i3 = intValue3 > iah0.a((float) 600) ? 3 : 2;
                vkAlbumsFragment.V = i3;
                GridLayoutManager gridLayoutManager = vkAlbumsFragment.W;
                if (gridLayoutManager == null || gridLayoutManager.s != i3) {
                    if (gridLayoutManager != null) {
                        gridLayoutManager.setSpanCount(i3);
                    }
                    PickerRecyclerPaginatedView pickerRecyclerPaginatedView = vkAlbumsFragment.T;
                    if (pickerRecyclerPaginatedView == null) {
                        pickerRecyclerPaginatedView = null;
                    }
                    pickerRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
                }
                break;
        }
        return s3q0.a;
    }
}
