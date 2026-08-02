package com.yandex.messaging.ui.chatlist;

import defpackage.e370;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BaseChatItemViewHolder$bind$3 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        e370 e370Var = (e370) obj;
        b bVar = (b) this.receiver;
        bVar.Z().c.updateDisplayUserStatus(e370Var.a());
        bVar.Y().f = Boolean.valueOf(e370Var.a);
        return zy11.a;
    }
}
