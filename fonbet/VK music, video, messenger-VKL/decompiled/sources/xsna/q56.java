package xsna;

import android.media.MediaFormat;
import android.util.SparseArray;
import com.vk.media.pipeline.model.effect.AudioEffect;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import java.util.List;
import java.util.function.Function;
import xsna.py4;

/* compiled from: BaseAudioTimelineEventHandler.kt */
/* loaded from: classes3.dex */
public abstract class q56 implements py4.b {
    public final csp a;
    public final lzf b;
    public final d80 c;

    public q56(csp cspVar, lzf lzfVar, d80 d80Var) {
        this.a = cspVar;
        this.b = lzfVar;
        this.c = d80Var;
    }

    @Override // xsna.py4.b
    public void d(el4 el4Var, List<AudioFragmentItem> list, List<? extends xx4> list2) {
        List<AudioFragmentItem> list3 = list;
        AudioFragment audioFragment = el4Var.b;
        long j = audioFragment.d;
        long j2 = audioFragment.c;
        csp cspVar = this.a;
        f100 f100Var = cspVar.d;
        if (f100Var != null) {
            f100Var.d("DefaultAudioTimelineEventHandler", vu5.a(']', j, fp.b(j2, "ATTACH [", ", ")));
        }
        f8l<qm4> f8lVar = new f8l<>(cspVar.c, cspVar.d, "DefaultAudioTimelineEventHandler", new Function() { // from class: xsna.p56
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return q56.this.b.a((MediaFormat) obj);
            }
        });
        SparseArray<kz4> sparseArray = new SparseArray<>();
        int size = list3.size();
        int i = 0;
        while (true) {
            d80 d80Var = this.c;
            if (i >= size) {
                e(cspVar, f8lVar, sparseArray, d80Var);
                return;
            }
            AudioItem audioItem = list3.get(i).b;
            int m = list2.get(i).m();
            AudioFragmentItem audioFragmentItem = list3.get(i);
            xx4 xx4Var = list2.get(i);
            long j3 = j;
            AudioItem audioItem2 = audioFragmentItem.b;
            long j4 = j2;
            f8l<qm4> f8lVar2 = f8lVar;
            sparseArray.put(m, new kz4(audioFragmentItem.c, audioItem2.c, Math.min(xx4Var.f(), Math.min(audioItem2.d, audioItem2.c + ((long) (audioItem2.e * ((j3 - j2) - r5))))), audioItem2.f, audioItem2.e, audioItem2.g, xx4Var instanceof rmj0));
            if (d80Var != null) {
                int m2 = list2.get(i).m();
                AudioEffect audioEffect = audioItem.g;
                SparseArray sparseArray2 = (SparseArray) d80Var.b;
                if (audioEffect != AudioEffect.DEFAULT) {
                    if (sparseArray2.indexOfKey(m2) >= 0) {
                        ((gn4) sparseArray2.get(m2)).d = audioEffect;
                    } else {
                        gn4 gn4Var = new gn4();
                        gn4Var.d = audioEffect;
                        sparseArray2.put(m2, gn4Var);
                    }
                }
            }
            i++;
            f8lVar = f8lVar2;
            list3 = list;
            j = j3;
            j2 = j4;
        }
    }

    public abstract void e(csp cspVar, f8l<qm4> f8lVar, SparseArray<kz4> sparseArray, d80 d80Var);

    @Override // xsna.py4.b
    public void a(long j) {
    }
}
