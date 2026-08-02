package xsna;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import xsna.iut0;

/* compiled from: VideoUnderModalBottomSheetBehavior.kt */
/* loaded from: classes14.dex */
public final class xnt0 extends k6s0 {
    public final View a;
    public final a b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final io.reactivex.rxjava3.subjects.d<Float> f;
    public final io.reactivex.rxjava3.subjects.d<Rect> g;
    public final io.reactivex.rxjava3.subjects.d<Rect> h;
    public final io.reactivex.rxjava3.subjects.d<Integer> i;
    public final io.reactivex.rxjava3.subjects.d<View> j;
    public final io.reactivex.rxjava3.subjects.d<View> k;
    public final ArrayList l;

    /* compiled from: VideoUnderModalBottomSheetBehavior.kt */
    public interface b {
        Rect getRect();

        int getRight();

        void n(float f);

        void o(float f);

        float p();
    }

    public /* synthetic */ xnt0(View view, List list, List list2, VideoInteractiveFullscreenFragment.h hVar, int i) {
        this(view, list, list2, hVar, (i & 16) == 0, false, false);
    }

    public static final Size f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        ModalBottomSheetBehavior modalBottomSheetBehavior = obj instanceof ModalBottomSheetBehavior ? (ModalBottomSheetBehavior) obj : null;
        return new Size(view.getWidth(), modalBottomSheetBehavior != null ? modalBottomSheetBehavior.L() : view.getHeight());
    }

    @Override // xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        this.f.onNext(Float.valueOf(swe0.f(-f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
    }

    @Override // xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(i, view);
        }
        this.k.onNext(this.a);
        this.j.onNext(view);
        this.i.onNext(Integer.valueOf(i));
    }

    public final void g(bqx0 bqx0Var) {
        h4x i = bqx0Var.a.i(130);
        Rect rect = new Rect();
        rect.left = i.a;
        rect.right = i.c;
        rect.top = i.b;
        rect.bottom = i.d;
        this.g.onNext(rect);
    }

    public xnt0(View view, List<? extends tn10> list, List<? extends b> list2, a aVar, boolean z, boolean z2, boolean z3) {
        this.a = view;
        this.b = aVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = io.reactivex.rxjava3.subjects.d.N0();
        this.g = io.reactivex.rxjava3.subjects.d.O0(new Rect());
        this.h = io.reactivex.rxjava3.subjects.d.N0();
        this.i = io.reactivex.rxjava3.subjects.d.N0();
        this.j = io.reactivex.rxjava3.subjects.d.N0();
        this.k = io.reactivex.rxjava3.subjects.d.N0();
        List<? extends tn10> list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair(io.reactivex.rxjava3.subjects.d.N0(), (tn10) it.next()));
        }
        this.l = arrayList;
        if (!this.c) {
            View view2 = this.a;
            u080 u080Var = new u080() { // from class: xsna.pnt0
                @Override // xsna.u080
                public final bqx0 b(View view3, bqx0 bqx0Var) {
                    xnt0.this.g(bqx0Var);
                    return bqx0Var;
                }
            };
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(view2, u080Var);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            io.reactivex.rxjava3.core.q.l((io.reactivex.rxjava3.subjects.d) ((Pair) it2.next()).d(), this.f, this.j, new a840(new s0r(this, 2), 15)).subscribe();
        }
        int i = 3;
        this.h.subscribe(new xvr0(new z7t0(this, 1), i));
        new io.reactivex.rxjava3.internal.operators.observable.y(this.i.U(new i3u(new yml0(11), 22)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).s0(new l340(new u2k0(this, 24), 21)).subscribe(new v4r0(new ym1(this.h, 14), i));
        io.reactivex.rxjava3.core.q.m(this.h, this.f, new mau(new yu70(list2, new LinkedHashMap(), this), 19)).subscribe();
    }

    public xnt0(View view, VideoView videoView, a aVar, int i) {
        this(view, e43.l(videoView.getViewBinding().c.getMatrixProvider(), videoView.getViewBinding().d, new com.vk.libvideo.api.ui.c(videoView.getViewBinding().l), new com.vk.libvideo.api.ui.a(videoView.getViewBinding().q)), Collections.singletonList(new unt0(videoView)), new vnt0(videoView, (i & 4) != 0 ? null : aVar), (i & 8) == 0, (i & 16) == 0, (i & 32) == 0);
    }

    /* compiled from: VideoUnderModalBottomSheetBehavior.kt */
    public static abstract class a extends ModalBottomSheetBehavior.d {
        public abstract void d(View view, float f);

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public void a(View view, float f) {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public void b(int i, View view) {
        }
    }
}
