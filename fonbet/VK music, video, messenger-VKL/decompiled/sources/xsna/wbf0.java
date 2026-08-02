package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;

/* compiled from: RecommendationsHeader.kt */
/* loaded from: classes16.dex */
public final class wbf0 extends o8g0 {
    @Override // xsna.awu.b
    public final void b(RecyclerView.e0 e0Var) {
        p8g0.V5((p8g0) e0Var, R.string.requests_list_recommendations);
    }

    @Override // xsna.awu.b
    public final boolean e(RequestUserProfile requestUserProfile) {
        ijs ijsVar = this.a;
        return ijsVar.l == 0 && ijsVar.m == 0;
    }

    @Override // xsna.awu.b
    public final boolean f(int i, Object obj, Object obj2) {
        RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
        RequestUserProfile requestUserProfile2 = (RequestUserProfile) obj2;
        return (requestUserProfile == null || !requestUserProfile.n0) && requestUserProfile2 != null && requestUserProfile2.n0;
    }
}
