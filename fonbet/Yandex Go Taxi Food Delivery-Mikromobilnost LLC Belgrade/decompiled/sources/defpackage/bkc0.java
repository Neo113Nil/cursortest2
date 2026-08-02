package defpackage;

import com.yandex.plus.home.PlusHomeSdkImpl$exportMetricaSessionListener$1;
import com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector;
import com.yandex.plus.home.plaque.feature.internal.domain.interactors.b;
import com.yandex.plus.home.plaque.feature.internal.domain.observable.a;
import com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultPlaqueViewAttachDetector;

/* loaded from: classes8.dex */
public final class bkc0 {
    public final a a;
    public final kjz b;
    public final com.yandex.plus.home.plaque.feature.internal.domain.interactors.a c;
    public final gkc0 d;
    public final b e;
    public final yo40 f;
    public final o370 g;
    public final PlaqueViewVisibilityDetector h;
    public final DefaultPlaqueViewAttachDetector i;
    public final oo2 j;
    public final pgz k;
    public final ike l;
    public final xyj m;
    public final i3y n = kotlin.a.a(new t9a0(12, this));
    public final yjc0 o;
    public final zjc0 p;

    public bkc0(PlusHomeSdkImpl$exportMetricaSessionListener$1 plusHomeSdkImpl$exportMetricaSessionListener$1, a aVar, kjz kjzVar, com.yandex.plus.home.plaque.feature.internal.domain.interactors.a aVar2, gkc0 gkc0Var, b bVar, yo40 yo40Var, o370 o370Var, PlaqueViewVisibilityDetector plaqueViewVisibilityDetector, DefaultPlaqueViewAttachDetector defaultPlaqueViewAttachDetector, oo2 oo2Var, pgz pgzVar, ike ikeVar, xyj xyjVar) {
        this.a = aVar;
        this.b = kjzVar;
        this.c = aVar2;
        this.d = gkc0Var;
        this.e = bVar;
        this.f = yo40Var;
        this.g = o370Var;
        this.h = plaqueViewVisibilityDetector;
        this.i = defaultPlaqueViewAttachDetector;
        this.j = oo2Var;
        this.k = pgzVar;
        this.l = ikeVar;
        this.m = xyjVar;
        yjc0 yjc0Var = new yjc0(this);
        this.o = yjc0Var;
        zjc0 zjc0Var = new zjc0(this);
        this.p = zjc0Var;
        plaqueViewVisibilityDetector.addListener(yjc0Var);
        defaultPlaqueViewAttachDetector.addListener(zjc0Var);
    }
}
