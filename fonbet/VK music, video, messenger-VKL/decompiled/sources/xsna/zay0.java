package xsna;

import java.util.Map;
import java.util.function.ToIntFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class zay0 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) ((Map.Entry) obj).getKey()).intValue();
    }
}
