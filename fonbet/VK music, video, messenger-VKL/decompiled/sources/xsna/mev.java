package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListShowAllVh;
import com.vk.common.links.LaunchContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mev implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ mev(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                int i2 = HorizontalListShowAllVh.B;
                maz.c(xwk.d().e(), context, this.c, new LaunchContext.a().a(), null, null, 24);
                break;
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, str);
                qgi0.n(tgi0Var, 5);
                break;
            default:
                qgi0.h((tgi0) obj, str);
                break;
        }
        return s3q0.a;
    }
}
