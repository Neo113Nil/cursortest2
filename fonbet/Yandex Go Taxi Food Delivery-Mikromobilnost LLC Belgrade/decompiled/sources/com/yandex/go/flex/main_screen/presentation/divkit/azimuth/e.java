package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import android.view.View;
import defpackage.bvf0;
import defpackage.jqr;
import defpackage.o400;
import defpackage.qv10;
import defpackage.qwc;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import java.util.HashMap;
import java.util.HashSet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public final class e {
    public final qwc a;
    public final n b;
    public final tse c;
    public final r0 d = bvf0.c(Boolean.FALSE);
    public final HashMap e = new HashMap();
    public final HashSet f = new HashSet();

    public e(qwc qwcVar, n nVar, tse tseVar) {
        this.a = qwcVar;
        this.b = nVar;
        this.c = tseVar;
    }

    public final void a(float f, View view) {
        HashMap hashMap = this.e;
        if (hashMap.containsKey(view)) {
            return;
        }
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(this.d, new SuperappAzimuthRotationPresenter$observeRotationDegrees$$inlined$flatMapLatest$1(null, this, f))), new SuperappAzimuthRotationPresenter$register$1(view, null), 3);
        sjh sjhVar = uyj.a;
        hashMap.put(view, kotlinx.coroutines.flow.e.H(bvf0.M(this.c, o400.a.x), jqrVar));
    }

    public final void b(boolean z) {
        qv10.B(z, this.d, null);
    }
}
