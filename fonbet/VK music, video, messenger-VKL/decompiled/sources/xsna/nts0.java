package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.utils.recyclerview.carousel.CenterLayoutManager;
import com.vk.im.ui.views.StencilLayout;
import com.vk.videomessage.impl.BackgroundBlurView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: VideoMessagesCameraView.kt */
/* loaded from: classes7.dex */
public final class nts0 extends FrameLayout {
    public static final float D = iah0.b(3.0f);
    public static int E;
    public final bq2 A;
    public final ots0 B;
    public final ValueAnimator C;
    public kew b;
    public final a c;
    public final long d;
    public final boolean e;
    public final Object f;
    public final Object g;
    public final BackgroundBlurView h;
    public final View i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final RecyclerView m;
    public final f0l0 n;
    public final StencilLayout o;
    public final FrameLayout p;
    public final xy80 q;
    public final int r;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public List<e0l0> w;
    public boolean x;
    public final io.reactivex.rxjava3.subjects.f<List<e0l0>> y;
    public final io.reactivex.rxjava3.disposables.c z;

    /* compiled from: VideoMessagesCameraView.kt */
    public interface a {
        void a();

        void b(File file, int i, boolean z);

        void c(long j);

        void d();

        void e();

        void onRecordStarted();
    }

    /* compiled from: VideoMessagesCameraView.kt */
    public final class b implements pew {
        public b() {
        }

        @Override // xsna.pew
        public final void a() {
            a aVar = nts0.this.c;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // xsna.pew
        public final void b() {
            bq2 bq2Var = nts0.this.A;
            d3m.e((FrameLayout) bq2Var.a, (r15 & 1) != 0 ? 300L : 500L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new sc2(bq2Var, 1), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }

        public final void c() {
            nts0 nts0Var = nts0.this;
            a aVar = nts0Var.c;
            if (aVar != null) {
                aVar.onRecordStarted();
            }
            nts0Var.getVideoMsgReporter().j(nts0Var.d, nts0Var.getCurrentUid().b, nts0Var.v, nts0Var.e);
        }
    }

    public nts0(Context context, kew kewVar, List list, a aVar, long j, boolean z, kkm kkmVar) {
        super(context, null);
        this.b = kewVar;
        this.c = aVar;
        this.d = j;
        this.e = z;
        odc0 odc0Var = new odc0(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, odc0Var);
        this.g = msy.a(lazyThreadSafetyMode, new wrl0(this, 17));
        int a2 = iah0.a(6);
        int a3 = e3m.a(R.dimen.stencil_carousel_width, context) + a2;
        this.r = a3;
        egh0 egh0Var = new egh0();
        this.u = true;
        this.w = EmptyList.b;
        io.reactivex.rxjava3.subjects.f<List<e0l0>> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.y = fVar;
        this.B = new ots0(this);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        ofFloat.addUpdateListener(new qf0(this, 3));
        ofFloat.setDuration(300L);
        this.C = ofFloat;
        LayoutInflater.from(getContext()).inflate(R.layout.vkim_video_messages_view, this);
        this.h = (BackgroundBlurView) findViewById(R.id.blur_view);
        this.p = (FrameLayout) findViewById(R.id.videomsg_camera_view);
        View findViewById = findViewById(R.id.blurred_background);
        this.i = findViewById;
        findViewById.setClipToOutline(true);
        findViewById.setOutlineProvider(new s0w0(iah0.b(12.0f), 2));
        BackgroundBlurView backgroundBlurView = this.h;
        int i = 11;
        (backgroundBlurView == null ? null : backgroundBlurView).setBlurCallback(new kvm0(this, i));
        this.l = (ImageView) findViewById(R.id.flash_button);
        this.k = (ImageView) findViewById(R.id.switch_button);
        this.o = (StencilLayout) findViewById(R.id.video_view_container);
        this.m = (RecyclerView) findViewById(R.id.stencils_carousel);
        ImageView imageView = (ImageView) findViewById(R.id.close_btn);
        bwt0.i0(imageView, new skj0(this, i));
        this.j = imageView;
        ImageView imageView2 = this.k;
        bwt0.i0(imageView2 == null ? null : imageView2, new gyo0(this, 5));
        ImageView imageView3 = this.l;
        int i2 = 4;
        bwt0.i0(imageView3 == null ? null : imageView3, new vyq0(this, i2));
        if (kkmVar != null) {
            StencilLayout stencilLayout = this.o;
            kkmVar.e(stencilLayout == null ? null : stencilLayout, new bkh(i));
            FrameLayout frameLayout = this.p;
            kkmVar.e(frameLayout == null ? null : frameLayout, new aad(12));
        }
        int z2 = (iah0.z(getContext()) - a3) / 2;
        this.s = z2;
        this.n = new f0l0(new q250(2, this, nts0.class, "onStencilClicked", "onStencilClicked(IZ)V", 0, 1), new awx(a3, z2, iah0.z(getContext())), egh0Var);
        setOnTouchListener(new pts0(this));
        RecyclerView recyclerView = this.m;
        recyclerView = recyclerView == null ? null : recyclerView;
        f0l0 f0l0Var = this.n;
        recyclerView.setAdapter(f0l0Var == null ? null : f0l0Var);
        RecyclerView recyclerView2 = this.m;
        recyclerView2 = recyclerView2 == null ? null : recyclerView2;
        getContext();
        recyclerView2.setLayoutManager(new CenterLayoutManager(0, false));
        RecyclerView recyclerView3 = this.m;
        (recyclerView3 == null ? null : recyclerView3).addOnScrollListener(egh0Var);
        RecyclerView recyclerView4 = this.m;
        (recyclerView4 == null ? null : recyclerView4).addItemDecoration(new dhk0(0, 0, a2, 0));
        androidx.recyclerview.widget.g0 g0Var = new androidx.recyclerview.widget.g0();
        RecyclerView recyclerView5 = this.m;
        g0Var.attachToRecyclerView(recyclerView5 == null ? null : recyclerView5);
        setStencils(list);
        bpn0 bpn0Var = enj.a;
        this.q = new xy80(e3m.h(context));
        kew kewVar2 = this.b;
        StencilLayout stencilLayout2 = this.o;
        this.A = new bq2(kewVar2, stencilLayout2 == null ? null : stencilLayout2);
        this.z = fVar.a0(asu0.a.d()).subscribe(new rt10(new kyq0(this, i2), 22), new qtq0(new mts0(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0), 3));
    }

    public static s3q0 a(nts0 nts0Var) {
        ung0 ung0Var;
        kew kewVar = nts0Var.b;
        if (kewVar != null && (ung0Var = kewVar.d.get()) != null) {
            ung0Var.h();
            jhu0 jhu0Var = ((fj9) ij9.a.a.getValue()).a;
            kewVar.b = jhu0Var != null ? jhu0Var.p() : false;
            kewVar.a.set(!r0.get());
        }
        nts0Var.g();
        nts0Var.getVideoMsgReporter().e(nts0Var.d, nts0Var.getCurrentUid().b, nts0Var.v, nts0Var.e);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final UserId getCurrentUid() {
        return (UserId) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cxs0 getVideoMsgReporter() {
        return (cxs0) this.f.getValue();
    }

    public final void d(boolean z) {
        if (z) {
            RecyclerView recyclerView = this.m;
            d3m.e(recyclerView == null ? null : recyclerView, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            ImageView imageView = this.j;
            d3m.e(imageView == null ? null : imageView, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        bwt0.p0(recyclerView2, false);
        ImageView imageView2 = this.j;
        bwt0.p0(imageView2 != null ? imageView2 : null, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        BackgroundBlurView backgroundBlurView = this.h;
        if (backgroundBlurView == null) {
            backgroundBlurView = null;
        }
        if (!backgroundBlurView.getDrawInProgress()) {
            BackgroundBlurView backgroundBlurView2 = this.h;
            BackgroundBlurView.a aVar = (backgroundBlurView2 != null ? backgroundBlurView2 : null).d;
            if (aVar != null ? aVar.c : false) {
                return;
            }
            super.dispatchDraw(canvas);
            return;
        }
        BackgroundBlurView backgroundBlurView3 = this.h;
        if (backgroundBlurView3 == null) {
            backgroundBlurView3 = null;
        }
        if (backgroundBlurView3.isAvailable()) {
            return;
        }
        BackgroundBlurView backgroundBlurView4 = this.h;
        (backgroundBlurView4 != null ? backgroundBlurView4 : null).draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        BackgroundBlurView backgroundBlurView = this.h;
        if (backgroundBlurView == null) {
            backgroundBlurView = null;
        }
        BackgroundBlurView.a aVar = backgroundBlurView.d;
        if (aVar != null ? aVar.c : false) {
            return;
        }
        super.draw(canvas);
    }

    public final void e(int i, boolean z) {
        Object obj;
        e0l0 e0l0Var = (e0l0) j5g.b0(i - 1, this.w);
        int i2 = e0l0Var != null ? e0l0Var.a : ((e0l0) j5g.Y(this.w)).a;
        kew kewVar = this.b;
        if (kewVar == null || i2 == this.v) {
            return;
        }
        this.v = i2;
        kewVar.d(i2);
        if (this.u) {
            this.u = false;
        } else {
            StencilLayout stencilLayout = this.o;
            if (stencilLayout == null) {
                stencilLayout = null;
            }
            List<e0l0> list = this.w;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((e0l0) obj).a == i2) {
                        break;
                    }
                }
            }
            e0l0 e0l0Var2 = (e0l0) obj;
            if (e0l0Var2 == null) {
                e0l0Var2 = (e0l0) j5g.Y(list);
            }
            stencilLayout.setStencil(e0l0Var2.b);
        }
        if (z) {
            RecyclerView recyclerView = this.m;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                RecyclerView recyclerView2 = this.m;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                layoutManager.smoothScrollToPosition(recyclerView2, null, i);
            }
        }
    }

    public final void f() {
        RecyclerView recyclerView = this.m;
        d3m.c(recyclerView == null ? null : recyclerView, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ImageView imageView = this.j;
        d3m.c(imageView == null ? null : imageView, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void g() {
        kew kewVar = this.b;
        if (kewVar == null || !kewVar.b) {
            ImageView imageView = this.l;
            d3m.e(imageView == null ? null : imageView, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        } else {
            ImageView imageView2 = this.l;
            d3m.c(imageView2 == null ? null : imageView2, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final List<e0l0> getStencils() {
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            int z = iah0.z(getContext());
            int i = this.r;
            int i2 = (z - i) / 2;
            this.s = i2;
            awx awxVar = new awx(i, i2, iah0.z(getContext()));
            f0l0 f0l0Var = this.n;
            (f0l0Var == null ? null : f0l0Var).j = awxVar;
            (f0l0Var != null ? f0l0Var : null).notifyDataSetChanged();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver x = bwt0.x(this);
        if (x != null) {
            x.removeOnPreDrawListener(this.B);
        }
        getRootView();
        super.onDetachedFromWindow();
        if (this.t) {
            this.t = false;
            kew kewVar = this.b;
            if (kewVar != null) {
                kewVar.c(false);
            }
        }
        E = this.v;
        this.b = null;
        this.z.dispose();
        this.y.onComplete();
        xy80 xy80Var = this.q;
        xy80Var.i();
        xy80Var.g();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 || i4 == 0) {
            return;
        }
        BackgroundBlurView backgroundBlurView = this.h;
        if (backgroundBlurView == null) {
            backgroundBlurView = null;
        }
        backgroundBlurView.a();
        ViewTreeObserver x = bwt0.x(this);
        ots0 ots0Var = this.B;
        if (x != null) {
            x.removeOnPreDrawListener(ots0Var);
        }
        ViewTreeObserver x2 = bwt0.x(this);
        if (x2 != null) {
            x2.addOnPreDrawListener(ots0Var);
        }
    }

    public final void setStencils(List<e0l0> list) {
        Object obj;
        this.w = list;
        if (!list.isEmpty()) {
            int i = E;
            StencilLayout stencilLayout = this.o;
            if (stencilLayout == null) {
                stencilLayout = null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((e0l0) obj).a == i) {
                        break;
                    }
                }
            }
            e0l0 e0l0Var = (e0l0) obj;
            if (e0l0Var == null) {
                e0l0Var = (e0l0) j5g.Y(list);
            }
            stencilLayout.setStencil(e0l0Var.b);
        }
        f0l0 f0l0Var = this.n;
        qul qulVar = f0l0Var != null ? f0l0Var : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vgk0(this.s));
        List<e0l0> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new i0l0(((e0l0) it2.next()).b));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new vgk0(this.s));
        qulVar.setItems(arrayList);
        this.y.onNext(list);
    }
}
