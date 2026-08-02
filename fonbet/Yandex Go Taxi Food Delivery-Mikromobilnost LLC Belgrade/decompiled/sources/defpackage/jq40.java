package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.tariffcard.ui.view.MulticlassCashbackView;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class jq40 implements zo31 {
    public final TariffTrailView a;
    public final RobotoTextView b;
    public final FrameLayout c;
    public final MulticlassCashbackView d;
    public final CheckBoxComponent e;
    public final RobotoTextView f;

    public jq40(TariffTrailView tariffTrailView, RobotoTextView robotoTextView, FrameLayout frameLayout, MulticlassCashbackView multiclassCashbackView, CheckBoxComponent checkBoxComponent, RobotoTextView robotoTextView2) {
        this.a = tariffTrailView;
        this.b = robotoTextView;
        this.c = frameLayout;
        this.d = multiclassCashbackView;
        this.e = checkBoxComponent;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
