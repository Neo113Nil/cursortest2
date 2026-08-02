package xsna;

import com.vk.stat.model.DevNullEventKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: VkDevNullEventSampler.kt */
/* loaded from: classes11.dex */
public final class zpu0 {
    public static final LinkedHashMap d = pn00.m(new Pair(DevNullEventKey.PARALLEL_TASK_STATE.h(), Double.valueOf(0.5d)));
    public final boolean a;
    public final Map<String, Double> b;
    public final double c;

    public zpu0(double d2, Map map, boolean z) {
        this.a = z;
        this.b = map;
        this.c = d2;
    }
}
