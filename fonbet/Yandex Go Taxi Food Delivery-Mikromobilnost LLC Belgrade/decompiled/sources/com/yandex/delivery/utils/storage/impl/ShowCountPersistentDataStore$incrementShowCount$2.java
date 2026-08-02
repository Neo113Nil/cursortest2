package com.yandex.delivery.utils.storage.impl;

import defpackage.ez40;
import defpackage.g6s0;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "it", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.storage.impl.ShowCountPersistentDataStore$incrementShowCount$2", f = "ShowCountPersistentDataStore.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class ShowCountPersistentDataStore$incrementShowCount$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowCountPersistentDataStore$incrementShowCount$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShowCountPersistentDataStore$incrementShowCount$2 showCountPersistentDataStore$incrementShowCount$2 = new ShowCountPersistentDataStore$incrementShowCount$2(this.this$0, this.$key, continuation);
        showCountPersistentDataStore$incrementShowCount$2.L$0 = obj;
        return showCountPersistentDataStore$incrementShowCount$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShowCountPersistentDataStore$incrementShowCount$2) create((ez40) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kme0 kme0Var;
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            String str = this.$key;
            g6s0 g6s0Var = a.b;
            aVar.getClass();
            kme0Var = new kme0("pref_show_count" + str);
            a aVar2 = this.this$0;
            String str2 = this.$key;
            this.L$0 = null;
            this.L$1 = ez40Var;
            this.L$2 = kme0Var;
            this.label = 1;
            obj = aVar2.a(str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kme0 kme0Var2 = (kme0) this.L$2;
            ez40 ez40Var2 = (ez40) this.L$1;
            kotlin.b.b(obj);
            kme0Var = kme0Var2;
            ez40Var = ez40Var2;
        }
        ez40Var.g(kme0Var, new Integer(((Number) obj).intValue() + 1));
        return zy11.a;
    }
}
