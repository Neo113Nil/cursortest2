package xsna;

import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import java.util.LinkedHashMap;
import xsna.efy;

/* compiled from: AlignmentHelper.kt */
/* loaded from: classes15.dex */
public final class ft1 {
    public static final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: AlignmentHelper.kt */
    public static final class a implements efy.a {
        public final ViewGroup a;
        public final oce b;
        public final n5i c;

        public a(ViewGroup viewGroup, oce oceVar, n5i n5iVar) {
            this.a = viewGroup;
            this.b = oceVar;
            this.c = n5iVar;
        }

        @Override // xsna.efy.a
        public final void Y0() {
            ViewGroup viewGroup = this.a;
            zmp0.a(viewGroup, null);
            this.c.invoke();
            viewGroup.requestLayout();
        }

        @Override // xsna.efy.a
        public final void x0(int i) {
            dnp0 dnp0Var = new dnp0();
            dnp0Var.c(new biq());
            dnp0Var.c(new wra());
            dnp0Var.setInterpolator(new DecelerateInterpolator());
            dnp0Var.e(300L);
            ViewGroup viewGroup = this.a;
            zmp0.a(viewGroup, dnp0Var);
            this.b.invoke(Integer.valueOf(i));
            viewGroup.requestLayout();
        }
    }
}
