package com.yandex.go.transfer_requirement.experiment;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class p {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
