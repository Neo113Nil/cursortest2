package defpackage;

import com.yandex.go.ridetech.locationsdk.experiment.dto.OnJumpOrDivergenceSimpleDto;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public abstract class aru0 {
    public static final fz60 a(OnJumpOrDivergenceSimpleDto.ReachabilityDto reachabilityDto) {
        double a = reachabilityDto.getA();
        o430 o430Var = e3n.b;
        return new fz60(a, kp50.V(reachabilityDto.getB(), DurationUnit.MILLISECONDS), reachabilityDto.getC());
    }

    public static final LinkedHashSet b(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                str = null;
            }
            q6z q6zVar = str != null ? new q6z(str) : null;
            if (q6zVar != null) {
                linkedHashSet.add(q6zVar);
            }
        }
        return linkedHashSet;
    }
}
