package com.yandex.go.places.map.ui.pinwar;

import defpackage.cq00;
import defpackage.dq00;
import defpackage.e2c0;
import defpackage.eq00;
import defpackage.fq00;
import defpackage.gq00;
import defpackage.hq00;
import defpackage.in00;
import defpackage.iq00;
import defpackage.jl40;
import defpackage.tls;
import defpackage.tzb0;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.c;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PinsMapPresenterV2$attachPins$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        iq00 iq00Var = (iq00) obj;
        b bVar = (b) this.receiver;
        e2c0 e2c0Var = bVar.N;
        if (iq00Var instanceof eq00) {
            e2c0Var.b(((eq00) iq00Var).a);
        } else if (iq00Var instanceof hq00) {
            hq00 hq00Var = (hq00) iq00Var;
            e2c0Var.c(hq00Var.a, hq00Var.b);
        } else if (iq00Var instanceof fq00) {
            c cVar = e2c0Var.a;
            if (cVar != null) {
                cVar.l(Collections.singletonList(e2c0Var.b.a(((fq00) iq00Var).a)));
            }
        } else if (iq00Var instanceof gq00) {
            gq00 gq00Var = (gq00) iq00Var;
            in00 in00Var = gq00Var.a;
            if (in00Var == null) {
                bVar.Lg(null);
                c cVar2 = e2c0Var.a;
                if (cVar2 != null) {
                    cVar2.d();
                }
            } else {
                c cVar3 = e2c0Var.a;
                tzb0 tzb0Var = e2c0Var.b;
                if (cVar3 != null) {
                    cVar3.d();
                    bVar.Lg(in00Var.getId());
                    if (gq00Var.b) {
                        cVar3.g();
                        ru.yandex.yandexmaps.multiplatform.pin.war.b.b(cVar3, Collections.singletonList(tzb0Var.b(in00Var)));
                        bVar.O = in00Var;
                    } else {
                        bVar.O = null;
                    }
                    cVar3.p(tzb0Var.a(in00Var));
                    cVar3.q();
                }
            }
        } else if (jl40.l(iq00Var, dq00.a)) {
            c cVar4 = e2c0Var.a;
            if (cVar4 != null) {
                cVar4.g();
            }
        } else {
            if (!jl40.l(iq00Var, cq00.a)) {
                w511.b();
                return null;
            }
            c cVar5 = e2c0Var.a;
            if (cVar5 != null) {
                cVar5.o();
            }
            tzb0 tzb0Var2 = e2c0Var.b;
            tzb0Var2.a.clear();
            tzb0Var2.b.clear();
            bVar.O = null;
        }
        return zy11.a;
    }
}
