package xsna;

import android.view.View;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.story.api.storyflexboxfactory.StickerButtonType;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import xsna.m5u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class c6u implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c6u(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                sop sopVar = (sop) obj2;
                p5u p5uVar = ((d6u) obj).o;
                k7u k7uVar = (p5uVar == null ? null : p5uVar).b;
                if (p5uVar == null) {
                    p5uVar = null;
                }
                sopVar.invoke(new m5u.r(k7uVar, p5uVar.b.a.J, false, -1));
                break;
            case 1:
                int i2 = MoneyTransferLinkFragment.u0;
                ((MoneyTransferLinkFragment) obj2).uo((String) obj);
                break;
            case 2:
                rh0 rh0Var = (rh0) obj2;
                OneVideoAdControlsView oneVideoAdControlsView = (OneVideoAdControlsView) obj;
                int i3 = OneVideoAdControlsView.A;
                Integer num = rh0Var.b;
                if (num != null && num.intValue() == 0) {
                    oneVideoAdControlsView.getListener();
                }
                Integer num2 = rh0Var.b;
                boolean z = num2 == null || num2.intValue() == 0;
                OneVideoAdBaseControls.a listener = oneVideoAdControlsView.getListener();
                if (listener != null) {
                    listener.a(z);
                    break;
                }
                break;
            case 3:
                ((n2l0) obj2).m.invoke((StickerButtonType) obj);
                break;
            case 4:
                View view2 = (View) obj2;
                qgj.a(view2.getContext(), new aq1(27, view2, (glu0) obj));
                break;
            default:
                ((hgw0) obj).b.a(new a.b.C2037b(((VoipCallByLinkViewState.MediaSettingDialog.Visible) obj2).a));
                break;
        }
    }
}
