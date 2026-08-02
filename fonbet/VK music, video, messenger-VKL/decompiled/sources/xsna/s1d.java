package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.nlh0;

/* compiled from: ClipItemMviViewHolder.kt */
/* loaded from: classes17.dex */
public final class s1d extends vfz<FeedItem.f> implements pi5, t1b0, e9d, z8e, w4r {
    public static final /* synthetic */ int v = 0;
    public final gxp0 l;
    public final zof m;
    public final xod n;
    public final o1d o;
    public boolean p;
    public final Object q;
    public final Object r;
    public final k0d s;
    public final b t;
    public FeedItem.f u;

    /* compiled from: ClipItemMviViewHolder.kt */
    public static final class a {

        /* compiled from: ClipItemMviViewHolder.kt */
        /* renamed from: xsna.s1d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3648a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SdkSubtitlesConfigurationMode.values().length];
                try {
                    iArr[SdkSubtitlesConfigurationMode.ALWAYS_ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SdkSubtitlesConfigurationMode.ALWAYS_DISABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final com.vk.libvideo.autoplay.a a(y0r y0rVar, SdkSubtitlesConfigurationMode sdkSubtitlesConfigurationMode) {
            SubtitlesConfigurationMode subtitlesConfigurationMode;
            int i = s1d.v;
            int i2 = C3648a.$EnumSwitchMapping$0[sdkSubtitlesConfigurationMode.ordinal()];
            if (i2 == 1) {
                subtitlesConfigurationMode = SubtitlesConfigurationMode.ALWAYS_ENABLED;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                subtitlesConfigurationMode = SubtitlesConfigurationMode.ALWAYS_DISABLED;
            }
            return eds0.a(y0rVar, subtitlesConfigurationMode, true);
        }
    }

    /* compiled from: ClipItemMviViewHolder.kt */
    public final class b implements nlh0.a {
        public b() {
        }

        @Override // xsna.nlh0.a
        public final void A1(SdkVideoFile sdkVideoFile, List<? extends olh0> list) {
            s1d s1dVar = s1d.this;
            FeedItem.f fVar = s1dVar.u;
            if (fVar != null) {
                s1dVar.h6(FeedItem.f.a(fVar, (SdkClipVideoFile) sdkVideoFile, null, null, 2039));
            }
        }

        @Override // xsna.nlh0.a
        public final void L2(boolean z) {
            s1d.this.o.x0.a(new ClipItemViewEvent.c(z));
        }
    }

    public s1d() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s1d(Context context, r0d r0dVar, h3d h3dVar, lyc lycVar, pih0 pih0Var, z0q z0qVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, int i, ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl, njd njdVar, kxc kxcVar, gxp0 gxp0Var, yux yuxVar, e5 e5Var, BridgeComponent bridgeComponent, zof zofVar, ibr0 ibr0Var, RecyclerView.u uVar, sz00 sz00Var, ntd0 ntd0Var, pb pbVar, boolean z, yjc yjcVar, enf enfVar, lxc lxcVar, nxc nxcVar, com.vk.movika.sdk.base.observable.p pVar, h5 h5Var, s16 s16Var, p16 p16Var, p8e p8eVar, vxt0 vxt0Var, q0s0 q0s0Var, xlq0 xlq0Var, m900 m900Var, wie wieVar, rnd rndVar, v5e v5eVar, eul0 eul0Var) {
        super(r2);
        o1d o1dVar = new o1d(context, r0dVar, pih0Var, z0qVar, clipsScreenPerformanceReporter, h3dVar, lycVar, i, clipsViewersSdkComponentImpl, njdVar, kxcVar, gxp0Var, yuxVar, e5Var, new q1d(), new r1d(0), bridgeComponent, zofVar, ibr0Var, uVar, sz00Var, ntd0Var, pbVar, z, yjcVar, lxcVar, nxcVar, pVar, h5Var, s16Var, p16Var, enfVar, new ptc0(), p8eVar, vxt0Var, q0s0Var, xlq0Var, m900Var, wieVar, rndVar, v5eVar, eul0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(o1dVar);
        this.l = gxp0Var;
        this.m = zofVar;
        this.n = ibr0Var;
        this.o = o1dVar;
        rj1 rj1Var = new rj1(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, rj1Var);
        this.r = msy.a(lazyThreadSafetyMode, new no(this, 21));
        this.s = o1dVar.getBadgeEventHandler();
        this.t = new b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.e9d
    public final g64 D4() {
        return (g64) this.r.getValue();
    }

    @Override // xsna.w4r
    public final void E0() {
        this.o.x0.a(ClipItemViewEvent.FeedEnterTransitionAnimation.START);
    }

    @Override // xsna.z8e
    public final List<View> N0() {
        return this.o.getFastFadeViews();
    }

    @Override // xsna.w4r
    public final void O() {
        this.o.x0.a(ClipItemViewEvent.FeedEnterTransitionAnimation.FINISH);
    }

    @Override // xsna.vfz
    public final void V5() {
        o1d o1dVar = this.o;
        o1dVar.K();
        FeedItem.f fVar = this.u;
        if (fVar != null) {
            fVar.g.b(this.t);
        }
        FeedItem.f fVar2 = this.u;
        if (fVar2 != null) {
            fVar2.h.p(o1dVar.getVideoUIEventListener());
        }
        this.l.b(o1dVar.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(FeedItem.f fVar) {
        h6(fVar);
    }

    @Override // xsna.vfz
    public final void a6() {
        o1d o1dVar = this.o;
        o1dVar.M();
        FeedItem.f fVar = this.u;
        if (fVar != null) {
            fVar.g.a(this.t);
        }
        FeedItem.f fVar2 = this.u;
        if (fVar2 != null) {
            fVar2.h.o(o1dVar.getVideoUIEventListener());
        }
        this.l.d(o1dVar.getUiVisibilityConfigChangedListener());
    }

    @Override // xsna.pi5
    public final oi5 e4() {
        FeedItem.f fVar = this.u;
        if (fVar != null) {
            return fVar.i;
        }
        return null;
    }

    @Override // xsna.vfz
    public final void g6() {
        this.o.x0.a(ClipItemViewEvent.l.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t1b0
    public final o0f getAttachedPlayer() {
        return (p0f) this.q.getValue();
    }

    public final void h6(FeedItem.f fVar) {
        FeedItem.f fVar2 = this.u;
        b bVar = this.t;
        if (fVar2 != null) {
            fVar2.g.a(bVar);
        }
        o1d o1dVar = this.o;
        if (fVar2 != null) {
            fVar2.h.o(o1dVar.getVideoUIEventListener());
        }
        o1dVar.L(fVar, getAbsoluteAdapterPosition());
        this.u = fVar;
        fVar.g.b(bVar);
        fVar.h.p(o1dVar.getVideoUIEventListener());
    }

    public final void i6() {
        this.o.x0.a(ClipItemViewEvent.f.b);
    }

    @Override // xsna.pi5
    public final kih0 j() {
        FeedItem.f fVar = this.u;
        if (fVar != null) {
            return fVar.h;
        }
        return null;
    }

    public final void j6(boolean z) {
        this.o.x0.a(z ? ClipItemViewEvent.OnItemViewFocusChanged.FOCUSED : ClipItemViewEvent.OnItemViewFocusChanged.UNFOCUSED);
    }

    public final void l6() {
        this.o.x0.a(ClipItemViewEvent.i.b);
    }

    @Override // xsna.z8e
    public final List<View> q1() {
        return this.o.getTranslationTransitionViews();
    }

    @Override // xsna.z8e
    public final List<View> w2() {
        return this.o.getFadeTransitionViews();
    }
}
