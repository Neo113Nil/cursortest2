package xsna;

import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;

/* compiled from: ItemActionLinkProductView.kt */
/* loaded from: classes16.dex */
public final class qtx extends FrameLayout implements otx {
    public ntx b;
    public VkImage c;
    public VkText d;
    public VkText e;

    public final VkImage getPhoto() {
        return this.c;
    }

    public final VkText getSubTitle() {
        return this.e;
    }

    public final VkText getTitle() {
        return this.d;
    }

    @Override // xsna.otx
    public void setItemClickEnabled(boolean z) {
        setClickable(z);
    }

    @Override // xsna.otx
    public void setLoadPhoto(String str) {
        this.c.o0(str, null);
    }

    public final void setPhoto(VkImage vkImage) {
        this.c = vkImage;
    }

    public final void setSubTitle(VkText vkText) {
        this.e = vkText;
    }

    public final void setTitle(VkText vkText) {
        this.d = vkText;
    }

    @Override // xsna.otx
    public final void z4(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.d.setText(charSequence);
        super.L5(this.d, charSequence.toString());
        this.e.setText(charSequence2);
        super.L5(this.e, charSequence2.toString());
    }

    @Override // xsna.dc6
    public ntx getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(ntx ntxVar) {
        this.b = ntxVar;
    }

    @Override // xsna.otx
    public void setActionLinkClicks(int i) {
    }

    @Override // xsna.otx
    public void setActionLinkViews(int i) {
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }

    @Override // xsna.otx
    public void setPhotoPlaceholder(int i) {
    }

    @Override // xsna.otx
    public void setSelectionVisibility(boolean z) {
    }
}
