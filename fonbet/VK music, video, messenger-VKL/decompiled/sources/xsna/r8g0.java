package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vkontakte.android.R;

/* compiled from: RequestsToFollowersHolder.kt */
/* loaded from: classes16.dex */
public final class r8g0 extends RecyclerView.e0 {
    public final View l;
    public final TextView m;
    public final TextView n;
    public final ImageView o;
    public final View p;
    public final View q;

    public r8g0(View view, FriendRequestsFragment.f fVar) {
        super(view);
        this.l = view.findViewById(R.id.state_requests_present);
        this.m = (TextView) view.findViewById(R.id.title);
        this.n = (TextView) view.findViewById(R.id.description);
        this.o = (ImageView) view.findViewById(R.id.icon);
        View findViewById = view.findViewById(R.id.move_to_followers_button);
        this.p = findViewById;
        this.q = view.findViewById(R.id.state_no_requests);
        jjc.g(findViewById, new c4i(1, fVar));
    }
}
