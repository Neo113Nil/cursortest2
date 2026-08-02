package ru.ok.tracer.session;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.SystemStateSerializer;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;
import xsna.epx;
import xsna.pn00;

/* compiled from: SessionStateStorage.kt */
/* loaded from: classes11.dex */
public final class SessionStateStorageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Comparable<? super T>> int compareToNullLast(T t, T t2) {
        if (t == null && t2 == null) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SessionState> getSessionStates(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str) {
        String string = simpleFileKeyValueStorage.getString(str);
        if (string == null) {
            return EmptyList.b;
        }
        try {
            return SessionStatesSerializer.INSTANCE.fromJson(string);
        } catch (Exception unused) {
            return EmptyList.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemState getSystemState(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str) {
        String string = simpleFileKeyValueStorage.getString(str);
        if (string == null) {
            return null;
        }
        try {
            return SystemStateSerializer.INSTANCE.fromJson(string);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putSessionStates(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str, List<SessionState> list) {
        simpleFileKeyValueStorage.putString(str, SessionStatesSerializer.INSTANCE.toJson(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putSystemState(SimpleFileKeyValueStorage simpleFileKeyValueStorage, String str, SystemState systemState) {
        simpleFileKeyValueStorage.putString(str, SystemStateSerializer.INSTANCE.toJson(systemState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean update(Map<K, V> map, K k, V v) {
        if (epx.f(map.get(k), v)) {
            return false;
        }
        if (v != null) {
            map.put(k, v);
            return true;
        }
        map.remove(k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemState withPrevProperties(SystemState systemState, Map<String, String> map) {
        return map != null ? SystemState.copy$default(systemState, null, 0L, null, null, null, null, null, null, null, null, false, null, false, pn00.n(map, systemState.getProperties()), null, 24575, null) : systemState;
    }
}
