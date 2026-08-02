package xsna;

import android.content.res.Resources;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.GeoDataSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishMarkersUseCase.kt */
/* loaded from: classes2.dex */
public final class xce0 {
    public final Resources a;
    public final pvj b;
    public final q6r c;
    public final nwf d;
    public final rpv e;
    public final lkt f;
    public final gbj g;
    public final ucy h;
    public final ucy i;
    public final ucy j;
    public final ucy k;
    public final ucy l;

    /* compiled from: PublishMarkersUseCase.kt */
    public static final class a {
        public final dgu a;
        public final Set<do00> b;
        public final Map<StringId, akt> c;
        public final zk3<StringId, VisibleStyle> d;
        public final jo00 e;

        public a() {
            throw null;
        }

        public a(dgu dguVar, el3 el3Var, Map map, zk3 zk3Var, jo00 jo00Var) {
            this.a = dguVar;
            this.b = el3Var;
            this.c = map;
            this.d = zk3Var;
            this.e = jo00Var;
        }
    }

    public xce0(Resources resources, pvj pvjVar, atm atmVar, m1o m1oVar, btm btmVar, q6r q6rVar, nwf nwfVar, rpv rpvVar, s1m s1mVar, mxj mxjVar, lkt lktVar, gbj gbjVar) {
        this.a = resources;
        this.b = pvjVar;
        this.c = q6rVar;
        this.d = nwfVar;
        this.e = rpvVar;
        this.f = lktVar;
        this.g = gbjVar;
        this.h = new ucy(atmVar);
        this.i = new ucy(m1oVar);
        this.j = new ucy(btmVar);
        this.k = new ucy(s1mVar);
        this.l = new ucy(mxjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(xce0 xce0Var, do00 do00Var, CameraBounds cameraBounds, tqg0 tqg0Var, zk3 zk3Var, ContinuationImpl continuationImpl) {
        yce0 yce0Var;
        int i;
        xce0Var.getClass();
        try {
            if (continuationImpl instanceof yce0) {
                yce0Var = (yce0) continuationImpl;
                int i2 = yce0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yce0Var.label = i2 - Integer.MIN_VALUE;
                    yce0 yce0Var2 = yce0Var;
                    Object obj = yce0Var2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = yce0Var2.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    kotlin.a.a(obj);
                    nwf nwfVar = xce0Var.d;
                    String str = do00Var != null ? do00Var.b : null;
                    y5u0 y5u0Var = (y5u0) xce0Var.l.b.invoke();
                    dgu dguVar = xce0Var.b().b().g;
                    yce0Var2.L$0 = null;
                    yce0Var2.L$1 = null;
                    yce0Var2.L$2 = null;
                    yce0Var2.L$3 = null;
                    yce0Var2.L$4 = null;
                    yce0Var2.label = 1;
                    Object a2 = nwf.a(nwfVar, y5u0Var, cameraBounds, null, tqg0Var, zk3Var, dguVar, str, yce0Var2, 4);
                    return a2 == coroutineSingletons ? coroutineSingletons : a2;
                }
            }
            if (i == 0) {
            }
        } finally {
        }
        yce0Var = new yce0(xce0Var, continuationImpl);
        yce0 yce0Var22 = yce0Var;
        Object obj2 = yce0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yce0Var22.label;
    }

    public final GeoDataSet b() {
        return (GeoDataSet) this.h.b.invoke();
    }
}
