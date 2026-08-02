package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class ow5 implements dtq0 {
    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        if (str.equals("SyncBindingMethod")) {
            return g0x0.Companion.serializer();
        }
        if (str.equals("AsyncBindingMethod")) {
            return y93.Companion.serializer();
        }
        return null;
    }
}
