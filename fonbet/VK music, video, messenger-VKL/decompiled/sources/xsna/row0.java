package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.group_selector.ui.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipGroupSelectorContentItemViewHolder.kt */
/* loaded from: classes7.dex */
public final class row0 extends vfz<b.a.d> {
    public final dpw0<com.vk.voip.ui.group_selector.ui.a> l;
    public final VoipAvatarViewContainer m;
    public final ImageView n;
    public final TextView o;
    public final View p;

    /* JADX WARN: Multi-variable type inference failed */
    public row0(ViewGroup viewGroup, dpw0<? super com.vk.voip.ui.group_selector.ui.a> dpw0Var) {
        super(R.layout.voip_call_group_selector_item, viewGroup);
        this.l = dpw0Var;
        this.m = (VoipAvatarViewContainer) this.itemView.findViewById(R.id.call_group_selector_item_avatar);
        this.n = (ImageView) this.itemView.findViewById(R.id.call_user_selector_item_icon);
        this.o = (TextView) this.itemView.findViewById(R.id.call_group_selector_item_title);
        this.p = this.itemView.findViewById(R.id.call_group_selector_item_check_icon);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(b.a.d dVar) {
        b.a.d dVar2 = dVar;
        boolean z = dVar2 instanceof b.a.d.C2048b;
        VoipAvatarViewContainer voipAvatarViewContainer = this.m;
        ImageView imageView = this.n;
        if (z) {
            imageView.setVisibility(8);
            voipAvatarViewContainer.setVisibility(0);
            b.a.d.C2048b c2048b = (b.a.d.C2048b) dVar2;
            uew0.D(voipAvatarViewContainer, c2048b.d, c2048b.f ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), c2048b.c, 2), 4);
        } else if (dVar2 instanceof b.a.d.c) {
            imageView.setVisibility(8);
            voipAvatarViewContainer.setVisibility(0);
            b.a.d.c cVar = (b.a.d.c) dVar2;
            uew0.D(voipAvatarViewContainer, cVar.d, cVar.f ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 12);
        } else {
            if (!(dVar2 instanceof b.a.d.C2047a)) {
                throw new NoWhenBranchMatchedException();
            }
            voipAvatarViewContainer.setVisibility(4);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.vk_icon_users_3_outline_28);
        }
        s3q0 s3q0Var = s3q0.a;
        TextView textView = this.o;
        if (z) {
            textView.setText(((b.a.d.C2048b) dVar2).e);
        } else if (dVar2 instanceof b.a.d.c) {
            textView.setText(((b.a.d.c) dVar2).e);
        } else {
            if (!(dVar2 instanceof b.a.d.C2047a)) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setText(R.string.voip_history_past_calls_header_filter_all);
        }
        this.p.setVisibility(dVar2.p() ? 0 : 8);
        jjc.g(this.itemView, new np5(26, dVar2, this));
    }
}
