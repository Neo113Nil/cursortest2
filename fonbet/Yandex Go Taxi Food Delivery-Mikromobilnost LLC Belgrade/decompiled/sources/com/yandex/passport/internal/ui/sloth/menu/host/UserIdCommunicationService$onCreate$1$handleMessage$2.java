package com.yandex.passport.internal.ui.sloth.menu.host;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.yandex.passport.api.d3;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.e3n;
import defpackage.fyc;
import defpackage.kp50;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.uw51;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService$onCreate$1$handleMessage$2", f = "UserIdCommunicationService.kt", l = {41, 42, 44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserIdCommunicationService$onCreate$1$handleMessage$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $idCommand;
    final /* synthetic */ Messenger $replyMessenger;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIdCommunicationService$onCreate$1$handleMessage$2(String str, Messenger messenger, Continuation continuation) {
        super(2, continuation);
        this.$idCommand = str;
        this.$replyMessenger = messenger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserIdCommunicationService$onCreate$1$handleMessage$2(this.$idCommand, this.$replyMessenger, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserIdCommunicationService$onCreate$1$handleMessage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r10.emit(r4, r9) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r10 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            fyc fycVar = f.a;
            this.label = 1;
            o430 o430Var = e3n.b;
            obj = kotlinx.coroutines.a.x(kp50.U(20, DurationUnit.SECONDS), new UserMenuHostComponentHolder$awaitComponent$2(2, null), this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
            mth mthVar = new mth(((c) aVar.a.get()).a, 6);
            this.L$0 = null;
            this.label = 3;
            obj = kotlinx.coroutines.flow.e.y(mthVar, this);
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Messenger messenger = this.$replyMessenger;
            String str = (String) obj;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                uw51.w("HOST COMMAND: ", str, LogLevel.DEBUG, null, 8);
            }
            try {
                messenger.send(Message.obtain(null, 11, wwg.g(new Pair(UserIdCommunicationService.HOST_COMMAND, str))));
                return zy11Var;
            } catch (RemoteException e) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "", e);
                }
            }
        }
        aVar = (a) obj;
        if (aVar != null) {
            n0 n0Var = ((c) aVar.a.get()).b;
            d3 d3Var = new d3(this.$idCommand);
            this.L$0 = aVar;
            this.label = 2;
        }
        return zy11Var;
    }
}
