package defpackage;

import com.yandex.go.tariffcard.experiment.GradientTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class nzt {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = GradientTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
