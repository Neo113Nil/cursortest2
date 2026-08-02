package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tks implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ tks(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        tgi0 tgi0Var = (tgi0) obj;
        switch (i) {
            case 0:
                int i2 = FriendsAndFollowersRootFragment.Z;
                qgi0.r(tgi0Var, "topbar_title");
                qgi0.h(tgi0Var, str);
                break;
            case 1:
                qgi0.h(tgi0Var, str);
                break;
            default:
                qgi0.h(tgi0Var, str);
                qgi0.n(tgi0Var, 5);
                qgi0.r(tgi0Var, "StatusPopupPhoto");
                break;
        }
        return s3q0.a;
    }
}
