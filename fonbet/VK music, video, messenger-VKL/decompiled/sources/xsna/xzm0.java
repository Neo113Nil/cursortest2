package xsna;

import android.content.Context;
import android.view.Window;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: SubscriptionSuccessSnackbarHelper.kt */
/* loaded from: classes17.dex */
public final class xzm0 {
    public final d0n0 a;
    public final pb b;

    public xzm0(pb pbVar, d0n0 d0n0Var) {
        this.a = d0n0Var;
        this.b = pbVar;
    }

    public final void a(Context context, UserId userId) {
        Window a = this.b.a();
        if (a == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(fkq0.b(userId) ? R.string.clips_subscription_success_snackbar_group : R.string.clips_subscription_success_snackbar_user)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.clips_subscription_success_snackbar_button_open), new ptl0(this, 6));
        aVar.d = true;
        aVar.p(a);
    }
}
