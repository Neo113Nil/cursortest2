package com.yandex.messaging.input.voice.reply;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import defpackage.abz0;
import defpackage.az31;
import defpackage.b00;
import defpackage.k020;
import defpackage.kse;
import defpackage.ly31;
import defpackage.m8g;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.oy31;
import defpackage.p8b;
import defpackage.rh3;
import defpackage.s020;
import defpackage.sh3;
import defpackage.tje;
import defpackage.yab;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final kse c;
    public final oy31 d;
    public final b00 e;
    public final LinkedHashMap f = new LinkedHashMap();

    public b(ChatRequest chatRequest, com.yandex.messaging.internal.authorized.chat.b bVar, kse kseVar, oy31 oy31Var, b00 b00Var) {
        this.a = chatRequest;
        this.b = bVar;
        this.c = kseVar;
        this.d = oy31Var;
        this.e = b00Var;
    }

    public static final az31 a(b bVar, yab yabVar, String str, ServerMessageRef serverMessageRef) {
        String str2;
        bVar.getClass();
        if (yabVar.moveToFirst()) {
            MessageData R = yabVar.R();
            VoiceMessageData voiceMessageData = R instanceof VoiceMessageData ? (VoiceMessageData) R : null;
            if (voiceMessageData != null && (str2 = voiceMessageData.fileId) != null) {
                b00 b00Var = bVar.e;
                oy31 oy31Var = bVar.d;
                String str3 = voiceMessageData.fileName;
                if (str3 == null) {
                    str3 = "";
                }
                return new az31(str2, serverMessageRef, str, new ly31(p8b.a(str), b00Var, oy31Var, str2, str3), voiceMessageData.duration);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, abz0 abz0Var, ServerMessageRef serverMessageRef, ContinuationImpl continuationImpl) {
        VoiceMessageReplyTrackLoader$load$1 voiceMessageReplyTrackLoader$load$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        b bVar;
        String str2;
        ServerMessageRef serverMessageRef2;
        abz0 abz0Var2;
        b bVar2;
        rh3 rh3Var;
        abz0 abz0Var3 = abz0Var;
        if (continuationImpl instanceof VoiceMessageReplyTrackLoader$load$1) {
            voiceMessageReplyTrackLoader$load$1 = (VoiceMessageReplyTrackLoader$load$1) continuationImpl;
            int i2 = voiceMessageReplyTrackLoader$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceMessageReplyTrackLoader$load$1.label = i2 - Integer.MIN_VALUE;
                obj = voiceMessageReplyTrackLoader$load$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceMessageReplyTrackLoader$load$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rh3 rh3Var2 = (rh3) this.f.get(new Long(abz0Var3.a));
                    if (rh3Var2 != null) {
                        return rh3Var2;
                    }
                    voiceMessageReplyTrackLoader$load$1.L$0 = this;
                    voiceMessageReplyTrackLoader$load$1.L$1 = str;
                    voiceMessageReplyTrackLoader$load$1.L$2 = abz0Var3;
                    voiceMessageReplyTrackLoader$load$1.L$3 = serverMessageRef;
                    voiceMessageReplyTrackLoader$load$1.label = 1;
                    Object a = this.b.a(this.a, voiceMessageReplyTrackLoader$load$1);
                    if (a != coroutineSingletons) {
                        bVar = this;
                        str2 = str;
                        serverMessageRef2 = serverMessageRef;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    abz0Var2 = (abz0) voiceMessageReplyTrackLoader$load$1.L$1;
                    bVar2 = (b) voiceMessageReplyTrackLoader$load$1.L$0;
                    kotlin.b.b(obj);
                    rh3Var = (rh3) obj;
                    if (rh3Var != null) {
                        sh3 sh3Var = (sh3) rh3Var;
                        sh3Var.a.j(sh3Var);
                    }
                    bVar2.f.put(new Long(abz0Var2.a), rh3Var);
                    return obj;
                }
                ServerMessageRef serverMessageRef3 = (ServerMessageRef) voiceMessageReplyTrackLoader$load$1.L$3;
                abz0Var3 = (abz0) voiceMessageReplyTrackLoader$load$1.L$2;
                String str3 = (String) voiceMessageReplyTrackLoader$load$1.L$1;
                b bVar3 = (b) voiceMessageReplyTrackLoader$load$1.L$0;
                kotlin.b.b(obj);
                serverMessageRef2 = serverMessageRef3;
                str2 = str3;
                bVar = bVar3;
                abz0 abz0Var4 = abz0Var3;
                m8g m8gVar = (m8g) ((s020) obj);
                k020 k020Var = (k020) m8gVar.c.H.get();
                o1b0 o1b0Var = m8gVar.a;
                mdh mdhVar = bVar.c.d;
                VoiceMessageReplyTrackLoader$load$2 voiceMessageReplyTrackLoader$load$2 = new VoiceMessageReplyTrackLoader$load$2(k020Var, o1b0Var, abz0Var4, bVar, str2, serverMessageRef2, null);
                voiceMessageReplyTrackLoader$load$1.L$0 = bVar;
                voiceMessageReplyTrackLoader$load$1.L$1 = abz0Var4;
                voiceMessageReplyTrackLoader$load$1.L$2 = null;
                voiceMessageReplyTrackLoader$load$1.L$3 = null;
                voiceMessageReplyTrackLoader$load$1.label = 2;
                obj = tje.k0(mdhVar, voiceMessageReplyTrackLoader$load$2, voiceMessageReplyTrackLoader$load$1);
                if (obj != coroutineSingletons) {
                    abz0Var2 = abz0Var4;
                    bVar2 = bVar;
                    rh3Var = (rh3) obj;
                    if (rh3Var != null) {
                    }
                    bVar2.f.put(new Long(abz0Var2.a), rh3Var);
                    return obj;
                }
                return coroutineSingletons;
            }
        }
        voiceMessageReplyTrackLoader$load$1 = new VoiceMessageReplyTrackLoader$load$1(this, continuationImpl);
        obj = voiceMessageReplyTrackLoader$load$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceMessageReplyTrackLoader$load$1.label;
        if (i != 0) {
        }
        abz0 abz0Var42 = abz0Var3;
        m8g m8gVar2 = (m8g) ((s020) obj);
        k020 k020Var2 = (k020) m8gVar2.c.H.get();
        o1b0 o1b0Var2 = m8gVar2.a;
        mdh mdhVar2 = bVar.c.d;
        VoiceMessageReplyTrackLoader$load$2 voiceMessageReplyTrackLoader$load$22 = new VoiceMessageReplyTrackLoader$load$2(k020Var2, o1b0Var2, abz0Var42, bVar, str2, serverMessageRef2, null);
        voiceMessageReplyTrackLoader$load$1.L$0 = bVar;
        voiceMessageReplyTrackLoader$load$1.L$1 = abz0Var42;
        voiceMessageReplyTrackLoader$load$1.L$2 = null;
        voiceMessageReplyTrackLoader$load$1.L$3 = null;
        voiceMessageReplyTrackLoader$load$1.label = 2;
        obj = tje.k0(mdhVar2, voiceMessageReplyTrackLoader$load$22, voiceMessageReplyTrackLoader$load$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
