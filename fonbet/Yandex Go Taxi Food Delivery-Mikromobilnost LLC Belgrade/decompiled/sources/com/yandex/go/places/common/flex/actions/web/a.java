package com.yandex.go.places.common.flex.actions.web;

import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.flex.common.api.actions.g0;
import com.yandex.go.places.common.flex.actions.web.a;
import defpackage.i3y;
import defpackage.mu;
import defpackage.nu;
import defpackage.oep0;
import defpackage.qgc0;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.yvf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final oep0 a;
    public final yvf0 b;
    public final qgc0 c;
    public final i3y d;
    public final mu e;

    public a(oep0 oep0Var, yvf0 yvf0Var, qgc0 qgc0Var) {
        this.a = oep0Var;
        this.b = yvf0Var;
        this.c = qgc0Var;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: k770
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
                        return new n770(aVar.a, aVar.b, aVar.c);
                    default:
                        return (dw) aVar.d.getValue();
                }
            }
        });
        final int i2 = 1;
        this.e = new mu("OpenWebAction", qoi0.a(OpenWebAction.class), new OpenPlacesWebActionDescriptorFactory$actionDescriptor$1(0, OpenWebAction.Companion, g0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: k770
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
                        return new n770(aVar.a, aVar.b, aVar.c);
                    default:
                        return (dw) aVar.d.getValue();
                }
            }
        }), EmptyList.a, true);
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.e;
    }
}
