package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Camera2CaptureRequestBuilder.java */
/* loaded from: classes11.dex */
public final class df9 {
    public static void a(CaptureRequest.Builder builder, androidx.camera.core.impl.o oVar) {
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        for (Map.Entry<Config.a<?>, Map<Config.OptionPriority, Object>> entry : oVar.s.tailMap(Config.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().b().startsWith("camera2.captureRequest.option.")) {
                break;
            }
            Config.a<?> key = entry.getKey();
            z.B(key, oVar.h(key), oVar.f(key));
        }
        androidx.camera.core.impl.o y = androidx.camera.core.impl.o.y(z);
        for (Config.a<?> aVar : y.e()) {
            CaptureRequest.Key key2 = (CaptureRequest.Key) aVar.c();
            try {
                builder.set(key2, y.f(aVar));
            } catch (IllegalArgumentException unused) {
                s100.a("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key2, null);
            }
        }
    }

    @Nullable
    public static CaptureRequest b(@NonNull androidx.camera.core.impl.f fVar, @Nullable CameraDevice cameraDevice, @NonNull HashMap hashMap) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        ArrayList arrayList = fVar.a;
        androidx.camera.core.impl.o oVar = fVar.b;
        TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> treeMap = oVar.s;
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) hashMap.get((DeferrableSurface) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList2.add(surface);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(fVar.c);
        a(createCaptureRequest, oVar);
        androidx.camera.core.impl.a aVar = androidx.camera.core.impl.f.g;
        if (treeMap.containsKey(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) oVar.f(aVar));
        }
        androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.f.h;
        if (treeMap.containsKey(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) oVar.f(aVar2)).byteValue()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            createCaptureRequest.addTarget((Surface) it2.next());
        }
        createCaptureRequest.setTag(fVar.f);
        return createCaptureRequest.build();
    }
}
