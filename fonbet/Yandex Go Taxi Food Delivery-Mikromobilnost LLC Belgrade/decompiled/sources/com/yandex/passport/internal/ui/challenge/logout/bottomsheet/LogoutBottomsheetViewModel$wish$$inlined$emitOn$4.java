package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomsheetViewModel$wish$$inlined$emitOn$4", f = "LogoutBottomsheetViewModel.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LogoutBottomsheetViewModel$wish$$inlined$emitOn$4 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $this_emitOn;
    int label;
    final /* synthetic */ x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomsheetViewModel$wish$$inlined$emitOn$4(vpr vprVar, Continuation continuation, x0 x0Var) {
        super(2, continuation);
        this.$this_emitOn = vprVar;
        this.this$0 = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogoutBottomsheetViewModel$wish$$inlined$emitOn$4(this.$this_emitOn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogoutBottomsheetViewModel$wish$$inlined$emitOn$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = this.$this_emitOn;
            PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = this.this$0.z;
            q0 q0Var = new q0(passportLogoutPropertiesImpl != null ? passportLogoutPropertiesImpl : null);
            this.label = 1;
            if (vprVar.emit(q0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
