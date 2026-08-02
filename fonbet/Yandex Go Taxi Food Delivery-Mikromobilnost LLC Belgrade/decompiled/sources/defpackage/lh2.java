package defpackage;

import android.view.View;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes9.dex */
public final class lh2 implements mh2 {
    public static final lh2 c = new lh2(0);
    public final sls a;
    public final sls b;

    public /* synthetic */ lh2(int i) {
        this(new i22(5), new i22(6));
    }

    @Override // defpackage.mh2
    public final void g(View view, gtg gtgVar, gtg gtgVar2, long j) {
        y5e.b(view, new jh2(gtgVar, 1), new kh2(gtgVar2, 1), true, j, (NavigationDirection) this.a.invoke());
    }

    @Override // defpackage.mh2
    public final void m(View view, gtg gtgVar, gtg gtgVar2, long j) {
        y5e.b(view, new b7(7, gtgVar), new b7(8, gtgVar2), false, j, (NavigationDirection) this.b.invoke());
    }

    public lh2(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public lh2() {
        this(0);
    }
}
