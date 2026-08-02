package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.vkontakte.android.R;

/* compiled from: SearchFeatureParamsDescriptionResultDelegate.kt */
/* loaded from: classes16.dex */
public final class qrh0 {
    public final gzs<f5z> a;
    public final yh90<?> b;
    public final yzh0<uh90> c;
    public e15 d;
    public uh90 e;
    public View f;

    /* JADX WARN: Multi-variable type inference failed */
    public qrh0(gzs<? extends f5z> gzsVar, yh90<?> yh90Var, yzh0<uh90> yzh0Var) {
        this.a = gzsVar;
        this.b = yh90Var;
        this.c = yzh0Var;
    }

    public final View a(View view) {
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.search_result_with_params_description_layout, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) inflate;
        View findViewById = viewGroup.findViewById(R.id.search_result_view_stub);
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.search_params_description_stub);
        this.f = viewGroup.findViewById(R.id.search_params_description_shadow);
        int indexOfChild = viewGroup.indexOfChild(findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        viewGroup.removeView(findViewById);
        viewGroup.addView(view, indexOfChild, layoutParams);
        ViewParent parent = viewStub.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            throw new IllegalStateException("ViewStub must be attached to parent");
        }
        View o0 = this.c.o0(viewStub.getContext());
        int indexOfChild2 = viewGroup2.indexOfChild(viewStub);
        viewGroup2.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams2 = viewStub.getLayoutParams();
        if (layoutParams2 != null) {
            viewGroup2.addView(o0, indexOfChild2, layoutParams2);
        } else {
            viewGroup2.addView(o0, indexOfChild2);
        }
        new prh0(this, qrh0.class, "paramsDescriptionView", "getParamsDescriptionView()Lcom/vk/search/ui/api/view/ParametersDescriptionView;", 0).set((uh90) o0);
        uh90 uh90Var = this.e;
        if (uh90Var != null) {
            this.b.g(uh90Var, this.a.invoke(), new gy(1, this, qrh0.class, "onParamsDescriptionVisibilityChanged", "onParamsDescriptionVisibilityChanged(Z)V", 0, 16));
        }
        return inflate;
    }
}
