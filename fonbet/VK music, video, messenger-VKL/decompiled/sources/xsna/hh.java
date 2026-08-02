package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import xsna.gd60;

/* compiled from: AbstractRecommendedProfileHolder.kt */
/* loaded from: classes4.dex */
public abstract class hh extends vif0<RecommendedProfile> implements View.OnClickListener {
    public final VkImage n;
    public final TextView o;
    public final TextView p;
    public final View q;
    public String r;

    public hh(ViewGroup viewGroup) {
        super(viewGroup, R.layout.friends_recomm_circle_item, 0);
        this.n = (VkImage) this.itemView.findViewById(R.id.photo);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.p = (TextView) this.itemView.findViewById(R.id.name);
        this.q = this.itemView.findViewById(R.id.icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserProfile d;
        RecommendedProfile recommendedProfile = (RecommendedProfile) this.m;
        if (recommendedProfile == null || (d = recommendedProfile.d()) == null) {
            return;
        }
        hd60.a().L(this.itemView.getContext(), d.c, this.r, d.J, new gd60.b(d.e, d.h, d.Y, d.T, null, null, 112));
    }

    public void q6(RecommendedProfile recommendedProfile, String str, jzd0 jzd0Var) {
        this.r = str;
        V5(recommendedProfile);
    }

    public int s6() {
        return 138;
    }

    @Override // xsna.vif0
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public void i6(RecommendedProfile recommendedProfile) {
        UserProfile d = recommendedProfile.d();
        this.n.o0(d.o(s6()), null);
        this.p.setText(d.e);
        VerifyInfo verifyInfo = recommendedProfile.d().B;
        View view = this.q;
        if (verifyInfo == null) {
            f4m.j(view);
            return;
        }
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        baf0 f = VerifyInfoHelper.f(this.itemView.getContext(), VerifyInfoHelper.ColorTheme.normal, verifyInfo);
        if (f == null) {
            f4m.j(view);
        } else {
            view.setBackground(f);
            view.setVisibility(0);
        }
    }
}
