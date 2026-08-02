package xsna;

import com.vk.dto.stickers.StickerItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: FullSearchLoader.kt */
/* loaded from: classes15.dex */
public final class zvs {
    public final gws a;
    public final b6l0 b;

    public zvs(gws gwsVar) {
        this.a = gwsVar;
        t6g0 t6g0Var = t6g0.b;
        this.b = new b6l0(t6g0.d());
    }

    public static List a(List list, List list2, boolean z) {
        boolean z2;
        t6g0 t6g0Var = t6g0.b;
        if (!t6g0.d().q()) {
            if (z) {
                return list;
            }
            List list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(StickerItem.zb((StickerItem) it.next(), 0, false, 959));
            }
            return arrayList;
        }
        List<StickerItem> list4 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
        for (StickerItem stickerItem : list4) {
            if (!stickerItem.h) {
                List list5 = list2;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() == stickerItem.c) {
                            z2 = false;
                            break;
                        }
                    }
                }
            }
            z2 = true;
            arrayList2.add(StickerItem.zb(stickerItem, 0, z2, 959));
        }
        return arrayList2;
    }

    public final io.reactivex.rxjava3.core.q<List<Integer>> b() {
        ArrayList arrayList = this.a.a;
        if (!arrayList.isEmpty()) {
            return io.reactivex.rxjava3.core.q.T(j5g.O0(arrayList));
        }
        t6g0 t6g0Var = t6g0.b;
        return t6g0.d().B0().w();
    }

    public final io.reactivex.rxjava3.core.q c(int i, String str) {
        this.b.c.getClass();
        tfx tfxVar = new tfx("stickers.searchStickers", new e630(9), new qmk0(1));
        tfx.o(tfxVar, "query", str, 0, 0, 12);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_LIMIT, 15, 0, 0, 8);
        return io.reactivex.rxjava3.core.q.m(rsg0.T(yfb.x(tfxVar)).U(new e40(new p2u(29), 28)), b(), new h8(new com.vk.movika.tools.controls.seekbar.s(this, 8), 17));
    }
}
