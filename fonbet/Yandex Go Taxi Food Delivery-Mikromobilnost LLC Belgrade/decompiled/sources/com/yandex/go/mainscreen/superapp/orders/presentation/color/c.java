package com.yandex.go.mainscreen.superapp.orders.presentation.color;

import android.animation.ArgbEvaluator;
import com.yandex.go.flex.main_screen.interactors.t;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class c {
    public final t a;
    public final zuj0 b;
    public final pwy0 c;
    public final ArgbEvaluator d = new ArgbEvaluator();

    public c(t tVar, zuj0 zuj0Var, pwy0 pwy0Var) {
        this.a = tVar;
        this.b = zuj0Var;
        this.c = pwy0Var;
    }

    public final tpr a() {
        return e.t(e.X(e.I(this.c.a(), new SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$1(2, this, c.class, "generateThemeSpecificColorPalette", "generateThemeSpecificColorPalette(Lru/yandex/taxi/theme/ThemeType;)Lcom/yandex/go/mainscreen/superapp/orders/presentation/color/ColorSettings;", 4)), new SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$2(this, null)));
    }
}
