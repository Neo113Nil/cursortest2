package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.wheel.PickerView;

/* loaded from: classes6.dex */
public final class olq0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final PickerView c;
    public final ListTextComponent d;
    public final ListHeaderComponent e;

    public olq0(LinearLayout linearLayout, ButtonComponent buttonComponent, PickerView pickerView, ListTextComponent listTextComponent, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = pickerView;
        this.d = listTextComponent;
        this.e = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
