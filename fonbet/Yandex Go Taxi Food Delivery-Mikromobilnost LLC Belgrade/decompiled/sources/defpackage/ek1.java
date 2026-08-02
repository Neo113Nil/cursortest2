package defpackage;

import android.view.View;
import com.yandex.go.agreement.simple.ui.AgreementModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ek1 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AgreementModalView b;

    public /* synthetic */ ek1(AgreementModalView agreementModalView, int i) {
        this.a = i;
        this.b = agreementModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 _init_$lambda$0;
        View insetsType$lambda$0;
        int i = this.a;
        AgreementModalView agreementModalView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$0 = AgreementModalView._init_$lambda$0(agreementModalView);
                return _init_$lambda$0;
            default:
                insetsType$lambda$0 = AgreementModalView.insetsType$lambda$0(agreementModalView);
                return insetsType$lambda$0;
        }
    }
}
