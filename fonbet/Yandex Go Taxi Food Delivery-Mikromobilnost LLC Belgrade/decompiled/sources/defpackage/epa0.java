package defpackage;

import android.view.View;
import android.widget.Space;
import com.yandex.payment.divkit.bind.view.DKCardInputViewImpl;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;

/* loaded from: classes2.dex */
public final class epa0 implements zo31 {
    public final DKCardInputViewImpl a;
    public final DKCardNumberInput b;
    public final Space c;
    public final DKCvnInput d;
    public final DKExpirationDateInput e;
    public final Space f;

    public epa0(DKCardInputViewImpl dKCardInputViewImpl, DKCardNumberInput dKCardNumberInput, Space space, DKCvnInput dKCvnInput, DKExpirationDateInput dKExpirationDateInput, Space space2) {
        this.a = dKCardInputViewImpl;
        this.b = dKCardNumberInput;
        this.c = space;
        this.d = dKCvnInput;
        this.e = dKExpirationDateInput;
        this.f = space2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
