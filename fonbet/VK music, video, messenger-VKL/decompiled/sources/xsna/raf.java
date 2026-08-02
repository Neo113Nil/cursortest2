package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPopularHashtagsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPopularHashtagDto;
import com.vk.clips.upload.model.TrendingHashtagData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsTrendingHashtagsDataSourceImpl.kt */
/* loaded from: classes17.dex */
public final class raf {
    public final bpn0 a = new bpn0(new pr6(5));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[LOOP:1: B:22:0x0083->B:24:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        qaf qafVar;
        int i;
        Iterator it;
        if (continuationImpl instanceof qaf) {
            qafVar = (qaf) continuationImpl;
            int i2 = qafVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qafVar.label = i2 - Integer.MIN_VALUE;
                Object obj = qafVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qafVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(((mgj0) this.a.getValue()).A(null));
                    qafVar.label = 1;
                    obj = evj.p(A, qafVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                List<ShortVideoPopularHashtagDto> d = ((ShortVideoGetPopularHashtagsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : d) {
                    if (((ShortVideoPopularHashtagDto) obj2).e()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ShortVideoPopularHashtagDto shortVideoPopularHashtagDto = (ShortVideoPopularHashtagDto) it.next();
                    arrayList2.add(new TrendingHashtagData(shortVideoPopularHashtagDto.d(), shortVideoPopularHashtagDto.getDescription()));
                }
                return arrayList2;
            }
        }
        qafVar = new qaf(this, continuationImpl);
        Object obj3 = qafVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qafVar.label;
        if (i != 0) {
        }
        List<ShortVideoPopularHashtagDto> d2 = ((ShortVideoGetPopularHashtagsResponseDto) obj3).d();
        ArrayList arrayList3 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(c5g.u(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }
}
