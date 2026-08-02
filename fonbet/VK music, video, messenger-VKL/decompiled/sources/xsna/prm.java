package xsna;

import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.p810;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class prm implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ prm(int i, y810 y810Var, f810 f810Var) {
        this.c = i;
        this.d = y810Var;
        this.e = f810Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MultipickerProduct.Owner owner;
        Object obj2;
        switch (this.b) {
            case 0:
                com.vk.im.engine.internal.storage.delegates.dialogs.b bVar = (com.vk.im.engine.internal.storage.delegates.dialogs.b) this.d;
                DialogsFilter dialogsFilter = (DialogsFilter) this.e;
                bVar.b.b().execSQL("UPDATE dialogs_history_meta SET fully_fetched = 0 WHERE filter_id = " + dialogsFilter.i() + " AND folder_id = " + this.c);
                return s3q0.a;
            default:
                y810 y810Var = (y810) this.d;
                f810 f810Var = (f810) this.e;
                MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
                List<MarketMarketItemDto> d = marketSearchResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (MarketMarketItemDto marketMarketItemDto : d) {
                    boolean z = f810Var.k;
                    List<glu> list = y810Var.f;
                    UserId q = marketMarketItemDto.q();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        owner = null;
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((glu) obj2).b, fkq0.a(q))) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    glu gluVar = (glu) obj2;
                    if (gluVar != null) {
                        UserId userId = gluVar.b;
                        String str = gluVar.d;
                        Boolean bool = gluVar.f;
                        owner = new MultipickerProduct.Owner(userId, str, bool != null ? bool.booleanValue() : false);
                    }
                    arrayList.add(new ha10(fno.a(marketMarketItemDto, z, owner)));
                }
                return new p810.q(j5g.u0(arrayList, y810Var.g), this.c + 20, marketSearchResponseDto.getCount());
        }
    }

    public /* synthetic */ prm(com.vk.im.engine.internal.storage.delegates.dialogs.b bVar, DialogsFilter dialogsFilter, int i) {
        this.d = bVar;
        this.e = dialogsFilter;
        this.c = i;
    }
}
