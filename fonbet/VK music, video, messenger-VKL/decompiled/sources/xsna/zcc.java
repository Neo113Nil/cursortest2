package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.List;
import org.chromium.base.TimeUtils;
import xsna.dek0;

/* compiled from: CircleRecommendedProfileHolder.kt */
/* loaded from: classes4.dex */
public final class zcc extends hh {
    public static final int v = iah0.a(80);
    public final VkButton s;
    public final TextView t;
    public jzd0 u;

    public zcc(ViewGroup viewGroup) {
        super(viewGroup);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.button_hide);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.button);
        this.s = vkButton;
        this.t = (TextView) this.itemView.findViewById(R.id.done);
        int i = dek0.a;
        dek0.b(this.n, null, new dek0.a(v / 2.0f, false), 2);
        this.itemView.setOnClickListener(this);
        bwt0.i0(imageView, new qu(this, 20));
        bwt0.i0(vkButton, new vl1(this, 18));
    }

    @Override // xsna.hh
    public final void q6(RecommendedProfile recommendedProfile, String str, jzd0 jzd0Var) {
        super.q6(recommendedProfile, str, jzd0Var);
        this.u = jzd0Var;
    }

    @Override // xsna.hh
    public final int s6() {
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r0 != 3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // xsna.hh, xsna.vif0
    /* renamed from: t6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(RecommendedProfile recommendedProfile) {
        String str;
        ProfileDescription profileDescription;
        super.i6(recommendedProfile);
        List<ProfileDescription> list = recommendedProfile.d().E;
        xo9.A(this.o, (list == null || (profileDescription = (ProfileDescription) j5g.a0(list)) == null) ? null : profileDescription.e);
        UserProfile d = recommendedProfile.d();
        boolean z = d.s.getInt("friend_request_status", 0) == 0 ? d.j : d.s.getInt("friend_request_status", 0) == 1;
        boolean s = xo9.s(d);
        TextView textView = this.t;
        VkButton vkButton = this.s;
        if (s || z) {
            bwt0.p0(vkButton, false);
            bwt0.p0(textView, true);
        } else {
            bwt0.p0(vkButton, true);
            bwt0.p0(textView, false);
        }
        int i = d.v;
        if (i != -1 && i != 0) {
            if (i == 1) {
                textView.setText(R.string.friends_recommendations_request_done);
                vkButton.setText(R.string.add);
            } else if (i == 2) {
                vkButton.setText(R.string.add);
                textView.setText(R.string.friends_recommendations_request_done);
            }
            UserProfile d2 = recommendedProfile.d();
            String str2 = this.r;
            int a = pvo0.a();
            str = "friend_recomm_view:" + d2.c + ':' + str2 + ':' + d2.J;
            if (com.vkontakte.android.data.b.i(str)) {
                String str3 = d2.c + '|' + a + "||" + str2 + "||" + d2.J;
                b.d dVar = new b.d("show_user_rec");
                dVar.b = true;
                dVar.c = true;
                dVar.b(str3, "user_ids");
                dVar.e();
                com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, str);
                return;
            }
            return;
        }
        vkButton.setText(R.string.add);
        textView.setText(R.string.friend_req_sent);
        UserProfile d22 = recommendedProfile.d();
        String str22 = this.r;
        int a2 = pvo0.a();
        str = "friend_recomm_view:" + d22.c + ':' + str22 + ':' + d22.J;
        if (com.vkontakte.android.data.b.i(str)) {
        }
    }
}
