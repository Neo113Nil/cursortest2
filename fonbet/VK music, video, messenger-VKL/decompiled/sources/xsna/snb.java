package xsna;

import android.util.LruCache;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersRecommendationBlock;
import java.util.ArrayList;
import java.util.List;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class snb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ snb(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ynb ynbVar = (ynb) this.d;
                wmb.l lVar = new wmb.l(this.c);
                ynbVar.getClass();
                xn50.a.c(ynbVar, lVar);
                break;
            default:
                p5n0 p5n0Var = (p5n0) this.d;
                StickersRecommendationBlock stickersRecommendationBlock = (StickersRecommendationBlock) obj;
                List<StickerStockItemWithStickerId> list = stickersRecommendationBlock.d;
                if (list != null) {
                    LruCache<Integer, List<StickerStockItemWithStickerId>> lruCache = p5n0Var.a;
                    int i = this.c;
                    List<StickerStockItemWithStickerId> list2 = lruCache.get(Integer.valueOf(i));
                    if (list2 == null) {
                        lruCache.put(Integer.valueOf(i), list);
                    } else {
                        ArrayList arrayList = new ArrayList(list2);
                        arrayList.addAll(list);
                        lruCache.put(Integer.valueOf(i), arrayList);
                    }
                    p5n0Var.b.put(Integer.valueOf(i), stickersRecommendationBlock.e);
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }
}
