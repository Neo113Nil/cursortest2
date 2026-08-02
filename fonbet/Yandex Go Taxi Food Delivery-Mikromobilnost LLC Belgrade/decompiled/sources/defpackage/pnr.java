package defpackage;

import com.yandex.go.flex.common.FlexibleGridVersion;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class pnr {
    public static FlexibleGridVersion a(String str) {
        Object obj;
        FlexibleGridVersion flexibleGridVersion;
        Iterator<E> it = FlexibleGridVersion.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((FlexibleGridVersion) obj).getRawValue(), str)) {
                break;
            }
        }
        FlexibleGridVersion flexibleGridVersion2 = (FlexibleGridVersion) obj;
        if (flexibleGridVersion2 != null) {
            return flexibleGridVersion2;
        }
        flexibleGridVersion = FlexibleGridVersion.DEFAULT;
        return flexibleGridVersion;
    }
}
