package com.yandex.messaging.internal.translator;

import com.yandex.messaging.internal.entities.MessageTranslation;
import defpackage.az01;
import defpackage.fbb;
import defpackage.ffx;
import defpackage.jz01;
import defpackage.k020;
import defpackage.kgx;
import defpackage.kse;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.op3;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.u50;
import defpackage.vw10;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.n0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class j {
    public static final /* synthetic */ kgx[] n;
    public final kse a;
    public final xdf0 b;
    public final jz01 c;
    public final vw10 d;
    public final k020 e;
    public final o1b0 f;
    public final n5t0 g;
    public final x22 h;
    public final fbb i;
    public final n0 j;
    public final n0 k;
    public final op3 l;
    public final ArrayList m;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("currentRepetitiveSubscription", 0, "getCurrentRepetitiveSubscription()Lcom/yandex/messaging/Cancelable;", j.class);
        qoi0.a.getClass();
        n = new kgx[]{mutablePropertyReference1Impl};
    }

    public j(kse kseVar, xdf0 xdf0Var, jz01 jz01Var, vw10 vw10Var, k020 k020Var, o1b0 o1b0Var, n5t0 n5t0Var, x22 x22Var, fbb fbbVar) {
        this.a = kseVar;
        this.b = xdf0Var;
        this.c = jz01Var;
        this.d = vw10Var;
        this.e = k020Var;
        this.f = o1b0Var;
        this.g = n5t0Var;
        this.h = x22Var;
        this.i = fbbVar;
        n0 c = ffx.c(0, 1000, null, 5);
        this.j = c;
        this.k = c;
        this.l = new op3();
        this.m = new ArrayList();
    }

    public final void a(MessageTranslation messageTranslation) {
        this.j.g(new az01(messageTranslation.a.b, messageTranslation.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Set set, ContinuationImpl continuationImpl) {
        TranslationController$updateMessageTranslations$1 translationController$updateMessageTranslations$1;
        int i;
        Collection collection;
        Collection collection2;
        if (continuationImpl instanceof TranslationController$updateMessageTranslations$1) {
            translationController$updateMessageTranslations$1 = (TranslationController$updateMessageTranslations$1) continuationImpl;
            int i2 = translationController$updateMessageTranslations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                translationController$updateMessageTranslations$1.label = i2 - Integer.MIN_VALUE;
                TranslationController$updateMessageTranslations$1 translationController$updateMessageTranslations$12 = translationController$updateMessageTranslations$1;
                Object obj = translationController$updateMessageTranslations$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = translationController$updateMessageTranslations$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kse.a(this.a);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.element = Long.MIN_VALUE;
                    this.e.d(new u50(set, this, linkedHashSet, ref$LongRef, ref$LongRef2, 26));
                    long j = ref$LongRef.element;
                    Pair pair = j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? new Pair(Long.valueOf(j), Long.valueOf(ref$LongRef2.element)) : null;
                    if (pair == null) {
                        return EmptySet.a;
                    }
                    long longValue = ((Number) pair.getFirst()).longValue();
                    long longValue2 = ((Number) pair.getSecond()).longValue();
                    translationController$updateMessageTranslations$12.L$0 = linkedHashSet;
                    translationController$updateMessageTranslations$12.L$1 = linkedHashSet;
                    translationController$updateMessageTranslations$12.label = 1;
                    obj = tje.k0(translationController$updateMessageTranslations$12.get_context(), new TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1(null, this, longValue2, longValue), translationController$updateMessageTranslations$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    collection = linkedHashSet;
                    collection2 = collection;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) translationController$updateMessageTranslations$12.L$1;
                    collection2 = (Set) translationController$updateMessageTranslations$12.L$0;
                    kotlin.b.b(obj);
                }
                ycc.r((Iterable) obj, collection);
                return kotlin.collections.a.N0(collection2);
            }
        }
        translationController$updateMessageTranslations$1 = new TranslationController$updateMessageTranslations$1(this, continuationImpl);
        TranslationController$updateMessageTranslations$1 translationController$updateMessageTranslations$122 = translationController$updateMessageTranslations$1;
        Object obj2 = translationController$updateMessageTranslations$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = translationController$updateMessageTranslations$122.label;
        if (i != 0) {
        }
        ycc.r((Iterable) obj2, collection);
        return kotlin.collections.a.N0(collection2);
    }
}
