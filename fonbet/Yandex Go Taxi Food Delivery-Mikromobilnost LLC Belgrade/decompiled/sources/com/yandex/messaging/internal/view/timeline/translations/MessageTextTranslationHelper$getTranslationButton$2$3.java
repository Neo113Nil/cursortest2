package com.yandex.messaging.internal.view.timeline.translations;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessageTextTranslationHelper$getTranslationButton$2$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = (c) this.receiver;
        ServerMessageRef serverMessageRef = cVar.w;
        if (serverMessageRef != null) {
            cVar.m.a.add(serverMessageRef);
        }
        cVar.i();
        return zy11.a;
    }
}
