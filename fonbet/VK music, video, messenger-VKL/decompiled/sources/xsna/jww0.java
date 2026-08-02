package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipScheduleCallCallAsViewHolder.kt */
/* loaded from: classes7.dex */
public final class jww0 extends vfz<VoipScheduleCallViewState.ScreenState.Item.a> {
    public final qxw0<pxw0> l;
    public final VoipAvatarViewContainer m;
    public final TextView n;
    public final TextView o;

    /* JADX WARN: Multi-variable type inference failed */
    public jww0(ViewGroup viewGroup, qxw0<? super pxw0> qxw0Var) {
        super(R.layout.voip_call_by_link_call_as_item, viewGroup);
        this.l = qxw0Var;
        this.m = (VoipAvatarViewContainer) this.itemView.findViewById(R.id.call_by_link_call_as_button_avatar);
        this.n = (TextView) this.itemView.findViewById(R.id.call_by_link_call_as_button_title);
        this.o = (TextView) this.itemView.findViewById(R.id.call_by_link_call_as_button_subtitle);
        bwt0.i0(this.itemView, new vgs0(this, 15));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(VoipScheduleCallViewState.ScreenState.Item.a aVar) {
        int i;
        String str;
        VoipScheduleCallViewState.ScreenState.Item.a aVar2 = aVar;
        boolean z = aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.a.C2073a;
        VoipAvatarViewContainer voipAvatarViewContainer = this.m;
        if (z) {
            VoipScheduleCallViewState.ScreenState.Item.a.C2073a c2073a = (VoipScheduleCallViewState.ScreenState.Item.a.C2073a) aVar2;
            uew0.D(voipAvatarViewContainer, c2073a.c, c2073a.e ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), c2073a.b, 2), 4);
        } else {
            if (!(aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            VoipScheduleCallViewState.ScreenState.Item.a.b bVar = (VoipScheduleCallViewState.ScreenState.Item.a.b) aVar2;
            uew0.D(voipAvatarViewContainer, bVar.b, bVar.d ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 12);
        }
        Context context = this.itemView.getContext();
        if (z) {
            i = R.string.voip_call_by_link_call_as_self;
        } else {
            if (!(aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_call_by_link_call_as_group;
        }
        this.n.setText(context.getString(i));
        if (z) {
            str = ((VoipScheduleCallViewState.ScreenState.Item.a.C2073a) aVar2).d;
        } else {
            if (!(aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((VoipScheduleCallViewState.ScreenState.Item.a.b) aVar2).c;
        }
        this.o.setText(str);
    }
}
