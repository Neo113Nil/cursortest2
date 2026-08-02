package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.b2k;
import defpackage.gse;
import defpackage.i9i;
import defpackage.j9i;
import defpackage.tpr;
import defpackage.vfx0;
import defpackage.viv0;
import defpackage.w511;
import defpackage.wiq0;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;

/* loaded from: classes5.dex */
public final class l {
    public final vfx0 a;
    public final j9i b;
    public final com.yandex.go.summary.mapper.a c;
    public final tpr d;

    public l(vfx0 vfx0Var, j9i j9iVar, wiq0 wiq0Var, viv0 viv0Var, com.yandex.go.summary.mapper.a aVar) {
        this.a = vfx0Var;
        this.b = j9iVar;
        this.c = aVar;
        tpr j = viv0Var.j();
        b2k s = kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b(), new gse(19));
        DeliveryCommentRequirementType deliveryCommentRequirementType = DeliveryCommentRequirementType.COURIER;
        j9iVar.getClass();
        if (i9i.a[deliveryCommentRequirementType.ordinal()] == 1) {
            this.d = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(j, s, new ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.b(j9iVar.b.b, deliveryCommentRequirementType), new DeliveryCommentRequirementUiStateInteractor$uiStateFlow$2(this, null)));
        } else {
            w511.b();
            throw null;
        }
    }
}
