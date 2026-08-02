package com.vk.webapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.preference.Preference;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.a0a;
import xsna.asp;
import xsna.drm0;
import xsna.e43;
import xsna.er;
import xsna.oz50;
import xsna.svv0;
import xsna.zrp;

/* compiled from: PrivacyFragment.kt */
/* loaded from: classes7.dex */
public final class PrivacyFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivacyFragment.kt */
    public static final class PrivacySetting {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrivacySetting[] $VALUES;
        public static final PrivacySetting AUDIOS;
        public static final PrivacySetting CALLS;
        public static final PrivacySetting STORIES;
        private final String value;

        static {
            PrivacySetting privacySetting = new PrivacySetting("STORIES", 0, "stories");
            STORIES = privacySetting;
            PrivacySetting privacySetting2 = new PrivacySetting("AUDIOS", 1, "audios");
            AUDIOS = privacySetting2;
            PrivacySetting privacySetting3 = new PrivacySetting("CALLS", 2, "calls");
            CALLS = privacySetting3;
            PrivacySetting[] privacySettingArr = {privacySetting, privacySetting2, privacySetting3};
            $VALUES = privacySettingArr;
            $ENTRIES = new asp(privacySettingArr);
        }

        public PrivacySetting(String str, int i, String str2) {
            this.value = str2;
        }

        public static PrivacySetting valueOf(String str) {
            return (PrivacySetting) Enum.valueOf(PrivacySetting.class, str);
        }

        public static PrivacySetting[] values() {
            return (PrivacySetting[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: PrivacyFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: PrivacyFragment.kt */
    public static final class b {
        public static a a(boolean z, boolean z2, String str, Bundle bundle, int i) {
            int i2 = PrivacyFragment.a0;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            String str2 = (i & 16) != 0 ? null : "settings";
            if ((i & 32) != 0) {
                bundle = null;
            }
            a aVar = new a(PrivacyFragment.class, null, null);
            Bundle bundle2 = aVar.j;
            if (bundle != null) {
                bundle2.putBundle("KEY_ARG_GET_PARAMS", bundle);
            }
            if (z) {
                bundle2.putString("SETTING_ARG_KEY", "closed_profile");
            }
            if (z2) {
                bundle2.putString("SETTING_ARG_KEY", "questions");
            }
            if (str != null) {
                bundle2.putString("SETTING_ARG_KEY", str);
            }
            if (str2 != null) {
                bundle2.putString("VK_REF_ARG_KEY", str2);
            }
            return aVar;
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        setResult(-1, new Intent());
        return super.a0();
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        String string;
        String string2;
        String string3;
        Bundle bundle2;
        String str;
        Uri.Builder a2 = er.a(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Uri.Builder appendEncodedPath = a2.authority(Preference.g(context).getString("vkUiHostUri", "static.".concat(a0a.d))).appendEncodedPath("privacy").appendEncodedPath("");
        Bundle arguments = getArguments();
        if (arguments != null && (bundle2 = arguments.getBundle("KEY_ARG_GET_PARAMS")) != null) {
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj == null || (str = obj.toString()) == null) {
                    str = "";
                }
                if (!drm0.N(str)) {
                    appendEncodedPath.appendQueryParameter(str2, str);
                }
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string3 = arguments2.getString("SETTING_ARG_KEY")) != null) {
            appendEncodedPath.appendQueryParameter("setting", string3);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("SECTION_ARG_KEY")) != null) {
            appendEncodedPath.appendQueryParameter("section", string2);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string = arguments4.getString("VK_REF_ARG_KEY")) != null && !drm0.N(string)) {
            appendEncodedPath.appendQueryParameter("vk_ref", string);
        }
        return new svv0.b(appendEncodedPath.build().toString(), InternalVkMiniApps.PRIVACY.h().a, false, null, false, false, 252);
    }
}
