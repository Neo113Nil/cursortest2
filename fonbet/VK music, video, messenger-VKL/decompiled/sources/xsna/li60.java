package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.lwq0;
import xsna.xh60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class li60 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ evg0 c;

    public /* synthetic */ li60(evg0 evg0Var, int i) {
        this.b = i;
        this.c = evg0Var;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        Parcelable parcelable;
        Object parcelable2;
        switch (this.b) {
            case 0:
                ni60 ni60Var = (ni60) this.c;
                ni60Var.c(new xh60.h.a((axl0) obj, ((qz60) ni60Var.b.getCurrentState()).f));
                break;
            default:
                dsq0 dsq0Var = (dsq0) this.c;
                Bundle bundle = (Bundle) obj;
                if (epx.f(bundle != null ? bundle.getString("type") : null, "wall")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = bundle.getParcelable("owner_id", UserId.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = bundle.getParcelable("owner_id");
                        if (!(parcelable3 instanceof UserId)) {
                            parcelable3 = null;
                        }
                        parcelable = (UserId) parcelable3;
                    }
                    UserId userId = (UserId) parcelable;
                    Long e = bo8.e(bundle, "item_id");
                    Integer valueOf = e != null ? Integer.valueOf((int) e.longValue()) : null;
                    if (userId != null && valueOf != null) {
                        dsq0Var.a(new lwq0.b.a(userId, valueOf.intValue()));
                        break;
                    }
                }
                break;
        }
    }
}
