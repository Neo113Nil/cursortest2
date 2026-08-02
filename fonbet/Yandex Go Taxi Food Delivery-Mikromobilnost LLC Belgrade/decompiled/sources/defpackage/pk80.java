package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;

/* loaded from: classes13.dex */
public final class pk80 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final ho4 c;

    public pk80(ho4 ho4Var, GoFrameLayout goFrameLayout, GoImageView goImageView) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = ho4Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
