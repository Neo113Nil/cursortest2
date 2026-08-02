package xsna;

import com.vk.superapp.api.dto.app.AutoBuyStatus;
import com.vk.superapp.core.errors.VkAppsErrors;
import kotlin.NoWhenBranchMatchedException;
import xsna.eav0;

/* compiled from: VkSubscriptionViewDelegate.kt */
/* loaded from: classes6.dex */
public final class oov0 implements eav0.b {
    public final /* synthetic */ mov0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ fhx0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public oov0(mov0 mov0Var, long j, fhx0 fhx0Var, String str, boolean z) {
        this.a = mov0Var;
        this.b = j;
        this.c = fhx0Var;
        this.d = str;
        this.e = z;
    }

    @Override // xsna.eav0.b
    public final void a(Boolean bool) {
        AutoBuyStatus autoBuyStatus;
        if (epx.f(bool, Boolean.TRUE)) {
            autoBuyStatus = AutoBuyStatus.CHECKED;
        } else if (epx.f(bool, Boolean.FALSE)) {
            autoBuyStatus = AutoBuyStatus.UNCHECKED;
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            autoBuyStatus = AutoBuyStatus.DISABLED;
        }
        AutoBuyStatus autoBuyStatus2 = autoBuyStatus;
        this.a.a(autoBuyStatus2, this.b, this.c, this.d, this.e);
    }

    @Override // xsna.eav0.b
    public final void onDismiss() {
        this.a.g(VkAppsErrors.Client.USER_DENIED);
    }
}
