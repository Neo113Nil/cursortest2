package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Peer;
import com.vk.ecomm.categories.api.MarketBridgeCategory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class eka implements j18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Parcelable c;

    public /* synthetic */ eka(Parcelable parcelable, int i) {
        this.b = i;
        this.c = parcelable;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ija((MarketBridgeCategory) this.c);
            default:
                return new k6w((Peer) this.c);
        }
    }
}
