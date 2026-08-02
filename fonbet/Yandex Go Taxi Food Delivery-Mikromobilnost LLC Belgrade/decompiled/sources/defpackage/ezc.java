package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class ezc implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;

    public ezc(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
