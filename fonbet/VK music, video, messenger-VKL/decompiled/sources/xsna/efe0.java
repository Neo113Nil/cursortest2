package xsna;

import android.content.res.Resources;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.GeoDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.nwf;
import xsna.xce0;

/* compiled from: Publisher.kt */
/* loaded from: classes2.dex */
public final class efe0 implements nwf.a {
    public final yvj a;
    public final pvj b;
    public final rpv c;
    public final m8 d;
    public final b5h e;
    public final clh f;
    public final nh0 g;
    public final ucy i;
    public final ucy j;
    public final ucy k;
    public final qee0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final kotlin.coroutines.d h = new vvj("geo_publish_markers").plus(bdn.b.T(1));
    public final AtomicReference<BoundingBox> l = new AtomicReference<>(null);
    public final bpn0 m = new bpn0(afe0.b);
    public final bpn0 q = new bpn0(new io60(this, 18));
    public final AtomicReference<eyx> r = new AtomicReference<>(null);

    public efe0(hpj hpjVar, mkt mktVar, final float f, final Resources resources, final atm atmVar, final m1o m1oVar, final btm btmVar, final tbh tbhVar, final q6r q6rVar, rpv rpvVar, final s1m s1mVar, final mxj mxjVar, final lkt lktVar, final gbj gbjVar, m8 m8Var, b5h b5hVar, clh clhVar, nh0 nh0Var) {
        this.a = hpjVar;
        this.b = mktVar;
        this.c = rpvVar;
        this.d = m8Var;
        this.e = b5hVar;
        this.f = clhVar;
        this.g = nh0Var;
        this.i = new ucy(atmVar);
        this.j = new ucy(tbhVar);
        this.k = new ucy(s1mVar);
        this.n = new qee0(atmVar, f);
        this.o = new bpn0(new gzs() { // from class: xsna.yee0
            @Override // xsna.gzs
            public final Object invoke() {
                f2p0 f2p0Var = new f2p0(tbh.this);
                efe0 efe0Var = this;
                return new nwf("Publisher", f2p0Var, efe0Var, efe0Var.c.f.c, f);
            }
        });
        this.p = new bpn0(new gzs() { // from class: xsna.zee0
            @Override // xsna.gzs
            public final Object invoke() {
                efe0 efe0Var = this;
                return new xce0(resources, efe0Var.b, atmVar, m1oVar, btmVar, q6rVar, (nwf) efe0Var.o.getValue(), efe0Var.c, s1mVar, mxjVar, lktVar, gbjVar);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(efe0 efe0Var, Object obj, CameraBounds cameraBounds, Map map, boolean z, ContinuationImpl continuationImpl) {
        bfe0 bfe0Var;
        int i;
        CameraBounds cameraBounds2;
        xce0.a aVar;
        efe0Var.getClass();
        if (continuationImpl instanceof bfe0) {
            bfe0Var = (bfe0) continuationImpl;
            int i2 = bfe0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bfe0Var.label = i2 - Integer.MIN_VALUE;
                bfe0 bfe0Var2 = bfe0Var;
                Object obj2 = bfe0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bfe0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    L l = L.a;
                    l.getClass();
                    LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"publish:execute before " + efe0Var.h().a()});
                    }
                    if (obj != efe0Var.h().b()) {
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l, L.LogType.w, new Object[]{"publish:execute dataset is changed before work"});
                        }
                        return s3q0.a;
                    }
                    xf9.d(xf9.e, cameraBounds, efe0Var);
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"new.size = " + map.size() + " cameraBounds = " + cameraBounds});
                    }
                    do00 do00Var = (do00) efe0Var.k.b.invoke();
                    Map map2 = ttp0.g(map) ? map : null;
                    if (map2 == null) {
                        map2 = map.size() >= 1000 ? new HashMap(map.size()) : new zk3(map.size());
                        map2.putAll(map);
                    }
                    if (do00Var != null) {
                        map2.put(new StringId(do00Var.b), do00Var);
                    }
                    qee0 qee0Var = efe0Var.n;
                    qee0Var.getClass();
                    atm atmVar = qee0Var.a;
                    boolean z2 = map2.isEmpty() || pn00.h(j5g.X(map2.keySet()), map2) == do00Var;
                    ZoomLevel zoomLevel = qee0Var.c;
                    if ((z || !z2) && zoomLevel != null && zoomLevel.b - cameraBounds.F0() > qee0Var.b) {
                        L.e("clear rtree and gridResult");
                        ((com.vk.geo.impl.presentation.b) atmVar.c).s.b().f = null;
                        ((com.vk.geo.impl.presentation.b) atmVar.c).s.b().g = null;
                    }
                    qee0Var.c = new ZoomLevel(cameraBounds.F0());
                    EmptySet emptySet = EmptySet.b;
                    xce0 xce0Var = (xce0) efe0Var.p.getValue();
                    clh clhVar = efe0Var.f;
                    bfe0Var2.L$0 = obj;
                    bfe0Var2.L$1 = cameraBounds;
                    bfe0Var2.L$2 = null;
                    bfe0Var2.L$3 = null;
                    bfe0Var2.L$4 = null;
                    bfe0Var2.L$5 = null;
                    bfe0Var2.Z$0 = z;
                    bfe0Var2.label = 1;
                    xce0Var.getClass();
                    obj2 = zvj.d(new zce0(xce0Var, map2, cameraBounds, emptySet, clhVar, null), bfe0Var2);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cameraBounds2 = cameraBounds;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CameraBounds cameraBounds3 = (CameraBounds) bfe0Var2.L$1;
                    Object obj3 = bfe0Var2.L$0;
                    kotlin.a.a(obj2);
                    cameraBounds2 = cameraBounds3;
                    obj = obj3;
                }
                aVar = (xce0.a) obj2;
                if (aVar != null) {
                    L.G("publish result is null!");
                    return s3q0.a;
                }
                Map<StringId, akt> map3 = aVar.c;
                if (obj != efe0Var.h().b()) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.w, new Object[]{"publish:execute dataset is changed after work"});
                    }
                    return s3q0.a;
                }
                Set<StringId> keySet = efe0Var.h().b().b.keySet();
                Set l3 = bis.l(map3.size());
                Iterator<Map.Entry<StringId, akt>> it = map3.entrySet().iterator();
                while (it.hasNext()) {
                    l3.add(new StringId(it.next().getKey().b));
                }
                if (!keySet.containsAll(l3)) {
                    L l4 = L.a;
                    l4.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l4, L.LogType.w, new Object[]{"publish:execute seems like data set changed before publishing"});
                    }
                }
                GeoDataSet h = efe0Var.h();
                dgu dguVar = aVar.a;
                Set<do00> set = aVar.b;
                zk3<StringId, VisibleStyle> zk3Var = aVar.d;
                h.b().g = dguVar;
                h.b().a = set;
                h.b().d = map3;
                h.b().e = zk3Var;
                L l5 = L.a;
                l5.getClass();
                LoggerOutputTarget loggerOutputTarget2 = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget2)) {
                    L.u(l5, L.LogType.d, new Object[]{"publish:execute after " + efe0Var.h().a()});
                }
                xf9 xf9Var = xf9.e;
                xf9Var.g(cameraBounds2, efe0Var);
                if (!L.m(loggerOutputTarget2)) {
                    L.u(l5, L.LogType.d, new Object[]{xf9Var});
                }
                L.d(new g13(21));
                efe0Var.e.invoke(aVar);
                return s3q0.a;
            }
        }
        bfe0Var = new bfe0(efe0Var, continuationImpl);
        bfe0 bfe0Var22 = bfe0Var;
        Object obj22 = bfe0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bfe0Var22.label;
        if (i != 0) {
        }
        aVar = (xce0.a) obj22;
        if (aVar != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, xsna.do00, xsna.elb0] */
    @Override // xsna.nwf.a
    public final BoundingBox a(int i, BoundingBox boundingBox, String str) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = h().b().b.get(new StringId(str));
        ?? r3 = (do00) this.k.b.invoke();
        if (ref$ObjectRef.element == 0) {
            String str2 = r3 != 0 ? r3.b : null;
            if (str2 == null ? false : str.equals(str2)) {
                ref$ObjectRef.element = r3;
            }
        }
        ((Number) this.j.b.invoke()).floatValue();
        float floatValue = ((Number) this.d.invoke(boundingBox)).floatValue();
        if ((floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || ref$ObjectRef.element == 0 || h().b().c.containsKey(new StringId(str))) {
            L.F(new n0(24, str, ref$ObjectRef));
            return BoundingBox.e;
        }
        x7k x7kVar = (x7k) this.m.getValue();
        do00 do00Var = (do00) ref$ObjectRef.element;
        x7kVar.getClass();
        String str3 = do00Var.b;
        long j = do00Var.k;
        return x7k.a(x7kVar, str3, this.c, i, Coordinate.e(j), Coordinate.f(j), floatValue, VisibleStyle.f(i) && do00Var.m.length() > 0, VisibleStyle.e(i), true, do00Var.m, 256);
    }

    @Override // xsna.nwf.a
    public final float b(BoundingBox boundingBox) {
        return ((Number) this.d.invoke(boundingBox)).floatValue();
    }

    @Override // xsna.nwf.a
    public final void c() {
        this.n.getClass();
    }

    @Override // xsna.nwf.a
    public final void d() {
        this.n.getClass();
    }

    @Override // xsna.nwf.a
    public final int f(int i, atx0 atx0Var, atx0 atx0Var2) {
        double d;
        double d2 = -1.7976931348623157E308d;
        if (atx0Var instanceof do00) {
            d = ((do00) atx0Var).e.a(i);
        } else {
            if (atx0Var != null) {
                do00 do00Var = h().b().b.get(new StringId(atx0Var.a()));
                Double valueOf = do00Var != null ? Double.valueOf(do00Var.e.a(i)) : null;
                if (valueOf != null) {
                    d = valueOf.doubleValue();
                }
            }
            d = -1.7976931348623157E308d;
        }
        if (atx0Var2 instanceof do00) {
            d2 = ((do00) atx0Var2).e.a(i);
        } else if (atx0Var2 != null) {
            do00 do00Var2 = h().b().b.get(new StringId(atx0Var2.a()));
            Double valueOf2 = do00Var2 != null ? Double.valueOf(do00Var2.e.a(i)) : null;
            if (valueOf2 != null) {
                d2 = valueOf2.doubleValue();
            }
        }
        do00 do00Var3 = (do00) this.k.b.invoke();
        String str = do00Var3 != null ? do00Var3.b : null;
        if (str != null) {
            if (atx0Var != null && str.equals(atx0Var.a())) {
                d = Double.MAX_VALUE;
            } else if (atx0Var2 != null && str.equals(atx0Var2.a())) {
                d2 = Double.MAX_VALUE;
            }
        }
        return Double.compare(d, d2);
    }

    public final GeoDataSet h() {
        return (GeoDataSet) this.i.b.invoke();
    }

    @Override // xsna.nwf.a
    public final int e(int i, String str) {
        return i;
    }
}
