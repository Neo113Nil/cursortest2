package yads;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;

/* loaded from: classes10.dex */
public final class md implements Runnable {
    public final /* synthetic */ od b;

    public md(od odVar) {
        this.b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.b;
        dd ddVar = odVar.a;
        String str = odVar.d;
        ddVar.getClass();
        if (str != null) {
            ed edVar = new ed(ddVar.a);
            Context context = ddVar.a;
            ad adVar = new ad(context, true, 12);
            ne1 ne1Var = new ne1();
            Dialog dialog = new Dialog(context, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
            ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
            if (extendedViewContainer != null) {
                extendedViewContainer.setMeasureSpecProvider(adVar);
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
            if (viewGroup2 != null) {
                viewGroup2.addView(edVar);
            }
            View findViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
            if (findViewById != null) {
                findViewById.setOnTouchListener(new zc(viewGroup, dialog, ne1Var));
            }
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
            if (viewGroup3 != null) {
                viewGroup3.setOnClickListener(new yc(dialog, ne1Var));
            }
            dialog.setContentView(viewGroup);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            og0.a(dialog);
            edVar.setAdtuneWebViewListener(new bd(new cd(dialog, edVar)));
            edVar.loadUrl(str);
            dialog.show();
        }
    }
}
