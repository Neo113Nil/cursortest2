package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ClipsGridBlockBadge.kt */
/* loaded from: classes17.dex */
public final class vae {
    public final tlo0.h a;
    public final tlo0 b;

    public vae(tlo0.h hVar, tlo0.h hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public final boolean equals(Object obj) {
        Object valueOf = Integer.valueOf(R.drawable.vk_icon_market_12);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vae)) {
            return false;
        }
        vae vaeVar = (vae) obj;
        vaeVar.getClass();
        return valueOf.equals(valueOf) && this.a.equals(vaeVar.a) && epx.f(this.b, vaeVar.b);
    }

    public final int hashCode() {
        int c = u11.c(Integer.valueOf(R.drawable.vk_icon_market_12).hashCode() * 31, 31, this.a.a);
        tlo0 tlo0Var = this.b;
        return c + (tlo0Var == null ? 0 : tlo0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridBlockBadge(leftIcon=");
        sb.append(Integer.valueOf(R.drawable.vk_icon_market_12));
        sb.append(", middleText=");
        sb.append(this.a);
        sb.append(", rightText=");
        return bt.a(sb, this.b, ')');
    }
}
