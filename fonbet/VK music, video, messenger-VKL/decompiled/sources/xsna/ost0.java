package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;

/* compiled from: VideoWebViewLink.kt */
/* loaded from: classes14.dex */
public final class ost0 implements kss0 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (xsna.peq0.p(r9, new kotlin.text.Regex(xsna.efz.b(com.vk.superapp.miniapps.api.utils.InternalVkMiniApps.DONUT_PAYMENT.h().a, ")|(/@donut-android)", new java.lang.StringBuilder("^(/landings/.+)|(/legal/.+)|(/app"))), null, null, 14) == false) goto L8;
     */
    @Override // xsna.kss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(peq0 peq0Var) {
        Uri uri = peq0Var.a;
        String host = uri.getHost();
        if (host != null && drm0.D(host, "vkvideo", false)) {
        }
        String host2 = uri.getHost();
        return host2 != null && drm0.D(host2, "vk", false) && peq0Var.m(0, "/@donut-android");
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        xwk.d().getBrowser().i(context, peq0Var.a, LaunchContext.a(launchContext, null, 67108859), null);
        return null;
    }
}
