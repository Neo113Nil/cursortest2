package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.shortcuts.impl.view.adapter.c;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.BadgeView;

/* loaded from: classes13.dex */
public final class ev extends c {
    public static final /* synthetic */ int j0 = 0;
    public final BadgeView h0;
    public final BadgeView i0;

    public ev(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, t4s0 t4s0Var, View view, a aVar, ru.yandex.taxi.widget.c cVar) {
        super(c1fVar, n170Var, j1s0Var, t4s0Var, view, aVar, cVar);
        int i = u7h0.corner_text_badge;
        WeakHashMap weakHashMap = b.a;
        this.h0 = (BadgeView) ((View) rp31.d(view, i));
        this.i0 = (BadgeView) ((View) rp31.d(view, u7h0.bubble_badge));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    public final void g0(ga5 ga5Var) {
        ev evVar;
        cv cvVar = (cv) ga5Var;
        super.g0(cvVar);
        ll4 ll4Var = cvVar.f;
        if (ll4Var != null) {
            evVar = this;
            com.yandex.go.shortcuts.impl.utils.a.d(evVar, this.h0, ll4Var, this.T, 0, null, 24);
        } else {
            evVar = this;
        }
        fl4 fl4Var = cvVar.g;
        if (fl4Var != null) {
            com.yandex.go.shortcuts.impl.utils.a.d(evVar, evVar.i0, fl4Var, evVar.T, 0, null, 24);
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void m0(ga5 ga5Var) {
        c.i0(this, this.e0, ((cv) ga5Var).b.h);
    }
}
