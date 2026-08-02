package com.yandex.messaging.internal.view.timeline.translations;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.sls;
import defpackage.zy01;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessageTextTranslationHelper$getTranslationButton$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        boolean contains;
        c cVar = (c) this.receiver;
        if (((zy01) cVar.j.get()).c) {
            ServerMessageRef serverMessageRef = cVar.w;
            contains = serverMessageRef != null ? cVar.m.a.contains(serverMessageRef) : false;
        } else {
            contains = true;
        }
        return Boolean.valueOf(contains);
    }
}
