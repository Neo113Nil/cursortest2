package xsna;

import android.net.Uri;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import xsna.ij20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zy2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zy2(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        switch (i) {
            case 0:
                ((ij20.a) obj).l(z);
                return s3q0.a;
            case 1:
                UIBlock uIBlock = (UIBlock) obj;
                if (!(uIBlock instanceof UIBlockRadioStation)) {
                    if (!(uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation)) {
                        return uIBlock;
                    }
                    UIBlockSearchHistory.UIBlockSearchHistoryRadioStation uIBlockSearchHistoryRadioStation = (UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) uIBlock;
                    return new UIBlockSearchHistory.UIBlockSearchHistoryRadioStation(uIBlockSearchHistoryRadioStation.A, RadioStation.zb(uIBlockSearchHistoryRadioStation.B, z, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), uIBlockSearchHistoryRadioStation.C);
                }
                UIBlockRadioStation uIBlockRadioStation = (UIBlockRadioStation) uIBlock;
                RadioStation zb = RadioStation.zb(uIBlockRadioStation.y, z, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                List<RadioStation> list = uIBlockRadioStation.z;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (RadioStation radioStation : list) {
                    if (radioStation.b == zb.b) {
                        radioStation = zb;
                    }
                    arrayList.add(radioStation);
                }
                return new UIBlockRadioStation(uIBlockRadioStation.Ab(), zb, arrayList);
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                if (!z) {
                    qgi0.a(tgi0Var);
                }
                qgi0.r(tgi0Var, "nextBtnThemesTestTag");
                return s3q0.a;
            default:
                Uri uri = (Uri) obj;
                int i2 = VkImageViewTopCrop.c;
                return mcr0.i(uri, 0, 0, 0, null, z ? new jwx(2, 30) : null);
        }
    }
}
