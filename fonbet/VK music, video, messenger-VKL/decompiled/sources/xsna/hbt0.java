package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.toggle.data.VideoPlayDelayConfig;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.b0g;
import xsna.bbt0;
import xsna.hbt0;
import xsna.lnt0;

/* compiled from: VideoRecyclerViewHelper.kt */
/* loaded from: classes2.dex */
public final class hbt0 extends RecyclerView.t implements cnt0, f5z {
    public static int C;
    public final bpn0 A;
    public final bpn0 B;
    public final Context b;
    public final ai5 c;
    public final Lifecycle d;
    public final db80 e;
    public final z2a f;
    public final Handler g;
    public final uor0 h;
    public final c i;
    public boolean j;
    public final boolean k;
    public final d2v l;
    public final String m;
    public final a n;
    public final bbt0 o;
    public final dbt0 p;
    public final bpn0 q;
    public final i0z r;
    public int s;
    public int t;
    public final b u;
    public final boolean v;
    public xh5 w;
    public final io.reactivex.rxjava3.disposables.c x;
    public final Object y;
    public final ckm z;

    /* compiled from: VideoRecyclerViewHelper.kt */
    public static final class a {
        public final ai5 a;

        public a(ai5 ai5Var) {
            this.a = ai5Var;
        }
    }

    /* compiled from: VideoRecyclerViewHelper.kt */
    public static final class b {
        public final ai5 a;

        public b(ai5 ai5Var) {
            this.a = ai5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int a(int i) {
            boolean z;
            RecyclerView recyclerView = this.a.getRecyclerView();
            if (recyclerView != null) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null ? linearLayoutManager.h : false) {
                    z = true;
                    if (z) {
                        return i;
                    }
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    return ((adapter != null ? adapter.getItemCount() : 0) - 1) - i;
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    /* compiled from: VideoRecyclerViewHelper.kt */
    public static final class c {
        public static final c a = new c();
    }

    /* compiled from: VideoRecyclerViewHelper.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoRecyclerViewHelper.kt */
    public static final /* synthetic */ class e implements dmp0, g0t {
        public e() {
        }

        @Override // xsna.dmp0
        public final void b() {
            hbt0.this.D();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dmp0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, hbt0.this, hbt0.class, "resumeAutoPlaying", "resumeAutoPlaying()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [xsna.dbt0, xsna.e5z] */
    public hbt0(Context context, ai5 ai5Var, Lifecycle lifecycle, db80 db80Var, vou vouVar, int i) {
        db80Var = (i & 8) != 0 ? new uah0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 15) : db80Var;
        z2a z2aVar = new z2a(context, o25.a());
        Handler handler = new Handler(Looper.getMainLooper());
        uor0 uor0Var = uor0.a;
        int i2 = 1;
        int i3 = 0;
        boolean z = (i & 1024) == 0;
        d2v d2vVar = fxc0.B().N().b ? new d2v(true, false) : new d2v(false, true);
        vouVar = (i & 8192) != 0 ? new vou() : vouVar;
        StringBuilder sb = new StringBuilder("videohelper_");
        int i4 = C;
        C = i4 + 1;
        sb.append(i4);
        String sb2 = sb.toString();
        a aVar = new a(ai5Var);
        bbt0 bbt0Var = new bbt0(ai5Var, db80Var, z, sb2);
        this.b = context;
        this.c = ai5Var;
        this.d = lifecycle;
        this.e = db80Var;
        this.f = z2aVar;
        this.g = handler;
        this.h = uor0Var;
        this.i = c.a;
        this.j = true;
        this.k = z;
        this.l = d2vVar;
        this.m = sb2;
        this.n = aVar;
        this.o = bbt0Var;
        ?? r13 = new androidx.lifecycle.l() { // from class: xsna.dbt0
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                int i5 = hbt0.d.$EnumSwitchMapping$0[event.ordinal()];
                hbt0 hbt0Var = hbt0.this;
                if (i5 == 1) {
                    hbt0Var.l();
                    return;
                }
                if (i5 == 2) {
                    hbt0Var.w();
                } else if (i5 == 3) {
                    hbt0Var.v();
                } else {
                    if (i5 != 4) {
                        return;
                    }
                    hbt0Var.u();
                }
            }
        };
        this.p = r13;
        int i5 = 17;
        this.q = new bpn0(new h6m0(this, i5));
        this.r = new i0z();
        this.s = -1;
        this.t = -1;
        this.u = new b(ai5Var);
        VideoFeatures videoFeatures = VideoFeatures.FIX_AUDIO_AUTOPLAY_START;
        videoFeatures.getClass();
        this.v = com.vk.toggle.b.A.a(videoFeatures);
        this.y = msy.a(LazyThreadSafetyMode.NONE, new ikk0(this, i5));
        this.z = vouVar.g(context, new tbe0(this, 28), new gbt0(this, i3));
        this.A = new bpn0(new z0h0(this, 11));
        this.B = new bpn0(new d8t0(this, i2));
        bbt0Var.e = z2aVar.d();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        b.C1208b.a().v.add(sb2);
        l();
        lifecycle.addObserver(r13);
        io.reactivex.rxjava3.core.q<VideoMinifiedPlayerStateHolder.State> c2 = VideoMinifiedPlayerStateHolder.a.c();
        t9c0 t9c0Var = new t9c0(10, new t3v(24));
        c2.getClass();
        this.x = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(c2, t9c0Var), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new aas0(new qjg0(this, i5), i2));
        b0g b0gVar = b0g.a;
        if (!b0g.b()) {
            b0g.a(new b0g.a() { // from class: xsna.ebt0
                @Override // xsna.b0g.a
                public final void a() {
                    hbt0 hbt0Var = hbt0.this;
                    if (hbt0Var.c.getRecyclerView() != null) {
                        hbt0Var.C(new r0d0(3));
                    }
                }
            });
        }
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        b.a aVar2 = new b.a() { // from class: xsna.fbt0
            @Override // com.vk.libvideo.autoplay.b.a
            public final void a(xh5 xh5Var, xh5 xh5Var2) {
                yg5 yg5Var;
                yg5 yg5Var2;
                bpn0 bpn0Var2 = hbt0.this.B;
                if (xh5Var != null && (yg5Var2 = xh5Var.a) != null) {
                    yg5Var2.T((ibt0) bpn0Var2.getValue());
                }
                if (xh5Var2 == null || (yg5Var = xh5Var2.a) == null) {
                    return;
                }
                yg5Var.f0((ibt0) bpn0Var2.getValue());
            }
        };
        CopyOnWriteArrayList<b.a> copyOnWriteArrayList = a2.o;
        if (copyOnWriteArrayList.contains(aVar2)) {
            return;
        }
        copyOnWriteArrayList.add(aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[LOOP:0: B:7:0x000d->B:12:0x001d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x000c -> B:6:0x000d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer s(xh5 xh5Var, RecyclerView recyclerView) {
        View view;
        Object parent;
        RecyclerView.e0 d2;
        if (xh5Var != null && (d2 = xh5Var.d()) != null) {
            view = d2.itemView;
            while (view != null && view.getParent() != recyclerView) {
                parent = view.getParent();
                if (!(parent instanceof View)) {
                    view = (View) parent;
                }
            }
            if (view != null) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                Integer valueOf = Integer.valueOf(childAdapterPosition);
                if (childAdapterPosition != -1) {
                    return valueOf;
                }
            }
            return null;
        }
        view = null;
        while (view != null) {
            parent = view.getParent();
            if (!(parent instanceof View)) {
            }
        }
        if (view != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0 == (r2 != null ? r2.c() : null)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() {
        com.vk.libvideo.autoplay.a aVar;
        this.g.removeCallbacksAndMessages(null);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (aVar = xh5Var.b) == null || !aVar.a) {
            if (xh5Var != null) {
                VideoTextureView c2 = xh5Var.c();
                xh5 xh5Var2 = this.w;
            }
            xh5 xh5Var3 = this.w;
            yg5 yg5Var = xh5Var3 != null ? xh5Var3.a : null;
            if (yg5Var != null) {
                yg5Var.pause();
            }
        }
        i(null);
        this.o.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0066 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0007, B:5:0x0015, B:7:0x001b, B:9:0x0023, B:11:0x002a, B:14:0x0034, B:16:0x003a, B:19:0x006c, B:24:0x0040, B:26:0x004a, B:28:0x004e, B:30:0x0056, B:32:0x005c, B:34:0x0066, B:35:0x0069), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(xh5 xh5Var) {
        boolean z;
        og0 og0Var;
        com.vk.libvideo.autoplay.a aVar = xh5Var.b;
        Trace.beginSection("VideoRecyclerViewHelper.playAndFocus");
        try {
            o().getClass();
            m(xh5Var);
            yg5 yg5Var = xh5Var.a;
            if (yg5Var == null) {
                Trace.endSection();
                return;
            }
            je0 N0 = yg5Var.N0();
            if (N0 != null && (og0Var = ye0.this.A) != null) {
                z = true;
                if (og0Var.c() && aVar.p == PlayerType.CAROUSEL) {
                    if ((!yg5Var.p0() || this.k || z) && yg5Var.A().T3() && aVar.g) {
                        b0g b0gVar = b0g.a;
                        if (b0g.b() && !yg5Var.J()) {
                            if (!yg5Var.A().C2()) {
                                yg5Var.O();
                            }
                            yg5Var.play();
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                }
            }
            z = false;
            if (!yg5Var.p0()) {
            }
            b0g b0gVar2 = b0g.a;
            if (b0g.b()) {
                if (!yg5Var.A().C2()) {
                }
                yg5Var.play();
            }
            s3q0 s3q0Var2 = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        if (xsna.epx.f(r7 != null ? r7.c() : null, r10.c()) == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(r0d0 r0d0Var) {
        LinearLayoutManager q;
        int v;
        xh5 xh5Var;
        bbt0 bbt0Var;
        Integer s;
        Boolean valueOf;
        SparseArray<yg5> sparseArray;
        int i;
        bbt0.a aVar;
        lnt0.a aVar2;
        yg5 yg5Var;
        boolean z;
        int i2;
        int i3;
        VideoFile A;
        bbt0.a aVar3;
        int a2;
        mnt0 c2;
        com.vk.libvideo.autoplay.a videoConfig;
        boolean z2;
        int i4;
        boolean z3;
        long j;
        ViewParent viewParent;
        VideoAutoPlayDelayType videoAutoPlayDelayType;
        dnt0 q3;
        View view;
        long j2;
        VideoPlayDelayConfig.Type type;
        View view2;
        if (t() || (q = q()) == null || (v = q.v()) == -1) {
            return;
        }
        int x = q.x();
        int abs = v == x ? 1 : Math.abs(v - x) + 1;
        Integer num = r0d0Var.a;
        ai5 ai5Var = this.c;
        if (num == null) {
            xh5Var = this.e.b(ai5Var, v, abs);
        } else {
            int intValue = num.intValue();
            ai5 ai5Var2 = this.n.a;
            int adapterOffset = intValue - ai5Var2.getAdapterOffset();
            RecyclerView recyclerView = ai5Var2.getRecyclerView();
            Object findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(adapterOffset) : null;
            ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
            xh5 b2 = ent0Var != null ? x5t0.b(ent0Var) : null;
            if (b2 == null) {
                int adapterOffset2 = intValue - ai5Var2.getAdapterOffset();
                RecyclerView recyclerView2 = ai5Var2.getRecyclerView();
                RecyclerView.e0 findViewHolderForAdapterPosition2 = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(adapterOffset2) : null;
                y9t0 Eh = ai5Var2.Eh(adapterOffset2);
                yg5 yg5Var2 = Eh != null ? Eh.a : null;
                ent0 ent0Var2 = findViewHolderForAdapterPosition2 instanceof ent0 ? (ent0) findViewHolderForAdapterPosition2 : null;
                mnt0 c3 = ent0Var2 != null ? x5t0.c(ent0Var2) : null;
                xh5Var = c3 != null ? new xh5(yg5Var2, c3.getVideoConfig(), c3.mo407getVideoView(), findViewHolderForAdapterPosition2, null) : null;
            } else {
                xh5Var = b2;
            }
        }
        pro0.a();
        xh5 xh5Var2 = this.w;
        yg5 yg5Var3 = xh5Var2 != null ? xh5Var2.a : null;
        yg5 yg5Var4 = xh5Var != null ? xh5Var.a : null;
        if (epx.f(yg5Var4, yg5Var3)) {
            if ((xh5Var2 != null ? xh5Var2.c() : null) != null) {
            }
            bbt0Var = this.o;
            if (xh5Var != null) {
                yg5 yg5Var5 = xh5Var.a;
                RecyclerView.e0 d2 = xh5Var.d();
                b bVar = this.u;
                if (d2 != null) {
                    bVar.getClass();
                    int adapterPosition = d2.getAdapterPosition();
                    z2 = true;
                    i4 = adapterPosition;
                } else {
                    z2 = true;
                    i4 = 0;
                }
                int a3 = bVar.a(i4);
                if (yg5Var5 != null && yg5Var5.a()) {
                    if (yg5Var5 == yg5Var3) {
                        z3 = !yg5Var5.a();
                    } else if (!yg5Var5.a() || !xh5Var.b.j) {
                        z3 = false;
                    }
                    if (!epx.f(yg5Var4, bbt0Var.g.get(a3)) && yg5Var4 != null) {
                        bbt0Var.a(yg5Var4, a3, -1);
                    }
                    if (z3) {
                        m(xh5Var);
                    } else {
                        RecyclerView recyclerView3 = ai5Var.getRecyclerView();
                        if (recyclerView3 == null) {
                            j2 = 0;
                            j = 0;
                        } else {
                            RecyclerView.e0 d3 = xh5Var.d();
                            j = 0;
                            if (((d3 == null || (view2 = d3.itemView) == null) ? null : view2.getParent()) == ai5Var.getRecyclerView()) {
                                videoAutoPlayDelayType = ai5Var.getVideoAutoPlayDelayType();
                            } else {
                                RecyclerView.e0 d4 = xh5Var.d();
                                if (d4 == null || (view = d4.itemView) == null) {
                                    viewParent = null;
                                } else {
                                    viewParent = view.getParent();
                                    while (viewParent != null && !(viewParent instanceof RecyclerView)) {
                                        viewParent = viewParent.getParent();
                                    }
                                }
                                RecyclerView recyclerView4 = viewParent instanceof RecyclerView ? (RecyclerView) viewParent : null;
                                if (recyclerView4 != null) {
                                    Object findContainingViewHolder = recyclerView3.findContainingViewHolder(recyclerView4);
                                    ent0 ent0Var3 = findContainingViewHolder instanceof ent0 ? (ent0) findContainingViewHolder : null;
                                    videoAutoPlayDelayType = (ent0Var3 == null || (q3 = ent0Var3.q3()) == null) ? null : q3.getVideoAutoPlayDelayType();
                                }
                                j2 = 0;
                            }
                            if (videoAutoPlayDelayType != null) {
                                VideoPlayDelayConfig z4 = com.vk.toggle.d.z();
                                switch (VideoAutoPlayDelayType.a.$EnumSwitchMapping$0[videoAutoPlayDelayType.ordinal()]) {
                                    case 1:
                                        type = VideoPlayDelayConfig.Type.CATALOG;
                                        break;
                                    case 2:
                                        type = VideoPlayDelayConfig.Type.FEED;
                                        break;
                                    case 3:
                                        type = VideoPlayDelayConfig.Type.FEED_RECOMMENDED;
                                        break;
                                    case 4:
                                        type = VideoPlayDelayConfig.Type.WALL;
                                        break;
                                    case 5:
                                        type = VideoPlayDelayConfig.Type.DISCOVER;
                                        break;
                                    case 6:
                                        type = VideoPlayDelayConfig.Type.POST;
                                        break;
                                    case 7:
                                        type = VideoPlayDelayConfig.Type.SEARCH_VIDEO;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                Long l = z4.a.get(type);
                                if (l != null) {
                                    j2 = l.longValue();
                                }
                            }
                            j2 = 0;
                        }
                        if (!r0d0Var.b && yg5Var5 != null) {
                            boolean equals = yg5Var5.equals(xh5Var2 != null ? xh5Var2.a : null);
                            if (j2 > j && !equals && yg5Var5.p0() && ((com.vk.toggle.d.z().b || !yg5Var5.A().C2()) && !yg5Var5.t0() && !yg5Var5.v() && !yg5Var5.A().x5() && !yg5Var5.isPlaying())) {
                                Handler handler = this.g;
                                handler.removeCallbacksAndMessages(null);
                                o().getClass();
                                yg5Var5.G0(z2);
                                handler.postDelayed(new i0(13, this, xh5Var), j2);
                            }
                        }
                        B(xh5Var);
                    }
                }
                z3 = z2;
                if (!epx.f(yg5Var4, bbt0Var.g.get(a3))) {
                    bbt0Var.a(yg5Var4, a3, -1);
                }
                if (z3) {
                }
            }
            if (xh5Var != null) {
                RecyclerView recyclerView5 = ai5Var.getRecyclerView();
                if (recyclerView5 != null) {
                    s(xh5Var, recyclerView5);
                }
                p(xh5Var);
            }
            RecyclerView recyclerView6 = ai5Var.getRecyclerView();
            s = recyclerView6 != null ? null : s(xh5Var, recyclerView6);
            if (s != null) {
                v = s.intValue();
            }
            int i5 = this.s;
            this.s = v;
            Integer p = p(xh5Var);
            int intValue2 = p == null ? p.intValue() : -1;
            int i6 = this.t;
            this.t = intValue2;
            valueOf = (v == i5 || intValue2 != i6) ? i5 != -1 ? Boolean.valueOf(!q.h) : v > i5 ? Boolean.TRUE : intValue2 > i6 ? Boolean.TRUE : Boolean.FALSE : null;
            ai5 ai5Var3 = bbt0Var.a;
            sparseArray = bbt0Var.g;
            if (xh5Var == null) {
                i = 1;
                if (qu5.c().d() <= 1) {
                    return;
                }
            } else {
                i = 1;
            }
            bpn0 bpn0Var = i0q0.a;
            if (sparseArray.size() < bbt0Var.e + i && valueOf == null) {
                valueOf = Boolean.TRUE;
            }
            if (valueOf == null) {
                boolean booleanValue = valueOf.booleanValue();
                int a4 = bbt0Var.b.a(ai5Var3.getRecyclerView(), v, abs);
                i9x q2 = booleanValue ? swe0.q(v, abs + v) : swe0.m(v, (abs + v) - 1);
                int i7 = q2.b;
                int i8 = q2.c;
                int i9 = q2.d;
                if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                    while (true) {
                        y9t0 Eh2 = ai5Var3.Eh(i7);
                        if (Eh2 != null) {
                            ni5 ni5Var = Eh2.b;
                            yg5 yg5Var6 = Eh2.a;
                            if (yg5Var6 != null) {
                                String str = ni5Var.a;
                                if (str == null) {
                                    str = yg5Var6.d0();
                                }
                                String str2 = ni5Var.b;
                                if (str2 == null) {
                                    str2 = yg5Var6.q();
                                }
                                yg5Var6.n0(str, str2, ni5Var.c, yg5Var6.V());
                            }
                        }
                        if (i7 != i8) {
                            i7 += i9;
                        }
                    }
                }
                SparseArray<bbt0.a> sparseArray2 = bbt0Var.h;
                sparseArray2.clear();
                int i10 = bbt0Var.e;
                int itemCount = ai5Var3.getItemCount();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    if (i11 < 20 && a4 >= 0 && a4 < itemCount && i12 < i10) {
                        RecyclerView recyclerView7 = ai5Var3.getRecyclerView();
                        Object findViewHolderForAdapterPosition3 = recyclerView7 != null ? recyclerView7.findViewHolderForAdapterPosition(a4 - ai5Var3.getAdapterOffset()) : null;
                        boolean z5 = findViewHolderForAdapterPosition3 instanceof ent0;
                        ent0 ent0Var4 = z5 ? (ent0) findViewHolderForAdapterPosition3 : null;
                        if (ent0Var4 != null) {
                            dnt0 q32 = ent0Var4.q3();
                            if (q32 instanceof lnt0) {
                                aVar2 = ((lnt0) q32).y4();
                                if (aVar2 != null || (yg5Var = aVar2.a) == null) {
                                    y9t0 Eh3 = ai5Var3.Eh(a4);
                                    yg5Var = Eh3 == null ? Eh3.a : null;
                                }
                                if (yg5Var != null || (A = yg5Var.A()) == null) {
                                    z = booleanValue;
                                    i2 = 1;
                                } else {
                                    z = booleanValue;
                                    i2 = 1;
                                    if (A.T3()) {
                                        if (!yg5Var.equals(xh5Var != null ? xh5Var.a : null)) {
                                            ent0 ent0Var5 = z5 ? (ent0) findViewHolderForAdapterPosition3 : null;
                                            if (ent0Var5 != null && (c2 = x5t0.c(ent0Var5)) != null && (videoConfig = c2.getVideoConfig()) != null) {
                                                yg5Var.a0(videoConfig);
                                            }
                                            y9t0 Eh4 = ai5Var3.Eh(a4);
                                            yg5Var.Y(Eh4 != null ? Eh4.b.a : null);
                                            yg5Var.U();
                                            i12++;
                                            if (aVar2 != null) {
                                                int i14 = aVar2.b;
                                                aVar3 = new bbt0.a(yg5Var, a4, i14);
                                                a2 = i14;
                                                i3 = -1;
                                            } else {
                                                i3 = -1;
                                                aVar3 = new bbt0.a(yg5Var, a4, -1);
                                                a2 = bbt0Var.f.a(a4);
                                            }
                                            sparseArray2.put(a2, aVar3);
                                            a4 += z ? i2 : i3;
                                            booleanValue = z;
                                            i11 = i13;
                                        }
                                    }
                                }
                                i3 = -1;
                                a4 += z ? i2 : i3;
                                booleanValue = z;
                                i11 = i13;
                            }
                        }
                        aVar2 = null;
                        if (aVar2 != null) {
                        }
                        y9t0 Eh32 = ai5Var3.Eh(a4);
                        if (Eh32 == null) {
                        }
                        if (yg5Var != null) {
                        }
                        z = booleanValue;
                        i2 = 1;
                        i3 = -1;
                        a4 += z ? i2 : i3;
                        booleanValue = z;
                        i11 = i13;
                    }
                }
                boolean z6 = booleanValue;
                ArrayList<Integer> arrayList = bbt0Var.i;
                arrayList.clear();
                int i15 = 0;
                while (i15 < sparseArray.size()) {
                    yg5 valueAt = sparseArray.valueAt(i15);
                    int keyAt = sparseArray.keyAt(i15);
                    i15++;
                    if (!epx.f(valueAt, xh5Var != null ? xh5Var.a : null) && ((aVar = sparseArray2.get(keyAt)) == null || aVar.a != valueAt)) {
                        arrayList.add(Integer.valueOf(keyAt));
                    }
                }
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    bbt0Var.b(sparseArray, arrayList.get(i16).intValue());
                }
                ArrayList arrayList2 = new ArrayList(zik0.d(sparseArray2));
                if (z6) {
                    g5g.L(arrayList2, cgg0.b);
                } else {
                    g5g.K(arrayList2);
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    bbt0.a aVar4 = sparseArray2.get(((Number) it.next()).intValue());
                    if (aVar4 != null) {
                        bbt0Var.a(aVar4.a, aVar4.b, aVar4.c);
                    }
                }
                return;
            }
            return;
        }
        if (xh5Var2 != null) {
            z(xh5Var2);
        }
        bbt0Var = this.o;
        if (xh5Var != null) {
        }
        if (xh5Var != null) {
        }
        RecyclerView recyclerView62 = ai5Var.getRecyclerView();
        if (recyclerView62 != null) {
        }
        if (s != null) {
        }
        int i52 = this.s;
        this.s = v;
        Integer p2 = p(xh5Var);
        if (p2 == null) {
        }
        int i62 = this.t;
        this.t = intValue2;
        if (v == i52) {
        }
        ai5 ai5Var32 = bbt0Var.a;
        sparseArray = bbt0Var.g;
        if (xh5Var == null) {
        }
        bpn0 bpn0Var2 = i0q0.a;
        if (sparseArray.size() < bbt0Var.e + i) {
            valueOf = Boolean.TRUE;
        }
        if (valueOf == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() {
        xh5 xh5Var;
        RecyclerView recyclerView;
        int i;
        mnt0 c2;
        xh5 xh5Var2 = this.w;
        yg5 yg5Var = xh5Var2 != null ? xh5Var2.a : null;
        LinearLayoutManager q = q();
        ai5 ai5Var = this.c;
        if (q != null && yg5Var != null) {
            int x = q.x();
            for (int v = q.v(); v <= x; v++) {
                y9t0 Eh = ai5Var.Eh(v);
                yg5 yg5Var2 = Eh != null ? Eh.a : null;
                if (epx.f(yg5Var2, yg5Var)) {
                    RecyclerView recyclerView2 = ai5Var.getRecyclerView();
                    RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(v) : null;
                    ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                    if (ent0Var != null && (c2 = x5t0.c(ent0Var)) != null) {
                        VideoTextureView mo407getVideoView = c2.mo407getVideoView();
                        com.vk.libvideo.autoplay.a videoConfig = c2.getVideoConfig();
                        float a2 = this.h.a(mo407getVideoView);
                        if (mo407getVideoView != null && a2 >= 0.2f) {
                            ni5 ni5Var = Eh.b;
                            String str = ni5Var.a;
                            if (str == null) {
                                str = yg5Var2.d0();
                            }
                            yg5Var2.q0(str);
                            String str2 = ni5Var.b;
                            if (str2 == null) {
                                str2 = yg5Var2.q();
                            }
                            yg5Var2.n0(str, str2, ni5Var.c, yg5Var2.V());
                            xh5Var = new xh5(yg5Var2, videoConfig, mo407getVideoView, findViewHolderForAdapterPosition, null);
                            if ((xh5Var == null ? xh5Var.a : null) != null) {
                                yg5 yg5Var3 = xh5Var.a;
                                yg5 yg5Var4 = xh5Var.a;
                                if (yg5Var3.A().T3() && !yg5Var4.a()) {
                                    RecyclerView.e0 d2 = xh5Var.d();
                                    b bVar = this.u;
                                    if (d2 != null) {
                                        bVar.getClass();
                                        i = d2.getAdapterPosition();
                                    } else {
                                        i = 0;
                                    }
                                    this.o.a(yg5Var4, bVar.a(i), -1);
                                    B(xh5Var);
                                    return;
                                }
                            }
                            pis0 pis0Var = new pis0(this, 6);
                            recyclerView = ai5Var.getRecyclerView();
                            if (recyclerView == null) {
                                bwt0.i(recyclerView, 50L, new hfm0(pis0Var, 16), null);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        xh5Var = null;
        if ((xh5Var == null ? xh5Var.a : null) != null) {
        }
        pis0 pis0Var2 = new pis0(this, 6);
        recyclerView = ai5Var.getRecyclerView();
        if (recyclerView == null) {
        }
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.d;
    }

    @Override // xsna.cnt0
    public final void i(dnt0 dnt0Var) {
        int v;
        int x;
        dnt0 q3;
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        LinearLayoutManager q = q();
        if (q == null || (v = q.v()) > (x = q.x())) {
            return;
        }
        while (true) {
            RecyclerView recyclerView2 = this.c.getRecyclerView();
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(v) : null;
            ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
            if (ent0Var != null && (q3 = ent0Var.q3()) != null) {
                if ((q3 instanceof mnt0) || (q3 instanceof nnt0)) {
                    q3.setVideoFocused(q3 == dnt0Var);
                } else if ((q3 instanceof lnt0) && (recyclerView = ((lnt0) q3).getRecyclerView()) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    x5t0.a(recyclerView, layoutManager, new twi0(8, dnt0Var, ref$BooleanRef));
                    q3.setVideoFocused(ref$BooleanRef.element);
                }
            }
            if (v == x) {
                return;
            } else {
                v++;
            }
        }
    }

    public final void l() {
        RecyclerView recyclerView;
        ci5 r = r();
        RecyclerView recyclerView2 = r.b;
        ai5 ai5Var = this.c;
        if ((recyclerView2 == null || !epx.f(recyclerView2, ai5Var.getRecyclerView())) && (recyclerView = ai5Var.getRecyclerView()) != null) {
            RecyclerView recyclerView3 = r.b;
            if (recyclerView3 != null) {
                recyclerView3.removeOnChildAttachStateChangeListener(r);
            }
            recyclerView.addOnChildAttachStateChangeListener(r);
            r.b = recyclerView;
            recyclerView.addRecyclerListener(r);
        }
    }

    public final void m(xh5 xh5Var) {
        yg5 yg5Var = xh5Var.a;
        if (yg5Var == null || !yg5Var.p0()) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            b.C1208b.a().b(xh5Var);
        }
        VideoTextureView c2 = xh5Var.c();
        if (c2 != null && yg5Var != null) {
            yg5Var.z0(c2, xh5Var.b, xh5Var.d());
        }
        i(xh5Var.b());
        this.w = xh5Var;
    }

    public final void n() {
        if (t()) {
            return;
        }
        C(new r0d0(1));
    }

    public final n1s0 o() {
        return (n1s0) this.A.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        r().onScrollStateChanged(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        r().onScrolled(recyclerView, i, i2);
    }

    public final Integer p(xh5 xh5Var) {
        RecyclerView recyclerView;
        ai5 ai5Var = this.c;
        RecyclerView recyclerView2 = ai5Var.getRecyclerView();
        Integer s = recyclerView2 == null ? null : s(xh5Var, recyclerView2);
        if (s != null) {
            int intValue = s.intValue();
            RecyclerView recyclerView3 = ai5Var.getRecyclerView();
            Object findViewHolderForLayoutPosition = recyclerView3 != null ? recyclerView3.findViewHolderForLayoutPosition(intValue) : null;
            ent0 ent0Var = findViewHolderForLayoutPosition instanceof ent0 ? (ent0) findViewHolderForLayoutPosition : null;
            dnt0 q3 = ent0Var != null ? ent0Var.q3() : null;
            if ((q3 instanceof lnt0) && (recyclerView = ((lnt0) q3).getRecyclerView()) != null) {
                return s(xh5Var, recyclerView);
            }
        }
        return null;
    }

    public final LinearLayoutManager q() {
        RecyclerView recyclerView = this.c.getRecyclerView();
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ci5 r() {
        return (ci5) this.y.getValue();
    }

    public final boolean t() {
        RecyclerView recyclerView;
        if (!this.j && !this.z.e) {
            VideoMinifiedPlayerStateHolder.a.getClass();
            if (!VideoMinifiedPlayerStateHolder.b() && (this.v || ((recyclerView = this.c.getRecyclerView()) != null && recyclerView.isShown()))) {
                xh5 xh5Var = this.w;
                yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
                if (yg5Var == null || !epx.f(bmp0.a, yg5Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        return this.m;
    }

    public final void u() {
        xh5 xh5Var = this.w;
        if (xh5Var != null && !epx.f(rts0.c, xh5Var.a)) {
            z(xh5Var);
        }
        ckm ckmVar = this.z;
        ww50<?> ww50Var = ckmVar.f;
        if (ww50Var != null) {
            ww50Var.c0(ckmVar);
        }
        ckmVar.f = null;
        ai5 ai5Var = this.c;
        RecyclerView recyclerView = ai5Var.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnChildAttachStateChangeListener(r());
        }
        RecyclerView recyclerView2 = ai5Var.getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.removeRecyclerListener(r());
        }
        this.o.c();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        HashSet<String> hashSet = a2.v;
        String str = this.m;
        hashSet.remove(str);
        Iterator<Map.Entry<yg5, Set<String>>> it = a2.w.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<yg5, Set<String>> next = it.next();
            yg5 key = next.getKey();
            Set<String> value = next.getValue();
            if (value.remove(str) && value.isEmpty()) {
                it.remove();
                a2.k(str, key);
            } else if (value.isEmpty()) {
                it.remove();
            }
        }
        io.reactivex.rxjava3.disposables.c cVar = this.x;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d.removeObserver(this.p);
        ci5 r = r();
        for (View view : j5g.O0(r.g)) {
            Object m = r.m(view);
            r.l(view, m instanceof ent0 ? (ent0) m : null);
        }
    }

    public final void v() {
        int v;
        int x;
        cmp0 remove = bmp0.b.b.remove(this);
        if (remove != null) {
            remove.a();
        }
        if (this.j) {
            return;
        }
        this.j = true;
        com.vk.video.focus.api.a aVar = (com.vk.video.focus.api.a) this.q.getValue();
        if (aVar != null) {
            aVar.c(this.r);
        }
        VideoMinifiedPlayerStateHolder.a.getClass();
        if (VideoMinifiedPlayerStateHolder.b()) {
            return;
        }
        A();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        b.C1208b.a().y.c();
        RecyclerView recyclerView = this.c.getRecyclerView();
        LinearLayoutManager q = q();
        if (q == null || (v = q.v()) > (x = q.x())) {
            return;
        }
        while (true) {
            if (recyclerView != null) {
                Object findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
                if (findViewHolderForAdapterPosition != null) {
                    ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                    Object q3 = ent0Var != null ? ent0Var.q3() : null;
                    nnt0 nnt0Var = q3 instanceof nnt0 ? (nnt0) q3 : null;
                    if (nnt0Var != null) {
                        nnt0Var.onPause();
                    }
                }
            }
            if (v == x) {
                return;
            } else {
                v++;
            }
        }
    }

    public final void w() {
        int v;
        int x;
        this.j = false;
        com.vk.video.focus.api.a aVar = (com.vk.video.focus.api.a) this.q.getValue();
        if (aVar != null) {
            aVar.b(this.r);
        }
        if (this.z.e) {
            return;
        }
        VideoMinifiedPlayerStateHolder.a.getClass();
        if (VideoMinifiedPlayerStateHolder.b()) {
            return;
        }
        e eVar = new e();
        if (bmp0.a == null) {
            eVar.b();
        } else {
            sj1 sj1Var = new sj1(new TimeoutException("Locked autoplay await timeout"), 16);
            cmp0 put = bmp0.b.b.put(this, new amp0(sj1Var, eVar));
            if (put != null) {
                put.a();
            }
            bmp0.e.postDelayed(sj1Var, 5000L);
        }
        RecyclerView recyclerView = this.c.getRecyclerView();
        LinearLayoutManager q = q();
        if (q == null || (v = q.v()) > (x = q.x())) {
            return;
        }
        while (true) {
            if (recyclerView != null) {
                Object findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
                if (findViewHolderForAdapterPosition != null) {
                    ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                    Object q3 = ent0Var != null ? ent0Var.q3() : null;
                    nnt0 nnt0Var = q3 instanceof nnt0 ? (nnt0) q3 : null;
                    if (nnt0Var != null) {
                        nnt0Var.onResume();
                    }
                }
            }
            if (v == x) {
                return;
            } else {
                v++;
            }
        }
    }

    public final void x(int i) {
        this.g.removeCallbacksAndMessages(null);
        if (t()) {
            this.o.c();
        } else {
            C(new r0d0(true, Integer.valueOf(i)));
        }
    }

    public final void y() {
        View view;
        View view2;
        ai5 ai5Var = this.c;
        RecyclerView recyclerView = ai5Var.getRecyclerView();
        if (recyclerView == null || recyclerView.getScrollState() != 0) {
            return;
        }
        xh5 xh5Var = this.w;
        bbt0 bbt0Var = this.o;
        if (xh5Var != null) {
            yg5 yg5Var = xh5Var.a;
            RecyclerView.e0 d2 = xh5Var.d();
            RecyclerView.e0 d3 = xh5Var.d();
            if (d3 != null) {
                int absoluteAdapterPosition = d3.getAbsoluteAdapterPosition();
                if (!epx.f(ai5Var.getRecyclerView(), (d2 == null || (view2 = d2.itemView) == null) ? null : view2.getParent())) {
                    ViewParent parent = (d2 == null || (view = d2.itemView) == null) ? null : view.getParent();
                    if (parent instanceof ai5) {
                        ai5Var = (ai5) parent;
                    } else {
                        if (parent instanceof RecyclerView) {
                            Object adapter = ((RecyclerView) parent).getAdapter();
                            if (adapter instanceof ai5) {
                                ai5Var = (ai5) adapter;
                            }
                        }
                        ai5Var = null;
                    }
                }
                if (ai5Var != null) {
                    Integer valueOf = Integer.valueOf(absoluteAdapterPosition);
                    if (absoluteAdapterPosition == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        y9t0 Eh = ai5Var.Eh(valueOf.intValue() - ai5Var.getAdapterOffset());
                        if (!epx.f(Eh != null ? Eh.a : null, yg5Var)) {
                            bbt0Var.getClass();
                            SparseArray sparseArray = new SparseArray();
                            SparseArray<yg5> sparseArray2 = bbt0Var.g;
                            zik0.e(sparseArray, sparseArray2);
                            int size = sparseArray.size();
                            for (int i = 0; i < size; i++) {
                                int keyAt = sparseArray.keyAt(i);
                                if (epx.f((yg5) sparseArray.valueAt(i), yg5Var)) {
                                    bbt0Var.b(sparseArray2, keyAt);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (t()) {
            bbt0Var.c();
        } else {
            C(new r0d0(3));
        }
    }

    public final void z(xh5 xh5Var) {
        if (xh5Var.a == null) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            b.C1208b.a().l(null);
        }
        dnt0 b2 = xh5Var.b();
        if (b2 != null) {
            b2.setVideoFocused(false);
        }
        yg5 yg5Var = xh5Var.a;
        if (yg5Var != null) {
            yg5Var.pause();
        }
        this.w = null;
    }
}
