package defpackage;

import android.os.Build;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes10.dex */
public abstract class oru0 {
    public static final x34 a = new x34("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final MapBuilder b;
    public static final MapBuilder c;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType = UseCaseConfigFactory$CaptureType.PREVIEW;
            UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType2 = UseCaseConfigFactory$CaptureType.METERING_REPEATING;
            UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType3 = UseCaseConfigFactory$CaptureType.IMAGE_ANALYSIS;
            mapBuilder.put(4L, j73.f0(new UseCaseConfigFactory$CaptureType[]{useCaseConfigFactory$CaptureType, useCaseConfigFactory$CaptureType2, useCaseConfigFactory$CaptureType3}));
            mapBuilder.put(1L, j73.f0(new UseCaseConfigFactory$CaptureType[]{useCaseConfigFactory$CaptureType, useCaseConfigFactory$CaptureType2, useCaseConfigFactory$CaptureType3}));
            mapBuilder.put(2L, Collections.singleton(UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE));
            mapBuilder.put(3L, Collections.singleton(UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE));
        }
        b = mapBuilder.j();
        MapBuilder mapBuilder2 = new MapBuilder();
        if (i >= 33) {
            UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType4 = UseCaseConfigFactory$CaptureType.PREVIEW;
            UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType5 = UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE;
            UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType6 = UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE;
            mapBuilder2.put(4L, j73.f0(new UseCaseConfigFactory$CaptureType[]{useCaseConfigFactory$CaptureType4, useCaseConfigFactory$CaptureType5, useCaseConfigFactory$CaptureType6}));
            mapBuilder2.put(3L, j73.f0(new UseCaseConfigFactory$CaptureType[]{useCaseConfigFactory$CaptureType4, useCaseConfigFactory$CaptureType6}));
        }
        c = mapBuilder2.j();
    }

    public static wn7 a(szd szdVar, Long l) {
        x34 x34Var = a;
        if (szdVar.d(x34Var) && jl40.l(szdVar.f(x34Var), l)) {
            return null;
        }
        yy40 p = yy40.p(szdVar);
        p.w(x34Var, l);
        return new wn7(p);
    }

    public static boolean b(UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (useCaseConfigFactory$CaptureType != UseCaseConfigFactory$CaptureType.STREAM_SHARING) {
            Long valueOf = Long.valueOf(j);
            MapBuilder mapBuilder = b;
            return mapBuilder.containsKey(valueOf) && ((Set) mapBuilder.get(Long.valueOf(j))).contains(useCaseConfigFactory$CaptureType);
        }
        Long valueOf2 = Long.valueOf(j);
        MapBuilder mapBuilder2 = c;
        if (!mapBuilder2.containsKey(valueOf2)) {
            return false;
        }
        Set set = (Set) mapBuilder2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((UseCaseConfigFactory$CaptureType) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(szd szdVar, UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType) {
        if (((Boolean) szdVar.g(xi21.r4, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        x34 x34Var = x8v.b;
        return szdVar.d(x34Var) && glb1.c(useCaseConfigFactory$CaptureType, ((Number) szdVar.f(x34Var)).intValue()) == 5;
    }
}
