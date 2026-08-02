package ru.ok.android.onelog;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OneLogSessionEventNumbering.kt */
/* loaded from: classes9.dex */
public final class OneLogSessionEventNumbering {
    private static final String EVENT_NUMBER_PARAM_NAME = "event_number";
    private static final int INITIAL_EVENT_NUMBER = 1;
    public static final OneLogSessionEventNumbering INSTANCE = new OneLogSessionEventNumbering();
    private static final HashMap<String, AtomicInteger> vsidEventNumbers = new HashMap<>();

    private OneLogSessionEventNumbering() {
    }

    private final int getEventNumberFor(String str) {
        str.length();
        synchronized (this) {
            HashMap<String, AtomicInteger> hashMap = vsidEventNumbers;
            AtomicInteger atomicInteger = hashMap.get(str);
            if (atomicInteger == null) {
                hashMap.put(str, new AtomicInteger(1));
                return 1;
            }
            return atomicInteger.incrementAndGet();
        }
    }

    public final Map<String, Object> updateEventNumberFor(String str, Map<String, ? extends Object> map) {
        int eventNumberFor = getEventNumberFor(str);
        map.get(EVENT_NUMBER_PARAM_NAME);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(EVENT_NUMBER_PARAM_NAME, Integer.valueOf(eventNumberFor));
        return linkedHashMap;
    }
}
