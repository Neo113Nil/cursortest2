package com.yandex.messaging.internal.authorized.textsuggest;

import com.squareup.wire.ProtoAdapter;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.internal.net.socket.PostMethodException;
import defpackage.dvw;
import defpackage.e3n;
import defpackage.eci0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.j1;
import defpackage.j18;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.lqo;
import defpackage.n5t0;
import defpackage.n8a;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.o430;
import defpackage.ouf0;
import defpackage.oyr;
import defpackage.q0b;
import defpackage.qtq0;
import defpackage.rol0;
import defpackage.unr0;
import defpackage.upq0;
import defpackage.w9b;
import defpackage.xdf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class b {
    public final o1b0 a;
    public final lqo b;
    public final n5t0 c;
    public final qtq0 d;
    public final ouf0 e;
    public final w9b f;
    public final n0 g;
    public final eci0 h;
    public final long i;
    public final n0 j;

    public b(o1b0 o1b0Var, xdf0 xdf0Var, lqo lqoVar, n5t0 n5t0Var, qtq0 qtq0Var, ouf0 ouf0Var, com.yandex.messaging.internal.backendconfig.a aVar, w9b w9bVar) {
        this.a = o1b0Var;
        this.b = lqoVar;
        this.c = n5t0Var;
        this.d = qtq0Var;
        this.e = ouf0Var;
        this.f = w9bVar;
        n0 c = ffx.c(1, 0, null, 6);
        this.g = c;
        this.h = e.c(c);
        o430 o430Var = e3n.b;
        this.i = kp50.U(aVar.a().getTextSuggest().getThrottle(), DurationUnit.MILLISECONDS);
        n0 c2 = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.j = c2;
        e.H(xdf0Var, new jqr(new rol0(new ChatTextSuggestController$special$$inlined$transform$1(c2, null, this)), new ChatTextSuggestController$2(this, null), 3));
    }

    public static final Object a(b bVar, upq0 upq0Var, Continuation continuation) {
        n5t0 n5t0Var = bVar.c;
        n8a n8aVar = new n8a(13, bVar, upq0Var);
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        j18Var.w(new j1(28, n5t0Var.f(new q0b(3, n8aVar, j18Var))));
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (kotlinx.coroutines.a.j(r8, r3) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, upq0 upq0Var, ContinuationImpl continuationImpl) {
        ChatTextSuggestController$sendFakeQuery$1 chatTextSuggestController$sendFakeQuery$1;
        int i;
        upq0 upq0Var2;
        b bVar2 = bVar;
        upq0 upq0Var3 = upq0Var;
        bVar2.getClass();
        if (continuationImpl instanceof ChatTextSuggestController$sendFakeQuery$1) {
            chatTextSuggestController$sendFakeQuery$1 = (ChatTextSuggestController$sendFakeQuery$1) continuationImpl;
            int i2 = chatTextSuggestController$sendFakeQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTextSuggestController$sendFakeQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatTextSuggestController$sendFakeQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTextSuggestController$sendFakeQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (evu0.y(upq0Var3.a.toLowerCase(Locale.UK), "error", false)) {
                        o430 o430Var = e3n.b;
                        long T = kp50.T(0.5d, DurationUnit.SECONDS);
                        chatTextSuggestController$sendFakeQuery$1.L$0 = upq0Var3;
                        chatTextSuggestController$sendFakeQuery$1.label = 1;
                        if (kotlinx.coroutines.a.j(T, chatTextSuggestController$sendFakeQuery$1) != coroutineSingletons) {
                            upq0Var2 = upq0Var3;
                            PostMessageResponse postMessageResponse = new PostMessageResponse();
                            postMessageResponse.status = upq0Var2.b.hashCode();
                            postMessageResponse.details = "Fake response!";
                            throw new PostMethodException(postMessageResponse);
                        }
                    } else {
                        o430 o430Var2 = e3n.b;
                        long U = kp50.U(1, DurationUnit.SECONDS);
                        chatTextSuggestController$sendFakeQuery$1.L$0 = bVar2;
                        chatTextSuggestController$sendFakeQuery$1.L$1 = upq0Var3;
                        chatTextSuggestController$sendFakeQuery$1.label = 2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    upq0Var2 = (upq0) chatTextSuggestController$sendFakeQuery$1.L$0;
                    kotlin.b.b(obj);
                    PostMessageResponse postMessageResponse2 = new PostMessageResponse();
                    postMessageResponse2.status = upq0Var2.b.hashCode();
                    postMessageResponse2.details = "Fake response!";
                    throw new PostMethodException(postMessageResponse2);
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                upq0 upq0Var4 = (upq0) chatTextSuggestController$sendFakeQuery$1.L$1;
                b bVar3 = (b) chatTextSuggestController$sendFakeQuery$1.L$0;
                kotlin.b.b(obj);
                upq0Var3 = upq0Var4;
                bVar2 = bVar3;
                ServerMessage serverMessage = new ServerMessage();
                String str = bVar2.a.b;
                String str2 = upq0Var3.b;
                String str3 = upq0Var3.a;
                int length = str3.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    ArrayList arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList2.add(upq0Var3.b);
                    }
                    String X = kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62);
                    StringBuilder v = unr0.v(i3, ShimmerDivHandler.NUMBER_SING, " ", str3, Extension.COLON_SPACE);
                    v.append(X);
                    arrayList.add(new BotRequest.TextSuggestButton(v.toString(), oyr.t(unr0.v(i3, "{ \"item\" : \"", "\", \"locale\" : \"", upq0Var3.c, "\", \"context\" : "), upq0Var3.d, " }")));
                }
                serverMessage.clientMessage = new ClientMessage(null, null, null, null, null, null, new BotRequest(str, null, str2, null, null, new BotRequest.TextSuggest((BotRequest.TextSuggestButton[]) arrayList.toArray(new BotRequest.TextSuggestButton[0])), null, 90, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435391, null);
                ServerMessageInfo serverMessageInfo = new ServerMessageInfo();
                serverMessageInfo.from = new ReducedUserInfo(null, null, "", null, 0L, null, null, null, null, null, false, null, 4091, null);
                serverMessage.serverMessageInfo = serverMessageInfo;
                qtq0 qtq0Var = bVar2.d;
                ProtoAdapter a = bVar2.e.a(ServerMessage.class);
                qtq0Var.d((ServerMessage) a.decode(a.encode(serverMessage)));
                return zy11.a;
            }
        }
        chatTextSuggestController$sendFakeQuery$1 = new ChatTextSuggestController$sendFakeQuery$1(bVar2, continuationImpl);
        Object obj2 = chatTextSuggestController$sendFakeQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTextSuggestController$sendFakeQuery$1.label;
        if (i != 0) {
        }
    }
}
