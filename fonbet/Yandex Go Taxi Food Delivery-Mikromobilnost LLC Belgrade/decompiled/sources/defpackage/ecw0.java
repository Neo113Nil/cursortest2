package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupShadowView;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes.dex */
public final class ecw0 implements zo31 {
    public final SuperAppMainScreenPopupView a;
    public final LinearLayoutCompat b;
    public final SuperAppMainScreenPopupShadowView c;

    public ecw0(SuperAppMainScreenPopupView superAppMainScreenPopupView, LinearLayoutCompat linearLayoutCompat, ListItemComponent listItemComponent, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ButtonComponent buttonComponent3, SuperAppMainScreenPopupShadowView superAppMainScreenPopupShadowView) {
        this.a = superAppMainScreenPopupView;
        this.b = linearLayoutCompat;
        this.c = superAppMainScreenPopupShadowView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
