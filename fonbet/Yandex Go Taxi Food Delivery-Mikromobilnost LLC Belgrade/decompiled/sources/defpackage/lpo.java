package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import ru.yandex.taxi.requirements.ui.ExpandingView;

/* loaded from: classes6.dex */
public final class lpo extends RecyclerView.Adapter {
    public ArrayList a = new ArrayList();

    public lpo() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, final int i) {
        final zot0 zot0Var = (zot0) this.a.get(i);
        final int i2 = 0;
        final int i3 = 1;
        ((npo) x0Var).N.bind(zot0Var, new sls() { // from class: kpo
            @Override // defpackage.sls
            public final Object invoke() {
                tls tlsVar;
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                int i5 = i;
                lpo lpoVar = this;
                zot0 zot0Var2 = zot0Var;
                switch (i4) {
                    case 0:
                        zot0Var2.c = !zot0Var2.c;
                        lpoVar.notifyItemChanged(i5);
                        zot0Var2.d.invoke(zot0Var2);
                        break;
                    default:
                        yot0 yot0Var = zot0Var2.e;
                        boolean z = false;
                        if (yot0Var != null && yot0Var.f) {
                            z = true;
                        }
                        if (yot0Var != null) {
                            yot0Var.f = true ^ z;
                        }
                        lpoVar.notifyItemChanged(i5);
                        if (yot0Var != null && (tlsVar = yot0Var.b) != null) {
                            tlsVar.invoke(zot0Var2);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new sls() { // from class: kpo
            @Override // defpackage.sls
            public final Object invoke() {
                tls tlsVar;
                int i4 = i3;
                zy11 zy11Var = zy11.a;
                int i5 = i;
                lpo lpoVar = this;
                zot0 zot0Var2 = zot0Var;
                switch (i4) {
                    case 0:
                        zot0Var2.c = !zot0Var2.c;
                        lpoVar.notifyItemChanged(i5);
                        zot0Var2.d.invoke(zot0Var2);
                        break;
                    default:
                        yot0 yot0Var = zot0Var2.e;
                        boolean z = false;
                        if (yot0Var != null && yot0Var.f) {
                            z = true;
                        }
                        if (yot0Var != null) {
                            yot0Var.f = true ^ z;
                        }
                        lpoVar.notifyItemChanged(i5);
                        if (yot0Var != null && (tlsVar = yot0Var.b) != null) {
                            tlsVar.invoke(zot0Var2);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new npo(new ExpandingView(viewGroup.getContext(), null, 0, 6, null));
    }
}
