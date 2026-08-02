package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import defpackage.gh7;
import java.util.List;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes14.dex */
public final class gh7 extends RecyclerView.Adapter {
    public final List a;
    public final tls b;
    public String c = "";

    public gh7(List list, tls tlsVar) {
        this.a = list;
        this.b = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        fh7 fh7Var = (fh7) x0Var;
        String str = (String) this.a.get(i);
        boolean l = jl40.l(str, this.c);
        fh7Var.O = str;
        ListItemCheckComponent listItemCheckComponent = fh7Var.N;
        listItemCheckComponent.setTitle(str);
        listItemCheckComponent.setChecked(l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemCheckComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new fh7(listItemCheckComponent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        final fh7 fh7Var = (fh7) x0Var;
        super.onViewAttachedToWindow(fh7Var);
        fh7Var.N.setCheckedChangeListener(new pry() { // from class: com.yandex.go.taxi.order.chat.call_feedback.ui.a
            @Override // defpackage.pry
            public final void a(boolean z) {
                gh7 gh7Var = gh7.this;
                if (z) {
                    String str = fh7Var.O;
                    gh7Var.c = str;
                    ((CallFeedbackQuestionModalView$InnerMvpView$showBadFeedbackForm$1$1$1) gh7Var.b).invoke(str);
                }
                gh7Var.notifyDataSetChanged();
            }
        });
    }
}
