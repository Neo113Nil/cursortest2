package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipCallByLinkContentCallAsViewHolder.kt */
/* loaded from: classes7.dex */
public final class wfw0 extends vfz<VoipCallByLinkViewState.ContentDialog.Item.a> {
    public final kgw0<a.AbstractC2032a.C2033a> l;
    public final VoipAvatarViewContainer m;
    public final TextView n;
    public final TextView o;

    /* JADX WARN: Multi-variable type inference failed */
    public wfw0(ViewGroup viewGroup, kgw0<? super a.AbstractC2032a.C2033a> kgw0Var) {
        super(R.layout.voip_call_by_link_call_as_item, viewGroup);
        this.l = kgw0Var;
        this.m = (VoipAvatarViewContainer) this.itemView.findViewById(R.id.call_by_link_call_as_button_avatar);
        this.n = (TextView) this.itemView.findViewById(R.id.call_by_link_call_as_button_title);
        this.o = (TextView) this.itemView.findViewById(R.id.call_by_link_call_as_button_subtitle);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(VoipCallByLinkViewState.ContentDialog.Item.a aVar) {
        int i;
        String str;
        VoipCallByLinkViewState.ContentDialog.Item.a aVar2 = aVar;
        boolean z = aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.a.C2031a;
        VoipAvatarViewContainer voipAvatarViewContainer = this.m;
        if (z) {
            VoipCallByLinkViewState.ContentDialog.Item.a.C2031a c2031a = (VoipCallByLinkViewState.ContentDialog.Item.a.C2031a) aVar2;
            uew0.D(voipAvatarViewContainer, c2031a.c, c2031a.e ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), c2031a.b, 2), 4);
        } else {
            if (!(aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            VoipCallByLinkViewState.ContentDialog.Item.a.b bVar = (VoipCallByLinkViewState.ContentDialog.Item.a.b) aVar2;
            uew0.D(voipAvatarViewContainer, bVar.b, bVar.d ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 12);
        }
        Context context = this.itemView.getContext();
        if (z) {
            i = R.string.voip_call_by_link_call_as_self;
        } else {
            if (!(aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_call_by_link_call_as_group;
        }
        this.n.setText(context.getString(i));
        if (z) {
            str = ((VoipCallByLinkViewState.ContentDialog.Item.a.C2031a) aVar2).d;
        } else {
            if (!(aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((VoipCallByLinkViewState.ContentDialog.Item.a.b) aVar2).c;
        }
        this.o.setText(str);
        bwt0.i0(this.itemView, new gyo0(this, 18));
    }
}
