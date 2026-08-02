package com.yandex.go.taxi.order.details.v2.state.elements.generic;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.bdc;
import defpackage.fef;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.ojk0;
import defpackage.pdc;
import defpackage.ufu;
import defpackage.xjk0;
import defpackage.xng0;
import defpackage.yjk0;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final xjk0 a;
    public final pdc b;

    public a(xjk0 xjk0Var, pdc pdcVar) {
        this.a = xjk0Var;
        this.b = pdcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ojk0 ojk0Var, List list, fef fefVar, ContinuationImpl continuationImpl) {
        a7 a7Var = ojk0Var instanceof a7 ? (a7) ojk0Var : null;
        if (a7Var != null && !ijk0.b(a7Var)) {
            return new g92(2, new yjk0(((a7) ojk0Var).getA()));
        }
        SlotItemDto c = ojk0Var.getC();
        if (c == null) {
            return new g92(2, new yjk0(ojk0Var.getId()));
        }
        return this.a.c(c, fefVar, new RideCardGenericItemDataSource$stateFlow$2(this, ojk0Var, list, ((ufu) this.b).a(new bdc(xng0.bgTransparent), ojk0Var.getD()), null), continuationImpl);
    }
}
