package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.g8b;

/* compiled from: ChannelPayoutBottomSheet.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class r7b extends FunctionReferenceImpl implements izs<g8b.a.C2922a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(g8b.a.C2922a c2922a) {
        VkTopBar.Middle middle;
        g8b.a.C2922a c2922a2 = c2922a;
        f8b f8bVar = (f8b) this.receiver;
        f8bVar.getClass();
        g8b.a.C2922a.InterfaceC2923a interfaceC2923a = c2922a2.b;
        if (epx.f(interfaceC2923a, g8b.a.C2922a.InterfaceC2923a.C2924a.a)) {
            middle = new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.vkim_channels_payout_title_bank_card), null, null, null, null, 30), null, null, null, 14);
        } else if (epx.f(interfaceC2923a, g8b.a.C2922a.InterfaceC2923a.c.a)) {
            middle = new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.vkim_channels_payout_title_vk_pay), null, null, null, null, 30), null, null, null, 14);
        } else {
            if (!epx.f(interfaceC2923a, g8b.a.C2922a.InterfaceC2923a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            middle = VkTopBar.Middle.c.a;
        }
        f8bVar.e.setMiddle(middle);
        f8bVar.h.setItems(c2922a2.c);
        f8bVar.i.setText(c2922a2.d ? R.string.vkim_channels_payout_save_button : R.string.vkim_channels_payout_close_button);
        boolean z = c2922a2.a;
        f8bVar.f.setVisibility(z ? 0 : 8);
        f8bVar.g.setVisibility(z ? 8 : 0);
        return s3q0.a;
    }
}
