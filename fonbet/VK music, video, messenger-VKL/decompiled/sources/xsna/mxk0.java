package xsna;

import android.content.Context;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.wkh0;

/* compiled from: StaticAdsSubscriptionDelegateImpl.kt */
/* loaded from: classes17.dex */
public final class mxk0 implements lxk0 {
    public final o0r0 a;

    public mxk0(o0r0 o0r0Var) {
        this.a = o0r0Var;
    }

    @Override // xsna.lxk0
    public final void a(Context context, SdkOwner sdkOwner) {
        UserId userId = sdkOwner.b;
        if (userId == null) {
            return;
        }
        o0r0.i(this.a, userId, true, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).subscribe(new aym0(context, new xqf0(4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [xsna.tsk0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [xsna.gzs] */
    /* JADX WARN: Type inference failed for: r11v2, types: [xsna.k5f0] */
    @Override // xsna.lxk0
    public final void b(Context context, SdkOwner sdkOwner, wkh0.b bVar, tsk0 tsk0Var) {
        UserId userId = sdkOwner.b;
        if (userId == null) {
            return;
        }
        io.reactivex.rxjava3.core.q a0 = o0r0.i(this.a, userId, false, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        if (!(bVar instanceof wkh0.b.a)) {
            if (!(bVar instanceof wkh0.b.C3939b)) {
                throw new NoWhenBranchMatchedException();
            }
            a0 = t7i.a(a0, context, context.getString(fkq0.b(userId) ? R.string.clip_author_subscribe_done_group : R.string.clip_author_subscribe_done_profile), context.getString(R.string.clip_action_progress));
        }
        if (tsk0Var == 0) {
            tsk0Var = new k5f0(5);
        }
        a0.subscribe(new aym0(context, tsk0Var));
    }
}
