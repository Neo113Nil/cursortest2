package defpackage;

import android.widget.LinearLayout;
import java.util.List;
import ru.yandex.taxi.preorder.summary.tariffpage.data.d;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class ao4 {
    public final pav a;
    public final c b;
    public final dkx0 c;
    public final List d;
    public final tt2 e;
    public final p370 f;
    public final pwy0 g;

    public ao4(pav pavVar, c cVar, dkx0 dkx0Var, List list, tt2 tt2Var, p370 p370Var, pwy0 pwy0Var) {
        this.a = pavVar;
        this.b = cVar;
        this.c = dkx0Var;
        this.d = list;
        this.e = tt2Var;
        this.f = p370Var;
        this.g = pwy0Var;
    }

    public final d a(LinearLayout linearLayout, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar) {
        return new d(linearLayout, this.a, this.b, this.c, cVar, this.d, this.e, this.f, this.g);
    }
}
