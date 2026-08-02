package xsna;

import com.vk.api.generated.market.dto.MarketGetProductLinkedContentResponseDto;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.dto.common.Source;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c37;
import xsna.l8j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tf1 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((ab) this.c).invoke(obj);
                break;
            case 1:
                ((tm0) this.c).invoke(obj);
                break;
            case 2:
                ((ya) this.c).invoke(obj);
                break;
            case 3:
                r46 r46Var = (r46) this.c;
                r46Var.j.a(Source.CACHE);
                break;
            case 4:
                ((c37.a) this.c).invoke(obj);
                break;
            case 5:
                ((tm0) this.c).invoke(obj);
                break;
            case 6:
                ((e60) this.c).invoke(obj);
                break;
            case 7:
                ((tm0) this.c).invoke(obj);
                break;
            case 8:
                ((com.vk.channels.impl.comments.b) this.c).u((Throwable) obj);
                break;
            case 9:
                ((tm0) this.c).invoke(obj);
                break;
            case 10:
                ((ClipSearchRootVh.b.C0497b) this.c).invoke(obj);
                break;
            case 11:
                ((ogd) this.c).invoke(obj);
                break;
            case 12:
                ((h6g) this.c).invoke(obj);
                break;
            case 13:
                ((h6g) this.c).invoke(obj);
                break;
            case 14:
                ((h6g) this.c).invoke(obj);
                break;
            case 15:
                ((l8j.m) this.c).invoke(obj);
                break;
            case 16:
                ((g15) this.c).invoke(obj);
                break;
            case 17:
                ((h6g) this.c).invoke(obj);
                break;
            case 18:
                ((oem) this.c).invoke(obj);
                break;
            case 19:
                ((h6g) this.c).invoke(obj);
                break;
            case 20:
                ((ab) this.c).invoke(obj);
                break;
            case 21:
                ((ab) this.c).invoke(obj);
                break;
            case 22:
                ((jr3) this.c).invoke(obj);
                break;
            case 23:
                ((exs) this.c).invoke(obj);
                break;
            case 24:
                ((h6g) this.c).invoke(obj);
                break;
            case 25:
                ((on7) this.c).invoke(obj);
                break;
            case 26:
                ((h6g) this.c).invoke(obj);
                break;
            case 27:
                t710 t710Var = (t710) this.c;
                MarketGetProductLinkedContentResponseDto marketGetProductLinkedContentResponseDto = (MarketGetProductLinkedContentResponseDto) obj;
                List<MarketProductLinkedContentItemDto> d = marketGetProductLinkedContentResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MediaContentItem((MarketProductLinkedContentItemDto) it.next(), false, 0, 4, null));
                }
                t710Var.e(new v610(arrayList, marketGetProductLinkedContentResponseDto.e()));
                break;
            case 28:
                ((yhu) this.c).invoke(obj);
                break;
            default:
                ((ab) this.c).invoke(obj);
                break;
        }
    }
}
