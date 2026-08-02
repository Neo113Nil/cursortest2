package com.yandex.go.settings.domain;

import com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalanceExperiment;
import defpackage.aba0;
import defpackage.as21;
import defpackage.g92;
import defpackage.hiy0;
import defpackage.j5z;
import defpackage.lw90;
import defpackage.lx2;
import defpackage.n65;
import defpackage.n8z;
import defpackage.qqt0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xdr0;
import defpackage.xw91;
import defpackage.yaa0;
import defpackage.zaa0;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class b {
    public final tt2 a;
    public final xdr0 b;
    public final zuj0 c;
    public final j5z d;
    public final h e;
    public final as21 f;
    public final qqt0 g;
    public final aba0 h;
    public final yaa0 i;
    public final ru.yandex.taxi.utils.b j;
    public final n8z k;

    public b(tt2 tt2Var, xdr0 xdr0Var, zuj0 zuj0Var, j5z j5zVar, h hVar, as21 as21Var, qqt0 qqt0Var, aba0 aba0Var, yaa0 yaa0Var, ru.yandex.taxi.utils.b bVar, n8z n8zVar, hiy0 hiy0Var) {
        this.a = tt2Var;
        this.b = xdr0Var;
        this.c = zuj0Var;
        this.d = j5zVar;
        this.e = hVar;
        this.f = as21Var;
        this.g = qqt0Var;
        this.h = aba0Var;
        this.i = yaa0Var;
        this.j = bVar;
        this.k = n8zVar;
    }

    public final boolean a() {
        zaa0 zaa0Var = (zaa0) this.i;
        if (((PaymentMethodsHideBalanceExperiment) zaa0Var.c()).b) {
            lw90 lw90Var = zaa0Var.c;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
            lw90Var.getClass();
            if (lw90.c(lw90Var, null, new n65[0], 3).a(paymentMethod$Type).equals(xw91.C) && zaa0Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final tpr b(r0 r0Var, String str) {
        lx2 lx2Var = new lx2(str);
        n nVar = new n(e.n(new g92(2, lx2Var), this.b.a(), r0Var, new SettingsUiStateInteractor$uiStateFlow$1(4, this, b.class, "mapState", "mapState(Lcom/yandex/go/settings/presentation/models/AppSettingsUiState$Metadata;Lcom/yandex/go/settings/mvp/SettingsUiState;Lcom/yandex/go/settings/presentation/models/AppSettingsTransitionMode;)Lcom/yandex/go/settings/presentation/models/AppSettingsUiState;", 4)), new SettingsUiStateInteractor$uiStateFlow$2(this, lx2Var, null));
        this.a.getClass();
        return e.F(nVar, uyj.a);
    }
}
