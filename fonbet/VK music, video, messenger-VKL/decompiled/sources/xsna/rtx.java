package xsna;

import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ItemActionLinkStatView.kt */
/* loaded from: classes16.dex */
public final class rtx extends FrameLayout implements otx {
    public ntx b;
    public VkPicture c;
    public VkPicture d;
    public VkText e;
    public VkText f;
    public VkText g;
    public VkText h;

    public final VkPicture getPhoto() {
        return this.c;
    }

    public final VkPicture getPlaceholder() {
        return this.d;
    }

    public final VkText getSubTitle() {
        return this.f;
    }

    public final VkText getTitle() {
        return this.e;
    }

    @Override // xsna.otx
    public void setActionLinkClicks(int i) {
        this.g.setText(String.valueOf(i));
    }

    @Override // xsna.otx
    public void setActionLinkViews(int i) {
        this.h.setText(String.valueOf(i));
    }

    @Override // xsna.otx
    public void setLoadPhoto(String str) {
        this.c.o0(str, null);
    }

    public final void setPhoto(VkPicture vkPicture) {
        this.c = vkPicture;
    }

    @Override // xsna.otx
    public void setPhotoPlaceholder(int i) {
        this.d.setContent(new c.a(i, R.attr.vk_ui_icon_secondary));
    }

    public final void setPlaceholder(VkPicture vkPicture) {
        this.d = vkPicture;
    }

    public final void setSubTitle(VkText vkText) {
        this.f = vkText;
    }

    public final void setTitle(VkText vkText) {
        this.e = vkText;
    }

    @Override // xsna.otx
    public final void z4(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.e.setText(charSequence);
        super.L5(this.e, charSequence.toString());
        this.f.setText(charSequence2);
        super.L5(this.f, charSequence2.toString());
    }

    @Override // xsna.dc6
    public ntx getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(ntx ntxVar) {
        this.b = ntxVar;
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }

    @Override // xsna.otx
    public void setItemClickEnabled(boolean z) {
    }

    @Override // xsna.otx
    public void setSelectionVisibility(boolean z) {
    }
}
