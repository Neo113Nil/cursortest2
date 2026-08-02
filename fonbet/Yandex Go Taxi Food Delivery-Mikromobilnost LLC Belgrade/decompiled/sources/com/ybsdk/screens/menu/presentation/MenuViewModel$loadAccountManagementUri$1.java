package com.ybsdk.screens.menu.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.menu.presentation.MenuViewModel", f = "MenuViewModel.kt", l = {HProv.PP_LCD_QUERY, HProv.PP_ENUM_LOG}, m = "loadAccountManagementUri-IoAF18A")
/* loaded from: classes3.dex */
final class MenuViewModel$loadAccountManagementUri$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuViewModel$loadAccountManagementUri$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b0 = b.b0(this.this$0, this);
        return b0 == CoroutineSingletons.COROUTINE_SUSPENDED ? b0 : new Result(b0);
    }
}
