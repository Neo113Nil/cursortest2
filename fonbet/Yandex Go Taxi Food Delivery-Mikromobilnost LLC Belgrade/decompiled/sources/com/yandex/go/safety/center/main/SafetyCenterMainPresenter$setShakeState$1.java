package com.yandex.go.safety.center.main;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenToggleTapSource;
import defpackage.chr0;
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
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.main.SafetyCenterMainPresenter$setShakeState$1", f = "SafetyCenterMainPresenter.kt", l = {MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SafetyCenterMainPresenter$setShakeState$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isChecked;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterMainPresenter$setShakeState$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$isChecked = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterMainPresenter$setShakeState$1(this.this$0, this.$isChecked, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterMainPresenter$setShakeState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r7.d(r1, r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SafetyCenterMainMvpView safetyCenterMainMvpView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.something_wrong_screen.repository.b bVar = this.this$0.F;
            boolean z = this.$isChecked;
            SomethingWrongScreenToggleTapSource somethingWrongScreenToggleTapSource = SomethingWrongScreenToggleTapSource.SAFETY_CENTER;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                safetyCenterMainMvpView = (SafetyCenterMainMvpView) this.L$0;
                kotlin.b.b(obj);
                safetyCenterMainMvpView.setShakeToggleEnabled((chr0) obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        SafetyCenterMainMvpView safetyCenterMainMvpView2 = (SafetyCenterMainMvpView) this.this$0.Dg();
        com.yandex.go.something_wrong_screen.repository.b bVar2 = this.this$0.F;
        this.L$0 = safetyCenterMainMvpView2;
        this.label = 2;
        Object c = bVar2.c(this);
        if (c != coroutineSingletons) {
            obj = c;
            safetyCenterMainMvpView = safetyCenterMainMvpView2;
            safetyCenterMainMvpView.setShakeToggleEnabled((chr0) obj);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
