package xsna;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;

/* compiled from: BaseVkFeedCoownerHeader.kt */
/* loaded from: classes18.dex */
public abstract class is6 extends FrameLayout implements duu0 {
    @Override // xsna.duu0
    public final void a() {
        getDelegate().a();
    }

    @Override // xsna.duu0
    public final void b() {
        getDelegate().b();
    }

    @Override // xsna.duu0
    public final void c(String str, String str2) {
        getDelegate().c(str, str2);
    }

    public abstract duu0 getDelegate();

    @Override // xsna.duu0
    public final VkFeedNewsfeedHeaderDescriptionLayout getDescriptionView() {
        return getDelegate().getDescriptionView();
    }

    @Override // xsna.duu0
    public final boolean getIsDateGone() {
        return getDelegate().getIsDateGone();
    }

    @Override // xsna.duu0
    public final boolean getOptionsIsGone() {
        return getDelegate().getOptionsIsGone();
    }

    @Override // xsna.duu0
    public final void setDateTextColor(ColorStateList colorStateList) {
        getDelegate().setDateTextColor(colorStateList);
    }

    @Override // xsna.duu0
    public final void setDateVisibleText(String str) {
        getDelegate().setDateVisibleText(str);
    }

    @Override // xsna.duu0
    public final void setDescriptionMarginEnd(int i) {
        getDelegate().setDescriptionMarginEnd(i);
    }

    @Override // xsna.duu0
    public final void setHeaderListener(fuu0 fuu0Var) {
        getDelegate().setHeaderListener(fuu0Var);
    }

    @Override // xsna.duu0
    public final void setOptionsImageResource(int i) {
        getDelegate().setOptionsImageResource(i);
    }

    @Override // xsna.duu0
    public final void setOptionsImageTintList(ColorStateList colorStateList) {
        getDelegate().setOptionsImageTintList(colorStateList);
    }

    @Override // xsna.duu0
    public final void setOptionsIsVisible(boolean z) {
        getDelegate().setOptionsIsVisible(z);
    }

    @Override // xsna.duu0
    public final void setPinBackgroundResource(int i) {
        getDelegate().setPinBackgroundResource(i);
    }

    @Override // xsna.duu0
    public final void setPinBackgroundTintList(ColorStateList colorStateList) {
        getDelegate().setPinBackgroundTintList(colorStateList);
    }

    @Override // xsna.duu0
    public final void setPinIsVisible(boolean z) {
        getDelegate().setPinIsVisible(z);
    }

    @Override // xsna.duu0
    public final void setTextLayoutAuthorName(CharSequence charSequence) {
        getDelegate().setTextLayoutAuthorName(charSequence);
    }

    @Override // xsna.duu0
    public final void setTextLayoutCoauthorName(String str) {
        getDelegate().setTextLayoutCoauthorName(str);
    }

    @Override // xsna.duu0
    public final void setTextLayoutCoauthorsCount(String str) {
        getDelegate().setTextLayoutCoauthorsCount(str);
    }

    @Override // xsna.duu0
    public final void setTextLayoutMarginEnd(int i) {
        getDelegate().setTextLayoutMarginEnd(i);
    }

    @Override // xsna.duu0
    public final void setTextLayoutTextColor(ColorStateList colorStateList) {
        getDelegate().setTextLayoutTextColor(colorStateList);
    }
}
