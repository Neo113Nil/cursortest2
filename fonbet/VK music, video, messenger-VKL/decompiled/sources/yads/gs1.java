package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class gs1 {
    public final Context a;

    public gs1(Context context) {
        this.a = context;
    }

    public final String a(es1 es1Var) {
        int i = es1Var == null ? -1 : fs1.a[es1Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return this.a.getString(R$string.debug_panel_invalid_mediation_adapter_version);
        }
        throw new NoWhenBranchMatchedException();
    }
}
