package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$5$1$1$1", f = "LogoutBottomSheetComposeScreen.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$5$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.material3.w $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$5$1$1$1(androidx.compose.material3.w wVar, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$5$1$1$1(this.$sheetState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$5$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.material3.w wVar = this.$sheetState;
            this.label = 1;
            if (wVar.e(this) == coroutineSingletons) {
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
