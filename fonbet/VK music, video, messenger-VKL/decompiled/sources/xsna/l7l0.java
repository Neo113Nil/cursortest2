package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.details.holders.PackStylesListHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StickerStyleSelectorPresenter.kt */
/* loaded from: classes6.dex */
public final class l7l0 implements f7l0 {
    public final o7l0 b;
    public final h7l0 c;
    public StickerStockItem d;
    public StickerStockItem e;
    public final ArrayList f = new ArrayList();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    public l7l0(o7l0 o7l0Var, h7l0 h7l0Var) {
        this.b = o7l0Var;
        this.c = h7l0Var;
    }

    public static int x(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((qai0) obj).a.h) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size();
    }

    @Override // xsna.f7l0
    public final void B(StickerStockItem stickerStockItem) {
        Object obj;
        Object obj2;
        ArrayList arrayList = this.f;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((qai0) obj).b) {
                    break;
                }
            }
        }
        qai0 qai0Var = (qai0) obj;
        if (qai0Var != null && !epx.f(qai0Var.a, stickerStockItem)) {
            qai0Var.b = false;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((qai0) obj2).a.b == stickerStockItem.b) {
                    break;
                }
            }
        }
        qai0 qai0Var2 = (qai0) obj2;
        if (qai0Var2 != null) {
            qai0Var2.b = true;
        }
        this.d = stickerStockItem;
        int x = x(arrayList);
        StickerStockItem stickerStockItem2 = this.d;
        StickerStockItem stickerStockItem3 = stickerStockItem2 != null ? stickerStockItem2 : null;
        StickerStockItem stickerStockItem4 = this.e;
        g7l0.Yg(this.b, stickerStockItem3, stickerStockItem4 != null ? stickerStockItem4 : null, arrayList, PackStylesListHolder.State.DATA, x, 32);
        ((kcl0) ((com.vk.channels.impl.channel_screen.send_msg.c) this.c.c).b).s(stickerStockItem, new v4v(6));
    }

    @Override // xsna.f7l0
    public final void U4(StickerStockItem stickerStockItem) {
        this.d = stickerStockItem;
        if (stickerStockItem.Hb()) {
            this.e = stickerStockItem;
            Z();
            return;
        }
        Integer num = stickerStockItem.L;
        if (num != null) {
            io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new kil0(num.intValue(), null), null, null, 3), new wx00(new k7l0(this, 0), 18), io.reactivex.rxjava3.internal.functions.a.c).U(new nlf0(new fa00(this, 24), 2));
            asu0.a.getClass();
            this.g.b(U.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new vk40(new h440(this, 21), 20), new j7l0(new xka0(this, 13), 0)));
        }
    }

    public final void Z() {
        StickerStockItem stickerStockItem = this.d;
        if (stickerStockItem == null) {
            stickerStockItem = null;
        }
        if (stickerStockItem.Ib()) {
            StickerStockItem stickerStockItem2 = this.d;
            StickerStockItem stickerStockItem3 = stickerStockItem2 != null ? stickerStockItem2 : null;
            StickerStockItem stickerStockItem4 = this.e;
            g7l0.Yg(this.b, stickerStockItem3, stickerStockItem4 != null ? stickerStockItem4 : null, this.f, null, 0, 56);
            return;
        }
        StickerStockItem stickerStockItem5 = this.d;
        if (stickerStockItem5 == null) {
            stickerStockItem5 = null;
        }
        if (!stickerStockItem5.J.isEmpty()) {
            StickerStockItem stickerStockItem6 = this.d;
            if (stickerStockItem6 == null) {
                stickerStockItem6 = null;
            }
            if (stickerStockItem6.Hb()) {
                StickerStockItem stickerStockItem7 = this.d;
                z(stickerStockItem7 != null ? stickerStockItem7 : null);
                return;
            }
        }
        StickerStockItem stickerStockItem8 = this.d;
        if (stickerStockItem8 == null) {
            stickerStockItem8 = null;
        }
        if (stickerStockItem8.Hb()) {
            return;
        }
        StickerStockItem stickerStockItem9 = this.e;
        z(stickerStockItem9 != null ? stickerStockItem9 : null);
    }

    @Override // xsna.y5l0
    public final List<StickerItem> b() {
        StickerStockItem stickerStockItem = this.d;
        if (stickerStockItem == null) {
            stickerStockItem = null;
        }
        return stickerStockItem.g;
    }

    @Override // xsna.f7l0
    public final void e() {
        Z();
    }

    @Override // xsna.y5l0
    public final int g(StickerItem stickerItem) {
        return b().indexOf(stickerItem);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        this.g.e();
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        io.reactivex.rxjava3.subjects.f<xvg0> fVar = h4l0.a.a;
        ga40 ga40Var = new ga40(new vlc0(this, 13), 9);
        fVar.getClass();
        this.g.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, ga40Var).a0(asu0.a.d()).subscribe(new nex(this, 23)));
    }

    public final void z(StickerStockItem stickerStockItem) {
        this.g.b(new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.T(new sil0(j5g.v0(Integer.valueOf(stickerStockItem.b), stickerStockItem.J), null)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new l8w(new fh1(23, this, stickerStockItem), 25), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new b8v(new du0(24, this, stickerStockItem), 26), new k130(new prd0(2, this, stickerStockItem), 20)));
    }
}
