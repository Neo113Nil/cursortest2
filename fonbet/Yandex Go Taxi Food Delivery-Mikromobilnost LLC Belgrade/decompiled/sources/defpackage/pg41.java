package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;

/* loaded from: classes13.dex */
public final class pg41 implements zo31 {
    public final GoFrameLayout a;
    public final ho4 b;
    public final GoImageView c;

    public pg41(ho4 ho4Var, GoFrameLayout goFrameLayout, GoImageView goImageView) {
        this.a = goFrameLayout;
        this.b = ho4Var;
        this.c = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
