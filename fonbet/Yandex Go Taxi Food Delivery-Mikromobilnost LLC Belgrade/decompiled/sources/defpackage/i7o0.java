package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final class i7o0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoConstraintLayout b;
    public final RecyclerView c;
    public final ula d;
    public final ButtonComponent e;

    public i7o0(GoConstraintLayout goConstraintLayout, GoConstraintLayout goConstraintLayout2, RecyclerView recyclerView, ula ulaVar, ButtonComponent buttonComponent) {
        this.a = goConstraintLayout;
        this.b = goConstraintLayout2;
        this.c = recyclerView;
        this.d = ulaVar;
        this.e = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
