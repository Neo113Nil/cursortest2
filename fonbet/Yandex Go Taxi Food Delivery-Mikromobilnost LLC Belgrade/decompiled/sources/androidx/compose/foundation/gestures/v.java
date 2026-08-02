package androidx.compose.foundation.gestures;

import defpackage.gn50;
import defpackage.k631;
import defpackage.ny61;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class v implements gn50 {
    public final y a;
    public boolean b;

    public v(y yVar, boolean z) {
        this.a = yVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        int i;
        long j3;
        if (continuation instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) continuation;
            int i2 = scrollableNestedScrollConnection$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollableNestedScrollConnection$onPostFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollableNestedScrollConnection$onPostFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j3 = 0;
                    if (this.b) {
                        y yVar = this.a;
                        if (!yVar.i) {
                            scrollableNestedScrollConnection$onPostFling$1.J$0 = j2;
                            scrollableNestedScrollConnection$onPostFling$1.label = 1;
                            obj = yVar.a(j2, scrollableNestedScrollConnection$onPostFling$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        j3 = k631.e(j2, j3);
                    }
                    return new k631(j3);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = scrollableNestedScrollConnection$onPostFling$1.J$0;
                kotlin.b.b(obj);
                j3 = ((k631) obj).a;
                j3 = k631.e(j2, j3);
                return new k631(j3);
            }
        }
        scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = scrollableNestedScrollConnection$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i != 0) {
        }
        j3 = ((k631) obj2).a;
        j3 = k631.e(j2, j3);
        return new k631(j3);
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public final long mo29onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.b) {
            return 0L;
        }
        y yVar = this.a;
        if (yVar.a.a()) {
            return 0L;
        }
        return yVar.h(yVar.d(yVar.a.c(yVar.d(yVar.g(j2)))));
    }
}
