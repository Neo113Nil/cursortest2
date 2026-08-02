package xsna;

import android.text.Editable;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.im.ui.utils.CreateChannelFlowTracker;

/* compiled from: ChannelCreationViewController.kt */
/* loaded from: classes2.dex */
public final class hxa extends rno0 {
    public final /* synthetic */ VkInputSelect b;

    public hxa(VkInputSelect vkInputSelect) {
        this.b = vkInputSelect;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.WRITE_TITLE_PERSONAL_CHANNEL);
            this.b.e(this);
        }
    }
}
