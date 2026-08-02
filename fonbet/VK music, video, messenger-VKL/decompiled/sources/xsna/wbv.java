package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wbv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ wbv(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tgi0 tgi0Var = (tgi0) obj;
        switch (this.b) {
            case 0:
                qgi0.h(tgi0Var, this.c.getString(R.string.back));
                qgi0.r(tgi0Var, "home_fragment_top_bar_tag_back_button");
                break;
            default:
                qgi0.h(tgi0Var, this.c.getString(R.string.talkback_logout_btn));
                break;
        }
        return s3q0.a;
    }
}
