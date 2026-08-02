package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.common.Peer;
import com.vk.im.ui.views.online.OnlineView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bqw0;
import xsna.gp80;

/* compiled from: VoipHistoryFriendsFriendViewHolder.kt */
/* loaded from: classes7.dex */
public final class opw0 extends aqw0<bqw0.b> {
    public final zpw0<a.b> l;
    public final gp80 m;
    public final VoipAvatarViewContainer n;
    public final OnlineView o;
    public final TextView p;
    public final TextView q;
    public final ImageView r;
    public final ImageView s;

    public opw0(ViewGroup viewGroup, VoipHistoryFriendsFragment.c cVar) {
        super(R.layout.voip_history_friends_item_friend, viewGroup);
        this.l = cVar;
        this.m = new gp80(this.itemView.getContext());
        this.n = (VoipAvatarViewContainer) this.itemView.findViewById(R.id.friend_avatar);
        this.o = (OnlineView) this.itemView.findViewById(R.id.friend_online);
        this.p = (TextView) this.itemView.findViewById(R.id.friend_title);
        this.q = (TextView) this.itemView.findViewById(R.id.friend_subtitle);
        this.r = (ImageView) this.itemView.findViewById(R.id.friend_call_audio_button);
        this.s = (ImageView) this.itemView.findViewById(R.id.friend_call_video_button);
    }

    @Override // xsna.aqw0
    public final void h6(bqw0.b bVar) {
        String string;
        kr5 kr5Var = bVar.i;
        com.vk.im.ui.views.avatars.a aVar = new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), null, 6);
        StringBuilder sb = new StringBuilder();
        String str = bVar.c;
        sb.append(str);
        sb.append(' ');
        String str2 = bVar.d;
        sb.append(str2);
        aVar.c(sb.toString(), Peer.Type.CONTACT);
        s3q0 s3q0Var = s3q0.a;
        this.n.c(kr5.a(kr5Var, aVar, null, 11));
        UsersOnlineInfoDto usersOnlineInfoDto = bVar.f;
        this.o.setFromUsersOnlineInfo(usersOnlineInfoDto);
        this.p.setText(str + ' ' + str2);
        boolean z = bVar.g;
        gp80 gp80Var = this.m;
        Context context = gp80Var.a;
        boolean g = usersOnlineInfoDto.g();
        Boolean j = usersOnlineInfoDto.j();
        boolean booleanValue = j != null ? j.booleanValue() : false;
        boolean P = j5g.P(p3v0.a, usersOnlineInfoDto.d());
        long intValue = usersOnlineInfoDto.e() != null ? r10.intValue() * 1000 : 0L;
        UsersOnlineInfoDto.StatusDto f = usersOnlineInfoDto.f();
        if (f == null) {
            f = UsersOnlineInfoDto.StatusDto.NOT_SHOW;
        }
        if (g && booleanValue && P) {
            string = context.getString(R.string.vkme_online);
        } else if (g && booleanValue) {
            string = context.getString(R.string.online);
        } else if (g) {
            string = gp80Var.b(z, intValue);
        } else {
            int i = gp80.a.$EnumSwitchMapping$1[f.ordinal()];
            if (i == 1) {
                string = context.getString(z ? R.string.online_recently_f : R.string.online_recently_m);
            } else if (i == 2) {
                string = context.getString(z ? R.string.online_last_week_f : R.string.online_last_week_m);
            } else if (i == 3) {
                string = context.getString(z ? R.string.online_last_month_f : R.string.online_last_month_m);
            } else if (i == 4) {
                string = context.getString(z ? R.string.online_long_ago_f : R.string.online_long_ago_m);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                string = "";
            }
        }
        this.q.setText(gp80Var.a(string));
        boolean z2 = bVar.h;
        ImageView imageView = this.s;
        ImageView imageView2 = this.r;
        if (z2) {
            imageView2.setEnabled(true);
            imageView2.setAlpha(1.0f);
            bwt0.i0(imageView2, new v0s0(5, this, bVar));
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
            bwt0.i0(imageView, new eci0(11, this, bVar));
        } else {
            imageView2.setEnabled(false);
            imageView2.setAlpha(0.3f);
            imageView2.setOnClickListener(null);
            imageView.setEnabled(false);
            imageView.setAlpha(0.3f);
            imageView.setOnClickListener(null);
        }
        bwt0.i0(this.itemView, new l1k0(11, this, bVar));
    }
}
