package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.stickers.StickerStockItem;
import java.util.Collection;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mdm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mdm(Object obj, int i, Collection collection, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = collection;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                pdm pdmVar = (pdm) obj3;
                Collection<? extends Peer> collection = (Collection) obj2;
                pdmVar.d().c(i2, collection);
                pdmVar.p(i2, j5g.O0(collection));
                break;
            case 1:
                i8l0 i8l0Var = (i8l0) obj3;
                List list = (List) obj2;
                t6g0 t6g0Var = t6g0.b;
                StickerStockItem H = t6g0.d().H(i2);
                io.reactivex.rxjava3.core.x k = H != null ? io.reactivex.rxjava3.core.x.k(H) : rsg0.W(new lil0(i2), 7).m(asu0.a.d());
                wpo wpoVar = new wpo(i8l0Var, i2, list);
                int i3 = 24;
                io.reactivex.rxjava3.disposables.c subscribe = k.subscribe(new tl30(wpoVar, i3), new cx00(new kb40(i8l0Var, 27), i3));
                hg1.b(i8l0Var.b, subscribe);
                i8l0Var.g.b(subscribe);
                break;
            default:
                xbm0 xbm0Var = (xbm0) obj3;
                nxt0 nxt0Var = (nxt0) obj2;
                xbm0Var.f.c(nxt0Var, i2);
                ybm0 ybm0Var = xbm0Var.j;
                if (ybm0Var != null) {
                    ybm0Var.d = Integer.valueOf(i2);
                }
                xbm0.f(nxt0Var, new e750(15)).start();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mdm(xbm0 xbm0Var, nxt0 nxt0Var, int i) {
        this.b = 2;
        this.d = xbm0Var;
        this.e = nxt0Var;
        this.c = i;
    }
}
