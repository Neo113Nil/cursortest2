package xsna;

import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.aex0;

/* compiled from: JsVkclientDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class z7y implements aex0.d {
    public final /* synthetic */ x7y a;
    public final /* synthetic */ WebGroup b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public z7y(x7y x7yVar, WebGroup webGroup, String str, String str2) {
        this.a = x7yVar;
        this.b = webGroup;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.aex0.d
    public final void a() {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        x7y x7yVar = this.a;
        xwv0 xwv0Var = x7yVar.d;
        if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.j1 b = vdx0Var.j().b(this.b.b);
            m20 m20Var = new m20(new qm0(27), 25);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.b0 E = b.E(m20Var, lVar, kVar, kVar);
            String str = this.c;
            String str2 = this.d;
            D6.b(E.subscribe(new a8v(new gq0(x7yVar, str, str2, 6), 3), new tf1(new on7(x7yVar, str, str2, 4), 25)));
        }
        s13 s13Var = x7yVar.f;
        if (s13Var != null) {
            s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_JOIN_GROUP, MiniAppSettingsBoxAction.ALLOW);
        }
    }

    @Override // xsna.aex0.d
    public final void b() {
        x7y x7yVar = this.a;
        x7yVar.L0().d(this.d, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), this.c, 1, null));
        s13 s13Var = x7yVar.f;
        if (s13Var != null) {
            s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_JOIN_GROUP, MiniAppSettingsBoxAction.DENY);
        }
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
        x7y x7yVar = this.a;
        x7yVar.L0().d(this.d, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), this.c, 1, null));
        s13 s13Var = x7yVar.f;
        if (s13Var != null) {
            s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_JOIN_GROUP, MiniAppSettingsBoxAction.DENY);
        }
    }
}
