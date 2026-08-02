package defpackage;

import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.widget.wheel.PickerView;

/* loaded from: classes6.dex */
public final class br40 implements oq40 {
    public final /* synthetic */ MultiexitModalView a;

    public br40(MultiexitModalView multiexitModalView) {
        this.a = multiexitModalView;
    }

    @Override // defpackage.oq40
    public final void b7(vd11 vd11Var) {
        PickerView pickerView;
        pickerView = this.a.picker;
        pickerView.setPicker(vd11Var);
        pickerView.updateMode(true);
    }

    @Override // defpackage.oq40
    public final void setTitle(CharSequence charSequence) {
        ListTitleComponent listTitleComponent;
        listTitleComponent = this.a.title;
        listTitleComponent.setTitle(charSequence);
    }
}
