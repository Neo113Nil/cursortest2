package com.yandex.go.multimodal_route.order;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.lq40;
import defpackage.oep0;
import defpackage.pex0;
import defpackage.qbl0;
import defpackage.tje;
import defpackage.tr40;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ur40;
import defpackage.uyj;
import defpackage.v96;
import defpackage.wiq0;
import defpackage.wu1;
import defpackage.xdf;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.preorder.tollroad.data.e;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a extends v96 {
    public final tse a;
    public final wiq0 b;
    public final oep0 c;
    public final lq40 d;
    public final c e;
    public final tt2 f;
    public final e g;
    public final qbl0 h;
    public final xdf i;

    public a(tse tseVar, wiq0 wiq0Var, oep0 oep0Var, lq40 lq40Var, c cVar, tt2 tt2Var, e eVar, qbl0 qbl0Var, xdf xdfVar) {
        this.a = tseVar;
        this.b = wiq0Var;
        this.c = oep0Var;
        this.d = lq40Var;
        this.e = cVar;
        this.f = tt2Var;
        this.g = eVar;
        this.h = qbl0Var;
        this.i = xdfVar;
    }

    @Override // defpackage.v96
    public final boolean b() {
        pex0 b;
        pex0 m = ((k) this.b).m();
        if (m == null) {
            return false;
        }
        wu1 wu1Var = m.O;
        if (!(wu1Var instanceof ur40) || (b = m.b()) == null) {
            return false;
        }
        List list = b.t0.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof tr40) {
                arrayList.add(obj);
            }
        }
        tr40 tr40Var = (tr40) kotlin.collections.a.R(arrayList);
        if (tr40Var == null) {
            return false;
        }
        String str = tr40Var.b;
        String str2 = ((ur40) wu1Var).a;
        if (str2 == null) {
            return false;
        }
        this.f.getClass();
        tje.N(this.a, uyj.a, null, new MultimodalOrderPart$interruptOrderProcess$1(this, tr40Var, b, str, str2, null), 2);
        return true;
    }
}
