package com.ybsdk.feature.savings.internal.screens.account;

import defpackage.g8e;
import defpackage.pz40;
import defpackage.r7m0;
import defpackage.rt1;
import defpackage.s7m0;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountFragment$showThemeSelector$themeSelector$1$1 extends FunctionReferenceImpl implements tls {
    public SavingsAccountFragment$showThemeSelector$themeSelector$1$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onSelectedThemeChange", "onSelectedThemeChange(Lcom/ybsdk/feature/savings/internal/entities/SavingsAccountThemeEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        r0 r0Var;
        Object value;
        s7m0 s7m0Var = (s7m0) obj;
        a aVar = (a) this.receiver;
        rt1 rt1Var = aVar.E.f0;
        rt1Var.a.a("savings.account.theme_change.changed", g8e.w(1, "theme_id", s7m0Var.a));
        if (!s7m0Var.equals(((r7m0) aVar.X()).e)) {
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, r7m0.a((r7m0) value, null, null, null, null, s7m0Var, null, false, false, 495)));
        }
        return zy11.a;
    }
}
