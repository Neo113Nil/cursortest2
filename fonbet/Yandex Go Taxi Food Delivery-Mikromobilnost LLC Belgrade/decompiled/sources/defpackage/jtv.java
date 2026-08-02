package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final class jtv implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final RecyclerView c;

    public jtv(LinearLayout linearLayout, ButtonComponent buttonComponent, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
