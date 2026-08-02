package androidx.room;

import defpackage.j73;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class n implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vpr c;
    public final /* synthetic */ String[] w;
    public final /* synthetic */ int[] x;

    public n(Ref$ObjectRef ref$ObjectRef, boolean z, vpr vprVar, String[] strArr, int[] iArr) {
        this.a = ref$ObjectRef;
        this.b = z;
        this.c = vprVar;
        this.w = strArr;
        this.x = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r10.emit(r0, r3) == r4) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(int[] iArr, Continuation continuation) {
        TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 triggerBasedInvalidationTracker$createFlow$1$2$emit$1;
        int i;
        T t;
        if (continuation instanceof TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) {
            triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = (TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) continuation;
            int i2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label;
                Object obj2 = null;
                Ref$ObjectRef ref$ObjectRef = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    T t2 = ref$ObjectRef.element;
                    String[] strArr = this.w;
                    vpr vprVar = this.c;
                    if (t2 == 0) {
                        if (this.b) {
                            Set f0 = j73.f0(strArr);
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$0 = iArr;
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label = 1;
                        }
                        t = iArr;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            T t3 = ref$ObjectRef.element;
                            if (t3 == 0) {
                                Object obj3 = obj2;
                                ny61.r("Required value was null.");
                                return obj3;
                            }
                            Object obj4 = obj2;
                            int i6 = this.x[i4];
                            if (((int[]) t3)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            obj2 = obj4;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set N0 = kotlin.collections.a.N0(arrayList);
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$0 = iArr;
                            triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label = 2;
                        }
                        t = iArr;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int[] iArr2 = (int[]) triggerBasedInvalidationTracker$createFlow$1$2$emit$1.L$0;
                    kotlin.b.b(obj);
                    t = iArr2;
                }
                ref$ObjectRef.element = t;
                return zy11.a;
            }
        }
        triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = new TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(this, continuation);
        Object obj5 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.label;
        Object obj22 = null;
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        if (i != 0) {
        }
        ref$ObjectRef2.element = t;
        return zy11.a;
    }
}
