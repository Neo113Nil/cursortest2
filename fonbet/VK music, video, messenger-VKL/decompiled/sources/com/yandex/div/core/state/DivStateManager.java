package com.yandex.div.core.state;

import com.yandex.div.DivDataTag;
import com.yandex.div.state.DivStateCache;
import xsna.epx;
import xsna.s3q0;
import xsna.zk3;

/* compiled from: DivStateManager.kt */
/* loaded from: classes7.dex */
public final class DivStateManager {
    private final DivStateCache cache;
    private final zk3<DivDataTag, DivViewState> states = new zk3<>();
    private final TemporaryDivStateCache temporaryCache;

    public DivStateManager(DivStateCache divStateCache, TemporaryDivStateCache temporaryDivStateCache) {
        this.cache = divStateCache;
        this.temporaryCache = temporaryDivStateCache;
    }

    public final DivViewState getState(DivDataTag divDataTag) {
        DivViewState divViewState;
        synchronized (this.states) {
            try {
                divViewState = this.states.get(divDataTag);
                if (divViewState == null) {
                    String rootState = this.cache.getRootState(divDataTag.getId());
                    divViewState = rootState != null ? new DivViewState(Long.parseLong(rootState)) : null;
                    this.states.put(divDataTag, divViewState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return divViewState;
    }

    public final void updateState(DivDataTag divDataTag, long j, boolean z) {
        if (epx.f(DivDataTag.INVALID, divDataTag)) {
            return;
        }
        synchronized (this.states) {
            try {
                DivViewState state = getState(divDataTag);
                this.states.put(divDataTag, state == null ? new DivViewState(j) : new DivViewState(j, state.getBlockStates()));
                this.temporaryCache.putRootState(divDataTag.getId(), String.valueOf(j));
                if (!z) {
                    this.cache.putRootState(divDataTag.getId(), String.valueOf(j));
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateStates(String str, DivStatePath divStatePath, boolean z) {
        String pathToLastState = divStatePath.getPathToLastState();
        String lastStateId = divStatePath.getLastStateId();
        if (pathToLastState == null || lastStateId == null) {
            return;
        }
        synchronized (this.states) {
            try {
                this.temporaryCache.putState(str, pathToLastState, lastStateId);
                if (!z) {
                    this.cache.putState(str, pathToLastState, lastStateId);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
