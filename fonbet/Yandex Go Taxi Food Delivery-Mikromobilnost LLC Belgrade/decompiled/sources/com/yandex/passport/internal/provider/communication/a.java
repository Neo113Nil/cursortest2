package com.yandex.passport.internal.provider.communication;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.dvw;
import defpackage.e3n;
import defpackage.fyc;
import defpackage.j18;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public abstract class a {
    public final o a;
    public fyc b;
    public final CommonRequestsProcessor$connection$1 c = new ServiceConnection() { // from class: com.yandex.passport.internal.provider.communication.CommonRequestsProcessor$connection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder service) {
            fyc fycVar = a.this.b;
            if (fycVar != null) {
                fycVar.T(new Messenger(service));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName className) {
            fyc fycVar = a.this.b;
            if (fycVar != null) {
                fycVar.a(null);
            }
            a.this.b = null;
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.passport.internal.provider.communication.CommonRequestsProcessor$connection$1] */
    public a(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(final a aVar, Message message, ContinuationImpl continuationImpl) {
        CommonRequestsProcessor$sendCommandToHost$1 commonRequestsProcessor$sendCommandToHost$1;
        int i;
        Messenger messenger;
        if (continuationImpl instanceof CommonRequestsProcessor$sendCommandToHost$1) {
            commonRequestsProcessor$sendCommandToHost$1 = (CommonRequestsProcessor$sendCommandToHost$1) continuationImpl;
            int i2 = commonRequestsProcessor$sendCommandToHost$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonRequestsProcessor$sendCommandToHost$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonRequestsProcessor$sendCommandToHost$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonRequestsProcessor$sendCommandToHost$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar.a();
                    o430 o430Var = e3n.b;
                    long U = kp50.U(20, DurationUnit.SECONDS);
                    CommonRequestsProcessor$sendCommandToHost$messenger$1 commonRequestsProcessor$sendCommandToHost$messenger$1 = new CommonRequestsProcessor$sendCommandToHost$messenger$1(aVar, null);
                    commonRequestsProcessor$sendCommandToHost$1.L$0 = aVar;
                    commonRequestsProcessor$sendCommandToHost$1.L$1 = message;
                    commonRequestsProcessor$sendCommandToHost$1.label = 1;
                    obj = kotlinx.coroutines.a.x(U, commonRequestsProcessor$sendCommandToHost$messenger$1, commonRequestsProcessor$sendCommandToHost$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    message = (Message) commonRequestsProcessor$sendCommandToHost$1.L$1;
                    aVar = (a) commonRequestsProcessor$sendCommandToHost$1.L$0;
                    kotlin.b.b(obj);
                }
                messenger = (Messenger) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "messenger: " + messenger, 8);
                }
                commonRequestsProcessor$sendCommandToHost$1.L$0 = aVar;
                commonRequestsProcessor$sendCommandToHost$1.L$1 = message;
                commonRequestsProcessor$sendCommandToHost$1.L$2 = messenger;
                commonRequestsProcessor$sendCommandToHost$1.label = 2;
                final j18 j18Var = new j18(1, dvw.b(commonRequestsProcessor$sendCommandToHost$1));
                j18Var.u();
                if (messenger != null) {
                    try {
                        aVar.getClass();
                        final Looper mainLooper = Looper.getMainLooper();
                        message.replyTo = new Messenger(new Handler(mainLooper) { // from class: com.yandex.passport.internal.provider.communication.CommonRequestsProcessor$responseMessenger$1
                            @Override // android.os.Handler
                            public void handleMessage(Message msg) {
                                j18Var.resumeWith(aVar.a.a(msg));
                            }
                        });
                        messenger.send(message);
                    } catch (CancellationException e) {
                        j18Var.b(e);
                    } catch (Throwable th) {
                        j18Var.resumeWith(new Result.Failure(new IllegalStateException("Service binding failed cause: " + th)));
                    }
                }
                Object s = j18Var.s();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        commonRequestsProcessor$sendCommandToHost$1 = new CommonRequestsProcessor$sendCommandToHost$1(aVar, continuationImpl);
        Object obj2 = commonRequestsProcessor$sendCommandToHost$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonRequestsProcessor$sendCommandToHost$1.label;
        if (i != 0) {
        }
        messenger = (Messenger) obj2;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        commonRequestsProcessor$sendCommandToHost$1.L$0 = aVar;
        commonRequestsProcessor$sendCommandToHost$1.L$1 = message;
        commonRequestsProcessor$sendCommandToHost$1.L$2 = messenger;
        commonRequestsProcessor$sendCommandToHost$1.label = 2;
        final Continuation<Object> j18Var2 = new j18(1, dvw.b(commonRequestsProcessor$sendCommandToHost$1));
        j18Var2.u();
        if (messenger != null) {
        }
        Object s2 = j18Var2.s();
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s2 != coroutineSingletons3) {
        }
    }

    public abstract boolean a();
}
