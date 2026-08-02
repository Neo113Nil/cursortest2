package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.user.UserProfile;
import com.vk.profile.core.content.profilelist.UserMessagesLauncher;
import com.vkontakte.android.R;

/* compiled from: UserActionableHolder.kt */
/* loaded from: classes5.dex */
public final class cgq0 extends ekq0<UserProfile> {
    public final String w;
    public final bpn0 x;
    public final UserMessagesLauncher y;

    public cgq0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.user_item_removable, false, true);
        this.w = "";
        this.x = new bpn0(new pkd0(9));
        this.y = new UserMessagesLauncher(this.itemView.getContext());
    }

    @Override // xsna.ekq0, xsna.vif0
    /* renamed from: q6 */
    public final void i6(UserProfile userProfile) {
        super.i6(userProfile);
        t6(userProfile);
    }

    public final void t6(UserProfile userProfile) {
        View view = this.r;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView != null) {
            imageView.setEnabled(true);
            if (bwd0.d(bwd0.j(userProfile))) {
                bwt0.p0(imageView, false);
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            if (userProfile.M() && userProfile.d()) {
                bwt0.p0(imageView, true);
                imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_message_outline_24, R.attr.vk_legacy_accent));
                imageView.setContentDescription(imageView.getContext().getString(R.string.profile_accessibility_send_message));
                this.u = new p21(this, imageView, userProfile, 4);
                return;
            }
            int i = 8;
            if (!userProfile.M() && !userProfile.C() && !userProfile.G() && !o25.a().a(userProfile.c)) {
                bwt0.p0(imageView, true);
                imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_user_add_outline_24, R.attr.vk_legacy_accent));
                imageView.setContentDescription(imageView.getContext().getString(R.string.profile_accessibility_send_friend_request));
                this.u = new xxh(this, imageView, userProfile, i);
                return;
            }
            if (userProfile.M() || !userProfile.C() || userProfile.j) {
                bwt0.p0(imageView, false);
                s3q0 s3q0Var2 = s3q0.a;
            } else {
                bwt0.p0(imageView, true);
                imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_add_square_outline_24, R.attr.vk_legacy_accent));
                imageView.setContentDescription(imageView.getContext().getString(R.string.profile_accessibility_join_to_community));
                this.u = new sx4(this, imageView, userProfile, 8);
            }
        }
    }

    public final void v6(Context context, UserProfile userProfile, View view) {
        boolean M = userProfile.M();
        hg1.b(view, hg1.m(xwk.e().q(userProfile.c, M).a0(io.reactivex.rxjava3.android.schedulers.a.b()), context, 0L, false, 62).subscribe(new w250(new agq0(this, userProfile, M, view), 23), new a8v(new gq0(this, userProfile, view, 8), 23)));
    }
}
