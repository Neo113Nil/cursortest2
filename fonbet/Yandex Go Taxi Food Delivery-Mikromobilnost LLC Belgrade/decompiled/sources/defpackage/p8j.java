package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class p8j implements zo31 {
    public final LinearLayout a;
    public final FrameLayout b;
    public final RecyclerView c;
    public final ButtonComponent d;

    public p8j(LinearLayout linearLayout, FrameLayout frameLayout, RecyclerView recyclerView, ButtonComponent buttonComponent) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = recyclerView;
        this.d = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
