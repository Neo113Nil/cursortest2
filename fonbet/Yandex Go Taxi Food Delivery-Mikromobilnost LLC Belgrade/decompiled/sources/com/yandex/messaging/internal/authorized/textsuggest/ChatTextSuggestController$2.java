package com.yandex.messaging.internal.authorized.textsuggest;

import android.os.SystemClock;
import com.yandex.messaging.internal.net.socket.PostMethodException;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tz10;
import defpackage.upq0;
import defpackage.w9b;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lupq0;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lupq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.textsuggest.ChatTextSuggestController$2", f = "ChatTextSuggestController.kt", l = {70, 72}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTextSuggestController$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTextSuggestController$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatTextSuggestController$2 chatTextSuggestController$2 = new ChatTextSuggestController$2(this.this$0, continuation);
        chatTextSuggestController$2.L$0 = obj;
        return chatTextSuggestController$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTextSuggestController$2) create((upq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        upq0 upq0Var;
        Throwable th;
        PostMethodException e;
        Long l;
        Long l2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            upq0 upq0Var2 = (upq0) this.L$0;
            w9b w9bVar = this.this$0.f;
            w9bVar.b.put(upq0Var2.b, Long.valueOf(SystemClock.elapsedRealtime()));
            try {
                boolean a = this.this$0.b.a(tz10.J);
                b bVar = this.this$0;
                if (a) {
                    this.L$0 = upq0Var2;
                    this.label = 1;
                    Object b = b.b(bVar, upq0Var2, this);
                    this = b;
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    this.L$0 = upq0Var2;
                    this.label = 2;
                    Object a2 = b.a(bVar, upq0Var2, this);
                    this = a2;
                }
            } catch (PostMethodException e2) {
                upq0Var = upq0Var2;
                e = e2;
                w9b w9bVar2 = this.this$0.f;
                String str = upq0Var.b;
                int status = e.getStatus();
                String details = e.getDetails();
                l2 = (Long) w9bVar2.b.remove(str);
                if (l2 != null) {
                }
                return zy11.a;
            } catch (Throwable th2) {
                upq0Var = upq0Var2;
                th = th2;
                w9b w9bVar3 = this.this$0.f;
                String str2 = upq0Var.b;
                String message = th.getMessage();
                l = (Long) w9bVar3.b.remove(str2);
                if (l != null) {
                }
                return zy11.a;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            upq0Var = (upq0) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (PostMethodException e3) {
                e = e3;
                w9b w9bVar22 = this.this$0.f;
                String str3 = upq0Var.b;
                int status2 = e.getStatus();
                String details2 = e.getDetails();
                l2 = (Long) w9bVar22.b.remove(str3);
                if (l2 != null) {
                    w9bVar22.a.reportEvent("suggest_send_error", kotlin.collections.b.i(new Pair(RemoteBioParameters.TIME, Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue())), new Pair(CRLReasonCodeExtension.REASON, "uniproxy"), new Pair(ACSPConstants.STATUS, Integer.valueOf(status2)), new Pair("details", details2)));
                }
                return zy11.a;
            } catch (Throwable th3) {
                th = th3;
                w9b w9bVar32 = this.this$0.f;
                String str22 = upq0Var.b;
                String message2 = th.getMessage();
                l = (Long) w9bVar32.b.remove(str22);
                if (l != null) {
                    w9bVar32.a.reportEvent("suggest_send_error", kotlin.collections.b.i(new Pair(RemoteBioParameters.TIME, Long.valueOf(SystemClock.elapsedRealtime() - l.longValue())), new Pair(CRLReasonCodeExtension.REASON, "other"), new Pair("details", message2)));
                }
                return zy11.a;
            }
        }
        return zy11.a;
    }
}
