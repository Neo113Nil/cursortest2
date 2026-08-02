package xsna;

import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.k0h0;

/* compiled from: VideoTimelineReader.kt */
/* loaded from: classes3.dex */
public final class dkt0 {
    public final b a;
    public final izs<List<? extends c7s0>, s3q0> b;
    public boolean c;
    public List<? extends c7s0> d;
    public int e;
    public volatile a f;
    public volatile Object g;
    public final f100 h;

    /* compiled from: VideoTimelineReader.kt */
    public static final class a {
        public final int a;
        public final c7s0 b;
        public boolean c;
        public volatile VideoItem d;
        public final tht0 e;
        public k0h0.b f;
        public final ult0 g;

        public a(int i, c7s0 c7s0Var) {
            this.a = i;
            this.b = c7s0Var;
            this.d = c7s0Var.getLayout().b;
            tht0 a = c7s0Var.a();
            this.e = a;
            k0h0.a.getClass();
            this.f = k0h0.a.b;
            this.g = new ult0(a);
        }

        public final boolean a() {
            k0h0.b bVar;
            k0h0.b bVar2;
            if (!this.c) {
                ult0 ult0Var = this.g;
                tht0 tht0Var = ult0Var.a;
                if (ult0Var.b) {
                    bVar = null;
                } else {
                    k0h0.b g = tht0Var.g();
                    ult0Var.b = g == null || !tht0Var.i();
                    bVar = g;
                }
                if (bVar == null) {
                    k0h0.a.getClass();
                    bVar2 = k0h0.a.b;
                } else {
                    bVar2 = bVar;
                }
                this.f = bVar2;
                boolean z = bVar == null;
                this.c = z;
                if (!z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: VideoTimelineReader.kt */
    public interface b {
        void a();

        void b(tht0 tht0Var, k0h0.b bVar);

        void c(VideoEffect videoEffect);

        void d(c7s0 c7s0Var);

        void e(c7s0 c7s0Var, VideoItem videoItem, tht0 tht0Var, int i);
    }

    /* compiled from: VideoTimelineReader.kt */
    public static final class c {
        public final VideoEffect a;
        public final long b;
        public final long c;

        public c(VideoEffect videoEffect, long j, long j2) {
            this.a = videoEffect;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimeBoundedVideoEffects(videoEffects=");
            sb.append(this.a);
            sb.append(", startMcs=");
            sb.append(this.b);
            sb.append(", endMcs=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dkt0(csp cspVar, List<? extends c7s0> list, b bVar, izs<? super List<? extends c7s0>, s3q0> izsVar) {
        this.a = bVar;
        this.b = izsVar;
        EmptyList emptyList = EmptyList.b;
        this.d = emptyList;
        this.g = emptyList;
        f100 f100Var = cspVar.d;
        this.h = f100Var;
        b(list);
        if (f100Var != null) {
            f100Var.d("VideoTimelineReader", "create video timeline reader");
        }
    }

    public final void a() {
        a aVar = null;
        if (!this.c) {
            a aVar2 = this.f;
            if (aVar2 != null && !aVar2.c) {
                aVar = aVar2;
            } else if (aVar2 != null && aVar2.a < this.e) {
                this.a.d(aVar2.b);
                int i = aVar2.a + 1;
                c7s0 c7s0Var = this.d.get(i);
                aVar = new a(i, c7s0Var);
                this.f = aVar;
                this.a.e(c7s0Var, aVar.d, aVar.e, i);
            } else if (aVar2 == null) {
                c7s0 c7s0Var2 = this.d.get(0);
                aVar = new a(0, c7s0Var2);
                this.f = aVar;
                this.a.e(c7s0Var2, aVar.d, aVar.e, 0);
            } else {
                this.f = null;
                this.c = true;
                this.a.d(aVar2.b);
                this.a.a();
            }
        }
        if (aVar != null && aVar.a()) {
            this.a.b(aVar.e, aVar.f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0145 A[LOOP:0: B:6:0x013f->B:8:0x0145, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(List<? extends c7s0> list) {
        boolean z;
        List<? extends c7s0> list2;
        List<? extends c7s0> list3;
        Iterator<T> it;
        boolean z2 = true;
        if (!list.isEmpty()) {
            List<? extends c7s0> list4 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(((c7s0) it2.next()).getLayout());
            }
            Iterator it3 = arrayList.iterator();
            long j = 0;
            while (it3.hasNext()) {
                VideoFragment videoFragment = (VideoFragment) it3.next();
                if (videoFragment.c != j) {
                    f100 f100Var = this.h;
                    if (f100Var != null) {
                        f100Var.b(new IllegalStateException("The sequence of fragments is not continuous: " + j5g.g0(list4, null, null, null, 0, null, 63)), "VideoTimelineReader");
                    }
                    list2 = list;
                } else {
                    j += videoFragment.d();
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Lazy<tht0> lazy = ((c7s0) j5g.Y(list)).a;
            VideoFragment layout = ((c7s0) j5g.Y(list)).getLayout();
            for (c7s0 c7s0Var : list.subList(1, list.size())) {
                VideoItem videoItem = c7s0Var.getLayout().b;
                VideoItem videoItem2 = layout.b;
                if (videoItem2.z() == videoItem.z() && epx.f(videoItem2.t(), videoItem.t()) && videoItem2.W0() == videoItem.O0()) {
                    VideoItem videoItem3 = layout.b;
                    z = z2;
                    layout = new VideoFragment(videoItem3.A3(videoItem3.O0(), videoItem.W0()), layout.c, videoItem.j4() + layout.d);
                } else {
                    z = z2;
                    arrayList2.add(new gyy(lazy, layout));
                    lazy = c7s0Var.a;
                    layout = c7s0Var.getLayout();
                }
                z2 = z;
            }
            arrayList2.add(new gyy(lazy, layout));
            list3 = arrayList2;
            this.d = list3;
            this.e = list3.size() - 1;
            List<? extends c7s0> list5 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                VideoFragment layout2 = ((c7s0) it.next()).getLayout();
                arrayList3.add(new c(layout2.b.X8(), layout2.c, layout2.d));
            }
            this.g = arrayList3;
            this.b.invoke(this.d);
        }
        list2 = EmptyList.b;
        list3 = list2;
        this.d = list3;
        this.e = list3.size() - 1;
        List<? extends c7s0> list52 = list;
        ArrayList arrayList32 = new ArrayList(c5g.u(list52, 10));
        it = list52.iterator();
        while (it.hasNext()) {
        }
        this.g = arrayList32;
        this.b.invoke(this.d);
    }
}
