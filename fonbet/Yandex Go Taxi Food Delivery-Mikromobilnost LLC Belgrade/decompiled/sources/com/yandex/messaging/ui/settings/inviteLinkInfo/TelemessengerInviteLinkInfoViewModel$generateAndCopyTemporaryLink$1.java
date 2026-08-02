package com.yandex.messaging.ui.settings.inviteLinkInfo;

import defpackage.iyj0;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.inviteLinkInfo.TelemessengerInviteLinkInfoViewModel$generateAndCopyTemporaryLink$1", f = "TelemessengerInviteLinkInfoViewModel.kt", l = {85, HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TelemessengerInviteLinkInfoViewModel$generateAndCopyTemporaryLink$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemessengerInviteLinkInfoViewModel$generateAndCopyTemporaryLink$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TelemessengerInviteLinkInfoViewModel$generateAndCopyTemporaryLink$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TelemessengerInviteLinkInfoViewModel$generateAndCopyTemporaryLink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r1.W(defpackage.ldy0.a, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.B;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            com.yandex.messaging.domain.inviteLink.a aVar = this.this$0.w;
            this.label = 1;
            obj = aVar.a(zy11Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                r0 r0Var2 = this.this$0.B;
                Boolean bool2 = Boolean.FALSE;
                r0Var2.getClass();
                r0Var2.m(null, bool2);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        oyj0 oyj0Var = (oyj0) obj;
        c cVar = this.this$0;
        if (oyj0Var instanceof myj0) {
            String str = (String) ((myj0) oyj0Var).a;
            cVar.C = str;
            if (cVar.A.getValue() == InviteLinkType.TEMPORARY) {
                cVar.Y(str);
            }
        } else {
            if (!(oyj0Var instanceof iyj0)) {
                w511.b();
                return null;
            }
            this.label = 2;
        }
        r0 r0Var22 = this.this$0.B;
        Boolean bool22 = Boolean.FALSE;
        r0Var22.getClass();
        r0Var22.m(null, bool22);
        return zy11Var;
    }
}
