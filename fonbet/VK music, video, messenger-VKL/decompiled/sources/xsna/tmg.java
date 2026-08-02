package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.fragments.friends.FriendsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tmg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ tmg(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                ((StickerStockItem) obj).O = str;
                break;
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, str);
                qgi0.n(tgi0Var, 5);
                break;
            case 2:
                int i2 = FriendsFragment.q0;
                qgi0.h((tgi0) obj, str);
                break;
            default:
                bpn0 bpn0Var = c7r0.a;
                c7r0.e().put(str, (RLottieDrawable) obj);
                c7r0.e().size();
                break;
        }
        return s3q0.a;
    }
}
