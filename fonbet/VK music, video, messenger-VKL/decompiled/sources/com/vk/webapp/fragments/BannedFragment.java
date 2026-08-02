package com.vk.webapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.api.models.AuthResult;
import com.vk.movika.sdk.base.logic.processor.actions.h;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.webapp.fragments.HelpFragment;
import com.vk.webapp.fragments.RestoreFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.bpn0;
import xsna.bu1;
import xsna.cqm0;
import xsna.drm0;
import xsna.epx;
import xsna.er;
import xsna.fvv0;
import xsna.i1v0;
import xsna.ies;
import xsna.jgr0;
import xsna.laz;
import xsna.lbc0;
import xsna.naz;
import xsna.o25;
import xsna.o4y;
import xsna.pro0;
import xsna.r6y;
import xsna.w25;
import xsna.wwc0;
import xsna.wwv0;

/* compiled from: BannedFragment.kt */
/* loaded from: classes7.dex */
public final class BannedFragment extends VKSuperAppBrowserFragment implements ies, wwc0 {
    public static final /* synthetic */ int c0 = 0;
    public final bpn0 a0 = new bpn0(new h(this, 4));
    public final bpn0 b0 = new bpn0(new i(this, 3));

    /* compiled from: BannedFragment.kt */
    public final class a extends r6y {
        public fvv0 d0;

        public a(fvv0 fvv0Var) {
            super(fvv0Var);
            this.d0 = fvv0Var;
        }

        @Override // xsna.v1y
        public final w25 D() {
            int i = BannedFragment.c0;
            BannedFragment bannedFragment = BannedFragment.this;
            String str = (String) bannedFragment.a0.getValue();
            String str2 = (String) bannedFragment.b0.getValue();
            return new w25(o25.a().I(), o25.a().r(), o25.a().v(), o25.a().c(), str, str2);
        }

        @Override // xsna.x6y
        public final fvv0 M() {
            return this.d0;
        }

        @Override // xsna.x6y
        public final void O(fvv0 fvv0Var) {
            this.d0 = fvv0Var;
        }
    }

    /* compiled from: BannedFragment.kt */
    public static final class b extends jgr0 {
    }

    /* compiled from: BannedFragment.kt */
    public static final class c {
        public static b a(String str, String str2, String str3) {
            int i = BannedFragment.c0;
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i2 = VKSuperAppBrowserFragment.Y;
            Uri.Builder appendEncodedPath = a.authority(VKSuperAppBrowserFragment.a.a()).appendPath("blocked").appendEncodedPath("");
            if (str3 == null) {
                str3 = "";
            }
            b bVar = new b(appendEncodedPath.appendQueryParameter("first_name", str3).build().toString(), InternalMiniApps.BLOCKED.h().a, BannedFragment.class, false, 20);
            Bundle bundle = bVar.j;
            bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, str);
            bundle.putString("secret", str2);
            bundle.putBoolean("userWasLoggedIn", false);
            return bVar;
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(2L);
    }

    public BannedFragment() {
        new bpn0(new bu1(this, 3));
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final String B9(String str) {
        return drm0.D(str, "faq", false) ? Uri.parse(str).buildUpon().appendQueryParameter(CommonConstant.KEY_ACCESS_TOKEN, (String) this.a0.getValue()).build().toString() : str;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final boolean Ma(String str) {
        Uri parse = Uri.parse(str);
        Object obj = naz.a;
        String host = parse.getHost();
        if ((host == null || host.length() == 0) ? false : ((Regex) laz.d.getValue()).f(cqm0.m(String.valueOf(parse.getHost())))) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                WebViewFragment.c cVar = new WebViewFragment.c(str);
                cVar.F(false, false);
                cVar.s(true);
                cVar.t();
                cVar.o();
                cVar.k(mo2getContext);
                return true;
            }
        } else if (epx.f(parse.getPath(), "/restore")) {
            Context mo2getContext2 = mo2getContext();
            if (mo2getContext2 != null) {
                RestoreFragment.a a2 = RestoreFragment.b.a(str, null, null);
                a2.s(true);
                a2.t();
                a2.o();
                startActivityForResult(a2.n(mo2getContext2), 542);
                return true;
            }
        } else {
            if (!epx.f(parse.getPath(), "/support")) {
                return false;
            }
            Context mo2getContext3 = mo2getContext();
            if (mo2getContext3 != null) {
                String str2 = (String) this.a0.getValue();
                String str3 = (String) this.b0.getValue();
                HelpFragment.a aVar = new HelpFragment.a(HelpFragment.b.c(str), InternalVkMiniApps.SUPPORT.h().a, HelpFragment.class, true, 4);
                Bundle bundle = aVar.j;
                bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, str2);
                bundle.putString("secret", str3);
                bundle.putBoolean("can_cache", true);
                if (str2 != null) {
                    aVar.s(true);
                }
                aVar.s(true);
                aVar.t();
                aVar.o();
                aVar.k(mo2getContext3);
            }
        }
        return true;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (super.a0()) {
            return true;
        }
        if (o25.a().b()) {
            o25.a().R("banned", (String) this.a0.getValue(), true);
        }
        pro0.f(new lbc0(null, 26));
        return false;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 542) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if ((intent != null ? (AuthResult) intent.getParcelableExtra("authResult") : null) != null) {
                Mf(i2, intent);
            }
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        return new o4y(this, wwv0Var);
    }
}
