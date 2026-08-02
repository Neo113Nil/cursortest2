package com.yandex.div.state;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: InMemoryDivStateCache.kt */
/* loaded from: classes7.dex */
public final class InMemoryDivStateCache implements DivStateCache {
    private final Map<Pair<String, String>, String> states = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, String> rootStates = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.DivStateCache
    public String getRootState(String str) {
        return this.rootStates.get(str);
    }

    @Override // com.yandex.div.state.DivStateCache
    public String getState(String str, String str2) {
        return this.states.get(new Pair(str, str2));
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putRootState(String str, String str2) {
        this.rootStates.put(str, str2);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putState(String str, String str2, String str3) {
        this.states.put(new Pair<>(str, str2), str3);
    }
}
