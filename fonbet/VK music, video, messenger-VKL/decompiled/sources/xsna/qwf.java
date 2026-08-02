package xsna;

import android.os.Trace;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.eyx;
import xsna.nwf;
import xsna.wbr;

/* compiled from: ClusterAlgorithm.kt */
@b6l(c = "com.vk.geo.impl.core.cluster.ClusterAlgorithm$run$2", f = "ClusterAlgorithm.kt", l = {278, 340}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class qwf extends SuspendLambda implements wzs<yvj, spj<? super dgu>, Object> {
    final /* synthetic */ CameraBounds $cameraBounds;
    final /* synthetic */ List<elb0> $points;
    final /* synthetic */ dgu $prevGridResult;
    final /* synthetic */ tqg0 $rtree;
    final /* synthetic */ String $selectedId;
    final /* synthetic */ zk3<StringId, VisibleStyle> $styles;
    final /* synthetic */ y5u0 $visualOptions;
    double D$0;
    double D$1;
    float F$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    int I$7;
    int I$8;
    long J$0;
    long J$1;
    long J$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ nwf this$0;

    /* compiled from: Coroutines.kt */
    public static final class a implements izs<Throwable, s3q0> {
        public final /* synthetic */ CameraBounds b;
        public final /* synthetic */ nwf c;
        public final /* synthetic */ MutableBoundingBox d;

        public a(CameraBounds cameraBounds, nwf nwfVar, MutableBoundingBox mutableBoundingBox) {
            this.b = cameraBounds;
            this.c = nwfVar;
            this.d = mutableBoundingBox;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            if (th instanceof CancellationException) {
                xf9.e.g(this.b, this.c);
                q7o.k(this.d);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qwf(List<? extends elb0> list, tqg0 tqg0Var, nwf nwfVar, dgu dguVar, String str, CameraBounds cameraBounds, y5u0 y5u0Var, zk3<StringId, VisibleStyle> zk3Var, spj<? super qwf> spjVar) {
        super(2, spjVar);
        this.$points = list;
        this.$rtree = tqg0Var;
        this.this$0 = nwfVar;
        this.$prevGridResult = dguVar;
        this.$selectedId = str;
        this.$cameraBounds = cameraBounds;
        this.$visualOptions = y5u0Var;
        this.$styles = zk3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        qwf qwfVar = new qwf(this.$points, this.$rtree, this.this$0, this.$prevGridResult, this.$selectedId, this.$cameraBounds, this.$visualOptions, this.$styles, spjVar);
        qwfVar.L$0 = obj;
        return qwfVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super dgu> spjVar) {
        return ((qwf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0a78  */
    /* JADX WARN: Type inference failed for: r10v61, types: [int] */
    /* JADX WARN: Type inference failed for: r13v49, types: [int] */
    /* JADX WARN: Type inference failed for: r15v31, types: [xsna.wbr] */
    /* JADX WARN: Type inference failed for: r1v96, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v150, types: [xsna.wbr] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0b54 -> B:6:0x0b6e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean equals;
        dgu dguVar;
        int i;
        Map<StringId, akt> o;
        long j;
        float f;
        MutableBoundingBox h;
        eyx eyxVar;
        tqg0 tqg0Var;
        List<elb0> list;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList;
        boolean z;
        float max;
        yvj yvjVar;
        ArrayList arrayList2;
        String str;
        Map<StringId, akt> map;
        BoundingBox boundingBox;
        int i2;
        ArrayList arrayList3;
        List list2;
        List<akt> list3;
        ArrayList arrayList4;
        int i3;
        double d;
        LoggerOutputTarget loggerOutputTarget;
        String str2;
        int i4;
        LoggerOutputTarget loggerOutputTarget2;
        LinkedList linkedList;
        String str3;
        double d2;
        CoroutineSingletons coroutineSingletons2;
        yvj yvjVar2;
        int i5;
        int i6;
        wbr.b bVar;
        BoundingBox boundingBox2;
        long j2;
        int i7;
        double d3;
        Map map2;
        Map<StringId, akt> map3;
        List list4;
        Object d4;
        int i8;
        List list5;
        boolean z2;
        wbr.b bVar2;
        Map map4;
        LinkedList linkedList2;
        MutableBoundingBox mutableBoundingBox;
        BoundingBox boundingBox3;
        Map<StringId, akt> map5;
        akt aktVar;
        elb0 elb0Var;
        Object obj2;
        ArrayList arrayList5;
        akt aktVar2;
        String str4;
        long j3;
        List list6;
        int length;
        List list7;
        List<akt> list8;
        int[] iArr;
        CoroutineSingletons coroutineSingletons3;
        int i9;
        boolean z3;
        float f2;
        LinkedList linkedList3;
        long j4;
        MutableBoundingBox mutableBoundingBox2;
        double d5;
        Map map6;
        int i10;
        double d6;
        wbr.b bVar3;
        long j5;
        int i11;
        int i12;
        BoundingBox boundingBox4;
        int i13;
        LinkedList linkedList4;
        boolean z4;
        elb0 elb0Var2;
        elb0 elb0Var3;
        int i14;
        yvj yvjVar3 = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = this.label;
        String str5 = "clusters.size = ";
        if (i15 == 0) {
            kotlin.a.a(obj);
            Trace.beginSection("executeSmartGrid");
            if (this.$points == null && this.$rtree == null) {
                throw new IllegalStateException("one of items must be not null");
            }
            String str6 = this.this$0.g;
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget3 = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget3)) {
                L.u(l, L.LogType.d, new Object[]{str6, "executeSmartGrid"});
            }
            dgu dguVar2 = this.$prevGridResult;
            String str7 = dguVar2 != null ? dguVar2.f : null;
            if (str7 == null) {
                if (this.$selectedId == null) {
                    equals = true;
                    boolean z5 = !equals;
                    if (!equals) {
                        String str8 = this.this$0.g;
                        l.getClass();
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l, L.LogType.d, new Object[]{str8, "selected marker changed!"});
                        }
                    }
                    Trace.beginSection("previousClusters map");
                    dguVar = this.$prevGridResult;
                    if (dguVar != null || (o = dguVar.d) == null) {
                        i = 0;
                        o = sni.o(0, 3);
                    } else {
                        i = 0;
                    }
                    if (!equals) {
                        dgu dguVar3 = this.$prevGridResult;
                        String str9 = dguVar3 != null ? dguVar3.f : null;
                        if (str9 != null && (aktVar2 = o.get(new StringId(str9))) != null) {
                            o.put(new StringId(str9), new akt(aktVar2.b, aktVar2.c, VisibleStyle.a(aktVar2.d)));
                            String str10 = this.$selectedId;
                            if (str10 != null) {
                                o.put(new StringId(str10), new akt(aktVar2.b, aktVar2.c, VisibleStyle.G(aktVar2.d)));
                            }
                        }
                    }
                    Trace.endSection();
                    String str11 = this.this$0.g;
                    l.getClass();
                    if (!L.m(loggerOutputTarget3)) {
                        L.u(l, L.LogType.d, new Object[]{str11, "previousClusters.size = " + o.size()});
                    }
                    float F0 = this.$cameraBounds.F0();
                    dgu dguVar4 = this.$prevGridResult;
                    ZoomLevel zoomLevel = dguVar4 == null ? dguVar4.b : null;
                    int i16 = zoomLevel == null ? Math.abs(zoomLevel.b - F0) > this.this$0.e ? 1 : i : i;
                    long e = this.this$0.c.e();
                    xf9 xf9Var = xf9.e;
                    CameraBounds cameraBounds = this.$cameraBounds;
                    xf9.d(xf9Var, cameraBounds, this.this$0);
                    BoundingBox boundingBox5 = new BoundingBox(cameraBounds.D0());
                    j = e;
                    f = F0;
                    h = k9q0.h(y98.e.a(), boundingBox5, this.this$0.b.b(boundingBox5) * (((int) (j & 4294967295L)) + r11.d), this.this$0.b.b(boundingBox5) * (((int) (j >> 32)) + r3.d));
                    String str12 = this.this$0.g;
                    l.getClass();
                    if (!L.m(loggerOutputTarget3)) {
                        L.u(l, L.LogType.d, new Object[]{str12, "cluster_alg_bbox: origin = " + boundingBox5.geoJsonString(true) + ", enlarged = " + h.geoJsonString(true)});
                    }
                    CameraBounds cameraBounds2 = this.$cameraBounds;
                    nwf nwfVar = this.this$0;
                    eyxVar = (eyx) yvjVar3.getCoroutineContext().get(eyx.a.b);
                    if (eyxVar != null) {
                        eyxVar.E(new a(cameraBounds2, nwfVar, h));
                    }
                    Trace.beginSection("grid");
                    Trace.endSection();
                    ArrayList arrayList6 = new ArrayList(o.size());
                    Trace.beginSection("clusters");
                    iyx.e(yvjVar3.getCoroutineContext());
                    String str13 = this.this$0.g;
                    l.getClass();
                    if (!L.m(loggerOutputTarget3)) {
                        L.u(l, L.LogType.d, new Object[]{str13, "run cluster for " + h});
                    }
                    nwf nwfVar2 = this.this$0;
                    List<elb0> list9 = this.$points;
                    tqg0Var = this.$rtree;
                    int i17 = this.$visualOptions.a;
                    String str14 = nwfVar2.g;
                    l.getClass();
                    if (L.m(loggerOutputTarget3)) {
                        list = list9;
                        coroutineSingletons = coroutineSingletons4;
                        L.u(l, L.LogType.d, new Object[]{str14, "cluster: rtree search start"});
                    } else {
                        list = list9;
                        coroutineSingletons = coroutineSingletons4;
                    }
                    Trace.beginSection("cluster: rtree search");
                    nwfVar2.b.c();
                    if (tqg0Var == null) {
                        s470<elb0> s470Var = tqg0Var.a;
                        if (s470Var == null) {
                            arrayList = new ArrayList();
                        } else {
                            uki0<elb0> c = s470Var.c(null, new dnz(h, 11));
                            ArrayList arrayList7 = new ArrayList();
                            rli0.z(c, arrayList7);
                            arrayList = arrayList7;
                        }
                    } else {
                        if (list == null) {
                            throw new IllegalStateException("rtree or points must be not null");
                        }
                        arrayList = new ArrayList(list);
                    }
                    if (arrayList.isEmpty()) {
                        Trace.endSection();
                        if (L.m(loggerOutputTarget3)) {
                            z = z5;
                        } else {
                            z = z5;
                            L.u(l, L.LogType.d, new Object[]{str14, uq.b(arrayList, new StringBuilder("cluster: rtree search result "))});
                        }
                        Trace.beginSection("cluster: entries.sortedWith");
                        final lwf lwfVar = new lwf(nwfVar2, i17);
                        final int i18 = 0;
                        g5g.L(arrayList, new Comparator() { // from class: xsna.mwf
                            @Override // java.util.Comparator
                            public final int compare(Object obj3, Object obj4) {
                                switch (i18) {
                                    case 0:
                                        return ((Number) ((lwf) lwfVar).invoke(obj3, obj4)).intValue();
                                    default:
                                        return ((Number) ((k3i) lwfVar).invoke(obj3, obj4)).intValue();
                                }
                            }
                        });
                        Trace.endSection();
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l, L.LogType.d, new Object[]{str14, "cluster: rtree search finish"});
                        }
                        float floatValue = nwfVar2.a.b.invoke().floatValue();
                        if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            L.G("metersPerPx is zero!");
                            max = 500.0f;
                        } else {
                            max = Math.max(0.1f, r8.a * floatValue);
                            l.getClass();
                            if (!L.m(loggerOutputTarget3)) {
                                L.u(l, L.LogType.d, new Object[]{"tolerance = " + max + "m, zoomLevel = " + ((Object) ZoomLevel.a(f))});
                            }
                        }
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l, L.LogType.d, new Object[]{str14, "cluster: start simplify"});
                        }
                        Trace.beginSection("cluster: algorithm.simplify");
                        if (arrayList.size() < 2 || max < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            yvjVar = yvjVar3;
                            arrayList2 = arrayList6;
                            str = "clusters.size = ";
                            map = o;
                            boundingBox = boundingBox5;
                            i2 = i16;
                            arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(new akt((elb0) it.next()));
                            }
                        } else {
                            arrayList3 = new ArrayList(arrayList.size());
                            arrayList3.add(new akt((elb0) j5g.Y(arrayList)));
                            SparseArray sparseArray = new SparseArray(arrayList.size());
                            int h2 = e43.h(arrayList);
                            if (1 <= h2) {
                                int i19 = 1;
                                while (true) {
                                    elb0 elb0Var4 = (elb0) arrayList.get(i19);
                                    Iterator it2 = arrayList3.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            yvjVar = yvjVar3;
                                            arrayList2 = arrayList6;
                                            str = str5;
                                            map = o;
                                            boundingBox = boundingBox5;
                                            i2 = i16;
                                            arrayList3.add(new akt(elb0Var4));
                                            break;
                                        }
                                        i2 = i16;
                                        akt aktVar3 = (akt) it2.next();
                                        boundingBox = boundingBox5;
                                        elb0 elb0Var5 = aktVar3.b;
                                        map = o;
                                        int hashCode = elb0Var4.b.hashCode() ^ elb0Var5.b.hashCode();
                                        Double d7 = (Double) sparseArray.get(hashCode);
                                        yvjVar = yvjVar3;
                                        if (d7 == null) {
                                            str = str5;
                                            arrayList2 = arrayList6;
                                            Double valueOf = Double.valueOf(l370.p(sdi.x(elb0Var4.f), sdi.x(elb0Var4.g), sdi.x(elb0Var5.f), sdi.x(elb0Var5.g)));
                                            sparseArray.put(hashCode, valueOf);
                                            d7 = valueOf;
                                        } else {
                                            arrayList2 = arrayList6;
                                            str = str5;
                                        }
                                        if (d7.doubleValue() < max) {
                                            aktVar3.c.put(new StringId(elb0Var4.b), elb0Var4);
                                            break;
                                        }
                                        i16 = i2;
                                        boundingBox5 = boundingBox;
                                        o = map;
                                        yvjVar3 = yvjVar;
                                        str5 = str;
                                        arrayList6 = arrayList2;
                                    }
                                    if (i19 == h2) {
                                        break;
                                    }
                                    i19++;
                                    i16 = i2;
                                    boundingBox5 = boundingBox;
                                    o = map;
                                    yvjVar3 = yvjVar;
                                    str5 = str;
                                    arrayList6 = arrayList2;
                                }
                            } else {
                                yvjVar = yvjVar3;
                                arrayList2 = arrayList6;
                                str = "clusters.size = ";
                                map = o;
                                boundingBox = boundingBox5;
                                i2 = i16;
                            }
                        }
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{str14, "cluster: finish simplify"});
                        }
                        Trace.endSection();
                        L.c(str14, new hg(arrayList3, 26));
                        list2 = arrayList3;
                    } else {
                        yvjVar = yvjVar3;
                        arrayList2 = arrayList6;
                        str = "clusters.size = ";
                        map = o;
                        boundingBox = boundingBox5;
                        z = z5;
                        i2 = i16;
                        list2 = EmptyList.b;
                    }
                    list3 = list2;
                    if (list3.isEmpty()) {
                        Collection<akt> values = map.values();
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj3 : values) {
                            if (h.u(((akt) obj3).b)) {
                                arrayList8.add(obj3);
                            }
                        }
                        double a2 = ((akt) j5g.Y(list3)).b.e.a(this.$visualOptions.a);
                        boolean z6 = false;
                        loop10: while (true) {
                            for (akt aktVar4 : list3) {
                                if (!z6) {
                                    LinkedHashMap<StringId, elb0> linkedHashMap = aktVar4.c;
                                    String str15 = this.$selectedId;
                                    if (!linkedHashMap.isEmpty()) {
                                        Iterator<Map.Entry<StringId, elb0>> it3 = linkedHashMap.entrySet().iterator();
                                        while (it3.hasNext()) {
                                            if (str15 == null ? false : epx.f(it3.next().getKey().b, str15)) {
                                                z6 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z6 = false;
                                }
                                i3 = (i3 != 0 || VisibleStyle.o(aktVar4.d)) ? 1 : 0;
                            }
                        }
                        r4 = -1.7976931348623157E308d < a2 ? a2 : -1.7976931348623157E308d;
                        if (i2 == 0) {
                            Iterator it4 = arrayList8.iterator();
                            while (it4.hasNext()) {
                                akt aktVar5 = (akt) it4.next();
                                Iterator it5 = list3.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it5.next();
                                    if (((akt) obj2).b.b.equals(aktVar5.b.b)) {
                                        break;
                                    }
                                }
                                akt aktVar6 = (akt) obj2;
                                if (aktVar6 != null) {
                                    aktVar6.d = aktVar5.d;
                                    arrayList5 = arrayList2;
                                    arrayList5.add(aktVar6);
                                } else {
                                    arrayList5 = arrayList2;
                                    aktVar5.c.clear();
                                    arrayList5.add(aktVar5);
                                }
                                arrayList2 = arrayList5;
                            }
                        }
                        arrayList4 = arrayList2;
                        String str16 = this.this$0.g;
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.d, new Object[]{str16, "finish cluster"});
                        }
                    } else {
                        arrayList4 = arrayList2;
                        i3 = 0;
                    }
                    d = r4;
                    Trace.endSection();
                    String str17 = this.this$0.g;
                    L l4 = L.a;
                    l4.getClass();
                    loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (L.m(loggerOutputTarget)) {
                        str2 = str;
                        L.u(l4, L.LogType.d, new Object[]{str17, str2 + list3.size() + ", previouslyDisplayed.size " + arrayList4.size()});
                    } else {
                        str2 = str;
                    }
                    y5u0 y5u0Var = this.$visualOptions;
                    i4 = y5u0Var.f <= 0 ? 1 : 0;
                    Double d8 = (i4 != 0 || (aktVar = (akt) j5g.a0(j5g.D0(new nwf.b(new swf(this.this$0, y5u0Var)), arrayList4))) == null || (elb0Var = aktVar.b) == null) ? null : new Double(elb0Var.e.a(this.$visualOptions.a));
                    double doubleValue = d8 == null ? d8.doubleValue() : d;
                    String str18 = this.this$0.g;
                    l4.getClass();
                    if (L.m(loggerOutputTarget)) {
                        loggerOutputTarget2 = loggerOutputTarget;
                        L.u(l4, L.LogType.d, new Object[]{str18, "GRID: start prev: " + arrayList4.size() + ", displayRate = " + doubleValue});
                    } else {
                        loggerOutputTarget2 = loggerOutputTarget;
                    }
                    linkedList = new LinkedList();
                    Map o2 = sni.o(arrayList4.size(), 2);
                    nwf nwfVar3 = this.this$0;
                    nwfVar3.getClass();
                    wbr.b bVar4 = this.$visualOptions.k;
                    String str19 = nwfVar3.g;
                    l4.getClass();
                    if (L.m(loggerOutputTarget2)) {
                        str3 = str2;
                        d2 = doubleValue;
                        L.u(l4, L.LogType.d, new Object[]{str19, "fillStrategy = " + bVar4});
                    } else {
                        str3 = str2;
                        d2 = doubleValue;
                    }
                    if (i3 == 0) {
                        String str20 = this.this$0.g;
                        l4.getClass();
                        if (!L.m(loggerOutputTarget2)) {
                            L.u(l4, L.LogType.d, new Object[]{str20, "step 2.0"});
                        }
                        Trace.beginSection("Step 2.0 Make districts");
                        final x7d x7dVar = new x7d(2, this.this$0, this.$visualOptions);
                        List D0 = j5g.D0(new Comparator() { // from class: xsna.pwf
                            @Override // java.util.Comparator
                            public final int compare(Object obj4, Object obj5) {
                                return ((Number) x7d.this.invoke(obj4, obj5)).intValue();
                            }
                        }, list3);
                        iyx.e(yvjVar.getCoroutineContext());
                        nwf nwfVar4 = this.this$0;
                        String str21 = this.$selectedId;
                        zk3<StringId, VisibleStyle> zk3Var = this.$styles;
                        y5u0 y5u0Var2 = this.$visualOptions;
                        yvjVar2 = yvjVar;
                        this.L$0 = yvjVar2;
                        this.L$1 = map;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = boundingBox;
                        this.L$5 = h;
                        this.L$6 = arrayList4;
                        this.L$7 = list3;
                        this.L$8 = null;
                        this.L$9 = linkedList;
                        this.L$10 = o2;
                        this.L$11 = bVar4;
                        this.L$12 = null;
                        this.L$13 = null;
                        this.J$0 = 0L;
                        this.I$0 = i2;
                        this.I$1 = z ? 1 : 0;
                        this.J$1 = 0L;
                        this.F$0 = f;
                        this.J$2 = j;
                        this.D$0 = d;
                        this.I$2 = i3;
                        this.I$3 = i4;
                        this.D$1 = d2;
                        this.label = 1;
                        nwfVar4.getClass();
                        d4 = zvj.d(new owf(bVar4, f, 536872096, D0, o2, linkedList, h, y5u0Var2, str21, zk3Var, nwfVar4, d2, boundingBox, null), this);
                        coroutineSingletons2 = coroutineSingletons;
                        if (d4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        i8 = i2;
                        list5 = list3;
                        z2 = z;
                        bVar2 = bVar4;
                        map4 = o2;
                        linkedList2 = linkedList;
                        mutableBoundingBox = h;
                        boundingBox3 = boundingBox;
                        map5 = map;
                        j2 = 0;
                    } else {
                        coroutineSingletons2 = coroutineSingletons;
                        yvjVar2 = yvjVar;
                        i5 = i2;
                        i6 = i3;
                        bVar = bVar4;
                        boundingBox2 = boundingBox;
                        j2 = 0;
                        i7 = i4;
                        d3 = d;
                        map2 = o2;
                        map3 = map;
                        list4 = list3;
                        Trace.beginSection("previouslyDisplayed.downscaleVisibleStyle");
                        List list10 = list3;
                        str4 = this.$selectedId;
                        if (str4 == null) {
                            Iterator it6 = list10.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    j3 = j2;
                                    elb0Var2 = null;
                                    break;
                                }
                                j3 = j2;
                                akt aktVar7 = (akt) it6.next();
                                if (aktVar7.b.b.equals(str4)) {
                                    elb0Var2 = aktVar7.b;
                                    break;
                                }
                                Iterator it7 = aktVar7.c.values().iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        elb0Var3 = 0;
                                        break;
                                    }
                                    elb0Var3 = it7.next();
                                    Iterator it8 = it7;
                                    if (((elb0) elb0Var3).b.equals(str4)) {
                                        break;
                                    }
                                    it7 = it8;
                                }
                                elb0 elb0Var6 = elb0Var3;
                                if (elb0Var6 != null) {
                                    elb0Var2 = elb0Var6;
                                    break;
                                }
                                j2 = j3;
                            }
                            if (elb0Var2 != null) {
                                String str22 = elb0Var2.b;
                                akt aktVar8 = map3.get(new StringId(str22));
                                if (aktVar8 == null) {
                                    aktVar8 = new akt(elb0Var2);
                                }
                                aktVar8.d = VisibleStyle.G(aktVar8.d);
                                map2.put(new StringId(str22), aktVar8);
                                list6 = list4;
                                BoundingBox a3 = this.this$0.b.a(aktVar8.d, boundingBox2, str22);
                                a3.getClass();
                                if (!(a3 == BoundingBox.e)) {
                                    linkedList.add(new gox(aktVar8.d, a3, str22));
                                }
                                Trace.endSection();
                                if (!arrayList4.isEmpty()) {
                                    Iterator it9 = j5g.D0(new nwf.b(new swf(this.this$0, this.$visualOptions)), arrayList4).iterator();
                                    while (it9.hasNext()) {
                                        akt aktVar9 = (akt) it9.next();
                                        nwf.a aVar = this.this$0.b;
                                        elb0 elb0Var7 = aktVar9.b;
                                        Iterator it10 = it9;
                                        ArrayList arrayList9 = arrayList4;
                                        BoundingBox a4 = aVar.a(aktVar9.d, boundingBox2, elb0Var7.b);
                                        a4.getClass();
                                        if (!(a4 == BoundingBox.e)) {
                                            if (h.b(a4)) {
                                                linkedList.add(new gox(aktVar9.d, a4, elb0Var7.b));
                                                map2.put(new StringId(elb0Var7.b), aktVar9);
                                                it9 = it10;
                                                arrayList4 = arrayList9;
                                                h = h;
                                            } else {
                                                q7o.k(a4);
                                            }
                                        }
                                        it9 = it10;
                                        arrayList4 = arrayList9;
                                    }
                                }
                                MutableBoundingBox mutableBoundingBox3 = h;
                                ArrayList arrayList10 = arrayList4;
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj4 : list6) {
                                    akt aktVar10 = (akt) obj4;
                                    if (!arrayList10.isEmpty()) {
                                        Iterator it11 = arrayList10.iterator();
                                        while (it11.hasNext()) {
                                            linkedList4 = linkedList;
                                            if (((akt) it11.next()).b.b.equals(aktVar10.b.b)) {
                                                z4 = false;
                                                break;
                                            }
                                            linkedList = linkedList4;
                                        }
                                    }
                                    linkedList4 = linkedList;
                                    z4 = true;
                                    if (z4) {
                                        arrayList11.add(obj4);
                                    }
                                    linkedList = linkedList4;
                                }
                                LinkedList linkedList5 = linkedList;
                                List D02 = j5g.D0(new nwf.b(new swf(this.this$0, this.$visualOptions)), arrayList11);
                                int[] iArr2 = this.this$0.f;
                                length = iArr2.length;
                                list7 = list10;
                                list8 = D02;
                                iArr = iArr2;
                                coroutineSingletons3 = coroutineSingletons2;
                                i9 = i5;
                                z3 = z;
                                f2 = f;
                                linkedList3 = linkedList5;
                                j4 = j3;
                                mutableBoundingBox2 = mutableBoundingBox3;
                                d5 = d2;
                                map6 = map2;
                                i10 = i7;
                                d6 = d3;
                                bVar3 = bVar;
                                j5 = j;
                                i11 = 0;
                                i12 = i6;
                                boundingBox4 = boundingBox2;
                                i13 = 1;
                                if (i11 >= length) {
                                }
                            }
                        } else {
                            j3 = j2;
                        }
                        list6 = list4;
                        Trace.endSection();
                        if (!arrayList4.isEmpty()) {
                        }
                        MutableBoundingBox mutableBoundingBox32 = h;
                        ArrayList arrayList102 = arrayList4;
                        ArrayList arrayList112 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        LinkedList linkedList52 = linkedList;
                        List D022 = j5g.D0(new nwf.b(new swf(this.this$0, this.$visualOptions)), arrayList112);
                        int[] iArr22 = this.this$0.f;
                        length = iArr22.length;
                        list7 = list10;
                        list8 = D022;
                        iArr = iArr22;
                        coroutineSingletons3 = coroutineSingletons2;
                        i9 = i5;
                        z3 = z;
                        f2 = f;
                        linkedList3 = linkedList52;
                        j4 = j3;
                        mutableBoundingBox2 = mutableBoundingBox32;
                        d5 = d2;
                        map6 = map2;
                        i10 = i7;
                        d6 = d3;
                        bVar3 = bVar;
                        j5 = j;
                        i11 = 0;
                        i12 = i6;
                        boundingBox4 = boundingBox2;
                        i13 = 1;
                        if (i11 >= length) {
                        }
                    }
                }
                equals = false;
                boolean z52 = !equals;
                if (!equals) {
                }
                Trace.beginSection("previousClusters map");
                dguVar = this.$prevGridResult;
                if (dguVar != null) {
                }
                i = 0;
                o = sni.o(0, 3);
                if (!equals) {
                }
                Trace.endSection();
                String str112 = this.this$0.g;
                l.getClass();
                if (!L.m(loggerOutputTarget3)) {
                }
                float F02 = this.$cameraBounds.F0();
                dgu dguVar42 = this.$prevGridResult;
                if (dguVar42 == null) {
                }
                if (zoomLevel == null) {
                }
                long e2 = this.this$0.c.e();
                xf9 xf9Var2 = xf9.e;
                CameraBounds cameraBounds3 = this.$cameraBounds;
                xf9.d(xf9Var2, cameraBounds3, this.this$0);
                BoundingBox boundingBox52 = new BoundingBox(cameraBounds3.D0());
                j = e2;
                f = F02;
                h = k9q0.h(y98.e.a(), boundingBox52, this.this$0.b.b(boundingBox52) * (((int) (j & 4294967295L)) + r11.d), this.this$0.b.b(boundingBox52) * (((int) (j >> 32)) + r3.d));
                String str122 = this.this$0.g;
                l.getClass();
                if (!L.m(loggerOutputTarget3)) {
                }
                CameraBounds cameraBounds22 = this.$cameraBounds;
                nwf nwfVar5 = this.this$0;
                eyxVar = (eyx) yvjVar3.getCoroutineContext().get(eyx.a.b);
                if (eyxVar != null) {
                }
                Trace.beginSection("grid");
                Trace.endSection();
                ArrayList arrayList62 = new ArrayList(o.size());
                Trace.beginSection("clusters");
                iyx.e(yvjVar3.getCoroutineContext());
                String str132 = this.this$0.g;
                l.getClass();
                if (!L.m(loggerOutputTarget3)) {
                }
                nwf nwfVar22 = this.this$0;
                List<elb0> list92 = this.$points;
                tqg0Var = this.$rtree;
                int i172 = this.$visualOptions.a;
                String str142 = nwfVar22.g;
                l.getClass();
                if (L.m(loggerOutputTarget3)) {
                }
                Trace.beginSection("cluster: rtree search");
                nwfVar22.b.c();
                if (tqg0Var == null) {
                }
                if (arrayList.isEmpty()) {
                }
                list3 = list2;
                if (list3.isEmpty()) {
                }
                d = r4;
                Trace.endSection();
                String str172 = this.this$0.g;
                L l42 = L.a;
                l42.getClass();
                loggerOutputTarget = LoggerOutputTarget.NONE;
                if (L.m(loggerOutputTarget)) {
                }
                y5u0 y5u0Var3 = this.$visualOptions;
                if (y5u0Var3.f <= 0) {
                }
                if (i4 != 0) {
                }
                if (d8 == null) {
                }
                String str182 = this.this$0.g;
                l42.getClass();
                if (L.m(loggerOutputTarget)) {
                }
                linkedList = new LinkedList();
                Map o22 = sni.o(arrayList4.size(), 2);
                nwf nwfVar32 = this.this$0;
                nwfVar32.getClass();
                wbr.b bVar42 = this.$visualOptions.k;
                String str192 = nwfVar32.g;
                l42.getClass();
                if (L.m(loggerOutputTarget2)) {
                }
                if (i3 == 0) {
                }
            } else {
                String str23 = this.$selectedId;
                if (str23 != null) {
                    equals = str7.equals(str23);
                    boolean z522 = !equals;
                    if (!equals) {
                    }
                    Trace.beginSection("previousClusters map");
                    dguVar = this.$prevGridResult;
                    if (dguVar != null) {
                    }
                    i = 0;
                    o = sni.o(0, 3);
                    if (!equals) {
                    }
                    Trace.endSection();
                    String str1122 = this.this$0.g;
                    l.getClass();
                    if (!L.m(loggerOutputTarget3)) {
                    }
                    float F022 = this.$cameraBounds.F0();
                    dgu dguVar422 = this.$prevGridResult;
                    if (dguVar422 == null) {
                    }
                    if (zoomLevel == null) {
                    }
                    long e22 = this.this$0.c.e();
                    xf9 xf9Var22 = xf9.e;
                    CameraBounds cameraBounds32 = this.$cameraBounds;
                    xf9.d(xf9Var22, cameraBounds32, this.this$0);
                    BoundingBox boundingBox522 = new BoundingBox(cameraBounds32.D0());
                    j = e22;
                    f = F022;
                    h = k9q0.h(y98.e.a(), boundingBox522, this.this$0.b.b(boundingBox522) * (((int) (j & 4294967295L)) + r11.d), this.this$0.b.b(boundingBox522) * (((int) (j >> 32)) + r3.d));
                    String str1222 = this.this$0.g;
                    l.getClass();
                    if (!L.m(loggerOutputTarget3)) {
                    }
                    CameraBounds cameraBounds222 = this.$cameraBounds;
                    nwf nwfVar52 = this.this$0;
                    eyxVar = (eyx) yvjVar3.getCoroutineContext().get(eyx.a.b);
                    if (eyxVar != null) {
                    }
                    Trace.beginSection("grid");
                    Trace.endSection();
                    ArrayList arrayList622 = new ArrayList(o.size());
                    Trace.beginSection("clusters");
                    iyx.e(yvjVar3.getCoroutineContext());
                    String str1322 = this.this$0.g;
                    l.getClass();
                    if (!L.m(loggerOutputTarget3)) {
                    }
                    nwf nwfVar222 = this.this$0;
                    List<elb0> list922 = this.$points;
                    tqg0Var = this.$rtree;
                    int i1722 = this.$visualOptions.a;
                    String str1422 = nwfVar222.g;
                    l.getClass();
                    if (L.m(loggerOutputTarget3)) {
                    }
                    Trace.beginSection("cluster: rtree search");
                    nwfVar222.b.c();
                    if (tqg0Var == null) {
                    }
                    if (arrayList.isEmpty()) {
                    }
                    list3 = list2;
                    if (list3.isEmpty()) {
                    }
                    d = r4;
                    Trace.endSection();
                    String str1722 = this.this$0.g;
                    L l422 = L.a;
                    l422.getClass();
                    loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (L.m(loggerOutputTarget)) {
                    }
                    y5u0 y5u0Var32 = this.$visualOptions;
                    if (y5u0Var32.f <= 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (d8 == null) {
                    }
                    String str1822 = this.this$0.g;
                    l422.getClass();
                    if (L.m(loggerOutputTarget)) {
                    }
                    linkedList = new LinkedList();
                    Map o222 = sni.o(arrayList4.size(), 2);
                    nwf nwfVar322 = this.this$0;
                    nwfVar322.getClass();
                    wbr.b bVar422 = this.$visualOptions.k;
                    String str1922 = nwfVar322.g;
                    l422.getClass();
                    if (L.m(loggerOutputTarget2)) {
                    }
                    if (i3 == 0) {
                    }
                }
                equals = false;
                boolean z5222 = !equals;
                if (!equals) {
                }
                Trace.beginSection("previousClusters map");
                dguVar = this.$prevGridResult;
                if (dguVar != null) {
                }
                i = 0;
                o = sni.o(0, 3);
                if (!equals) {
                }
                Trace.endSection();
                String str11222 = this.this$0.g;
                l.getClass();
                if (!L.m(loggerOutputTarget3)) {
                }
                float F0222 = this.$cameraBounds.F0();
                dgu dguVar4222 = this.$prevGridResult;
                if (dguVar4222 == null) {
                }
                if (zoomLevel == null) {
                }
                long e222 = this.this$0.c.e();
                xf9 xf9Var222 = xf9.e;
                CameraBounds cameraBounds322 = this.$cameraBounds;
                xf9.d(xf9Var222, cameraBounds322, this.this$0);
                BoundingBox boundingBox5222 = new BoundingBox(cameraBounds322.D0());
                j = e222;
                f = F0222;
                h = k9q0.h(y98.e.a(), boundingBox5222, this.this$0.b.b(boundingBox5222) * (((int) (j & 4294967295L)) + r11.d), this.this$0.b.b(boundingBox5222) * (((int) (j >> 32)) + r3.d));
                String str12222 = this.this$0.g;
                l.getClass();
                if (!L.m(loggerOutputTarget3)) {
                }
                CameraBounds cameraBounds2222 = this.$cameraBounds;
                nwf nwfVar522 = this.this$0;
                eyxVar = (eyx) yvjVar3.getCoroutineContext().get(eyx.a.b);
                if (eyxVar != null) {
                }
                Trace.beginSection("grid");
                Trace.endSection();
                ArrayList arrayList6222 = new ArrayList(o.size());
                Trace.beginSection("clusters");
                iyx.e(yvjVar3.getCoroutineContext());
                String str13222 = this.this$0.g;
                l.getClass();
                if (!L.m(loggerOutputTarget3)) {
                }
                nwf nwfVar2222 = this.this$0;
                List<elb0> list9222 = this.$points;
                tqg0Var = this.$rtree;
                int i17222 = this.$visualOptions.a;
                String str14222 = nwfVar2222.g;
                l.getClass();
                if (L.m(loggerOutputTarget3)) {
                }
                Trace.beginSection("cluster: rtree search");
                nwfVar2222.b.c();
                if (tqg0Var == null) {
                }
                if (arrayList.isEmpty()) {
                }
                list3 = list2;
                if (list3.isEmpty()) {
                }
                d = r4;
                Trace.endSection();
                String str17222 = this.this$0.g;
                L l4222 = L.a;
                l4222.getClass();
                loggerOutputTarget = LoggerOutputTarget.NONE;
                if (L.m(loggerOutputTarget)) {
                }
                y5u0 y5u0Var322 = this.$visualOptions;
                if (y5u0Var322.f <= 0) {
                }
                if (i4 != 0) {
                }
                if (d8 == null) {
                }
                String str18222 = this.this$0.g;
                l4222.getClass();
                if (L.m(loggerOutputTarget)) {
                }
                linkedList = new LinkedList();
                Map o2222 = sni.o(arrayList4.size(), 2);
                nwf nwfVar3222 = this.this$0;
                nwfVar3222.getClass();
                wbr.b bVar4222 = this.$visualOptions.k;
                String str19222 = nwfVar3222.g;
                l4222.getClass();
                if (L.m(loggerOutputTarget2)) {
                }
                if (i3 == 0) {
                }
            }
            list8 = (List) r13;
            Trace.endSection();
            i13 = r27 + 1;
            int i20 = r12 + 1;
            i9 = r10;
            i11 = i20;
            coroutineSingletons3 = r15;
            map6 = r25;
            linkedList3 = r26;
            boundingBox4 = r29;
            if (i11 >= length) {
            }
        } else if (i15 == 1) {
            double d9 = this.D$1;
            int i21 = this.I$3;
            int i22 = this.I$2;
            d = this.D$0;
            long j6 = this.J$2;
            float f3 = this.F$0;
            ?? r13 = this.I$1;
            int i23 = this.I$0;
            long j7 = this.J$0;
            ?? r15 = (wbr) this.L$11;
            map4 = (Map) this.L$10;
            linkedList2 = (LinkedList) this.L$9;
            list5 = (List) this.L$7;
            ArrayList arrayList12 = (ArrayList) this.L$6;
            mutableBoundingBox = (MutableBoundingBox) this.L$5;
            boundingBox3 = (BoundingBox) this.L$4;
            map5 = (Map) this.L$1;
            kotlin.a.a(obj);
            str3 = "clusters.size = ";
            j2 = j7;
            j = j6;
            i4 = i21;
            d2 = d9;
            i3 = i22;
            f = f3;
            arrayList4 = arrayList12;
            coroutineSingletons2 = coroutineSingletons4;
            i8 = i23;
            yvjVar2 = yvjVar3;
            d4 = obj;
            z2 = r13;
            bVar2 = r15;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i24 = this.I$6;
            int i25 = this.I$5;
            int i26 = this.I$4;
            double d10 = this.D$1;
            int i27 = this.I$3;
            int i28 = this.I$2;
            double d11 = this.D$0;
            long j8 = this.J$2;
            float f4 = this.F$0;
            ?? r10 = this.I$1;
            int i29 = this.I$0;
            d6 = d11;
            long j9 = this.J$0;
            int[] iArr3 = (int[]) this.L$16;
            ?? r3 = (wbr) this.L$11;
            Map map7 = (Map) this.L$10;
            LinkedList linkedList6 = (LinkedList) this.L$9;
            List list11 = (List) this.L$7;
            MutableBoundingBox mutableBoundingBox4 = (MutableBoundingBox) this.L$5;
            BoundingBox boundingBox6 = (BoundingBox) this.L$4;
            Map<StringId, akt> map8 = (Map) this.L$1;
            kotlin.a.a(obj);
            str3 = "clusters.size = ";
            i12 = i28;
            f2 = f4;
            d5 = d10;
            iArr = iArr3;
            bVar3 = r3;
            yvjVar2 = yvjVar3;
            CoroutineSingletons coroutineSingletons5 = coroutineSingletons4;
            j4 = j9;
            z3 = r10;
            list7 = list11;
            mutableBoundingBox2 = mutableBoundingBox4;
            int i30 = i29;
            int i31 = i26;
            Object d12 = obj;
            map3 = map8;
            length = i24;
            j5 = j8;
            int i32 = i25;
            i10 = i27;
            list8 = (List) d12;
            Trace.endSection();
            i13 = i31 + 1;
            int i202 = i32 + 1;
            i9 = i30;
            i11 = i202;
            coroutineSingletons3 = coroutineSingletons5;
            map6 = map7;
            linkedList3 = linkedList6;
            boundingBox4 = boundingBox6;
            if (i11 >= length) {
                int i33 = length;
                int i34 = iArr[i11];
                int i35 = i11;
                StringBuilder b = ji.b(i13, "step 2.", ": ");
                b.append(VisibleStyle.i(i34));
                String sb = b.toString();
                String str24 = this.this$0.g;
                i31 = i13;
                L l5 = L.a;
                l5.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    i14 = i9;
                } else {
                    i14 = i9;
                    L.u(l5, L.LogType.d, new Object[]{str24, sb});
                }
                Trace.beginSection(sb);
                nwf nwfVar6 = this.this$0;
                String str25 = this.$selectedId;
                zk3<StringId, VisibleStyle> zk3Var2 = this.$styles;
                y5u0 y5u0Var4 = this.$visualOptions;
                this.L$0 = yvjVar2;
                this.L$1 = map3;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = boundingBox4;
                this.L$5 = mutableBoundingBox2;
                this.L$6 = null;
                this.L$7 = list7;
                this.L$8 = null;
                this.L$9 = linkedList3;
                this.L$10 = map6;
                this.L$11 = bVar3;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.L$16 = iArr;
                this.L$17 = sb;
                this.J$0 = j4;
                int i36 = i14;
                this.I$0 = i36;
                boolean z7 = z3;
                this.I$1 = z7 ? 1 : 0;
                LinkedList linkedList7 = linkedList3;
                MutableBoundingBox mutableBoundingBox5 = mutableBoundingBox2;
                this.J$1 = 0L;
                float f5 = f2;
                this.F$0 = f5;
                this.J$2 = j5;
                this.D$0 = d6;
                int i37 = i12;
                this.I$2 = i37;
                int i38 = i10;
                this.I$3 = i38;
                double d13 = d5;
                this.D$1 = d13;
                this.I$4 = i31;
                this.I$5 = i35;
                this.I$6 = i33;
                this.I$7 = i34;
                this.I$8 = i34;
                this.label = 2;
                nwfVar6.getClass();
                wbr.b bVar5 = bVar3;
                BoundingBox boundingBox7 = boundingBox4;
                Map map9 = map6;
                d12 = zvj.d(new owf(bVar5, f5, i34, list8, map9, linkedList7, mutableBoundingBox5, y5u0Var4, str25, zk3Var2, nwfVar6, d13, boundingBox7, null), this);
                coroutineSingletons5 = coroutineSingletons3;
                if (d12 == coroutineSingletons5) {
                    return coroutineSingletons5;
                }
                i12 = i37;
                i10 = i38;
                z3 = z7 ? 1 : 0;
                linkedList6 = linkedList7;
                f2 = f5;
                d5 = d13;
                boundingBox6 = boundingBox7;
                i32 = i35;
                i30 = i36;
                length = i33;
                mutableBoundingBox2 = mutableBoundingBox5;
                map7 = map9;
                bVar3 = bVar5;
                list8 = (List) d12;
                Trace.endSection();
                i13 = i31 + 1;
                int i2022 = i32 + 1;
                i9 = i30;
                i11 = i2022;
                coroutineSingletons3 = coroutineSingletons5;
                map6 = map7;
                linkedList3 = linkedList6;
                boundingBox4 = boundingBox6;
                if (i11 >= length) {
                    LinkedList linkedList8 = linkedList3;
                    MutableBoundingBox mutableBoundingBox6 = mutableBoundingBox2;
                    int i39 = i9;
                    Map map10 = map6;
                    int i40 = i12;
                    float f6 = f2;
                    String str26 = this.this$0.g;
                    L l6 = L.a;
                    l6.getClass();
                    LoggerOutputTarget loggerOutputTarget4 = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget4)) {
                        L.u(l6, L.LogType.d, new Object[]{str26, "step 3 ignoredPoints by count " + list8.size()});
                    }
                    nwf nwfVar7 = this.this$0;
                    nwfVar7.getClass();
                    if (!list8.isEmpty()) {
                        String str27 = nwfVar7.g;
                        l6.getClass();
                        if (!L.m(loggerOutputTarget4)) {
                            L.u(l6, L.LogType.d, new Object[]{str27, "collectIgnoredPointsAsClusters"});
                        }
                        for (akt aktVar11 : list8) {
                            aktVar11.d = 33554434;
                            map10.put(new StringId(aktVar11.b.b), aktVar11);
                        }
                    }
                    Trace.endSection();
                    if (i39 != 0) {
                        map3.clear();
                    }
                    Trace.beginSection("create clusters");
                    String str28 = this.this$0.g;
                    L l7 = L.a;
                    l7.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l7, L.LogType.d, new Object[]{str28, "Step 4: create clusters"});
                    }
                    long j10 = j4;
                    ArrayList arrayList13 = new ArrayList(map10.size());
                    for (Map.Entry entry : map10.entrySet()) {
                        String str29 = ((StringId) entry.getKey()).b;
                        akt aktVar12 = (akt) entry.getValue();
                        zvj.e(yvjVar2);
                        int i41 = aktVar12.d;
                        nwf.a aVar2 = this.this$0.b;
                        aktVar12.c.size();
                        qqm0.b(this.$styles, str29, aVar2.e(i41, str29));
                        map3.put(new StringId(aktVar12.b.b), aktVar12);
                        arrayList13.add(aktVar12);
                    }
                    g5g.L(arrayList13, new nwf.b(new rwf(this.this$0, this.$visualOptions)));
                    Trace.endSection();
                    String str30 = this.this$0.g;
                    L l8 = L.a;
                    l8.getClass();
                    LoggerOutputTarget loggerOutputTarget5 = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget5)) {
                        L.u(l8, L.LogType.d, new Object[]{str30, uq.b(arrayList13, new StringBuilder(str3))});
                    }
                    String str31 = this.this$0.g;
                    l8.getClass();
                    if (!L.m(loggerOutputTarget5)) {
                        L.u(l8, L.LogType.d, new Object[]{str31, "finish " + (System.currentTimeMillis() - j10) + UcumUtils.UCUM_MILLISECODS});
                    }
                    ?? r1 = EmptyList.b;
                    if (this.$visualOptions.e) {
                        r1 = new ArrayList(c5g.u(linkedList8, 10));
                        Iterator it12 = linkedList8.iterator();
                        while (it12.hasNext()) {
                            r1.add(((gox) it12.next()).b);
                        }
                    } else {
                        Iterator it13 = linkedList8.iterator();
                        while (it13.hasNext()) {
                            q7o.k(((gox) it13.next()).b);
                        }
                    }
                    List list12 = r1;
                    xf9.e.g(this.$cameraBounds, this.this$0);
                    q7o.k(mutableBoundingBox6);
                    dgu dguVar5 = new dgu(arrayList13, new ZoomLevel(f6), i40 != 0, map3, list12, this.$selectedId);
                    Trace.endSection();
                    return dguVar5;
                }
            }
        }
        List list13 = (List) d4;
        list13.size();
        Trace.endSection();
        d3 = d;
        map2 = map4;
        boundingBox2 = boundingBox3;
        map3 = map5;
        z = z2;
        list3 = list5;
        i6 = i3;
        i7 = i4;
        list4 = list13;
        linkedList = linkedList2;
        bVar = bVar2;
        i5 = i8;
        h = mutableBoundingBox;
        Trace.beginSection("previouslyDisplayed.downscaleVisibleStyle");
        List list102 = list3;
        str4 = this.$selectedId;
        if (str4 == null) {
        }
        list6 = list4;
        Trace.endSection();
        if (!arrayList4.isEmpty()) {
        }
        MutableBoundingBox mutableBoundingBox322 = h;
        ArrayList arrayList1022 = arrayList4;
        ArrayList arrayList1122 = new ArrayList();
        while (r3.hasNext()) {
        }
        LinkedList linkedList522 = linkedList;
        List D0222 = j5g.D0(new nwf.b(new swf(this.this$0, this.$visualOptions)), arrayList1122);
        int[] iArr222 = this.this$0.f;
        length = iArr222.length;
        list7 = list102;
        list8 = D0222;
        iArr = iArr222;
        coroutineSingletons3 = coroutineSingletons2;
        i9 = i5;
        z3 = z;
        f2 = f;
        linkedList3 = linkedList522;
        j4 = j3;
        mutableBoundingBox2 = mutableBoundingBox322;
        d5 = d2;
        map6 = map2;
        i10 = i7;
        d6 = d3;
        bVar3 = bVar;
        j5 = j;
        i11 = 0;
        i12 = i6;
        boundingBox4 = boundingBox2;
        i13 = 1;
        if (i11 >= length) {
        }
    }
}
