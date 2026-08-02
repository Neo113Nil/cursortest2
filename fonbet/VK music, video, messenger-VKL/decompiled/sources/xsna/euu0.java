package xsna;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;
import com.vk.feed.tool.view.newsfeed.coauthors.CoauthorsTextLayout;
import com.vkontakte.android.R;

/* compiled from: VkFeedCoownerHeaderDelegate.kt */
/* loaded from: classes18.dex */
public final class euu0 implements duu0 {
    public final guu0 b;
    public final VkDiagonalUserStack c;
    public final VkImage d;
    public final VkImage e;
    public final View f;
    public final CoauthorsTextLayout g;
    public final VkText h;
    public final VkImageSimple i;
    public final VkFeedNewsfeedHeaderDescriptionLayout j;
    public final View k;
    public fuu0 l;

    /* compiled from: VkFeedCoownerHeaderDelegate.kt */
    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (jjc.b()) {
                return;
            }
            euu0 euu0Var = euu0.this;
            if (epx.f(view, euu0Var.i)) {
                fuu0 fuu0Var = euu0Var.l;
                if (fuu0Var != null) {
                    fuu0Var.d(view);
                    return;
                }
                return;
            }
            if (epx.f(view, euu0Var.f)) {
                fuu0 fuu0Var2 = euu0Var.l;
                if (fuu0Var2 != null) {
                    fuu0Var2.b();
                    return;
                }
                return;
            }
            if (epx.f(view, euu0Var.c)) {
                fuu0 fuu0Var3 = euu0Var.l;
                if (fuu0Var3 != null) {
                    fuu0Var3.b();
                    return;
                }
                return;
            }
            if (epx.f(view, euu0Var.g)) {
                fuu0 fuu0Var4 = euu0Var.l;
                if (fuu0Var4 != null) {
                    fuu0Var4.c();
                    return;
                }
                return;
            }
            fuu0 fuu0Var5 = euu0Var.l;
            if (fuu0Var5 != null) {
                fuu0Var5.a();
            }
        }
    }

    /* compiled from: VkFeedCoownerHeaderDelegate.kt */
    public final class b implements gzs<s3q0> {
        public b() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            euu0 euu0Var = euu0.this;
            View view = euu0Var.f;
            CoauthorsTextLayout coauthorsTextLayout = euu0Var.g;
            if (view != null) {
                view.setContentDescription(coauthorsTextLayout.getVisibleText());
            }
            VkDiagonalUserStack vkDiagonalUserStack = euu0Var.c;
            if (vkDiagonalUserStack != null) {
                vkDiagonalUserStack.setContentDescription(coauthorsTextLayout.getVisibleText());
            }
            return s3q0.a;
        }
    }

    public euu0(guu0 guu0Var) {
        this.b = guu0Var;
        LayoutInflater.from(guu0Var.getContext()).inflate(R.layout.pds_post_coowner_header_v3, (ViewGroup) guu0Var, true);
        VkDiagonalUserStack vkDiagonalUserStack = (VkDiagonalUserStack) guu0Var.findViewById(R.id.feed_coauthors_user_stack);
        this.c = vkDiagonalUserStack;
        this.d = (VkImage) guu0Var.findViewById(R.id.feed_coauthors_coauthor_photo);
        this.e = (VkImage) guu0Var.findViewById(R.id.feed_coauthors_author_photo);
        View findViewById = guu0Var.findViewById(R.id.feed_coauthors_avatars_click_area);
        this.f = findViewById;
        CoauthorsTextLayout coauthorsTextLayout = (CoauthorsTextLayout) guu0Var.findViewById(R.id.text_layout);
        this.g = coauthorsTextLayout;
        this.h = (VkText) guu0Var.findViewById(R.id.feed_coauthors_date);
        VkImageSimple vkImageSimple = (VkImageSimple) guu0Var.findViewById(R.id.post_header_options);
        this.i = vkImageSimple;
        this.j = (VkFeedNewsfeedHeaderDescriptionLayout) guu0Var.findViewById(R.id.feed_coauthors_descriptions);
        this.k = guu0Var.findViewById(R.id.post_header_pin);
        coauthorsTextLayout.setOnTextViewsVisibilityCalculatedListener(new b());
        a aVar = new a();
        guu0Var.setOnClickListener(aVar);
        vkImageSimple.setOnClickListener(aVar);
        if (findViewById != null) {
            findViewById.setOnClickListener(aVar);
        }
        if (vkDiagonalUserStack != null) {
            vkDiagonalUserStack.setOnClickListener(aVar);
        }
        coauthorsTextLayout.setOnClickListener(aVar);
        guu0Var.getContext();
    }

    @Override // xsna.duu0
    public final void a() {
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.vk_icon_pin_12, R.attr.vk_ui_icon_medium, this.k);
    }

    @Override // xsna.duu0
    public final void b() {
        omw.d(this.i, R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_secondary);
    }

    @Override // xsna.duu0
    public final void c(String str, String str2) {
        this.b.getContext();
        VkImage vkImage = this.d;
        if (vkImage != null) {
            vkImage.o0(str, null);
        }
        VkImage vkImage2 = this.e;
        if (vkImage2 != null) {
            vkImage2.o0(str2, null);
        }
    }

    @Override // xsna.duu0
    public final VkFeedNewsfeedHeaderDescriptionLayout getDescriptionView() {
        return this.j;
    }

    @Override // xsna.duu0
    public final boolean getIsDateGone() {
        return this.h.getVisibility() == 8;
    }

    @Override // xsna.duu0
    public final boolean getOptionsIsGone() {
        return this.i.getVisibility() == 8;
    }

    @Override // xsna.duu0
    public final void setDateTextColor(ColorStateList colorStateList) {
        this.h.setTextColor(colorStateList);
    }

    @Override // xsna.duu0
    public final void setDateVisibleText(String str) {
        boolean z;
        VkText vkText = this.h;
        if (str == null || str.length() == 0) {
            z = false;
        } else {
            vkText.setText(str);
            z = true;
        }
        bwt0.p0(vkText, z);
    }

    @Override // xsna.duu0
    public final void setDescriptionMarginEnd(int i) {
        VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = this.j;
        if (vkFeedNewsfeedHeaderDescriptionLayout != null) {
            f4m.r(i, vkFeedNewsfeedHeaderDescriptionLayout);
        }
    }

    @Override // xsna.duu0
    public final void setHeaderListener(fuu0 fuu0Var) {
        this.l = fuu0Var;
    }

    @Override // xsna.duu0
    public final void setOptionsImageResource(int i) {
        this.i.setImageResource(i);
    }

    @Override // xsna.duu0
    public final void setOptionsImageTintList(ColorStateList colorStateList) {
        this.i.setImageTintList(colorStateList);
    }

    @Override // xsna.duu0
    public final void setOptionsIsVisible(boolean z) {
        bwt0.p0(this.i, z);
    }

    @Override // xsna.duu0
    public final void setPinBackgroundResource(int i) {
        this.k.setBackgroundResource(i);
    }

    @Override // xsna.duu0
    public final void setPinBackgroundTintList(ColorStateList colorStateList) {
        this.k.setBackgroundTintList(colorStateList);
    }

    @Override // xsna.duu0
    public final void setPinIsVisible(boolean z) {
        bwt0.p0(this.k, z);
    }

    @Override // xsna.duu0
    public final void setTextLayoutAuthorName(CharSequence charSequence) {
        this.g.setAuthorName(charSequence);
    }

    @Override // xsna.duu0
    public final void setTextLayoutCoauthorName(String str) {
        this.g.setCoauthorName(str);
    }

    @Override // xsna.duu0
    public final void setTextLayoutCoauthorsCount(String str) {
        this.g.setCoauthorsCount(str);
    }

    @Override // xsna.duu0
    public final void setTextLayoutMarginEnd(int i) {
        f4m.r(i, this.g);
    }

    @Override // xsna.duu0
    public final void setTextLayoutTextColor(ColorStateList colorStateList) {
        this.g.setTextColor(colorStateList);
    }
}
