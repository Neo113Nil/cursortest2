package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.stories.dto.StoriesGetTopHashtagsResponseDto;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.video.exo.offline.DownloadInfo;
import xsna.l5x0;
import xsna.yfs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wfl0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wfl0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "product_card_stock_amount_title");
                return s3q0.a;
            case 1:
                List<String> d = ((StoriesGetTopHashtagsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(new hvu((String) it.next()));
                }
                return new u4m0(arrayList);
            case 2:
                return ((File) obj).getAbsolutePath();
            case 3:
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((yfs0) obj) instanceof yfs0.a);
            case 5:
                return Boolean.valueOf(((DownloadInfo) ((Map.Entry) obj).getValue()).c().length == 0);
            case 6:
                qgi0.r((tgi0) obj, "topBarRightExtraIcon");
                return s3q0.a;
            case 7:
                return new jpw0(R.layout.voip_history_friends_item_divider, (ViewGroup) obj);
            case 8:
                return ((l5x0.b) obj).b;
            default:
                qgi0.r((tgi0) obj, "community:warning:title");
                return s3q0.a;
        }
    }
}
