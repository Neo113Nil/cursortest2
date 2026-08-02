package com.yandex.go.tariffcard.ui;

import com.yandex.go.tariffcard.ui.model.SectionSeparatorMarginType;
import defpackage.bix0;
import defpackage.d3u;
import defpackage.e6v;
import defpackage.eij0;
import defpackage.fnx0;
import defpackage.kix0;
import defpackage.lix0;
import defpackage.mix0;
import defpackage.oz8;
import defpackage.qix0;
import defpackage.rix0;
import defpackage.rql;
import defpackage.six0;
import defpackage.tix0;
import defpackage.tj;
import defpackage.tls;
import defpackage.uhx0;
import defpackage.ze5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes14.dex */
public final class f0 implements tls {
    public final /* synthetic */ kix0 A;
    public final /* synthetic */ kix0 B;
    public final /* synthetic */ kix0 C;
    public final /* synthetic */ kix0 D;
    public final /* synthetic */ kix0 E;
    public final /* synthetic */ oz8 F;
    public final /* synthetic */ kix0 G;
    public final /* synthetic */ kix0 H;
    public final /* synthetic */ tix0 I;
    public final /* synthetic */ lix0 J;
    public final /* synthetic */ List K;
    public final /* synthetic */ kix0 L;
    public final /* synthetic */ eij0 M;
    public final /* synthetic */ d3u N;
    public final /* synthetic */ fnx0 O;
    public final /* synthetic */ kix0 a;
    public final /* synthetic */ kix0 b;
    public final /* synthetic */ mix0 c;
    public final /* synthetic */ kix0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ kix0 y;
    public final /* synthetic */ kix0 z;

    public f0(kix0 kix0Var, kix0 kix0Var2, mix0 mix0Var, kix0 kix0Var3, boolean z, kix0 kix0Var4, kix0 kix0Var5, kix0 kix0Var6, kix0 kix0Var7, kix0 kix0Var8, kix0 kix0Var9, kix0 kix0Var10, oz8 oz8Var, kix0 kix0Var11, kix0 kix0Var12, tix0 tix0Var, lix0 lix0Var, List list, kix0 kix0Var13, eij0 eij0Var, d3u d3uVar, fnx0 fnx0Var) {
        this.a = kix0Var;
        this.b = kix0Var2;
        this.c = mix0Var;
        this.w = kix0Var3;
        this.x = z;
        this.y = kix0Var4;
        this.z = kix0Var5;
        this.A = kix0Var6;
        this.B = kix0Var7;
        this.C = kix0Var8;
        this.D = kix0Var9;
        this.E = kix0Var10;
        this.F = oz8Var;
        this.G = kix0Var11;
        this.H = kix0Var12;
        this.I = tix0Var;
        this.J = lix0Var;
        this.K = list;
        this.L = kix0Var13;
        this.M = eij0Var;
        this.N = d3uVar;
        this.O = fnx0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bix0 bix0Var = (bix0) obj;
        kix0 kix0Var = this.a;
        bix0Var.d(kix0Var);
        bix0Var.a(this.b, null);
        mix0 mix0Var = this.c;
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$1(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new qix0(this.z, 2));
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$3(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new qix0(this.A, 3));
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$5(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new qix0(this.B, 4));
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$7(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new qix0(this.C, 5));
        TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$9 tariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$9 = new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$9(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0);
        ArrayList arrayList = bix0Var.a;
        ArrayList arrayList2 = bix0Var.c;
        bix0 bix0Var2 = new bix0();
        LinkedHashSet linkedHashSet = bix0Var.b;
        bix0Var2.b.addAll(linkedHashSet);
        kix0 kix0Var2 = this.w;
        bix0Var2.a(kix0Var2, "GLUED_SECTION_NAME");
        ArrayList arrayList3 = bix0Var2.a;
        if (!arrayList3.isEmpty()) {
            arrayList.add((uhx0) tariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$9.invoke());
            arrayList.addAll(arrayList3);
            arrayList2.addAll(bix0Var2.c);
            bix0Var.c(arrayList3);
        }
        boolean isEmpty = kix0Var2.a.isEmpty();
        boolean z = this.x;
        e6v b = isEmpty ? mix0Var.b(SectionSeparatorMarginType.NONE) : z ? null : new rql(DividerType.ICON_MARGIN);
        bix0 bix0Var3 = new bix0();
        bix0Var3.b.addAll(linkedHashSet);
        bix0Var3.a(this.D, "GLUED_SECTION_NAME");
        ArrayList arrayList4 = bix0Var3.a;
        if (!arrayList4.isEmpty()) {
            if (b != null) {
                arrayList.add(b);
            }
            arrayList.addAll(arrayList4);
            arrayList2.addAll(bix0Var3.c);
            bix0Var.c(arrayList4);
        }
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$12(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new qix0(this.E, 0));
        TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$14 tariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$14 = new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$14(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0);
        kix0 kix0Var3 = this.G;
        oz8 oz8Var = this.F;
        bix0Var.e(tariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$14, new ze5(1, oz8Var, kix0Var, kix0Var3));
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$16(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new qix0(this.H, 1));
        bix0Var.e(new TariffOptionsCardStateInteractor$itemsDataFlow$1$items$1$18(0, mix0Var, mix0.class, "getTopLevelSeparator", "getTopLevelSeparator(Lcom/yandex/go/tariffcard/ui/model/SectionSeparatorMarginType;)Lcom/yandex/go/tariffcard/ui/TariffOptionsCardContentItem;", 0), new tj(28, oz8Var, kix0Var));
        kix0 kix0Var4 = this.L;
        lix0 lix0Var = this.J;
        if (z) {
            bix0Var.f(new rix0(mix0Var, 0), new six0(this.I, mix0Var, lix0Var, this.K, kix0Var4, this.M, this.N, this.O, 0));
        } else {
            bix0Var.f(new rix0(mix0Var, 1), new six0(this.I, mix0Var, lix0Var, this.K, kix0Var4, this.M, this.N, this.O, 1));
        }
        bix0Var.a(this.y, null);
        return zy11.a;
    }
}
