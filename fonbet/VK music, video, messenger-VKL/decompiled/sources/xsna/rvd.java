package xsna;

import com.vk.clips.upload.model.TrendingHashtagData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsEditTrendingHashtagsHandlerVk.kt */
/* loaded from: classes16.dex */
public final class rvd implements cuc {
    public final com.vk.clips.upload.vk.ui.api.a a;

    public rvd(com.vk.clips.upload.vk.ui.api.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[LOOP:0: B:11:0x004e->B:13:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cuc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        qvd qvdVar;
        int i;
        Iterator it;
        if (continuationImpl instanceof qvd) {
            qvdVar = (qvd) continuationImpl;
            int i2 = qvdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qvdVar.label = i2 - Integer.MIN_VALUE;
                Object obj = qvdVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qvdVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qvdVar.label = 1;
                    obj = this.a.a(qvdVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TrendingHashtagData) it.next()).b);
                }
                return arrayList;
            }
        }
        qvdVar = new qvd(this, continuationImpl);
        Object obj2 = qvdVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qvdVar.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
