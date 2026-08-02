package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ChipsComponent;

/* loaded from: classes6.dex */
public final class jnj0 extends RecyclerView.Adapter {
    public List a = EmptyList.a;
    public wls b;
    public pav c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        sls slsVar;
        tr31 tr31Var = (tr31) x0Var;
        final ndj0 ndj0Var = (ndj0) this.a.get(i);
        tr31Var.N.render(ndj0Var.e);
        ChipsComponent chipsComponent = tr31Var.N;
        final int i2 = 0;
        chipsComponent.setMainClickListener(new sls(this) { // from class: inj0
            public final /* synthetic */ jnj0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                ndj0 ndj0Var2 = ndj0Var;
                jnj0 jnj0Var = this.b;
                switch (i3) {
                    case 0:
                        wls wlsVar = jnj0Var.b;
                        if (wlsVar != null) {
                            wlsVar.invoke(ndj0Var2, ndj0Var2.f);
                            break;
                        }
                        break;
                    default:
                        wls wlsVar2 = jnj0Var.b;
                        if (wlsVar2 != null) {
                            wlsVar2.invoke(ndj0Var2, ndj0Var2.g);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
        if (ndj0Var.g != null) {
            final int i3 = 1;
            slsVar = new sls(this) { // from class: inj0
                public final /* synthetic */ jnj0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    ndj0 ndj0Var2 = ndj0Var;
                    jnj0 jnj0Var = this.b;
                    switch (i32) {
                        case 0:
                            wls wlsVar = jnj0Var.b;
                            if (wlsVar != null) {
                                wlsVar.invoke(ndj0Var2, ndj0Var2.f);
                                break;
                            }
                            break;
                        default:
                            wls wlsVar2 = jnj0Var.b;
                            if (wlsVar2 != null) {
                                wlsVar2.invoke(ndj0Var2, ndj0Var2.g);
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            };
        } else {
            slsVar = null;
        }
        chipsComponent.setSecondaryClickListener(slsVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        pav pavVar = this.c;
        if (pavVar == null) {
            pavVar = null;
        }
        return new tr31(new ChipsComponent(context, pavVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        tr31 tr31Var = (tr31) x0Var;
        super.onViewRecycled(tr31Var);
        tr31Var.N.recycle();
    }
}
