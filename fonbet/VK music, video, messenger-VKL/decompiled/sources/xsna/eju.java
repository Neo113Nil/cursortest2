package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardWithBottomBtnVh;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.profile.community.core.ui.groupcard.GroupCardWithBottomBtnView;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import xsna.b910;
import xsna.dxb0;
import xsna.jgz0;
import xsna.kkz0;
import xsna.q810;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class eju implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eju(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kkz0.a aVar;
        int i = this.b;
        b910 b910Var = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                GroupCardWithBottomBtnVh groupCardWithBottomBtnVh = (GroupCardWithBottomBtnVh) obj2;
                Context context = ((GroupCardWithBottomBtnView) obj).getContext();
                UIBlockGroup uIBlockGroup = groupCardWithBottomBtnVh.e;
                groupCardWithBottomBtnVh.h(context, uIBlockGroup != null ? uIBlockGroup.y : null, null, null, null);
                break;
            case 1:
                int i2 = MoneyTransferLinkFragment.u0;
                ((MoneyTransferLinkFragment) obj2).uo((String) obj);
                break;
            case 2:
                s540 s540Var = (s540) obj;
                q810 q810Var = ((v540) obj2).b;
                if (q810Var instanceof q810.c) {
                    b910Var = b910.a.a;
                } else if (q810Var instanceof q810.a) {
                    b910Var = b910.b.a;
                }
                if (b910Var != null) {
                    s540Var.l.invoke(b910Var);
                    break;
                }
                break;
            case 3:
                ((izs) obj2).invoke(((f990) obj).m);
                break;
            case 4:
                dxb0.a aVar2 = (dxb0.a) obj2;
                dxb0 dxb0Var = (dxb0) obj;
                int adapterPosition = aVar2.getAdapterPosition();
                if (adapterPosition != -1) {
                    aVar2.l.li(adapterPosition, dxb0Var.d.get(adapterPosition));
                    break;
                }
                break;
            case 5:
                ((hgw0) obj).b.a(new a.b.d(((VoipCallByLinkViewState.MediaSettingDialog.Visible) obj2).a));
                break;
            default:
                ydz0.a aVar3 = (ydz0.a) obj;
                int i3 = view == ((acz0) obj2).c ? 2 : 1;
                akz0 akz0Var = new akz0();
                ydz0 ydz0Var = (ydz0) ((bj50) aVar3).c;
                if (view.isEnabled() && (aVar = ydz0Var.t) != null) {
                    ((jgz0.b) aVar).a(i3, akz0Var);
                    break;
                }
                break;
        }
    }
}
