package com.yandex.messaging.internal.authorized;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.PushPriority;
import com.yandex.messaging.core.net.entities.proto.calls.CallingMessage;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.SeenMarker;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.sync.SyncSource;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.PushData;
import defpackage.jl40;
import defpackage.k020;
import defpackage.l020;
import defpackage.m5g0;
import defpackage.m7c;
import defpackage.ml21;
import defpackage.ny61;
import defpackage.o5e;
import defpackage.qtq0;
import defpackage.v5c0;
import defpackage.x22;
import defpackage.y9i0;
import defpackage.z83;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class a {
    public final ml21 a;
    public final k020 b;
    public final qtq0 c;
    public final v5c0 d;
    public final o5e e;
    public final m7c f;
    public final com.yandex.messaging.internal.authorized.sync.f g;
    public final com.yandex.messaging.utils.b h;
    public final Handler i;
    public final x22 j;
    public final JsonAdapter k;

    public a(Moshi moshi, ml21 ml21Var, k020 k020Var, qtq0 qtq0Var, v5c0 v5c0Var, o5e o5eVar, m7c m7cVar, com.yandex.messaging.internal.authorized.sync.f fVar, com.yandex.messaging.utils.b bVar, Handler handler, x22 x22Var) {
        this.a = ml21Var;
        this.b = k020Var;
        this.c = qtq0Var;
        this.d = v5c0Var;
        this.e = o5eVar;
        this.f = m7cVar;
        this.g = fVar;
        this.h = bVar;
        this.i = handler;
        this.j = x22Var;
        this.k = moshi.adapter(PushData.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dd, code lost:
    
        if ((r4 != null ? r4.incomingCall : null) == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168 A[Catch: Exception -> 0x00f3, TryCatch #3 {Exception -> 0x00f3, blocks: (B:35:0x0168, B:36:0x0179, B:38:0x0181, B:41:0x0193, B:43:0x019c, B:44:0x01b9, B:46:0x01c0, B:50:0x01e6, B:51:0x01f1, B:53:0x0204, B:55:0x0208, B:58:0x0218, B:66:0x0220, B:67:0x0223, B:68:0x0224, B:69:0x022c, B:70:0x0231, B:71:0x01c5, B:74:0x01ce, B:77:0x01d5, B:79:0x01db, B:81:0x0187, B:83:0x018b, B:30:0x0148, B:31:0x014d, B:13:0x00e0, B:16:0x00ee, B:20:0x00f6, B:22:0x0102, B:23:0x0111, B:25:0x0115, B:57:0x0212, B:63:0x021e), top: B:12:0x00e0, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179 A[Catch: Exception -> 0x00f3, TryCatch #3 {Exception -> 0x00f3, blocks: (B:35:0x0168, B:36:0x0179, B:38:0x0181, B:41:0x0193, B:43:0x019c, B:44:0x01b9, B:46:0x01c0, B:50:0x01e6, B:51:0x01f1, B:53:0x0204, B:55:0x0208, B:58:0x0218, B:66:0x0220, B:67:0x0223, B:68:0x0224, B:69:0x022c, B:70:0x0231, B:71:0x01c5, B:74:0x01ce, B:77:0x01d5, B:79:0x01db, B:81:0x0187, B:83:0x018b, B:30:0x0148, B:31:0x014d, B:13:0x00e0, B:16:0x00ee, B:20:0x00f6, B:22:0x0102, B:23:0x0111, B:25:0x0115, B:57:0x0212, B:63:0x021e), top: B:12:0x00e0, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y9i0 y9i0Var, ContinuationImpl continuationImpl) {
        CloudMessageProcessor$onMessageReceived$1 cloudMessageProcessor$onMessageReceived$1;
        CloudMessageProcessor$onMessageReceived$1 cloudMessageProcessor$onMessageReceived$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        m5g0 m5g0Var;
        PushData pushData;
        PushData pushData2;
        m5g0 m5g0Var2;
        y9i0 y9i0Var2;
        ServerMessage serverMessage;
        String chatId;
        String str;
        a aVar = this;
        y9i0 y9i0Var3 = y9i0Var;
        if (continuationImpl instanceof CloudMessageProcessor$onMessageReceived$1) {
            cloudMessageProcessor$onMessageReceived$1 = (CloudMessageProcessor$onMessageReceived$1) continuationImpl;
            int i2 = cloudMessageProcessor$onMessageReceived$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cloudMessageProcessor$onMessageReceived$1.label = i2 - Integer.MIN_VALUE;
                cloudMessageProcessor$onMessageReceived$12 = cloudMessageProcessor$onMessageReceived$1;
                Object obj = cloudMessageProcessor$onMessageReceived$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cloudMessageProcessor$onMessageReceived$12.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z83.g("Looper is different", aVar.i.getLooper(), Looper.myLooper());
                    x22 x22Var = (x22) aVar.d.b;
                    String str2 = y9i0Var3.b;
                    if (str2 == null) {
                        Log.i("PushXivaDataRetriever", "not_xiva_push_received");
                        m5g0Var = new m5g0(null, SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                    } else {
                        try {
                            m5g0Var = new m5g0(new JSONObject(str2).getString("transit_id"), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                        } catch (JSONException e) {
                            x22Var.reportError("cannot_parse_xiva_data", e);
                            m5g0Var = new m5g0(null, SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                        }
                        String str3 = m5g0Var.a;
                        if (str3 == null) {
                            x22Var.c("xiva_push_parse_error", CRLReasonCodeExtension.REASON, "No 'transit_id' in Xiva data");
                        } else {
                            x22Var.c("xiva_push_received", "transit_id", str3);
                        }
                    }
                    try {
                        PushData pushData3 = (PushData) aVar.k.fromJson(y9i0Var3.a);
                        m7c m7cVar = aVar.f;
                        if (pushData3 == null) {
                            m7cVar.b(m5g0Var);
                        } else if (jl40.l(aVar.a.a, pushData3.recipientUserId)) {
                            ServerMessage serverMessage2 = pushData3.serverMessage;
                            if (serverMessage2 != null) {
                                pushData = pushData3;
                                serverMessage = serverMessage2;
                                str = pushData.chatId;
                                cloudMessageProcessor$onMessageReceived$12.L$0 = aVar;
                                cloudMessageProcessor$onMessageReceived$12.L$1 = y9i0Var3;
                                cloudMessageProcessor$onMessageReceived$12.L$2 = m5g0Var;
                                cloudMessageProcessor$onMessageReceived$12.L$3 = pushData;
                                cloudMessageProcessor$onMessageReceived$12.L$4 = serverMessage;
                                cloudMessageProcessor$onMessageReceived$12.label = 2;
                                if (aVar.b(str, cloudMessageProcessor$onMessageReceived$12) != coroutineSingletons) {
                                    PushData pushData4 = pushData;
                                    y9i0Var2 = y9i0Var3;
                                    pushData2 = pushData4;
                                    m5g0Var2 = m5g0Var;
                                    if (serverMessage != null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            String str4 = pushData3.chatId;
                            String str5 = pushData3.chatName;
                            long longValue = pushData3.messageId.longValue();
                            cloudMessageProcessor$onMessageReceived$12.L$0 = aVar;
                            cloudMessageProcessor$onMessageReceived$12.L$1 = y9i0Var3;
                            cloudMessageProcessor$onMessageReceived$12.L$2 = m5g0Var;
                            cloudMessageProcessor$onMessageReceived$12.L$3 = pushData3;
                            cloudMessageProcessor$onMessageReceived$12.label = 1;
                            m7cVar.a.reportEvent("tech_load_message_for_push_without_data");
                            Object b = aVar.g.b(new ServerMessageRef(str4, longValue), SyncSource.Notification, str5, 5000L, cloudMessageProcessor$onMessageReceived$12);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            pushData = pushData3;
                            obj = b;
                        } else {
                            m7cVar.d("not_to_us", pushData3, m5g0Var, aVar.e.a().a);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (!(e instanceof CancellationException)) {
                        }
                    }
                    return zy11.a;
                }
                try {
                } catch (Exception e3) {
                    e = e3;
                    aVar = -2147483648;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    aVar.f.c(e, "handling_exception");
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ServerMessage serverMessage3 = (ServerMessage) cloudMessageProcessor$onMessageReceived$12.L$4;
                    pushData2 = (PushData) cloudMessageProcessor$onMessageReceived$12.L$3;
                    m5g0Var2 = (m5g0) cloudMessageProcessor$onMessageReceived$12.L$2;
                    y9i0Var2 = (y9i0) cloudMessageProcessor$onMessageReceived$12.L$1;
                    a aVar2 = (a) cloudMessageProcessor$onMessageReceived$12.L$0;
                    kotlin.b.b(obj);
                    serverMessage = serverMessage3;
                    aVar = aVar2;
                    if (serverMessage != null) {
                        aVar.f.d("message_is_empty", pushData2, m5g0Var2, aVar.e.a().a);
                    } else {
                        String str6 = pushData2.chatId;
                        ClientMessage clientMessage = serverMessage.clientMessage;
                        PlainMessage plainMessage = clientMessage.plain;
                        if (plainMessage == null || (chatId = plainMessage.getChatId()) == null) {
                            SeenMarker seenMarker = clientMessage.seenMarker;
                            chatId = seenMarker != null ? seenMarker.getChatId() : null;
                        }
                        if (chatId != null) {
                            z83.i();
                            if (!chatId.equals(str6)) {
                                aVar.j.reportEvent("tech_9225_push_incorrect_chat", kotlin.collections.b.i(new Pair("chatId_fromPush", str6), new Pair("chatId_fromMessage", chatId)));
                            }
                        }
                        if (Build.VERSION.SDK_INT < 31) {
                            aVar.getClass();
                        } else if (!aVar.h.a() && y9i0Var2.c == PushPriority.Normal) {
                            CallingMessage callingMessage = serverMessage.clientMessage.callingMessage;
                        }
                        z = false;
                        o5e o5eVar = aVar.e;
                        m7c m7cVar2 = aVar.f;
                        if (z) {
                            m7cVar2.d("call_push_low_priority", pushData2, m5g0Var2, o5eVar.a().a);
                        }
                        m7cVar2.e(pushData2, m5g0Var2, o5eVar.a().a);
                        if (!kotlinx.coroutines.a.p(cloudMessageProcessor$onMessageReceived$12.get_context())) {
                            throw new CancellationException();
                        }
                        Boolean bool = pushData2.approved;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            l020 C = aVar.b.C();
                            try {
                                C.B(str6, booleanValue);
                                C.s();
                                C.close();
                            } finally {
                            }
                        }
                        aVar.c.c(str6, serverMessage, m5g0Var2, pushData2.chatName);
                    }
                    return zy11.a;
                }
                PushData pushData5 = (PushData) cloudMessageProcessor$onMessageReceived$12.L$3;
                m5g0 m5g0Var3 = (m5g0) cloudMessageProcessor$onMessageReceived$12.L$2;
                y9i0 y9i0Var4 = (y9i0) cloudMessageProcessor$onMessageReceived$12.L$1;
                a aVar3 = (a) cloudMessageProcessor$onMessageReceived$12.L$0;
                kotlin.b.b(obj);
                m5g0Var = m5g0Var3;
                y9i0Var3 = y9i0Var4;
                pushData = pushData5;
                aVar = aVar3;
                serverMessage = (ServerMessage) obj;
                str = pushData.chatId;
                cloudMessageProcessor$onMessageReceived$12.L$0 = aVar;
                cloudMessageProcessor$onMessageReceived$12.L$1 = y9i0Var3;
                cloudMessageProcessor$onMessageReceived$12.L$2 = m5g0Var;
                cloudMessageProcessor$onMessageReceived$12.L$3 = pushData;
                cloudMessageProcessor$onMessageReceived$12.L$4 = serverMessage;
                cloudMessageProcessor$onMessageReceived$12.label = 2;
                if (aVar.b(str, cloudMessageProcessor$onMessageReceived$12) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        cloudMessageProcessor$onMessageReceived$1 = new CloudMessageProcessor$onMessageReceived$1(aVar, continuationImpl);
        cloudMessageProcessor$onMessageReceived$12 = cloudMessageProcessor$onMessageReceived$1;
        Object obj2 = cloudMessageProcessor$onMessageReceived$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cloudMessageProcessor$onMessageReceived$12.label;
        boolean z2 = true;
        if (i != 0) {
        }
        serverMessage = (ServerMessage) obj2;
        str = pushData.chatId;
        cloudMessageProcessor$onMessageReceived$12.L$0 = aVar;
        cloudMessageProcessor$onMessageReceived$12.L$1 = y9i0Var3;
        cloudMessageProcessor$onMessageReceived$12.L$2 = m5g0Var;
        cloudMessageProcessor$onMessageReceived$12.L$3 = pushData;
        cloudMessageProcessor$onMessageReceived$12.L$4 = serverMessage;
        cloudMessageProcessor$onMessageReceived$12.label = 2;
        if (aVar.b(str, cloudMessageProcessor$onMessageReceived$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        CloudMessageProcessor$tryLoadThreadParentMessage$1 cloudMessageProcessor$tryLoadThreadParentMessage$1;
        Object obj;
        int i;
        if (continuationImpl instanceof CloudMessageProcessor$tryLoadThreadParentMessage$1) {
            cloudMessageProcessor$tryLoadThreadParentMessage$1 = (CloudMessageProcessor$tryLoadThreadParentMessage$1) continuationImpl;
            int i2 = cloudMessageProcessor$tryLoadThreadParentMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cloudMessageProcessor$tryLoadThreadParentMessage$1.label = i2 - Integer.MIN_VALUE;
                obj = cloudMessageProcessor$tryLoadThreadParentMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cloudMessageProcessor$tryLoadThreadParentMessage$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChatId a = ChatId.Companion.a(str);
                    ChatId.ThreadId threadId = a instanceof ChatId.ThreadId ? (ChatId.ThreadId) a : null;
                    if (threadId != null) {
                        ServerMessageRef serverMessageRef = new ServerMessageRef(threadId.c().a, threadId.d);
                        SyncSource syncSource = SyncSource.Notification;
                        cloudMessageProcessor$tryLoadThreadParentMessage$1.L$0 = this;
                        cloudMessageProcessor$tryLoadThreadParentMessage$1.label = 1;
                        obj = this.g.d(serverMessageRef, syncSource, cloudMessageProcessor$tryLoadThreadParentMessage$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (a) cloudMessageProcessor$tryLoadThreadParentMessage$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    this.f.a.reportEvent("tech_load_thread_parent_message_for_push");
                }
                return zy11Var;
            }
        }
        cloudMessageProcessor$tryLoadThreadParentMessage$1 = new CloudMessageProcessor$tryLoadThreadParentMessage$1(this, continuationImpl);
        obj = cloudMessageProcessor$tryLoadThreadParentMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cloudMessageProcessor$tryLoadThreadParentMessage$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }
}
