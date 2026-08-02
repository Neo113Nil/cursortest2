package com.yandex.go.yb.main_menu.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.yb.main_menu.data.YbWalletMenuItemRepositoryImpl", f = "YbWalletMenuItemRepositoryImpl.kt", l = {103}, m = "getBankMenuItemInfo", v = 2)
/* loaded from: classes15.dex */
final class YbWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.a(this.this$0, this);
    }
}
