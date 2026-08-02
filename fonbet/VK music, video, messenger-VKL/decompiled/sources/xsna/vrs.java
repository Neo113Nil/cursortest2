package xsna;

import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vrs implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ vrs(String str, int i) {
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
                int i2 = FriendsRecommendationsFragment.b0;
                qgi0.h(tgi0Var, str);
                qgi0.r(tgi0Var, "topbar_title");
                break;
            default:
                qgi0.r(tgi0Var, "MusicPickerToolbarSearchButton");
                qgi0.h(tgi0Var, str);
                break;
        }
        return s3q0.a;
    }
}
