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
import xsna.er;
import xsna.oz50;
import xsna.svv0;

/* compiled from: NewsfeedSettingsAppFragment.kt */
/* loaded from: classes7.dex */
public final class NewsfeedSettingsAppFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: NewsfeedSettingsAppFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: NewsfeedSettingsAppFragment.kt */
    public static final class b {
        public static a a() {
            a aVar = new a(NewsfeedSettingsAppFragment.class, null, null);
            aVar.j.putString("section", "face_recognition");
            return aVar;
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("section") : null;
        Uri.Builder a2 = er.a(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        Uri.Builder appendEncodedPath = a2.authority(Preference.g(context != null ? context : null).getString("vkUiHostUri", "static.".concat(a0a.d))).appendEncodedPath("feed_settings/");
        if (string != null && string.length() != 0) {
            appendEncodedPath.appendQueryParameter("section", string);
        }
        return new svv0.b(appendEncodedPath.build().toString(), InternalVkMiniApps.FEED_SETTINGS.h().a, false, null, false, false, 252);
    }
}
