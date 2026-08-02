package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.details.v2.navigation.d;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public final class bek0 extends wys implements co70 {
    public static final /* synthetic */ int U = 0;
    public final d R;
    public final ViewGroup S;
    public v9y0 T;

    public bek0(View view, d dVar) {
        super(view);
        this.R = dVar;
        this.S = (ViewGroup) view;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        v9y0 v9y0Var = this.T;
        if (v9y0Var != null) {
            synchronized (v9y0Var) {
                try {
                    v9y0Var.b = true;
                    ifk0 ifk0Var = v9y0Var.a;
                    if (ifk0Var != null) {
                        ifk0Var.i();
                    }
                    v9y0Var.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.S.removeAllViews();
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ur00 ur00Var = (ur00) obj;
        v9y0 v9y0Var = this.T;
        if (v9y0Var != null) {
            synchronized (v9y0Var) {
                try {
                    v9y0Var.b = true;
                    ifk0 ifk0Var = v9y0Var.a;
                    if (ifk0Var != null) {
                        ifk0Var.i();
                    }
                    v9y0Var.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.T = this.R.d(new q9y0(ur00Var.a.a, OrderScreen.ORDER_LIST, new odf0(28, this)));
    }
}
