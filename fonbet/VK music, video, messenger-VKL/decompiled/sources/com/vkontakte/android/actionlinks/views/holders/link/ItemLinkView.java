package com.vkontakte.android.actionlinks.views.holders.link;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.ra6;
import xsna.uux;
import xsna.vux;

/* compiled from: ItemLinkView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class ItemLinkView extends FrameLayout implements vux {
    public static final /* synthetic */ int f = 0;
    public uux b;
    public final VkImageSimple c;
    public final VkText d;
    public final VkText e;

    public ItemLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final VkImageSimple getPhoto() {
        return this.c;
    }

    public final VkText getSubTitle() {
        return this.e;
    }

    public final VkText getTitle() {
        return this.d;
    }

    @Override // xsna.vux
    public void setSubTitle(String str) {
        this.e.setText(str);
    }

    public void setTitle(int i) {
        this.d.setText(getContext().getString(i));
    }

    @Override // xsna.vux
    public void setValid(boolean z) {
        this.e.setTextColor(z ? dhr0.t.c(R.attr.vk_ui_text_secondary) : getContext().getColor(R.color.vk_red));
    }

    public ItemLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.collection_item_link, (ViewGroup) this, true);
        this.c = (VkImageSimple) findViewById(R.id.collection_item_link_photo);
        this.d = (VkText) findViewById(R.id.collection_item_link_title);
        this.e = (VkText) findViewById(R.id.collection_item_link_subtitle);
        setOnClickListener(new ra6(this, 4));
    }

    @Override // xsna.dc6
    public uux getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(uux uuxVar) {
        this.b = uuxVar;
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }

    public void setLoadPhoto(String str) {
    }

    public void setPhotoPlaceholder(int i) {
    }
}
