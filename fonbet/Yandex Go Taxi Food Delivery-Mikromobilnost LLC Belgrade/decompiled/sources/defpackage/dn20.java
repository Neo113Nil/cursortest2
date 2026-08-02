package defpackage;

import com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldn20;", "", "Companion", "bn20", "cn20", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class dn20 {
    public static final cn20 Companion = new cn20();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new g320(29))};
    public final MobContourAvailabilityCheckStrategyName a;

    public /* synthetic */ dn20(int i, MobContourAvailabilityCheckStrategyName mobContourAvailabilityCheckStrategyName) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mobContourAvailabilityCheckStrategyName;
        }
    }

    public static final /* synthetic */ void c(dn20 dn20Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && dn20Var.a == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 0, (KSerializer) b[0].getValue(), dn20Var.a);
    }

    /* renamed from: b, reason: from getter */
    public final MobContourAvailabilityCheckStrategyName getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn20) && this.a == ((dn20) obj).a;
    }

    public final int hashCode() {
        MobContourAvailabilityCheckStrategyName mobContourAvailabilityCheckStrategyName = this.a;
        if (mobContourAvailabilityCheckStrategyName == null) {
            return 0;
        }
        return mobContourAvailabilityCheckStrategyName.hashCode();
    }

    public final String toString() {
        return "MobContourAvailabilityCheckStrategy(name=" + this.a + Extension.C_BRAKE;
    }

    public dn20() {
        this.a = null;
    }
}
