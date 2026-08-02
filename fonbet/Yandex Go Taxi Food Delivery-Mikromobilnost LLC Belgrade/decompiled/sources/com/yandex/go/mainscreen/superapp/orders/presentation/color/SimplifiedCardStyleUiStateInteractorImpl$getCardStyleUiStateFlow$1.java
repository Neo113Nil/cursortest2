package com.yandex.go.mainscreen.superapp.orders.presentation.color;

import android.view.ContextThemeWrapper;
import defpackage.avj0;
import defpackage.egc;
import defpackage.mqg0;
import defpackage.qfs0;
import defpackage.qje;
import defpackage.ufc;
import defpackage.w511;
import defpackage.wls;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SimplifiedCardStyleUiStateInteractorImpl$getCardStyleUiStateFlow$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int a;
        avj0 avj0Var = (avj0) ((c) this.receiver).b;
        int t = qje.t(xng0.controlMinor, avj0Var.a);
        int i = xng0.textMain;
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        ufc ufcVar = new ufc(t, qje.t(i, contextThemeWrapper), qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.textMain), qje.u(contextThemeWrapper.getTheme(), xng0.bgMain), qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.textOnControlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor));
        int u = qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert);
        int u2 = qje.u(contextThemeWrapper.getTheme(), xng0.textInvert);
        int u3 = qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert);
        int u4 = qje.u(contextThemeWrapper.getTheme(), xng0.textInvert);
        int u5 = qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert);
        int u6 = qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert);
        int i2 = qfs0.a[((ThemeType) obj).ordinal()];
        if (i2 == 1) {
            a = avj0Var.a(mqg0.component_control_minor_dark);
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            a = avj0Var.a(mqg0.component_control_minor_light);
        }
        return new egc(ufcVar, new ufc(u, u2, u3, u4, u5, u6, a, qje.u(contextThemeWrapper.getTheme(), xng0.textInvert), qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert)));
    }
}
