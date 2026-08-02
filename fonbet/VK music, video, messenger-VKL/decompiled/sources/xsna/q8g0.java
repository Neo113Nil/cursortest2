package xsna;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vkontakte.android.R;
import xsna.awu;

/* compiled from: RequestsToFollowersHeader.kt */
/* loaded from: classes16.dex */
public final class q8g0 extends awu.b<RequestUserProfile> {
    public final ijs a;
    public final FriendRequestsFragment.f b;

    public q8g0(ijs ijsVar, FriendRequestsFragment.f fVar) {
        this.a = ijsVar;
        this.b = fVar;
    }

    @Override // xsna.awu.b
    public final int a() {
        return 4;
    }

    @Override // xsna.awu.b
    public final void b(RecyclerView.e0 e0Var) {
        if (e0Var instanceof r8g0) {
            ijs ijsVar = this.a;
            if (ijsVar.p) {
                r8g0 r8g0Var = (r8g0) e0Var;
                r8g0Var.q.setVisibility(8);
                r8g0Var.l.setVisibility(0);
                r8g0Var.m.setText(R.string.requests_list_move_to_followers_success);
                r8g0Var.n.setText(R.string.requests_list_move_to_followers_success_description);
                r8g0Var.p.setVisibility(8);
                ImageView imageView = r8g0Var.o;
                imageView.setImageResource(R.drawable.vk_icon_check_circle_outline_56);
                imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_accent_green, r8g0Var.itemView.getContext())));
                return;
            }
            if (ijsVar.m <= 0) {
                r8g0 r8g0Var2 = (r8g0) e0Var;
                r8g0Var2.q.setVisibility(0);
                r8g0Var2.l.setVisibility(8);
                return;
            }
            r8g0 r8g0Var3 = (r8g0) e0Var;
            r8g0Var3.q.setVisibility(8);
            r8g0Var3.l.setVisibility(0);
            r8g0Var3.m.setText(R.string.requests_list_move_to_followers_suggest);
            r8g0Var3.n.setText(R.string.requests_list_move_to_followers_suggest_description);
            r8g0Var3.p.setVisibility(0);
            ImageView imageView2 = r8g0Var3.o;
            imageView2.setImageResource(R.drawable.vk_icon_user_add_outline_56);
            imageView2.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, r8g0Var3.itemView.getContext())));
        }
    }

    @Override // xsna.awu.b
    public final RecyclerView.e0 c(ViewGroup viewGroup) {
        return new r8g0(tf3.b(viewGroup, R.layout.requests_list_requests_to_followers_header, viewGroup, false), this.b);
    }

    @Override // xsna.awu.b
    public final /* bridge */ /* synthetic */ boolean d(RequestUserProfile requestUserProfile) {
        return false;
    }

    @Override // xsna.awu.b
    public final boolean e(RequestUserProfile requestUserProfile) {
        return this.a.j;
    }

    @Override // xsna.awu.b
    public final /* bridge */ /* synthetic */ boolean f(int i, Object obj, Object obj2) {
        return false;
    }
}
