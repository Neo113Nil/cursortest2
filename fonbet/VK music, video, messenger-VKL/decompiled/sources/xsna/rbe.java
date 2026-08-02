package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;
import com.vk.permission.dialog.VkSeparatePermissionDialog;
import com.vk.profilelist.impl.ProfileListRootFragment;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.ui.VkTextFieldView;
import xsna.smu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rbe implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rbe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((sbe) obj).a.invoke(ClipsGridBlockAction.e.b);
                break;
            case 1:
                ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).d.invoke(a.c.b);
                break;
            case 2:
                com.vk.ecomm.catalog.impl.catalog.simple.a aVar = (com.vk.ecomm.catalog.impl.catalog.simple.a) obj;
                aVar.h(aVar.e, aVar.d, true);
                break;
            case 3:
                qp30 qp30Var = (qp30) obj;
                pk30 pk30Var = qp30Var.j;
                rp30 rp30Var = qp30Var.k;
                Msg msg = rp30Var != null ? rp30Var.t : null;
                Attach attach = rp30Var != null ? rp30Var.v : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.O(attach);
                    break;
                }
                break;
            case 4:
                int i2 = PaidSubscriptionsFragment.V;
                ((PaidSubscriptionsFragment) obj).s();
                break;
            case 5:
                lma0 lma0Var = (lma0) ((mma0) obj).h;
                if (lma0Var != null) {
                    lma0Var.a4();
                    break;
                }
                break;
            case 6:
                int i3 = ProfileListRootFragment.W;
                ((ProfileListRootFragment) obj).finish();
                break;
            case 7:
                art0 art0Var = (art0) obj;
                pk30 pk30Var2 = art0Var.l;
                if (pk30Var2 != null) {
                    pk30Var2.O(art0Var.p);
                    break;
                }
                break;
            case 8:
                smu0 smu0Var = (smu0) obj;
                smu0.a aVar2 = smu0Var.f1;
                if (aVar2 != null) {
                    aVar2.a();
                }
                smu0Var.dismiss();
                break;
            case 9:
                ((VkSeparatePermissionDialog.b.a) obj).l.toggle();
                break;
            default:
                VkTextFieldView vkTextFieldView = (VkTextFieldView) obj;
                izs<? super View, s3q0> izsVar = vkTextFieldView.g;
                if (izsVar != null) {
                    izsVar.invoke(vkTextFieldView.e);
                    break;
                }
                break;
        }
    }
}
