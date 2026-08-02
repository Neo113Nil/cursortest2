package com.vkontakte.android.fragments;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.er;
import xsna.jgr0;

/* compiled from: PromocodeFragment.kt */
/* loaded from: classes7.dex */
public final class PromocodeFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: PromocodeFragment.kt */
    public static final class a extends jgr0 {
    }

    /* compiled from: PromocodeFragment.kt */
    public static final class b {
        public static a a() {
            int i = PromocodeFragment.a0;
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i2 = VKSuperAppBrowserFragment.Y;
            Uri.Builder authority = a.authority(VKSuperAppBrowserFragment.a.a());
            InternalVkMiniApps internalVkMiniApps = InternalVkMiniApps.PROMO_CODES;
            return new a(authority.appendPath(internalVkMiniApps.h().b).toString(), internalVkMiniApps.h().a, PromocodeFragment.class, false, 20);
        }
    }
}
