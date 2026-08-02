package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.shortcuts.impl.analytic.ShortcutAnalyticsImpl$ScrollDirection;
import com.yandex.go.shortcuts.impl.analytic.a;
import com.yandex.go.shortcuts.impl.repository.j;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.f;

/* loaded from: classes6.dex */
public final class b4s0 extends RecyclerView.g {
    public final /* synthetic */ ShortcutsView a;

    public b4s0(ShortcutsView shortcutsView) {
        this.a = shortcutsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        f fVar;
        fVar = this.a.presenter;
        if (i != 0) {
            fVar.getClass();
            return;
        }
        if (((c3s0) fVar.Dg()).ha()) {
            ngz da = ((c3s0) fVar.Dg()).da();
            sxr0 sxr0Var = fVar.D;
            if (da == null) {
                a aVar = (a) sxr0Var;
                Boolean bool = aVar.m;
                if (bool != null) {
                    aVar.e(bool.booleanValue() ? ShortcutAnalyticsImpl$ScrollDirection.UP : ShortcutAnalyticsImpl$ScrollDirection.DOWN, "UNKNOWN", 0, null);
                }
                aVar.m = null;
            } else {
                String str = da.c;
                int i2 = da.b;
                String str2 = da.d;
                a aVar2 = (a) sxr0Var;
                Boolean bool2 = aVar2.m;
                if (bool2 != null) {
                    aVar2.e(bool2.booleanValue() ? ShortcutAnalyticsImpl$ScrollDirection.UP : ShortcutAnalyticsImpl$ScrollDirection.DOWN, str, i2, str2);
                }
                aVar2.m = null;
            }
            ga5 ga5Var = fVar.T;
            if (ga5Var != null) {
                fVar.Mg(ga5Var);
                fVar.T = null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        f fVar;
        j jVar;
        ShortcutsView shortcutsView = this.a;
        fVar = shortcutsView.presenter;
        if (i2 == 0) {
            fVar.getClass();
        } else {
            a aVar = (a) fVar.D;
            String str = aVar.l;
            if (str != null && !evu0.J(str) && aVar.n) {
                boolean z = i2 > 0;
                Boolean bool = aVar.m;
                if (bool == null || !bool.equals(Boolean.valueOf(z))) {
                    aVar.m = Boolean.valueOf(z);
                }
            }
        }
        jVar = shortcutsView.orderVisibilityTracker;
        jVar.a(recyclerView);
    }
}
