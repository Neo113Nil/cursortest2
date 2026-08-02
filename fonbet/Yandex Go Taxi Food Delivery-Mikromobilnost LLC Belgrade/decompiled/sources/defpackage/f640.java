package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class f640 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final GoView c;

    public f640(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, GoView goView) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = goView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
