package com.yandex.div.core.expression.local;

import defpackage.all0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lall0;", "node", "Lzy11;", "invoke", "(Lall0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RuntimeStoreImpl$traverseFrom$1 extends Lambda implements tls {
    final /* synthetic */ tls $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeStoreImpl$traverseFrom$1(tls tlsVar) {
        super(1);
        this.$callback = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.$callback.invoke(((all0) obj).a);
        return zy11.a;
    }
}
