package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoSimilarVideosTitleRedesignDelegate;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.stat.recycler.Measurement;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoDiscoveryAdapter.kt */
/* loaded from: classes7.dex */
public final class kfs0 extends wx3 implements vel0, vic {
    public final izs<AboutVideoItem.a, s3q0> j;
    public final c4 k;
    public final lfs0 l;
    public final com.vk.stat.recycler.c m;
    public final AboutVideoSimilarVideosTitleRedesignDelegate n;
    public final Object o;
    public final List<p1u0<? extends hfz>> p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kfs0(izs izsVar, h7v h7vVar, c4 c4Var, lfs0 lfs0Var, NotificationsPermission notificationsPermission, boolean z, mzn mznVar, t5e0 t5e0Var, y4r0 y4r0Var, hqa0 hqa0Var, wc0 wc0Var, egs0 egs0Var, com.vk.stat.recycler.c cVar, int i) {
        super(new jfs0());
        p1u0 gVar;
        gzs<rcg0> gzsVar = lfs0Var.d;
        boolean z2 = (i & 64) == 0;
        y4r0 y4r0Var2 = (i & 512) != 0 ? null : y4r0Var;
        wzs<VideoFile, String, s3q0> wzsVar = lfs0Var.a;
        this.j = izsVar;
        this.k = c4Var;
        this.l = lfs0Var;
        this.m = cVar;
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a = bVar.a(videoFeatures);
        VideoFeatures videoFeatures2 = VideoFeatures.DISCOVERY_VIDEO_CARD_REDESIGN;
        videoFeatures2.getClass();
        boolean a2 = bVar.a(videoFeatures2);
        AboutVideoSimilarVideosTitleRedesignDelegate aboutVideoSimilarVideosTitleRedesignDelegate = new AboutVideoSimilarVideosTitleRedesignDelegate(z2 ? AboutVideoSimilarVideosTitleRedesignDelegate.Type.TabletLandscapeRedesign : z ? AboutVideoSimilarVideosTitleRedesignDelegate.Type.TabletRedesign : AboutVideoSimilarVideosTitleRedesignDelegate.Type.Default, egs0Var);
        this.n = aboutVideoSimilarVideosTitleRedesignDelegate;
        ku9 ku9Var = new ku9(wzsVar);
        isr isrVar = new isr(wzsVar);
        this.o = msy.a(LazyThreadSafetyMode.NONE, new k0m0(4));
        e31 e31Var = new e31(c4Var, hqa0Var, wc0Var);
        gpp0 gpp0Var = new gpp0(c4Var);
        tg0 tg0Var = new tg0(c4Var, egs0Var);
        if (a) {
            VideoFeatures videoFeatures3 = VideoFeatures.ABOUT_VIDEO_REDESIGN;
            videoFeatures3.getClass();
            if (bVar.a(videoFeatures3)) {
                gVar = new k6(c4Var, mznVar);
                p1u0 p1u0Var = gVar;
                float f = 8;
                p1u0 F = fxc0.B().T().F(iah0.a(f), iah0.a(f), iah0.a(16), v6z.a, new wrl0(this, 16));
                com.vk.libvideo.bottomsheet.about.delegate.d dVar = new com.vk.libvideo.bottomsheet.about.delegate.d(c4Var, egs0Var);
                com.vk.libvideo.bottomsheet.about.delegate.u uVar = new com.vk.libvideo.bottomsheet.about.delegate.u();
                com.vk.libvideo.bottomsheet.about.delegate.t tVar = new com.vk.libvideo.bottomsheet.about.delegate.t(c4Var);
                VideoScreenMode videoScreenMode = VideoScreenMode.PREVIEW;
                List<p1u0<? extends hfz>> I = rl3.I(new p1u0[]{e31Var, gpp0Var, tg0Var, p1u0Var, F, dVar, uVar, tVar, new com.vk.libvideo.bottomsheet.about.delegate.w(c4Var, videoScreenMode), new com.vk.libvideo.bottomsheet.about.delegate.i(true, 5), new com.vk.libvideo.bottomsheet.about.delegate.q(), new com.vk.libvideo.bottomsheet.about.delegate.y(egs0Var), new com.vk.libvideo.bottomsheet.about.delegate.a0(c4Var, true, gsi0.b().c, gzsVar), new com.vk.libvideo.bottomsheet.about.delegate.k(c4Var), aboutVideoSimilarVideosTitleRedesignDelegate, new cd0(egs0Var, izsVar), new com.vk.libvideo.bottomsheet.about.delegate.b(egs0Var), new com.vk.libvideo.bottomsheet.about.delegate.x(c4Var, false, videoScreenMode, gzsVar, mznVar, a2, egs0Var), new wnj0(c4Var, a2, videoScreenMode), new com.vk.libvideo.bottomsheet.about.delegate.z(c4Var, videoScreenMode, gsi0.b().d, gzsVar, mznVar, egs0Var), new unj0(c4Var, a2, videoScreenMode), !a ? new pds0(c4Var, egs0Var) : new qds0(c4Var, egs0Var), new w4(h7vVar, c4Var, notificationsPermission, lfs0Var.c, gzsVar, null, "button", egs0Var, 32), new com.vk.libvideo.bottomsheet.about.delegate.r(c4Var, t5e0Var), new com.vk.libvideo.bottomsheet.about.delegate.e0(y4r0Var2), new atn(new oa5(this, 13)), gsi0.b().c ? new wfs0() : null, gsi0.b().c ? new ofs0() : null, gsi0.b().c ? new ygs0() : null, new n1k0(c4Var), new bgs0(), ku9Var, isrVar});
                this.p = I;
                for (Object obj : I) {
                    if (obj != null) {
                        y0((p1u0) obj);
                    }
                }
            }
        }
        gVar = new com.vk.libvideo.bottomsheet.about.delegate.g(c4Var, mznVar, egs0Var);
        p1u0 p1u0Var2 = gVar;
        float f2 = 8;
        p1u0 F2 = fxc0.B().T().F(iah0.a(f2), iah0.a(f2), iah0.a(16), v6z.a, new wrl0(this, 16));
        com.vk.libvideo.bottomsheet.about.delegate.d dVar2 = new com.vk.libvideo.bottomsheet.about.delegate.d(c4Var, egs0Var);
        com.vk.libvideo.bottomsheet.about.delegate.u uVar2 = new com.vk.libvideo.bottomsheet.about.delegate.u();
        com.vk.libvideo.bottomsheet.about.delegate.t tVar2 = new com.vk.libvideo.bottomsheet.about.delegate.t(c4Var);
        VideoScreenMode videoScreenMode2 = VideoScreenMode.PREVIEW;
        List<p1u0<? extends hfz>> I2 = rl3.I(new p1u0[]{e31Var, gpp0Var, tg0Var, p1u0Var2, F2, dVar2, uVar2, tVar2, new com.vk.libvideo.bottomsheet.about.delegate.w(c4Var, videoScreenMode2), new com.vk.libvideo.bottomsheet.about.delegate.i(true, 5), new com.vk.libvideo.bottomsheet.about.delegate.q(), new com.vk.libvideo.bottomsheet.about.delegate.y(egs0Var), new com.vk.libvideo.bottomsheet.about.delegate.a0(c4Var, true, gsi0.b().c, gzsVar), new com.vk.libvideo.bottomsheet.about.delegate.k(c4Var), aboutVideoSimilarVideosTitleRedesignDelegate, new cd0(egs0Var, izsVar), new com.vk.libvideo.bottomsheet.about.delegate.b(egs0Var), new com.vk.libvideo.bottomsheet.about.delegate.x(c4Var, false, videoScreenMode2, gzsVar, mznVar, a2, egs0Var), new wnj0(c4Var, a2, videoScreenMode2), new com.vk.libvideo.bottomsheet.about.delegate.z(c4Var, videoScreenMode2, gsi0.b().d, gzsVar, mznVar, egs0Var), new unj0(c4Var, a2, videoScreenMode2), !a ? new pds0(c4Var, egs0Var) : new qds0(c4Var, egs0Var), new w4(h7vVar, c4Var, notificationsPermission, lfs0Var.c, gzsVar, null, "button", egs0Var, 32), new com.vk.libvideo.bottomsheet.about.delegate.r(c4Var, t5e0Var), new com.vk.libvideo.bottomsheet.about.delegate.e0(y4r0Var2), new atn(new oa5(this, 13)), gsi0.b().c ? new wfs0() : null, gsi0.b().c ? new ofs0() : null, gsi0.b().c ? new ygs0() : null, new n1k0(c4Var), new bgs0(), ku9Var, isrVar});
        this.p = I2;
        while (r1.hasNext()) {
        }
    }

    public static s3q0 K0(kfs0 kfs0Var, vfz vfzVar, int i, List list) {
        super.onBindViewHolder(vfzVar, i, list);
        return s3q0.a;
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: C0 */
    public final void onBindViewHolder(vfz<hfz> vfzVar, int i, List<Object> list) {
        Measurement.Type type = Measurement.Type.Bind;
        int itemViewType = vfzVar.getItemViewType();
        com.vk.stat.recycler.c cVar = this.m;
        if (cVar == null) {
            K0(this, vfzVar, i, list);
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        K0(this, vfzVar, i, list);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        p1u0 p1u0Var = (p1u0) j5g.b0(itemViewType, this.p);
        cVar.l(new Measurement(itemViewType, type, elapsedRealtimeNanos2, p1u0Var != null ? p1u0Var.getClass().getSimpleName() : null, false));
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: E0 */
    public final vfz onCreateViewHolder(int i, ViewGroup viewGroup) {
        vfz vfzVar;
        fjt0 fjt0Var;
        Measurement.Type type = Measurement.Type.Create;
        boolean z = !i0q0.b();
        com.vk.stat.recycler.c cVar = this.m;
        if (cVar == null) {
            vfzVar = super.onCreateViewHolder(i, viewGroup);
        } else {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            vfz onCreateViewHolder = super.onCreateViewHolder(i, viewGroup);
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            p1u0 p1u0Var = (p1u0) j5g.b0(i, this.p);
            cVar.l(new Measurement(i, type, elapsedRealtimeNanos2, p1u0Var != null ? p1u0Var.getClass().getSimpleName() : null, z));
            vfzVar = onCreateViewHolder;
        }
        View view = vfzVar.itemView;
        djt0 djt0Var = view instanceof djt0 ? (djt0) view : null;
        if (djt0Var != null && (fjt0Var = (fjt0) this.o.getValue()) != null) {
            djt0Var.e.add(fjt0Var.b);
        }
        return vfzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vel0
    public final boolean V(int i) {
        int i2;
        try {
            i2 = getItemViewType(i);
        } catch (Throwable unused) {
            i2 = -1;
        }
        Iterable W0 = j5g.W0(this.p);
        if ((W0 instanceof Collection) && ((Collection) W0).isEmpty()) {
            return false;
        }
        Iterator it = W0.iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                return false;
            }
            xtw xtwVar = (xtw) ztwVar.next();
            int i3 = xtwVar.a;
            p1u0 p1u0Var = (p1u0) xtwVar.b;
            if (epx.f(p1u0Var, this.n) || (p1u0Var instanceof com.vk.libvideo.bottomsheet.about.delegate.i)) {
                if (i3 == i2) {
                    return true;
                }
            }
        }
    }

    @Override // xsna.vel0
    public final void b0(int i, View view) {
        this.n.getClass();
        View findViewById = view.findViewById(R.id.title_separator);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // xsna.wx3, xsna.qul
    public final List<hfz> getItems() {
        return this.h.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView;
        fjt0 fjt0Var = (fjt0) this.o.getValue();
        if (fjt0Var != null) {
            recyclerView.addOnScrollListener(fjt0Var.c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f = null;
        fjt0 fjt0Var = (fjt0) this.o.getValue();
        if (fjt0Var != null) {
            recyclerView.removeOnScrollListener(fjt0Var.c);
            fjt0Var.a = null;
        }
    }

    @Override // xsna.wx3, xsna.qul
    public final void setItems(List<? extends hfz> list) {
        if (list.isEmpty()) {
            this.h.b(null, null);
        } else {
            J0(list, new pod0(this, 26));
        }
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }

    @Override // xsna.vel0
    public final void l(View view) {
    }

    @Override // xsna.vel0
    public final void o(int i, View view) {
    }
}
