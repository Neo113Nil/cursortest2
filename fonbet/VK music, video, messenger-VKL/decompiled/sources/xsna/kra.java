package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlatformTextInputModifierNode.kt */
/* loaded from: classes11.dex */
public final class kra {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(androidx.compose.ui.node.p pVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        fra fraVar;
        int i;
        if (continuationImpl instanceof fra) {
            fraVar = (fra) continuationImpl;
            int i2 = fraVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fraVar.label = i2 - Integer.MIN_VALUE;
                Object obj = fraVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fraVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    jra jraVar = new jra(wzsVar, this, null);
                    fraVar.label = 1;
                    if (lua0.b(pVar, null, jraVar, fraVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        fraVar = new fra(this, continuationImpl);
        Object obj2 = fraVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fraVar.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
