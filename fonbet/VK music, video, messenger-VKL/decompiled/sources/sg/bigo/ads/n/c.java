package sg.bigo.ads.n;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public final class c {
    public final t a;
    public final sg.bigo.ads.o.a b;
    public final sg.bigo.ads.o.c c;
    final sg.bigo.ads.u.a d;
    public IconAds e;
    public int f;
    public b h;
    public b i;
    public sg.bigo.ads.n.a j;
    public sg.bigo.ads.n.a k;
    public o l;
    public o m;
    public final a g = new a(0 == true ? 1 : 0);
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public List<NativeAd> q = new ArrayList();
    public List<NativeAd> r = new ArrayList();
    public Map<Integer, Boolean> s = new ConcurrentHashMap();
    public Map<Integer, Boolean> t = new ConcurrentHashMap();
    List<Integer> u = new ArrayList();
    List<Integer> v = new ArrayList();
    final sg.bigo.ads.api.d w = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.n.c.1
        private int a(@NonNull NativeAd nativeAd, @NonNull List<NativeAd> list) {
            c cVar = c.this;
            int a2 = sg.bigo.ads.o.b.a(cVar.p ? cVar.b : cVar.c);
            int indexOf = list.indexOf(nativeAd);
            if (a2 == 0) {
                return 0;
            }
            return indexOf / a2;
        }

        @Override // sg.bigo.ads.api.d
        public final void b(@NonNull NativeAd nativeAd) {
            o oVar = c.this.l;
            if (oVar != null) {
                oVar.b();
                c.this.l = null;
            }
            o oVar2 = c.this.m;
            if (oVar2 != null) {
                oVar2.b();
                c.this.m = null;
            }
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.o.b bVar;
            List<Integer> list;
            List<NativeAd> list2;
            Map<Integer, Boolean> map;
            c cVar = c.this;
            if (cVar.p) {
                bVar = cVar.b;
                list = cVar.u;
                list2 = cVar.q;
                map = cVar.s;
            } else {
                bVar = cVar.c;
                list = cVar.v;
                list2 = cVar.r;
                map = cVar.t;
            }
            c.a(bVar, list, list2, map, a(nativeAd, list2));
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd, @NonNull AdError adError) {
            adError.getCode();
            adError.getMessage();
        }

        @Override // sg.bigo.ads.api.d
        public final void c(@NonNull NativeAd nativeAd) {
        }

        @Override // sg.bigo.ads.api.d
        public final void d(@NonNull NativeAd nativeAd) {
        }
    };

    public static class a implements IconAdsRequest.b {
        public int a;

        private a() {
            this.a = 1;
        }

        @Override // sg.bigo.ads.api.IconAdsRequest.b
        public final int a() {
            return this.a;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static abstract class b implements Runnable {
        private long a;
        private boolean b;

        @NonNull
        public final ViewGroup c;

        @NonNull
        public final sg.bigo.ads.o.b d;
        private boolean e;
        private boolean f;

        private b(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.o.b bVar) {
            this.c = viewGroup;
            this.d = bVar;
            this.a = 0L;
            this.b = false;
            this.e = false;
            this.f = false;
        }

        public final ValueAnimator a(@Nullable Integer num) {
            if (num == null) {
                return null;
            }
            return sg.bigo.ads.bv.b.a(this.c, num.intValue(), new b.a() { // from class: sg.bigo.ads.n.c.b.1
                final /* synthetic */ long a = 300;

                @Override // sg.bigo.ads.bv.b.a
                public final long a() {
                    return this.a;
                }
            });
        }

        public abstract boolean a();

        public final void b() {
            this.b = true;
            this.e = false;
            this.c.removeCallbacks(this);
        }

        public final void c() {
            this.e = false;
            this.f = true;
            this.c.removeCallbacks(this);
        }

        public final boolean d() {
            if (this.b || this.e) {
                return false;
            }
            this.e = true;
            this.f = false;
            if (this.a == 0) {
                this.a = SystemClock.elapsedRealtime();
            }
            this.c.postDelayed(this, Math.max(this.d.j() - (SystemClock.elapsedRealtime() - this.a), 0L));
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.b && !this.f && a()) {
                this.b = true;
            }
            this.e = false;
        }

        public /* synthetic */ b(ViewGroup viewGroup, sg.bigo.ads.o.b bVar, byte b) {
            this(viewGroup, bVar);
        }

        public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable Integer num, final sg.bigo.ads.n.a aVar) {
            v.b(view);
            viewGroup.addView(view);
            sg.bigo.ads.as.a.a(view, 100.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            final ValueAnimator a = a(num);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 1.1f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.n.c.b.2
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    b.this.a(aVar);
                }

                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    ValueAnimator valueAnimator = a;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            });
            view.startAnimation(translateAnimation);
        }

        public void a(final sg.bigo.ads.n.a aVar) {
            if (aVar != null && aVar.c > 0) {
                aVar.b.post(new Runnable() { // from class: sg.bigo.ads.n.c.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.n.a aVar2 = aVar;
                        aVar2.b.setFlipInterval(aVar2.c);
                        aVar.b.c();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NonNull t tVar, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.u.a aVar) {
        this.a = tVar;
        this.b = new sg.bigo.ads.o.a(oVar);
        this.c = new sg.bigo.ads.o.c(oVar, aVar == null || aVar.g());
        this.d = aVar;
    }

    public static /* synthetic */ List a(IconAds iconAds) {
        if (!(iconAds instanceof sg.bigo.ads.e.a)) {
            if (iconAds != null) {
                return Arrays.asList(iconAds.getNativeAds());
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sg.bigo.ads.z.c cVar : ((sg.bigo.ads.e.a) iconAds).a) {
            if (!cVar.isExpired() && !cVar.i) {
                if (cVar.I) {
                    arrayList.add(cVar);
                } else if (!cVar.J) {
                    arrayList2.add(cVar);
                }
            }
        }
        arrayList.addAll(arrayList2);
        sg.bigo.ads.z.c[] cVarArr = new sg.bigo.ads.z.c[arrayList.size()];
        l.a(arrayList, cVarArr);
        return Arrays.asList(cVarArr);
    }

    private void d() {
        b();
        sg.bigo.ads.n.a aVar = this.j;
        if (aVar != null) {
            aVar.b.d();
            v.b(this.j.a);
        }
        this.j = null;
    }

    public final void b() {
        b bVar = this.h;
        if (bVar != null) {
            bVar.b();
        }
        this.h = null;
    }

    public final void c() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.b();
        }
        this.i = null;
    }

    public static /* synthetic */ o a(c cVar, final sg.bigo.ads.o.b bVar, final List list) {
        int o;
        if (bVar == null || !bVar.a() || (o = bVar.o()) < 0) {
            return null;
        }
        return new o(s.a.a(o)) { // from class: sg.bigo.ads.n.c.5
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                NativeAd nativeAd = (NativeAd) list.get(0);
                if (nativeAd instanceof sg.bigo.ads.y.b) {
                    sg.bigo.ads.z.c cVar2 = (sg.bigo.ads.z.c) nativeAd;
                    if (cVar2.g) {
                        return;
                    }
                    cVar2.a((sg.bigo.ads.an.i) null, bVar.b(), 22);
                }
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
            }
        };
    }

    public static void b(sg.bigo.ads.n.a aVar, b bVar) {
        if (aVar == null) {
            if (bVar != null) {
                bVar.d();
            }
        } else {
            int i = aVar.c;
            if (i > 0) {
                aVar.b.setFlipInterval(i);
                aVar.b.c();
            }
        }
    }

    public final void a(ViewGroup viewGroup, final int i) {
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) this.a.f(), i);
        this.p = true;
        if (viewGroup == null) {
            a(this.b, "endPageView is null", i);
            return;
        }
        if (sg.bigo.ads.o.b.b(this.b)) {
            a(this.b, "config is invalid", i);
            return;
        }
        if (!a(i)) {
            a(this.b, "icon request hasScene return false", i);
            return;
        }
        d();
        b bVar = new b(viewGroup, this.b) { // from class: sg.bigo.ads.n.c.3
            {
                byte b2 = 0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
            
                if (r3 == 1) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
            
                if (r3 == 2) goto L34;
             */
            @Override // sg.bigo.ads.n.c.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean a() {
                ViewGroup viewGroup2;
                c cVar;
                sg.bigo.ads.o.a aVar;
                String str;
                sg.bigo.ads.o.a aVar2;
                String str2;
                c cVar2 = c.this;
                if (cVar2.e == null) {
                    aVar2 = cVar2.b;
                    str2 = "icon ads is null";
                } else {
                    if (!cVar2.n) {
                        if (cVar2.a()) {
                            cVar = c.this;
                            aVar = cVar.b;
                            str = "host ad is destroyed";
                        } else {
                            List a2 = c.a(c.this.e);
                            if (!l.a((Collection) a2)) {
                                boolean a3 = c.this.b.a();
                                c cVar3 = c.this;
                                int i2 = i;
                                if (i2 != 1) {
                                    sg.bigo.ads.o.a aVar3 = cVar3.b;
                                    if (aVar3 != null && a3) {
                                        int d = aVar3.d();
                                        if (i2 == 4) {
                                        }
                                        if (i2 == 8) {
                                            if (d != 1) {
                                            }
                                        }
                                    }
                                    cVar = c.this;
                                    aVar = cVar.b;
                                    str = "icon ads can not show in this scene";
                                }
                                if (v.c(this.c) && v.d(this.c)) {
                                    c.a(c.this, i);
                                    c cVar4 = c.this;
                                    Context context = this.c.getContext();
                                    c cVar5 = c.this;
                                    cVar4.j = sg.bigo.ads.n.a.a(context, cVar5.b, a2, cVar5.q);
                                    c.a(c.this, a3);
                                    ViewGroup viewGroup3 = this.c;
                                    if (a3 && (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.word_icon_container)) != null) {
                                        viewGroup3 = viewGroup2;
                                    }
                                    sg.bigo.ads.n.a aVar4 = c.this.j;
                                    a(viewGroup3, aVar4.a, null, aVar4);
                                    c cVar6 = c.this;
                                    cVar6.l = c.a(cVar6, cVar6.b, cVar6.q);
                                    o oVar = c.this.l;
                                    if (oVar != null) {
                                        oVar.c();
                                    }
                                    c.a(c.this, this.d, i, a2);
                                }
                                c.this.b();
                                return true;
                            }
                            cVar = c.this;
                            aVar = cVar.b;
                            str = "icon ads download failed";
                        }
                        cVar.a(aVar, str, i);
                        c.this.b();
                        return true;
                    }
                    aVar2 = cVar2.b;
                    str2 = "page is Paused";
                }
                cVar2.a(aVar2, str2, i);
                return false;
            }
        };
        this.h = bVar;
        bVar.d();
    }

    public static void a(sg.bigo.ads.n.a aVar, b bVar) {
        if (aVar != null) {
            aVar.b.d();
        } else if (bVar != null) {
            bVar.c();
        }
    }

    public static /* synthetic */ void a(c cVar, int i) {
        Ad ad = cVar.e;
        if (ad instanceof sg.bigo.ads.aj.g) {
            ((sg.bigo.ads.aj.g) ad).b = i;
        }
    }

    public static /* synthetic */ void a(c cVar, sg.bigo.ads.o.b bVar, int i, List list) {
        if (bVar == null || list == null) {
            return;
        }
        sg.bigo.ads.da.b.a(cVar.a.f(), i, bVar.i(), cVar.o, list.size(), bVar.f(), bVar.a());
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        Ad ad = cVar.e;
        if (ad instanceof sg.bigo.ads.aj.g) {
            ((sg.bigo.ads.aj.g) ad).c = z;
        }
    }

    public final void a(sg.bigo.ads.o.b bVar, String str, int i) {
        if (bVar != null) {
            sg.bigo.ads.da.b.a(this.a.f(), str, i, bVar.i(), this.o, bVar.f());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0043, code lost:
    
        if (r2 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004a, code lost:
    
        r3 = r3 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[LOOP:0: B:14:0x0052->B:16:0x0058, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(sg.bigo.ads.o.b bVar, List list, List list2, Map map, int i) {
        int i2;
        if (bVar == null || l.a((Collection) list2) || i < 0) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(map.get(Integer.valueOf(i)))) {
            return;
        }
        map.put(Integer.valueOf(i), bool);
        boolean z = i == 0;
        int m = bVar.m();
        if (m != 0) {
            int a2 = sg.bigo.ads.o.b.a(bVar);
            int n = bVar.n();
            if (m != 1) {
                if (m != 2) {
                    if (m == 3) {
                        i2 = a2 + n;
                    }
                }
                if (i2 > 0) {
                    while (list.size() <= i) {
                        list.add(0);
                    }
                    list.set(i, i > 0 ? Integer.valueOf(((Integer) list.get(i - 1)).intValue() + i2) : Integer.valueOf(i2));
                    int intValue = i > 0 ? ((Integer) list.get(i - 1)).intValue() : 0;
                    int min = Math.min(i2 + intValue, list2.size());
                    while (intValue < min) {
                        NativeAd nativeAd = (NativeAd) list2.get(intValue);
                        if (nativeAd instanceof sg.bigo.ads.z.c) {
                            sg.bigo.ads.z.c cVar = (sg.bigo.ads.z.c) nativeAd;
                            sg.bigo.ads.df.b bVar2 = cVar.d;
                            if (!(bVar2 instanceof sg.bigo.ads.df.a ? ((sg.bigo.ads.df.a) bVar2).a.get() : false)) {
                                sg.bigo.ads.df.b bVar3 = cVar.d;
                                if (bVar3 instanceof sg.bigo.ads.df.a) {
                                    sg.bigo.ads.df.a aVar = (sg.bigo.ads.df.a) bVar3;
                                    if (!aVar.a.get()) {
                                        aVar.a(cVar.b.e);
                                    }
                                }
                            }
                        }
                        intValue++;
                    }
                    return;
                }
                return;
            }
            if (z) {
                i2 = n + a2;
                if (i2 > 0) {
                }
            }
        }
        i2 = 0;
        if (i2 > 0) {
        }
    }

    public final boolean a() {
        t tVar = this.a;
        return tVar.i || tVar.K().i;
    }

    public final boolean a(int i) {
        return (this.f & i) == i;
    }
}
