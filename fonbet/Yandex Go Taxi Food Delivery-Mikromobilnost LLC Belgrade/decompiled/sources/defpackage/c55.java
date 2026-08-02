package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class c55 implements v7p {
    public final /* synthetic */ int a;
    public final w3i b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public c55(w3i w3iVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, b55 b55Var) {
        this.a = 1;
        this.b = w3iVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        w3i w3iVar = this.b;
        switch (i) {
            case 0:
                pcy pcyVar = (pcy) xvf0Var4.get();
                ConsoleLoggingMode consoleLoggingMode = (ConsoleLoggingMode) xvf0Var3.get();
                rwo rwoVar = (rwo) xvf0Var2.get();
                vv50 vv50Var = (vv50) xvf0Var.get();
                AdditionalSettings additionalSettings = (AdditionalSettings) w3iVar.x;
                return dha1.g(pcyVar, additionalSettings.getPassportToken(), consoleLoggingMode, additionalSettings.getPartition(), rwoVar, vv50Var, (Context) w3iVar.b, (Payer) w3iVar.c, additionalSettings.getExchangeOauthToken(), ofu.b);
            case 1:
                pcy pcyVar2 = (pcy) xvf0Var4.get();
                ConsoleLoggingMode consoleLoggingMode2 = (ConsoleLoggingMode) xvf0Var3.get();
                rwo rwoVar2 = (rwo) xvf0Var2.get();
                vv50 vv50Var2 = (vv50) xvf0Var.get();
                iwy0 iwy0Var = new iwy0();
                Context context = (Context) w3iVar.b;
                Payer payer = (Payer) w3iVar.c;
                Merchant merchant = (Merchant) w3iVar.w;
                AdditionalSettings additionalSettings2 = (AdditionalSettings) w3iVar.x;
                return dha1.h(context, payer, merchant, additionalSettings2.getExchangeOauthToken(), additionalSettings2.getForceCVV(), additionalSettings2.getPassportToken(), pcyVar2, consoleLoggingMode2, additionalSettings2.getPartition(), rwoVar2, vv50Var2, additionalSettings2.getIntegrationProfileId(), ofu.b, additionalSettings2.getEnableDebranding(), iwy0Var);
            default:
                km0 km0Var = (km0) xvf0Var4.get();
                pcy pcyVar3 = (pcy) xvf0Var3.get();
                ve51 ve51Var = (ve51) xvf0Var2.get();
                tse tseVar = (tse) xvf0Var.get();
                Context context2 = (Context) w3iVar.b;
                try {
                    String concat = pcyVar3.a().concat("tracing/v1/traces");
                    Map i2 = b.i(new Pair("service.name", "payment-sdk"), new Pair("host.name", concat), new Pair("payment_src", context2.getApplicationInfo().packageName), new Pair("sdk_version", "7.6.6"));
                    sjh sjhVar = uyj.a;
                    bvf0.a(mdh.b);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(i2);
                    return new v870(new com.yandex.paymentsdk.opentelemetry.b(context2, linkedHashMap, concat, tseVar), km0Var);
                } catch (Throwable th) {
                    y22 y22Var = new y22(scc.i(ve51Var), km0Var);
                    sv90 sv90Var = qv90.a;
                    String message = m83.a(th).getMessage();
                    sv90Var.getClass();
                    y22Var.a(y891.c("open_telemetry_error", vfc.i(0, CRLReasonCodeExtension.REASON, message, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка при инициализации OpenTelemetry: ".concat(message))));
                    return new sih();
                }
        }
    }

    public /* synthetic */ c55(w3i w3iVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = w3iVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }
}
