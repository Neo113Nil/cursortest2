package com.yandex.passport.sloth.url;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.ny61;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d {
    public final SlothParams a;
    public final com.yandex.passport.internal.sloth.p b;

    public d(SlothParams slothParams, com.yandex.passport.internal.sloth.p pVar) {
        this.a = slothParams;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        SlothParamMerger$getMergedParams$1 slothParamMerger$getMergedParams$1;
        int i;
        d dVar;
        LinkedHashMap linkedHashMap;
        SlothParams slothParams;
        String origin;
        if (continuationImpl instanceof SlothParamMerger$getMergedParams$1) {
            slothParamMerger$getMergedParams$1 = (SlothParamMerger$getMergedParams$1) continuationImpl;
            int i2 = slothParamMerger$getMergedParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothParamMerger$getMergedParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothParamMerger$getMergedParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothParamMerger$getMergedParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    slothParamMerger$getMergedParams$1.L$0 = this;
                    slothParamMerger$getMergedParams$1.L$1 = this;
                    slothParamMerger$getMergedParams$1.label = 1;
                    obj = this.b.a(slothParamMerger$getMergedParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) slothParamMerger$getMergedParams$1.L$1;
                    dVar = (d) slothParamMerger$getMergedParams$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj);
                dVar.getClass();
                linkedHashMap = new LinkedHashMap();
                slothParams = dVar.a;
                if ((slothParams.getVariant() instanceof com.yandex.passport.sloth.data.g) && (origin = ((com.yandex.passport.sloth.data.g) slothParams.getVariant()).c().getOrigin()) != null) {
                    linkedHashMap.put("origin", origin);
                }
                this.getClass();
                return kotlin.collections.b.n(linkedHashMap2, linkedHashMap);
            }
        }
        slothParamMerger$getMergedParams$1 = new SlothParamMerger$getMergedParams$1(this, continuationImpl);
        Object obj2 = slothParamMerger$getMergedParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothParamMerger$getMergedParams$1.label;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap((Map) obj2);
        dVar.getClass();
        linkedHashMap = new LinkedHashMap();
        slothParams = dVar.a;
        if (slothParams.getVariant() instanceof com.yandex.passport.sloth.data.g) {
            linkedHashMap.put("origin", origin);
        }
        this.getClass();
        return kotlin.collections.b.n(linkedHashMap22, linkedHashMap);
    }
}
