package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class eef extends RecyclerView.Adapter {
    public List a = EmptyList.a;
    public final def b;

    public eef(oef oefVar) {
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.b = oefVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        cef cefVar = (cef) x0Var;
        bef befVar = (bef) this.a.get(i);
        boolean z = i == this.a.size() - 1;
        ListItemCheckComponent listItemCheckComponent = cefVar.N;
        listItemCheckComponent.setTitle(befVar.a);
        listItemCheckComponent.setSubtitle(befVar.b);
        listItemCheckComponent.setChecked(befVar.c);
        if (z) {
            listItemCheckComponent.setDividers(DividerPosition.BOTTOM, DividerType.NONE);
        } else {
            listItemCheckComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new cef(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        ((cef) x0Var).O = new dye(9, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        ((cef) x0Var).O = null;
    }
}
