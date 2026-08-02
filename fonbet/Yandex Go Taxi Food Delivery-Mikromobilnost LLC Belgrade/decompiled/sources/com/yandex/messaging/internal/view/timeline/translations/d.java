package com.yandex.messaging.internal.view.timeline.translations;

import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        e eVar = this.a;
        tje.N(eVar.g, null, null, new MessageTranslationBatchUpdater$scheduleUpdate$1(eVar, null), 3);
        return zy11.a;
    }
}
