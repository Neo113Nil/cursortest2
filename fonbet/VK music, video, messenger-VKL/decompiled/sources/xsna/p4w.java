package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersRecommendationBlock;
import java.util.Collection;
import java.util.List;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p4w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p4w(int i, Object obj, int i2) {
        this.b = i2;
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.hgm0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Attach a;
        pk30 pk30Var;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                com.vk.im.video.g gVar = (com.vk.im.video.g) obj2;
                if (i2 > 0) {
                    as30.a aVar = gVar.s;
                    as30 as30Var = as30.this;
                    bs30 bs30Var = as30Var.i;
                    if (bs30Var != null && (a = bs30Var.c.a()) != null && (pk30Var = as30Var.h) != null) {
                        pk30Var.r(a);
                    }
                } else {
                    qtd0 invoke = gVar.p.invoke();
                    if (invoke != null) {
                        as30.a aVar2 = gVar.s;
                        as30.a aVar3 = aVar2 != null ? aVar2 : null;
                        Peer B7 = invoke.B7();
                        pk30 pk30Var2 = as30.this.h;
                        if (pk30Var2 != null) {
                            pk30Var2.m(B7);
                        }
                    }
                }
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            case 2:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_questions_meta WHERE owner_id = ? AND story_id = ? LIMIT 1");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    return V0.step() ? new hgm0(new UserId(V0.getLong(egi.k(V0, "owner_id"))), (int) V0.getLong(egi.k(V0, "story_id")), (int) V0.getLong(egi.k(V0, "totalQuestionsCount"))) : null;
                } finally {
                    V0.close();
                }
            default:
                p5n0 p5n0Var = (p5n0) obj2;
                StickersRecommendationBlock stickersRecommendationBlock = (StickersRecommendationBlock) obj;
                List<StickerStockItemWithStickerId> list = stickersRecommendationBlock.d;
                if (list != null) {
                    p5n0Var.a.put(Integer.valueOf(i2), list);
                }
                String str = stickersRecommendationBlock.e;
                if (str != null) {
                    p5n0Var.b.put(Integer.valueOf(i2), str);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ p4w(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
