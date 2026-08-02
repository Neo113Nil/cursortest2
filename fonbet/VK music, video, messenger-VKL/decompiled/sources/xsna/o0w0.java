package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import com.vk.media.qrcode.core.ui.SvgDrawable;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.xfx0;

/* compiled from: VkViewComponentProviderDelegate.kt */
/* loaded from: classes6.dex */
public final class o0w0 extends ps6 {
    public final fvv0 i;
    public final mfu0 j;
    public final ggu0 k;
    public final io.reactivex.rxjava3.disposables.b l;
    public final xbt0 m;
    public final fcs0 n;
    public final vg3 o;
    public ViewGroup p;
    public yau0 q;
    public ViewGroup r;
    public FrameLayout s;
    public ImageView t;

    public o0w0(fvv0 fvv0Var, mfu0 mfu0Var, ggu0 ggu0Var, io.reactivex.rxjava3.disposables.b bVar, xbt0 xbt0Var, fcs0 fcs0Var, vg3 vg3Var, ykt0 ykt0Var, mxv0 mxv0Var) {
        super(fvv0Var, mfu0Var, xbt0Var, vg3Var, ykt0Var, mxv0Var);
        this.i = fvv0Var;
        this.j = mfu0Var;
        this.k = ggu0Var;
        this.l = bVar;
        this.m = xbt0Var;
        this.n = fcs0Var;
        this.o = vg3Var;
    }

    @Override // xsna.qxv0
    public final FrameLayout b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.vk_apps_app_install, viewGroup, false);
        Context context = ((ggu0) this.m.c).b;
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.vk_apps_install_game_screenshots);
        HashSet hashSet = iah0.a;
        int a = iah0.a(fnj.d(context) ? 64 : 16);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new z0x(iah0.a(8), a));
        }
        this.s = frameLayout;
        return frameLayout;
    }

    @Override // xsna.qxv0
    public final FrameLayout c() {
        return this.s;
    }

    @Override // xsna.qxv0
    public final ViewGroup d() {
        return this.p;
    }

    @Override // xsna.qxv0
    public final yau0 e() {
        return this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0202  */
    @Override // xsna.qxv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        ViewGroup viewGroup2;
        xfx0.a aVar;
        xfx0.a aVar2;
        SvgDrawable svgDrawable;
        Integer a;
        int f;
        ImageView imageView;
        ImageView imageView2;
        ggu0 ggu0Var = (ggu0) this.m.c;
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        fvv0 fvv0Var = this.i;
        ViewGroup h = superappUiRouterBridge.h(fvv0Var.getAppId(), layoutInflater, viewGroup, new qjo0(this, 15));
        if (h != null) {
            return h;
        }
        if (fvv0Var.v() == null) {
            Context context = ggu0Var.b;
            ProgressBar progressBar = new ProgressBar(context);
            progressBar.setIndeterminate(true);
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_tertiary, context)));
            progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
            float f2 = 50;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f2), 17);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(progressBar, layoutParams);
            return frameLayout;
        }
        if (fvv0Var.S()) {
            WebApiApplication t = fvv0Var.t();
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vk_apps_app_info_item, viewGroup, false);
            Context context2 = ggu0Var.b;
            WebAppSplashScreen webAppSplashScreen = t.O;
            VKReplacerView vKReplacerView = (VKReplacerView) viewGroup2.findViewById(R.id.image);
            int i2 = 6;
            if (webAppSplashScreen != null) {
                String str = webAppSplashScreen.b;
                if (!drm0.N(str)) {
                    wex0 wex0Var = e370.n;
                    wex0 wex0Var2 = wex0Var != null ? wex0Var : null;
                    zgn0 zgn0Var = new zgn0(str, ImageView.ScaleType.FIT_CENTER);
                    wex0Var2.getClass();
                    io.reactivex.rxjava3.core.q<byte[]> a2 = wex0Var2.a(zgn0Var.a);
                    qvm0 qvm0Var = new qvm0(i2, zgn0Var, context2);
                    int i3 = 20;
                    hg1.e(this.l, a2.U(new hi70(qvm0Var, i3)).K().subscribe(new j3z(new ojg(vKReplacerView, viewGroup2, webAppSplashScreen, 5), 27), new lw30(new lx60(i3, context2, t), 21)));
                    i = 2;
                    a = xfx0.a(t);
                    if (a != null) {
                        viewGroup2.setBackgroundColor(a.intValue());
                    }
                    if (a != null || a.intValue() == -1) {
                        f = e3m.f(R.attr.vk_ui_icon_tertiary, ggu0Var.b);
                    } else {
                        int intValue = a.intValue();
                        float[] fArr = new float[3];
                        n8g.h(intValue, fArr);
                        f = ((double) fArr[i]) > Math.sqrt(0.10000000149011612d) - 0.05000000074505806d ? 1526726656 : 1543503871;
                    }
                    this.t = (ImageView) viewGroup2.findViewById(R.id.icon);
                    int i4 = !t.f() ? R.drawable.vk_icon_vk_product_games_logo_20h : R.drawable.vk_icon_vk_product_mini_apps_logo_20h;
                    imageView = this.t;
                    if (imageView != null) {
                        imageView.setImageResource(i4);
                    }
                    imageView2 = this.t;
                    if (imageView2 != null) {
                        imageView2.setColorFilter(f, PorterDuff.Mode.SRC_IN);
                    }
                    ((ProgressBar) viewGroup2.findViewById(R.id.progress)).getIndeterminateDrawable().setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
                }
            }
            Context context3 = ggu0Var.b;
            VkImage vkImage = new VkImage(context3, null, 6, 0);
            vKReplacerView.a(vkImage);
            int a3 = iah0.a(96);
            long j = t.b;
            String str2 = t.E;
            if (str2 == null || str2.length() == 0) {
                xfx0.a[] values = xfx0.a.values();
                i = 2;
                int length = values.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i5];
                    if (aVar.getId() == j) {
                        break;
                    }
                    i5++;
                }
                if (aVar != null) {
                    xfx0.a[] values2 = xfx0.a.values();
                    int length2 = values2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            aVar2 = null;
                            break;
                        }
                        aVar2 = values2[i6];
                        if (aVar2.getId() == j) {
                            break;
                        }
                        i6++;
                    }
                    if (aVar2 != null) {
                        str2 = aVar2.i();
                    }
                }
                str2 = null;
            } else {
                i = 2;
            }
            if (str2 != null) {
                efx0 efx0Var = e370.k;
                if (efx0Var == null) {
                    efx0Var = null;
                }
                efx0Var.getClass();
                svgDrawable = new SvgDrawable(str2, a3, a3);
            } else {
                svgDrawable = null;
            }
            String str3 = t.d.a(a3).b;
            int a4 = iah0.a(12);
            vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (svgDrawable != null) {
                vkImage.setPadding(0, 0, 0, 0);
                vkImage.setImageDrawable(svgDrawable);
            } else if (myc0.f(str3)) {
                vkImage.setPadding(a4, a4, a4, a4);
                vkImage.setCornerRadius(iah0.b(14.0f));
                vkImage.setPlaceholderImage(R.drawable.vk_app_loading_icon_placeholder);
                vkImage.o0(str3, null);
            } else {
                vkImage.setPadding(a4, a4, a4, a4);
                vkImage.setBackgroundResource(R.drawable.vk_app_loading_icon_placeholder);
                vkImage.setColorFilter(e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, context3));
                vkImage.setImageResource(fvv0Var.h() ? R.drawable.vk_icon_game_28 : R.drawable.vk_icon_services_28);
            }
            a = xfx0.a(t);
            if (a != null) {
            }
            if (a != null) {
            }
            f = e3m.f(R.attr.vk_ui_icon_tertiary, ggu0Var.b);
            this.t = (ImageView) viewGroup2.findViewById(R.id.icon);
            if (!t.f()) {
            }
            imageView = this.t;
            if (imageView != null) {
            }
            imageView2 = this.t;
            if (imageView2 != null) {
            }
            ((ProgressBar) viewGroup2.findViewById(R.id.progress)).getIndeterminateDrawable().setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        } else {
            i = 2;
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vk_apps_default_loading, viewGroup, false);
        }
        View findViewById = viewGroup2.findViewById(R.id.show_console);
        if (findViewById != null) {
            findViewById.setOnClickListener(new eh5(i, viewGroup2, this));
        }
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) viewGroup2.findViewById(R.id.vk_apps_vk_connect);
        r55 r55Var = r55.a;
        vkAuthToolbar.setPicture(r55.i().b(ggu0Var.b));
        this.q = new yau0(viewGroup2.findViewById(R.id.apps_app_info_vk_connect), fvv0Var, this.k);
        this.p = viewGroup2;
        return viewGroup2;
    }

    @Override // xsna.qxv0
    public final ViewGroup h(LayoutInflater layoutInflater, ViewGroup viewGroup, gzs gzsVar) {
        ViewGroup viewGroup2 = (ViewGroup) this.o.invoke((FrameLayout) layoutInflater.inflate(R.layout.vk_apps_app_error, viewGroup, false), Boolean.TRUE);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.vk_apps_error_retry);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.vk_apps_error_bottom_img);
        textView.setOnClickListener(new lo3(gzsVar, 7));
        fvv0 fvv0Var = this.i;
        if (fvv0Var.S()) {
            imageView.setImageResource(fvv0Var.t().e() ? R.drawable.vk_icon_vk_product_games_logo_20h : R.drawable.vk_icon_vk_product_mini_apps_logo_20h);
            imageView.setVisibility(0);
        } else {
            f4m.j(imageView);
        }
        View findViewById = viewGroup2.findViewById(R.id.show_console);
        if (findViewById != null) {
            findViewById.setOnClickListener(new r0c0(1, this, viewGroup2));
        }
        this.r = viewGroup2;
        return viewGroup2;
    }

    @Override // xsna.qxv0
    public final void i() {
        if (xfx0.a(this.i.t()) == null) {
            int l = krv0.l(R.attr.vk_ui_overlay_primary);
            ViewGroup viewGroup = this.p;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(l);
            }
        }
    }

    @Override // xsna.qxv0
    public final ViewGroup m0() {
        return this.r;
    }

    @Override // xsna.qxv0
    public final void onDestroyView() {
        ConstraintLayout constraintLayout;
        yau0 yau0Var = this.q;
        if (yau0Var != null) {
            yau0Var.b.Q().remove(yau0Var.h);
            yau0Var.f.e();
            ((oao0) yau0Var.j.e).b();
        }
        this.q = null;
        this.p = null;
        this.t = null;
        WebView view = this.j.getState().getView();
        if (view == null || (constraintLayout = this.g) == null) {
            return;
        }
        constraintLayout.removeView(view);
    }
}
