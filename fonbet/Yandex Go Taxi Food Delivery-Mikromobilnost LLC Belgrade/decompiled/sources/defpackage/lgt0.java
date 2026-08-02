package defpackage;

import android.content.Context;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.where_you_are.impl.router.a;
import com.yandex.mapkit.geometry.Point;
import java.util.HashMap;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes5.dex */
public final class lgt0 implements kgt0 {
    public final Context a;
    public final ah00 b;
    public final qy41 c;
    public final rh00 d;
    public final uy41 e;
    public final r f;
    public final h3y g;

    public lgt0(Context context, ah00 ah00Var, qy41 qy41Var, rh00 rh00Var, uy41 uy41Var, r rVar, h3y h3yVar) {
        this.a = context;
        this.b = ah00Var;
        this.c = qy41Var;
        this.d = rh00Var;
        this.e = uy41Var;
        this.f = rVar;
        this.g = h3yVar;
    }

    public final void a(zzs zzsVar, String str) {
        qke.E(this.a, HapticController$Effect.CLICK_MEDIUM, false, 8);
        gh00 gh00Var = (gh00) this.b;
        if (zzsVar.a(gh00Var.e.b(), 1.0E-6d)) {
            return;
        }
        ry41 ry41Var = (ry41) this.c;
        if (!ry41Var.f()) {
            gh00Var.E(new Point(zzsVar.a, zzsVar.b), 300.0f, new cy0(2, this, str));
            return;
        }
        this.e.a(zzsVar, true);
        a aVar = ry41Var.b;
        if (aVar != null) {
            o7r0 o7r0Var = aVar.d.b;
            o7r0Var.getClass();
            o7r0Var.a.a("WhereAreYou.LocationBubble.Tapped", new HashMap(), 1, new HashMap());
            aVar.b.a().m(WhereYouAreModalView.class);
        }
    }
}
