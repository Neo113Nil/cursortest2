package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.plaque.level.MicroWidgetLevelView;

/* loaded from: classes6.dex */
public final class gic0 extends erd0 {
    public final hjc0 A;
    public List B;
    public final ViewGroup x;
    public final sg20 y;
    public final v8o z;

    public gic0(LinearLayout linearLayout, sg20 sg20Var, v8o v8oVar, hjc0 hjc0Var) {
        super(linearLayout, v8oVar);
        this.x = linearLayout;
        this.y = sg20Var;
        this.z = v8oVar;
        this.A = hjc0Var;
        this.B = EmptyList.a;
    }

    @Override // defpackage.erd0
    public final void d(crd0 crd0Var, int i) {
        ((fic0) crd0Var).d.updateLevelModel((gf20) this.B.get(i));
    }

    @Override // defpackage.erd0
    public final crd0 e(ViewGroup viewGroup, int i) {
        return new fic0(new MicroWidgetLevelView(this.x.getContext(), this.y, this.z, this.A));
    }
}
