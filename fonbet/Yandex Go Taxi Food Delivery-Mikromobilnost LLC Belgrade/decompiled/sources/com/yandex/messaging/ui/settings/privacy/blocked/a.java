package com.yandex.messaging.ui.settings.privacy.blocked;

import defpackage.b00;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.hg21;
import defpackage.k5c;
import defpackage.nft;
import defpackage.q46;
import defpackage.s46;
import defpackage.sc5;
import defpackage.tpr;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public a(com.yandex.messaging.domain.privacy.blocked.a aVar, nft nftVar, b00 b00Var) {
        r0 c = bvf0.c(Boolean.FALSE);
        r0 c2 = bvf0.c(EmptySet.a);
        tpr a = aVar.a(zy11.a);
        k5c a2 = ds31.a(this);
        xsr0.a.getClass();
        e.R(e.n(e.R(a, a2, new q0(0L, 0L), null), c, c2, new BlockedUsersViewModel$uiState$1(4, hg21.a, q46.class, "valueOf", "valueOf(Ljava/util/List;ZLjava/util/Set;)Lcom/yandex/messaging/ui/settings/privacy/blocked/BlockedUsersUiState;", 4)), ds31.a(this), new q0(5000L, 0L), s46.b);
    }
}
