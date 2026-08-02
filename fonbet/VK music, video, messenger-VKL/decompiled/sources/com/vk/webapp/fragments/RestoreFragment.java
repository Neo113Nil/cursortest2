package com.vk.webapp.fragments;

import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.restore.RestoreNavValue;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.CoreFeatures;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.ies;
import xsna.oz50;
import xsna.wwc0;

/* compiled from: RestoreFragment.kt */
/* loaded from: classes7.dex */
public class RestoreFragment extends VKSuperAppBrowserFragment implements ies, wwc0 {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: RestoreFragment.kt */
    public static class a extends oz50 {
    }

    /* compiled from: RestoreFragment.kt */
    public static final class b {
        public static a a(String str, String str2, RestoreNavValue restoreNavValue) {
            String a;
            a aVar = new a(RestoreFragment.class, null, null);
            int i = RestoreFragment.a0;
            if (SakFeatures.Type.VKC_RESTORE_TO_VK_ID_HOST.h()) {
                CoreFeatures coreFeatures = CoreFeatures.SWITCH_VK_RU_DOMAIN;
                coreFeatures.getClass();
                a = "id.".concat(com.vk.toggle.b.A.a(coreFeatures) ? "vk.ru" : "vk.com");
            } else {
                int i2 = VKSuperAppBrowserFragment.Y;
                a = VKSuperAppBrowserFragment.a.a();
            }
            Uri.Builder appendEncodedPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(a).appendPath("restore").appendEncodedPath("");
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                for (String str3 : parse.getQueryParameterNames()) {
                    appendEncodedPath.appendQueryParameter(str3, parse.getQueryParameter(str3));
                }
                String fragment = parse.getFragment();
                if (fragment != null) {
                    appendEncodedPath.appendEncodedPath("#" + fragment + '/');
                }
            }
            Matcher matcher = str != null ? Pattern.compile("/restore/([A-Fa-f0-9]{10,})$").matcher(str) : null;
            String group = (matcher == null || !matcher.find()) ? null : matcher.group(1);
            if (group != null) {
                appendEncodedPath.appendQueryParameter("h", group);
            }
            if (!TextUtils.isEmpty(str2)) {
                appendEncodedPath.appendQueryParameter("login", str2);
            }
            appendEncodedPath.appendQueryParameter("restore_nav", restoreNavValue != null ? restoreNavValue.h() : null);
            aVar.j.putString("key_url", appendEncodedPath.build().toString());
            return aVar;
        }
    }
}
