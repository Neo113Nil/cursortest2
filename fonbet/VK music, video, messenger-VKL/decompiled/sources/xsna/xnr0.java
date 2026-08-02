package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.LinkVKBidFragment;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ObtainVerificationFragment;
import com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.SelectGroupVerificationFragment;
import xsna.mnr0;

/* compiled from: VerifiedSellerRouterImpl.kt */
/* loaded from: classes.dex */
public final class xnr0 implements wnr0 {
    @Override // xsna.wnr0
    public final void a(Context context, UserId userId) {
        new LinkVKBidFragment.a(userId).k(context);
    }

    @Override // xsna.wnr0
    public final void b(Context context, UserId userId, String str) {
        new ObtainVerificationFragment.a(userId, str).k(context);
    }

    @Override // xsna.wnr0
    public final void c(Context context, UserId userId) {
        new SelectGroupVerificationFragment.a(userId).k(context);
    }

    @Override // xsna.wnr0
    public final void d(Context context, boolean z) {
        new mnr0.a(context, z).I0(null);
    }
}
