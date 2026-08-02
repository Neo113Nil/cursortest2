package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.utj;

/* compiled from: SuccessAuthSnackbar.kt */
/* loaded from: classes6.dex */
public final class p1n0 {

    /* compiled from: SuccessAuthSnackbar.kt */
    public static final class a {
        public final boolean a = false;

        public a(int i) {
        }
    }

    public static void a(p1n0 p1n0Var, NavigationDelegateActivity navigationDelegateActivity, String str, String str2, Drawable drawable, a aVar) {
        View inflate = LayoutInflater.from(hnj.a(navigationDelegateActivity)).inflate(R.layout.vk_success_login_snackbar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.vk_success_login_snackbar_title)).setText(str == null ? navigationDelegateActivity.getString(R.string.vk_login_notification_greetings) : navigationDelegateActivity.getString(R.string.vk_login_notification_greetings_by_name, str));
        ((ImageView) inflate.findViewById(R.id.vk_vkid_logo)).setImageDrawable(drawable);
        View findViewById = inflate.findViewById(R.id.vk_success_login_agreement_link);
        findViewById.setVisibility(aVar.a ? 0 : 8);
        findViewById.setOnClickListener(new oyt(aVar, findViewById));
        VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.vk_success_login_snackbar_image);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(vKReplacerView.getContext());
        VKImageController.b bVar = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, VKImageController.ScaleType.CENTER_CROP, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65275);
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        create.f(str2 == null ? "" : str2, bVar);
        Context a2 = hnj.a(navigationDelegateActivity);
        int i = utj.s;
        int i2 = utj.t;
        int i3 = utj.u;
        int i4 = utj.v;
        FloatingViewGesturesHelper.SwipeDirection swipeDirection = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
        float f = utj.x;
        nc90 nc90Var = new nc90(17);
        utj utjVar = new utj(a2, new utj.k(null, null, false), new utj.i(false, false, true), new utj.f(i, i, i2, i2, i3, i4), new utj.j(inflate, null), new utj.h(null, null), new utj.e(null, null, null), new utj.b(null, null, null), new utj.c(null, null), new utj.d(swipeDirection, 3, 4000L, 0.7f, new utj.g(), null, false, f));
        utjVar.p = nc90Var;
        Activity b = gnj.b(navigationDelegateActivity);
        Window window = b != null ? b.getWindow() : null;
        if (window != null) {
            utjVar.f(window);
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) navigationDelegateActivity.findViewById(android.R.id.content);
            utjVar.l = null;
            utjVar.m = new WeakReference<>(viewGroup);
            utjVar.e();
        } catch (Exception e) {
            par0 par0Var = par0.a;
            String str3 = "Failed show snackbar: " + e.getMessage();
            par0Var.getClass();
            par0.b(str3);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
