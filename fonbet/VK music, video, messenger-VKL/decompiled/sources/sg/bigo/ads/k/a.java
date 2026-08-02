package sg.bigo.ads.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.WeakHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.bv.b;

/* loaded from: classes9.dex */
public abstract class a extends sg.bigo.ads.ad.interstitial.u {
    public static long l = sg.bigo.ads.ad.interstitial.v.c;
    public static long m = sg.bigo.ads.ad.interstitial.v.d;
    public static int n = sg.bigo.ads.ad.interstitial.v.e;
    protected final WeakHashMap<Object, ValueCallback<Bitmap>> o;
    protected final sg.bigo.ads.ad.interstitial.d p;
    protected sg.bigo.ads.ad.interstitial.r q;

    @Nullable
    protected ViewGroup r;
    protected ViewGroup s;

    @Nullable
    protected sg.bigo.ads.ad.interstitial.x t;

    @Nullable
    protected sg.bigo.ads.ai.o u;

    @Nullable
    protected sg.bigo.ads.ad.interstitial.f v;

    @Nullable
    protected TextView w;
    boolean x;
    private final ValueCallback<Double> y;
    private long z;

    /* renamed from: sg.bigo.ads.k.a$a, reason: collision with other inner class name */
    public static class C2498a {
        public final int a;
        public final boolean b;

        private C2498a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public /* synthetic */ C2498a(int i, boolean z, byte b) {
            this(i, z);
        }
    }

    public a(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
        this.o = new WeakHashMap<>();
        this.y = new ValueCallback<Double>() { // from class: sg.bigo.ads.k.a.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d) {
                Double d2 = d;
                if (d2 != null) {
                    sg.bigo.ads.ad.interstitial.r rVar = a.this.q;
                    if (rVar != null && rVar.ar() != null) {
                        a.this.q.ar().onReceiveValue(d2);
                    }
                    a.this.a(d2.doubleValue());
                }
            }
        };
        this.z = 0L;
        this.p = new sg.bigo.ads.ad.interstitial.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(sg.bigo.ads.ad.interstitial.u uVar, @Nullable sg.bigo.ads.ai.o oVar) {
        return uVar instanceof sg.bigo.ads.q.d ? ((sg.bigo.ads.q.d) uVar).I() : a(oVar, "video_play_page.webview_layout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(sg.bigo.ads.ad.interstitial.u uVar, @Nullable sg.bigo.ads.ai.o oVar) {
        return uVar instanceof sg.bigo.ads.q.d ? ((sg.bigo.ads.q.d) uVar).J() : a(oVar, "video_play_page.webview_force_time", "video_play_page.webview_force_time_new");
    }

    public abstract void a(double d);

    @Override // sg.bigo.ads.ad.interstitial.u
    @NonNull
    public final sg.bigo.ads.ad.interstitial.d e() {
        return this.p;
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public void f() {
        super.f();
        this.x = true;
    }

    public final Context j() {
        ViewGroup viewGroup = this.r;
        return viewGroup != null ? viewGroup.getContext() : ((sg.bigo.ads.ad.interstitial.u) this).c.b.e;
    }

    @Nullable
    public abstract ViewGroup k();

    @Nullable
    public abstract MediaView l();

    @Nullable
    public abstract Button m();

    public boolean n() {
        return false;
    }

    public void o() {
        int x = x();
        if (x == 2) {
            a(-16777216);
            return;
        }
        if (x == 3) {
            a(-16777216);
            r();
        } else if (x != 4) {
            a(-1);
        } else {
            a(-16777216);
            s();
        }
    }

    public void p() {
        if (this.o.isEmpty()) {
            return;
        }
        a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.a.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    synchronized (a.this.o) {
                        try {
                            Iterator<ValueCallback<Bitmap>> it = a.this.o.values().iterator();
                            while (it.hasNext()) {
                                it.next().onReceiveValue(bitmap2);
                            }
                            a.this.o.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        });
    }

    public void q() {
        String j = ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) this).c.f()).j();
        TextView textView = (TextView) this.r.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.r.findViewById(R.id.inter_ad_label);
        if (textView != null) {
            if (TextUtils.isEmpty(j)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(j);
            textView.setPadding(sg.bigo.ads.common.utils.f.a(this.r.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView.getContext(), 1), sg.bigo.ads.common.utils.f.a(textView.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
        }
    }

    public void r() {
        Integer a = sg.bigo.ads.ad.interstitial.s.a((NativeAd) ((sg.bigo.ads.ad.interstitial.u) this).c);
        if (a != null) {
            a(a.intValue());
        } else {
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.a.4
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        synchronized (a.this.o) {
                            a aVar = a.this;
                            aVar.o.put(aVar.r, this);
                        }
                    } else {
                        final long j = a.a(a.this) ? a.m : 0L;
                        final Integer a2 = sg.bigo.ads.bv.b.a(bitmap2);
                        if (a2 != null) {
                            a.this.r.post(new Runnable() { // from class: sg.bigo.ads.k.a.4.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a aVar2 = a.this;
                                    sg.bigo.ads.bv.b.a(aVar2.r, aVar2.p.a(a2.intValue()), new b.a() { // from class: sg.bigo.ads.k.a.4.1.1
                                        @Override // sg.bigo.ads.bv.b.a
                                        public final long a() {
                                            return j;
                                        }
                                    });
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    public void s() {
        a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.a.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 == null) {
                    synchronized (a.this.o) {
                        a aVar = a.this;
                        aVar.o.put(aVar.r, this);
                    }
                } else {
                    a aVar2 = a.this;
                    if (aVar2.r != null) {
                        final long j = a.a(aVar2) ? a.m : 0L;
                        sg.bigo.ads.common.utils.e.a(a.this.r.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.a.5.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                                Bitmap bitmap4 = bitmap3;
                                Integer a = sg.bigo.ads.bv.b.a(bitmap4);
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(a.this.r.getResources(), bitmap4);
                                bitmapDrawable.setAlpha(0);
                                sg.bigo.ads.r.a.a(a.this.r, "adview_background_main_tag", bitmapDrawable);
                                sg.bigo.ads.ad.interstitial.c.a(0, a.n, j, new ValueCallback<Integer>() { // from class: sg.bigo.ads.k.a.5.1.1
                                    @Override // android.webkit.ValueCallback
                                    public final /* synthetic */ void onReceiveValue(Integer num) {
                                        Integer num2 = num;
                                        if (num2 != null) {
                                            bitmapDrawable.setAlpha(num2.intValue());
                                        }
                                    }
                                }, new ValueCallback<Void>() { // from class: sg.bigo.ads.k.a.5.1.2
                                    @Override // android.webkit.ValueCallback
                                    public final /* bridge */ /* synthetic */ void onReceiveValue(Void r1) {
                                    }
                                });
                                if (a != null) {
                                    a.this.p.a(a.intValue());
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final C2498a u() {
        sg.bigo.ads.ai.o oVar = this.u;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (oVar == null) {
            return new C2498a(-16736769, z, objArr2 == true ? 1 : 0);
        }
        boolean[] zArr = new boolean[1];
        return new C2498a(sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).c, oVar.a("video_play_page.cta_color"), zArr), true ^ zArr[0], objArr == true ? 1 : 0);
    }

    public boolean v() {
        sg.bigo.ads.ai.o oVar = this.u;
        if (oVar != null) {
            return oVar.c("video_play_page.is_cta_show_animation");
        }
        return false;
    }

    public final int w() {
        sg.bigo.ads.ai.o oVar = this.u;
        return sg.bigo.ads.r.e.a(oVar != null ? oVar.a("video_play_page.mediaview_colour") : 3);
    }

    public int x() {
        sg.bigo.ads.ai.o oVar = this.u;
        return sg.bigo.ads.r.e.a(oVar != null ? oVar.a("video_play_page.background_colour") : 1);
    }

    public int y() {
        sg.bigo.ads.ai.o oVar = this.u;
        if (oVar != null) {
            return oVar.a("video_play_page.ad_component_show_time");
        }
        return -1;
    }

    public static int a(@Nullable sg.bigo.ads.ai.o oVar, @Nullable String str) {
        int a = (oVar == null || sg.bigo.ads.common.utils.r.a((CharSequence) str)) ? 0 : oVar.a(str);
        if (a == 1 || a == 2 || a == 3 || a == 4 || a == 7 || a == 8) {
            return a;
        }
        return 0;
    }

    public static sg.bigo.ads.j.x b(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar, int i) {
        return i != 3 ? i != 5 ? i != 6 ? new sg.bigo.ads.j.x(bVar, oVar) : new sg.bigo.ads.j.aa(bVar, oVar) : new sg.bigo.ads.j.z(bVar, oVar) : new sg.bigo.ads.j.y(bVar, oVar);
    }

    public static int a(@Nullable sg.bigo.ads.ai.o oVar, @Nullable String str, @Nullable String str2) {
        int i;
        int i2;
        if (oVar == null || sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            i = 0;
            i2 = 0;
        } else {
            i2 = oVar.a(str, -1);
            i = sg.bigo.ads.common.utils.r.a((CharSequence) str2) ? 0 : oVar.a(str2, -1);
        }
        switch (i2) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i2;
            case 0:
            default:
                return 0;
            case 9:
                return Math.max(9, i + 9);
        }
    }

    @NonNull
    public static sg.bigo.ads.ad.interstitial.u a(@NonNull sg.bigo.ads.y.b bVar) {
        return new sg.bigo.ads.ad.interstitial.u(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static sg.bigo.ads.ad.interstitial.u a(@NonNull sg.bigo.ads.y.b bVar, int i) {
        if (bVar instanceof sg.bigo.ads.aj.f) {
            sg.bigo.ads.aj.f fVar = (sg.bigo.ads.aj.f) bVar;
            if (!fVar.i_()) {
                return fVar.I() == 3 ? i != 1 ? i != 2 ? i != 3 ? new sg.bigo.ads.l.a(bVar) : new sg.bigo.ads.l.c(bVar) : new sg.bigo.ads.l.b(bVar) : new sg.bigo.ads.l.a(bVar) : new sg.bigo.ads.m.a(bVar);
            }
        }
        switch (i) {
            case 13:
                return new o(bVar);
            case 14:
                return new p(bVar);
            case 15:
                return new q(bVar);
            case 16:
                return new r(bVar);
            case 17:
                return new s(bVar);
            case 18:
                return new t(bVar);
            case 19:
                return new b(bVar);
            case 20:
                return new c(bVar);
            case 21:
                return new d(bVar);
            case 22:
                return new e(bVar);
            case 23:
                return new f(bVar);
            case 24:
                return new g(bVar);
            case 25:
                return new h(bVar);
            case 26:
                return new i(bVar);
            case 27:
                return new j(bVar);
            case 28:
                return new k(bVar);
            case 29:
                return new l(bVar);
            case 30:
                return new m(bVar);
            case 31:
            case 32:
                sg.bigo.ads.an.p a = sg.bigo.ads.ad.interstitial.s.a(bVar);
                return ((31 == i || 32 == i) && a.a()) ? a.getWidth() / a.getHeight() > 0 ? new v(bVar) : 31 == i ? new u(bVar) : new w(bVar) : new sg.bigo.ads.ad.interstitial.u(bVar);
            default:
                return new sg.bigo.ads.ad.interstitial.u(bVar);
        }
    }

    public static x a(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar, int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? new y(bVar, oVar) : new ad(bVar, oVar) : new ac(bVar, oVar) : new ab(bVar, oVar) : new aa(bVar, oVar) : new z(bVar, oVar);
    }

    public void a(int i) {
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.p.a(i));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull ViewGroup viewGroup) {
    }

    public final void a(final TextView textView, final b.a aVar) {
        if (textView == null) {
            return;
        }
        Integer a = sg.bigo.ads.ad.interstitial.s.a((NativeAd) ((sg.bigo.ads.ad.interstitial.u) this).c);
        if (a == null) {
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.a.6
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        final int a2 = sg.bigo.ads.bv.b.a(bitmap2, -16736769);
                        textView.post(new Runnable() { // from class: sg.bigo.ads.k.a.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                sg.bigo.ads.ad.interstitial.d.a(textView, a2, aVar);
                            }
                        });
                    } else {
                        synchronized (a.this.o) {
                            a.this.o.put(textView, this);
                        }
                    }
                }
            });
        } else {
            sg.bigo.ads.ad.interstitial.d.a(textView, a.intValue(), aVar);
        }
    }

    public final boolean a(sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.x xVar, @NonNull sg.bigo.ads.ai.o oVar, sg.bigo.ads.ad.interstitial.f fVar) {
        ViewGroup viewGroup2;
        if (rVar == null) {
            return false;
        }
        this.q = rVar;
        this.r = viewGroup;
        if (viewGroup != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_media_container);
            this.s = viewGroup3;
            viewGroup2 = viewGroup3 == null ? this.r : null;
            this.t = xVar;
            this.u = oVar;
            this.v = fVar;
            this.w = (TextView) this.r.findViewById(R.id.inter_warning);
            sg.bigo.ads.common.utils.v.a(this.r, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.a.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    a.this.z = SystemClock.elapsedRealtime();
                }
            });
            o();
            t();
            q();
            this.p.a(this.y);
            return true;
        }
        this.s = viewGroup2;
        this.t = xVar;
        this.u = oVar;
        this.v = fVar;
        this.w = (TextView) this.r.findViewById(R.id.inter_warning);
        sg.bigo.ads.common.utils.v.a(this.r, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.a.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                a.this.z = SystemClock.elapsedRealtime();
            }
        });
        o();
        t();
        q();
        this.p.a(this.y);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(sg.bigo.ads.ad.interstitial.u uVar) {
        if (uVar instanceof sg.bigo.ads.q.d) {
            return ((sg.bigo.ads.q.d) uVar).K();
        }
        return false;
    }

    public static /* synthetic */ boolean a(a aVar) {
        return (aVar.z != 0 ? SystemClock.elapsedRealtime() - aVar.z : 0L) > l;
    }

    public void t() {
    }
}
