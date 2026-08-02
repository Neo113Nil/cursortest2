package xsna;

import kotlin.collections.builders.MapBuilder;
import kotlin.uuid.Uuid;
import xsna.zno;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class pbd0 {
    public static final MapBuilder a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(fpf0.a(String.class), oqm0.a);
        mapBuilder.put(fpf0.a(Character.TYPE), zlb.a);
        mapBuilder.put(fpf0.a(char[].class), plb.c);
        mapBuilder.put(fpf0.a(Double.TYPE), v6o.a);
        mapBuilder.put(fpf0.a(double[].class), y5o.c);
        mapBuilder.put(fpf0.a(Float.TYPE), mqr.a);
        mapBuilder.put(fpf0.a(float[].class), dqr.c);
        mapBuilder.put(fpf0.a(Long.TYPE), u500.a);
        mapBuilder.put(fpf0.a(long[].class), d300.c);
        mapBuilder.put(fpf0.a(oxp0.class), sxp0.a);
        mapBuilder.put(fpf0.a(Integer.TYPE), n9x.a);
        mapBuilder.put(fpf0.a(int[].class), u8x.c);
        mapBuilder.put(fpf0.a(jxp0.class), nxp0.a);
        mapBuilder.put(fpf0.a(Short.TYPE), qfj0.a);
        mapBuilder.put(fpf0.a(short[].class), ofj0.c);
        mapBuilder.put(fpf0.a(vxp0.class), zxp0.a);
        mapBuilder.put(fpf0.a(Byte.TYPE), iu8.a);
        mapBuilder.put(fpf0.a(byte[].class), wt8.c);
        mapBuilder.put(fpf0.a(uvp0.class), yvp0.a);
        mapBuilder.put(fpf0.a(Boolean.TYPE), g18.a);
        mapBuilder.put(fpf0.a(boolean[].class), d18.c);
        rfc a2 = fpf0.a(s3q0.class);
        s3q0 s3q0Var = s3q0.a;
        mapBuilder.put(a2, x3q0.b);
        mapBuilder.put(fpf0.a(Void.class), k770.a);
        try {
            rfc a3 = fpf0.a(zno.class);
            zno.a aVar = zno.c;
            mapBuilder.put(a3, goo.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(fpf0.a(pxp0.class), rxp0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(fpf0.a(kxp0.class), mxp0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(fpf0.a(wxp0.class), yxp0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(fpf0.a(vvp0.class), xvp0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(fpf0.a(Uuid.class), g4r0.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = mapBuilder.h();
    }
}
