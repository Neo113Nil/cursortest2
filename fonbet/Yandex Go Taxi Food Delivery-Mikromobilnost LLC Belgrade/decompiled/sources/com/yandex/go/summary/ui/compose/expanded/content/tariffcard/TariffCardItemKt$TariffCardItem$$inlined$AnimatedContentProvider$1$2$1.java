package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2", f = "TariffCardItem.kt", l = {74, HProv.ALG_SID_KECCAK_256, 90}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
