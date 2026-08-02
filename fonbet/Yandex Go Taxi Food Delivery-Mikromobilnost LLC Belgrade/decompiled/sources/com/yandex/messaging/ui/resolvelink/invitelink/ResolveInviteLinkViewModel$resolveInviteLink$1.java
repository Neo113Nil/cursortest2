package com.yandex.messaging.ui.resolvelink.invitelink;

import com.yandex.messaging.core.net.entities.UserData;
import defpackage.iyj0;
import defpackage.ksj0;
import defpackage.msj0;
import defpackage.mvg;
import defpackage.myj0;
import defpackage.nsj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.resolvelink.invitelink.ResolveInviteLinkViewModel$resolveInviteLink$1", f = "ResolveInviteLinkViewModel.kt", l = {31, 33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ResolveInviteLinkViewModel$resolveInviteLink$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveInviteLinkViewModel$resolveInviteLink$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ResolveInviteLinkViewModel$resolveInviteLink$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResolveInviteLinkViewModel$resolveInviteLink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r1.W(r2, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            r0 r0Var = this.this$0.y;
            r0Var.getClass();
            r0Var.m(null, nsj0.a);
            a aVar = this.this$0;
            com.yandex.messaging.domain.inviteLink.b bVar = aVar.x;
            String str = aVar.w.b;
            this.label = 1;
            obj = bVar.a(str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        oyj0 oyj0Var = (oyj0) obj;
        a aVar2 = this.this$0;
        if (oyj0Var instanceof myj0) {
            ksj0 ksj0Var = new ksj0(((UserData) ((myj0) oyj0Var).a).userId);
            this.label = 2;
        } else {
            if (!(oyj0Var instanceof iyj0)) {
                w511.b();
                return null;
            }
            r0 r0Var2 = aVar2.y;
            r0Var2.getClass();
            r0Var2.m(null, msj0.a);
        }
        return zy11.a;
    }
}
