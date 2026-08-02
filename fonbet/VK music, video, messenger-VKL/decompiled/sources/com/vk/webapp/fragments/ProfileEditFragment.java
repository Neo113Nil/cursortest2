package com.vk.webapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.preference.Preference;
import com.vk.dto.ProfileEditPage;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import kotlin.collections.EmptySet;
import xsna.a0a;
import xsna.drm0;
import xsna.e43;
import xsna.ieq0;
import xsna.oz50;
import xsna.svv0;

/* compiled from: ProfileEditFragment.kt */
/* loaded from: classes7.dex */
public final class ProfileEditFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: ProfileEditFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ProfileEditFragment.kt */
    public static final class b {
        public static a a(String str, ProfileEditPage profileEditPage, int i) {
            int i2 = ProfileEditFragment.a0;
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                profileEditPage = null;
            }
            a aVar = new a(ProfileEditFragment.class, null, null);
            Bundle bundle = aVar.j;
            bundle.putString("url", str);
            if (profileEditPage == null) {
                return aVar;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(HttpRequest.DEFAULT_SCHEME);
            int i3 = VKSuperAppBrowserFragment.Y;
            builder.authority(VKSuperAppBrowserFragment.a.a());
            builder.appendPath(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            ieq0.a(builder);
            builder.appendQueryParameter("act", "open");
            String string = bundle.getString("url");
            if (string != null && !drm0.N(string)) {
                Uri parse = Uri.parse(string);
                for (String str2 : parse.getQueryParameterNames()) {
                    builder.appendQueryParameter(str2, parse.getQueryParameter(str2));
                }
            }
            builder.appendQueryParameter("page", profileEditPage.a);
            profileEditPage.a().getClass();
            EmptySet.b.getClass();
            bundle.putString("url", builder.toString());
            return aVar;
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        String string;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        builder.authority(Preference.g(context).getString("vkUiHostUri", "static.".concat(a0a.d)));
        builder.appendPath(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        ieq0.a(builder);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("url")) != null) {
            Uri parse = Uri.parse(string);
            for (String str : parse.getQueryParameterNames()) {
                builder.appendQueryParameter(str, parse.getQueryParameter(str));
            }
        }
        return new svv0.b(builder.build().toString(), InternalVkMiniApps.PROFILE.h().a, false, null, false, false, 252);
    }
}
