package com.yandex.div.core.view2.debugview;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DebugView$tryAddDetailsView$holder$2 extends Lambda implements sls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugView$tryAddDetailsView$holder$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = this.this$0.c;
        Throwable a = Result.a(bVar.c(bVar.a(true)));
        if (a != null && c.d(a)) {
            bVar.c(bVar.a(false));
        }
        return zy11.a;
    }
}
