package xsna;

import android.os.Bundle;
import com.vk.log.L;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CameraRequestsStorage.kt */
/* loaded from: classes17.dex */
public final class ll9 {
    public static final AtomicInteger a = new AtomicInteger(1000);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    public static final void a(Bundle bundle) {
        ConcurrentHashMap concurrentHashMap = c;
        L.e("CameraRequestsStorage", "onRestoreState");
        try {
            int i = bundle.getInt("REQUEST_ID", 1000);
            AtomicInteger atomicInteger = a;
            if (atomicInteger.get() != 1000 || atomicInteger.get() == i) {
                return;
            }
            ConcurrentHashMap concurrentHashMap2 = b;
            if (concurrentHashMap2.isEmpty() && concurrentHashMap.isEmpty()) {
                atomicInteger.set(i);
                Serializable serializable = bundle.getSerializable("CAMERA_FILES_MAP");
                HashMap hashMap = serializable instanceof HashMap ? (HashMap) serializable : null;
                if (hashMap != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(hashMap.size()));
                    for (Object obj : hashMap.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), new File((String) ((Map.Entry) obj).getValue()));
                    }
                    concurrentHashMap2.putAll(linkedHashMap);
                }
                Serializable serializable2 = bundle.getSerializable("REQUEST_TYPES_MAP");
                HashMap hashMap2 = serializable2 instanceof HashMap ? (HashMap) serializable2 : null;
                if (hashMap2 != null) {
                    concurrentHashMap.putAll(hashMap2);
                }
                L.e("CameraRequestsStorage", "data restored after process kill");
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    public static final void b(Bundle bundle) {
        L.e("CameraRequestsStorage", "onSaveState");
        try {
            AtomicInteger atomicInteger = a;
            if (atomicInteger.get() == 1000) {
                return;
            }
            bundle.putInt("REQUEST_ID", atomicInteger.get());
            ConcurrentHashMap concurrentHashMap = b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(concurrentHashMap.size()));
            for (Object obj : concurrentHashMap.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), ((File) ((Map.Entry) obj).getValue()).getPath());
            }
            bundle.putSerializable("CAMERA_FILES_MAP", new HashMap(linkedHashMap));
            bundle.putSerializable("REQUEST_TYPES_MAP", new HashMap(c));
            L.e("CameraRequestsStorage", "data saved");
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }
}
