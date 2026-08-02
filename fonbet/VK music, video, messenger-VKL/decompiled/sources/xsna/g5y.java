package xsna;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import xsna.aex0;
import xsna.d5y;
import xsna.p2y;

/* compiled from: JsLocationDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class g5y extends mg6 implements d5y {
    public xwv0 g;
    public final com.vk.superapp.base.js.bridge.b h;
    public final s13 i;
    public final n1i j;

    /* compiled from: JsLocationDelegateImpl.kt */
    public final class a implements aex0.d {
        public final GetGeodata$Parameters a;
        public final Context b;

        public a(GetGeodata$Parameters getGeodata$Parameters, Context context) {
            this.a = getGeodata$Parameters;
            this.b = context;
        }

        @Override // xsna.aex0.d
        public final void a() {
            VkUiView view;
            io.reactivex.rxjava3.disposables.b D6;
            ux90 T;
            g5y g5yVar = g5y.this;
            xwv0 xwv0Var = g5yVar.g;
            if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
                xwv0 xwv0Var2 = g5yVar.g;
                D6.b((xwv0Var2 == null || (T = xwv0Var2.T()) == null) ? null : T.b(VkUiPermissionsHandler.Permissions.GEO).subscribe(new fu0(new hl1(17, g5yVar, this), 27), new f5y(new qb6(16, g5yVar, this), 0)));
            }
            s13 s13Var = g5yVar.i;
            if (s13Var != null) {
                s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_GEO, MiniAppSettingsBoxAction.ALLOW);
            }
        }

        @Override // xsna.aex0.d
        public final void b() {
            g5y g5yVar = g5y.this;
            g5yVar.c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), this.a.c(), 1, null));
            s13 s13Var = g5yVar.i;
            if (s13Var != null) {
                s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_GEO, MiniAppSettingsBoxAction.DENY);
            }
        }

        @Override // xsna.aex0.d
        public final void onCancel() {
            g5y g5yVar = g5y.this;
            g5yVar.c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), this.a.c(), 1, null));
            s13 s13Var = g5yVar.i;
            if (s13Var != null) {
                s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_GEO, MiniAppSettingsBoxAction.DENY);
            }
        }
    }

    public g5y(xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar, s13 s13Var, n1i n1iVar) {
        super(bVar, xwv0Var);
        this.g = xwv0Var;
        this.h = bVar;
        this.i = s13Var;
        this.j = n1iVar;
    }

    @Override // xsna.d5y, xsna.b5y
    @JavascriptInterface
    public void VKWebAppGetGeodata(String str) {
        d5y.a.VKWebAppGetGeodata(this, str);
    }

    @Override // xsna.mg6
    public final xwv0 d() {
        return this.g;
    }

    @Override // xsna.b5y
    public final void f0(p2y<GetGeodata$Parameters> p2yVar) {
        this.h.k(new JsMethod("VKWebAppGetGeodata"), p2yVar.b());
        xwv0 xwv0Var = this.g;
        if (xwv0Var != null && xwv0Var.q()) {
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), p2yVar.b(), 1, null));
        } else {
            if (!(p2yVar.a instanceof p2y.a)) {
                qro0.c(new com.vk.movika.tools.controls.seekbar.g(9, this, p2yVar.a()));
                return;
            }
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), p2yVar.b(), 1, null));
        }
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.g = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.g = null;
    }
}
