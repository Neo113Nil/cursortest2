package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.sdc.presentation.AcceptEulaDialogV2;

/* loaded from: classes12.dex */
public final class nc implements zo31 {
    public final AcceptEulaDialogV2 a;
    public final ConstraintLayout b;
    public final ImageButton c;
    public final View d;
    public final LinearLayout e;

    public nc(AcceptEulaDialogV2 acceptEulaDialogV2, ListItemSwitchComponent listItemSwitchComponent, ListTextComponent listTextComponent, ListTitleComponent listTitleComponent, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ConstraintLayout constraintLayout, ImageButton imageButton, View view, LinearLayout linearLayout) {
        this.a = acceptEulaDialogV2;
        this.b = constraintLayout;
        this.c = imageButton;
        this.d = view;
        this.e = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
