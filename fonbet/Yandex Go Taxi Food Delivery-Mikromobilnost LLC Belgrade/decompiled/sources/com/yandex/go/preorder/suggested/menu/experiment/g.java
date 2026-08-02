package com.yandex.go.preorder.suggested.menu.experiment;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes13.dex */
public final class g implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public g(rqo rqoVar) {
        SuggestMenuExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(SuggestMenuExperiment.p);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (SuggestMenuExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(EntryPoint entryPoint, ContinuationImpl continuationImpl) {
        SuggestMenuExperimentRepository$isEnabledForEntryPoint$1 suggestMenuExperimentRepository$isEnabledForEntryPoint$1;
        int i;
        if (continuationImpl instanceof SuggestMenuExperimentRepository$isEnabledForEntryPoint$1) {
            suggestMenuExperimentRepository$isEnabledForEntryPoint$1 = (SuggestMenuExperimentRepository$isEnabledForEntryPoint$1) continuationImpl;
            int i2 = suggestMenuExperimentRepository$isEnabledForEntryPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuExperimentRepository$isEnabledForEntryPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuExperimentRepository$isEnabledForEntryPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuExperimentRepository$isEnabledForEntryPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    suggestMenuExperimentRepository$isEnabledForEntryPoint$1.L$0 = entryPoint;
                    suggestMenuExperimentRepository$isEnabledForEntryPoint$1.L$1 = this;
                    suggestMenuExperimentRepository$isEnabledForEntryPoint$1.label = 1;
                    obj = this.a.b(suggestMenuExperimentRepository$isEnabledForEntryPoint$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (g) suggestMenuExperimentRepository$isEnabledForEntryPoint$1.L$1;
                    entryPoint = (EntryPoint) suggestMenuExperimentRepository$isEnabledForEntryPoint$1.L$0;
                    kotlin.b.b(obj);
                }
                SuggestMenuExperiment suggestMenuExperiment = (SuggestMenuExperiment) obj;
                this.getClass();
                return Boolean.valueOf(!suggestMenuExperiment.b && suggestMenuExperiment.j.contains(entryPoint));
            }
        }
        suggestMenuExperimentRepository$isEnabledForEntryPoint$1 = new SuggestMenuExperimentRepository$isEnabledForEntryPoint$1(this, continuationImpl);
        Object obj2 = suggestMenuExperimentRepository$isEnabledForEntryPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuExperimentRepository$isEnabledForEntryPoint$1.label;
        if (i != 0) {
        }
        SuggestMenuExperiment suggestMenuExperiment2 = (SuggestMenuExperiment) obj2;
        this.getClass();
        return Boolean.valueOf(!suggestMenuExperiment2.b && suggestMenuExperiment2.j.contains(entryPoint));
    }
}
