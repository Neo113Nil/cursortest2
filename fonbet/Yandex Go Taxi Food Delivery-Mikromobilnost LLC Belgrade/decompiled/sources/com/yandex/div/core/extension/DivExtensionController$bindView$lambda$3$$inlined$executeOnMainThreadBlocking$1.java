package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import defpackage.dpk;
import defpackage.egk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvo;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.extension.DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1", f = "DivExtensionController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ egk $div$inlined;
    final /* synthetic */ Div2View $divView$inlined;
    final /* synthetic */ dpk $handler$inlined;
    final /* synthetic */ rvo $resolver$inlined;
    final /* synthetic */ View $view$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1(Continuation continuation, dpk dpkVar, Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        super(2, continuation);
        this.$handler$inlined = dpkVar;
        this.$divView$inlined = div2View;
        this.$resolver$inlined = rvoVar;
        this.$view$inlined = view;
        this.$div$inlined = egkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1(continuation, this.$handler$inlined, this.$divView$inlined, this.$resolver$inlined, this.$view$inlined, this.$div$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1 divExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1 = (DivExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        divExtensionController$bindView$lambda$3$$inlined$executeOnMainThreadBlocking$1.invokeSuspend(zy11Var);
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
        this.$handler$inlined.bindView(this.$divView$inlined, this.$resolver$inlined, this.$view$inlined, this.$div$inlined);
        return zy11.a;
    }
}
