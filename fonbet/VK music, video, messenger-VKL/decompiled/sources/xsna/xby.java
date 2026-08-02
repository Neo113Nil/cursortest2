package xsna;

import java.util.function.ToIntFunction;
import javax.security.auth.x500.X500Principal;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xby implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((X500Principal) obj).getEncoded().length;
    }
}
