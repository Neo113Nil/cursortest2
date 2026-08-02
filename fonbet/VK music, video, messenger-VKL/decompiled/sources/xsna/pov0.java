package xsna;

import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.eav0;

/* compiled from: VkSubscriptionViewDelegate.kt */
/* loaded from: classes6.dex */
public final class pov0 implements eav0.b {
    public final /* synthetic */ mov0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public pov0(mov0 mov0Var, long j, String str) {
        this.a = mov0Var;
        this.b = j;
        this.c = str;
    }

    @Override // xsna.eav0.b
    public final void a(Boolean bool) {
        this.a.j(this.b, this.c);
    }

    @Override // xsna.eav0.b
    public final void onDismiss() {
        this.a.f(VkAppsErrors.Client.USER_DENIED);
    }
}
