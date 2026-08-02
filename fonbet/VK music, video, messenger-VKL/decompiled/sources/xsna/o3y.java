package xsna;

import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.order.presentation.mvi.c;
import com.vk.ecomm.orders.impl.order.presentation.mvi.d;
import com.vk.stories.StorySettingsActivity;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import kotlin.Pair;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o3y implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((nm1) obj2).invoke(obj);
                break;
            case 1:
                ((lxz) obj2).invoke(obj);
                break;
            case 2:
                ((ifg) obj2).invoke(obj);
                break;
            case 3:
                ((ops) obj2).invoke(obj);
                break;
            case 4:
                ((defpackage.m) obj2).invoke(obj);
                break;
            case 5:
                ((cu4) obj2).invoke(obj);
                break;
            case 6:
                ((bq00) obj2).invoke(obj);
                break;
            case 7:
                ((p2u) obj2).invoke(obj);
                break;
            case 8:
                ((kpd) obj2).invoke(obj);
                break;
            case 9:
                ((kr60) obj2).c(new yo60.g.a((Throwable) obj));
                break;
            case 10:
                ((nm1) obj2).invoke(obj);
                break;
            case 11:
                ((rm9) obj2).invoke(obj);
                break;
            case 12:
                com.vk.ecomm.orders.impl.order.presentation.mvi.g gVar = (com.vk.ecomm.orders.impl.order.presentation.mvi.g) obj2;
                gVar.e(new d.b.a(OrderPaymentResult.Failed));
                ((ls90) gVar.g.getValue()).getClass();
                gVar.c(new c.j(ls90.a((Throwable) obj)));
                break;
            case 13:
                ((al7) obj2).invoke(obj);
                break;
            case 14:
                ((pf8) obj2).invoke(obj);
                break;
            case 15:
                ((bq00) obj2).invoke(obj);
                break;
            case 16:
                ((p2u) obj2).invoke(obj);
                break;
            case 17:
                ((bq00) obj2).invoke(obj);
                break;
            case 18:
                ((bq00) obj2).invoke(obj);
                break;
            case 19:
                ((lxh0) obj2).invoke(obj);
                break;
            case 20:
                ((nm1) obj2).invoke(obj);
                break;
            case 21:
                int i2 = StorySettingsActivity.P;
                ((StorySettingsActivity.a) obj2).invoke(obj);
                break;
            case 22:
                ((nm1) obj2).invoke(obj);
                break;
            case 23:
                ((rgl0) obj2).invoke(obj);
                break;
            case 24:
                ((rgl0) obj2).invoke(obj);
                break;
            case 25:
                int i3 = UnreadCounterSettingsFragment.n0;
                ((b9d) obj2).invoke(obj);
                break;
            case 26:
                ((rgl0) obj2).invoke(obj);
                break;
            case 27:
                ((izs) obj2).invoke(obj);
                break;
            case 28:
                isq0 isq0Var = (isq0) obj2;
                Pair pair = (Pair) obj;
                bwq0 bwq0Var = (bwq0) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                isq0Var.e(bwq0Var);
                isq0Var.E(booleanValue);
                break;
            default:
                ((ovc0) obj2).invoke(obj);
                break;
        }
    }
}
