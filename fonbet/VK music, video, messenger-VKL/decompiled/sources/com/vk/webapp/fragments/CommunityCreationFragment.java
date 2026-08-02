package com.vk.webapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.preference.Preference;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.drm0;
import xsna.e43;
import xsna.er;
import xsna.i1v0;
import xsna.mgx0;
import xsna.onx;
import xsna.oz50;
import xsna.qju;
import xsna.qnx;
import xsna.svv0;
import xsna.wwv0;

/* compiled from: CommunityCreationFragment.kt */
/* loaded from: classes7.dex */
public final class CommunityCreationFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: CommunityCreationFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunityCreationFragment.kt */
    public static final class b extends mgx0 {
        public final com.vk.movika.sdk.base.presenter.b c;

        public b(com.vk.movika.sdk.base.presenter.b bVar, c cVar, qnx qnxVar) {
            super(cVar, qnxVar);
            this.c = bVar;
        }

        @Override // xsna.mgx0, xsna.qju
        public final void d(String str) {
            super.d(str);
            this.c.invoke();
        }
    }

    /* compiled from: CommunityCreationFragment.kt */
    public static final class c extends onx {
        public b i0;

        @Override // xsna.onx, xsna.f8y
        public final qju f() {
            return this.i0;
        }
    }

    /* compiled from: CommunityCreationFragment.kt */
    public static final class d {
        public static a a(String str, String str2) {
            a aVar = new a(CommunityCreationFragment.class, null, null);
            Bundle bundle = aVar.j;
            if (str != null && !drm0.N(str)) {
                bundle.putString("source", str);
            }
            if (str2 != null && !drm0.N(str2)) {
                bundle.putString("type", str2);
            }
            return aVar;
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final boolean Ma(String str) {
        if (!new Regex("/(privacy|terms)").f(Uri.parse(str).getPath())) {
            return false;
        }
        WebViewFragment.c cVar = new WebViewFragment.c(str);
        cVar.z();
        cVar.D();
        cVar.F(false, false);
        cVar.C();
        cVar.k(getActivity());
        return true;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        Uri.Builder a2 = er.a(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Uri.Builder appendPath = a2.authority(Preference.g(context).getString("vkUiHostUri", "static.".concat(a0a.d))).appendPath("community_create");
        String string = bundle.getString("source");
        String string2 = bundle.getString("type");
        if (string != null && string.length() != 0) {
            appendPath.appendQueryParameter("source", string);
        }
        if (string2 != null && string2.length() != 0) {
            appendPath.appendQueryParameter("type", string2);
        }
        return new svv0.b(appendPath.appendEncodedPath("").build().toString(), InternalVkMiniApps.COMMUNITY_CREATE.h().a, false, null, false, false, 252);
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        return new com.vk.webapp.fragments.a(wwv0Var, this);
    }
}
