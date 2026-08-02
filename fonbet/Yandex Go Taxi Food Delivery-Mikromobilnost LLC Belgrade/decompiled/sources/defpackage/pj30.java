package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class pj30 implements ij30 {
    public final /* synthetic */ MtExpandedRoutesView a;

    public pj30(MtExpandedRoutesView mtExpandedRoutesView) {
        this.a = mtExpandedRoutesView;
    }

    @Override // defpackage.ij30
    public final void Cd(h111 h111Var) {
        qj30 qj30Var;
        MtExpandedRoutesView mtExpandedRoutesView = this.a;
        qj30Var = mtExpandedRoutesView.binding;
        if (jl40.l(h111Var, h111.k)) {
            qj30Var.i.setVisibility(8);
            return;
        }
        GoConstraintLayout goConstraintLayout = qj30Var.i;
        GoImageButton goImageButton = qj30Var.j;
        GoImageButton goImageButton2 = qj30Var.h;
        RobotoTextView robotoTextView = qj30Var.k;
        goConstraintLayout.setVisibility(0);
        goImageButton2.setImageDrawable(h111Var.a);
        UiStateDrawableWrapper uiStateDrawableWrapper = h111Var.b;
        goImageButton.setVisibility(uiStateDrawableWrapper != null ? 0 : 8);
        goImageButton.setImageDrawable(uiStateDrawableWrapper);
        goImageButton.setBackgroundColor(qje.t(xng0.bgFloating, mtExpandedRoutesView.getContext()));
        robotoTextView.setTextColor(h111Var.e);
        if (h111Var.f) {
            goImageButton2.setAlpha(1.0f);
        } else {
            goImageButton2.setAlpha(0.5f);
        }
        goImageButton2.setClickable(false);
        goImageButton2.setFocusable(false);
        robotoTextView.setClickable(false);
        robotoTextView.setFocusable(false);
        ve30 ve30Var = new ve30(3, mtExpandedRoutesView, h111Var);
        c.z(ve30Var, goConstraintLayout);
        c.z(ve30Var, goImageButton);
        robotoTextView.setText(h111Var.c);
        robotoTextView.setContentDescription(h111Var.d);
        goConstraintLayout.setVisibility(0);
    }

    @Override // defpackage.ij30
    public final void d(Drawable drawable) {
        qj30 qj30Var;
        qj30Var = this.a.binding;
        cvw.c0(qj30Var.d, drawable);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        qj30 qj30Var;
        cf30 cf30Var;
        qj30 qj30Var2;
        qj30 qj30Var3;
        qj30 qj30Var4;
        c57 c57Var;
        c57 c57Var2;
        df30 df30Var = (df30) obj;
        MtExpandedRoutesView mtExpandedRoutesView = this.a;
        qj30Var = mtExpandedRoutesView.binding;
        qj30Var.e.setTitle(df30Var.a.a);
        ListItemComponent listItemComponent = qj30Var.e;
        udu uduVar = df30Var.a;
        listItemComponent.setSubtitle(uduVar.b);
        listItemComponent.setContentDescription(uduVar.c);
        cf30Var = mtExpandedRoutesView.adapter;
        cf30Var.submitList(df30Var.b, null);
        qj30Var2 = mtExpandedRoutesView.binding;
        RecyclerView recyclerView = qj30Var2.f;
        qj30Var3 = mtExpandedRoutesView.binding;
        xw31.I(recyclerView, null, null, null, Integer.valueOf(qj30Var3.c.getHeight()));
        q47 q47Var = df30Var.c;
        qj30Var4 = mtExpandedRoutesView.binding;
        qj30Var4.g.setVisibility(!q47Var.b.isEmpty() ? 0 : 8);
        c57Var = mtExpandedRoutesView.routeButtonsContract;
        ((pm5) c57Var).d(q47Var);
        c57Var2 = mtExpandedRoutesView.routeButtonsContract;
        ((pm5) c57Var2).f(new s57(5, mtExpandedRoutesView));
    }
}
