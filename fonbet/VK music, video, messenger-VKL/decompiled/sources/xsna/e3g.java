package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.ccr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ e3g(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new h1g(context);
            case 1:
                int i2 = ccr0.q;
                ccr0 a = ccr0.a.a(context);
                int i3 = f1v.b;
                a.m = i3;
                a.n = i3;
                a.u(dhr0.t.a(R.drawable.user_placeholder));
                a.a(f1v.c, e3m.f(R.attr.vk_ui_image_border_alpha, context));
                return a;
            default:
                fl4 g = lyd.g();
                int i4 = fl4.a;
                g.x(context, false);
                return s3q0.a;
        }
    }
}
