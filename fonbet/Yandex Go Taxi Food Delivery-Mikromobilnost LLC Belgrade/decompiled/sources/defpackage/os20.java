package defpackage;

import com.yandex.xplat.common.YSError;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class os20 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs20 b;

    public /* synthetic */ os20(qs20 qs20Var, int i) {
        this.a = i;
        this.b = qs20Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qs20 qs20Var = this.b;
        switch (i) {
            case 0:
                ((y22) qs20Var.b).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отправка результата нативного челленджа успешна", "biometry_supply_device_challenge_result_success"));
                return zy11Var;
            case 1:
                YSError ySError = (YSError) obj;
                rwo rwoVar = qs20Var.b;
                sv90 sv90Var = qv90.a;
                String message = ySError.getMessage();
                sv90Var.getClass();
                ((y22) rwoVar).a(y891.c("biometry_supply_device_challenge_result_failed", vfc.i(0, CRLReasonCodeExtension.REASON, message, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отправка результата нативного челленджа завершилась с ошибкой: ".concat(message))));
                return zmx.c(ySError);
            case 2:
                ((y22) qs20Var.b).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Предоставление CVV успешно завершилось", "supply_cvv"));
                return zy11Var;
            default:
                YSError ySError2 = (YSError) obj;
                rwo rwoVar2 = qs20Var.b;
                sv90 sv90Var2 = qv90.a;
                String message2 = ySError2.getMessage();
                sv90Var2.getClass();
                ((y22) rwoVar2).a(y891.c("supply_cvv_failed", vfc.i(0, CRLReasonCodeExtension.REASON, message2, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Предоставление CVV завершилось с ошибкой: ".concat(message2))));
                return zmx.c(ySError2);
        }
    }
}
