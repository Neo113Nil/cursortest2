package defpackage;

import com.yandex.go.sdk_registry.runtime.a;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes13.dex */
public final class hdi0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((a) ((Map.Entry) obj).getValue()).a.b.getPriority()).compareTo(Integer.valueOf(((a) ((Map.Entry) obj2).getValue()).a.b.getPriority()));
    }
}
