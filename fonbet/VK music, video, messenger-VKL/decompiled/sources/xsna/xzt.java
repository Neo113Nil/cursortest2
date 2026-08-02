package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xzt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ xzt(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                UserId userId = (UserId) obj;
                bpn0 bpn0Var = g2v.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                ((mxv) bpn0Var.getValue()).b().t(this.c, userId.b, null, "list_all", null);
                break;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c.getString(R.string.accessibility_open_notifications));
                qgi0.r(tgi0Var, "home_fragment_top_bar_tag_notifications_button");
                break;
        }
        return s3q0.a;
    }
}
