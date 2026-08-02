package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;
import yads.mb;
import yads.nb;
import yads.sb;

/* loaded from: classes7.dex */
public final class ph61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl61 b;

    public /* synthetic */ ph61(vl61 vl61Var, int i) {
        this.a = i;
        this.b = vl61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vl61 vl61Var = this.b;
        switch (i) {
            case 0:
                f071 f071Var = vl61Var.e;
                if (f071Var != null) {
                    ((Handler) ((aj71) f071Var).a.x).removeCallbacksAndMessages(null);
                    break;
                }
                break;
            case 1:
                vl61Var.a();
                break;
            default:
                a40 a40Var = vl61Var.a;
                m671 m671Var = vl61Var.b;
                sb sbVar = new sb(a40Var.a);
                Activity activity = a40Var.a;
                kzo kzoVar = new kzo(activity, 12);
                gs71 gs71Var = new gs71();
                Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, m671Var.d ? R$style.MonetizationAdsInternal_AdtuneTheme_Dark : R$style.MonetizationAdsInternal_AdtuneTheme_Light)).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
                ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
                if (extendedViewContainer != null) {
                    extendedViewContainer.setMeasureSpecProvider(kzoVar);
                }
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
                if (viewGroup2 != null) {
                    viewGroup2.addView(sbVar);
                }
                View findViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
                if (findViewById != null) {
                    findViewById.setOnTouchListener(new nb(viewGroup, dialog, gs71Var));
                }
                ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
                if (viewGroup3 != null) {
                    viewGroup3.setOnClickListener(new mb(dialog, gs71Var));
                }
                dialog.setContentView(viewGroup);
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setGravity(80);
                }
                yga1.a(dialog);
                lm71 lm71Var = new lm71(5, dialog);
                String str = m671Var.c;
                sbVar.setAdtuneWebViewListener(new t181(lm71Var));
                sbVar.loadUrl(str);
                dialog.show();
                break;
        }
    }
}
