package com.yandex.go.order.tariffs_suggest.adapter;

import defpackage.bys;
import defpackage.g0c;
import defpackage.g8v0;
import defpackage.gp8;
import defpackage.he7;
import defpackage.hp8;
import defpackage.jl40;
import defpackage.lgp;
import defpackage.lzu0;
import defpackage.omu0;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.zls;
import defpackage.zxs;
import java.util.Collections;

/* loaded from: classes12.dex */
public final class a extends bys {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(ru.yandex.taxi.design.utils.a aVar, zls zlsVar) {
        super(Collections.singletonList(new zxs(r0.a(), 0, r4, scc.g(new lgp(SuggestTariffViewHolder$Companion$itemType$3.b, SuggestTariffViewHolder$Companion$itemType$4.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$5.b, SuggestTariffViewHolder$Companion$itemType$6.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$7.b, SuggestTariffViewHolder$Companion$itemType$8.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$9.b, SuggestTariffViewHolder$Companion$itemType$10.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$11.b, SuggestTariffViewHolder$Companion$itemType$12.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$13.b, SuggestTariffViewHolder$Companion$itemType$14.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$15.b, SuggestTariffViewHolder$Companion$itemType$16.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$17.b, SuggestTariffViewHolder$Companion$itemType$18.b, 3), new lgp(SuggestTariffViewHolder$Companion$itemType$19.b, SuggestTariffViewHolder$Companion$itemType$20.b, 3)), new he7(1, r1), null)));
        int i = g8v0.Z;
        g0c a = qoi0.a(hp8.class);
        omu0 omu0Var = new omu0(10);
        lzu0 lzu0Var = new lzu0(2, zlsVar, aVar);
    }

    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        hp8 hp8Var = (hp8) obj;
        hp8 hp8Var2 = (hp8) obj2;
        String str = hp8Var.a;
        gp8 gp8Var = hp8Var.b;
        String str2 = hp8Var2.a;
        gp8 gp8Var2 = hp8Var2.b;
        return jl40.l(str, str2) && jl40.l(gp8Var.b, gp8Var2.b) && gp8Var.c.equals(gp8Var2.c) && gp8Var.d.equals(gp8Var2.d) && hp8Var.c.equals(hp8Var2.c) && hp8Var.d.equals(hp8Var2.d) && hp8Var.e.equals(hp8Var2.e) && jl40.l(hp8Var.f, hp8Var2.f) && hp8Var.h == hp8Var2.h && hp8Var.g == hp8Var2.g && hp8Var.l == hp8Var2.l && hp8Var.k.equals(hp8Var2.k);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        return jl40.l(((hp8) obj).a, ((hp8) obj2).a);
    }
}
