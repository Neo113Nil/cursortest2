package ru.ok.android.externcalls.sdk.api.session;

import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.zcl;

/* compiled from: InMemorySessionStore.kt */
/* loaded from: classes9.dex */
public final class InMemorySessionStore implements ApiSessionStore {
    private ApiSessionStore.SessionInfo sessionInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public InMemorySessionStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // ru.ok.android.sdk.api.session.ApiSessionStore
    public ApiSessionStore.SessionInfo getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // ru.ok.android.sdk.api.session.ApiSessionStore
    public void setSessionInfo(ApiSessionStore.SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public InMemorySessionStore(ApiSessionStore.SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public /* synthetic */ InMemorySessionStore(ApiSessionStore.SessionInfo sessionInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : sessionInfo);
    }
}
