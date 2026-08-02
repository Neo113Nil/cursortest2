package com.yandex.go.flex.common.api.actions;

import com.yandex.go.flex.common.api.actions.OpenWebAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class f0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OpenWebAction.AuthType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
