package com.yandex.messaging.domain.poll;

import android.content.Context;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.authorized.i;
import defpackage.arg;
import defpackage.b64;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.el21;
import defpackage.ijg0;
import defpackage.kse;
import defpackage.m7m;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.w3c;
import defpackage.zy11;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends k {
    public final Context b;
    public final el21 c;
    public final w3c d;
    public final arg e;

    public a(Context context, kse kseVar, el21 el21Var, w3c w3cVar, arg argVar) {
        super(kseVar.e);
        this.b = context;
        this.c = el21Var;
        this.d = w3cVar;
        this.e = argVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        if (r1.d(r12, r3, true, r5, true, r7) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(m7m m7mVar, ContinuationImpl continuationImpl) {
        DownloadPollResultsUseCase$run$1 downloadPollResultsUseCase$run$1;
        int i;
        String str;
        MessageRef messageRef;
        List singletonList;
        if (continuationImpl instanceof DownloadPollResultsUseCase$run$1) {
            downloadPollResultsUseCase$run$1 = (DownloadPollResultsUseCase$run$1) continuationImpl;
            int i2 = downloadPollResultsUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                downloadPollResultsUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                DownloadPollResultsUseCase$run$1 downloadPollResultsUseCase$run$12 = downloadPollResultsUseCase$run$1;
                Object obj = downloadPollResultsUseCase$run$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = downloadPollResultsUseCase$run$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.getClass();
                    String j = b64.j(this.b.getResources().getString(oyh0.messenger_poll_results_file_name, this.e.f.format(new Date(System.currentTimeMillis()))), ".xlsx");
                    downloadPollResultsUseCase$run$12.L$0 = this;
                    downloadPollResultsUseCase$run$12.L$1 = m7mVar;
                    downloadPollResultsUseCase$run$12.L$2 = j;
                    downloadPollResultsUseCase$run$12.label = 1;
                    Object a = i.a(this.c, downloadPollResultsUseCase$run$12);
                    if (a != coroutineSingletons) {
                        str = j;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = (String) downloadPollResultsUseCase$run$12.L$2;
                m7mVar = (m7m) downloadPollResultsUseCase$run$12.L$1;
                a aVar = (a) downloadPollResultsUseCase$run$12.L$0;
                kotlin.b.b(obj);
                str = str2;
                this = aVar;
                com.yandex.messaging.internal.authorized.f fVar = (com.yandex.messaging.internal.authorized.f) ((d9g) ((cl21) obj)).L0.get();
                MessageRef messageRef2 = m7mVar.a;
                this.getClass();
                String concat = "poll_results/".concat(messageRef2.chatId + "_" + messageRef2.timestamp);
                messageRef = m7mVar.b;
                if (messageRef != null) {
                    singletonList = EmptyList.a;
                } else {
                    singletonList = Collections.singletonList(new ijg0("fwd_from", messageRef.chatId + "_" + messageRef.timestamp));
                }
                List list = singletonList;
                downloadPollResultsUseCase$run$12.L$0 = null;
                downloadPollResultsUseCase$run$12.L$1 = null;
                downloadPollResultsUseCase$run$12.L$2 = null;
                downloadPollResultsUseCase$run$12.label = 2;
            }
        }
        downloadPollResultsUseCase$run$1 = new DownloadPollResultsUseCase$run$1(this, continuationImpl);
        DownloadPollResultsUseCase$run$1 downloadPollResultsUseCase$run$122 = downloadPollResultsUseCase$run$1;
        Object obj2 = downloadPollResultsUseCase$run$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = downloadPollResultsUseCase$run$122.label;
        if (i != 0) {
        }
        com.yandex.messaging.internal.authorized.f fVar2 = (com.yandex.messaging.internal.authorized.f) ((d9g) ((cl21) obj2)).L0.get();
        MessageRef messageRef22 = m7mVar.a;
        this.getClass();
        String concat2 = "poll_results/".concat(messageRef22.chatId + "_" + messageRef22.timestamp);
        messageRef = m7mVar.b;
        if (messageRef != null) {
        }
        List list2 = singletonList;
        downloadPollResultsUseCase$run$122.L$0 = null;
        downloadPollResultsUseCase$run$122.L$1 = null;
        downloadPollResultsUseCase$run$122.L$2 = null;
        downloadPollResultsUseCase$run$122.label = 2;
    }
}
