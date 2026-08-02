package xsna;

import java.util.Map;
import java.util.function.ToIntFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class iqy0 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return ((String) entry.getValue()).length() + ((String) entry.getKey()).length();
    }
}
