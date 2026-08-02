package com.yandex.div.evaluable.function;

import defpackage.sls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class GetStoredValue$evaluate$fallback$1 extends Lambda implements sls {
    final /* synthetic */ List<Object> $args;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStoredValue$evaluate$fallback$1(n nVar, List list) {
        super(0);
        this.this$0 = nVar;
        this.$args = list;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return this.this$0.k(this.$args);
    }
}
