package xsna;

import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.autoplay.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipItemImmediatelyViewEventHandler.kt */
/* loaded from: classes17.dex */
public final class x0d {
    public final ClipsScreenPerformanceReporter a;
    public final zof b;
    public c c = new b();

    /* compiled from: ClipItemImmediatelyViewEventHandler.kt */
    public final class a implements c {
        public final o5s0 a;
        public final i3i0 b;
        public final Lazy<i2d> c;
        public boolean d;
        public FeedItem.f e;
        public final Object f = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.interactor.m(7));

        /* compiled from: ClipItemImmediatelyViewEventHandler.kt */
        /* renamed from: xsna.x0d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3966a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClipItemViewEvent.FeedEnterTransitionAnimation.values().length];
                try {
                    iArr[ClipItemViewEvent.FeedEnterTransitionAnimation.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClipItemViewEvent.FeedEnterTransitionAnimation.FINISH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(o5s0 o5s0Var, i3i0 i3i0Var, Lazy<? extends i2d> lazy) {
            this.a = o5s0Var;
            this.b = i3i0Var;
            this.c = lazy;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.x0d.c
        public final void a(ClipItemViewEvent clipItemViewEvent) {
            SdkClipVideoFile sdkClipVideoFile;
            ClipVideoFile z;
            SdkClipVideoFile sdkClipVideoFile2;
            boolean z2 = clipItemViewEvent instanceof ClipItemViewEvent.a;
            ?? r3 = this.f;
            i3i0 i3i0Var = this.b;
            o5s0 o5s0Var = this.a;
            boolean z3 = false;
            if (z2) {
                FeedItem.f fVar = ((ClipItemViewEvent.a) clipItemViewEvent).c;
                fVar.getClass();
                kih0 kih0Var = fVar.h;
                String r1 = fVar.k().r1();
                FeedItem.f fVar2 = this.e;
                boolean f = epx.f(r1, fVar2 != null ? fVar2.k().r1() : null);
                this.e = fVar;
                if (!f) {
                    if (kih0Var.a()) {
                        kih0Var.y();
                    }
                    o5s0Var.a().setKeepScreenOn(kih0Var.isPlaying());
                    o5s0Var.c().setColorFilter(kih0Var.J() ? (PorterDuffColorFilter) r3.getValue() : null);
                    o5s0Var.d().setVisibility(!kih0Var.B() ? 0 : 8);
                    FeedItem.f fVar3 = this.e;
                    if (fVar3 != null && (sdkClipVideoFile2 = fVar3.e) != null) {
                        ViewGroup a = o5s0Var.a();
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        if (a.isLaidOut()) {
                            o5s0Var.c().setScaleType(c(k15.z(sdkClipVideoFile2)) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
                        } else {
                            a.addOnLayoutChangeListener(new y0d(this, sdkClipVideoFile2));
                        }
                    }
                    b();
                    FeedItem.f fVar4 = this.e;
                    if (fVar4 != null && (sdkClipVideoFile = fVar4.e) != null && (z = k15.z(sdkClipVideoFile)) != null) {
                        if (o5s0Var.getVideoTextureViewAdapter().getView().isLaidOut()) {
                            o5s0Var.getVideoTextureViewAdapter().a(c(z) ? VideoTextureViewAdapter.ScaleType.CROP : VideoTextureViewAdapter.ScaleType.FIT);
                            o5s0Var.getVideoTextureViewAdapter().d(z.m0, z.n0);
                        } else {
                            o5s0Var.getVideoTextureViewAdapter().d(z.m0, z.n0);
                            ViewGroup a2 = o5s0Var.a();
                            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                            if (a2.isLaidOut()) {
                                o5s0Var.getVideoTextureViewAdapter().a(c(z) ? VideoTextureViewAdapter.ScaleType.CROP : VideoTextureViewAdapter.ScaleType.FIT);
                            } else {
                                a2.addOnLayoutChangeListener(new z0d(this, z));
                            }
                        }
                    }
                    FeedItem.f fVar5 = this.e;
                    if (fVar5 != null) {
                        SdkClipVideoFile sdkClipVideoFile3 = fVar5.e;
                        ClipVideoFile z4 = k15.z(sdkClipVideoFile3);
                        if (fVar5.h.B()) {
                            vcg0 b = o5s0Var.b();
                            SdkImages I7 = sdkClipVideoFile3.I7();
                            VideoRestriction videoRestriction = z4.O0;
                            if (videoRestriction != null && videoRestriction.d) {
                                z3 = true;
                            }
                            b.a(I7, z3);
                            d3m.c(o5s0Var.b().getView(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            d3m.e(o5s0Var.b().getView(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        }
                    }
                }
                i3i0Var.d = new e3i0(fVar.e, kih0Var, true);
                return;
            }
            if (clipItemViewEvent instanceof k6d) {
                o5s0Var.a().setKeepScreenOn(true);
                d(false);
                return;
            }
            if (clipItemViewEvent instanceof o6d) {
                o5s0Var.a().setKeepScreenOn(true);
                d(false);
                return;
            }
            if (clipItemViewEvent instanceof j6d) {
                o5s0Var.a().setKeepScreenOn(false);
                d(false);
                return;
            }
            if (clipItemViewEvent instanceof f6d) {
                o5s0Var.a().setKeepScreenOn(false);
                d(false);
                o5s0Var.c().setColorFilter((PorterDuffColorFilter) r3.getValue());
                b();
                return;
            }
            if (clipItemViewEvent instanceof m6d) {
                d(false);
                return;
            }
            if (clipItemViewEvent instanceof h6d) {
                FeedItem.f fVar6 = this.e;
                d((fVar6 == null || fVar6.h.B()) ? false : true);
                return;
            }
            if (clipItemViewEvent instanceof e6d) {
                FeedItem.f fVar7 = this.e;
                d((fVar7 == null || fVar7.h.B()) ? false : true);
                return;
            }
            if (clipItemViewEvent instanceof g6d) {
                FeedItem.f fVar8 = this.e;
                if (fVar8 != null && fVar8.h.n(o5s0Var.getVideoTextureViewAdapter().getView())) {
                    x0d.this.a.g();
                }
                d(false);
                f4m.j(o5s0Var.c());
                return;
            }
            if (clipItemViewEvent instanceof p6d) {
                b();
                return;
            }
            if (clipItemViewEvent instanceof r6d) {
                rlh0 rlh0Var = ((r6d) clipItemViewEvent).b;
                int i = rlh0Var.a;
                int i2 = rlh0Var.b;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                o5s0Var.getVideoTextureViewAdapter().d(i, i2);
                return;
            }
            if (clipItemViewEvent instanceof ClipItemViewEvent.e) {
                FeedItem.f fVar9 = this.e;
                if (fVar9 != null) {
                    kih0 kih0Var2 = fVar9.h;
                    if (kih0Var2.isPlaying()) {
                        o5s0Var.getVideoTextureViewAdapter().b(kih0Var2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (clipItemViewEvent instanceof ClipItemViewEvent.g) {
                FeedItem.f fVar10 = this.e;
                if (fVar10 != null) {
                    fVar10.h.D();
                    return;
                }
                return;
            }
            if (clipItemViewEvent instanceof ClipItemViewEvent.OnVideoFocusChanged) {
                this.d = ((ClipItemViewEvent.OnVideoFocusChanged) clipItemViewEvent) == ClipItemViewEvent.OnVideoFocusChanged.FOCUSED;
                FeedItem.f fVar11 = this.e;
                boolean z5 = fVar11 != null && fVar11.h.d();
                if (this.d) {
                    if (z5) {
                        d(true);
                    }
                    i3i0Var.d();
                    return;
                }
                FeedItem.f fVar12 = this.e;
                if (fVar12 != null) {
                    kih0 kih0Var3 = fVar12.h;
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    b.C1208b.a().a(d370.R(kih0Var3));
                }
                d(false);
                i3i0Var.a();
                return;
            }
            if (clipItemViewEvent instanceof ClipItemViewEvent.n) {
                d3m.e(o5s0Var.b().getView(), (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                o5s0Var.d().setVisibility(0);
                return;
            }
            if (clipItemViewEvent instanceof ClipItemViewEvent.FeedEnterTransitionAnimation) {
                int i3 = C3966a.$EnumSwitchMapping$0[((ClipItemViewEvent.FeedEnterTransitionAnimation) clipItemViewEvent).ordinal()];
                Lazy<i2d> lazy = this.c;
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lazy.getValue().b(false);
                } else {
                    FeedItem.f fVar13 = this.e;
                    if (fVar13 != null) {
                        o5s0Var.getVideoTextureViewAdapter().b(fVar13.h);
                    }
                    lazy.getValue().b(true);
                }
            }
        }

        public final void b() {
            FeedItem.f fVar = this.e;
            if (fVar != null) {
                kih0 kih0Var = fVar.h;
                yg5 R = d370.R(kih0Var);
                boolean isReady = R.isReady();
                boolean J = R.J();
                o5s0 o5s0Var = this.a;
                boolean n = kih0Var.n(o5s0Var.getVideoTextureViewAdapter().getView());
                int i = 0;
                boolean z = R.isPlaying() && epx.f(bmp0.a, R);
                VkPicture c = o5s0Var.c();
                if (!J && isReady && (n || z)) {
                    i = 8;
                }
                c.setVisibility(i);
            }
        }

        public final boolean c(VideoFile videoFile) {
            ViewGroup a = this.a.a();
            return (((float) a.getHeight()) / ((float) a.getWidth())) - (((float) videoFile.getHeight()) / ((float) videoFile.getWidth())) <= 0.2f;
        }

        public final void d(boolean z) {
            boolean z2 = z && this.d;
            boolean c = this.b.c(z2);
            FeedItem.f fVar = this.e;
            this.a.m().setVisibility(((fVar != null && fVar.h.B()) || !z2 || c) ? 8 : 0);
        }
    }

    /* compiled from: ClipItemImmediatelyViewEventHandler.kt */
    public final class b implements c {
        public final ArrayList a = new ArrayList();

        public b() {
        }

        @Override // xsna.x0d.c
        public final void a(ClipItemViewEvent clipItemViewEvent) {
            this.a.add(clipItemViewEvent);
        }
    }

    /* compiled from: ClipItemImmediatelyViewEventHandler.kt */
    public interface c {
        void a(ClipItemViewEvent clipItemViewEvent);
    }

    public x0d(ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, ix2 ix2Var, zof zofVar) {
        this.a = clipsScreenPerformanceReporter;
        this.b = zofVar;
    }
}
