package xsna;

import android.view.View;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.tlo0;

/* compiled from: RequestPermissionVh.kt */
/* loaded from: classes2.dex */
public final class g8g0 extends vfz<f8g0> {
    public final e8g0 l;
    public final VkBanner m;

    public g8g0(View view, e8g0 e8g0Var) {
        super(view);
        this.l = e8g0Var;
        this.m = (VkBanner) this.itemView.findViewById(R.id.request_permission_banner);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(f8g0 f8g0Var) {
        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_contact_permission_banner_text);
        tlo0.f fVar = new tlo0.f(R.string.vkim_contact_permission_banner_btn);
        VkButton.Size size = VkButton.Size.Small;
        this.m.setMiddle(new VkBanner.e(h, null, null, new VkBanner.c(fVar, new ni0(18, f8g0Var, this), VkButton.Mode.Secondary, VkButton.Appearance.Accent, size, null, null, 992), null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
    }
}
