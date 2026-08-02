package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.search.restore.VkRestoreSearchActivity;
import com.vk.superapp.api.dto.clips.WebClipBox;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.browser.ui.a;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vk.superapp.provider.SakFileProvider;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.ern0;

/* compiled from: BaseBrowserSuperrappUiRouter.kt */
/* loaded from: classes6.dex */
public abstract class n76 extends iok0<Fragment> {
    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void A(long j) {
        Context mo2getContext;
        Fragment w0 = w0();
        if (w0 == null || (mo2getContext = w0.mo2getContext()) == null) {
            return;
        }
        Uri build = er.a(HttpRequest.DEFAULT_SCHEME).authority(dgn0.h()).appendPath("reports").appendEncodedPath("").appendQueryParameter("lang", ply.a()).appendQueryParameter("type", MBridgeConstans.DYNAMIC_VIEW_WX_APP).appendQueryParameter("app_id", String.valueOf(j)).build();
        int i = VkBrowserActivity.l;
        VkBrowserActivity.a.c(mo2getContext, build.toString(), false);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final Fragment F(WebApiApplication webApiApplication, String str, String str2, String str3) {
        return a.C1874a.a(webApiApplication, str, str2, str3, 16);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void H(List list) {
        String string;
        Fragment w0 = w0();
        if (w0 != null) {
            try {
                int i = VkCommunityPickerActivity.g;
                w0.startActivityForResult(new Intent(w0.requireContext(), (Class<?>) VkCommunityPickerActivity.class).putParcelableArrayListExtra("groups", p4g.q(list)), Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
                s3q0 s3q0Var = s3q0.a;
            } catch (Exception unused) {
                Context mo2getContext = w0.mo2getContext();
                if (mo2getContext == null || (string = mo2getContext.getString(R.string.vk_apps_error_has_occured)) == null) {
                    return;
                }
                j(string);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final io.reactivex.rxjava3.disposables.c I(JSONObject jSONObject, zhx0 zhx0Var, ufg0 ufg0Var) {
        return null;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void N(int i) {
        String string;
        Fragment w0 = w0();
        if (w0 != null) {
            try {
                Intent intent = new Intent("com.vk.camera.SCAN_QR");
                Context mo2getContext = w0.mo2getContext();
                intent.setPackage(mo2getContext != null ? mo2getContext.getPackageName() : null);
                w0.startActivityForResult(intent, i);
                s3q0 s3q0Var = s3q0.a;
            } catch (Exception unused) {
                Context mo2getContext2 = w0.mo2getContext();
                if (mo2getContext2 == null || (string = mo2getContext2.getString(R.string.vk_apps_error_has_occured)) == null) {
                    return;
                }
                j(string);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final VkWebFileChooserImpl P(Fragment fragment) {
        SakFileProvider.a aVar = SakFileProvider.b;
        Context mo2getContext = fragment.mo2getContext();
        aVar.getClass();
        return new VkWebFileChooserImpl(fragment, SakFileProvider.a.a(mo2getContext));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void Q(Context context) {
        try {
            ((AppsCatalogComponent) ((k7m) m7m.f(this.c)).mo408a(fpf0.a(AppsCatalogComponent.class))).r5(context);
        } catch (Exception unused) {
            rex0 rex0Var = e370.j;
            if (rex0Var == null) {
                rex0Var = null;
            }
            rex0Var.b(context, jeq0.g("https://" + a0a.d + "/services"));
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final SuperappUiRouterBridge.c S(Activity activity, Rect rect, wzb0 wzb0Var) {
        return new m76();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean T(long j, String str, String str2, boolean z, boolean z2) {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void W(WebApiApplication webApiApplication, String str) {
        iok0.y0(this, new g22(1, webApiApplication, str));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void a0(Context context) {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(context, jeq0.g("https://" + a0a.d + "/games"));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean b(long j) {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final Long e() {
        return null;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void f(long j, String str) {
        q19.a.a();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void g(WebApiApplication webApiApplication, String str, q7j0 q7j0Var, String str2) {
        Context mo2getContext;
        Fragment w0 = w0();
        if (w0 == null || (mo2getContext = w0.mo2getContext()) == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        Intent createChooser = Intent.createChooser(intent, mo2getContext.getString(R.string.vk_apps_share));
        if (mo2getContext.getPackageManager().resolveActivity(createChooser, 0) != null) {
            mo2getContext.startActivity(createChooser);
            ysg0.b.a(new ern0.b());
        } else {
            j(mo2getContext.getString(R.string.vk_apps_error_has_occured));
            ysg0.b.a(new ern0.a());
        }
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final ViewGroup h(long j, LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var) {
        return null;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void i0(Context context, UserId userId) {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(context, jeq0.g("https://" + a0a.d + "/id" + userId.b));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean l(String str) {
        Fragment w0 = w0();
        if (w0 == null) {
            return false;
        }
        int i = VkDelegatingActivity.f;
        Bundle bundle = new Bundle(1);
        bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, str);
        VkDelegatingActivity.a.a(w0, VkRestoreSearchActivity.class, lgv0.class, bundle, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        return true;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final SuperappUiRouterBridge.c m(Activity activity, Rect rect, vf1 vf1Var) {
        return new k76();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final io.reactivex.rxjava3.disposables.c m0(WebClipBox webClipBox, Long l, String str) {
        return null;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void n(boolean z) {
        iok0.y0(this, new i76(z, 0));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean n0(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        iok0.y0(this, new j76(arrayList, i, 0));
        return true;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean p() {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final SuperappUiRouterBridge.c p0(Activity activity, Rect rect, tsk0 tsk0Var) {
        return new l76();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean q(String str) {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean s(int i, long j, boolean z, gzs<s3q0> gzsVar) {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final List<UserId> s0(Intent intent) {
        Iterable iterable;
        long[] longArrayExtra = intent.getLongArrayExtra("result_ids");
        if (longArrayExtra == null || (iterable = rl3.t0(longArrayExtra)) == null) {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            gzs<s3q0> gzsVar = fkq0.a;
            dq.h(longValue, arrayList);
        }
        return arrayList;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean t(ihx0 ihx0Var) {
        return false;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final boolean v(ihx0 ihx0Var, String str) {
        return false;
    }

    @Override // xsna.iok0, com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void w(String str, String str2, String str3) {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (wdx0Var.h().a()) {
            iok0.y0(this, new gd5(this, str, str2, str3, 1));
        }
    }

    public abstract void z0();

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void L(Activity activity) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void U(String str) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void d(Context context) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void q0(co0 co0Var) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void t0(Context context) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void y(g5i g5iVar) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void z(String str) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void K(mk mkVar, maj majVar) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void d0(String str, r8r0 r8r0Var) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void Y(String str, String str2, String str3) {
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge
    public final void a(WebApiApplication webApiApplication, int i, int i2, im80 im80Var, e1s0 e1s0Var, pnr0 pnr0Var, Context context) {
    }
}
