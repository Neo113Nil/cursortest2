package defpackage;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lam20;", "", "Companion", "yl20", "zl20", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class am20 {
    public static final zl20 Companion = new zl20();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new g110(25))};
    public final MobAvailabilityCheckStrategyName a;

    public /* synthetic */ am20(int i, MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mobAvailabilityCheckStrategyName;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am20) && this.a == ((am20) obj).a;
    }

    public final int hashCode() {
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = this.a;
        if (mobAvailabilityCheckStrategyName == null) {
            return 0;
        }
        return mobAvailabilityCheckStrategyName.hashCode();
    }

    public final String toString() {
        return "MobAvailabilityCheckStrategy(name=" + this.a + Extension.C_BRAKE;
    }

    public am20() {
        this(null);
    }

    public am20(MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName) {
        this.a = mobAvailabilityCheckStrategyName;
    }
}
