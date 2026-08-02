package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class guw {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InterpolationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
