package com.ybsdk.feature.pin.api.entities;

import com.ybsdk.feature.pin.api.entities.StartSessionState;

/* loaded from: classes3.dex */
public final class h extends StartSessionState {
    public final ReissueActionType a;
    public final StartSessionState.Action b;

    public h(ReissueActionType reissueActionType, StartSessionState.Action action) {
        super(null, null, 3, null);
        this.a = reissueActionType;
        this.b = action;
    }

    @Override // com.ybsdk.feature.pin.api.entities.StartSessionState
    public final StartSessionState.Action getSessionStateAction() {
        return this.b;
    }
}
