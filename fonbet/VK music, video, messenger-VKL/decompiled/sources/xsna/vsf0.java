package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import java.lang.ref.WeakReference;
import xsna.xnn0;

/* compiled from: RelatedUserStackView.kt */
/* loaded from: classes6.dex */
public final class vsf0 extends androidx.recyclerview.widget.x<xnn0.h, wsf0> {
    public final jzq0 c;
    public final wmd0 d;
    public final kav e;

    public vsf0(jzq0 jzq0Var, wmd0 wmd0Var) {
        super(RelatedUserStackView.m);
        this.c = jzq0Var;
        this.d = wmd0Var;
        this.e = new kav();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((wsf0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        wsf0 wsf0Var = new wsf0(viewGroup, ((RelatedUserStackView) this.d.c).i, this.c);
        kav kavVar = this.e;
        kavVar.b.add(new WeakReference<>(wsf0Var));
        kav kavVar2 = wsf0Var.p;
        ps8 ps8Var = wsf0Var.n;
        if (kavVar2 != null) {
            ps8Var.h.remove(kavVar2);
        }
        ps8Var.h.add(kavVar);
        wsf0Var.p = kavVar;
        return wsf0Var;
    }
}
