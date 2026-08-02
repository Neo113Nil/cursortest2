package xsna;

import com.vk.api.generated.market.dto.MarketGetCountersResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import xsna.oml0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ljs implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ljs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = FriendRequestsFragment.d0;
                ((l3f) obj2).invoke(obj);
                break;
            case 1:
                ((nj) obj2).invoke(obj);
                break;
            case 2:
                ((z5a) obj2).invoke(obj);
                break;
            case 3:
                ((xgv) obj2).invoke(obj);
                break;
            case 4:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().G0((UserId) obj2);
                break;
            case 5:
                ((f0z) obj2).invoke(obj);
                break;
            case 6:
                ((f0z) obj2).invoke(obj);
                break;
            case 7:
                ((com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o) obj2).e(new k.e((j2g0) obj));
                break;
            case 8:
                ((f0z) obj2).invoke(obj);
                break;
            case 9:
                ((nj) obj2).invoke(obj);
                break;
            case 10:
                ((f0z) obj2).invoke(obj);
                break;
            case 11:
                ((f0z) obj2).invoke(obj);
                break;
            case 12:
                ((f0z) obj2).invoke(obj);
                break;
            case 13:
                ((f0z) obj2).invoke(obj);
                break;
            case 14:
                ((kr60) obj2).c(new yo60.g.a((Throwable) obj));
                break;
            case 15:
                ((z5a) obj2).invoke(obj);
                break;
            case 16:
                ((ti30) obj2).invoke(obj);
                break;
            case 17:
                ((xgv) obj2).invoke(obj);
                break;
            case 18:
                ((f0z) obj2).invoke(obj);
                break;
            case 19:
                ((hoh) obj2).invoke(obj);
                break;
            case 20:
                ((f0z) obj2).invoke(obj);
                break;
            case 21:
                ((z5a) obj2).invoke(obj);
                break;
            case 22:
                ((fsf0) obj2).invoke(obj);
                break;
            case 23:
                ((f0z) obj2).invoke(obj);
                break;
            case 24:
                ((eo6) obj2).invoke(obj);
                break;
            case 25:
                ((f0z) obj2).invoke(obj);
                break;
            case 26:
                ((j6l0) obj2).invoke(obj);
                break;
            case 27:
                fpl0 fpl0Var = (fpl0) obj2;
                Integer d = ((MarketGetCountersResponseDto) obj).d();
                fpl0Var.e(new oml0.c(d != null ? d.intValue() : 0));
                break;
            case 28:
                ((j6l0) obj2).invoke(obj);
                break;
            default:
                ((d220) obj2).invoke(obj);
                break;
        }
    }
}
