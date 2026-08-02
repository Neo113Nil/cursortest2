package sg.bigo.ads.j;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.y.a;

/* loaded from: classes9.dex */
public abstract class b extends a {
    protected final sg.bigo.ads.ad.interstitial.d p;
    protected final sg.bigo.ads.r.b q;
    protected ViewFlow r;
    protected Indicator s;
    protected LinearLayout t;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c u;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c v;
    protected sg.bigo.ads.r.a w;
    private final ValueCallback<Double> x;
    private final AtomicBoolean y;
    private final List<Runnable> z;

    /* renamed from: sg.bigo.ads.j.b$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
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

    public b(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @NonNull sg.bigo.ads.r.b bVar2, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, cVar);
        this.x = new ValueCallback<Double>() { // from class: sg.bigo.ads.j.b.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d) {
                Double d2 = d;
                if (d2 != null) {
                    b.this.b(d2.doubleValue());
                }
            }
        };
        this.y = new AtomicBoolean(false);
        this.z = new ArrayList();
        this.q = bVar2;
        this.p = new sg.bigo.ads.ad.interstitial.d();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(final sg.bigo.ads.ad.interstitial.r rVar, sg.bigo.ads.r.c cVar, int i, String str, boolean z) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(this.k.getContext(), this.q, cVar, e(), i, str, z, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.j.b.12
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                sg.bigo.ads.ad.interstitial.v.a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.j.b.12.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
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
        this.r.addView(aVar.j, bVar);
        if (this.w != null) {
            aVar.r = new d.a() { // from class: sg.bigo.ads.j.b.2
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    b.this.w.a(b.this.r.a(aVar.j));
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

    public final boolean l() {
        sg.bigo.ads.r.b bVar = this.q;
        return bVar == null || bVar.b == sg.bigo.ads.r.d.NONE;
    }

    public final void m() {
        this.y.set(true);
    }

    public final void n() {
        this.y.set(false);
        if (sg.bigo.ads.r.f.a(this.r)) {
            sg.bigo.ads.r.f.a(this.r, new ValueCallback<Integer>() { // from class: sg.bigo.ads.j.b.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = b.this.z.iterator();
                    while (it.hasNext()) {
                        b.this.r.post((Runnable) it.next());
                    }
                    b.this.z.clear();
                    sg.bigo.ads.r.f.a(b.this.r, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.z.iterator();
        while (it.hasNext()) {
            this.r.post(it.next());
        }
        this.z.clear();
    }

    public void b(double d) {
        if (d <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.u;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.v;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.u;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.v;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    @Override // sg.bigo.ads.j.a
    public final void d(sg.bigo.ads.ad.interstitial.r rVar) {
        b bVar = this;
        Context context = bVar.k.getContext();
        sg.bigo.ads.r.b bVar2 = bVar.q;
        List<String> a = bVar2 != null ? bVar2.a() : null;
        sg.bigo.ads.r.b bVar3 = bVar.q;
        boolean z = bVar3 != null && bVar3.e;
        sg.bigo.ads.r.d dVar = bVar3 != null ? bVar3.b : sg.bigo.ads.r.d.NONE;
        sg.bigo.ads.r.c cVar = bVar3 != null ? bVar3.d : sg.bigo.ads.r.c.FILL_MATCH_SELF;
        sg.bigo.ads.an.p a2 = sg.bigo.ads.ad.interstitial.s.a(bVar.f);
        bVar.r = (ViewFlow) bVar.l.findViewById(R.id.inter_media_ad_view_flow);
        bVar.s = (Indicator) bVar.l.findViewById(R.id.inter_vf_indicator);
        sg.bigo.ads.ai.o oVar = bVar.g;
        int a3 = sg.bigo.ads.r.e.a(oVar != null ? oVar.a("endpage.background_colour") : 1);
        if (a3 == 2) {
            bVar.l.setBackgroundColor(bVar.p.a(-16777216));
        } else if (a3 == 3 || a3 == 4) {
            bVar.l.setBackgroundColor(bVar.p.a(-16777216));
            bVar.w = new sg.bigo.ads.r.a(bVar.l, bVar.r, bVar.p, a3);
        } else {
            bVar.l.setBackgroundColor(bVar.p.a(-1));
        }
        bVar.t = (LinearLayout) bVar.l.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.r.a((CharSequence) bVar.f.getWarning())) {
            ((ViewGroup.MarginLayoutParams) bVar.t.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.f.a(context, 8);
        }
        g(rVar);
        bVar.p.a(bVar.x);
        if (bVar.q != null) {
            Context context2 = bVar.k.getContext();
            bVar.r.setDividerWidth(sg.bigo.ads.common.utils.f.a(context2, dVar.f));
            bVar.r.setContentMaxWidthSpace(sg.bigo.ads.common.utils.f.a(context2, dVar.i));
            bVar.r.setViewStyle(dVar.j);
            bVar.r.setOnItemChangeListener(new sg.bigo.ads.r.f(dVar, bVar.s, bVar.w));
            int i = 0;
            int i2 = 0;
            while (a != null && i2 < a.size()) {
                String str = a.get(i2);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    bVar.a(rVar, cVar, a3, str, ((sg.bigo.ads.cp.a) bVar.f.f()).am());
                    i++;
                }
                i2++;
                bVar = this;
            }
            int max = Math.max(dVar == sg.bigo.ads.r.d.CENTER ? 3 - i : 0, 0);
            if (z) {
                max = Math.max(max, 1);
            }
            int i3 = max;
            for (int i4 = 0; i4 < i3; i4++) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a a4 = a(rVar, cVar, a3, (String) null, false);
                sg.bigo.ads.ad.interstitial.v.a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.j.b.6
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        a4.a(bitmap);
                    }
                });
            }
            bVar = this;
            bVar.r.setMainChildSize(a2);
            int i5 = AnonymousClass4.a[dVar.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.j.b.11
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        b.this.f.a((sg.bigo.ads.an.i) null, 4, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, true);
                bVar.u = cVar2;
                bVar.r.setStartView(cVar2.a);
                bVar.r.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, false);
                bVar.v = cVar3;
                bVar.r.setEndView(cVar3.a);
                bVar.r.setOnEndViewShowListener(dVar2);
            }
            int itemCount = dVar == sg.bigo.ads.r.d.CENTER ? bVar.r.getItemCount() >> 1 : 0;
            bVar.r.b(itemCount);
            sg.bigo.ads.r.a aVar = bVar.w;
            if (aVar != null) {
                aVar.b(itemCount);
            }
        }
        if (bVar.l()) {
            return;
        }
        sg.bigo.ads.r.b bVar4 = bVar.q;
        int a5 = bVar4 != null ? bVar4.a.a("endpage.multi_guide") : 0;
        switch (a5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                bVar.a(a5, new Runnable() { // from class: sg.bigo.ads.j.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.r.post(new Runnable() { // from class: sg.bigo.ads.j.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b bVar5 = b.this;
                                if (bVar5.r.g) {
                                    return;
                                }
                                b.a(bVar5, 3L, 0L, 300L);
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
                bVar.r.setFlipInterval((a5 - 5) * 1000);
                bVar.r.c();
                break;
        }
    }

    @Override // sg.bigo.ads.j.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r8 != 2) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // sg.bigo.ads.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, boolean z, boolean z2) {
        boolean z3;
        Iterator<View> it;
        List<View> items = this.r.getItems();
        sg.bigo.ads.y.a.a(this.l, 9);
        sg.bigo.ads.y.a.a(this.r, 9);
        if (z2) {
            sg.bigo.ads.y.a.a(this.k, this.l, 4, this.f, i);
            sg.bigo.ads.y.a.a(this.k, this.r, 4, this.f, i);
        } else {
            ViewGroup viewGroup = this.k;
            ViewGroup viewGroup2 = this.l;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.H;
            sg.bigo.ads.y.a.a(viewGroup, viewGroup2, 4, hVar, 0);
            sg.bigo.ads.y.a.a(this.k, this.r, 4, hVar, 0);
        }
        if (!l()) {
            sg.bigo.ads.r.b bVar = this.q;
            z3 = true;
            int a = bVar != null ? bVar.a.a("endpage.multi_click_type") : 1;
            if (a != 2) {
                if (a == 3) {
                    if (i != 1) {
                    }
                    i = 3;
                    it = items.iterator();
                    while (it.hasNext()) {
                        Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
                        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                            sg.bigo.ads.y.a.a(dVar.j, 5);
                            ViewGroup viewGroup3 = this.k;
                            RoundedFrameLayout roundedFrameLayout = dVar.j;
                            if (z) {
                                sg.bigo.ads.y.b bVar2 = this.f;
                                if (z3) {
                                    sg.bigo.ads.y.a.a(viewGroup3, roundedFrameLayout, 4, bVar2, new a.InterfaceC2508a() { // from class: sg.bigo.ads.j.b.3
                                        @Override // sg.bigo.ads.y.a.InterfaceC2508a
                                        public final boolean a() {
                                            return b.this.r.h;
                                        }
                                    });
                                } else {
                                    sg.bigo.ads.y.a.a(viewGroup3, roundedFrameLayout, 4, bVar2, i);
                                }
                            } else {
                                sg.bigo.ads.y.a.a(viewGroup3, roundedFrameLayout, 4, sg.bigo.ads.ad.interstitial.r.H, 0);
                            }
                        }
                    }
                }
            }
            z3 = false;
            i = 3;
            it = items.iterator();
            while (it.hasNext()) {
            }
        }
        z3 = false;
        it = items.iterator();
        while (it.hasNext()) {
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, View view) {
    }

    public static /* synthetic */ void a(b bVar, final long j, long j2, final long j3) {
        if (j > 0) {
            ViewFlow viewFlow = bVar.r;
            if (!viewFlow.g && !viewFlow.e()) {
                bVar.r.setScrollEnabled(false);
                int a = sg.bigo.ads.common.utils.f.a(bVar.k.getContext(), 40);
                final int scrollX = bVar.r.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, a, 0);
                ofInt.setDuration(2 * j3);
                ofInt.setStartDelay(j2);
                ofInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.j.b.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a(b.this, j - 1, 300L, j3);
                    }
                };
                ofInt.addListener(animatorListenerAdapter);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.j.b.8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (b.this.y.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            b.this.z.add(new Runnable() { // from class: sg.bigo.ads.j.b.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    b.a(b.this, j, 300L, j3);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            b.this.r.scrollTo(((Integer) animatedValue).intValue() + scrollX, b.this.r.getScrollY());
                        }
                    }
                });
                ofInt.start();
                return;
            }
        }
        bVar.r.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, @NonNull View view, final u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        return super.a(rVar, viewGroup, view, new u.a() { // from class: sg.bigo.ads.j.b.5
            @Override // sg.bigo.ads.ad.interstitial.u.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView.getTag() == 2 && sg.bigo.ads.common.utils.r.a((CharSequence) str2)) {
                    str2 = b.this.f.getDescription();
                }
                u.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i, i2, i3, viewArr);
    }

    public void g(sg.bigo.ads.ad.interstitial.r rVar) {
    }
}
