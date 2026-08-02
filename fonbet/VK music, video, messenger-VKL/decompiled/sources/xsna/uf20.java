package xsna;

import android.graphics.Insets;
import android.view.View;
import com.google.android.gms.tasks.OnCanceledListener;
import com.vk.api.generated.goodsOrders.dto.GoodsOrdersOrderItemDto;
import com.vk.core.view.ProgressView;
import com.vk.dto.attaches.Attach;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import java.util.List;
import kotlin.Pair;
import xsna.dug0;
import xsna.k6o0;
import xsna.kkl0;
import xsna.lau;
import xsna.no90;
import xsna.onq0;
import xsna.xgy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class uf20 implements io.reactivex.rxjava3.functions.l, xgy.a, ProgressView.c, io.reactivex.rxjava3.functions.i, k6o0.a, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uf20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.core.view.ProgressView.c
    public void a(int i, int i2) {
        Attach attach = (Attach) this.c;
        r3e0.g.put(attach.xb(), i2);
        r3e0.h.put(attach.xb(), i);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (kkl0.b) ((f07) this.c).invoke(obj, obj2);
    }

    @Override // xsna.k6o0.a
    public void b(Object obj, Object obj2) {
        xhl0<?> xhl0Var = (xhl0) this.c;
        xhl0Var.getClass();
        yhl0.c.a(xhl0Var);
        ((OnCanceledListener) obj).onCanceled();
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (List) ((pbv) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // xsna.xgy.a
    public int getHeight() {
        Insets insets;
        int i;
        kz30 kz30Var = (kz30) this.c;
        int i2 = ify.a;
        int c = ify.c(kz30Var.i.getApplicationContext(), null);
        if (!gz80.a(30)) {
            return c;
        }
        a1w a1wVar = kz30Var.b;
        a1wVar.getClass();
        if (!a1wVar.r().h.l()) {
            return c;
        }
        View view = kz30Var.u;
        insets = (view != null ? view : null).getRootWindowInsets().getInsets(519);
        i = insets.bottom;
        return c - i;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((k9m0) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ uf20(uxp0 uxp0Var, lau.b bVar) {
        this.b = 14;
        this.c = bVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (s3q0) ((p7x) this.c).invoke(obj);
            case 1:
                return (dug0.c) ((jtv) this.c).invoke(obj);
            case 2:
                return (List) ((p7x) this.c).invoke(obj);
            case 3:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case 24:
            default:
                return (NewsEntry) ((ijw0) this.c).invoke(obj);
            case 4:
                return (j170) ((fju) this.c).invoke(obj);
            case 5:
                return (no90.c.b) ((p7x) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((qb6) this.c).invoke(obj);
            case 8:
                return (Pair) ((com.vk.music.onboarding.impl.model.d) this.c).invoke(obj);
            case 9:
                return (Pair) ((ase0) this.c).invoke(obj);
            case 15:
                return ((onq0.b) this.c).invoke(obj);
            case 16:
                return (WallWithCounters) ((p7x) this.c).invoke(obj);
            case 17:
                return (kkq0) ((puq0) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.e) ((eu10) this.c).invoke(obj);
            case 20:
                return (String) ((puq0) this.c).invoke(obj);
            case 21:
                return (NewsComment) ((puq0) this.c).invoke(obj);
            case 22:
                return (sfs0) ((qhg0) this.c).invoke(obj);
            case 23:
                return (GoodsOrdersOrderItemDto) ((izs) this.c).invoke(obj);
            case 25:
                ((ulq0) this.c).invoke(obj);
                return Boolean.TRUE;
            case 26:
                return (io.reactivex.rxjava3.core.t) ((sgx0) this.c).invoke(obj);
        }
    }
}
