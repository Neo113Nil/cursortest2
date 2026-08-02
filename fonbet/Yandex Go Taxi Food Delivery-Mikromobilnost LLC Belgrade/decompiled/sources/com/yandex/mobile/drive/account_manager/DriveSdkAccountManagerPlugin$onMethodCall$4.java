package com.yandex.mobile.drive.account_manager;

import defpackage.da20;
import defpackage.hfm;
import defpackage.hzk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ucm;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.account_manager.DriveSdkAccountManagerPlugin$onMethodCall$4", f = "DriveSdkAccountManagerPlugin.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveSdkAccountManagerPlugin$onMethodCall$4 extends SuspendLambda implements wls {
    final /* synthetic */ hfm $accountManager;
    final /* synthetic */ da20 $result;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveSdkAccountManagerPlugin$onMethodCall$4(hfm hfmVar, da20 da20Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$accountManager = hfmVar;
        this.$result = da20Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveSdkAccountManagerPlugin$onMethodCall$4(this.$accountManager, this.$result, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveSdkAccountManagerPlugin$onMethodCall$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                hfm hfmVar = this.$accountManager;
                this.label = 1;
                obj = ((com.yandex.go.drive.delegates.b) ((hzk) hfmVar).a).b();
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
            ucm ucmVar = (ucm) obj;
            this.$result.success(ucmVar != null ? a.b(this.this$0, ucmVar) : null);
        } catch (Exception e) {
            a.a(this.this$0, this.$result, e);
        }
        return zy11.a;
    }
}
