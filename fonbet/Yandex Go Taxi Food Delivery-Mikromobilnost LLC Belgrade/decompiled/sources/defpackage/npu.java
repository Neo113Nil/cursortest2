package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class npu {
    public final ViewGroup a;
    public final z2d0 b;
    public final ow31 c;
    public final sls d;
    public String e;
    public View f;

    public npu(ViewGroup viewGroup, z2d0 z2d0Var, ow31 ow31Var, sls slsVar) {
        this.a = viewGroup;
        this.b = z2d0Var;
        this.c = ow31Var;
        this.d = slsVar;
    }

    public final void a(boolean z) {
        ViewGroup viewGroup = this.a;
        if (z) {
            ((l8p) this.c).b(viewGroup);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    public final void b(String str, boolean z) {
        View view = this.f;
        if (!str.equals(this.e)) {
            view = null;
        }
        ViewGroup viewGroup = this.a;
        if (view == null) {
            view = ((opu) this.b).a(viewGroup.getContext(), str, this.d);
        }
        if (!view.equals(this.f)) {
            View view2 = this.f;
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
            viewGroup.addView(view);
            this.f = view;
            this.e = str;
        }
        if (z) {
            ((l8p) this.c).c(new b931(13), viewGroup);
        } else {
            viewGroup.setVisibility(0);
        }
    }
}
