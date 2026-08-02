package com.yandex.messaging.internal.translator;

import android.util.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.gzw;
import defpackage.mdb;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sz01;
import defpackage.tje;
import defpackage.tls;
import defpackage.x22;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final ChatRequest a;
    public final x22 b;
    public final mdb c;
    public final gzw d;
    public final k e;
    public final p f;
    public final LongSparseArray g = new LongSparseArray();

    public b(ChatRequest chatRequest, x22 x22Var, mdb mdbVar, Lifecycle lifecycle, gzw gzwVar, k kVar) {
        this.a = chatRequest;
        this.b = x22Var;
        this.c = mdbVar;
        this.d = gzwVar;
        this.e = kVar;
        this.f = r.a(lifecycle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096 A[LOOP:0: B:11:0x0094->B:12:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b bVar, Pair[] pairArr, ContinuationImpl continuationImpl) {
        ChatTranslatorReporter$withCommonParams$1 chatTranslatorReporter$withCommonParams$1;
        int i;
        Pair[] pairArr2;
        String str;
        String str2;
        List list;
        bVar.getClass();
        if (continuationImpl instanceof ChatTranslatorReporter$withCommonParams$1) {
            chatTranslatorReporter$withCommonParams$1 = (ChatTranslatorReporter$withCommonParams$1) continuationImpl;
            int i2 = chatTranslatorReporter$withCommonParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTranslatorReporter$withCommonParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatTranslatorReporter$withCommonParams$1.result;
                ?? r1 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTranslatorReporter$withCommonParams$1.label;
                String str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sz01 sz01Var = bVar.c.p;
                    String str4 = sz01Var != null ? sz01Var.a : null;
                    if (sz01Var != null && (list = sz01Var.b) != null) {
                        str3 = kotlin.collections.a.X(list, null, null, null, null, 63);
                    }
                    k kVar = bVar.e;
                    ChatRequest chatRequest = bVar.a;
                    chatTranslatorReporter$withCommonParams$1.L$0 = pairArr;
                    chatTranslatorReporter$withCommonParams$1.L$1 = str4;
                    chatTranslatorReporter$withCommonParams$1.L$2 = str3;
                    chatTranslatorReporter$withCommonParams$1.label = 1;
                    obj = kVar.d(chatRequest, chatTranslatorReporter$withCommonParams$1);
                    if (obj != r1) {
                        pairArr2 = pairArr;
                        str = str4;
                        str2 = str3;
                    }
                    return (Serializable) r1;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) chatTranslatorReporter$withCommonParams$1.L$2;
                str = (String) chatTranslatorReporter$withCommonParams$1.L$1;
                pairArr2 = (Pair[]) chatTranslatorReporter$withCommonParams$1.L$0;
                kotlin.b.b(obj);
                r1 = kotlin.collections.b.l(new Pair("requested_language", str), new Pair("supported_languages", str2), new Pair("active_language", (String) obj));
                for (Pair pair : pairArr2) {
                    r1.put(pair.c(), pair.f());
                }
                return (Serializable) r1;
            }
        }
        chatTranslatorReporter$withCommonParams$1 = new ChatTranslatorReporter$withCommonParams$1(bVar, continuationImpl);
        Object obj2 = chatTranslatorReporter$withCommonParams$1.result;
        ?? r12 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTranslatorReporter$withCommonParams$1.label;
        String str32 = null;
        if (i != 0) {
        }
        r12 = kotlin.collections.b.l(new Pair("requested_language", str), new Pair("supported_languages", str2), new Pair("active_language", (String) obj2));
        while (r12 < r11) {
        }
        return (Serializable) r12;
    }

    public final void b() {
        if (this.d.c) {
            tje.N(this.f, null, null, new ChatTranslatorReporter$onChatOpened$1(this, null), 3);
        }
    }

    public final void c(long j) {
        tje.N(this.f, null, null, new ChatTranslatorReporter$onMessageTranslating$1(this, j, null), 3);
    }

    public final pzt0 d(long j, tls tlsVar) {
        return tje.N(this.f, null, null, new ChatTranslatorReporter$onMessageTranslatingOnBackend$1(this, j, tlsVar, null), 3);
    }

    public final void e() {
        tje.N(this.f, null, null, new ChatTranslatorReporter$onShowOriginalButtonTapped$1(this, null), 3);
    }

    public final void f() {
        tje.N(this.f, null, null, new ChatTranslatorReporter$onTranslateButtonTapped$1(this, null), 3);
    }

    public final void g(long j) {
        tje.N(this.f, null, null, new ChatTranslatorReporter$onTranslatedMessageShown$1(this, j, null), 3);
    }
}
