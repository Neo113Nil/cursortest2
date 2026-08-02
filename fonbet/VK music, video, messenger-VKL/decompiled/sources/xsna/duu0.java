package xsna;

import android.content.res.ColorStateList;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;

/* compiled from: VkFeedCoownerHeader.kt */
/* loaded from: classes18.dex */
public interface duu0 {
    void a();

    void b();

    void c(String str, String str2);

    VkFeedNewsfeedHeaderDescriptionLayout getDescriptionView();

    boolean getIsDateGone();

    boolean getOptionsIsGone();

    void setDateTextColor(ColorStateList colorStateList);

    void setDateVisibleText(String str);

    void setDescriptionMarginEnd(int i);

    void setHeaderListener(fuu0 fuu0Var);

    void setOptionsImageResource(int i);

    void setOptionsImageTintList(ColorStateList colorStateList);

    void setOptionsIsVisible(boolean z);

    void setPinBackgroundResource(int i);

    void setPinBackgroundTintList(ColorStateList colorStateList);

    void setPinIsVisible(boolean z);

    void setTextLayoutAuthorName(CharSequence charSequence);

    void setTextLayoutCoauthorName(String str);

    void setTextLayoutCoauthorsCount(String str);

    void setTextLayoutMarginEnd(int i);

    void setTextLayoutTextColor(ColorStateList colorStateList);
}
