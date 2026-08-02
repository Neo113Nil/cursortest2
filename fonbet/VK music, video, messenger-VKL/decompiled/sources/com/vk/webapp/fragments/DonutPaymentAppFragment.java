package com.vk.webapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.preference.Preference;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.a0a;
import xsna.e43;
import xsna.epx;
import xsna.er;
import xsna.oz50;
import xsna.svv0;

/* compiled from: DonutPaymentAppFragment.kt */
/* loaded from: classes7.dex */
public final class DonutPaymentAppFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: DonutPaymentAppFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DonutPaymentAppFragment.kt */
    public static final class b {
        public static a a(long j, Integer num, String str, boolean z) {
            a aVar = new a(DonutPaymentAppFragment.class, null, null);
            Bundle bundle = aVar.j;
            bundle.putLong("owner_id", j);
            if (str != null) {
                bundle.putString("source", str);
            }
            if (z) {
                bundle.putBoolean("enable_unsubscribe", true);
            }
            if (num != null) {
                bundle.putInt("levelId", num.intValue());
            }
            return aVar;
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        Bundle arguments = getArguments();
        Long valueOf = arguments != null ? Long.valueOf(arguments.getLong("owner_id")) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("source") : null;
        Bundle arguments3 = getArguments();
        Boolean valueOf2 = arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("enable_unsubscribe", false)) : null;
        Bundle arguments4 = getArguments();
        Integer valueOf3 = arguments4 != null ? Integer.valueOf(arguments4.getInt("levelId", -1)) : null;
        Uri.Builder a2 = er.a(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        Uri.Builder appendEncodedPath = a2.authority(Preference.g(context != null ? context : null).getString("vkUiHostUri", "static.".concat(a0a.d))).appendEncodedPath("donut_payment/");
        if (valueOf3 == null || valueOf3.intValue() != -1) {
            appendEncodedPath.appendEncodedPath("#/level");
            appendEncodedPath.appendQueryParameter("id", String.valueOf(valueOf3));
        }
        Uri.Builder appendQueryParameter = appendEncodedPath.appendQueryParameter("owner_id", String.valueOf(valueOf)).appendQueryParameter("source", string);
        if (epx.f(valueOf2, Boolean.TRUE)) {
            appendQueryParameter.appendQueryParameter("enable_unsubscribe", "1");
        }
        return new svv0.b(appendQueryParameter.build().toString(), InternalVkMiniApps.DONUT_PAYMENT.h().a, false, null, false, false, 252);
    }
}
