package androidx.room;

import defpackage.bvf0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class g {
    public final r0 a;

    public g(int i) {
        this.a = bvf0.c(new int[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(n nVar, ContinuationImpl continuationImpl) {
        ObservedTableVersions$collect$1 observedTableVersions$collect$1;
        int i;
        if (continuationImpl instanceof ObservedTableVersions$collect$1) {
            observedTableVersions$collect$1 = (ObservedTableVersions$collect$1) continuationImpl;
            int i2 = observedTableVersions$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                observedTableVersions$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = observedTableVersions$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observedTableVersions$collect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    observedTableVersions$collect$1.label = 1;
                    if (this.a.collect(nVar, observedTableVersions$collect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        observedTableVersions$collect$1 = new ObservedTableVersions$collect$1(this, continuationImpl);
        Object obj2 = observedTableVersions$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observedTableVersions$collect$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
