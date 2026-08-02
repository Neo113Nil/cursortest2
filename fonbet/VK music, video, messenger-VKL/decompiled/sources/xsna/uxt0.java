package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ViewHolderDelegateBuilder.kt */
/* loaded from: classes17.dex */
public final class uxt0 implements ClipFeedAdapter.a {
    public final ClipsScreenPerformanceReporter A;
    public final pke B;
    public final pke C;
    public final enf D;
    public final lxc E;
    public final mxc F;
    public final nxc G;
    public final h5 H;
    public final com.vk.movika.sdk.base.observable.p I;
    public final s16 J;
    public final p16 K;
    public final p8e L;
    public final z5e M;
    public final y5e N;
    public final wie O;
    public final v5e P;
    public WeakReference<s1d> Q;
    public p0d R;
    public WeakReference<iy0> S;
    public kw0 T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final defpackage.h a;
    public final Object a0;
    public final pb b;
    public final Object b0;
    public final int c;
    public final emi c0;
    public final h3d d;
    public final Object d0;
    public final wmf e;
    public final eul0 e0;
    public final lyc f;
    public final x1c0 f0;
    public final BridgeComponent g;
    public final pih0 h;
    public final hme i;
    public final kxc j;
    public final gxp0 k;
    public final yux l;
    public final yux m;
    public final yjc n;
    public final hfq o;
    public final ClipsViewerComponentImpl p;
    public final ClipsViewersSdkComponentImpl q;
    public final ki0 r;
    public final pi0 s;
    public final zof t;
    public final w8 u;
    public final njd v;
    public final RecyclerView.u w;
    public final e5 x;
    public final sz00 y;
    public final ntd0 z;

    /* compiled from: ViewHolderDelegateBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedAdapter.ViewType.values().length];
            try {
                iArr[ClipFeedAdapter.ViewType.CLIP_CONTROLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.ADS_CONTROLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.ADS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.STATIC_ADS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.MARKET_ADS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.MUSIC_TEMPLATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.LIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.BLOCK_EXTERNAL_NPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.PAGINATION_LOADING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.PAGINATION_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.PAGINATION_EMPTY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ClipFeedAdapter.ViewType.SHOPS_GRID_BLOCK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uxt0(defpackage.h hVar, pb pbVar, int i, h3d h3dVar, wmf wmfVar, lyc lycVar, BridgeComponent bridgeComponent, pih0 pih0Var, hme hmeVar, kxc kxcVar, gxp0 gxp0Var, yux yuxVar, yux yuxVar2, yjc yjcVar, hfq hfqVar, ClipsViewerComponentImpl clipsViewerComponentImpl, ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl, ki0 ki0Var, pi0 pi0Var, zof zofVar, w8 w8Var, njd njdVar, RecyclerView.u uVar, e5 e5Var, sz00 sz00Var, ntd0 ntd0Var, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, pke pkeVar, pke pkeVar2, enf enfVar, lxc lxcVar, mxc mxcVar, nxc nxcVar, h5 h5Var, com.vk.movika.sdk.base.observable.p pVar, s16 s16Var, p16 p16Var, p8e p8eVar, z5e z5eVar, y5e y5eVar, wie wieVar, v5e v5eVar) {
        this.a = hVar;
        this.b = pbVar;
        this.c = i;
        this.d = h3dVar;
        this.e = wmfVar;
        this.f = lycVar;
        this.g = bridgeComponent;
        this.h = pih0Var;
        this.i = hmeVar;
        this.j = kxcVar;
        this.k = gxp0Var;
        this.l = yuxVar;
        this.m = yuxVar2;
        this.n = yjcVar;
        this.o = hfqVar;
        this.p = clipsViewerComponentImpl;
        this.q = clipsViewersSdkComponentImpl;
        this.r = ki0Var;
        this.s = pi0Var;
        this.t = zofVar;
        this.u = w8Var;
        this.v = njdVar;
        this.w = uVar;
        this.x = e5Var;
        this.y = sz00Var;
        this.z = ntd0Var;
        this.A = clipsScreenPerformanceReporter;
        this.B = pkeVar;
        this.C = pkeVar2;
        this.D = enfVar;
        this.E = lxcVar;
        this.F = mxcVar;
        this.G = nxcVar;
        this.H = h5Var;
        this.I = pVar;
        this.J = s16Var;
        this.K = p16Var;
        this.L = p8eVar;
        this.M = z5eVar;
        this.N = y5eVar;
        this.O = wieVar;
        this.P = v5eVar;
        pis0 pis0Var = new pis0(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, pis0Var);
        this.V = msy.a(lazyThreadSafetyMode, new iml0(this, 21));
        this.W = msy.a(lazyThreadSafetyMode, new ofc0(this, 29));
        this.X = msy.a(lazyThreadSafetyMode, new rrn0(this, 24));
        this.Y = msy.a(lazyThreadSafetyMode, new kcj0(this, 25));
        this.Z = msy.a(lazyThreadSafetyMode, new l6n0(this, 19));
        this.a0 = msy.a(lazyThreadSafetyMode, new w2j0(this, 21));
        this.b0 = msy.a(lazyThreadSafetyMode, new pkd0(12));
        this.c0 = new emi(16);
        this.d0 = msy.a(lazyThreadSafetyMode, new ksq0(this, 12));
        this.e0 = new eul0(6);
        this.f0 = new x1c0(16);
    }

    @Override // com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter.a
    public final void a(RecyclerView.e0 e0Var) {
        if (e0Var instanceof p0d) {
            WeakReference<s1d> weakReference = this.Q;
            s1d s1dVar = weakReference != null ? weakReference.get() : null;
            if (s1dVar == null) {
                this.R = (p0d) e0Var;
                return;
            } else {
                s1dVar.o.setControlsView(e0Var.itemView);
                return;
            }
        }
        if (e0Var instanceof kw0) {
            WeakReference<iy0> weakReference2 = this.S;
            iy0 iy0Var = weakReference2 != null ? weakReference2.get() : null;
            if (iy0Var == null) {
                this.T = (kw0) e0Var;
            } else {
                iy0Var.p.setControlsView(e0Var.itemView);
            }
        }
    }

    @Override // com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter.a
    public final izs<ViewGroup, vfz<? extends FeedItem>> b(ClipFeedAdapter.ViewType viewType) {
        switch (a.$EnumSwitchMapping$0[viewType.ordinal()]) {
            case 1:
                return new exi0(this, 28);
            case 2:
                return new gib0(this, 28);
            case 3:
                return new k7l0(this, 23);
            case 4:
                return new tzq0(this, 5);
            case 5:
                return new qzl0(this, 15);
            case 6:
                return new olt0(this, 1);
            case 7:
                return new lyl0(this, 15);
            case 8:
                return new xka0(this, 26);
            case 9:
                return new hij0(this, 19);
            case 10:
                return new n1g0(12);
            case 11:
                return new qhg0(this, 26);
            case 12:
                return new lir0(6);
            case 13:
                return new r9c0(this, 22);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
