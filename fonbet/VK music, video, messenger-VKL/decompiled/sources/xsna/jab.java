package xsna;

import android.content.res.Resources;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.design.view.wheel.ImWheelSelectorView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tlo0;
import xsna.vab;

/* compiled from: ChannelReactionQuantitySelectorBottomSheet.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class jab extends FunctionReferenceImpl implements izs<vab.a.C3876a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(vab.a.C3876a c3876a) {
        vab.a.C3876a c3876a2 = c3876a;
        uab uabVar = (uab) this.receiver;
        uabVar.e.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.vkim_channels_reaction_quantity_selector_title), null, null, null, null, 30), new VkTopBar.Middle.Text.c(tlo0.a.c(R.string.vkim_channels_reaction_quantity_selector_subtitle, Integer.valueOf(c3876a2.b)), null, null, 30), null, null, 12));
        Resources resources = uabVar.b.getResources();
        int i = c3876a2.a;
        uabVar.f.setText(resources.getQuantityString(R.plurals.vkim_channels_reaction_quantity_selector_accept_btn, i, Integer.valueOf(i), Integer.valueOf(c3876a2.c)));
        if (i != uabVar.h) {
            uabVar.h = i;
            final ImWheelSelectorView imWheelSelectorView = uabVar.g;
            final int i2 = i - 1;
            imWheelSelectorView.getClass();
            if (i2 >= 0) {
                imWheelSelectorView.post(new Runnable() { // from class: xsna.tew
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImWheelSelectorView.b(ImWheelSelectorView.this, i2);
                    }
                });
            }
        }
        return s3q0.a;
    }
}
