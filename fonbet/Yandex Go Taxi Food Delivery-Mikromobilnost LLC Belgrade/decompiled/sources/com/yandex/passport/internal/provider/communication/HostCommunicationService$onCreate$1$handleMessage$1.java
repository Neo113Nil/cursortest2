package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.provider.communication.IPCCommand;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.provider.communication.HostCommunicationService$onCreate$1$handleMessage$1", f = "HostCommunicationService.kt", l = {38, 39}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HostCommunicationService$onCreate$1$handleMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ Message $msg;
    final /* synthetic */ Messenger $replyMessenger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostCommunicationService$onCreate$1$handleMessage$1(Message message, Messenger messenger, Continuation continuation) {
        super(2, continuation);
        this.$msg = message;
        this.$replyMessenger = messenger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HostCommunicationService$onCreate$1$handleMessage$1(this.$msg, this.$replyMessenger, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HostCommunicationService$onCreate$1$handleMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r8 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Message message;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (RemoteException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "", e);
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.flags.experiments.o oVar = p.a;
            if (oVar != null) {
                Object obj2 = this.$msg.obj;
                Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : null;
                if (bundle != null) {
                    bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                    Parcelable parcelable = bundle.getParcelable(IPCCommand.IPC_COMMAND);
                    if (parcelable == null) {
                        throw new IllegalStateException("can't get required parcelable IPCCommand");
                    }
                    IPCCommand iPCCommand = (IPCCommand) parcelable;
                    if (iPCCommand instanceof IPCCommand.PushTokenCommand) {
                        f fVar = (f) ((xvf0) oVar.b).get();
                        this.label = 1;
                        obj = fVar.b(iPCCommand, this);
                        if (obj == coroutineSingletons) {
                        }
                        message = (Message) obj;
                    } else {
                        if (!(iPCCommand instanceof IPCCommand.VpnStatusChangedCommand)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar = (h) ((xvf0) oVar.c).get();
                        this.label = 2;
                        hVar.getClass();
                        obj = p.b(hVar, (IPCCommand.VpnStatusChangedCommand) iPCCommand, this);
                    }
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            message = (Message) obj;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            message = (Message) obj;
        }
        this.$replyMessenger.send(message);
        return zy11Var;
    }
}
