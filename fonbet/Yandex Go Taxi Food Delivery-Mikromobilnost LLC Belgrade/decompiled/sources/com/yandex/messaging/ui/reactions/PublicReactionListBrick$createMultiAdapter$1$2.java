package com.yandex.messaging.ui.reactions;

import com.yandex.messaging.paging.PagedLoader$LoadState;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class PublicReactionListBrick$createMultiAdapter$1$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PagedLoader$LoadType pagedLoader$LoadType = (PagedLoader$LoadType) obj;
        PagedLoader$LoadState pagedLoader$LoadState = (PagedLoader$LoadState) obj2;
        a aVar = (a) this.receiver;
        aVar.getClass();
        if (pagedLoader$LoadType == PagedLoader$LoadType.INIT) {
            aVar.z.g(pagedLoader$LoadState);
        } else if (pagedLoader$LoadType == PagedLoader$LoadType.APPEND) {
            aVar.A.g(pagedLoader$LoadState);
        }
        return zy11.a;
    }
}
