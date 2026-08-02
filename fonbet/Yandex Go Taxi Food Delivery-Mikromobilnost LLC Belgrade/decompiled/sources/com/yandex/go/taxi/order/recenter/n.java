package com.yandex.go.taxi.order.recenter;

import defpackage.pzl0;
import defpackage.tje;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class n {
    public final pzl0 a;

    public n(pzl0 pzl0Var) {
        this.a = pzl0Var;
    }

    public final void a(List list) {
        pzl0 pzl0Var = this.a;
        ArrayList arrayList = pzl0Var.c;
        arrayList.clear();
        arrayList.addAll(list);
        if (pzl0Var.d == null) {
            pzl0Var.d = tje.N(pzl0Var.b, null, null, new SaveCameraPositionRepository$saveCameraPosition$1(pzl0Var, null), 3);
        }
    }
}
