package xsna;

import android.view.View;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import xsna.xnn0;

/* compiled from: View.kt */
/* loaded from: classes6.dex */
public final class d240 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ e240 c;
    public final /* synthetic */ xnn0.c d;

    public d240(EcosystemProfileView ecosystemProfileView, e240 e240Var, xnn0.c cVar) {
        this.b = ecosystemProfileView;
        this.c = e240Var;
        this.d = cVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        e240 e240Var = this.c;
        EcosystemProfileView ecosystemProfileView = e240Var.l;
        xnn0.c cVar = this.d;
        ecosystemProfileView.h.s(new a.i(cVar.a));
        EcosystemProfileView ecosystemProfileView2 = e240Var.l;
        ecosystemProfileView2.h.s(new a.h(cVar.c));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
