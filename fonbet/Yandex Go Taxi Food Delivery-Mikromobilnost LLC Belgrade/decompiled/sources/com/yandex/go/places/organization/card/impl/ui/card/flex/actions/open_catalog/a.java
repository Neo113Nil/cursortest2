package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog;

import com.yandex.go.places.experiments.flex.b;
import com.yandex.go.places.models.data.entities.network.actions.OpenCatalogFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.f;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog.a;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog.c;
import defpackage.g470;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.jsj;
import defpackage.mu;
import defpackage.nu;
import defpackage.oe80;
import defpackage.qoi0;
import defpackage.sls;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final g470 a;
    public final jsj b;
    public final oe80 c;
    public final ht10 d;
    public final i3y e;
    public final mu f;

    public a(g470 g470Var, jsj jsjVar, oe80 oe80Var, ht10 ht10Var) {
        this.a = g470Var;
        this.b = jsjVar;
        this.c = oe80Var;
        this.d = ht10Var;
        final int i = 0;
        this.e = kotlin.a.a(new sls(this) { // from class: c470
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        g470 g470Var2 = aVar.a;
                        jsj jsjVar2 = aVar.b;
                        oe80 oe80Var2 = aVar.c;
                        ht10 ht10Var2 = aVar.d;
                        h470 h470Var = g470Var2.a;
                        return new c((dac0) h470Var.a.get(), (b) h470Var.b.get(), (zg80) h470Var.e.a, (tse) h470Var.c.get(), (wbc0) h470Var.d.get(), jsjVar2, oe80Var2, ht10Var2);
                    default:
                        return (c) aVar.e.getValue();
                }
            }
        });
        final int i2 = 1;
        this.f = new mu("OpenCatalogAction", qoi0.a(OpenCatalogFlexAction.class), new OpenCatalogActionDescriptorFactory$actionDescriptor$1(0, OpenCatalogFlexAction.Companion, f.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: c470
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        g470 g470Var2 = aVar.a;
                        jsj jsjVar2 = aVar.b;
                        oe80 oe80Var2 = aVar.c;
                        ht10 ht10Var2 = aVar.d;
                        h470 h470Var = g470Var2.a;
                        return new c((dac0) h470Var.a.get(), (b) h470Var.b.get(), (zg80) h470Var.e.a, (tse) h470Var.c.get(), (wbc0) h470Var.d.get(), jsjVar2, oe80Var2, ht10Var2);
                    default:
                        return (c) aVar.e.getValue();
                }
            }
        }), EmptyList.a, false);
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.f;
    }
}
