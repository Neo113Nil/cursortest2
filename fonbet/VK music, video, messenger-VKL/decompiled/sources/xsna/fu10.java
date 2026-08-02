package xsna;

import com.vk.api.generated.video.dto.VideoGetVideoDiscoverResponseDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.kkl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fu10(int i, List list) {
        this.b = 1;
        this.c = i;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new com.vk.mediapicker.impl.presentation.mvi.c((com.vk.mediapicker.impl.presentation.mvi.b) this.d, this.c, null), 3));
            case 1:
                List list = (List) this.d;
                List list2 = ((jkl0) obj).a;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.addAll(list2);
                return new kkl0.e(arrayList, list2.size() + this.c);
            default:
                com.vk.video.ui.discovery.catalog.d dVar = (com.vk.video.ui.discovery.catalog.d) this.d;
                VideoGetVideoDiscoverResponseDto videoGetVideoDiscoverResponseDto = (VideoGetVideoDiscoverResponseDto) obj;
                List e = ums0.e(ums0.a, videoGetVideoDiscoverResponseDto.f(), videoGetVideoDiscoverResponseDto.j(), videoGetVideoDiscoverResponseDto.e(), false, 52);
                return dVar.a(this.c, videoGetVideoDiscoverResponseDto.getCount(), com.vk.dto.video.a.a(e), videoGetVideoDiscoverResponseDto.d(), videoGetVideoDiscoverResponseDto.i(), videoGetVideoDiscoverResponseDto.g(), videoGetVideoDiscoverResponseDto.k());
        }
    }

    public /* synthetic */ fu10(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
