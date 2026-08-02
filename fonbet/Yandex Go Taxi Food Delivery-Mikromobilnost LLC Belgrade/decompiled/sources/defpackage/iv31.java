package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;

/* loaded from: classes11.dex */
public final class iv31 extends ra {
    public ViewStub b;

    public iv31(ip31 ip31Var, int i, int i2, int i3) {
        View view = ip31Var.a;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        this.b = viewStub;
        if (viewStub != null) {
            if (i3 != 0) {
                viewStub.setLayoutResource(i3);
            }
            this.b.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: hv31
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view2) {
                    iv31 iv31Var = iv31.this;
                    iv31Var.b.setOnInflateListener(null);
                    iv31Var.b = null;
                    iv31Var.a = view2;
                }
            });
        } else {
            View findViewById = view.findViewById(i2);
            this.a = findViewById;
            if (findViewById == null) {
                String resourceName = view.getContext().getResources().getResourceName(i2);
                ny61.t(oyr.p("View with id [", resourceName == null ? String.valueOf(i2) : resourceName, "] doesn't exists!"));
                throw null;
            }
        }
    }

    @Override // defpackage.ra
    public final View a() {
        if (this.a == null) {
            ViewStub viewStub = this.b;
            if (viewStub == null) {
                ny61.k();
                return null;
            }
            this.a = viewStub.inflate();
        }
        return this.a;
    }

    public final Context d() {
        View view = this.a;
        if (view != null) {
            return view.getContext();
        }
        ViewStub viewStub = this.b;
        if (viewStub != null) {
            return viewStub.getContext();
        }
        ny61.r("View or Viewstub must be present in this view");
        return null;
    }

    public iv31(int i, int i2, int i3, View view) {
        this(new ip31(view), i, i2, i3);
    }

    public iv31(View view, int i, int i2) {
        this(new ip31(view), i, i2, 0);
    }
}
