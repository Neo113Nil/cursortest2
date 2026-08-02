package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GamesCatalogPagingInteractor.kt */
/* loaded from: classes17.dex */
public final class ddt {
    public final kdt a;

    public ddt(kdt kdtVar) {
        this.a = kdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(GamesCatalogScreenTab gamesCatalogScreenTab, int i, boolean z, ContinuationImpl continuationImpl) {
        cdt cdtVar;
        int i2;
        if (continuationImpl instanceof cdt) {
            cdtVar = (cdt) continuationImpl;
            int i3 = cdtVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cdtVar.label = i3 - Integer.MIN_VALUE;
                Object obj = cdtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cdtVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    cdtVar.L$0 = null;
                    cdtVar.I$0 = i;
                    cdtVar.Z$0 = z;
                    cdtVar.label = 1;
                    obj = this.a.e(gamesCatalogScreenTab, i, z, cdtVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return (adt) obj;
            }
        }
        cdtVar = new cdt(this, continuationImpl);
        Object obj2 = cdtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cdtVar.label;
        if (i2 != 0) {
        }
        return (adt) obj2;
    }
}
