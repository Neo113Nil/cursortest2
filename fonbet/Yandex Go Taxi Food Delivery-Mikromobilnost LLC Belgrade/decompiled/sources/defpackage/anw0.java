package defpackage;

import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class anw0 {
    public static final StreamUseCase e = StreamUseCase.DEFAULT;
    public static final SurfaceConfig$ConfigSize[] f = {SurfaceConfig$ConfigSize.S720P_16_9, SurfaceConfig$ConfigSize.S1080P_4_3, SurfaceConfig$ConfigSize.S1080P_16_9, SurfaceConfig$ConfigSize.S1440P_16_9, SurfaceConfig$ConfigSize.UHD, SurfaceConfig$ConfigSize.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final SurfaceConfig$ConfigType a;
    public final SurfaceConfig$ConfigSize b;
    public final StreamUseCase c;
    public final int d;

    static {
        Map i = b.i(new Pair(SurfaceConfig$ConfigType.YUV, 35), new Pair(SurfaceConfig$ConfigType.JPEG, 256), new Pair(SurfaceConfig$ConfigType.JPEG_R, Integer.valueOf(Constants.INTENT_CONTAINER_ID)), new Pair(SurfaceConfig$ConfigType.RAW, 32), new Pair(SurfaceConfig$ConfigType.PRIV, 34));
        g = i;
        Set<Map.Entry> entrySet = i.entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (SurfaceConfig$ConfigType) entry.getKey());
        }
        h = linkedHashMap;
    }

    public anw0(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, StreamUseCase streamUseCase) {
        this.a = surfaceConfig$ConfigType;
        this.b = surfaceConfig$ConfigSize;
        this.c = streamUseCase;
        Integer num = (Integer) g.get(surfaceConfig$ConfigType);
        this.d = num != null ? num.intValue() : 0;
    }

    public static final anw0 a(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize) {
        return new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize, e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anw0)) {
            return false;
        }
        anw0 anw0Var = (anw0) obj;
        return this.a == anw0Var.a && this.b == anw0Var.b && this.c == anw0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
