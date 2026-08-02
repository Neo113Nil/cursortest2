package com.yandex.plus.pay.ui.core.internal.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.internal.common.PlusPayUserStateProviderImpl$getUserState$2$1$avatarUrl$1", f = "PlusPayUserStateProviderImpl.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusPayUserStateProviderImpl$getUserState$2$1$avatarUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdate;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayUserStateProviderImpl$getUserState$2$1$avatarUrl$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$forceUpdate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusPayUserStateProviderImpl$getUserState$2$1$avatarUrl$1(this.this$0, this.$forceUpdate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPayUserStateProviderImpl$getUserState$2$1$avatarUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.this$0.d;
            if (str != null) {
                String str2 = this.$forceUpdate ? null : str;
                if (str2 != null) {
                    return str2;
                }
            }
            com.yandex.plus.pay.ui.core.internal.config.a aVar = this.this$0.b;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str3 = (String) obj;
        this.this$0.d = str3;
        return str3;
    }
}
