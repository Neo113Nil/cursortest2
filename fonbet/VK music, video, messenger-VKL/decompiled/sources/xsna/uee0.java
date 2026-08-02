package xsna;

import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PublishTransaction.kt */
/* loaded from: classes2.dex */
public final class uee0 {
    public static final AtomicInteger d = new AtomicInteger(0);
    public final CameraBounds a;
    public final Map<StringId, do00> b;
    public final Object c;

    /* compiled from: PublishTransaction.kt */
    public static final class a {
        public static uee0 a(CameraBounds cameraBounds, Map map, Object obj) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"count = " + uee0.d.incrementAndGet()});
            }
            return new uee0(cameraBounds, map, obj);
        }
    }

    public uee0() {
        throw null;
    }

    public uee0(CameraBounds cameraBounds, Map map, Object obj) {
        this.a = cameraBounds;
        this.b = map;
        this.c = obj;
    }
}
