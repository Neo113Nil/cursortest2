package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class thj0 implements gzs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uhj0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ thj0(boolean z, uhj0 uhj0Var, int i) {
        this.b = z;
        this.c = uhj0Var;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = this.b;
        uhj0 uhj0Var = this.c;
        if (z) {
            xhj0 xhj0Var = uhj0Var.k;
            if (xhj0Var == null) {
                xhj0Var = null;
            }
            Context context = xhj0Var.b;
            if (context != null) {
                String f = enj.f(R.plurals.collection_link_limit_plural, this.d, context);
                xhj0 xhj0Var2 = uhj0Var.k;
                (xhj0Var2 != null ? xhj0Var2 : null).f(f);
            }
        } else {
            uhj0Var.g0();
        }
        return s3q0.a;
    }
}
