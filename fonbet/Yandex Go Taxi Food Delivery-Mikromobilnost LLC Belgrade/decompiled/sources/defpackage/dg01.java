package defpackage;

import com.ybsdk.feature.transactions.impl.domain.interactors.b;
import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsParams;
import com.ybsdk.feature.transactions.impl.ui.screens.list.a;

/* loaded from: classes3.dex */
public final class dg01 implements bg01 {
    public final hwo0 a;

    public dg01(hwo0 hwo0Var) {
        this.a = hwo0Var;
    }

    public final a a(TransactionsParams transactionsParams) {
        hwo0 hwo0Var = this.a;
        return new a(transactionsParams, (b) ((qcz0) hwo0Var.b).get(), (tf01) ((fg01) hwo0Var.c).get(), (c1x0) ((fg01) hwo0Var.w).get(), (lg01) ((qcz0) hwo0Var.x).get());
    }
}
