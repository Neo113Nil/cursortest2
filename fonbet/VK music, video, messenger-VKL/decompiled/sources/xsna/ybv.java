package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ybv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ybv(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c.getString(R.string.feed_accessibility_simple_posting_create));
                qgi0.r(tgi0Var, "home_fragment_top_bar_tag_posting_button");
                break;
            default:
                maz e = xwk.d().e();
                maz.c(e, this.c, (String) obj, LaunchContext.A, null, null, 24);
                break;
        }
        return s3q0.a;
    }
}
