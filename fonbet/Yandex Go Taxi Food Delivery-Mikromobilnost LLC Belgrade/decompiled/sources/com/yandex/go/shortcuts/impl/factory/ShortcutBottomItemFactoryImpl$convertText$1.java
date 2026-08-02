package com.yandex.go.shortcuts.impl.factory;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.shortcuts.impl.factory.ShortcutBottomItemFactoryImpl", f = "ShortcutBottomItemFactoryImpl.kt", l = {110}, m = "convertText", v = 2)
/* loaded from: classes13.dex */
final class ShortcutBottomItemFactoryImpl$convertText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutBottomItemFactoryImpl$convertText$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, null, this);
    }
}
