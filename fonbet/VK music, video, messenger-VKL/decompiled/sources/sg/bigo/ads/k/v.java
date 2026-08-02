package sg.bigo.ads.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.k.a;

/* loaded from: classes9.dex */
public class v extends a {
    private float A;
    private Bitmap B;
    private float y;
    protected MediaView z;

    public v(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    public int A() {
        return -1;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final ViewGroup k() {
        return this.z;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final MediaView l() {
        return this.z;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final Button m() {
        return null;
    }

    @Override // sg.bigo.ads.k.a
    public final void o() {
        String[] strArr;
        int i;
        int i2;
        v vVar = this;
        int x = vVar.x();
        if (x == 1) {
            vVar.a(-1);
        } else {
            vVar.a(-16777216);
        }
        int i3 = 0;
        final boolean z = x == 1;
        final ViewGroup viewGroup = vVar.r;
        if (viewGroup != null) {
            b.d popPage = ((sg.bigo.ads.ad.interstitial.u) vVar).c.getPopPage();
            if (popPage != null && popPage.e() != null && popPage.e().length > 0) {
                strArr = popPage.e();
            } else if (((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) vVar).c.f()).aF() != null) {
                o.a[] aF = ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) vVar).c.f()).aF();
                String[] strArr2 = new String[aF.length];
                for (int i4 = 0; i4 < aF.length; i4++) {
                    strArr2[i4] = aF[i4].c();
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            boolean z2 = strArr == null || strArr.length == 0;
            if (strArr != null && 1 == strArr.length) {
                z2 = TextUtils.isEmpty(strArr[0]);
            }
            if (z2) {
                vVar.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.k.v.3
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        v.this.a(viewGroup, (String[]) null, z);
                    }
                });
            } else {
                vVar.a(viewGroup, strArr, z);
            }
            ViewGroup viewGroup2 = vVar.r;
            IconListView iconListView = (IconListView) viewGroup2.findViewById(R.id.download_msg_list);
            if (iconListView != null && vVar.v != null) {
                iconListView.setThemeWhite(!z);
                iconListView.a(vVar.v);
                sg.bigo.ads.y.a.a(viewGroup2, iconListView, 8, ((sg.bigo.ads.ad.interstitial.u) vVar).c, 0);
            }
            ViewGroup viewGroup3 = vVar.r;
            int i5 = z ? -16777216 : -1;
            int b = z ? sg.bigo.ads.common.utils.r.b("#B3000000", -16777216) : sg.bigo.ads.common.utils.r.b("#B3FFFFFF", -1);
            ((TextView) viewGroup3.findViewById(R.id.inter_title)).setTextColor(i5);
            ((TextView) viewGroup3.findViewById(R.id.tv_gp_info_extra_about)).setTextColor(i5);
            ((TextView) viewGroup3.findViewById(R.id.inter_description)).setTextColor(b);
            ((TextView) viewGroup3.findViewById(R.id.tv_desc_below)).setTextColor(b);
            View findViewById = vVar.r.findViewById(R.id.bigo_ad_mask_vertical);
            GradientDrawable gradientDrawable = (GradientDrawable) findViewById.getBackground();
            int[] iArr = new int[2];
            if (z) {
                iArr[0] = 16777215;
                iArr[1] = -1;
            } else {
                iArr[0] = 2105636;
                iArr[1] = -16777216;
            }
            gradientDrawable.setColors(iArr);
            findViewById.setBackground(gradientDrawable);
            RoundedImageView roundedImageView = (RoundedImageView) vVar.r.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.f.a(r6.getContext(), 6));
            }
            if (vVar.w != null) {
                int f = ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) vVar).c.f()).C() == null ? 0 : ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) vVar).c.f()).C().f();
                if (f > 0) {
                    float f2 = f * 0.01f;
                    if (f2 > 0.15f) {
                        f2 = 0.15f;
                    }
                    int round = Math.round(sg.bigo.ads.common.utils.f.c(vVar.w.getContext()) * f2);
                    ViewGroup.LayoutParams layoutParams = vVar.w.getLayoutParams();
                    layoutParams.height = round;
                    vVar.w.setLayoutParams(layoutParams);
                } else {
                    vVar.w.setVisibility(8);
                }
                vVar.w.setTextColor(z ? sg.bigo.ads.common.utils.r.b("#4D202124", -16777216) : sg.bigo.ads.common.utils.r.b("#4DFFFFFF", -1));
            }
            Button button = (Button) vVar.r.findViewById(R.id.inter_btn_cta);
            ViewGroup viewGroup4 = (ViewGroup) vVar.r.findViewById(R.id.inter_btn_cta_layout);
            if (button != null && viewGroup4 != null) {
                ViewGroup viewGroup5 = vVar.r;
                a.C2498a u = vVar.u();
                sg.bigo.ads.ad.interstitial.d.b(button, u.a);
                if (vVar.v()) {
                    sg.bigo.ads.ad.interstitial.c.e(viewGroup4);
                }
                TextView textView = (TextView) viewGroup5.findViewById(R.id.inter_company);
                if (textView != null) {
                    textView.setTextColor(u.a);
                }
            }
            b.d popPage2 = ((sg.bigo.ads.ad.interstitial.u) vVar).c.getPopPage();
            if (popPage2 == null || popPage2.d() == null) {
                return;
            }
            ViewGroup viewGroup6 = vVar.r;
            AutoNextLineLinearLayout autoNextLineLinearLayout = (AutoNextLineLinearLayout) viewGroup6.findViewById(R.id.fbl_genre);
            String[] d = popPage2.d();
            try {
                Context context = viewGroup6.getContext();
                int a = sg.bigo.ads.common.utils.f.a(context, 1);
                int a2 = sg.bigo.ads.common.utils.f.a(context, 5);
                int a3 = sg.bigo.ads.common.utils.f.a(context, 12);
                int a4 = sg.bigo.ads.common.utils.f.a(context, 14);
                int a5 = sg.bigo.ads.common.utils.f.a(context, 28);
                int b2 = z ? sg.bigo.ads.common.utils.r.b("#B3000000", -16777216) : sg.bigo.ads.common.utils.r.b("#B3FFFFFF", -1);
                int b3 = z ? sg.bigo.ads.common.utils.r.b("#26202124", -16777216) : sg.bigo.ads.common.utils.r.b("#26FFFFFF", -1);
                int i6 = 0;
                while (i6 < d.length) {
                    String str = d[i6];
                    if (TextUtils.isEmpty(str)) {
                        i = b3;
                        i2 = i3;
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setText(str);
                        textView2.setTextColor(b2);
                        textView2.setTextSize(13.0f);
                        textView2.setPadding(a3, a2, a3, a2);
                        textView2.setGravity(17);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(i3);
                        gradientDrawable2.setStroke(a, b3);
                        gradientDrawable2.setCornerRadius(a4);
                        textView2.setBackground(gradientDrawable2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, a5);
                        layoutParams2.topMargin = a3;
                        layoutParams2.rightMargin = a3;
                        textView2.setTag(27);
                        i = b3;
                        i2 = 0;
                        sg.bigo.ads.y.a.a(viewGroup6, textView2, 8, ((sg.bigo.ads.ad.interstitial.u) vVar).c, 0);
                        autoNextLineLinearLayout.addView(textView2, layoutParams2);
                    }
                    i6++;
                    vVar = this;
                    i3 = i2;
                    b3 = i;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.k.a
    public final void t() {
        super.t();
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
            this.z = mediaView;
            mediaView.setImageBlurBorder(false);
            c(this.r);
            TextView textView = (TextView) this.r.findViewById(R.id.tv_desc_below);
            if (textView != null) {
                b.d popPage = ((sg.bigo.ads.ad.interstitial.u) this).c.getPopPage();
                String c = popPage != null ? popPage.c() : "";
                if (TextUtils.isEmpty(c)) {
                    c = ((sg.bigo.ads.ad.interstitial.u) this).c.getDescription();
                }
                if (TextUtils.isEmpty(c)) {
                    c = sg.bigo.ads.common.utils.a.a(j(), R.string.bigo_ad_description_default, new Object[0]);
                }
                textView.setText(c);
                textView.setTag(6);
                sg.bigo.ads.y.a.a(this.r, textView, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, 0);
            }
            TextView textView2 = (TextView) this.r.findViewById(R.id.tv_gp_info_extra_about);
            if (textView2 != null) {
                textView2.setTag(27);
                sg.bigo.ads.y.a.a(this.r, textView2, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, 0);
            }
            ImageView imageView = (ImageView) this.r.findViewById(R.id.iv_gp_info_extra_arrow);
            if (imageView != null) {
                imageView.setTag(27);
                sg.bigo.ads.y.a.a(this.r, imageView, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, 0);
            }
        }
    }

    public void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.an.p a = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).c);
        sg.bigo.ads.an.p b = sg.bigo.ads.an.p.b(a.getWidth(), a.getHeight(), viewGroup.getContext().getResources().getDisplayMetrics().widthPixels);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.bigo_ad_material_container);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.topMargin = b.getHeight() - sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 25);
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.z.getLayoutParams();
        layoutParams2.height = b.getHeight();
        this.z.setLayoutParams(layoutParams2);
        a(viewGroup, b);
    }

    @Override // sg.bigo.ads.k.a, sg.bigo.ads.ad.interstitial.u
    public final void f() {
        super.f();
        View findViewById = this.r.findViewById(R.id.inter_ad_tag_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static sg.bigo.ads.an.p b(@NonNull Bitmap bitmap, @NonNull ViewGroup viewGroup, int i, boolean z) {
        int a = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 20);
        sg.bigo.ads.an.p a2 = sg.bigo.ads.an.p.a(bitmap.getWidth(), bitmap.getHeight(), i);
        if (z) {
            if (a2.getWidth() < viewGroup.getContext().getResources().getDisplayMetrics().widthPixels - a) {
                return sg.bigo.ads.an.p.a(bitmap.getWidth(), bitmap.getHeight(), i - a);
            }
        }
        return a2;
    }

    private RoundedFrameLayout a(@NonNull ViewGroup viewGroup, @NonNull Context context, String str, Bitmap bitmap, int i, boolean z, boolean z2) {
        v vVar;
        final ViewGroup viewGroup2;
        final boolean z3;
        final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 4));
        roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
        roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.r.b("#08000000", -7829368));
        final AdImageView adImageView = new AdImageView(context);
        final int a = sg.bigo.ads.common.utils.f.a(context, 200);
        adImageView.setBlurBorder(false);
        if (bitmap == null) {
            adImageView.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#FFE1E1E6", -7829368));
            adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, a);
            layoutParams.width = a;
            layoutParams.height = a;
            roundedFrameLayout.setLayoutParams(layoutParams);
            adImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, a));
            vVar = this;
            viewGroup2 = viewGroup;
            z3 = z;
            adImageView.a(new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.k.v.5
                @Override // sg.bigo.ads.bj.g
                public final void a(int i2, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                }

                @Override // sg.bigo.ads.bj.g
                public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.bj.f fVar) {
                    if (((sg.bigo.ads.ad.interstitial.u) v.this).c.h) {
                        return;
                    }
                    adImageView.setBackground(null);
                    sg.bigo.ads.an.p b = v.b(bitmap2, viewGroup2, a, z3);
                    ViewGroup.LayoutParams layoutParams2 = roundedFrameLayout.getLayoutParams();
                    layoutParams2.width = b.getWidth();
                    layoutParams2.height = b.getHeight();
                    roundedFrameLayout.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = adImageView.getLayoutParams();
                    layoutParams3.width = b.getWidth();
                    layoutParams3.height = b.getHeight();
                    adImageView.setLayoutParams(layoutParams3);
                    if (z3) {
                        v.this.a(viewGroup2, bitmap2, b, a);
                    }
                }
            });
            adImageView.a(str, ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) vVar).c.f()).am());
        } else {
            vVar = this;
            viewGroup2 = viewGroup;
            z3 = z;
            sg.bigo.ads.an.p b = b(bitmap, viewGroup2, a, z3);
            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(b.getWidth(), b.getHeight()));
            adImageView.setImageBitmap(bitmap);
            if (z3) {
                a(viewGroup2, bitmap, b, a);
            }
        }
        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        roundedFrameLayout.addView(adImageView);
        if (i != 1 && i != 2) {
            sg.bigo.ads.y.a.a(viewGroup2, roundedFrameLayout, 8, ((sg.bigo.ads.ad.interstitial.u) vVar).c, i);
        }
        if (z2 && !z3) {
            sg.bigo.ads.as.a.a((View) roundedFrameLayout, 10);
            roundedFrameLayout.setBackgroundColor(-1);
        }
        return roundedFrameLayout;
    }

    @Override // sg.bigo.ads.k.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.k.a
    public final void a(int i) {
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull View view) {
        View findViewById;
        if (this.d == null || (findViewById = view.findViewById(R.id.inter_ad_tag_layout)) == null) {
            return;
        }
        this.d.a(findViewById, 0);
    }

    private void a(@NonNull final View view, final int i, final int i2) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.k.v.6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                sg.bigo.ads.y.b bVar;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    v.this.y = motionEvent.getX();
                    v.this.A = motionEvent.getY();
                    return !view.isScrollContainer();
                }
                if (actionMasked != 1) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                boolean a = sg.bigo.ads.common.utils.v.a(view, Math.round(v.this.y), Math.round(v.this.A));
                boolean a2 = sg.bigo.ads.common.utils.v.a(view, Math.round(x), Math.round(y));
                Object tag = view.getTag();
                int i3 = i;
                if (tag instanceof Integer) {
                    i3 = ((Integer) tag).intValue();
                }
                int i4 = i3;
                int i5 = i2;
                if (2 == i5) {
                    if (a && a2) {
                        bVar = ((sg.bigo.ads.ad.interstitial.u) v.this).c;
                    }
                    return false;
                }
                if (3 == i5 || 1 != i5 || !a) {
                    return false;
                }
                bVar = ((sg.bigo.ads.ad.interstitial.u) v.this).c;
                bVar.a(Math.round(x), Math.round(y), Math.round(v.this.y), Math.round(v.this.A), 8, i4);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final ViewGroup viewGroup, final Bitmap bitmap, sg.bigo.ads.an.p pVar, final int i) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.fl_multi_container);
        if (frameLayout != null) {
            int i2 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
            int a = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 20);
            final int i3 = i2 - (a * 2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.leftMargin = a;
            marginLayoutParams.rightMargin = a;
            frameLayout.setLayoutParams(marginLayoutParams);
            if (pVar.getWidth() < i3) {
                final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_blur_bg);
                final View findViewById = viewGroup.findViewById(R.id.iv_blur_bg_mask);
                if (imageView == null || bitmap == null) {
                    return;
                }
                sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.k.v.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Bitmap b = sg.bigo.ads.common.utils.e.b(viewGroup.getContext(), bitmap);
                        if (b == null || ((sg.bigo.ads.ad.interstitial.u) v.this).c.h) {
                            return;
                        }
                        imageView.post(new Runnable() { // from class: sg.bigo.ads.k.v.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap(b);
                                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                layoutParams.width = i3;
                                layoutParams.height = i;
                                imageView.setLayoutParams(layoutParams);
                                View view = findViewById;
                                if (view != null) {
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                    layoutParams2.width = i3;
                                    layoutParams2.height = i;
                                    findViewById.setLayoutParams(layoutParams2);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i, int i2, int i3, @Nullable View... viewArr) {
        super.a(viewGroup, view, i, i2, i3, viewArr);
        MediaView mediaView = this.z;
        if (mediaView != null) {
            mediaView.b().a(new sg.bigo.ads.cz.b() { // from class: sg.bigo.ads.k.v.1
                @Override // sg.bigo.ads.cz.b
                public final void a(Bitmap bitmap) {
                    if (((sg.bigo.ads.ad.interstitial.u) v.this).c.h || bitmap == null) {
                        return;
                    }
                    v vVar = v.this;
                    if (vVar.r != null) {
                        vVar.B = bitmap;
                        v.this.r.post(new Runnable() { // from class: sg.bigo.ads.k.v.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                v vVar2 = v.this;
                                v.a(vVar2, vVar2.r);
                            }
                        });
                    }
                }
            });
        }
        sg.bigo.ads.ad.interstitial.x xVar = this.t;
        boolean z = false;
        int i4 = xVar != null ? xVar.i : 0;
        View findViewById = viewGroup.findViewById(R.id.inter_media_container);
        sg.bigo.ads.y.a.a(findViewById, 9);
        sg.bigo.ads.ad.interstitial.x xVar2 = this.t;
        if (xVar2 == null || !xVar2.g) {
            MediaView mediaView2 = this.z;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(false);
            }
            if (findViewById != null) {
                sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
            }
        } else {
            MediaView mediaView3 = this.z;
            if (mediaView3 != null) {
                mediaView3.setOtherClickAreaClick(true);
            }
            if (findViewById != null) {
                sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i4);
            }
        }
        sg.bigo.ads.ad.interstitial.x xVar3 = this.t;
        if (xVar3 != null && xVar3.f) {
            z = true;
        }
        MediaView mediaView4 = this.z;
        if (mediaView4 != null) {
            sg.bigo.ads.y.a.a(viewGroup, mediaView4, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i4);
            this.z.setMediaAreaClickable(z);
            this.z.b().a(!z);
        }
    }

    public void a(@NonNull ViewGroup viewGroup, sg.bigo.ads.an.p pVar) {
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_mask_vertical);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = pVar.getHeight();
        findViewById.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull ViewGroup viewGroup, @Nullable String[] strArr, boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.ad.interstitial.x xVar;
        sg.bigo.ads.ad.interstitial.x xVar2;
        sg.bigo.ads.ai.o oVar = this.u;
        int i3 = 0;
        int a = oVar == null ? 0 : oVar.a("video_play_page.click_type");
        View view = (ScrollView) viewGroup.findViewById(R.id.native_view);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) viewGroup.findViewById(R.id.bigo_ad_scroll_images);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        Context context = viewGroup.getContext();
        boolean z2 = strArr == null || strArr.length == 0 || strArr.length == 1;
        if (!z2) {
            int a2 = sg.bigo.ads.common.utils.f.a(context, 20);
            int a3 = sg.bigo.ads.common.utils.f.a(context, 12);
            while (true) {
                int i4 = i3;
                if (i4 >= strArr.length) {
                    break;
                }
                String str = strArr[i4];
                if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                    i = a2;
                    i2 = i4;
                } else {
                    i = a2;
                    i2 = i4;
                    RoundedFrameLayout a4 = a(viewGroup, context, str, (Bitmap) null, a, false, z);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.leftMargin = i2 == 0 ? i : a3;
                    if (i2 + 1 == strArr.length) {
                        layoutParams2.rightMargin = i;
                    }
                    linearLayout.addView(a4, layoutParams2);
                    if (a == 2) {
                        sg.bigo.ads.y.a.a(viewGroup, a4, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, a);
                    }
                }
                i3 = i2 + 1;
                a2 = i;
            }
        } else {
            linearLayout.addView(a(viewGroup, context, (strArr == null || 1 != strArr.length) ? "" : strArr[0], this.h, a, true, z));
        }
        if (z2) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 202));
        }
        horizontalScrollView.addView(linearLayout, layoutParams);
        if (a == 3) {
            if (z2 && (xVar = this.t) != null && xVar.f) {
                horizontalScrollView.setTag(9);
                sg.bigo.ads.y.a.a(viewGroup, horizontalScrollView, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, a);
                return;
            }
            return;
        }
        if (z2 && (xVar2 = this.t) != null && xVar2.f) {
            horizontalScrollView.setTag(9);
            sg.bigo.ads.y.a.a(viewGroup, horizontalScrollView, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, a);
        } else {
            a(horizontalScrollView, 5, a);
        }
        if (view != null) {
            a(view, 10, a);
        }
    }

    public static /* synthetic */ void a(v vVar, final ViewGroup viewGroup) {
        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_media_blur_bg);
        final View findViewById = viewGroup.findViewById(R.id.iv_media_blur_bg_mask);
        if (vVar.z == null || imageView == null || vVar.B == null) {
            return;
        }
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.k.v.2
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap b = sg.bigo.ads.common.utils.e.b(viewGroup.getContext(), v.this.B);
                if (b == null || ((sg.bigo.ads.ad.interstitial.u) v.this).c.h) {
                    return;
                }
                imageView.post(new Runnable() { // from class: sg.bigo.ads.k.v.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(b);
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int height = v.this.z.getHeight();
                        layoutParams.height = height;
                        layoutParams.width = v.this.A();
                        imageView.setLayoutParams(layoutParams);
                        View view = findViewById;
                        if (view != null) {
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            layoutParams2.height = height;
                            layoutParams2.width = v.this.A();
                            findViewById.setLayoutParams(layoutParams2);
                        }
                    }
                });
            }
        });
    }
}
