package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes15.dex */
public final class drp0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
    }
}
