package defpackage;

import android.view.View;
import com.yandex.go.transfer_requirement.ui.flight_input.FlightNumberInputComponent;
import com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class mi01 implements zo31 {
    public final TransferNumberInputView a;
    public final RobotoTextView b;
    public final FlightNumberInputComponent c;

    public mi01(TransferNumberInputView transferNumberInputView, RobotoTextView robotoTextView, FlightNumberInputComponent flightNumberInputComponent) {
        this.a = transferNumberInputView;
        this.b = robotoTextView;
        this.c = flightNumberInputComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
