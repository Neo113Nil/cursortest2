package defpackage;

import android.text.Editable;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.settings.profile.rating.PassengerNameEditorModalView;

/* loaded from: classes6.dex */
public final class al90 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ PassengerNameEditorModalView b;

    public /* synthetic */ al90(PassengerNameEditorModalView passengerNameEditorModalView, int i) {
        this.a = i;
        this.b = passengerNameEditorModalView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        dl90 dl90Var;
        ListItemInputComponent listItemInputComponent;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        PassengerNameEditorModalView passengerNameEditorModalView = this.b;
        switch (i) {
            case 0:
                dl90Var = passengerNameEditorModalView.presenter;
                dl90Var.Lg((Editable) obj);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                listItemInputComponent = passengerNameEditorModalView.nameInput;
                listItemInputComponent.setShowUnderLine(booleanValue);
                break;
        }
        return zy11Var;
    }
}
