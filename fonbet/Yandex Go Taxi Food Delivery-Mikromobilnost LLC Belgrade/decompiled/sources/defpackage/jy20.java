package defpackage;

import android.view.View;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes5.dex */
public final class jy20 implements zo31 {
    public final /* synthetic */ int a;
    public final ButtonsView b;

    public /* synthetic */ jy20(ButtonsView buttonsView, int i) {
        this.a = i;
        this.b = buttonsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
