package androidx.compose.ui.input.nestedscroll;

import defpackage.k631;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public c a;
    public c b;
    public sls c = new sls() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return NestedScrollDispatcher.this.d;
        }
    };
    public tse d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long j3;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuationImpl;
            int i2 = nestedScrollDispatcher$dispatchPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label = i2 - Integer.MIN_VALUE;
                NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                Object obj = nestedScrollDispatcher$dispatchPostFling$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollDispatcher$dispatchPostFling$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = this.a;
                    j3 = 0;
                    if ((cVar != null ? cVar.F0() : null) == null) {
                        c cVar2 = this.b;
                        if (cVar2 != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                            obj = cVar2.mo28onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        }
                    } else {
                        c cVar3 = this.a;
                        c F0 = cVar3 != null ? cVar3.F0() : null;
                        if (F0 != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.label = 2;
                            obj = F0.mo28onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        }
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                    j3 = ((k631) obj).i();
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    j3 = ((k631) obj).i();
                }
                return k631.a(j3);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollDispatcher$dispatchPostFling$122.label;
        if (i != 0) {
        }
        return k631.a(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long j2;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuationImpl;
            int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nestedScrollDispatcher$dispatchPreFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollDispatcher$dispatchPreFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = this.a;
                    c F0 = cVar != null ? cVar.F0() : null;
                    if (F0 == null) {
                        j2 = 0;
                        return k631.a(j2);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                    obj = F0.mo33onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                j2 = ((k631) obj).i();
                return k631.a(j2);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
        Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i != 0) {
        }
        j2 = ((k631) obj2).i();
        return k631.a(j2);
    }

    public final tse c() {
        tse tseVar = (tse) this.c.invoke();
        if (tseVar != null) {
            return tseVar;
        }
        ny61.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
