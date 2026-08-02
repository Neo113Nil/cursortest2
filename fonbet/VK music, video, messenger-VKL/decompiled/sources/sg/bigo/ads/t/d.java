package sg.bigo.ads.t;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.i;
import sg.bigo.ads.an.p;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.core.adview.h;
import sg.bigo.ads.j.ac;

/* loaded from: classes9.dex */
public class d extends r {
    final RoundedFrameLayout a;
    protected final sg.bigo.ads.y.b b;
    sg.bigo.ads.s.a c;
    protected int d;
    ViewGroup e;
    final h f;
    private u g;
    private sg.bigo.ads.j.a h;
    private boolean i;
    private final View j;
    private final boolean k;
    private int l;
    private boolean m;
    private h n;

    public d(@NonNull Activity activity, sg.bigo.ads.s.a aVar, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.y.b bVar, int i, View view, boolean z) {
        super(activity);
        this.n = new h() { // from class: sg.bigo.ads.t.d.1
            @Override // sg.bigo.ads.core.adview.h
            public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
                if (d.this.c != null) {
                    i iVar = new i(new Point(i4, i5), new Point(i2, i3));
                    d dVar = d.this;
                    sg.bigo.ads.s.a aVar2 = dVar.c;
                    boolean z2 = dVar.i;
                    int i8 = d.this.l;
                    d dVar2 = d.this;
                    aVar2.a(z2, i8, i6, i7, iVar, dVar2.b, dVar2);
                }
            }

            @Override // sg.bigo.ads.core.adview.h
            public final void a(i iVar, int i2, int i3) {
                d dVar = d.this;
                sg.bigo.ads.s.a aVar2 = dVar.c;
                if (aVar2 != null) {
                    boolean z2 = dVar.i;
                    int i4 = d.this.l;
                    i iVar2 = new i();
                    d dVar2 = d.this;
                    aVar2.a(z2, i4, i2, i3, iVar2, dVar2.b, dVar2);
                }
            }
        };
        this.f = new h() { // from class: sg.bigo.ads.t.d.2
            @Override // sg.bigo.ads.core.adview.h
            public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
            }

            @Override // sg.bigo.ads.core.adview.h
            public final void a(i iVar, int i2, int i3) {
            }
        };
        this.c = aVar;
        this.a = roundedFrameLayout;
        this.b = bVar;
        u a = sg.bigo.ads.k.a.a(bVar, 0);
        this.g = a;
        a.a(this.P);
        this.d = i;
        this.j = view;
        this.k = z;
    }

    public static /* synthetic */ ViewGroup e(d dVar) {
        dVar.e = null;
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        super.J();
        this.n = null;
        this.h = null;
        this.g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final boolean U() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r5.d != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r5.d == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        if (this.i) {
            return false;
        }
        o e = ((sg.bigo.ads.cp.a) this.b.f()).e();
        if (this.h == null) {
            this.h = sg.bigo.ads.j.a.a(this.b, e, null, null, false);
        }
        if (this.h instanceof ac) {
            this.a.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a.removeAllViews();
            int a = e.a("multi_ads_endpage.ad_component_layout");
            if (4 != a) {
                if (5 == a) {
                }
            }
            ((ac) this.h).a(a);
            this.h.a(this, this.a, 2);
            sg.bigo.ads.s.a aVar = this.c;
            if (aVar != null) {
                aVar.a(11);
            }
            this.i = true;
        }
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int aa() {
        int i = R.layout.bigo_ad_activity_vertical_twins_sub;
        Activity activity = this.N;
        RoundedFrameLayout roundedFrameLayout = this.a;
        sg.bigo.ads.common.utils.a.a(activity, i, roundedFrameLayout, roundedFrameLayout != null);
        return i;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        return R.layout.bigo_ad_activity_vertical_twins_sub;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void h() {
        super.h();
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void j() {
        super.j();
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int o() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.g == null || !((sg.bigo.ads.cp.a) this.b.f()).bh() || this.m) {
            return;
        }
        this.m = true;
        u uVar = this.g;
        RoundedFrameLayout roundedFrameLayout = this.a;
        uVar.a(roundedFrameLayout, roundedFrameLayout, 1, 8, 0, new View[0]);
    }

    public void b() {
        View view;
        o e = ((sg.bigo.ads.cp.a) this.b.f()).e();
        if (e == null || this.a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.l = e.a("multi_ads.interaction_type", 2);
        int a = e.a("multi_ads.click_type", 0);
        MediaView mediaView = (MediaView) this.a.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setMediaAreaClickable(true);
            mediaView.b().a(false);
        }
        boolean c = e.c("multi_ads.media_view_clickable_switch");
        View findViewById = this.a.findViewById(R.id.inter_media_layout);
        if (c) {
            if (findViewById != null) {
                findViewById.setTag(10);
                arrayList.add(findViewById);
            }
            arrayList.add(mediaView);
        } else {
            if (mediaView != null) {
                sg.bigo.ads.y.a.a(this.a, mediaView, 8, this.f, a);
            }
            if (findViewById != null) {
                sg.bigo.ads.y.a.a(this.a, findViewById, 8, this.f, a);
            }
        }
        if (e.c("multi_ads.other_space_clickable_switch") && (view = this.j) != null && this.d == 0 && this.k) {
            view.setTag(9);
            sg.bigo.ads.y.a.a(this.a, this.j, 13, this.n, a);
        }
        boolean c2 = e.c("multi_ads.ad_component_clickable_switch");
        View findViewById2 = this.a.findViewById(R.id.bigo_ad_sub_bottom_component);
        if (c2) {
            if (findViewById2 != null) {
                findViewById2.setTag(9);
                arrayList.add(findViewById2);
            }
        } else if (findViewById2 != null) {
            sg.bigo.ads.y.a.a(this.a, findViewById2, 8, this.f, a);
        }
        View findViewById3 = this.a.findViewById(R.id.inter_title);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
            findViewById3.setTag(2);
            arrayList.add(findViewById3);
        }
        View findViewById4 = this.a.findViewById(R.id.inter_icon);
        if (findViewById4 != null) {
            findViewById4.setTag(1);
            arrayList.add(findViewById4);
        }
        View findViewById5 = this.a.findViewById(R.id.bigo_ad_tv_more);
        if (findViewById5 != null) {
            findViewById5.setVisibility(0);
            findViewById5.setTag(35);
            arrayList.add(findViewById5);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            if (view2 != null) {
                sg.bigo.ads.y.a.a(this.a, view2, 8, this.n, a);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void h(int i) {
        super.h(i);
        try {
            p a = s.a(this.b);
            if (a.c > a.b) {
                Context context = this.a.getContext();
                int a2 = f.a(context, c.J - 55) - f.a(context, 16);
                int i2 = (int) (a2 * ((a.b * 1.0f) / a.c));
                MediaView mediaView = (MediaView) this.a.findViewById(R.id.inter_media);
                if (mediaView != null) {
                    ViewGroup viewGroup = (ViewGroup) mediaView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(mediaView);
                    }
                    mediaView.setMediaAreaClickable(true);
                    mediaView.b().a(false);
                    RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, a2, 49);
                    layoutParams.topMargin = f.a(context, 8);
                    roundedFrameLayout.setLayoutParams(layoutParams);
                    roundedFrameLayout.setCornerRadius(f.a(context, 16));
                    roundedFrameLayout.addView(mediaView);
                    this.a.addView(roundedFrameLayout);
                    ViewGroup.LayoutParams layoutParams2 = mediaView.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = i2;
                        layoutParams2.height = a2;
                        mediaView.setLayoutParams(layoutParams2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        c();
        s.a(this.b, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.t.d.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                ViewGroup.LayoutParams layoutParams3 = d.this.a.getLayoutParams();
                if (bitmap2 == null || bitmap2.isRecycled() || layoutParams3 == null) {
                    return;
                }
                sg.bigo.ads.common.utils.e.a(d.this.a.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.t.d.3.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                        Bitmap bitmap4 = bitmap3;
                        if (bitmap4 == null || bitmap4.isRecycled()) {
                            return;
                        }
                        int a3 = f.a(d.this.a.getContext(), 16);
                        RoundedImageView roundedImageView = new RoundedImageView(d.this.a.getContext());
                        roundedImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        float f = a3;
                        roundedImageView.a(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ((FrameLayout) d.this.a.findViewById(R.id.inter_media_layout)).addView(roundedImageView, 0);
                        roundedImageView.setImageBitmap(bitmap4);
                    }
                });
            }
        });
        b();
        RoundedImageView roundedImageView = (RoundedImageView) this.a.findViewById(R.id.inter_icon);
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(f.a(this.a.getContext(), 6));
        }
        if (this.k || this.a == null) {
            return;
        }
        try {
            Activity activity = this.N;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.e = frameLayout;
            frameLayout.setBackgroundColor(-1);
            ProgressBar progressBar = new ProgressBar(activity);
            progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(activity, android.R.color.transparent));
            int i3 = R.drawable.bigo_ad_default_progressbar;
            int b = sg.bigo.ads.common.utils.r.b("#FF009DFF", -16776961);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setTint(b);
                progressBar.setIndeterminateDrawable(indeterminateDrawable);
            } else {
                progressBar.setIndeterminateDrawable(sg.bigo.ads.common.utils.a.a(activity, i3));
            }
            this.e.addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
            this.a.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
            sg.bigo.ads.y.a.a(this.a, this.e, 8, this.f, 0);
        } catch (Throwable unused2) {
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void g(int i) {
    }
}
