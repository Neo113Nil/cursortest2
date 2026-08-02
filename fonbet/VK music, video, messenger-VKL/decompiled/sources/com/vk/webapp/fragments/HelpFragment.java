package com.vk.webapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import java.util.Set;
import kotlin.Result;
import xsna.drm0;
import xsna.e370;
import xsna.epx;
import xsna.fvv0;
import xsna.i1v0;
import xsna.ieq0;
import xsna.jgr0;
import xsna.nf6;
import xsna.o25;
import xsna.onx;
import xsna.qnx;
import xsna.r6y;
import xsna.w25;
import xsna.wwv0;

/* compiled from: HelpFragment.kt */
/* loaded from: classes7.dex */
public final class HelpFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: HelpFragment.kt */
    public static final class a extends jgr0 {
    }

    /* compiled from: HelpFragment.kt */
    public static final class b {
        public static a a(String str, String str2, String str3) {
            int i = HelpFragment.a0;
            a aVar = new a(c(str3), InternalVkMiniApps.SUPPORT.h().a, HelpFragment.class, false, 4);
            Bundle bundle = aVar.j;
            bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, str);
            bundle.putString("secret", str2);
            bundle.putBoolean("can_cache", true);
            if (str != null) {
                aVar.s(true);
            }
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.Result$Failure] */
        public static String c(String str) {
            Set<String> queryParameterNames;
            Uri failure;
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(HttpRequest.DEFAULT_SCHEME);
            int i = VKSuperAppBrowserFragment.Y;
            builder.authority(VKSuperAppBrowserFragment.a.a());
            builder.appendPath("support");
            ieq0.a(builder);
            if (str != null && !drm0.N(str)) {
                try {
                    failure = Uri.parse(str);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                r1 = failure instanceof Result.Failure ? null : failure;
            }
            if (r1 != null && (queryParameterNames = r1.getQueryParameterNames()) != null) {
                for (String str2 : queryParameterNames) {
                    if (!epx.f(str2, "lang")) {
                        builder.appendQueryParameter(str2, r1.getQueryParameter(str2));
                    }
                }
            }
            return builder.build().toString();
        }

        public static void d(Context context, String str, String str2, String str3) {
            a a = a(str, str2, str3);
            a.s(true);
            a.t();
            a.o();
            a.k(context);
        }
    }

    /* compiled from: HelpFragment.kt */
    public final class c extends onx {
        public fvv0 i0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(fvv0 fvv0Var, VKSuperAppBrowserFragment vKSuperAppBrowserFragment) {
            super(fvv0Var, new qnx(vKSuperAppBrowserFragment, r0 == null ? null : r0));
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            this.i0 = fvv0Var;
        }

        @Override // xsna.v1y
        public final w25 D() {
            HelpFragment helpFragment = HelpFragment.this;
            Bundle arguments = helpFragment.getArguments();
            String string = arguments != null ? arguments.getString(CommonConstant.KEY_ACCESS_TOKEN) : null;
            if (string == null || drm0.N(string)) {
                string = o25.a().h();
            }
            String str = string;
            UserId c = o25.a().c();
            Bundle arguments2 = helpFragment.getArguments();
            String string2 = arguments2 != null ? arguments2.getString("secret") : null;
            if (string2 == null || drm0.N(string2)) {
                o25.a().getClass();
                string2 = "";
            }
            return new w25(0, 0L, o25.a().v(), c, str, string2);
        }

        @Override // xsna.x6y
        public final fvv0 M() {
            return this.i0;
        }

        @Override // xsna.x6y
        public final void O(fvv0 fvv0Var) {
            this.i0 = fvv0Var;
        }
    }

    /* compiled from: HelpFragment.kt */
    public static final class d extends nf6 {
        public final /* synthetic */ wwv0 b;

        public d(wwv0 wwv0Var) {
            this.b = wwv0Var;
        }

        @Override // xsna.nf6
        public final r6y a() {
            HelpFragment helpFragment = HelpFragment.this;
            return helpFragment.new c(this.b, helpFragment);
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        return new d(wwv0Var);
    }
}
