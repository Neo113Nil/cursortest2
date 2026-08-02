package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes14.dex */
public final class jyu implements zo31 {
    public final GoFrameLayout a;
    public final ButtonComponent b;

    public jyu(GoFrameLayout goFrameLayout, ButtonComponent buttonComponent) {
        this.a = goFrameLayout;
        this.b = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
