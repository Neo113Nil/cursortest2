package ru.ok.tracer.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SimpleFileKeyValueStorage.kt */
/* loaded from: classes9.dex */
public final class SimpleFileKeyValueStorageKt {
    private static final <K, V> void update(AtomicReference<Map<K, V>> atomicReference, izs<? super Map<K, V>, s3q0> izsVar) {
        while (true) {
            Map<K, V> map = atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            izsVar.invoke(linkedHashMap);
            while (!atomicReference.compareAndSet(map, linkedHashMap)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
            return;
        }
    }
}
