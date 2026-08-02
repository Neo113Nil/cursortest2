package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.FloatButtonIconComponent;

/* loaded from: classes12.dex */
public final class d9y implements zo31 {
    public final GoFrameLayout a;
    public final FloatButtonIconComponent b;
    public final FloatButtonIconComponent c;

    public d9y(GoFrameLayout goFrameLayout, FloatButtonIconComponent floatButtonIconComponent, FloatButtonIconComponent floatButtonIconComponent2) {
        this.a = goFrameLayout;
        this.b = floatButtonIconComponent;
        this.c = floatButtonIconComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
