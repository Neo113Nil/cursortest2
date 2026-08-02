package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;

/* loaded from: classes12.dex */
public final class i2y implements zo31 {
    public final DivKitThemedFrameLayout a;
    public final GoFrameLayout b;
    public final GoView c;

    public i2y(DivKitThemedFrameLayout divKitThemedFrameLayout, GoFrameLayout goFrameLayout, GoView goView) {
        this.a = divKitThemedFrameLayout;
        this.b = goFrameLayout;
        this.c = goView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
