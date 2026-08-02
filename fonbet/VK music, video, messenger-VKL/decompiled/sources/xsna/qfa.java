package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CatalogSectionScreenRepository.kt */
/* loaded from: classes16.dex */
public final class qfa {
    public final o4a a;

    public qfa(o4a o4aVar) {
        this.a = o4aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ofa ofaVar;
        int i;
        if (continuationImpl instanceof ofa) {
            ofaVar = (ofa) continuationImpl;
            int i2 = ofaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ofaVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ofaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ofaVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    pfa pfaVar = new pfa(str, this, null);
                    ofaVar.L$0 = null;
                    ofaVar.label = 1;
                    obj = myc0.k(b, pfaVar, ofaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        ofaVar = new ofa(this, continuationImpl);
        Object obj2 = ofaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ofaVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
