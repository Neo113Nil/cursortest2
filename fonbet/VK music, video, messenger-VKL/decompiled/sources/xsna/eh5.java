package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class eh5 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eh5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                je0 je0Var = (je0) this.c;
                fh5 fh5Var = (fh5) this.d;
                je0Var.h(new kzr0(fh5Var.n, false, false, fh5Var, fh5Var.W != null));
                break;
            case 1:
                f3g0 f3g0Var = (f3g0) this.c;
                i3g0 i3g0Var = (i3g0) this.d;
                f3g0Var.l("");
                i3g0Var.e();
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                o0w0 o0w0Var = (o0w0) this.d;
                viewGroup.setVisibility(4);
                ViewGroup viewGroup2 = o0w0Var.r;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ConstraintLayout constraintLayout = o0w0Var.g;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                o0w0Var.i.V();
                break;
        }
    }
}
