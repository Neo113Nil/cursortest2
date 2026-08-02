package com.yandex.messaging.input.bricks.writing;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.ny61;
import defpackage.p4t;
import defpackage.qoh;
import defpackage.reu;
import defpackage.tje;
import defpackage.xv10;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final SharedPreferences a;
    public final ChatRequest b;
    public final p4t c;
    public final com.yandex.messaging.navigation.c d;
    public final reu e;
    public final qoh f;

    public b(SharedPreferences sharedPreferences, ChatRequest chatRequest, p4t p4tVar, com.yandex.messaging.navigation.c cVar, reu reuVar) {
        this.a = sharedPreferences;
        this.b = chatRequest;
        this.c = p4tVar;
        this.d = cVar;
        this.e = reuVar;
        this.f = tje.h(cVar, null, null, new InputDraftController$chatIdAsync$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InputDraftController$loadDraft$1 inputDraftController$loadDraft$1;
        int i;
        ServerMessageRef[] serverMessageRefArr;
        String string;
        InputDraft inputDraft;
        ServerMessageRef[] forwardMessageTimestamps;
        if (continuationImpl instanceof InputDraftController$loadDraft$1) {
            inputDraftController$loadDraft$1 = (InputDraftController$loadDraft$1) continuationImpl;
            int i2 = inputDraftController$loadDraft$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputDraftController$loadDraft$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inputDraftController$loadDraft$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputDraftController$loadDraft$1.label;
                serverMessageRefArr = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inputDraftController$loadDraft$1.L$0 = this;
                    inputDraftController$loadDraft$1.label = 1;
                    obj = this.f.s(inputDraftController$loadDraft$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (b) inputDraftController$loadDraft$1.L$0;
                    kotlin.b.b(obj);
                }
                string = this.a.getString((String) obj, null);
                if (string == null || (inputDraft = (InputDraft) ((JsonAdapter) this.e.b).fromJson(string)) == null) {
                    return null;
                }
                forwardMessageTimestamps = inputDraft.getForwardMessageTimestamps();
                if (forwardMessageTimestamps != null) {
                    ArrayList arrayList = new ArrayList(forwardMessageTimestamps.length);
                    for (ServerMessageRef serverMessageRef : forwardMessageTimestamps) {
                        arrayList.add(ServerMessageRef.copy$default(serverMessageRef, 0L, inputDraft.getForwardChatId(), 1, null));
                    }
                    serverMessageRefArr = (ServerMessageRef[]) arrayList.toArray(new ServerMessageRef[0]);
                }
                inputDraft.setForwardMessageTimestamps(serverMessageRefArr);
                return inputDraft;
            }
        }
        inputDraftController$loadDraft$1 = new InputDraftController$loadDraft$1(this, continuationImpl);
        Object obj2 = inputDraftController$loadDraft$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputDraftController$loadDraft$1.label;
        serverMessageRefArr = null;
        if (i != 0) {
        }
        string = this.a.getString((String) obj2, null);
        if (string == null) {
            forwardMessageTimestamps = inputDraft.getForwardMessageTimestamps();
            if (forwardMessageTimestamps != null) {
            }
            inputDraft.setForwardMessageTimestamps(serverMessageRefArr);
            return inputDraft;
        }
        return null;
    }

    public final void b(String str, boolean z, boolean z2, xv10 xv10Var, ArrayList arrayList) {
        ServerMessageRef[] serverMessageRefArr;
        List list;
        InputDraft inputDraft = new InputDraft();
        inputDraft.setText(str);
        inputDraft.setStarred(z);
        inputDraft.setSilent(z2);
        inputDraft.setForwardChatId(xv10Var != null ? (String) xv10Var.a : null);
        if (xv10Var == null || (list = (List) xv10Var.b) == null || (serverMessageRefArr = (ServerMessageRef[]) list.toArray(new ServerMessageRef[0])) == null) {
            serverMessageRefArr = new ServerMessageRef[0];
        }
        inputDraft.setForwardMessageTimestamps(serverMessageRefArr);
        inputDraft.setReply((xv10Var != null ? (QuotePresenter$QuoteType) xv10Var.c : null) == QuotePresenter$QuoteType.REPLY);
        inputDraft.setQuote((xv10Var != null ? (QuotePresenter$QuoteType) xv10Var.c : null) == QuotePresenter$QuoteType.QUOTE);
        inputDraft.setQuotedText(xv10Var != null ? (String) xv10Var.w : null);
        inputDraft.setAttachments(arrayList != null ? kotlin.collections.a.J0(arrayList) : null);
        tje.N(this.d, null, null, new InputDraftController$save$1(this, inputDraft, null), 3);
    }
}
