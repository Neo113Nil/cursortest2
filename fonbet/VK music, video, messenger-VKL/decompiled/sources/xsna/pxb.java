package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.nwb;

/* compiled from: ChatProfileSimpleItemDelegate.kt */
/* loaded from: classes2.dex */
public final class pxb {
    public static final void a(View view, nwb.g gVar) {
        t0w0 t0w0Var;
        int b = cn70.b(16);
        int b2 = cn70.b(8);
        int b3 = cn70.b(8);
        view.setClipToOutline(true);
        if (gVar.a() && gVar.c()) {
            b2 = cn70.b(12);
            b3 = cn70.b(12);
            t0w0Var = new t0w0(6, cn70.a() * 20.0f, false, false);
        } else if (gVar.a()) {
            b2 = cn70.b(12);
            t0w0Var = new t0w0(4, cn70.a() * 20.0f, false, false);
        } else if (gVar.c()) {
            b3 = cn70.b(12);
            t0w0Var = new t0w0(2, cn70.a() * 20.0f, false, false);
        } else {
            t0w0Var = new t0w0(6, cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false);
        }
        view.setOutlineProvider(t0w0Var);
        view.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e3m.f(R.attr.vk_ui_background_content, view.getContext()), 0, 254));
        view.setPadding(b, b2, b, b3);
    }
}
