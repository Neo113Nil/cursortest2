package com.yandex.go.flex.main_screen.actions;

import com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SdcRouteSelectionAction.ScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
