package xsna;

import android.content.Context;
import com.vk.dto.common.Good;
import com.vkontakte.android.R;

/* compiled from: MarketFaveRouterImpl.kt */
/* loaded from: classes18.dex */
public final class ny00 {
    public final fy9 a;
    public final sz00 b;
    public final kz00 c;
    public final qdz d;
    public final dhc e;

    public ny00(fy9 fy9Var, sz00 sz00Var, kz00 kz00Var, qdz qdzVar, dhc dhcVar) {
        this.a = fy9Var;
        this.b = sz00Var;
        this.c = kz00Var;
        this.d = qdzVar;
        this.e = dhcVar;
    }

    public final void a(Context context, Good good) {
        this.b.f(context, good.c, context.getString(R.string.fave_market_write_to_owner_text), good);
    }
}
