package xsna;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ObjectDescriptorFactory.java */
/* loaded from: classes13.dex */
public final class lp70 {
    public static final Logger a = Logger.getLogger(lp70.class.getName());
    public static final HashMap b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(o8l.class);
        hashSet.add(cyg0.class);
        hashSet.add(sc6.class);
        hashSet.add(scq.class);
        hashSet.add(kp70.class);
        hashSet.add(dyd0.class);
        hashSet.add(zx4.class);
        hashSet.add(wcq.class);
        hashSet.add(auo.class);
        hashSet.add(e8l.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            x2m x2mVar = (x2m) cls.getAnnotation(x2m.class);
            int[] tags = x2mVar.tags();
            int objectTypeIndication = x2mVar.objectTypeIndication();
            Map map = (Map) b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static sc6 a(int i, ByteBuffer byteBuffer) throws IOException {
        sc6 l4q0Var;
        int y = crx0.y(byteBuffer);
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(y));
        Logger logger = a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(y) + " found: " + cls);
            l4q0Var = new l4q0();
        } else {
            try {
                l4q0Var = (sc6) cls.newInstance();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + y, (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        l4q0Var.a = y;
        int e2 = crx0.e(byteBuffer.get());
        l4q0Var.b = e2 & 127;
        int i2 = 1;
        while ((e2 >>> 7) == 1) {
            e2 = crx0.e(byteBuffer.get());
            i2++;
            l4q0Var.b = (l4q0Var.b << 7) | (e2 & 127);
        }
        l4q0Var.c = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(l4q0Var.b);
        l4q0Var.d(slice);
        byteBuffer.position(byteBuffer.position() + l4q0Var.b);
        return l4q0Var;
    }
}
