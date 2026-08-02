package com.yandex.messaging.domain.botrequest;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.ChatOpenType;
import com.yandex.messaging.internal.storage.chats.ChatEventsFlag;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.j3b;
import defpackage.kgx;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.s6b;
import defpackage.syc;
import defpackage.tse;
import defpackage.u2b;
import defpackage.wls;
import defpackage.wly0;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.botrequest.ConnectedChatOpenBotRequestUseCase$execute$2", f = "ConnectedChatOpenBotRequestUseCase.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ConnectedChatOpenBotRequestUseCase$execute$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "connectionStatus", "Lj3b;", "chatInfo", "Lzy11;", "<anonymous>", "(ZLj3b;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.botrequest.ConnectedChatOpenBotRequestUseCase$execute$2$1", f = "ConnectedChatOpenBotRequestUseCase.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, 80, 82}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.botrequest.ConnectedChatOpenBotRequestUseCase$execute$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = dVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Boolean) obj).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (j3b) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        
            if (r14 == r0) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00c8 A[RETURN] */
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
                j3b j3bVar = (j3b) this.L$0;
                LinkedHashMap linkedHashMap = d.j;
                Long l = (Long) linkedHashMap.get(j3bVar.b);
                long longValue = l != null ? l.longValue() : 0L;
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue == 0 || currentTimeMillis - longValue >= 10000) {
                    linkedHashMap.put(j3bVar.b, new Long(currentTimeMillis));
                    d dVar = this.this$0;
                    ChatOpenType chatOpenType = dVar.i ? ChatOpenType.CHAT_OPEN_TYPE_SYNC : ChatOpenType.CHAT_OPEN_TYPE_OPEN;
                    dVar.i = true;
                    wly0 wly0Var = u2b.b;
                    long j = j3bVar.A;
                    wly0Var.getClass();
                    u2b u2bVar = new u2b(j);
                    if (((s6b) this.this$0.g.get()).c) {
                        ChatEventsFlag chatEventsFlag = ChatEventsFlag.Open;
                        kgx kgxVar = u2b.c[0];
                        if (chatEventsFlag.a(u2bVar).booleanValue()) {
                            com.yandex.messaging.domain.chat.a aVar = this.this$0.f;
                            this.label = 1;
                            if (aVar.a(chatOpenType, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    d dVar2 = this.this$0;
                    com.yandex.messaging.internal.authorized.chat.b bVar = dVar2.b;
                    ChatRequest chatRequest = dVar2.a.b;
                    this.label = 2;
                    obj = bVar.a(chatRequest, this);
                }
                return zy11Var;
            }
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (((m8g) ((s020) obj)).a.g) {
                a aVar2 = this.this$0.d;
                this.label = 3;
                if (aVar2.a(zy11Var, this) == coroutineSingletons) {
                }
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectedChatOpenBotRequestUseCase$execute$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectedChatOpenBotRequestUseCase$execute$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectedChatOpenBotRequestUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        syc sycVar = new syc(kotlinx.coroutines.flow.e.t(new syc(this.this$0.c.a(), 2)), i2);
        d dVar = this.this$0;
        m0 m0Var = new m0(sycVar, kotlinx.coroutines.flow.e.T(dVar.e.a(dVar.a.b), 1), new AnonymousClass1(this.this$0, null));
        this.label = 1;
        return kotlinx.coroutines.flow.e.j(m0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
