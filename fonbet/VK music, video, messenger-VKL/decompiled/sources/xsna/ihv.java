package xsna;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.SimpleRatioFrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.imageloader.view.VKImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import xsna.e3m;
import xsna.khv;
import xsna.qi6;

/* compiled from: Html5View.kt */
/* loaded from: classes4.dex */
public final class ihv extends SimpleRatioFrameLayout implements View.OnClickListener, khv.a, too0 {
    public final Html5Entry e;
    public final int f;
    public final khv g;
    public final VKImageView h;
    public final AppCompatTextView i;
    public final VkSimpleButton j;
    public final LinearLayout k;
    public final cek0 l;
    public final AppCompatTextView m;
    public final ProgressBar n;

    public ihv(Context context, Html5Entry html5Entry) {
        super(context, null, 0);
        khv khvVar;
        this.e = html5Entry;
        int i = qi6.B;
        this.f = qi6.a.a(context);
        try {
            khvVar = new khv(context);
        } catch (AndroidRuntimeException e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            khvVar = null;
        } catch (OutOfMemoryError unused) {
            mcr0.b();
            khvVar = new khv(context);
        }
        this.g = khvVar;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        this.h = vKImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Headline1Normal));
        this.i = appCompatTextView;
        VkSimpleButton vkSimpleButton = new VkSimpleButton(context, null, 6);
        vkSimpleButton.setMode(VkButton.Mode.Primary);
        vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
        this.j = vkSimpleButton;
        LinearLayout linearLayout = new LinearLayout(context);
        this.k = linearLayout;
        cek0 cek0Var = new cek0(context, true);
        this.l = cek0Var;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        this.m = appCompatTextView2;
        ProgressBar progressBar = new ProgressBar(context);
        this.n = progressBar;
        float f = this.e.w.f;
        f = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.7777778f : f;
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        bwt0.b0(1, this);
        setMaxWidth(this.f);
        setRatio(f);
        setOnClickListener(this);
        e3m.a aVar = e3m.a;
        appCompatTextView2.setBackground(m33.a(R.drawable.btn_shadow_30, context));
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLetterSpacing(0.02f);
        jjc.f(this, appCompatTextView2);
        int a = e3m.a(R.dimen.webview_ad_action_button_left_right_space, context);
        int a2 = e3m.a(R.dimen.webview_ad_action_button_top_bottom_space, context);
        appCompatTextView2.setPadding(a, a2, a, a2);
        appCompatTextView2.setTextColor(-16777216);
        com.vk.typography.b.k(appCompatTextView2, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        appCompatTextView2.setLayoutParams(layoutParams);
        appCompatTextView2.setText(this.e.w.c);
        Html5Entry.Html5App html5App = this.e.w;
        bwt0.p0(appCompatTextView2, !html5App.d && html5App.c.length() > 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gbg0.a(getResources(), 48.0f), gbg0.a(getResources(), 48.0f));
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        vKImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        jjc.f(this, vKImageView);
        bwt0.Z(R.attr.vk_ui_image_placeholder, vKImageView);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setGravity(17);
        cek0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bwt0.p0(cek0Var, false);
        int a3 = e3m.a(R.dimen.newsfeed_html5_error_space, context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.bottomMargin = a3;
        appCompatTextView.setLayoutParams(layoutParams4);
        appCompatTextView.setText(context.getString(R.string.newsfeed_error_html5));
        jno0.c(appCompatTextView, R.attr.vk_ui_text_secondary);
        int a4 = e3m.a(R.dimen.webview_ad_action_button_left_right_space, context);
        appCompatTextView.setPadding(a4, 0, a4, 0);
        appCompatTextView.setGravity(1);
        vkSimpleButton.setText(context.getString(R.string.newsfeed_error_html5_retry));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 1;
        vkSimpleButton.setLayoutParams(layoutParams5);
        vkSimpleButton.setGravity(1);
        jjc.f(this, vkSimpleButton);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(vkSimpleButton);
        if (khvVar != null) {
            khvVar.setListener(this);
            khvVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        addView(vKImageView);
        addView(appCompatTextView2);
        addView(progressBar);
        addView(linearLayout);
        addView(cek0Var);
        f(null);
    }

    @Override // xsna.too0
    public final void Ng() {
        jno0.c(this.i, R.attr.vk_ui_text_secondary);
        this.j.a();
        bwt0.Z(R.attr.vk_ui_image_placeholder, this.h);
    }

    @Override // xsna.khv.a
    public final void a() {
        f(null);
    }

    @Override // xsna.khv.a
    public final void b(String str, String str2) {
        khv khvVar = this.g;
        Object parent = khvVar != null ? khvVar.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        f(str);
    }

    public final boolean c() {
        khv khvVar = this.g;
        if (khvVar != null) {
            return khvVar.j;
        }
        return false;
    }

    public final void d(boolean z) {
        if (c()) {
            return;
        }
        Html5Entry html5Entry = this.e;
        khv khvVar = this.g;
        if (khvVar != null) {
            e(html5Entry);
            if (khvVar.getParent() == null) {
                addView(khvVar);
            }
            khvVar.c();
        }
        f(null);
        com.vk.newsfeed.common.util.k.f(html5Entry.w.b, z);
        com.vk.newsfeed.common.util.k.h(z, html5Entry);
    }

    public final void e(Html5Entry html5Entry) {
        khv khvVar = this.g;
        if (khvVar != null) {
            Html5Entry.Html5App html5App = html5Entry.w;
            if (khvVar.f || ((!khvVar.e && !khvVar.g) || !epx.f(khvVar.l, html5Entry))) {
                khvVar.g = true;
                khvVar.setPageLoaded(false);
                khvVar.f = false;
                khvVar.k = html5App.e;
                khvVar.h = true;
                khvVar.i = false;
                khvVar.l = html5Entry;
                String str = com.vk.newsfeed.common.util.k.a;
                b.d dVar = new b.d("ads/html5_browser_active");
                dVar.b(html5App.b, "track_code");
                xuo0.a.getClass();
                dVar.b(Long.valueOf(xuo0.c()), "at");
                dVar.e();
                khvVar.loadUrl(html5App.e);
            }
        }
        f(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String str) {
        boolean z;
        khv khvVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (c()) {
            khv khvVar2 = this.g;
            if (khvVar2 != null ? khvVar2.f : false) {
                z = true;
                khvVar = this.g;
                if (khvVar != null) {
                    if (c()) {
                        khv khvVar3 = this.g;
                        if (!(khvVar3 != null ? khvVar3.g : false) && !z) {
                            z4 = true;
                            bwt0.p0(khvVar, z4);
                        }
                    }
                    z4 = false;
                    bwt0.p0(khvVar, z4);
                }
                if (c()) {
                    khv khvVar4 = this.g;
                    if (!(khvVar4 != null ? khvVar4.g : false) && !z) {
                        z2 = false;
                        VKImageView vKImageView = this.h;
                        bwt0.p0(vKImageView, z2);
                        Html5Entry html5Entry = this.e;
                        Html5Entry.Html5App html5App = html5Entry.w;
                        bwt0.p0(this.m, html5App.d && html5App.c.length() > 0 && !c());
                        if (c()) {
                            khv khvVar5 = this.g;
                            if (khvVar5 != null ? khvVar5.g : false) {
                                z3 = true;
                                bwt0.p0(this.n, z3);
                                if (!z3 || z) {
                                    vKImageView.setImageBitmap(null);
                                } else {
                                    ImageSize Cb = html5Entry.w.g.Cb(this.f, true, false);
                                    vKImageView.o0(Cb != null ? Cb.d.d : null, null);
                                }
                                boolean a = dek0.c ? true : dek0.d.a(str);
                                bwt0.p0(this.l, (z || a) ? false : true);
                                if (z && a) {
                                    z5 = true;
                                }
                                bwt0.p0(this.k, z5);
                            }
                        }
                        z3 = false;
                        bwt0.p0(this.n, z3);
                        if (z3) {
                        }
                        vKImageView.setImageBitmap(null);
                        if (dek0.c) {
                        }
                        bwt0.p0(this.l, (z || a) ? false : true);
                        if (z) {
                            z5 = true;
                        }
                        bwt0.p0(this.k, z5);
                    }
                }
                z2 = true;
                VKImageView vKImageView2 = this.h;
                bwt0.p0(vKImageView2, z2);
                Html5Entry html5Entry2 = this.e;
                Html5Entry.Html5App html5App2 = html5Entry2.w;
                bwt0.p0(this.m, html5App2.d && html5App2.c.length() > 0 && !c());
                if (c()) {
                }
                z3 = false;
                bwt0.p0(this.n, z3);
                if (z3) {
                }
                vKImageView2.setImageBitmap(null);
                if (dek0.c) {
                }
                bwt0.p0(this.l, (z || a) ? false : true);
                if (z) {
                }
                bwt0.p0(this.k, z5);
            }
        }
        z = false;
        khvVar = this.g;
        if (khvVar != null) {
        }
        if (c()) {
        }
        z2 = true;
        VKImageView vKImageView22 = this.h;
        bwt0.p0(vKImageView22, z2);
        Html5Entry html5Entry22 = this.e;
        Html5Entry.Html5App html5App22 = html5Entry22.w;
        bwt0.p0(this.m, html5App22.d && html5App22.c.length() > 0 && !c());
        if (c()) {
        }
        z3 = false;
        bwt0.p0(this.n, z3);
        if (z3) {
        }
        vKImageView22.setImageBitmap(null);
        if (dek0.c) {
        }
        bwt0.p0(this.l, (z || a) ? false : true);
        if (z) {
        }
        bwt0.p0(this.k, z5);
    }

    public final Html5Entry getItem() {
        return this.e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.h || view == this.m) {
            d(false);
            return;
        }
        if (view == this.j && c()) {
            khv khvVar = this.g;
            if (khvVar != null ? khvVar.f : false) {
                Html5Entry html5Entry = this.e;
                if (khvVar != null) {
                    khvVar.stopLoading();
                    khvVar.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                    khvVar.loadDataWithBaseURL(null, "", "text/html", "uft-8", null);
                    khvVar.clearHistory();
                    e(html5Entry);
                    if (khvVar.getParent() == null) {
                        addView(khvVar);
                    }
                    khvVar.c();
                }
                f(null);
                com.vk.newsfeed.common.util.k.f(html5Entry.w.b, false);
                com.vk.newsfeed.common.util.k.h(false, html5Entry);
            }
        }
    }

    @Override // com.vk.core.tool.view.SimpleRatioFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + ((View.MeasureSpec.getSize(i) <= this.f || !((str = this.e.p) == null || str.length() == 0)) ? 0 : getResources().getDimensionPixelSize(R.dimen.html5_bottom_margin)));
    }
}
