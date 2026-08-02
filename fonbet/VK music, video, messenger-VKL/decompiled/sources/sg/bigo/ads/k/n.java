package sg.bigo.ads.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.y.a;

/* loaded from: classes9.dex */
public class n extends a {
    protected RoundedFrameLayout A;
    protected LinearLayout B;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c C;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c D;
    protected sg.bigo.ads.r.a E;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.b F;
    protected sg.bigo.ads.r.b G;
    private final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> H;
    private final a.InterfaceC2508a I;
    private final AtomicBoolean J;
    private final List<Runnable> K;
    protected ViewFlow y;
    protected Indicator z;

    /* renamed from: sg.bigo.ads.k.n$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sg.bigo.ads.r.d.values().length];
            a = iArr;
            try {
                iArr[sg.bigo.ads.r.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[sg.bigo.ads.r.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[sg.bigo.ads.r.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[sg.bigo.ads.r.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
        this.H = new HashSet();
        this.I = new a.InterfaceC2508a() { // from class: sg.bigo.ads.k.n.1
            @Override // sg.bigo.ads.y.a.InterfaceC2508a
            public final boolean a() {
                ViewFlow viewFlow = n.this.y;
                if (viewFlow != null) {
                    return viewFlow.h;
                }
                return false;
            }
        };
        this.J = new AtomicBoolean(false);
        this.K = new ArrayList();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.r.c cVar, int i, String str, boolean z) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.G, cVar, D(), i, str, z, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.k.n.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                n.this.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.n.4.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            synchronized (n.this.H) {
                                n.this.H.remove(aVar3);
                            }
                            aVar3.a(bitmap2);
                        }
                    }
                });
            }
        });
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.a = -1;
        bVar.b = -1;
        bVar.c = false;
        bVar.d = cVar.d;
        this.y.addView(aVar.j, bVar);
        if (this.E != null) {
            aVar.r = new d.a() { // from class: sg.bigo.ads.k.n.5
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    n.this.E.a(n.this.y.a(aVar.j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    public final void A() {
        int a = this.y.a(this.F.j);
        if (a < 0 || a == this.y.getCurrentItem()) {
            return;
        }
        this.y.b(a);
    }

    @Nullable
    public final sg.bigo.ads.ai.o B() {
        sg.bigo.ads.r.b bVar = this.G;
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    public boolean C() {
        return E() == sg.bigo.ads.r.d.NONE;
    }

    public int D() {
        return w();
    }

    public sg.bigo.ads.r.d E() {
        sg.bigo.ads.r.b bVar = this.G;
        return bVar != null ? bVar.b : sg.bigo.ads.r.d.NONE;
    }

    public sg.bigo.ads.r.c F() {
        sg.bigo.ads.r.b bVar = this.G;
        return bVar != null ? bVar.d : sg.bigo.ads.r.c.FILL_MATCH_SELF;
    }

    public final void G() {
        this.J.set(true);
    }

    public final void H() {
        this.J.set(false);
        if (sg.bigo.ads.r.f.a(this.y)) {
            sg.bigo.ads.r.f.a(this.y, new ValueCallback<Integer>() { // from class: sg.bigo.ads.k.n.14
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = n.this.K.iterator();
                    while (it.hasNext()) {
                        n.this.y.post((Runnable) it.next());
                    }
                    n.this.K.clear();
                    sg.bigo.ads.r.f.a(n.this.y, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.K.iterator();
        while (it.hasNext()) {
            this.y.post(it.next());
        }
        this.K.clear();
    }

    public void I() {
        if (C()) {
            return;
        }
        sg.bigo.ads.r.b bVar = this.G;
        int a = bVar != null ? bVar.a.a("video_play_page.multi_guide") : 0;
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(a, new Runnable() { // from class: sg.bigo.ads.k.n.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.this.y.post(new Runnable() { // from class: sg.bigo.ads.k.n.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                n nVar = n.this;
                                if (nVar.y.g) {
                                    return;
                                }
                                n.a(nVar, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.y.setFlipInterval((a - 5) * 1000);
                this.y.c();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J() {
        T t;
        int i;
        boolean z;
        Iterator<View> it;
        T t2;
        sg.bigo.ads.ad.interstitial.x xVar = this.t;
        int i2 = xVar != null ? xVar.i : 0;
        View findViewById = this.r.findViewById(R.id.inter_media_container);
        sg.bigo.ads.y.a.a(findViewById, 9);
        sg.bigo.ads.y.a.a(this.y, 9);
        sg.bigo.ads.ad.interstitial.x xVar2 = this.t;
        if (xVar2 == null || !xVar2.g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.F;
            if (bVar != null && (t = bVar.l) != 0) {
                ((MediaView) t).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup = this.r;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.H;
            sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, hVar, 0);
            sg.bigo.ads.y.a.a(this.r, this.y, 8, hVar, 0);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar2 = this.F;
            if (bVar2 != null && (t2 = bVar2.l) != 0) {
                ((MediaView) t2).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.y.a.a(this.r, findViewById, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i2);
            sg.bigo.ads.y.a.a(this.r, this.y, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i2);
        }
        if (!C()) {
            sg.bigo.ads.r.b bVar3 = this.G;
            int a = bVar3 != null ? bVar3.a.a("video_play_page.multi_click_type") : 1;
            i = 3;
            if (a != 2) {
                if (a == 3) {
                    if (i2 == 1 || i2 == 2) {
                        z = true;
                        sg.bigo.ads.ad.interstitial.x xVar3 = this.t;
                        boolean z2 = xVar3 == null && xVar3.f;
                        a(i2, z2, i, z);
                        it = this.y.getItems().iterator();
                        while (it.hasNext()) {
                            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
                            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                                sg.bigo.ads.y.a.a(dVar.j, 5);
                                ViewGroup viewGroup2 = this.r;
                                RoundedFrameLayout roundedFrameLayout = dVar.j;
                                if (z2) {
                                    sg.bigo.ads.y.b bVar4 = ((sg.bigo.ads.ad.interstitial.u) this).c;
                                    if (z) {
                                        sg.bigo.ads.y.a.a(viewGroup2, roundedFrameLayout, 8, bVar4, this.I);
                                    } else {
                                        sg.bigo.ads.y.a.a(viewGroup2, roundedFrameLayout, 8, bVar4, i);
                                    }
                                } else {
                                    sg.bigo.ads.y.a.a(viewGroup2, roundedFrameLayout, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
                                }
                            }
                        }
                    }
                }
            }
            z = false;
            sg.bigo.ads.ad.interstitial.x xVar32 = this.t;
            if (xVar32 == null) {
            }
            a(i2, z2, i, z);
            it = this.y.getItems().iterator();
            while (it.hasNext()) {
            }
        }
        i = i2;
        z = false;
        sg.bigo.ads.ad.interstitial.x xVar322 = this.t;
        if (xVar322 == null) {
        }
        a(i2, z2, i, z);
        it = this.y.getItems().iterator();
        while (it.hasNext()) {
        }
    }

    public final boolean K() {
        View a;
        ViewFlow viewFlow = this.y;
        if (viewFlow == null) {
            return false;
        }
        List<View> items = viewFlow.getItems();
        if (sg.bigo.ads.common.utils.l.a((Collection) items) || items.size() != 1 || (a = this.y.a(0)) == null) {
            return false;
        }
        Object tag = a.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
            sg.bigo.ads.r.c cVar = sg.bigo.ads.r.c.FILL_MATCH_PARENT;
            dVar.a(cVar);
            dVar.a(4);
            this.y.setViewStyle(3);
            ((ViewFlow.b) a.getLayoutParams()).d = cVar.d;
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.k.a, sg.bigo.ads.ad.interstitial.u
    public final void f() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.F;
        if (bVar != null) {
            ((MediaView) bVar.l).c();
        }
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final ViewGroup k() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.F;
        if (bVar != null) {
            return bVar.k;
        }
        return null;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final MediaView l() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.F;
        if (bVar != null) {
            return (MediaView) bVar.l;
        }
        return null;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final Button m() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.F;
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // sg.bigo.ads.k.a
    public final void p() {
        super.p();
        synchronized (this.H) {
            try {
                if (!this.H.isEmpty()) {
                    final HashSet hashSet = new HashSet(this.H);
                    this.H.clear();
                    a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.n.11
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 == null) {
                                synchronized (n.this.H) {
                                    n.this.H.addAll(hashSet);
                                }
                                return;
                            }
                            for (sg.bigo.ads.ad.interstitial.multi_img.view.d dVar : hashSet) {
                                if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                                    ((sg.bigo.ads.ad.interstitial.multi_img.view.b) dVar).a(bitmap2);
                                } else if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.a) {
                                    ((sg.bigo.ads.ad.interstitial.multi_img.view.a) dVar).a(bitmap2);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.k.a
    public void t() {
        n nVar = this;
        super.t();
        Context context = nVar.r.getContext();
        sg.bigo.ads.r.b bVar = nVar.G;
        List<String> a = bVar != null ? bVar.a() : null;
        sg.bigo.ads.r.b bVar2 = nVar.G;
        boolean z = bVar2 != null && bVar2.e;
        sg.bigo.ads.r.d E = nVar.E();
        sg.bigo.ads.r.c F = nVar.F();
        sg.bigo.ads.an.p a2 = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) nVar).c);
        nVar.y = (ViewFlow) nVar.r.findViewById(R.id.inter_media_ad_view_flow);
        nVar.z = (Indicator) nVar.r.findViewById(R.id.inter_vf_indicator);
        int x = nVar.x();
        if (x == 3 || x == 4) {
            nVar.E = new sg.bigo.ads.r.a(nVar.r, nVar.y, nVar.p, x);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, F, nVar.z(), nVar.w(), x);
        nVar.F = bVar3;
        nVar.A = bVar3.j;
        ((MediaView) bVar3.l).setImageBlurBorder(false);
        nVar.F.a(a2.b, a2.c);
        if (nVar.F.b()) {
            final boolean aZ = ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) nVar).c.f()).aZ();
            if (aZ) {
                synchronized (nVar.H) {
                    nVar.H.add(nVar.F);
                }
            }
            if (nVar.E != null) {
                nVar.F.r = new d.a() { // from class: sg.bigo.ads.k.n.8
                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        n nVar2 = n.this;
                        n.this.E.a(nVar2.y.a(nVar2.F.j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        n.this.F.r = null;
                        a();
                    }
                };
            }
            nVar.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.n.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        if (aZ) {
                            synchronized (n.this.H) {
                                n.this.H.remove(n.this.F);
                            }
                        }
                        n.this.F.a(bitmap2);
                    }
                }
            });
        }
        nVar.B = (LinearLayout) nVar.r.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.r.a((CharSequence) ((sg.bigo.ads.ad.interstitial.u) nVar).c.getWarning())) {
            ((ViewGroup.MarginLayoutParams) nVar.B.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.f.a(context, 8);
        }
        nVar.a(nVar.q);
        if (nVar.G != null) {
            nVar.y.setDividerWidth(sg.bigo.ads.common.utils.f.a(context, E.f));
            nVar.y.setContentMaxWidthSpace(sg.bigo.ads.common.utils.f.a(context, E.i));
            nVar.y.setViewStyle(E.j);
            nVar.y.setOnItemChangeListener(new sg.bigo.ads.r.f(E, nVar.z, nVar.E));
            int i = 0;
            int i2 = 0;
            while (a != null && i2 < a.size()) {
                String str = a.get(i2);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    nVar.a(context, F, x, str, ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) nVar).c.f()).am());
                    i++;
                }
                i2++;
                nVar = this;
            }
            int max = Math.max(E == sg.bigo.ads.r.d.CENTER ? 2 - i : 0, 0);
            if (z) {
                max = Math.max(max, 1);
            }
            int i3 = 0;
            while (i3 < max) {
                int i4 = i + 1;
                final sg.bigo.ads.ad.interstitial.multi_img.view.a a3 = a(context, F, x, (String) null, false);
                final boolean aZ2 = ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) this).c.f()).aZ();
                if (aZ2) {
                    synchronized (this.H) {
                        this.H.add(a3);
                    }
                }
                a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.n.10
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            if (aZ2) {
                                synchronized (n.this.H) {
                                    n.this.H.remove(a3);
                                }
                            }
                            a3.a(bitmap2);
                        }
                    }
                });
                i3++;
                i = i4;
            }
            nVar = this;
            sg.bigo.ads.r.d dVar = sg.bigo.ads.r.d.CENTER;
            int i5 = E == dVar ? i >> 1 : 0;
            ViewFlow.b bVar4 = new ViewFlow.b();
            bVar4.a = a2.b;
            bVar4.b = a2.c;
            bVar4.c = true;
            bVar4.d = F.d;
            nVar.y.addView(nVar.A, Math.max(0, i5), bVar4);
            int i6 = AnonymousClass6.a[E.ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.k.n.3
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        ((sg.bigo.ads.ad.interstitial.u) n.this).c.a((sg.bigo.ads.an.i) null, 8, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
                nVar.C = cVar;
                nVar.y.setStartView(cVar.a);
                nVar.y.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
                nVar.D = cVar2;
                nVar.y.setEndView(cVar2.a);
                nVar.y.setOnEndViewShowListener(dVar2);
            }
            int a4 = E == dVar ? nVar.y.a(nVar.A) : 0;
            nVar.y.b(a4);
            sg.bigo.ads.r.a aVar = nVar.E;
            if (aVar != null) {
                aVar.b(a4);
            }
        }
        nVar.b(nVar.y());
        nVar.I();
    }

    public boolean z() {
        return false;
    }

    public void b(int i) {
    }

    @Override // sg.bigo.ads.k.a
    public void a(double d) {
        if (d <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.C;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.D;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.C;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.D;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    public void a(int i, boolean z, int i2, boolean z2) {
        T t;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.F;
        if (bVar == null || (t = bVar.l) == 0) {
            return;
        }
        if (z2) {
            sg.bigo.ads.y.a.a(this.r, t, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.I);
        } else {
            sg.bigo.ads.y.a.a(this.r, t, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i2);
        }
        if (z) {
            ((MediaView) this.F.l).setMediaAreaClickable(true);
            ((MediaView) this.F.l).b().a(false);
        } else {
            ((MediaView) this.F.l).setMediaAreaClickable(false);
            ((MediaView) this.F.l).b().a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, final u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        super.a(viewGroup, view, new u.a() { // from class: sg.bigo.ads.k.n.7
            @Override // sg.bigo.ads.ad.interstitial.u.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView != null && textView.getTag() == 2 && sg.bigo.ads.common.utils.r.a((CharSequence) str2)) {
                    str2 = ((sg.bigo.ads.ad.interstitial.u) n.this).c.getDescription();
                }
                u.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i, i2, i3, viewArr);
        J();
    }

    public final void a(sg.bigo.ads.ad.interstitial.a aVar, @NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.x xVar, @NonNull sg.bigo.ads.r.b bVar, sg.bigo.ads.ad.interstitial.f fVar) {
        this.G = bVar;
        a(aVar, viewGroup, xVar, bVar.a, fVar);
    }

    public void a(sg.bigo.ads.ad.interstitial.r rVar) {
    }

    public static /* synthetic */ void a(n nVar, final long j, long j2, final long j3) {
        if (j > 0) {
            ViewFlow viewFlow = nVar.y;
            if (!viewFlow.g && !viewFlow.e()) {
                nVar.y.setScrollEnabled(false);
                int a = sg.bigo.ads.common.utils.f.a(nVar.r.getContext(), 40);
                final int scrollX = nVar.y.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, a, 0);
                ofInt.setDuration(2 * j3);
                ofInt.setStartDelay(j2);
                ofInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.k.n.12
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        n.a(n.this, j - 1, 300L, j3);
                    }
                };
                ofInt.addListener(animatorListenerAdapter);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.k.n.13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (n.this.J.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            n.this.K.add(new Runnable() { // from class: sg.bigo.ads.k.n.13.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                                    n.a(n.this, j, 300L, j3);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            n.this.y.scrollTo(((Integer) animatedValue).intValue() + scrollX, n.this.y.getScrollY());
                        }
                    }
                });
                ofInt.start();
                return;
            }
        }
        nVar.y.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.k.a
    public final void r() {
    }

    @Override // sg.bigo.ads.k.a
    public final void s() {
    }
}
