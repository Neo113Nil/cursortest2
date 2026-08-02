package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes10.dex */
public abstract class dvy0 extends RecyclerView.Adapter implements nwy0 {
    public ThemeType a;
    public final a b;

    public static final class a {
        public final WeakHashMap a = new WeakHashMap();
    }

    public dvy0() {
        ThemeType.Companion.getClass();
        this.a = ThemeType.LIGHT;
        this.b = new a();
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.a = themeType;
        Iterator it = this.b.a.keySet().iterator();
        while (it.hasNext()) {
            f((xwy0) it.next());
        }
    }

    public void f(xwy0 xwy0Var) {
        ThemeType themeType = xwy0Var.N;
        ThemeType themeType2 = this.a;
        if (themeType != themeType2) {
            xwy0Var.N = themeType2;
            xwy0Var.applyTheme(themeType2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g */
    public void onBindViewHolder(xwy0 xwy0Var, int i) {
        f(xwy0Var);
        this.b.a.put(xwy0Var, zy11.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(xwy0 xwy0Var) {
        this.b.a.remove(xwy0Var);
        return super.onFailedToRecycleView(xwy0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(xwy0 xwy0Var) {
        this.b.a.remove(xwy0Var);
        super.onViewRecycled(xwy0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.a = qje.X(recyclerView.getContext());
    }
}
