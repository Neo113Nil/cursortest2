package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xs0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xs0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.f;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                bt0.b(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, str, izsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                x5c.a((y8c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                cv70.g((OfflinePodcastEpisodesMviState.SortType) this.f, (izs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                cw80.c((OrdersListItem.Order) this.f, (gzs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 4:
                List list = (List) this.f;
                izs izsVar2 = (izs) this.c;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                s1k0.a(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, list, izsVar2, q630Var2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ccm0.b((String) this.f, (Cell$Middle.Size) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                kuo0.j((tuo0) this.f, (q630) this.d, (yto0) this.c, this.e, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xs0(tuo0 tuo0Var, q630 q630Var, yto0 yto0Var, int i, int i2) {
        this.b = 6;
        this.f = tuo0Var;
        this.d = q630Var;
        this.c = yto0Var;
        this.e = i;
    }
}
