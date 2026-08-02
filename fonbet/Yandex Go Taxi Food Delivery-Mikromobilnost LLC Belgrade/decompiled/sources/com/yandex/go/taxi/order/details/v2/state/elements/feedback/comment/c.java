package com.yandex.go.taxi.order.details.v2.state.elements.feedback.comment;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PlainComment;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.lbk0;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.yjk0;
import defpackage.zuj0;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final o2y0 a;
    public final lbk0 b;
    public final e c;
    public final zuj0 d;

    public c(o2y0 o2y0Var, lbk0 lbk0Var, e eVar, zuj0 zuj0Var) {
        this.a = o2y0Var;
        this.b = lbk0Var;
        this.c = eVar;
        this.d = zuj0Var;
    }

    public final tpr a(RideCardItemDto$PlainComment rideCardItemDto$PlainComment) {
        return !ijk0.b(rideCardItemDto$PlainComment) ? new g92(2, new yjk0(rideCardItemDto$PlainComment.a)) : kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new b(this.a.a())), new RideCardCommentItemDataSource$stateFlow$2(rideCardItemDto$PlainComment, this, null));
    }
}
