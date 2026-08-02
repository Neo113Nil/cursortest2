package com.yandex.div.core.view2.debugview;

import defpackage.h3u0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DebugViewModelProvider$renderDetailsViewModel$2 extends Lambda implements tls {
    final /* synthetic */ h3u0 $state;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugViewModelProvider$renderDetailsViewModel$2(h3u0 h3u0Var, b bVar) {
        super(1);
        this.$state = h3u0Var;
        this.this$0 = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        h3u0 h3u0Var = this.$state;
        if (h3u0Var.b != booleanValue) {
            this.this$0.d(h3u0.a(h3u0Var, false, booleanValue, null, null, null, 29));
        }
        return zy11.a;
    }
}
