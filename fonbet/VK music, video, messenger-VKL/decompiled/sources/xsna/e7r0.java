package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.views.animation.VKAnimationView;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e7r0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VKAnimationView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ e7r0(int i, VKAnimationView vKAnimationView, boolean z) {
        this.b = i;
        this.c = vKAnimationView;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        StickerStockItem stickerStockItem = (StickerStockItem) obj;
        VKAnimationView vKAnimationView = this.c;
        if (stickerStockItem != null) {
            int i = VKAnimationView.w;
            boolean M = dhr0.M();
            Iterator<T> it = stickerStockItem.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((StickerItem) obj2).b == this.b) {
                    break;
                }
            }
            StickerItem stickerItem = (StickerItem) obj2;
            String a = stickerItem != null ? stickerItem.a(M) : null;
            vKAnimationView.q = null;
            if (a != null) {
                vKAnimationView.v0(-1, a, this.d);
            }
            t6g0 t6g0Var = t6g0.b;
            t6g0.d().k(stickerStockItem);
        } else {
            a780 a780Var = vKAnimationView.p;
            if (a780Var != null) {
                a780Var.a();
            }
        }
        return s3q0.a;
    }
}
