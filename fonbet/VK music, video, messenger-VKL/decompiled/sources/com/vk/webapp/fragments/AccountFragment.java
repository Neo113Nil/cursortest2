package com.vk.webapp.fragments;

import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.superapp.api.dto.auth.ReloginParams;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.epx;
import xsna.i1v0;
import xsna.j7y;
import xsna.jgr0;
import xsna.lbc0;
import xsna.lvv0;
import xsna.o25;
import xsna.on;
import xsna.pro0;
import xsna.v5;
import xsna.w5;
import xsna.wwv0;
import xsna.yav0;

/* compiled from: AccountFragment.kt */
/* loaded from: classes7.dex */
public final class AccountFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: AccountFragment.kt */
    public static final class b {
        public static a a(String str, String str2, String str3, VkAuthCredentials vkAuthCredentials, boolean z, boolean z2, ReloginParams reloginParams, UtilityTokens utilityTokens, int i) {
            int i2 = AccountFragment.a0;
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                vkAuthCredentials = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                z2 = false;
            }
            if ((i & 64) != 0) {
                reloginParams = null;
            }
            if ((i & 128) != 0) {
                utilityTokens = o25.a().v();
            }
            UtilityTokens utilityTokens2 = utilityTokens;
            ReloginParams reloginParams2 = reloginParams;
            boolean z3 = z2;
            boolean z4 = z;
            VkAuthCredentials vkAuthCredentials2 = vkAuthCredentials;
            return new a(str, str2, str3, vkAuthCredentials2, z4, z3, reloginParams2, utilityTokens2);
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        boolean a02 = super.a0();
        if (!a02) {
            Bundle arguments = getArguments();
            if (arguments != null ? arguments.getBoolean("useOnLogoutClose", false) : false) {
                pro0.f(new lbc0(null, 26));
            }
        }
        if (!a02 && po() != null) {
            o25.a().getClass();
        }
        return a02;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final void close() {
        if (po() != null) {
            qo();
        } else {
            eo();
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ivf
    public final void dh(lvv0 lvv0Var) {
        if (po() == null || !(lvv0Var instanceof lvv0.c) || epx.f(((lvv0.c) lvv0Var).b, "success")) {
            super.dh(lvv0Var);
        } else {
            qo();
        }
    }

    public final ReloginParams po() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ReloginParams) arguments.getParcelable("returnToProfileReloginParams");
        }
        return null;
    }

    public final void qo() {
        a a2 = b.a(null, null, null, null, false, false, null, null, 255);
        Bundle bundle = a2.j;
        bundle.putBoolean("need_relogin", true);
        bundle.putParcelable("auto_login_params", po());
        a2.k(mo2getContext());
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        return new j7y(wwv0Var, new v5(this, 1), new w5(this, 2), new on(this, 0));
    }

    /* compiled from: AccountFragment.kt */
    public static final class a extends jgr0 {
        public /* synthetic */ a(String str, String str2) {
            this(str, str2, null, null, false, false, null, o25.a().v());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, VkAuthCredentials vkAuthCredentials, boolean z, boolean z2, ReloginParams reloginParams, UtilityTokens utilityTokens) {
            super(yav0.b(VKSuperAppBrowserFragment.a.a(), str, str2), InternalMiniApps.ACCOUNT.h().a, AccountFragment.class, false, 20);
            int i = VKSuperAppBrowserFragment.Y;
            this.j.putString(CommonConstant.KEY_ACCESS_TOKEN, str3);
            this.j.putParcelable("authCredentials", vkAuthCredentials);
            this.j.putBoolean("forceCloseOnAuth", z);
            this.j.putBoolean("useOnLogoutClose", z2);
            this.j.putParcelable("returnToProfileReloginParams", reloginParams);
            this.j.putParcelable("utilityTokens", utilityTokens);
        }
    }
}
