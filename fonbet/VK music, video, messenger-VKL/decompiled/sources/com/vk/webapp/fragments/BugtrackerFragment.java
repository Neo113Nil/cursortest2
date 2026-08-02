package com.vk.webapp.fragments;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.er;
import xsna.jgr0;

/* compiled from: BugtrackerFragment.kt */
/* loaded from: classes7.dex */
public final class BugtrackerFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: BugtrackerFragment.kt */
    public static final class a extends jgr0 {
    }

    /* compiled from: BugtrackerFragment.kt */
    public static final class b {
        public static void a(Context context, String str) {
            int i = BugtrackerFragment.a0;
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i2 = VKSuperAppBrowserFragment.Y;
            Uri.Builder appendEncodedPath = a.authority(VKSuperAppBrowserFragment.a.a()).appendPath("bugs").appendEncodedPath("");
            if (str != null) {
                appendEncodedPath.appendQueryParameter("from", str);
            }
            new a(appendEncodedPath.toString(), InternalVkMiniApps.BUGS.h().a, BugtrackerFragment.class, false, 20).k(context);
        }
    }
}
