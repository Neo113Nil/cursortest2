package com.yandex.go.scooters.offers.v2.components.tariffs;

import android.content.Context;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.b;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffLinearLayoutManagerV2;
import defpackage.n5p0;
import defpackage.s6n0;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final n5p0 b;
    public final s6n0 c;
    public final b d;

    public a(Context context, n5p0 n5p0Var, s6n0 s6n0Var, b bVar) {
        this.a = context;
        this.b = n5p0Var;
        this.c = s6n0Var;
        this.d = bVar;
    }

    public final ScootersTariffListView a() {
        Context context = this.a;
        ScootersTariffLinearLayoutManagerV2 scootersTariffLinearLayoutManagerV2 = new ScootersTariffLinearLayoutManagerV2(context);
        ScootersTariffListViewFactory$create$1 scootersTariffListViewFactory$create$1 = new ScootersTariffListViewFactory$create$1(1, this.b, n5p0.class, "packageClicked", "packageClicked$preorder(Ljava/lang/String;)V", 0);
        ScootersTariffListViewFactory$create$2 scootersTariffListViewFactory$create$2 = new ScootersTariffListViewFactory$create$2(1, this.b, n5p0.class, "tariffItemClicked", "tariffItemClicked$preorder(Lcom/yandex/go/scooters/domain/model/ScootersTariff;)V", 0);
        return new ScootersTariffListView(context, scootersTariffLinearLayoutManagerV2, this.b, this.c, this.d.a(new ScootersTariffListViewFactory$create$3(1, this.b, n5p0.class, "superPassesClicked", "superPassesClicked$preorder(Lru/yandex/taxi/scooters/domain/model/ScootersPasses$SuperPasses;)V", 0), scootersTariffListViewFactory$create$2, scootersTariffListViewFactory$create$1));
    }
}
