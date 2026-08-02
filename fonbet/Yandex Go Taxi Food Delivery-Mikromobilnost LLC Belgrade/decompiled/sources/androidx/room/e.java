package androidx.room;

import defpackage.cvu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String[] b;

    public e(vpr vprVar, String[] strArr) {
        this.a = vprVar;
        this.b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1) {
            multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 = (MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set set = (Set) obj;
                    SetBuilder setBuilder = new SetBuilder();
                    for (String str : this.b) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (cvu0.t(str, (String) it.next(), true)) {
                                setBuilder.add(str);
                            }
                        }
                    }
                    SetBuilder b = setBuilder.b();
                    SetBuilder setBuilder2 = b.isEmpty() ? null : b;
                    if (setBuilder2 != null) {
                        multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(setBuilder2, multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 = new MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
