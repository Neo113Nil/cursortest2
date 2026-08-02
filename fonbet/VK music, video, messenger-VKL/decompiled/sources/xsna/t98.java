package xsna;

import com.google.gson.JsonIOException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.music.offline.api.model.CorruptedReason;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: BoundTimelineFactory.kt */
/* loaded from: classes3.dex */
public final class t98 implements jp70, iy3, nou, d3f0, xq2 {
    public final Object b;

    public /* synthetic */ t98(Object obj) {
        this.b = obj;
    }

    @Override // xsna.d3f0
    public void a(gii0 gii0Var) {
        if (gii0Var.c.a) {
            io.reactivex.rxjava3.core.a b = fsk.c.b(InAppReviewConditionKey.LIKE_3_MORE_POSTS, jgp.b);
            int i = kwg0.a;
            itg0.c(b.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new hwg0()), ((mxq0) this.b).b);
        }
    }

    @Override // xsna.iy3
    /* renamed from: apply */
    public ugz mo416apply(Object obj) {
        return r0t.d(((f0t) this.b).apply(obj));
    }

    public Pair b(AudioFragment audioFragment, l0h0 l0h0Var) {
        List<AudioFragmentItem> list = audioFragment.b;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        try {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((AudioFragmentItem) obj).b.f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    arrayList3.add(obj);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                AudioFragmentItem audioFragmentItem = (AudioFragmentItem) it.next();
                ((csp) this.b).a("Abort audio fragment binding");
                arrayList.add(l0h0Var.a(audioFragmentItem.b));
                arrayList2.add(audioFragmentItem);
            }
            List<AudioFragmentItem> list2 = list;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((AudioFragmentItem) it2.next()).b.f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z = true;
                        break;
                    }
                }
            }
            return new Pair(new el4(arrayList, new AudioFragment(arrayList2, audioFragment.c, audioFragment.d)), Boolean.valueOf(z));
        } catch (Throwable th) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((k0h0) it3.next()).release();
            }
            throw th;
        }
    }

    @Override // xsna.nou
    public Iterator c() {
        return ((Iterable) this.b).iterator();
    }

    public s98 d(Timeline timeline, l0h0 l0h0Var) {
        csp cspVar = (csp) this.b;
        long currentTimeMillis = System.currentTimeMillis();
        List<VideoFragment> list = timeline.b;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                try {
                    Pair b = b(timeline.c, l0h0Var);
                    el4 el4Var = (el4) b.d();
                    boolean booleanValue = ((Boolean) b.g()).booleanValue();
                    f100 f100Var = cspVar.d;
                    if (f100Var != null) {
                        f100Var.d("BoundTimelineFactory", "timeline binding took " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                    }
                    return new s98(Collections.unmodifiableList(arrayList), el4Var, booleanValue);
                } finally {
                }
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            VideoFragment videoFragment = (VideoFragment) next;
            boolean z = i == 0;
            try {
                cspVar.a("Abort video fragment binding");
                bpn0 bpn0Var = new bpn0(new fk(1, l0h0Var, videoFragment));
                arrayList.add(!z ? new gyy(bpn0Var, videoFragment) : new kql(bpn0Var, videoFragment));
                i = i2;
            } finally {
            }
        }
    }

    @Override // xsna.nou
    public Object e(Object obj) {
        return (CorruptedReason) obj;
    }

    @Override // xsna.xq2
    public aqr get(int i) {
        return ((nqr[]) this.b)[i];
    }

    @Override // xsna.jp70
    public Object h() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    public t98(q5f q5fVar, enh enhVar) {
        this.b = enhVar;
    }

    public t98(float f, float f2, wq2 wq2Var) {
        int b = wq2Var.b();
        nqr[] nqrVarArr = new nqr[b];
        for (int i = 0; i < b; i++) {
            nqrVarArr[i] = new nqr(f, f2, wq2Var.a(i));
        }
        this.b = nqrVarArr;
    }
}
