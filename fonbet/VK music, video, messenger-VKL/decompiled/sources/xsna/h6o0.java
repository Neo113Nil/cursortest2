package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketStorefrontViewedProductsDto;
import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.RTCLogConfiguration;

/* compiled from: TaskInvalidateHistoryViaNetwork.java */
/* loaded from: classes2.dex */
public final class h6o0 implements io.reactivex.rxjava3.functions.b, RTCLogConfiguration {
    public final Object b;

    public /* synthetic */ h6o0(Object obj) {
        this.b = obj;
    }

    public void a(ArrayList arrayList) {
        d(arrayList, true);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) throws Throwable {
        Throwable th = (Throwable) obj2;
        i6o0 i6o0Var = (i6o0) this.b;
        if (th == null) {
            i6o0Var.h(null);
        } else {
            i6o0Var.g(th);
        }
    }

    public void b(l4z l4zVar) {
        esl eslVar = (esl) this.b;
        eslVar.a = l4zVar;
        Iterator it = eslVar.c.iterator();
        while (it.hasNext()) {
            ((loz0) it.next()).a();
        }
        eslVar.c.clear();
        eslVar.b = null;
    }

    public void c(ArrayList arrayList) {
        d(arrayList, false);
    }

    public Map d(final List list, final boolean z) {
        return (Map) ((w2w) this.b).I0().u(new izs() { // from class: xsna.dua
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    hashMap.put(Long.valueOf(longValue), Boolean.valueOf(this.e(longValue, z)));
                }
                return hashMap;
            }
        });
    }

    public boolean e(long j, boolean z) {
        w2w w2wVar = (w2w) this.b;
        bdb bdbVar = w2wVar.I0().a().d(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
        if (bdbVar != null) {
            bdb a = bdb.a(bdbVar, 0, 0, 0, 0, 0, 0, null, null, null, z, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -1025, 7);
            w2wVar.I0().a().A(a);
            new jhb(w2wVar).a(a);
            return true;
        }
        L.l("ChannelArchiveInteractor", "channel with id=" + j + " not found to update archived flag=" + z);
        return false;
    }

    public mpl0 f(MarketStorefrontViewedProductsDto marketStorefrontViewedProductsDto) {
        List<MarketMarketItemDto> e = marketStorefrontViewedProductsDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (MarketMarketItemDto marketMarketItemDto : e) {
            y330 y330Var = (y330) this.b;
            Boolean D0 = marketMarketItemDto.D0();
            Boolean bool = Boolean.TRUE;
            ModerationCheckAdultResult a = y330Var.a(epx.f(D0, bool), epx.f(marketMarketItemDto.v0(), bool));
            List<BaseImageDto> W = marketMarketItemDto.W();
            arrayList.add(new lpl0(W != null ? b210.f(W) : null, a != ModerationCheckAdultResult.ADULT_NOT_REQUIRED));
        }
        return new mpl0(marketStorefrontViewedProductsDto.d(), marketStorefrontViewedProductsDto.getCount(), marketStorefrontViewedProductsDto.getTitle(), arrayList);
    }

    @Override // ru.ok.android.webrtc.RTCLogConfiguration
    public boolean shouldHideSensitiveInformation() {
        return ((irw0) this.b).shouldHideSensitiveInformation();
    }
}
