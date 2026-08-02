package xsna;

import com.vk.dto.stickers.bonus.StickersBonusReward;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: BonusCatalogAdapter.kt */
/* loaded from: classes5.dex */
public final class yj7 extends sxm implements vic {
    public final void J0(StickersBonusReward stickersBonusReward) {
        ArrayList arrayList = new ArrayList();
        for (hfz hfzVar : this.h) {
            if (hfzVar instanceof qk7) {
                qk7 qk7Var = (qk7) hfzVar;
                arrayList.add(new qk7(qk7Var.c, qk7Var.d, qk7Var.e, epx.f(qk7Var.c, stickersBonusReward)));
            } else {
                arrayList.add(hfzVar);
            }
        }
        setItems(arrayList);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }
}
