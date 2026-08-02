package xsna;

import androidx.compose.runtime.internal.AtomicInt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.video.dto.VideoSearchExtendedSortDto;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: BoundTimelineReducer.kt */
/* loaded from: classes3.dex */
public final class u98 implements qq9 {
    public final Object b;
    public final Object c;

    public /* synthetic */ u98(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public s98 a(s98 s98Var, AudioFragment audioFragment) {
        xx4 a;
        csp cspVar = (csp) this.b;
        el4 el4Var = s98Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AudioFragmentItem> list = el4Var.b.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AudioFragmentItem) it.next()).b.b);
        }
        Iterator it2 = j5g.X0(arrayList, el4Var.a).iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            TrackMediaSource trackMediaSource = (TrackMediaSource) pair.d();
            xx4 xx4Var = (xx4) pair.g();
            Object obj = linkedHashMap.get(trackMediaSource);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(trackMediaSource, obj);
            }
            ((Set) obj).add(xx4Var);
        }
        ArrayList arrayList2 = new ArrayList();
        for (AudioFragmentItem audioFragmentItem : audioFragment.b) {
            try {
                cspVar.a("Abort audio source rebinding");
                Set set = (Set) linkedHashMap.get(audioFragmentItem.b.b);
                if (set == null || !(!set.isEmpty())) {
                    a = ((l0h0) this.c).a(audioFragmentItem.b);
                } else {
                    Object X = j5g.X(set);
                    set.remove((xx4) X);
                    a = (xx4) X;
                }
                arrayList2.add(a);
            } catch (Throwable th) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((xx4) it3.next()).release();
                }
                f100 f100Var = cspVar.d;
                if (f100Var != null) {
                    f100Var.a("BoundTimelineReducer", th);
                }
                throw th;
            }
        }
        Iterator it4 = c5g.v(linkedHashMap.values()).iterator();
        while (it4.hasNext()) {
            ((xx4) it4.next()).release();
        }
        return s98.a(s98Var, null, new el4(arrayList2, audioFragment), 5);
    }

    public s98 b(s98 s98Var, List list) {
        Lazy bpn0Var;
        csp cspVar = (csp) this.b;
        List<c7s0> list2 = s98Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c7s0 c7s0Var : list2) {
            MediaSource t = c7s0Var.getLayout().b.t();
            Lazy<tht0> lazy = c7s0Var.a;
            Object obj = linkedHashMap.get(t);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(t, obj);
            }
            ((Set) obj).add(lazy);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoFragment videoFragment = (VideoFragment) it.next();
            try {
                cspVar.a("Abort video fragment rebinding");
                Set set = (Set) linkedHashMap.get(videoFragment.b.t());
                if (set == null || !(!set.isEmpty())) {
                    bpn0Var = new bpn0(new com.vk.catalog2.common.ui.holders.b(3, this, videoFragment));
                } else {
                    Object X = j5g.X(set);
                    set.remove((Lazy) X);
                    bpn0Var = (Lazy) X;
                }
                arrayList.add(new gyy(bpn0Var, videoFragment));
            } catch (Throwable th) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((c7s0) it2.next()).release();
                }
                f100 f100Var = cspVar.d;
                if (f100Var != null) {
                    f100Var.a("BoundTimelineReducer", th);
                }
                throw th;
            }
        }
        ArrayList v = c5g.v(linkedHashMap.values());
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = v.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((Lazy) next).isInitialized()) {
                arrayList2.add(next);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((tht0) ((Lazy) it4.next()).getValue()).release();
        }
        return s98.a(s98Var, arrayList, null, 6);
    }

    public s98 c(s98 s98Var, Timeline timeline) {
        try {
            return b(a(s98Var, timeline.c), timeline.b);
        } catch (Throwable th) {
            s98Var.b();
            f100 f100Var = ((csp) this.b).d;
            if (f100Var != null) {
                f100Var.a("BoundTimelineReducer", th);
            }
            throw th;
        }
    }

    @Override // xsna.qq9
    public void cancel() {
        if (((AtomicInt) this.c).compareAndSet(1, 1)) {
            return;
        }
        ((fu5) this.b).invoke();
    }

    public io.reactivex.rxjava3.internal.operators.single.y d(CharSequence charSequence, Integer num, int i, boolean z, boolean z2, int i2) {
        uft0 uft0Var = (uft0) this.b;
        String obj = charSequence.toString();
        VideoSearchExtendedSortDto videoSearchExtendedSortDto = i != 1 ? i != 2 ? VideoSearchExtendedSortDto.DATE_ADDED : VideoSearchExtendedSortDto.RELEVANCE : VideoSearchExtendedSortDto.DURATION;
        Integer valueOf = i2 > 0 ? Integer.valueOf(i2) : null;
        Integer valueOf2 = i2 < 0 ? Integer.valueOf(Math.abs(i2)) : null;
        Integer valueOf3 = Integer.valueOf(z ? 1 : 0);
        Boolean valueOf4 = Boolean.valueOf(z2);
        Integer num2 = 20;
        uft0Var.getClass();
        tfx tfxVar = new tfx("video.search", new qft0(), new lft0());
        if (obj != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, obj, 0, 0, 12);
        }
        if (videoSearchExtendedSortDto != null) {
            tfx.l(tfxVar, "sort", videoSearchExtendedSortDto.i(), 0, 0, 12);
        }
        tfx.l(tfxVar, "hd", valueOf3.intValue(), 0, 0, 12);
        tfxVar.j("live", valueOf4.booleanValue());
        tfxVar.j("ugc_only", true);
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        if (valueOf != null) {
            tfx.l(tfxVar, "longer", valueOf.intValue(), 0, 0, 8);
        }
        if (valueOf2 != null) {
            tfx.l(tfxVar, "shorter", valueOf2.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 200, "count");
        tfxVar.j("extended", true);
        tfxVar.j("united_video_only", true);
        return rsg0.w0(yfb.x(tfxVar)).l(new i3u(new ptl0(this, 24), 27));
    }

    public u98(fu5 fu5Var) {
        this.b = fu5Var;
        this.c = new AtomicInt(0);
    }
}
