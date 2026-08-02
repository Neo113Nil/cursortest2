package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;
import xsna.u0z0;

/* loaded from: classes10.dex */
public final class id {
    public static boolean d;
    public final vm0 a;
    public final pb2 b;
    public final b1 c;

    public /* synthetic */ id(vm0 vm0Var, pb2 pb2Var) {
        this(vm0Var, pb2Var, new b1());
    }

    public final void a(Activity activity, kd kdVar, rc rcVar) {
        ad adVar = new ad(activity, false, 14);
        ne1 ne1Var = new ne1();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(adVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            if (ub.a(35)) {
                uc.a(viewGroup2);
            }
            viewGroup2.addView(kdVar);
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
        dialog.setOnDismissListener(new u0z0());
        vm0 vm0Var = this.a;
        pb2 pb2Var = this.b;
        Handler handler = new Handler(Looper.getMainLooper());
        xc xcVar = new xc(dialog, kdVar, vm0Var, pb2Var, handler);
        String str = rcVar.b;
        String str2 = rcVar.c;
        kdVar.setAdtuneWebViewListener(new vc(xcVar));
        kdVar.setOptOutUrl(str2);
        kdVar.loadUrl(str);
        handler.postDelayed(new wc(xcVar), xc.e);
        dialog.show();
    }

    public id(vm0 vm0Var, pb2 pb2Var, b1 b1Var) {
        this.a = vm0Var;
        this.b = pb2Var;
        this.c = b1Var;
    }

    public static final void a(DialogInterface dialogInterface) {
        d = false;
    }

    public final void a(View view, rc rcVar) {
        Activity activity;
        Activity b;
        if (d) {
            return;
        }
        this.c.getClass();
        Context context = view.getContext();
        do {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    context = contextWrapper.getBaseContext();
                }
            } else {
                break;
            }
        } while (context != null);
        activity = null;
        if (activity == null) {
            synchronized (j1.a) {
                k1 k1Var = j1.b;
                b = k1Var != null ? k1Var.b() : null;
            }
            activity = b;
        }
        if (activity == null || !tb.a((Context) activity)) {
            return;
        }
        try {
            kd kdVar = new kd(activity);
            d = true;
            a(activity, kdVar, rcVar);
        } catch (Throwable unused) {
            d = false;
        }
    }
}
