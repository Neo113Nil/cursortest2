package com.yandex.go.explorer.impl.data.repositories;

import com.yandex.mapkit.geometry.Point;
import defpackage.ato;
import defpackage.mdh;
import defpackage.puo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class b {
    public final ato a;
    public final tt2 b;
    public final puo c;

    public b(ato atoVar, tt2 tt2Var, puo puoVar) {
        this.a = atoVar;
        this.b = tt2Var;
        this.c = puoVar;
    }

    public final Object a(uc4 uc4Var, float f, Point point, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ExplorerDistrictLayerRepository$loadLayer$2(uc4Var, f, point, this, null), continuation);
    }
}
