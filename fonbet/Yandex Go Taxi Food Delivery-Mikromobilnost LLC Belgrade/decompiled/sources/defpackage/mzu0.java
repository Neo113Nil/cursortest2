package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;

/* loaded from: classes2.dex */
public final class mzu0 implements jir {
    public final /* synthetic */ int a = 1;
    public final ConstraintLayout b;
    public final TextView c;

    public mzu0(TransportCardsActivity transportCardsActivity) {
        ypa0 ypa0Var;
        ConstraintLayout constraintLayout;
        ypa0 ypa0Var2;
        ypa0Var = transportCardsActivity.errorBinding;
        if (ypa0Var == null || (constraintLayout = ypa0Var.c) == null) {
            ny61.r("Error binding is null");
            throw null;
        }
        this.b = constraintLayout;
        ypa0Var2 = transportCardsActivity.errorBinding;
        if (ypa0Var2 != null) {
            this.c = ypa0Var2.b;
        } else {
            ny61.r("Error binding is null");
            throw null;
        }
    }

    @Override // defpackage.jir
    public final TextView a() {
        int i = this.a;
        return this.c;
    }

    @Override // defpackage.jir
    public final ConstraintLayout getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public mzu0(ypa0 ypa0Var) {
        this.b = ypa0Var.c;
        this.c = ypa0Var.b;
    }
}
