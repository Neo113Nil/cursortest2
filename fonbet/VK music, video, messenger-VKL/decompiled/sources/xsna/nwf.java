package xsna;

import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClusterAlgorithm.kt */
/* loaded from: classes2.dex */
public final class nwf {
    public final f2p0 a;
    public final a b;
    public final crv c;
    public final int d;
    public final float e;
    public final int[] f;
    public final String g;

    /* compiled from: ClusterAlgorithm.kt */
    public static final class b implements Comparator {
        public final /* synthetic */ wzs b;

        public b(wzs wzsVar) {
            this.b = wzsVar;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Number) this.b.invoke(obj, obj2)).intValue();
        }
    }

    public nwf(String str, f2p0 f2p0Var, a aVar, crv crvVar, float f) {
        int a2 = iah0.a(2);
        this.a = f2p0Var;
        this.b = aVar;
        this.c = crvVar;
        this.d = a2;
        this.e = f;
        this.f = new int[]{VisibleStyle.M(67108868), 67108868, 33554434};
        String concat = str.concat("/ClusterAlgorithm");
        this.g = concat;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{concat, "defaultFillStrategy = null"});
    }

    public static Object a(nwf nwfVar, y5u0 y5u0Var, CameraBounds cameraBounds, ArrayList arrayList, tqg0 tqg0Var, zk3 zk3Var, dgu dguVar, String str, ContinuationImpl continuationImpl, int i) {
        ArrayList arrayList2 = (i & 4) != 0 ? null : arrayList;
        tqg0 tqg0Var2 = (i & 8) != 0 ? null : tqg0Var;
        dgu dguVar2 = (i & 32) != 0 ? null : dguVar;
        String str2 = (i & 64) != 0 ? null : str;
        nwfVar.getClass();
        return zvj.d(new qwf(arrayList2, tqg0Var2, nwfVar, dguVar2, str2, cameraBounds, y5u0Var, zk3Var, null), continuationImpl);
    }

    /* compiled from: ClusterAlgorithm.kt */
    public interface a {
        BoundingBox a(int i, BoundingBox boundingBox, String str);

        float b(BoundingBox boundingBox);

        int f(int i, atx0 atx0Var, atx0 atx0Var2);

        default void c() {
        }

        default void d() {
        }

        default int e(int i, String str) {
            return i;
        }
    }
}
