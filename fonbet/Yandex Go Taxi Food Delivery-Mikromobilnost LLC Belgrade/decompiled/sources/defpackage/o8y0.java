package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final class o8y0 implements zo31 {
    public final GoFrameLayout a;
    public final RotatableFloatButton b;
    public final ho4 c;
    public final ho4 d;
    public final GoFrameLayout e;
    public final dna f;
    public final GoFrameLayout g;

    public o8y0(GoFrameLayout goFrameLayout, RotatableFloatButton rotatableFloatButton, ho4 ho4Var, ho4 ho4Var2, GoFrameLayout goFrameLayout2, dna dnaVar, GoFrameLayout goFrameLayout3) {
        this.a = goFrameLayout;
        this.b = rotatableFloatButton;
        this.c = ho4Var;
        this.d = ho4Var2;
        this.e = goFrameLayout2;
        this.f = dnaVar;
        this.g = goFrameLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
