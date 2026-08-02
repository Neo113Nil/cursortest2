package defpackage;

import flex.feature.sections.action.ScrollPositionSurrogate;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class hip0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScrollPositionSurrogate.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
