package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.tje;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes15.dex */
public final class h {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    public final boolean a(ServerMessageRef serverMessageRef) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        i iVar = this.a;
        tje.N(iVar.getBrickScope(), null, null, new ChatTimelineViewController$messageSwipeController$1$checkThreadExistingForMessage$1(ref$BooleanRef, iVar, serverMessageRef, null), 3);
        return ref$BooleanRef.element;
    }
}
