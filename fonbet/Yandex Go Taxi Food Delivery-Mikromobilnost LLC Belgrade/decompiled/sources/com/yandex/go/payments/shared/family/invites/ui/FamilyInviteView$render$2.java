package com.yandex.go.payments.shared.family.invites.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.invites.ui.FamilyInviteView$render$2", f = "FamilyInviteView.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class FamilyInviteView$render$2 extends SuspendLambda implements wls {
    final /* synthetic */ owx.b $familyInfo;
    int label;
    final /* synthetic */ FamilyInviteView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyInviteView$render$2(FamilyInviteView familyInviteView, owx.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = familyInviteView;
        this.$familyInfo = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyInviteView$render$2(this.this$0, this.$familyInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyInviteView$render$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadAvatar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            FamilyInviteView familyInviteView = this.this$0;
            String str = this.$familyInfo.c;
            this.label = 1;
            loadAvatar = familyInviteView.loadAvatar(str, this);
            if (loadAvatar == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
