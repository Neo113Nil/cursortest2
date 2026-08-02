package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ItemHintView.kt */
/* loaded from: classes16.dex */
public final class rux extends FrameLayout implements pux {
    public oux b;
    public final VkText c;

    public rux(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.collection_item_hint, (ViewGroup) this, true);
        this.c = (VkText) findViewById(R.id.collection_item_hint_hint);
    }

    @Override // xsna.pux
    public void setText(int i) {
        this.c.setText(getContext().getText(i));
    }

    @Override // xsna.dc6
    public oux getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(oux ouxVar) {
        this.b = ouxVar;
    }

    public void setText(String str) {
        this.c.setText(str);
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }
}
