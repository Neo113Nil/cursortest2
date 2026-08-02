package com.vk.webapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.a0a;
import xsna.brm0;
import xsna.c7;
import xsna.e370;
import xsna.e43;
import xsna.e89;
import xsna.epx;
import xsna.f3k;
import xsna.g3j0;
import xsna.g9q0;
import xsna.gzs;
import xsna.h3j0;
import xsna.h3k;
import xsna.hc8;
import xsna.i0q0;
import xsna.i1v0;
import xsna.ieq0;
import xsna.j5g;
import xsna.k50;
import xsna.l9h;
import xsna.m4v;
import xsna.mfu0;
import xsna.n9h;
import xsna.o1e0;
import xsna.oz50;
import xsna.qnx;
import xsna.qv20;
import xsna.r3y;
import xsna.s3q0;
import xsna.sf;
import xsna.svv0;
import xsna.wwv0;
import xsna.x4h;
import xsna.xq3;
import xsna.xwk;
import xsna.zr;

/* compiled from: CommunityManageFragment.kt */
/* loaded from: classes7.dex */
public final class CommunityManageFragment extends VKSuperAppBrowserFragment implements h3j0 {
    public static final /* synthetic */ int i0 = 0;
    public boolean a0;
    public g3j0 b0;
    public boolean c0;
    public String e0;
    public boolean f0;
    public com.vk.core.view.components.spinner.c h0;
    public UserId d0 = UserId.d;
    public final n9h g0 = new n9h(this);

    /* compiled from: CommunityManageFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunityManageFragment.kt */
    public static final class b {
        public static a a(UserId userId, String str, String str2, String str3, String str4, boolean z, int i) {
            int i2 = CommunityManageFragment.i0;
            if ((i & 1) != 0) {
                userId = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                str4 = null;
            }
            if ((i & 64) != 0) {
                z = false;
            }
            a aVar = new a(CommunityManageFragment.class, null, null);
            Bundle bundle = aVar.j;
            if (userId != null) {
                bundle.putParcelable("gid", userId);
            }
            bundle.putString("custom_fragment", str2);
            bundle.putString("custom_host", null);
            bundle.putString("custom_path", str);
            bundle.putString("screen", str3);
            bundle.putString("source", str4);
            bundle.putBoolean("cancel_on_back", z);
            return aVar;
        }
    }

    /* compiled from: CommunityManageFragment.kt */
    public static final class c implements hc8 {
        public final CommunityManageFragment b;

        public c(CommunityManageFragment communityManageFragment) {
            this.b = communityManageFragment;
        }

        @Override // xsna.hc8
        public final FragmentImpl g() {
            return this.b;
        }
    }

    /* compiled from: CommunityManageFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            CommunityManageFragment communityManageFragment = (CommunityManageFragment) this.receiver;
            int i = CommunityManageFragment.i0;
            communityManageFragment.po();
            return s3q0.a;
        }
    }

    @Override // xsna.h3j0
    public final boolean If() {
        return this.c0;
    }

    @Override // xsna.h3j0
    public final boolean K7() {
        return this.a0;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final boolean Ma(String str) {
        String path = Uri.parse(str).getPath();
        if (path != null && new Regex("/community_manage.*").f(path)) {
            return false;
        }
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return true;
        }
        xwk.d().e().a(mo2getContext, str);
        return true;
    }

    @Override // xsna.h3j0
    public final void N9(g3j0 g3j0Var) {
        this.b0 = g3j0Var;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        po();
        if (!this.f0) {
            return super.a0();
        }
        setResult(0);
        return false;
    }

    @Override // xsna.h3j0
    public final g3j0 f5() {
        return this.b0;
    }

    @Override // xsna.h3j0
    public final void ld(boolean z) {
        this.c0 = z;
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        String uri;
        String string = bundle.getString("custom_fragment");
        String string2 = bundle.getString("custom_host");
        String string3 = bundle.getString("custom_path");
        String string4 = bundle.getString("source");
        String string5 = bundle.getString("screen");
        if (string3 != null) {
            if (string2 == null) {
                Context context = e43.a;
                string2 = Preference.g(context != null ? context : null).getString("vkUiHostUri", "static.".concat(a0a.d));
            }
            uri = zr.a("https://", string2, string3);
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(HttpRequest.DEFAULT_SCHEME);
            if (string2 != null) {
                builder.authority(string2);
            } else {
                Context context2 = e43.a;
                builder.authority(Preference.g(context2 != null ? context2 : null).getString("vkUiHostUri", "static.".concat(a0a.d)));
            }
            if (string != null) {
                builder.appendPath("community_manage");
                builder.appendEncodedPath("#");
                builder.appendPath(string);
                if (!brm0.v(string, DomExceptionUtils.SEPARATOR, false)) {
                    ieq0.a(builder);
                }
            } else {
                builder.appendPath("community_manage");
                ieq0.a(builder);
            }
            builder.appendQueryParameter("group_id", String.valueOf(this.d0.b));
            builder.appendQueryParameter("is_recommended_tips_enabled", "1");
            if (string4 != null) {
                builder.appendQueryParameter("source", string4);
            }
            if (string5 != null) {
                builder.appendQueryParameter("screen", string5);
            }
            uri = builder.build().toString();
        }
        return new svv0.b(uri, InternalVkMiniApps.COMMUNITY_MANAGE.h().a, false, null, false, false, 252);
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1 || intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) {
            return;
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
        if (parcelableArrayList != null && booleanArray != null) {
            try {
                n9h n9hVar = this.g0;
                Uri uri = (Uri) j5g.Y(parcelableArrayList);
                if (booleanArray.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                boolean z = booleanArray[0];
                int i3 = n9hVar.d;
                if (i3 > 0) {
                    com.vk.upload.impl.a.b(i3, null);
                    n9hVar.d = -1;
                }
                n9hVar.d = com.vk.upload.impl.a.i(z ? new CoverVideoUploadTask(uri, n9hVar.b) : new f3k(uri, n9hVar.b));
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
        com.vk.core.view.components.spinner.c cVar = this.h0;
        if (cVar != null) {
            cVar.h.setSpinnerState(VkSpinnerContent.SpinnerState.Loading);
        }
        com.vk.core.view.components.spinner.c cVar2 = this.h0;
        if (cVar2 != null) {
            cVar2.show();
        }
        ro(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        UserId userId;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("gid")) == null) {
            userId = UserId.d;
        }
        this.d0 = userId;
        Bundle arguments2 = getArguments();
        this.f0 = arguments2 != null ? arguments2.getBoolean("cancel_on_back") : this.f0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserId userId = this.d0;
        n9h n9hVar = this.g0;
        n9hVar.b = userId;
        n9hVar.c.b(h3k.a.a.subscribe(new sf(new e89(n9hVar, 2), 19)));
        com.vk.core.view.components.spinner.c e = qv20.e(requireContext(), null);
        e.h.setOnCancelListener(new com.vk.core.view.components.spinner.b(new l9h(this, 0), e));
        this.h0 = e;
        getParentFragmentManager().l0("invite_friends_result", this, new c7(this, 21));
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.g0.c.dispose();
        this.h0 = null;
        getParentFragmentManager().f("invite_friends_result");
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        r3y.a("setSubscriptionActualizationBlockState", new com.vk.voip.ui.menu.feature.a(this, 29));
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        r3y.c("setSubscriptionActualizationBlockState");
    }

    @Override // xsna.h3j0
    public final void p7() {
        this.a0 = true;
    }

    public final void po() {
        String str = this.e0;
        if (epx.f(str, "update")) {
            o1e0.a.a(new g9q0(5));
        } else if (epx.f(str, "hide")) {
            o1e0.a.a(new m4v(6));
        }
    }

    public final void qo(VkSpinnerContent.SpinnerState spinnerState) {
        i0q0.j(new k50(1, this, spinnerState));
        i0q0.i(1300L, new xq3(this, 3));
    }

    public final void ro(float f) {
        mfu0 jo = jo();
        if (jo != null) {
            JsApiMethodType jsApiMethodType = JsApiMethodType.OPEN_LIVE_COVER_CAMERA;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, Float.valueOf(f));
            jSONObject.put("status", "uploading");
            s3q0 s3q0Var = s3q0.a;
            jo.n(jsApiMethodType, jSONObject);
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        c cVar = new c(this);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        return new x4h(this, wwv0Var, new qnx(cVar, superappUiRouterBridge), new d(0, this, CommunityManageFragment.class, "handleSubscriptionState", "handleSubscriptionState()V", 0));
    }
}
