package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.z0e0;

/* compiled from: ProfilesRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public final class k1e0 extends ol6 {
    public final p870 M;

    public k1e0(ViewGroup viewGroup, h170 h170Var, p870 p870Var) {
        super(R.layout.post_friends_recomm, viewGroup, h170Var);
        this.M = p870Var;
    }

    @Override // xsna.ol6
    public final void c7(RecommendedProfile recommendedProfile) {
        int i;
        j1e0 b7 = b7();
        int itemCount = b7.getItemCount();
        if (itemCount >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                if (b7.c(i2) instanceof z0e0.d) {
                    i++;
                }
                if (i2 == itemCount) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i = 0;
        }
        if (!(i == 1)) {
            h7(recommendedProfile);
            return;
        }
        nbf0 nbf0Var = this.F;
        if (nbf0Var != null) {
            nbf0Var.c = new i5(17, this, recommendedProfile);
        }
        RecyclerView.Adapter adapter = this.E.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyItemRemoved(0);
        }
    }

    @Override // xsna.ol6, xsna.rp6
    /* renamed from: d7 */
    public final void U6(ProfilesRecommendations profilesRecommendations) {
        super.U6(profilesRecommendations);
        s1c0 s1c0Var = this.x;
        if (s1c0Var == null || !s1c0Var.c) {
            ecn.a(profilesRecommendations);
        }
    }

    @Override // xsna.ol6
    public final void e7() {
        this.M.e(148, q6());
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
