package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: ItemAddButtonView.kt */
/* loaded from: classes16.dex */
public final class ztx extends FrameLayout implements xtx {
    public wtx b;
    public final VkButton c;

    public ztx(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.collection_item_add, (ViewGroup) this, true);
        VkButton vkButton = (VkButton) findViewById(R.id.collection_item_add_text);
        this.c = vkButton;
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_add_outline_24));
        vkButton.setMode(VkButton.Mode.Link);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        setOnClickListener(new oa6(this, 7));
    }

    @Override // xsna.xtx
    public void setDisabled(boolean z) {
        this.c.setEnabled(!z);
    }

    @Override // xsna.xtx
    public void setTitle(int i) {
        this.c.setText(i);
    }

    @Override // xsna.dc6
    public wtx getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(wtx wtxVar) {
        this.b = wtxVar;
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }
}
