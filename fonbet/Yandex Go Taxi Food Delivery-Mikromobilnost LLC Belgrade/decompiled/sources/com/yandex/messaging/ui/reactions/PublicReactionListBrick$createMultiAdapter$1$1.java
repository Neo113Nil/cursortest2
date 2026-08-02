package com.yandex.messaging.ui.reactions;

import com.yandex.messaging.paging.PagedLoader$LoadState;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class PublicReactionListBrick$createMultiAdapter$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a aVar = (a) this.receiver;
        aVar.x.w.setVisibility((((List) obj).isEmpty() && aVar.z.a == PagedLoader$LoadState.COMPLETE) ? 0 : 8);
        return zy11.a;
    }
}
