package xsna;

import com.vk.api.generated.market.dto.MarketGetItemsByVideoResponseDto;
import xsna.qot0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vks0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vks0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((whi0) obj2).invoke(obj);
                break;
            case 1:
                ((qot0.b) obj2).invoke(obj);
                break;
            case 2:
                ((vgs0) obj2).invoke(obj);
                break;
            case 3:
                ((mdm0) obj2).invoke(obj);
                break;
            case 4:
                int i2 = c2x0.o1;
                ((olt0) obj2).invoke(obj);
                break;
            case 5:
                ((olt0) obj2).invoke(obj);
                break;
            default:
                ((l2y0) obj2).p1(b210.e(((MarketGetItemsByVideoResponseDto) obj).d()));
                break;
        }
    }
}
