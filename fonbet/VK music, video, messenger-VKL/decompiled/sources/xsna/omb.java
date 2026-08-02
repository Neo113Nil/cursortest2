package xsna;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.dto.common.Price;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.f5h0;

/* compiled from: ChatActionLinkSnippetView.kt */
/* loaded from: classes16.dex */
public interface omb {
    VkText getBadgeTextView();

    VKImageView getSnippetImageView();

    VkText getSubtitleTextView();

    VkText getTitleTextView();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    default void w1(Context context, pmb pmbVar) {
        ActionLink actionLink = (ActionLink) pmbVar.b;
        ActionLinkSnippet actionLinkSnippet = actionLink.f;
        ActionLinkSnippet actionLinkSnippet2 = actionLink.f;
        Good good = actionLinkSnippet != null ? actionLinkSnippet.j : null;
        int i = 0;
        if (good != null) {
            Price price = good.h;
            getTitleTextView().setTextAppearance(R.style.VkUiTypography_ParagraphMedium);
            String str = price.i;
            int i2 = price.g;
            if (str == null || str.length() == 0) {
                getTitleTextView().setText(price.e);
            } else {
                getTitleTextView().setText(price.i);
            }
            getSubtitleTextView().setText(actionLinkSnippet2 != null ? actionLinkSnippet2.b : null);
            getSubtitleTextView().setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
            if (i2 < 0) {
                getBadgeTextView().setText(context.getString(R.string.chat_live_snippet_discount_template, Integer.valueOf(i2)));
                bwt0.p0(getBadgeTextView(), true);
            } else {
                bwt0.p0(getBadgeTextView(), false);
            }
        } else {
            getTitleTextView().setTextAppearance(R.style.VkUiTypography_Text);
            bwt0.p0(getBadgeTextView(), false);
            String str2 = actionLinkSnippet2 != null ? actionLinkSnippet2.b : null;
            String str3 = actionLinkSnippet2 != null ? actionLinkSnippet2.c : null;
            if (str2 == null || str2.length() == 0) {
                getTitleTextView().setText(str3);
            } else {
                getTitleTextView().setText(str2);
            }
            getSubtitleTextView().setText(actionLinkSnippet2 != null ? actionLinkSnippet2.d : null);
            VkText subtitleTextView = getSubtitleTextView();
            e3m.a aVar = e3m.a;
            subtitleTextView.setTextColor(context.getColor(R.color.vk_white_alpha60));
        }
        String str4 = actionLink.c;
        switch (str4.hashCode()) {
            case -732377866:
                if (str4.equals("article")) {
                    i = R.drawable.vk_icon_article_outline_28;
                    break;
                }
                break;
            case -309474065:
                if (str4.equals("product")) {
                    i = R.drawable.vk_icon_market_outline_28;
                    break;
                }
                break;
            case 96801:
                if (str4.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                    i = R.drawable.vk_icon_services_outline_28;
                    break;
                }
                break;
            case 3433103:
                if (str4.equals("page")) {
                    i = R.drawable.vk_icon_link_outline_28;
                    break;
                }
                break;
            case 3446719:
                if (str4.equals("poll")) {
                    i = R.drawable.vk_icon_poll_square_outline_28;
                    break;
                }
                break;
            case 3446944:
                if (str4.equals("post")) {
                    i = R.drawable.vk_icon_newsfeed_outline_28;
                    break;
                }
                break;
            case 3599307:
                if (str4.equals("user")) {
                    i = R.drawable.vk_icon_user_outline_28;
                    break;
                }
                break;
            case 98629247:
                if (str4.equals("group")) {
                    i = R.drawable.vk_icon_users_outline_28;
                    break;
                }
                break;
        }
        getSnippetImageView().Q0(new baf0(m33.a(i, context), context.getColor(R.color.vk_white_alpha60)), f5h0.g.a);
        getSnippetImageView().load(actionLinkSnippet2 != null ? actionLinkSnippet2.zb() : null);
    }
}
