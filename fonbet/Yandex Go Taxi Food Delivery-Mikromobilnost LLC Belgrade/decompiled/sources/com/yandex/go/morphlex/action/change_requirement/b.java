package com.yandex.go.morphlex.action.change_requirement;

import com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChangeRequirementAction.Operation.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
