package defpackage;

import flex.engine.section.model.Side;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class mas0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Side.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
