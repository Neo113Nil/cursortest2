package com.yandex.taxi.go_platform.internal;

import defpackage.cne0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oax;
import defpackage.qme0;
import defpackage.uqt;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.taxi.go_platform.internal.JsExtensionsProvider$provideExtensions$1$1", f = "JsExtensionsProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class JsExtensionsProvider$provideExtensions$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ oax this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsExtensionsProvider$provideExtensions$1$1(oax oaxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oaxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsExtensionsProvider$provideExtensions$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JsExtensionsProvider$provideExtensions$1$1 jsExtensionsProvider$provideExtensions$1$1 = (JsExtensionsProvider$provideExtensions$1$1) create((String[]) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jsExtensionsProvider$provideExtensions$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        uqt uqtVar = this.this$0.a.a;
        qme0 qme0Var = uqtVar.c;
        kgx[] kgxVarArr = uqt.x;
        qme0Var.setValue(uqtVar, kgxVarArr[0], Boolean.FALSE);
        uqtVar.w.setValue(uqtVar, kgxVarArr[1], "");
        ((cne0) uqtVar.b).b();
        return zy11.a;
    }
}
