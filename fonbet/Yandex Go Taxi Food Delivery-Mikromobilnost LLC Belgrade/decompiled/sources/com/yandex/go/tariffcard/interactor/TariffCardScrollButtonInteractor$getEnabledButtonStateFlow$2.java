package com.yandex.go.tariffcard.interactor;

import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;
import defpackage.idx0;
import defpackage.ldx0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ldx0 ldx0Var = (ldx0) obj;
        x xVar = (x) this.receiver;
        xVar.getClass();
        idx0 idx0Var = ldx0Var instanceof idx0 ? (idx0) ldx0Var : null;
        if ((idx0Var != null ? idx0Var.b : null) == VisibilityChangeOrigin.USER) {
            xVar.e.a();
        }
        return zy11.a;
    }
}
