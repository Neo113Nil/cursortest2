package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import androidx.activity.ComponentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.dating.js.bridge.api.events.AllowLocationPermission$Error;
import com.vk.superapp.dating.js.bridge.api.events.AllowLocationPermission$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.GetPushToken$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.InAppUpdate$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.InAppUpdate$Response;
import com.vkontakte.android.R;
import xsna.p2y;

/* compiled from: JsDatingDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class v3y implements t3y {
    public final krh b;
    public final rjd c;
    public final com.vk.superapp.base.js.bridge.b d;
    public final bpn0 e = new bpn0(new tzv(this, 3));
    public final bpn0 f = new bpn0(new p5h(this, 29));
    public final bpn0 g = new bpn0(new ubw(this, 1));

    public v3y(krh krhVar, rjd rjdVar, com.vk.superapp.base.js.bridge.b bVar) {
        this.b = krhVar;
        this.c = rjdVar;
        this.d = bVar;
    }

    @Override // xsna.s3y
    public final void S(p2y<InAppUpdate$Parameters> p2yVar) {
        boolean z;
        onl onlVar;
        JsMethod jsMethod = new JsMethod("VKWebAppInAppUpdate");
        String b = p2yVar.b();
        com.vk.superapp.base.js.bridge.b bVar = this.d;
        bVar.k(jsMethod, b);
        String b2 = p2yVar.b();
        if (p2yVar.a instanceof p2y.a) {
            com.vk.superapp.base.js.bridge.b.p(bVar, new JsMethod("VKWebAppInAppUpdate"), new InAppUpdate$Response(null, new InAppUpdate$Response.Data(false, b2), b2, 1, null), null, null, false, null, 60);
            return;
        }
        Context context = ((g7y) this.b.c).l;
        if (context != null) {
            while (true) {
                z = context instanceof ComponentActivity;
                if (z || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            ComponentActivity componentActivity = (ComponentActivity) (z ? (Activity) context : null);
            if (componentActivity == null || (onlVar = e370.u) == null) {
                return;
            }
            onlVar.a(componentActivity);
        }
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppAllowLocationPermission(String str) {
        super.VKWebAppAllowLocationPermission(str);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppGetPushToken(String str) {
        super.VKWebAppGetPushToken(str);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppImageShare(String str) {
        super.VKWebAppImageShare(str);
    }

    @Override // xsna.t3y, xsna.s3y
    @JavascriptInterface
    public void VKWebAppInAppUpdate(String str) {
        super.VKWebAppInAppUpdate(str);
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.d, new JsMethod("VKWebAppAllowLocationPermission"), new AllowLocationPermission$Error(null, new AllowLocationPermission$Error.Data(AllowLocationPermission$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    @Override // xsna.s3y
    public final void b1(p2y<ImageShare$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppImageShare", this.d, b);
        boolean z = p2yVar.a instanceof p2y.a;
        bpn0 bpn0Var = this.e;
        if (z) {
            ((uvp) bpn0Var.getValue()).b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        Context context = ((g7y) this.b.c).l;
        if (context == null) {
            ((uvp) bpn0Var.getValue()).b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
            return;
        }
        ImageShare$Parameters a = p2yVar.a();
        olw olwVar = (olw) this.g.getValue();
        String d = a.d();
        ImageShare$Parameters.App c = a.c();
        uvp uvpVar = olwVar.b;
        try {
            Uri N = com.vk.core.files.a.N(olw.a(context, d));
            String b2 = olw.b(c, context);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            if (b2 != null) {
                intent.setPackage(b2);
            }
            intent.putExtra("android.intent.extra.STREAM", N);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.vk_apps_share)));
            olwVar.a.a(b, b2 != null);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            String message = e.getMessage();
            if (message == null || !drm0.D(message, "base-64", false)) {
                uvpVar.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            } else {
                uvpVar.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, "Не смогли обработать переданное base64 изображение.", 1, null), null, null, 114686, null), b, 1, null));
            }
        } catch (Exception e2) {
            uvpVar.b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, String.valueOf(e2.getMessage()), 1, null), null, null, 114686, null), b, 1, null));
        }
    }

    @Override // xsna.s3y
    public final void s1(p2y<AllowLocationPermission$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppAllowLocationPermission", this.d, b);
        if (p2yVar.a instanceof p2y.a) {
            a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        Context context = ((g7y) this.b.c).l;
        if (context == null) {
            a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.l(permissionHelper, context, PermissionHelper.h, new defpackage.f0(16, this, b), new o9(28, this, b), 4);
    }

    @Override // xsna.s3y
    public final void t1(p2y<GetPushToken$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppGetPushToken", this.d, b);
        boolean z = p2yVar.a instanceof p2y.a;
        bpn0 bpn0Var = this.e;
        if (z) {
            ((uvp) bpn0Var.getValue()).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        this.c.invoke();
        ((uvp) bpn0Var.getValue()).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, "You've tried to get a push token via the VKWebAppGetPushToken bridge method, but token is empty", 1, null), null, null, 114686, null), b, 1, null));
        par0.a.getClass();
        par0.f("You've tried to get a push token via the VKWebAppGetPushToken bridge method, but token is empty");
    }
}
