package xsna;

import android.content.Context;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;

/* compiled from: GoodCommentsClickListener.kt */
/* loaded from: classes18.dex */
public final class e4u {
    public final Context a;
    public final neg b;
    public Good c;
    public Boolean d;
    public final nwk e;

    public e4u(Context context, neg negVar, Good good, Boolean bool, nwk nwkVar) {
        this.a = context;
        this.b = negVar;
        this.c = good;
        this.d = bool;
        this.e = nwkVar;
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        UserId userId;
        Owner owner;
        this.e.invoke();
        Good good = this.c;
        if (good == null || (userId = good.c) == null) {
            userId = UserId.d;
        }
        long j = good != null ? good.b : 0L;
        String str = (good == null || (owner = good.M) == null) ? null : owner.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Boolean bool = this.d;
        boolean z2 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (z) {
            Good good2 = this.c;
            if (good2 != null ? good2.B : false) {
                z2 = true;
            }
        }
        this.b.a(new MarketItemCommentsArgs(userId, j, str2, booleanValue, z2), this.a);
    }
}
