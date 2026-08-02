package xsna;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import xsna.vgh0;

/* compiled from: WidgetView.kt */
/* loaded from: classes6.dex */
public final class cpx0 {
    public final ConstraintLayout a;
    public final View b;
    public final ImageView c;
    public final View d;
    public final f13 e;

    public cpx0(ConstraintLayout constraintLayout, View view, ImageView imageView, View view2, vgh0.b bVar) {
        this.a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = view2;
        this.e = bVar;
    }

    public final View a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpx0)) {
            return false;
        }
        cpx0 cpx0Var = (cpx0) obj;
        return epx.f(this.a, cpx0Var.a) && epx.f(this.b, cpx0Var.b) && epx.f(this.c, cpx0Var.c) && epx.f(this.d, cpx0Var.d) && epx.f(this.e, cpx0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        View view = this.b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        ImageView imageView = this.c;
        int hashCode3 = (hashCode2 + (imageView == null ? 0 : imageView.hashCode())) * 31;
        View view2 = this.d;
        int hashCode4 = (hashCode3 + (view2 == null ? 0 : view2.hashCode())) * 31;
        f13 f13Var = this.e;
        return hashCode4 + (f13Var != null ? f13Var.hashCode() : 0);
    }

    public final String toString() {
        return "WidgetView(rootView=" + this.a + ", headerView=" + this.b + ", actionView=" + this.c + ", additionalActionView=" + this.d + ", appAssociatedViewFinder=" + this.e + ')';
    }
}
