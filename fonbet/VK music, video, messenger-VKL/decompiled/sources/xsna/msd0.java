package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import xsna.ksd0;

/* compiled from: ProductTileCtaButtonDelegate.kt */
/* loaded from: classes18.dex */
public final class msd0 {
    @ozl
    public static final ksd0.b a(Good good) {
        long j = good.b;
        UserId userId = good.c;
        String str = good.d0;
        int i = good.x;
        Owner owner = good.M;
        return new ksd0.b(j, userId, str, i, owner != null ? owner.c : null, owner != null ? owner.g : null, good.d, good.n, good.h.e);
    }
}
