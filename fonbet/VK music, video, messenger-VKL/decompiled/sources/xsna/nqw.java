package xsna;

import android.view.View;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;

/* compiled from: ImportContactsPhotosHolder.kt */
/* loaded from: classes4.dex */
public final class nqw extends vif0<ProfilesRecommendations.InfoCard> implements View.OnClickListener {
    public jzd0 n;

    @Override // xsna.vif0
    public final void i6(ProfilesRecommendations.InfoCard infoCard) {
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jzd0 jzd0Var;
        if (jjc.b() || !epx.f(view, null) || (jzd0Var = this.n) == null) {
            return;
        }
        jzd0Var.e(this.itemView.getContext());
    }
}
