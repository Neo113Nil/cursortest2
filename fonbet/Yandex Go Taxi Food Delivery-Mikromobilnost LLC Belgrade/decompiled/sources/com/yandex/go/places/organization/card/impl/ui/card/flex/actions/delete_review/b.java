package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review;

import com.yandex.go.places.models.data.entities.network.actions.DeleteReviewFlexAction;
import defpackage.dw;
import defpackage.g8c0;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class b implements dw {
    public final com.yandex.go.places.organization.card.impl.data.repositories.a a;
    public final tse b;
    public final g8c0 c;

    public b(com.yandex.go.places.organization.card.impl.data.repositories.a aVar, tse tseVar, g8c0 g8c0Var) {
        this.a = aVar;
        this.b = tseVar;
        this.c = g8c0Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        com.yandex.go.coroutines.b.g(this.b, null, null, new DeleteReviewActionHandler$handle$1(this, (DeleteReviewFlexAction) krVar, null), 3);
    }
}
