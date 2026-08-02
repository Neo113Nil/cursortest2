package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsButtonClickButton;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatus;
import defpackage.czk0;
import defpackage.dzk0;
import defpackage.ezk0;
import defpackage.jl40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.xyk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class RoundingFragment$getViewBinding$1$5 extends FunctionReferenceImpl implements sls {
    public RoundingFragment$getViewBinding$1$5(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onPrimaryClick", "onPrimaryClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        dzk0 dzk0Var;
        xyk0 xyk0Var;
        dzk0 dzk0Var2;
        b bVar = (b) this.receiver;
        bVar.J.r(bVar.C, (RoundingState) bVar.X(), RoundingEvents$RoundingSettingsButtonClickButton.ACTIVATE_BUTTON);
        ezk0 ezk0Var = (ezk0) ((RoundingState) bVar.X()).e.a();
        boolean z = ((ezk0Var == null || (dzk0Var2 = ezk0Var.a) == null) ? null : dzk0Var2.a) == RoundingStatus.ENABLED;
        ezk0 ezk0Var2 = (ezk0) ((RoundingState) bVar.X()).e.a();
        if (jl40.l(((RoundingState) bVar.X()).f, ezk0Var2 != null ? ezk0Var2.i : null)) {
            xyk0 xyk0Var2 = ((RoundingState) bVar.X()).c;
            if (jl40.l(xyk0Var2 != null ? xyk0Var2.a : null, (ezk0Var2 == null || (dzk0Var = ezk0Var2.a) == null || (xyk0Var = dzk0Var.d) == null) ? null : xyk0Var.a) && z) {
                bVar.D.e();
                return zy11.a;
            }
        }
        czk0 e0 = b.e0(bVar, null, 3);
        if (e0 != null) {
            bVar.u0(e0);
        }
        return zy11.a;
    }
}
