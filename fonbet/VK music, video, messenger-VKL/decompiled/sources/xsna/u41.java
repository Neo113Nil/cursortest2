package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u41 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return com.vk.superapp.advertisement.b.t((AdvertisementConfig) obj, Collections.singletonList(Integer.valueOf(this.c)));
            default:
                VKList vKList = (VKList) obj;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new o2t0((VideoFile) it.next()));
                }
                return new wia0(arrayList, vKList.i(), this.c == 0);
        }
    }

    public /* synthetic */ u41(com.vk.superapp.advertisement.b bVar, int i) {
        this.c = i;
    }
}
