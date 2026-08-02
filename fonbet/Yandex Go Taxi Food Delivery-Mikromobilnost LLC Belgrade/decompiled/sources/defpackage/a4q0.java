package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class a4q0 implements z3q0 {
    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        if (str.equals("DivkitSection")) {
            return cvl.Companion.serializer();
        }
        return null;
    }
}
