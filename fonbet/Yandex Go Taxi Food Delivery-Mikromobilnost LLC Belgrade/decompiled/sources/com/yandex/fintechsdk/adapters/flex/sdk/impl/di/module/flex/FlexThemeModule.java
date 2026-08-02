package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.exy0;
import defpackage.pvy0;
import defpackage.vh5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/FlexThemeModule;", "", "<init>", "()V", "Lpvy0;", "themeController", "Lexy0;", "provideThemedColorResolver", "(Lpvy0;)Lexy0;", "Lvh5;", "themeProvider", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitThemeChangeListener;", "themeChangeListener", "provideThemeController", "(Lvh5;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/DivkitThemeChangeListener;)Lpvy0;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexThemeModule {
    public final pvy0 provideThemeController(vh5 themeProvider, DivkitThemeChangeListener themeChangeListener) {
        pvy0 pvy0Var = new pvy0();
        pvy0Var.b.add(themeChangeListener);
        pvy0Var.a(themeProvider.getTheme().getKey());
        return pvy0Var;
    }

    public final exy0 provideThemedColorResolver(pvy0 themeController) {
        return new exy0(themeController, 0);
    }
}
