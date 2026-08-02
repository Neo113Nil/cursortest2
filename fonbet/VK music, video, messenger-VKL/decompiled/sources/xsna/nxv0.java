package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: VkUiTabContent.kt */
/* loaded from: classes17.dex */
public class nxv0 extends com.vk.core.view.components.tabs.d {
    public int H;
    public int I;
    public int J;
    public int K;
    public final int L;

    public nxv0(Context context) {
        super(context);
        setMinWidth(e3m.a(R.dimen.ds_tab_min_width, context));
        this.H = R.attr.vk_ui_text_secondary;
        this.I = R.attr.vk_ui_text_primary;
        this.J = R.attr.vk_ui_icon_medium;
        this.K = R.attr.vk_ui_icon_primary;
        this.L = R.attr.vk_ui_transparent;
    }

    @Override // com.vk.core.view.components.tabs.d
    public int getEndIconColorRes() {
        return this.K;
    }

    @Override // com.vk.core.view.components.tabs.d
    public int getEndTextColorRes() {
        return this.I;
    }

    @Override // com.vk.core.view.components.tabs.d
    public int getStartIconColorRes() {
        return this.J;
    }

    @Override // com.vk.core.view.components.tabs.d
    public int getStartTextColorRes() {
        return this.H;
    }

    @Override // com.vk.core.view.components.tabs.d
    public int getTransparentColorRes() {
        return this.L;
    }

    @Override // com.vk.core.view.components.tabs.d
    public void setEndIconColorRes(int i) {
        this.K = i;
    }

    @Override // com.vk.core.view.components.tabs.d
    public void setEndTextColorRes(int i) {
        this.I = i;
    }

    @Override // com.vk.core.view.components.tabs.d
    public void setStartIconColorRes(int i) {
        this.J = i;
    }

    @Override // com.vk.core.view.components.tabs.d
    public void setStartTextColorRes(int i) {
        this.H = i;
    }
}
