package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.design.R$styleable;
import com.vkontakte.android.R;

/* compiled from: AdsCarouselView.kt */
/* loaded from: classes18.dex */
public final class lv0 extends FrameLayout {
    public final VkImage b;
    public final VkText c;
    public final VkText d;
    public final VkText e;
    public final VkButton f;
    public final ConstraintLayout g;

    public lv0(Context context, int i) {
        super(context, null, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.a, 0, 0);
        int integer = obtainStyledAttributes.getInteger(0, 0);
        Integer valueOf = integer > 0 ? Integer.valueOf(integer) : null;
        i = valueOf != null ? valueOf.intValue() : i;
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.news_ad_card_item_v1, this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        this.g = constraintLayout;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
        } else {
            layoutParams = new FrameLayout.LayoutParams(i, -2);
        }
        constraintLayout.setLayoutParams(layoutParams);
        setBackgroundResource(R.drawable.bg_secondary_rounded_12);
        VkImage vkImage = (VkImage) findViewById(R.id.content_photo);
        this.b = vkImage;
        this.c = (VkText) findViewById(R.id.title);
        this.d = (VkText) findViewById(R.id.price);
        this.e = (VkText) findViewById(R.id.old_price);
        VkButton vkButton = (VkButton) findViewById(R.id.button);
        this.f = vkButton;
        vkImage.getLayoutParams().height = i;
        vkImage.setPlaceholderImage(R.drawable.card_image_placeholder);
        vkImage.z0(cn70.a() * 12.0f, cn70.a() * 12.0f, cn70.a() * 2.0f, cn70.a() * 2.0f);
        vkImage.y0(iah0.b(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        vkButton.setBackgroundTint(R.attr.vk_ui_background_contrast_themed);
        vkButton.setTextTint(R.attr.vk_ui_text_primary);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null ? new FrameLayout.LayoutParams(layoutParams) : new FrameLayout.LayoutParams(-2, -2);
    }

    public final VkButton getButton() {
        return this.f;
    }

    public final ConstraintLayout getContainer() {
        return this.g;
    }

    public final VkImage getImage() {
        return this.b;
    }

    public final VkText getOldPrice() {
        return this.e;
    }

    public final VkText getPrice() {
        return this.d;
    }

    public final VkText getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(-2, -2);
    }
}
