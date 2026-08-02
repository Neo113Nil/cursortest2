package yads;

import com.yandex.mobile.ads.rewarded.Reward;
import xsna.epx;

/* loaded from: classes10.dex */
public final class av3 implements Reward {
    public final qr2 a;

    public av3(qr2 qr2Var) {
        this.a = qr2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof av3) && epx.f(((av3) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
