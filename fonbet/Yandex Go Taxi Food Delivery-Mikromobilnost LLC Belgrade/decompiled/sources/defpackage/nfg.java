package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes6.dex */
public final class nfg implements zo31 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final ToolbarComponent c;

    public nfg(LinearLayout linearLayout, LinearLayout linearLayout2, ToolbarComponent toolbarComponent) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
