package com.yandex.div.core.expression.variables;

import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "variableName", "Lzy11;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DivVariableController$requestsObserver$1 extends Lambda implements tls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivVariableController$requestsObserver$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        Iterator it = this.this$0.g.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(str);
        }
        return zy11.a;
    }
}
