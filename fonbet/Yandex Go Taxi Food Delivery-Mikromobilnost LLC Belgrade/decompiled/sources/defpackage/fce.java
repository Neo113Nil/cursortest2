package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.a;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public final class fce extends RecyclerView.Adapter {
    public final Consumer a;
    public List b;

    public fce(Consumer consumer, List list) {
        this.a = consumer;
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        fde fdeVar = (fde) this.b.get(i);
        if (fdeVar instanceof dde) {
            return 0;
        }
        if (fdeVar instanceof ede) {
            return 1;
        }
        w511.b();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        fde fdeVar = (fde) this.b.get(i);
        if (!(x0Var instanceof dce)) {
            if (x0Var instanceof ece) {
                ((ece) x0Var).N.setTitle(((ede) fdeVar).a);
                return;
            }
            return;
        }
        dde ddeVar = (dde) fdeVar;
        boolean z = a.S(i + 1, this.b) instanceof ede;
        ListItemCheckComponent listItemCheckComponent = ((dce) x0Var).N;
        listItemCheckComponent.setTitle(ddeVar.b);
        listItemCheckComponent.setSubtitle(ddeVar.c);
        listItemCheckComponent.setChecked(ddeVar.e);
        if (z) {
            listItemCheckComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
        } else {
            listItemCheckComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        }
        x0Var.a.setOnClickListener(new k5(21, this, fdeVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(viewGroup.getContext(), null, 0, 6, null);
            listItemCheckComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new dce(listItemCheckComponent);
        }
        ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(viewGroup.getContext(), null, 0, 6, null);
        listGroupHeaderComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ece(listGroupHeaderComponent);
    }
}
