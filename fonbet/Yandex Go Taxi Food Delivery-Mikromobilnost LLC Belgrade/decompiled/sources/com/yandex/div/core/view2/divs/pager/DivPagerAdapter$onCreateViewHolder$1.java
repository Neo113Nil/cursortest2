package com.yandex.div.core.view2.divs.pager;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DivPagerAdapter$onCreateViewHolder$1 extends Lambda implements sls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerAdapter$onCreateViewHolder$1(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return Boolean.valueOf(this.this$0.H == 0);
    }
}
