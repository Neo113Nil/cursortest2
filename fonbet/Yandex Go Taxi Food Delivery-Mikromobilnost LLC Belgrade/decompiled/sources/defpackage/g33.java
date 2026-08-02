package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes13.dex */
public final class g33 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }
}
