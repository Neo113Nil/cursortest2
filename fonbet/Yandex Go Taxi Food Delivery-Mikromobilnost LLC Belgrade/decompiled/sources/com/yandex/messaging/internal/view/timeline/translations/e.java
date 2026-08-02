package com.yandex.messaging.internal.view.timeline.translations;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.bcb;
import defpackage.c18;
import defpackage.cn2;
import defpackage.ffx;
import defpackage.fse;
import defpackage.kse;
import defpackage.ny61;
import defpackage.o400;
import defpackage.rfa;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uw10;
import defpackage.uyj;
import defpackage.ww10;
import defpackage.x08;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class e implements ww10 {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final kse c;
    public final com.yandex.messaging.internal.translator.g d;
    public final com.yandex.messaging.internal.translator.b e;
    public final bcb f;
    public final p g;
    public final LinkedHashMap h;
    public final n0 i;

    public e(Lifecycle lifecycle, ChatRequest chatRequest, com.yandex.messaging.internal.authorized.chat.b bVar, kse kseVar, com.yandex.messaging.internal.translator.g gVar, com.yandex.messaging.internal.translator.b bVar2, bcb bcbVar) {
        this.a = chatRequest;
        this.b = bVar;
        this.c = kseVar;
        this.d = gVar;
        this.e = bVar2;
        this.f = bcbVar;
        p a = r.a(lifecycle);
        this.g = a;
        this.h = new LinkedHashMap();
        this.i = ffx.c(0, 0, null, 7);
        tje.N(a, null, null, new MessageTranslationBatchUpdater$1(this, null), 3);
        tje.N(a, null, null, new MessageTranslationBatchUpdater$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3 A[LOOP:0: B:11:0x00dd->B:13:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, ContinuationImpl continuationImpl) {
        MessageTranslationBatchUpdater$update$1 messageTranslationBatchUpdater$update$1;
        int i;
        Iterator it;
        eVar.getClass();
        if (continuationImpl instanceof MessageTranslationBatchUpdater$update$1) {
            messageTranslationBatchUpdater$update$1 = (MessageTranslationBatchUpdater$update$1) continuationImpl;
            int i2 = messageTranslationBatchUpdater$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messageTranslationBatchUpdater$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messageTranslationBatchUpdater$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messageTranslationBatchUpdater$update$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Collection values = eVar.h.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : values) {
                        if (!((uw10) obj2).b.isEmpty()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        bcb bcbVar = eVar.f;
                        bcb.a aVar = (bcb.a) bcbVar.b.c(((uw10) next).a);
                        if (aVar == null || !aVar.b) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new Long(((uw10) it3.next()).a));
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList3);
                    if (!N0.isEmpty()) {
                        com.yandex.messaging.internal.authorized.chat.b bVar = eVar.b;
                        ChatRequest chatRequest = eVar.a;
                        MessageTranslationBatchUpdater$update$updatedTimestamps$1 messageTranslationBatchUpdater$update$updatedTimestamps$1 = new MessageTranslationBatchUpdater$update$updatedTimestamps$1(N0, null);
                        messageTranslationBatchUpdater$update$1.L$0 = eVar;
                        messageTranslationBatchUpdater$update$1.label = 1;
                        obj = bVar.d(chatRequest, messageTranslationBatchUpdater$update$updatedTimestamps$1, messageTranslationBatchUpdater$update$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar = (e) messageTranslationBatchUpdater$update$1.L$0;
                kotlin.b.b(obj);
                it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    eVar.e.d(((Number) it.next()).longValue(), new rfa(20));
                }
                return zy11.a;
            }
        }
        messageTranslationBatchUpdater$update$1 = new MessageTranslationBatchUpdater$update$1(eVar, continuationImpl);
        Object obj3 = messageTranslationBatchUpdater$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messageTranslationBatchUpdater$update$1.label;
        if (i != 0) {
        }
        it = ((Set) obj3).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    @Override // defpackage.ww10
    public final x08 a(long j) {
        kse.b(this.c);
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new uw10(this, j);
            linkedHashMap.put(valueOf, obj);
        }
        uw10 uw10Var = (uw10) obj;
        c18 c18Var = new c18(1, uw10Var);
        ArrayList arrayList = uw10Var.b;
        if (arrayList.isEmpty()) {
            e eVar = uw10Var.c;
            tje.N(eVar.g, null, null, new MessageTranslationBatchUpdater$scheduleUpdate$1(eVar, null), 3);
        }
        arrayList.add(c18Var);
        fse fseVar = this.g.b;
        sjh sjhVar = uyj.a;
        com.yandex.messaging.internal.suspend.a.a(new cn2(c18Var, 1), fseVar, o400.a);
        return c18Var;
    }
}
