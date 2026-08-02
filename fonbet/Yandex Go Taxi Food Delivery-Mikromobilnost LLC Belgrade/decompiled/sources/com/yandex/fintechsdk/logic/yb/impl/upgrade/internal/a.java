package com.yandex.fintechsdk.logic.yb.impl.upgrade.internal;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.yb.sdk.api.upgradesplit.UpgradeSplitResult$Status;
import defpackage.bvf0;
import defpackage.fp51;
import defpackage.ib21;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a {
    public final fp51 a;

    public a(fp51 fp51Var) {
        this.a = fp51Var;
    }

    public final Object a(ViewGroup viewGroup, String str, FragmentActivity fragmentActivity, Continuation continuation) {
        fp51 fp51Var = this.a;
        return fp51Var == null ? new ib21(UpgradeSplitResult$Status.FAILURE, "yb_adapter_unavailable") : bvf0.n(new CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2(fp51Var, str, viewGroup, fragmentActivity, this, null), continuation);
    }
}
