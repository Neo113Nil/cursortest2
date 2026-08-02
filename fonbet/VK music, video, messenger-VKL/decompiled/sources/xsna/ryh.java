package xsna;

import android.content.Context;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5v0;
import xsna.dzh;
import xsna.oig0;
import xsna.tlo0;

/* compiled from: CommunityReviewsDialogsDelegate.kt */
/* loaded from: classes18.dex */
public final class ryh {
    public final Context a;
    public final a0i<zzh> b;
    public final vbs c;
    public final qdz d;
    public final h7v e;
    public final mla0 f;
    public dw20 g;
    public final i5f h = new i5f(this, 9);

    public ryh(Context context, b9 b9Var, vbs vbsVar, qdz qdzVar, h7v h7vVar, mla0 mla0Var) {
        this.a = context;
        this.b = b9Var;
        this.c = vbsVar;
        this.d = qdzVar;
        this.e = h7vVar;
        this.f = mla0Var;
    }

    public static final void a(ryh ryhVar, oig0 oig0Var) {
        a0i<zzh> a0iVar = ryhVar.b;
        if (oig0Var instanceof oig0.d) {
            a0iVar.c(dzh.o.a);
            return;
        }
        if ((oig0Var instanceof oig0.c) || (oig0Var instanceof oig0.a)) {
            a0iVar.c(new dzh.b(true));
        } else {
            if (!(oig0Var instanceof oig0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            maz.c(ryhVar.d.e(), ryhVar.a, ((oig0.b) oig0Var).a, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, true, null, null, null, 62914559), null, null, 24);
        }
    }

    public final void b(gzs<s3q0> gzsVar) {
        View view = null;
        this.g = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_error_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.pin_review_subscription_info_error_title), new tlo0.f(R.string.pin_review_subscription_info_error_description)), view, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.pin_review_retry_button_text), new n0(12, gzsVar, this), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 6), 52), this.h, false, 20).b(this.a, "CommonError");
    }
}
