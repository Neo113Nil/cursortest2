package com.yandex.go.taxi.summary.shared.lifecycle;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.Set;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final r0 a = bvf0.c(EmptySet.a);

    public final void a(SummaryElement summaryElement) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.i((Set) value, summaryElement)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SummaryLargestContentfulProcessor$waitLargestContentfulPaint$1 summaryLargestContentfulProcessor$waitLargestContentfulPaint$1;
        int i;
        if (continuationImpl instanceof SummaryLargestContentfulProcessor$waitLargestContentfulPaint$1) {
            summaryLargestContentfulProcessor$waitLargestContentfulPaint$1 = (SummaryLargestContentfulProcessor$waitLargestContentfulPaint$1) continuationImpl;
            int i2 = summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.label;
                if (i != 0) {
                    b.b(obj);
                    SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2 summaryLargestContentfulProcessor$waitLargestContentfulPaint$2 = new SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2(2, null);
                    summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.label = 1;
                    if (e.z(this.a, summaryLargestContentfulProcessor$waitLargestContentfulPaint$2, summaryLargestContentfulProcessor$waitLargestContentfulPaint$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        summaryLargestContentfulProcessor$waitLargestContentfulPaint$1 = new SummaryLargestContentfulProcessor$waitLargestContentfulPaint$1(this, continuationImpl);
        Object obj2 = summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryLargestContentfulProcessor$waitLargestContentfulPaint$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
