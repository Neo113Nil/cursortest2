package xsna;

import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.dto.gift.GiftItem;
import com.vkontakte.android.R;

/* compiled from: ProfileGiftsFragment.kt */
/* loaded from: classes15.dex */
public final class mxd0 extends rpj0<Boolean> {
    public final /* synthetic */ ProfileGiftsFragment d;
    public final /* synthetic */ GiftItem e;

    public mxd0(ProfileGiftsFragment profileGiftsFragment, GiftItem giftItem) {
        this.d = profileGiftsFragment;
        this.e = giftItem;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        if (epx.f((Boolean) obj, Boolean.TRUE)) {
            int i = ProfileGiftsFragment.Q0;
            ProfileGiftsFragment profileGiftsFragment = this.d;
            profileGiftsFragment.v0.remove(this.e);
            profileGiftsFragment.q();
            cvk.u(R.string.gift_deleted_successfully, false);
        }
    }
}
