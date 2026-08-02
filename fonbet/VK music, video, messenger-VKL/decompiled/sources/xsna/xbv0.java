package xsna;

import com.vk.api.money.MoneySendTransfer;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;

/* compiled from: VkPayPinPresenter.kt */
/* loaded from: classes3.dex */
public final class xbv0 extends jma0 {
    public final MoneySendTransfer e;
    public final VkPayPinFragment f;
    public boolean g;

    public xbv0(MoneySendTransfer moneySendTransfer, VkPayPinFragment vkPayPinFragment, int i) {
        super(vkPayPinFragment, i);
        this.e = moneySendTransfer;
        this.f = vkPayPinFragment;
    }

    @Override // xsna.jma0, xsna.gm6
    public final boolean a0() {
        this.f.ko(this.g ? 1 : 0);
        return true;
    }

    @Override // xsna.jma0
    public final io.reactivex.rxjava3.core.x<Boolean> b(String str) {
        MoneySendTransfer moneySendTransfer = this.e;
        moneySendTransfer.getClass();
        MoneySendTransfer F0 = MoneySendTransfer.F0(moneySendTransfer, 0, null, str, 1919);
        F0.q = 2;
        io.reactivex.rxjava3.core.q L = rsg0.y0(F0, null, null, 3).F(new nan0(new ftu0(this, 2), 7)).L(new ao90(new iyd0(this, 23), 11), false).L(new ac20(new hcs0(3), 24), false);
        Boolean bool = Boolean.FALSE;
        return L.d0(bool).l0(bool);
    }
}
