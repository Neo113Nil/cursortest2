package com.yandex.go.places.impl.ui.main.map.filters.overlay;

import defpackage.c5t0;
import defpackage.d5t0;
import defpackage.e2c0;
import defpackage.e5t0;
import defpackage.f5t0;
import defpackage.g5t0;
import defpackage.h5t0;
import defpackage.i5t0;
import defpackage.in00;
import defpackage.j5t0;
import defpackage.jl40;
import defpackage.tls;
import defpackage.tzb0;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.b;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PlacesCategoryFiltersMapPresenter$attachPins$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        j5t0 j5t0Var = (j5t0) obj;
        e2c0 e2c0Var = ((a) this.receiver).K;
        if (j5t0Var instanceof e5t0) {
            e2c0Var.b(((e5t0) j5t0Var).a);
        } else if (j5t0Var instanceof i5t0) {
            i5t0 i5t0Var = (i5t0) j5t0Var;
            e2c0Var.c(i5t0Var.a, i5t0Var.b);
        } else if (j5t0Var instanceof f5t0) {
            c cVar = e2c0Var.a;
            if (cVar != null) {
                cVar.l(Collections.singletonList(e2c0Var.b.a(((f5t0) j5t0Var).a)));
            }
        } else if (jl40.l(j5t0Var, c5t0.a)) {
            c cVar2 = e2c0Var.a;
            if (cVar2 != null) {
                cVar2.o();
            }
            tzb0 tzb0Var = e2c0Var.b;
            tzb0Var.a.clear();
            tzb0Var.b.clear();
        } else if (jl40.l(j5t0Var, d5t0.a)) {
            c cVar3 = e2c0Var.a;
            if (cVar3 != null) {
                cVar3.g();
            }
        } else if (jl40.l(j5t0Var, h5t0.a)) {
            c cVar4 = e2c0Var.a;
            if (cVar4 != null) {
                cVar4.q();
            }
        } else {
            if (!(j5t0Var instanceof g5t0)) {
                w511.b();
                return null;
            }
            c cVar5 = e2c0Var.a;
            tzb0 tzb0Var2 = e2c0Var.b;
            if (cVar5 != null) {
                cVar5.d();
                g5t0 g5t0Var = (g5t0) j5t0Var;
                in00 in00Var = g5t0Var.a;
                if (in00Var != null) {
                    if (g5t0Var.b) {
                        cVar5.g();
                        b.b(cVar5, Collections.singletonList(tzb0Var2.b(in00Var)));
                    }
                    cVar5.p(tzb0Var2.a(in00Var));
                    cVar5.q();
                }
            }
        }
        return zy11.a;
    }
}
