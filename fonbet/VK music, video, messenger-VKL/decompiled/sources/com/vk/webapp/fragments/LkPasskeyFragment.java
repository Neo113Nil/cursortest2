package com.vk.webapp.fragments;

import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.a0a;
import xsna.er;
import xsna.jgr0;

/* compiled from: LkPasskeyFragment.kt */
/* loaded from: classes7.dex */
public final class LkPasskeyFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: LkPasskeyFragment.kt */
    public static final class a extends jgr0 {
    }

    /* compiled from: LkPasskeyFragment.kt */
    public static final class b {
        public static a a(String str) {
            if (str == null) {
                int i = LkPasskeyFragment.a0;
                str = er.a(HttpRequest.DEFAULT_SCHEME).authority("id.".concat(a0a.d)).appendEncodedPath("account/#/connected-keys").toString();
            }
            return new a(str, InternalMiniApps.ACCOUNT.h().a, LkPasskeyFragment.class, false, 20);
        }
    }
}
