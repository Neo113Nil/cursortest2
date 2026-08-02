package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.views.Html5View;
import com.my.target.nativeads.views.CollageView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c9z0;
import xsna.exy0;
import xsna.o5z0;
import xsna.scz0;
import xsna.scz0.b;
import xsna.w5z0.a;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class dhy0 implements exy0.a {
    public final ug A;
    public final boolean b;
    public final d9z0 c;
    public final x1z0 d;
    public final izy0 e;
    public final suy0 f;
    public final oaz0 g;
    public final kly0 h;
    public final c9z0.a i;
    public final chy0 j;
    public final w5z0 k;
    public boolean m;
    public boolean n;
    public boolean p;
    public ady0 q;
    public scz0 r;
    public Parcelable s;
    public ubz0 t;
    public a u;
    public zu50.a v;
    public phv w;
    public shv x;
    public long y;
    public final tg z;
    public int l = 0;
    public boolean o = true;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a implements View.OnClickListener {
        public final z6z0 b;
        public final c9z0.a c;

        public a(z6z0 z6z0Var, c9z0.a aVar) {
            this.b = z6z0Var;
            this.c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            w7z0 w7z0Var = new w7z0(this.b);
            w7z0Var.f = this.c;
            j7z0 j7z0Var = new j7z0(w7z0Var, view.getContext());
            w7z0Var.d = new WeakReference(j7z0Var);
            try {
                j7z0Var.show();
            } catch (Throwable th) {
                th.printStackTrace();
                gu8.e(null, "Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
                w7z0Var.m();
            }
        }
    }

    public dhy0(x1z0 x1z0Var, c9z0.a aVar, d9z0 d9z0Var, zu50.a aVar2, i620 i620Var, boolean z) {
        this.i = aVar;
        this.d = x1z0Var;
        ArrayList s = x1z0Var.s();
        e5z0 e5z0Var = x1z0Var.a;
        this.b = s.size() > 0;
        this.c = d9z0Var;
        wty0 wty0Var = x1z0Var.L;
        w5z0 w5z0Var = new w5z0(wty0Var, i620Var, aVar);
        if (wty0Var != null) {
            w5z0Var.h = w5z0Var.new a();
        }
        this.k = w5z0Var;
        this.z = new tg(this, 12);
        this.A = new ug(this, 13);
        this.v = aVar2;
        lgz0 lgz0Var = x1z0Var.W;
        this.m = (lgz0Var == null || lgz0Var.v0 == null) ? false : true;
        this.e = new izy0(x1z0Var.b, x1z0Var.a, lgz0Var == null, z, null, x1z0Var.b0);
        this.f = z ? null : suy0.a(e5z0Var, null);
        this.g = new oaz0(e5z0Var);
        this.j = new chy0(this);
        this.h = kly0.g(e5z0Var.c(1), e5z0Var.c(2), x1z0Var.b0, null);
    }

    public static void a(View.OnClickListener onClickListener, View view) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void d(ubz0 ubz0Var, tg tgVar, ug ugVar) {
        ArrayList b = ubz0Var.b();
        if (b != null && !b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                a(tgVar, (View) it.next());
            }
            a(ugVar, ubz0Var.c());
            return;
        }
        Iterator it2 = ubz0Var.f().iterator();
        while (it2.hasNext()) {
            a(tgVar, (View) it2.next());
        }
        WeakReference weakReference = ubz0Var.i;
        a(tgVar, weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = ubz0Var.j;
        a(tgVar, weakReference2 != null ? (View) weakReference2.get() : null);
        WeakReference weakReference3 = ubz0Var.k;
        a(tgVar, weakReference3 != null ? (View) weakReference3.get() : null);
        WeakReference weakReference4 = ubz0Var.l;
        a(tgVar, weakReference4 != null ? (View) weakReference4.get() : null);
        WeakReference weakReference5 = ubz0Var.m;
        a(tgVar, weakReference5 != null ? (View) weakReference5.get() : null);
        a(tgVar, ubz0Var.d());
        WeakReference weakReference6 = ubz0Var.p;
        a(tgVar, weakReference6 != null ? (View) weakReference6.get() : null);
        WeakReference weakReference7 = ubz0Var.n;
        a(tgVar, weakReference7 != null ? (View) weakReference7.get() : null);
        WeakReference weakReference8 = ubz0Var.o;
        a(tgVar, weakReference8 != null ? (View) weakReference8.get() : null);
        a(ugVar, ubz0Var.c());
    }

    @Override // xsna.exy0.a
    public final void b() {
        c9z0.a aVar = this.i;
        c9z0 c9z0Var = aVar.b;
        zu50 zu50Var = aVar.c;
        zu50.b bVar = zu50Var.l;
        if (bVar == null) {
            c9z0Var.h();
            gu8.c(null, "NativeAdEngine: there is no NativeAdChoicesOptionListener, default behaviour for closing the ad.");
        } else if (!bVar.e()) {
            bVar.g(zu50Var);
            gu8.c(null, "NativeAdEngine: Ad shouldn't close automatically.");
        } else {
            c9z0Var.h();
            bVar.h(zu50Var);
            gu8.c(null, "NativeAdEngine: Ad should close automatically.");
        }
    }

    public final void c(ubz0 ubz0Var, int i) {
        h9y0 h9y0Var;
        kiw kiwVar;
        o5z0.b bVar;
        sgz0 sgz0Var;
        scz0.b bVar2;
        Html5View html5View;
        Html5View html5View2;
        Html5View html5View3;
        ViewGroup g = ubz0Var.g();
        if (g == null) {
            gu8.e(null, "NativeAdViewController: something wrong, adview is null");
            return;
        }
        WeakReference weakReference = ubz0Var.g;
        cjy0 cjy0Var = weakReference != null ? (cjy0) weakReference.get() : null;
        this.o = ubz0Var.c == null || ubz0Var.q;
        x1z0 x1z0Var = this.d;
        z6z0 z6z0Var = x1z0Var.X;
        c9z0.a aVar = this.i;
        if (z6z0Var != null) {
            this.u = new a(z6z0Var, aVar);
        }
        IconAdView d = ubz0Var.d();
        if (d == null) {
            x1z0Var.T.g(1, IronSourceConstants.errorCode_biddingDataException, "iconAdView is null");
            gu8.e(null, "NativeAdViewController: IconAdView component not found in ad view " + g.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            khy0.a |= 8;
        }
        MediaAdView e = ubz0Var.e();
        if (e == null) {
            gu8.e(null, "NativeAdViewController: MediaAdView component not found in ad view " + g.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            khy0.a |= 4;
        }
        chy0 chy0Var = this.j;
        izy0 izy0Var = this.e;
        izy0Var.l = chy0Var;
        this.k.b(g, ubz0Var, this, i);
        boolean z = this.b;
        if (z && cjy0Var != null) {
            this.l = 2;
            cjy0Var.setPromoCardSliderListener(aVar);
            Parcelable parcelable = this.s;
            if (parcelable != null) {
                cjy0Var.h(parcelable);
            }
        } else if (e != null) {
            kiw kiwVar2 = x1z0Var.t;
            if (z) {
                b(e, kiwVar2);
                if (this.l != 2) {
                    this.l = 3;
                    Context context = e.getContext();
                    ucz0 f = f(e);
                    if (f == null) {
                        f = new yey0(context);
                        e.addView(f.getView(), new ViewGroup.LayoutParams(-1, -1));
                    }
                    Parcelable parcelable2 = this.s;
                    if (parcelable2 != null) {
                        f.h(parcelable2);
                    }
                    f.getView().setClickable(this.o);
                    f.setupCards(x1z0Var.s());
                    f.setPromoCardSliderListener(aVar);
                    f.setVisibility(0);
                    e.setBackgroundColor(0);
                }
            } else {
                whz0 whz0Var = (whz0) e.getImageView();
                if (kiwVar2 == null) {
                    whz0Var.setImageBitmap(null);
                } else {
                    Bitmap a2 = kiwVar2.a();
                    if (a2 != null) {
                        whz0Var.setImageBitmap(a2);
                    } else {
                        whz0Var.setImageBitmap(null);
                        o2z0.e(kiwVar2, whz0Var, new qw80(this, 24));
                    }
                }
                if (this.u != null) {
                    int childCount = e.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            h9y0Var = null;
                            break;
                        }
                        View childAt = e.getChildAt(i2);
                        if (childAt instanceof h9y0) {
                            h9y0Var = (h9y0) childAt;
                            break;
                        }
                        i2++;
                    }
                    if (h9y0Var == null) {
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        h9y0 h9y0Var2 = new h9y0(e.getContext());
                        e.addView(h9y0Var2, layoutParams);
                        h9y0Var = h9y0Var2;
                    }
                    String str = x1z0Var.Z;
                    kiw kiwVar3 = x1z0Var.a0;
                    TextView textView = h9y0Var.b;
                    textView.setText(str);
                    h9y0Var.c.setImageData(kiwVar3);
                    ((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin = kiwVar3 == null ? 0 : c1z0.d(4, h9y0Var.getContext()) * 2;
                    h9y0Var.setOnClickListener(this.u);
                } else {
                    h9y0Var = null;
                }
                tbz0 tbz0Var = x1z0Var.Y;
                if (tbz0Var != null) {
                    if (this.r == null) {
                        scz0 scz0Var = new scz0(tbz0Var);
                        this.r = scz0Var;
                        scz0Var.b = aVar;
                        phv phvVar = this.w;
                        scz0Var.f = phvVar;
                        WeakReference weakReference2 = scz0Var.a;
                        if (weakReference2 != null && phvVar != null && (html5View3 = (Html5View) weakReference2.get()) != null) {
                            html5View3.setHtmlInteractionListener(phvVar);
                        }
                        scz0 scz0Var2 = this.r;
                        shv shvVar = this.x;
                        if (shvVar != null) {
                            scz0Var2.getClass();
                            bVar2 = scz0Var2.new b(shvVar);
                        } else {
                            bVar2 = null;
                        }
                        scz0Var2.g = bVar2;
                        WeakReference weakReference3 = scz0Var2.a;
                        if (weakReference3 != null && bVar2 != null && (html5View2 = (Html5View) weakReference3.get()) != null) {
                            html5View2.setHtmlLoadingListener(bVar2);
                        }
                        this.r.getClass();
                        this.r.getClass();
                        scz0 scz0Var3 = this.r;
                        long j = this.y;
                        scz0Var3.h = j;
                        WeakReference weakReference4 = scz0Var3.a;
                        if (weakReference4 != null && (html5View = (Html5View) weakReference4.get()) != null) {
                            html5View.setLoadingTimeoutMillis(j);
                        }
                    }
                    scz0 scz0Var4 = this.r;
                    scz0Var4.getClass();
                    scz0Var4.c = new WeakReference(e);
                    Html5View html5View4 = new Html5View(e.getContext());
                    scz0Var4.a = new WeakReference(html5View4);
                    html5View4.setWebViewClickListener(scz0Var4.i);
                    phv phvVar2 = scz0Var4.f;
                    if (phvVar2 != null) {
                        html5View4.setHtmlInteractionListener(phvVar2);
                    }
                    scz0.b bVar3 = scz0Var4.g;
                    if (bVar3 != null) {
                        html5View4.setHtmlLoadingListener(bVar3);
                    }
                    html5View4.setLoadingTimeoutMillis(scz0Var4.h);
                    html5View4.setWebViewBackgroundColor(e.getHtml5ViewBackgroundColor());
                    html5View4.setData(scz0Var4.d.U);
                    if (e.getMediaAspectRatio() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        e.b(16, 9);
                    }
                    e.addView(html5View4, new ViewGroup.LayoutParams(-1, -1));
                    scz0Var4.e.f(e);
                } else if (this.m) {
                    boolean z2 = h9y0Var != null;
                    this.l = 1;
                    lgz0 lgz0Var = x1z0Var.W;
                    if (lgz0Var != null) {
                        e.b(lgz0Var.g(), lgz0Var.q());
                        sgz0Var = (sgz0) lgz0Var.v0;
                    } else {
                        sgz0Var = null;
                    }
                    if (sgz0Var != null) {
                        if (this.q == null) {
                            this.q = new ady0(x1z0Var, lgz0Var, sgz0Var, aVar, this.c);
                        }
                        View.OnClickListener onClickListener = this.u;
                        if (onClickListener != null) {
                            e.setOnClickListener(onClickListener);
                        } else {
                            e.setOnClickListener(new vg(this, 13));
                        }
                        ady0 ady0Var = this.q;
                        ady0Var.z = z2;
                        ady0Var.A = z2;
                        ady0Var.w = aVar;
                        ubz0 ubz0Var2 = this.t;
                        if (ubz0Var2 != null) {
                            ViewGroup g2 = ubz0Var2.g();
                            ady0Var.b(e, g2 != null ? g2.getContext() : null);
                        }
                    }
                } else {
                    pll pllVar = x1z0Var.V;
                    if (pllVar != null) {
                        Context context2 = e.getContext();
                        ArrayList arrayList = (ArrayList) pllVar.b;
                        CollageView collageView = e.getCollageView();
                        collageView.setCollageSize(arrayList.size());
                        for (final int i3 = 0; i3 < arrayList.size() && i3 < 10; i3++) {
                            final o5z0 o5z0Var = (o5z0) arrayList.get(i3);
                            if (!"image".equals(o5z0Var.b) || (kiwVar = o5z0Var.c) == null) {
                                kiwVar = (!"video".equals(o5z0Var.b) || (bVar = o5z0Var.d) == null) ? null : bVar.a;
                            }
                            if (kiwVar != null) {
                                whz0 whz0Var2 = new whz0(context2);
                                whz0Var2.setImageData(kiwVar);
                                whz0Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                whz0Var2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                whz0Var2.setOnClickListener(new View.OnClickListener() { // from class: xsna.bhy0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        zu50.a aVar2 = dhy0.this.v;
                                        h8z0.e(o5z0Var.e, "click", 2, null);
                                        if (aVar2 != null) {
                                            aVar2.a(i3);
                                        }
                                    }
                                });
                                FrameLayout a3 = collageView.a(i3);
                                if (a3 != null) {
                                    a3.addView(whz0Var2);
                                }
                                if (kiwVar.a() == null) {
                                    o2z0.e(kiwVar, whz0Var2, null);
                                }
                            }
                        }
                        collageView.setVisibility(0);
                        e.getImageView().setVisibility(8);
                        e.b(collageView.getPlaceholderWidth(), collageView.getPlaceholderHeight());
                    } else {
                        b(e, kiwVar2);
                        this.l = 0;
                        e.getImageView().setVisibility(0);
                        e.getPlayButtonView().setVisibility(8);
                        e.getProgressBarView().setVisibility(8);
                        if (this.o) {
                            View.OnClickListener onClickListener2 = this.u;
                            if (onClickListener2 != null) {
                                e.setOnClickListener(onClickListener2);
                            } else {
                                e.setOnClickListener(new mn9(this, 12));
                            }
                        }
                    }
                }
            }
        }
        if (d != null) {
            ImageView imageView = d.getImageView();
            if (imageView instanceof whz0) {
                whz0 whz0Var3 = (whz0) imageView;
                kiw kiwVar4 = x1z0Var.u;
                if (kiwVar4 == null) {
                    imageView.setImageBitmap(null);
                    whz0Var3.e = 0;
                    whz0Var3.d = 0;
                } else {
                    int i4 = kiwVar4.b;
                    int i5 = kiwVar4.c;
                    if (i4 <= 0 || i5 <= 0) {
                        i4 = 100;
                        i5 = 100;
                    }
                    whz0Var3.e = i4;
                    whz0Var3.d = i5;
                    Bitmap a4 = kiwVar4.a();
                    if (a4 != null) {
                        imageView.setImageBitmap(a4);
                    } else {
                        o2z0.e(kiwVar4, imageView, new s7o0(this, 5));
                    }
                }
            }
        }
        o8z0.c(new o4(g.getContext(), 23));
        izy0Var.f(g);
        suy0 suy0Var = this.f;
        if (suy0Var != null) {
            suy0Var.b(g);
            suy0Var.c();
        }
        this.g.a(ubz0Var);
        this.h.b(g, ubz0Var.e());
    }

    public final void e(boolean z) {
        ady0 ady0Var = this.q;
        if (ady0Var == null) {
            return;
        }
        if (!z) {
            ady0Var.s();
            return;
        }
        MediaAdView i = ady0Var.i();
        if (i == null) {
            gu8.c(null, "NativeAdVideoController: Trying to play video in unregistered view");
            ady0Var.e();
            return;
        }
        if (i.getWindowVisibility() != 0) {
            if (ady0Var.u != 1) {
                ady0Var.e();
                return;
            }
            loy0 loy0Var = ady0Var.m;
            if (loy0Var != null) {
                ady0Var.y = loy0Var.getPosition();
            }
            ady0Var.e();
            ady0Var.u = 4;
            ady0Var.n = false;
            ady0Var.g();
            return;
        }
        if (ady0Var.n) {
            return;
        }
        WeakReference weakReference = ady0Var.x;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context != null) {
            ady0Var.b(i, context);
        }
        ady0Var.n = true;
        dvy0 dvy0Var = i.getChildAt(1) instanceof dvy0 ? (dvy0) i.getChildAt(1) : null;
        if (dvy0Var == null) {
            ady0Var.e();
            return;
        }
        loy0 loy0Var2 = ady0Var.m;
        if (loy0Var2 != null && !ady0Var.v.equals(loy0Var2.getUri())) {
            ady0Var.e();
        }
        if (!ady0Var.o) {
            if (!ady0Var.z) {
                i.getPlayButtonView().setVisibility(0);
            }
            i.getProgressBarView().setVisibility(8);
        }
        if (!ady0Var.o || ady0Var.p) {
            return;
        }
        loy0 loy0Var3 = ady0Var.m;
        if (loy0Var3 == null || !loy0Var3.b()) {
            ady0Var.d(dvy0Var, true);
            return;
        }
        ady0Var.m.A(dvy0Var);
        sgz0 sgz0Var = ady0Var.d;
        dvy0Var.b(sgz0Var.b, sgz0Var.c);
        ady0Var.m.x(ady0Var);
        ady0Var.m.resume();
        loy0 loy0Var4 = ady0Var.m;
        if (loy0Var4 == null) {
            return;
        }
        loy0Var4.f();
    }

    public final ucz0 f(MediaAdView mediaAdView) {
        if (!this.b) {
            return null;
        }
        for (int i = 0; i < mediaAdView.getChildCount(); i++) {
            KeyEvent.Callback childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof cjy0) {
                return (ucz0) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        h9y0 h9y0Var;
        MediaAdView mediaAdView;
        izy0 izy0Var = this.e;
        izy0Var.h();
        izy0Var.l = null;
        suy0 suy0Var = this.f;
        if (suy0Var != null) {
            suy0Var.b(null);
        }
        this.h.e();
        scz0 scz0Var = this.r;
        if (scz0Var != null) {
            scz0Var.e.h();
            WeakReference weakReference = scz0Var.c;
            if (weakReference != null && scz0Var.a != null && (mediaAdView = (MediaAdView) weakReference.get()) != null) {
                scz0Var.c.clear();
                Html5View html5View = (Html5View) scz0Var.a.get();
                if (html5View != null) {
                    scz0Var.a.clear();
                    mediaAdView.removeView(html5View);
                }
            }
        }
        ady0 ady0Var = this.q;
        if (ady0Var != null) {
            ady0Var.a();
        }
        if (this.t == null) {
            return;
        }
        x1z0 x1z0Var = this.d;
        x1z0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
        IconAdView d = this.t.d();
        if (d != null) {
            d.setOnClickListener(null);
            ImageView imageView = d.getImageView();
            imageView.setImageBitmap(null);
            if (imageView instanceof whz0) {
                whz0 whz0Var = (whz0) imageView;
                whz0Var.e = 0;
                whz0Var.d = 0;
            }
            kiw kiwVar = x1z0Var.u;
            if (kiwVar != null) {
                o2z0.d(kiwVar, imageView);
            }
        }
        MediaAdView e = this.t.e();
        if (e != null) {
            kiw kiwVar2 = x1z0Var.t;
            whz0 whz0Var2 = (whz0) e.getImageView();
            if (kiwVar2 != null) {
                o2z0.d(kiwVar2, whz0Var2);
            }
            whz0Var2.setImageData(null);
            e.getProgressBarView().setVisibility(8);
            e.getPlayButtonView().setVisibility(8);
            e.b(0, 0);
            e.setOnClickListener(null);
            ucz0 f = f(e);
            if (f != 0) {
                this.s = f.getState();
                f.dispose();
                ((View) f).setVisibility(8);
            }
            int childCount = e.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    h9y0Var = null;
                    break;
                }
                View childAt = e.getChildAt(i);
                if (childAt instanceof h9y0) {
                    h9y0Var = (h9y0) childAt;
                    break;
                }
                i++;
            }
            if (h9y0Var != null) {
                e.removeView(h9y0Var);
            }
            e.getCollageView().setVisibility(8);
        }
        WeakReference weakReference2 = this.t.g;
        cjy0 cjy0Var = weakReference2 != null ? (cjy0) weakReference2.get() : null;
        if (cjy0Var != null) {
            cjy0Var.setPromoCardSliderListener(null);
            this.s = cjy0Var.getState();
            cjy0Var.dispose();
        }
        ViewGroup g = this.t.g();
        if (g != null) {
            this.k.c(g);
            g.setVisibility(0);
        }
        d(this.t, null, null);
        this.t.a();
        this.t = null;
        this.u = null;
    }

    public final void b(MediaAdView mediaAdView, kiw kiwVar) {
        if (kiwVar == null) {
            mediaAdView.b(0, 0);
            return;
        }
        int i = kiwVar.b;
        int i2 = kiwVar.c;
        if (!this.n && i > 0 && i2 > 0) {
            mediaAdView.b(i, i2);
        } else {
            mediaAdView.b(16, 9);
            this.n = true;
        }
    }
}
