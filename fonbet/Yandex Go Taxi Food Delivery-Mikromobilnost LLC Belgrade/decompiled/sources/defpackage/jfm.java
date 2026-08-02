package defpackage;

import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.mobile.drive.bank.DriveSdkBankPluginFlutterErrorCode;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes15.dex */
public final class jfm implements tsr, ca20 {
    public hdm a;
    public ea20 b;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "drive_yb_channel");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        this.b = null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        cv51 cv51Var;
        String str = x920Var.a;
        if (this.a == null) {
            ((ba20) da20Var).error(DriveSdkBankPluginFlutterErrorCode.MissingDelegate.getRaw(), "DriveSdkBankPlugin has no delegate and can't pass Flutter's requests to the client app", null);
            return;
        }
        if (!jl40.l(str, "open_split_contract_draft")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        Map map = (Map) x920Var.b;
        if (map == null) {
            ((ba20) da20Var).error(DriveSdkBankPluginFlutterErrorCode.MissingArguments.getRaw(), b64.j(str, " requires arguments"), null);
            return;
        }
        Object obj = map.get("itemTitle");
        String str2 = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("itemCount");
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
        Object obj3 = map.get("planConstructor");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("merchantId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("totalAmount");
        Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
        Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
        if (str2 == null || valueOf == null || str3 == null || str4 == null || valueOf2 == null) {
            ((ba20) da20Var).error(DriveSdkBankPluginFlutterErrorCode.MissingArguments.getRaw(), b64.j(str, " requires itemTitle, itemCount, planConstructor, merchantId, totalAmount"), null);
            return;
        }
        hdm hdmVar = this.a;
        if (hdmVar != null) {
            bw51 bw51Var = new bw51(YbScreenSource.DRIVE, new lst0(Collections.singletonList(new mst0(str2, BigDecimal.valueOf(valueOf.doubleValue()))), BigDecimal.valueOf(valueOf2.doubleValue())), str3, str4);
            DriveHostView driveHostView = (DriveHostView) ((zch) hdmVar).a;
            cv51Var = driveHostView.ybScreenNavigator;
            ((dv51) cv51Var).b(new fv51(bw51Var, true), new bxl(6, driveHostView));
        }
        ((ba20) da20Var).success(null);
    }
}
