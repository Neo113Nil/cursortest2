package xsna;

import com.vk.newsfeed.impl.fragments.PostViewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u17 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ u17(String str, int i) {
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
                qgi0.h(tgi0Var, str);
                break;
            case 1:
                String[] strArr = PostViewFragment.T0;
                qgi0.r(tgi0Var, "post_view_fragment_toolbar_options_tag");
                qgi0.h(tgi0Var, str);
                break;
            default:
                qgi0.h(tgi0Var, str);
                break;
        }
        return s3q0.a;
    }
}
