package defpackage;

import com.yandex.payment.sdk.ui.bind.AdditionalVerifyCardActivity;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class fo0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdditionalVerifyCardActivity b;

    public /* synthetic */ fo0(AdditionalVerifyCardActivity additionalVerifyCardActivity, int i) {
        this.a = i;
        this.b = additionalVerifyCardActivity;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCreate$lambda$1;
        wnf wnfVar;
        int i = this.a;
        AdditionalVerifyCardActivity additionalVerifyCardActivity = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$1 = AdditionalVerifyCardActivity.onCreate$lambda$1(additionalVerifyCardActivity, (mx60) obj);
                return onCreate$lambda$1;
            default:
                String str = (String) obj;
                additionalVerifyCardActivity.reportEvent(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Предоставление CVV успешно завершилось", "additional_verify_cvn_entered"));
                wnfVar = additionalVerifyCardActivity.cvvReceiver;
                if (wnfVar != null) {
                    wnfVar.proceed(str);
                }
                return zy11.a;
        }
    }
}
