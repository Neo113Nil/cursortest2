package defpackage;

import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ja6 {
    public static BoostStrategy a(String str) {
        Object obj;
        Iterator<E> it = BoostStrategy.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((BoostStrategy) obj).getRaw(), str)) {
                break;
            }
        }
        return (BoostStrategy) obj;
    }
}
