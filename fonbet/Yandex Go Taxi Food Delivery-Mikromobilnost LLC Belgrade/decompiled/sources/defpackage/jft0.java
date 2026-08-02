package defpackage;

import android.view.View;
import com.yandex.mapkit.map.CameraPosition;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes6.dex */
public final class jft0 {
    public final /* synthetic */ SourcePointFragment a;
    public final /* synthetic */ agt0 b;

    public jft0(SourcePointFragment sourcePointFragment, agt0 agt0Var) {
        this.a = sourcePointFragment;
        this.b = agt0Var;
    }

    public final void a(CameraPosition cameraPosition) {
        eht0 eht0Var;
        wpb0 j;
        SourcePointFragment sourcePointFragment = this.a;
        eht0Var = sourcePointFragment.presenter;
        yet0 yet0Var = (yet0) eht0Var.f0.get();
        r rVar = yet0Var.h;
        zzs zzsVar = null;
        if (!yet0Var.c.a.a().q() && (j = rVar.j(a.E(cameraPosition.getTarget(), null), false)) != null && (!j.equals(rVar.C) || !rVar.E)) {
            zzsVar = j.b;
        }
        View view = sourcePointFragment.getView();
        if (zzsVar == null || view == null) {
            return;
        }
        view.getHandler().post(new hpo0(5, this.b, zzsVar, sourcePointFragment));
    }
}
