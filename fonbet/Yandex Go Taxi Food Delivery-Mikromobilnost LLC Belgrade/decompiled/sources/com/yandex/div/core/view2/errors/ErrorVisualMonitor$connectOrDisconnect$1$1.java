package com.yandex.div.core.view2.errors;

import defpackage.dxg;
import defpackage.tls;
import defpackage.zv5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzv5;", "it", "Lzy11;", "invoke", "(Lzv5;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class ErrorVisualMonitor$connectOrDisconnect$1$1 extends Lambda implements tls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorVisualMonitor$connectOrDisconnect$1$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zv5 zv5Var = (zv5) obj;
        com.yandex.div.core.view2.debugview.b bVar = this.this$0.g;
        if (bVar.c) {
            bVar.g = zv5Var;
            dxg dxgVar = bVar.l;
            if (dxgVar != null) {
                dxgVar.close();
            }
            bVar.l = bVar.b(zv5Var);
        }
        return zy11.a;
    }
}
