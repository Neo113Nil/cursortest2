package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;

/* compiled from: UserProfileRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public final class cuq0 extends ol6 implements ta60<ProfilesRecommendations> {
    public final View M;
    public final TextView N;
    public final View O;
    public in60 P;

    public cuq0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.user_profile_recommendations_v3, viewGroup, h170Var);
        View findViewById = this.itemView.findViewById(R.id.user_profile_title_container);
        this.M = findViewById;
        TextView textView = (TextView) this.itemView.findViewById(R.id.user_profile_title);
        this.N = textView;
        View findViewById2 = this.itemView.findViewById(R.id.user_profile_hide_button);
        this.O = findViewById2;
        textView.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        f4m.y(0, findViewById);
        findViewById.setMinimumHeight(cn70.b(52));
    }

    @Override // xsna.ta60
    public final void D3(ProfilesRecommendations profilesRecommendations) {
        NewsEntry.TrackData trackData = profilesRecommendations.q;
        trackData.d = pvo0.a();
        trackData.h = this.u;
        this.p = profilesRecommendations;
        E6(profilesRecommendations);
    }

    @Override // xsna.ol6, xsna.rp6
    /* renamed from: d7 */
    public final void U6(ProfilesRecommendations profilesRecommendations) {
        super.U6(profilesRecommendations);
        this.N.setText(profilesRecommendations.j);
        b7().e = "synthetic_friends_profile_redesign";
        s1c0 s1c0Var = this.x;
        if (s1c0Var == null || !s1c0Var.c) {
            ecn.a(profilesRecommendations);
        }
    }

    @Override // xsna.ol6
    public final void e7() {
        in60 in60Var = this.P;
        if (in60Var != null) {
            in60Var.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ol6
    public final void f7(RecommendedProfile recommendedProfile) {
        ArrayList<RecommendedProfile> arrayList;
        ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) q6();
        if (profilesRecommendations == null || (arrayList = profilesRecommendations.l) == null) {
            return;
        }
        arrayList.remove(recommendedProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NewsEntry.TrackData trackData;
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.N)) {
            ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) q6();
            if (profilesRecommendations != null) {
                hd60.a().B0(this.itemView.getContext(), profilesRecommendations.i);
                return;
            }
            return;
        }
        if (epx.f(view, this.O)) {
            in60 in60Var = this.P;
            if (in60Var != null) {
                in60Var.invoke();
            }
            ProfilesRecommendations profilesRecommendations2 = (ProfilesRecommendations) q6();
            if (profilesRecommendations2 == null || (trackData = profilesRecommendations2.q) == null) {
                return;
            }
            int a = pvo0.a();
            b.d dVar = new b.d("hide_block");
            dVar.b = true;
            dVar.b(a + '|' + trackData.h + '|' + trackData.b, "blocks");
            dVar.e();
        }
    }
}
