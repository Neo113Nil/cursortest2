package com.yandex.go.safety.center.instruction;

import com.yandex.go.safety.center.api.ShareRequestParam;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.instruction.SafetyCenterInstructionPresenter$onCallResult$1", f = "SafetyCenterInstructionPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterInstructionPresenter$onCallResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ ShareRequestParam.NotificationType $notificationType;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterInstructionPresenter$onCallResult$1(h hVar, ShareRequestParam.NotificationType notificationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$notificationType = notificationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterInstructionPresenter$onCallResult$1(this.this$0, this.$notificationType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterInstructionPresenter$onCallResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0;
                ShareRequestParam.NotificationType notificationType = this.$notificationType;
                hVar.F.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                SafetyCenterInstructionPresenter$onCallResult$1$1$1 safetyCenterInstructionPresenter$onCallResult$1$1$1 = new SafetyCenterInstructionPresenter$onCallResult$1$1$1(hVar, notificationType, null);
                this.label = 1;
                if (tje.k0(mdhVar, safetyCenterInstructionPresenter$onCallResult$1$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error with /share executing");
        }
        return zy11.a;
    }
}
