package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.movika.impl.view.full.extend_seekbar.InteractiveExtendSeekBarView;
import com.vk.movika.sdk.base.model.t;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.movika.tools.controls.seekbar.SeekBarMiscUI$Mode;
import com.vk.movika.tools.controls.seekbar.c;
import com.vk.movika.tools.controls.seekbar.y;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.acx;
import xsna.ocx;

/* compiled from: SeekBarController.kt */
/* loaded from: classes3.dex */
public final class f3i0 {
    public final evs a;
    public final c4u0 b;
    public final p3h c;
    public final qm d;
    public final r6p0 e;
    public final v3d0 f;
    public final boolean g;
    public final boolean h;
    public ocx i;
    public boolean j;
    public final DefaultSeekBarView k;
    public final float l;
    public int m;
    public final float n;
    public b o;
    public boolean p;
    public boolean q;
    public final i4u0 r;
    public final com.vk.movika.tools.controls.seekbar.c s;

    /* compiled from: SeekBarController.kt */
    public final class a implements y.a {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;

        public a() {
            ocx.b bVar;
            ocx ocxVar = f3i0.this.i;
            boolean z = false;
            if (ocxVar != null && (bVar = ocxVar.a) != null && bVar.a) {
                z = true;
            }
            this.a = z;
            this.b = true;
        }

        @Override // com.vk.movika.tools.controls.seekbar.y.a
        public final boolean a(DefaultSeekBarView defaultSeekBarView, long j) {
            f3i0 f3i0Var = f3i0.this;
            if (!(f3i0Var.a.l.e instanceof t.c)) {
                return true;
            }
            r6p0 r6p0Var = f3i0Var.e;
            if (!bwt0.K(f3i0Var.b.o)) {
                r6p0Var = null;
            }
            r6p0 r6p0Var2 = r6p0Var;
            if (r6p0Var2 != null) {
                DefaultSeekBarView defaultSeekBarView2 = f3i0Var.k;
                long maxCurrent = defaultSeekBarView.getMaxCurrent();
                Context context = r6p0Var2.a;
                String string = !((Boolean) r6p0Var2.c.invoke()).booleanValue() ? context.getString(R.string.seek_is_not_available_during_interaction_2_lines) : context.getString(R.string.seek_is_not_available_during_interaction);
                Rect C = bwt0.C(defaultSeekBarView2);
                int a = iah0.a(16);
                int i = C.left;
                int b = an10.b((((j / maxCurrent) * (((C.right - i) - defaultSeekBarView2.getPaddingStart()) - defaultSeekBarView2.getPaddingEnd())) - a) + defaultSeekBarView2.getPaddingStart());
                if (b < 0) {
                    b = 0;
                }
                int i2 = i + b;
                C.left = i2;
                C.right = (a * 2) + i2;
                r6p0.d(r6p0Var2, string, C, defaultSeekBarView2, 0, cn70.b(4), Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
            }
            return false;
        }

        @Override // com.vk.movika.tools.controls.seekbar.y.a
        public final boolean b(com.vk.movika.tools.controls.seekbar.y yVar, long j, boolean z) {
            Long l;
            ocx ocxVar;
            ocx.a aVar;
            ocx ocxVar2;
            ocx.a aVar2;
            f3i0 f3i0Var = f3i0.this;
            c4u0 c4u0Var = f3i0Var.b;
            boolean z2 = f3i0Var.h;
            v3d0 v3d0Var = f3i0Var.f;
            evs evsVar = f3i0Var.a;
            if (!z) {
                return true;
            }
            if (this.c || this.d) {
                return false;
            }
            boolean b = po10.b(evsVar.l.e, j);
            long j2 = 0;
            long a = po10.a(evsVar.l.e, 0L);
            long j3 = j > a ? a : j;
            v3d0Var.e(yVar, j3);
            v3d0Var.f(!((b || (((ocxVar2 = f3i0Var.i) == null || (aVar2 = ocxVar2.u) == null || aVar2.a) && z2)) ? false : true));
            if (z2) {
                awt0.v(c4u0Var.P, (!b || (ocxVar = f3i0Var.i) == null || (aVar = ocxVar.u) == null || aVar.a) ? false : true);
                InteractiveExtendSeekBarView interactiveExtendSeekBarView = c4u0Var.N;
                ocx ocxVar3 = f3i0Var.i;
                if (ocxVar3 != null && (l = ocxVar3.k) != null) {
                    j2 = l.longValue();
                }
                InteractiveExtendSeekBarView.a aVar3 = new InteractiveExtendSeekBarView.a(j3, j2, a);
                if (!aVar3.equals(interactiveExtendSeekBarView.h) || a == j3) {
                    interactiveExtendSeekBarView.a(aVar3);
                }
            }
            return b;
        }

        @Override // com.vk.movika.tools.controls.seekbar.y.a
        public final void c(float f) {
            ocx.a aVar;
            ocx.a aVar2;
            VideoFile videoFile;
            ocx.a aVar3;
            VideoFile videoFile2;
            f3i0 f3i0Var = f3i0.this;
            DefaultSeekBarView defaultSeekBarView = f3i0Var.k;
            float f2 = f3i0Var.l;
            if (f3i0Var.h) {
                ocx ocxVar = f3i0Var.i;
                if (ocxVar != null && (aVar3 = ocxVar.u) != null && aVar3.b && !this.c) {
                    boolean z = f3i0Var.j && (videoFile2 = ocxVar.s) != null && videoFile2.e2();
                    float f3 = f2 / 2;
                    if (f <= f3) {
                        this.d = false;
                        return;
                    }
                    if (f <= f2) {
                        this.d = true;
                        f3i0Var.i(1.0f - swe0.f((f - f3) / f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), !z);
                        return;
                    } else {
                        f3i0Var.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !z);
                        f3i0Var.a(false);
                        defaultSeekBarView.getThumb().setAlpha(1.0f);
                        return;
                    }
                }
                if (ocxVar == null || (aVar = ocxVar.u) == null || aVar.b || this.d) {
                    return;
                }
                boolean z2 = f3i0Var.j;
                evs evsVar = f3i0Var.a;
                boolean z3 = z2 && (videoFile = ocxVar.s) != null && videoFile.e2();
                float f4 = f2 / 2;
                ocx ocxVar2 = f3i0Var.i;
                if (ocxVar2 != null && (aVar2 = ocxVar2.u) != null && !aVar2.a && f < (-f4)) {
                    c4u0 c4u0Var = f3i0Var.b;
                    View view = c4u0Var.Q;
                    VkImageSimple vkImageSimple = c4u0Var.R;
                    View view2 = c4u0Var.O;
                    InteractiveExtendSeekBarView interactiveExtendSeekBarView = c4u0Var.N;
                    view.setVisibility(0);
                    c4u0Var.Q.setAlpha(1.0f);
                    interactiveExtendSeekBarView.setVisibility(0);
                    interactiveExtendSeekBarView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setVisibility(0);
                    view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    vkImageSimple.setVisibility(0);
                    vkImageSimple.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    evsVar.a(acx.a.a);
                }
                if (f >= (-f4)) {
                    this.c = false;
                    return;
                }
                if (f >= (-f2)) {
                    this.c = true;
                    f3i0Var.i(swe0.f((-(f4 + f)) / f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), !z3);
                    return;
                }
                f3i0Var.i(1.0f, !z3);
                evsVar.a(acx.f.a);
                defaultSeekBarView.getThumb().setAlpha(1.0f);
                b bVar = f3i0Var.o;
                f3i0Var.o = b.a(bVar, this.a, 0L, bVar.b, 2);
            }
        }

        @Override // com.vk.movika.tools.controls.seekbar.y.a
        public final boolean d(com.vk.movika.tools.controls.seekbar.y yVar, long j) {
            ocx.a aVar;
            ocx.b bVar;
            ocx ocxVar;
            ocx.a aVar2;
            f3i0 f3i0Var = f3i0.this;
            v3d0 v3d0Var = f3i0Var.f;
            c4u0 c4u0Var = f3i0Var.b;
            boolean z = f3i0Var.h;
            evs evsVar = f3i0Var.a;
            if (!po10.b(evsVar.l.e, j)) {
                this.b = false;
                if (z && ((ocxVar = f3i0Var.i) == null || (aVar2 = ocxVar.u) == null || aVar2.a)) {
                    return false;
                }
                f3i0Var.f(this.a, false);
                return false;
            }
            this.b = true;
            ocx ocxVar2 = f3i0Var.i;
            this.a = (ocxVar2 == null || (bVar = ocxVar2.a) == null || !bVar.a) ? false : true;
            evsVar.a(new acx.g(false, true, false));
            f3i0Var.e.a();
            f3i0Var.s.a(SeekBarMiscUI$Mode.SEEK);
            f4m.j(c4u0Var.C);
            f3i0Var.r.a(false);
            v3d0Var.c();
            evsVar.y.getParent().requestDisallowInterceptTouchEvent(true);
            v3d0Var.e(yVar, j);
            if (z) {
                VkText vkText = c4u0Var.P;
                ocx ocxVar3 = f3i0Var.i;
                awt0.v(vkText, (ocxVar3 == null || (aVar = ocxVar3.u) == null || aVar.a) ? false : true);
            }
            if (f3i0Var.g) {
                evsVar.S(false);
            }
            f3i0Var.o = b.a(f3i0Var.o, false, j, 0L, 5);
            return true;
        }

        @Override // com.vk.movika.tools.controls.seekbar.y.a
        public final boolean e(long j, long j2) {
            ocx.a aVar;
            ocx.a aVar2;
            ocx.a aVar3;
            f3i0 f3i0Var = f3i0.this;
            v3d0 v3d0Var = f3i0Var.f;
            c4u0 c4u0Var = f3i0Var.b;
            evs evsVar = f3i0Var.a;
            if (this.b) {
                long a = po10.a(evsVar.l.e, -1L);
                if (a > 0) {
                    if (this.c || this.d) {
                        if (j > a) {
                            j = a;
                        }
                        evsVar.p(new acx.h(j));
                    } else {
                        if (j2 > a) {
                            j2 = a;
                        }
                        evsVar.p(new acx.h(j2));
                    }
                }
                if (f3i0Var.h) {
                    this.c = false;
                    this.d = false;
                    f4m.j(c4u0Var.P);
                    ocx ocxVar = f3i0Var.i;
                    if (ocxVar != null && (aVar2 = ocxVar.u) != null && !aVar2.b) {
                        v3d0Var.b();
                        f3i0Var.f(this.a, this.b);
                        ocx ocxVar2 = f3i0Var.i;
                        if (ocxVar2 != null && (aVar3 = ocxVar2.u) != null && aVar3.a) {
                            f3i0Var.e(true);
                            evsVar.a(acx.b.a);
                        }
                    } else if (ocxVar != null && (aVar = ocxVar.u) != null && aVar.b) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        ListBuilder e = e43.e();
                        InteractiveExtendSeekBarView interactiveExtendSeekBarView = c4u0Var.N;
                        VkImageSimple vkImageSimple = c4u0Var.R;
                        e.add(f3i0.d(interactiveExtendSeekBarView));
                        e.add(f3i0.d(c4u0Var.Q));
                        e.add(f3i0.d(c4u0Var.O));
                        e.add(f3i0.d(vkImageSimple));
                        InteractiveExtendSeekBarView interactiveExtendSeekBarView2 = c4u0Var.N;
                        float f = -f3i0Var.l;
                        e.add(f3i0.c(interactiveExtendSeekBarView2, f3i0Var.m + f));
                        e.add(f3i0.c(c4u0Var.g, f3i0Var.n + f));
                        e.add(f3i0.c(c4u0Var.B, f));
                        e.add(f3i0.c(vkImageSimple, f / 2));
                        animatorSet.playTogether(e.g());
                        animatorSet.start();
                    }
                } else {
                    v3d0Var.b();
                    f3i0Var.f(this.a, this.b);
                }
                if (a > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: SeekBarController.kt */
    public static final class b {
        public final boolean a;
        public final long b;
        public final long c;

        public b() {
            this(0);
        }

        public static b a(b bVar, boolean z, long j, long j2, int i) {
            if ((i & 1) != 0) {
                z = bVar.a;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                j = bVar.b;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = bVar.c;
            }
            bVar.getClass();
            return new b(z2, j3, j2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SeekBarState(isNeedResumeAfterStopTracking=");
            sb.append(this.a);
            sb.append(", lastTouchDownPosition=");
            sb.append(this.b);
            sb.append(", positionBeforeSeekBarExtended=");
            return vu5.a(')', this.c, sb);
        }

        public /* synthetic */ b(int i) {
            this(false, 0L, 0L);
        }

        public b(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public final /* synthetic */ boolean c;

        public c(boolean z) {
            this.c = z;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            f3i0 f3i0Var = f3i0.this;
            c4u0 c4u0Var = f3i0Var.b;
            WindowInsets rootWindowInsets = c4u0Var.g.getRootWindowInsets();
            int stableInsetBottom = rootWindowInsets != null ? rootWindowInsets.getStableInsetBottom() : 0;
            int b = cn70.b(24) - stableInsetBottom;
            if (b < 0) {
                b = 0;
            }
            boolean z = this.c;
            f3i0Var.h(z);
            awt0.u(c4u0Var.g, z);
            c4u0Var.g.setPadding(cn70.b(16), 0, cn70.b(16), cn70.b(18) + b);
            c4u0Var.B.setPadding(cn70.b(16), 0, cn70.b(16), cn70.b(24) + stableInsetBottom + b);
            f4m.q(cn70.b(58) + stableInsetBottom + b, c4u0Var.l);
            f4m.v(cn70.b(24) + stableInsetBottom + b, c4u0Var.h);
            f4m.v(cn70.b(24) + stableInsetBottom + b, c4u0Var.A);
            f3i0Var.g(-(cn70.b(18) + b));
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            f3i0 f3i0Var = f3i0.this;
            f3i0Var.h(true);
            f3i0Var.b.g.setVisibility(0);
        }
    }

    public f3i0(evs evsVar, c4u0 c4u0Var, p3h p3hVar, qm qmVar, r6p0 r6p0Var, v3d0 v3d0Var, boolean z, boolean z2) {
        View view = evsVar.y;
        InteractiveExtendSeekBarView interactiveExtendSeekBarView = c4u0Var.N;
        FrameLayout frameLayout = c4u0Var.B;
        ViewGroup viewGroup = c4u0Var.A;
        this.a = evsVar;
        this.b = c4u0Var;
        this.c = p3hVar;
        this.d = qmVar;
        this.e = r6p0Var;
        this.f = v3d0Var;
        this.g = z;
        this.h = z2;
        this.k = z ? c4u0Var.g : c4u0Var.f;
        this.l = interactiveExtendSeekBarView.getResources().getDimension(R.dimen.interactive_extend_seek_view_size);
        this.m = cn70.b(0);
        this.n = interactiveExtendSeekBarView.getResources().getDimension(R.dimen.interactive_seek_bar_translation_y);
        this.o = new b(0);
        this.p = true;
        this.q = true;
        this.r = new i4u0();
        view.getContext();
        this.s = new com.vk.movika.tools.controls.seekbar.c(new c.a(viewGroup, frameLayout), pn00.k(new Pair(SeekBarMiscUI$Mode.COMMON, Collections.singleton(viewGroup)), new Pair(SeekBarMiscUI$Mode.SEEK, Collections.singleton(frameLayout))), new aly(), new kly(view.getContext()));
    }

    public static ObjectAnimator b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addListener(new g3i0(view));
        return ofFloat;
    }

    public static ObjectAnimator c(View view, float f) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), f);
    }

    public static ObjectAnimator d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
        ofFloat.addListener(new h3i0(view));
        return ofFloat;
    }

    public final void a(boolean z) {
        this.a.a(acx.b.a);
        e(z);
        this.s.a(SeekBarMiscUI$Mode.COMMON);
        this.b.C.setVisibility(0);
        this.r.a(true);
        this.f.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r6.e2() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z) {
        ocx ocxVar;
        if (!z) {
            boolean z2 = (!this.j || (ocxVar = this.i) == null || (r6 = ocxVar.s) == null) ? false : true;
            i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ListBuilder e = e43.e();
        c4u0 c4u0Var = this.b;
        e.add(b(c4u0Var.N));
        e.add(b(c4u0Var.Q));
        e.add(b(c4u0Var.O));
        e.add(c(c4u0Var.N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        e.add(c(c4u0Var.g, this.n));
        e.add(c(c4u0Var.B, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        animatorSet.playTogether(e.g());
        animatorSet.start();
        f4m.j(c4u0Var.R);
    }

    public final void f(boolean z, boolean z2) {
        this.s.a(SeekBarMiscUI$Mode.COMMON);
        this.b.C.setVisibility(0);
        this.r.a(true);
        evs evsVar = this.a;
        evsVar.y.getParent().requestDisallowInterceptTouchEvent(false);
        if (z && z2) {
            evsVar.p(new acx.g(true, true, false));
        }
    }

    public final void g(int i) {
        InteractiveExtendSeekBarView interactiveExtendSeekBarView = this.b.N;
        interactiveExtendSeekBarView.setTranslationY(interactiveExtendSeekBarView.getTranslationY() + (this.m - i));
        this.m = i;
    }

    public final void h(boolean z) {
        this.p = z;
        this.k.getThumb().setEnabled(z && this.q);
    }

    public final void i(float f, boolean z) {
        c4u0 c4u0Var = this.b;
        DefaultSeekBarView defaultSeekBarView = c4u0Var.g;
        float f2 = this.l;
        defaultSeekBarView.setTranslationY(((-f2) * f) + this.n);
        c4u0Var.N.setTranslationY(((-f2) * f) + this.m);
        c4u0Var.B.setTranslationY((-f2) * f);
        if (z) {
            c4u0Var.R.setTranslationY(((-f2) * f) / 2);
        }
        boolean z2 = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        InteractiveExtendSeekBarView interactiveExtendSeekBarView = c4u0Var.N;
        VkImageSimple vkImageSimple = c4u0Var.R;
        View view = c4u0Var.O;
        interactiveExtendSeekBarView.setAlpha(f);
        awt0.u(c4u0Var.N, z2);
        view.setAlpha(f);
        awt0.v(view, z2);
        awt0.v(c4u0Var.Q, z2);
        vkImageSimple.setAlpha(f);
        awt0.v(vkImageSimple, z2);
    }

    public final void j(boolean z, boolean z2) {
        ocx.a aVar;
        VideoFile videoFile;
        if (this.g) {
            c4u0 c4u0Var = this.b;
            if (z) {
                DefaultSeekBarView defaultSeekBarView = c4u0Var.g;
                DefaultSeekBarView defaultSeekBarView2 = c4u0Var.g;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (defaultSeekBarView.isLaidOut()) {
                    WindowInsets rootWindowInsets = defaultSeekBarView2.getRootWindowInsets();
                    int stableInsetBottom = rootWindowInsets != null ? rootWindowInsets.getStableInsetBottom() : 0;
                    int b2 = cn70.b(24) - stableInsetBottom;
                    if (b2 < 0) {
                        b2 = 0;
                    }
                    h(z2);
                    awt0.u(defaultSeekBarView2, z2);
                    defaultSeekBarView2.setPadding(cn70.b(16), 0, cn70.b(16), cn70.b(18) + b2);
                    c4u0Var.B.setPadding(cn70.b(16), 0, cn70.b(16), cn70.b(24) + stableInsetBottom + b2);
                    f4m.q(cn70.b(58) + stableInsetBottom + b2, c4u0Var.l);
                    f4m.v(cn70.b(24) + stableInsetBottom + b2, c4u0Var.h);
                    f4m.v(cn70.b(24) + stableInsetBottom + b2, c4u0Var.A);
                    g(-(cn70.b(18) + b2));
                } else {
                    defaultSeekBarView.addOnLayoutChangeListener(new c(z2));
                }
            } else {
                DefaultSeekBarView defaultSeekBarView3 = c4u0Var.g;
                DefaultSeekBarView defaultSeekBarView4 = c4u0Var.g;
                defaultSeekBarView3.setPadding(0, 0, 0, 0);
                f4m.v(cn70.b(6), c4u0Var.A);
                c4u0Var.B.setPadding(cn70.b(0), 0, cn70.b(0), cn70.b(6));
                f4m.q(cn70.b(40), c4u0Var.l);
                f4m.v(cn70.b(6), c4u0Var.h);
                g(cn70.b(0));
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                if (defaultSeekBarView4.isLaidOut()) {
                    h(true);
                    defaultSeekBarView4.setVisibility(0);
                } else {
                    defaultSeekBarView4.addOnLayoutChangeListener(new d());
                }
            }
            ocx ocxVar = this.i;
            if (ocxVar != null && (aVar = ocxVar.u) != null && aVar.b) {
                i(1.0f, z && (videoFile = ocxVar.s) != null && videoFile.e2());
            }
            this.j = z;
        }
    }
}
