package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.dto.user.UserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class s00 implements izs {
    public final /* synthetic */ UserProfile b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ActionFollowVh d;
    public final /* synthetic */ UIBlockActionFollow e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ View g;

    public /* synthetic */ s00(UserProfile userProfile, int i, ActionFollowVh actionFollowVh, UIBlockActionFollow uIBlockActionFollow, boolean z, View view) {
        this.b = userProfile;
        this.c = i;
        this.d = actionFollowVh;
        this.e = uIBlockActionFollow;
        this.f = z;
        this.g = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue;
        Integer num = (Integer) obj;
        UserProfile userProfile = this.b;
        userProfile.getClass();
        int i = this.c;
        if (i == -1 || i == 0) {
            userProfile.v = 1;
        } else if (i == 1) {
            userProfile.v = 0;
        } else if (i == 2) {
            userProfile.v = 3;
        } else if (i != 3) {
            userProfile.v = -1;
        } else {
            userProfile.v = 2;
        }
        this.d.b.b(new ron0(this.e.Fb()), true);
        if (!this.f && !userProfile.z && ((intValue = num.intValue()) == 1 || intValue == 4)) {
            zls.o(ams.a(), this.g.getContext(), false, 6);
        }
        return s3q0.a;
    }
}
