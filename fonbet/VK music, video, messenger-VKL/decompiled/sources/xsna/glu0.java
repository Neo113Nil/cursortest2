package xsna;

import android.view.View;
import android.view.ViewStub;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;

/* compiled from: VkClientExchangeLoginFragment.kt */
/* loaded from: classes7.dex */
public final class glu0 extends b2q {
    @Override // xsna.b2q
    public final void Bn(ViewStub viewStub) {
        if (SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET.h()) {
            viewStub.setLayoutResource(R.layout.content_info_button);
            View inflate = viewStub.inflate();
            inflate.setVisibility(0);
            inflate.setOnClickListener(new c6u(4, inflate, this));
            this.B = inflate;
        }
    }
}
