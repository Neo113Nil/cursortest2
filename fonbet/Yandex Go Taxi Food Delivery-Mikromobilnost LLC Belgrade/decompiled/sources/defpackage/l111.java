package defpackage;

import android.os.Bundle;
import android.view.View;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class l111 implements kds, bx60 {
    public final /* synthetic */ TransportCardsActivity a;

    public /* synthetic */ l111(TransportCardsActivity transportCardsActivity) {
        this.a = transportCardsActivity;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 keyboardInsets$lambda$0;
        keyboardInsets$lambda$0 = TransportCardsActivity.setKeyboardInsets$lambda$0(this.a, view, n751Var);
        return keyboardInsets$lambda$0;
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        TransportCardsActivity.initNfcDialog$lambda$0(this.a, str, bundle);
    }
}
