package xsna;

import android.os.Trace;
import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.GeoDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.xce0;

/* compiled from: PublishMarkersUseCase.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.PublishMarkersUseCase$execute$2", f = "PublishMarkersUseCase.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, CarZone.CAR_ZONE_COLUMN_DRIVER, 108, 157, 161, 164}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class zce0 extends SuspendLambda implements wzs<yvj, spj<? super xce0.a>, Object> {
    final /* synthetic */ CameraBounds $cameraBounds;
    final /* synthetic */ wzs<Map<do00, ? extends List<Pair<String, VisibleStyle>>>, spj<? super s3q0>, Object> $loadIcons;
    final /* synthetic */ Set<do00> $markersForRemove;
    final /* synthetic */ Map<StringId, do00> $newMarkers;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    long J$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ xce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zce0(xce0 xce0Var, Map<StringId, do00> map, CameraBounds cameraBounds, Set<do00> set, wzs<? super Map<do00, ? extends List<Pair<String, VisibleStyle>>>, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super zce0> spjVar) {
        super(2, spjVar);
        this.this$0 = xce0Var;
        this.$newMarkers = map;
        this.$cameraBounds = cameraBounds;
        this.$markersForRemove = set;
        this.$loadIcons = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zce0 zce0Var = new zce0(this.this$0, this.$newMarkers, this.$cameraBounds, this.$markersForRemove, this.$loadIcons, spjVar);
        zce0Var.L$0 = obj;
        return zce0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super xce0.a> spjVar) {
        return ((zce0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x01ab, code lost:
    
        if (r0.y(r26) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x018b, code lost:
    
        if (r0.y(r26) == r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x06bd A[LOOP:0: B:12:0x06b7->B:14:0x06bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    /* JADX WARN: Type inference failed for: r0v69, types: [T, java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v76, types: [T, kotlin.collections.EmptySet] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s470 s470Var;
        eyx eyxVar;
        do00 do00Var;
        tqg0 tqg0Var;
        GeoDataSet geoDataSet;
        tqg0 tqg0Var2;
        LoggerOutputTarget loggerOutputTarget;
        String str;
        Object a;
        zk3 zk3Var;
        Set<do00> set;
        long j;
        int i;
        zk3 zk3Var2;
        List list;
        s470 b670Var;
        dgu dguVar;
        el3 el3Var;
        Map d;
        Iterator it;
        Set j2;
        Set g;
        Ref$ObjectRef ref$ObjectRef;
        ?? g2;
        lkt lktVar;
        CoroutineSingletons coroutineSingletons;
        Set set2;
        long j3;
        long j4;
        Iterator it2;
        CoroutineSingletons coroutineSingletons2;
        Map map;
        Object d2;
        el3 el3Var2;
        Ref$ObjectRef ref$ObjectRef2;
        zk3 zk3Var3;
        long j5;
        dgu dguVar2;
        Set set3;
        Set set4;
        long j6;
        wzs<Map<do00, ? extends List<Pair<String, VisibleStyle>>>, spj<? super s3q0>, Object> wzsVar;
        yvj yvjVar;
        Set set5;
        Set set6;
        Map map2;
        Iterator it3;
        LoggerOutputTarget loggerOutputTarget2;
        yvj yvjVar2 = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = 1;
        switch (this.label) {
            case 0:
                s470Var = null;
                kotlin.a.a(obj);
                Map<StringId, do00> map3 = this.$newMarkers;
                L l = L.a;
                l.getClass();
                LoggerOutputTarget loggerOutputTarget3 = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget3)) {
                    L.u(l, L.LogType.d, new Object[]{"execute: " + map3.size()});
                }
                if (this.this$0.b().b().b.isEmpty()) {
                    l.getClass();
                    if (L.m(loggerOutputTarget3)) {
                        return null;
                    }
                    L.u(l, L.LogType.w, new Object[]{"allMarkers are empty!"});
                    return null;
                }
                zvj.e(yvjVar2);
                eyx eyxVar2 = (eyx) ((AtomicReference) this.this$0.i.b.invoke()).get();
                if (eyxVar2 != null) {
                    this.L$0 = yvjVar2;
                    this.label = 1;
                    break;
                }
                zvj.e(yvjVar2);
                eyxVar = (eyx) this.this$0.j.b.invoke();
                if (eyxVar != null) {
                    this.L$0 = yvjVar2;
                    this.label = 2;
                    break;
                }
                zvj.e(yvjVar2);
                if (this.this$0.b().b().g != null) {
                    this.this$0.g.invoke();
                }
                L.e("publishMarkers start");
                Trace.beginSection("publishMarkers");
                GeoDataSet b = this.this$0.b();
                Map<StringId, do00> map4 = this.$newMarkers;
                do00Var = (do00) this.this$0.k.b.invoke();
                tqg0Var = b.b().f;
                if (tqg0Var == null) {
                    Trace.beginSection("publishMarkers: rtree create");
                    map4.size();
                    List O0 = j5g.O0(map4.values());
                    xmj xmjVar = new xmj(znk0.i, xo9.f);
                    int size = O0.size();
                    zk3 zk3Var4 = new zk3(O0.size());
                    boolean z = true;
                    while (!O0.isEmpty()) {
                        int a2 = an10.a(xmjVar.a * 0.75d);
                        zk3 zk3Var5 = zk3Var4;
                        int a3 = an10.a(Math.ceil(O0.size() / a2));
                        if (a3 == 0) {
                            geoDataSet = b;
                            tqg0Var2 = new tqg0(s470Var, 0, xmjVar, zk3Var5);
                        } else if (a3 != i2) {
                            int ceil = ((int) Math.ceil(Math.sqrt(a3))) * a2;
                            boolean z2 = z;
                            int ceil2 = (int) Math.ceil(O0.size() / ceil);
                            Trace.beginSection("Rtree: Collections.sort(objects, MidComparator(0))");
                            Collections.sort(O0, nl20.c);
                            Trace.endSection();
                            ArrayList arrayList = new ArrayList(a3);
                            int i3 = 0;
                            while (i3 < ceil2) {
                                int i4 = i3 * ceil;
                                int i5 = i3 + 1;
                                int i6 = i5 * ceil;
                                int size2 = O0.size();
                                if (i6 > size2) {
                                    i6 = size2;
                                }
                                List subList = O0.subList(i4, i6);
                                Collections.sort(subList, nl20.d);
                                Trace.beginSection("Rtree: for (i in slice.indices step capacity)");
                                int size3 = subList.size() - 1;
                                if (a2 <= 0) {
                                    throw new IllegalArgumentException(uqi.a("Step must be positive, was: ", a2, JwtParser.SEPARATOR_CHAR));
                                }
                                int b2 = tyx.b(0, size3, a2);
                                GeoDataSet geoDataSet2 = b;
                                if (b2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        int size4 = subList.size();
                                        i = i5;
                                        int i8 = i7 + a2;
                                        if (size4 > i8) {
                                            size4 = i8;
                                        }
                                        List subList2 = subList.subList(i7, size4);
                                        if (z2) {
                                            list = subList;
                                            b670Var = new xyy(subList2, xmjVar);
                                        } else {
                                            list = subList;
                                            b670Var = new b670(subList2, xmjVar);
                                        }
                                        zk3Var2 = zk3Var5;
                                        sdi.i(b670Var, zk3Var2);
                                        arrayList.add(b670Var);
                                        if (i7 != b2) {
                                            zk3Var5 = zk3Var2;
                                            i7 = i8;
                                            i5 = i;
                                            subList = list;
                                        }
                                    }
                                } else {
                                    i = i5;
                                    zk3Var2 = zk3Var5;
                                }
                                Trace.endSection();
                                zk3Var5 = zk3Var2;
                                b = geoDataSet2;
                                i3 = i;
                                i2 = 1;
                            }
                            zk3Var4 = zk3Var5;
                            O0 = arrayList;
                            z = false;
                        } else {
                            geoDataSet = b;
                            s470 xyyVar = z ? new xyy(O0, xmjVar) : new b670(O0, xmjVar);
                            sdi.i(xyyVar, zk3Var5);
                            tqg0Var2 = new tqg0(xyyVar, size, xmjVar, zk3Var5);
                        }
                        Trace.endSection();
                    }
                    throw new IllegalArgumentException("objects are empty");
                }
                geoDataSet = b;
                Trace.beginSection("publishMarkers: rtree add");
                Collection<do00> values = map4.values();
                if (!values.isEmpty()) {
                    Iterator<T> it4 = values.iterator();
                    while (it4.hasNext()) {
                        tqg0Var = tqg0Var.a((elb0) it4.next());
                    }
                }
                Trace.endSection();
                tqg0Var2 = tqg0Var;
                if (do00Var != null) {
                    tqg0Var2 = tqg0Var2.a(do00Var);
                }
                tqg0 tqg0Var3 = tqg0Var2;
                geoDataSet.b().f = tqg0Var3;
                L l2 = L.a;
                l2.getClass();
                loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l2, L.LogType.d, new Object[]{"rtree.size = " + tqg0Var3.b});
                }
                iyx.e(yvjVar2.getCoroutineContext());
                Set<do00> set7 = this.this$0.b().b().a;
                Trace.beginSection("publishMarkers: clusterUseCase.executeSmartGrid");
                do00 do00Var2 = (do00) this.this$0.k.b.invoke();
                l2.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.LogType logType = L.LogType.d;
                    StringBuilder sb = new StringBuilder("publishMarkers: selectedMarker ");
                    String str2 = do00Var2 != null ? do00Var2.b : null;
                    sb.append((Object) (str2 == null ? "null" : StringId.a(str2)));
                    L.u(l2, logType, new Object[]{"GeoFeature", sb.toString()});
                }
                zk3 zk3Var6 = new zk3(100);
                xce0 xce0Var = this.this$0;
                str = do00Var2 != null ? do00Var2.b : null;
                if (str == null) {
                    xce0Var.getClass();
                } else {
                    VisibleStyle a4 = qqm0.a(xce0Var.b().b().e, str);
                    if (a4 != null) {
                        qqm0.b(zk3Var6, str, VisibleStyle.G(a4.b));
                        l2.getClass();
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l2, L.LogType.d, new Object[]{"GeoFeature", "publishMarkers: styles update by selected marker visibleStyle"});
                        }
                    }
                }
                xce0 xce0Var2 = this.this$0;
                CameraBounds cameraBounds = this.$cameraBounds;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = set7;
                this.L$3 = null;
                this.L$4 = zk3Var6;
                this.J$0 = 0L;
                this.J$1 = 0L;
                this.label = 3;
                a = xce0.a(xce0Var2, do00Var2, cameraBounds, tqg0Var3, zk3Var6, this);
                if (a != coroutineSingletons3) {
                    zk3Var = zk3Var6;
                    set = set7;
                    j = 0;
                    dguVar = (dgu) a;
                    this.this$0.getClass();
                    boolean z3 = dguVar.c;
                    ArrayList arrayList2 = dguVar.a;
                    L.e("finish simplifying");
                    Trace.endSection();
                    zvj.e(yvjVar2);
                    Trace.beginSection("publishMarkers: gridResult.clusterizeResult.clusters.forEach");
                    el3Var = new el3(arrayList2.size());
                    el3 el3Var3 = new el3(0);
                    d = sni.d(arrayList2.size(), 2);
                    el3 el3Var4 = new el3(0);
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        akt aktVar = (akt) it.next();
                        iyx.e(yvjVar2.getCoroutineContext());
                        LinkedHashMap<StringId, elb0> linkedHashMap = aktVar.c;
                        elb0 elb0Var = aktVar.b;
                        if (linkedHashMap.isEmpty()) {
                            L l3 = L.a;
                            l3.getClass();
                            if (L.m(LoggerOutputTarget.NONE)) {
                                it2 = it;
                                coroutineSingletons2 = coroutineSingletons3;
                            } else {
                                it2 = it;
                                coroutineSingletons2 = coroutineSingletons3;
                                L.u(l3, L.LogType.w, new Object[]{"invalid cluster " + elb0Var});
                            }
                        } else {
                            it2 = it;
                            coroutineSingletons2 = coroutineSingletons3;
                            do00 do00Var3 = this.this$0.b().b().b.get(new StringId(elb0Var.b));
                            if (do00Var3 != null) {
                                el3Var.add(do00Var3);
                                el3Var3.add(do00Var3);
                                d.put(new StringId(elb0Var.b), akt.b(aktVar));
                                el3Var4.addAll(aktVar.c.values());
                            }
                        }
                        it = it2;
                        coroutineSingletons3 = coroutineSingletons2;
                    }
                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                    Trace.endSection();
                    j2 = izi0.j(izi0.g(set, el3Var3), this.$markersForRemove);
                    g = izi0.g(el3Var3, j2);
                    ref$ObjectRef = new Ref$ObjectRef();
                    g2 = izi0.g(el3Var, set);
                    ref$ObjectRef.element = g2;
                    if (epx.f(g2, g)) {
                        ref$ObjectRef.element = EmptySet.b;
                    }
                    L l4 = L.a;
                    l4.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l4, L.LogType.d, new Object[]{"removal.size=" + j2.size() + ", additions.size=" + g.size()});
                    }
                    xce0 xce0Var3 = this.this$0;
                    Trace.beginSection("publishMarkers: loadCategoriesJob?.join()");
                    lktVar = xce0Var3.f;
                    this.L$0 = yvjVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = zk3Var;
                    this.L$5 = dguVar;
                    this.L$6 = el3Var;
                    this.L$7 = null;
                    this.L$8 = d;
                    this.L$9 = null;
                    this.L$10 = j2;
                    this.L$11 = g;
                    this.L$12 = ref$ObjectRef;
                    this.L$13 = "publishMarkers: loadCategoriesJob?.join()";
                    this.J$0 = j;
                    this.J$1 = 0L;
                    this.I$0 = 0;
                    this.J$2 = 0L;
                    this.I$1 = 0;
                    this.label = 4;
                    coroutineSingletons = coroutineSingletons4;
                    if (lktVar.invoke(this) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set2 = g;
                    j3 = j;
                    j4 = 0;
                    zk3 zk3Var7 = zk3Var;
                    Set set8 = j2;
                    map = d;
                    el3 el3Var5 = el3Var;
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                    xce0 xce0Var4 = this.this$0;
                    Trace.beginSection("publishMarkers: prefetchIconUrls");
                    LinkedHashSet j7 = izi0.j(set2, (Iterable) ref$ObjectRef.element);
                    this.L$0 = yvjVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = zk3Var7;
                    this.L$5 = dguVar;
                    this.L$6 = el3Var5;
                    this.L$7 = null;
                    this.L$8 = map;
                    this.L$9 = null;
                    this.L$10 = set8;
                    this.L$11 = set2;
                    this.L$12 = ref$ObjectRef;
                    this.L$13 = "publishMarkers: prefetchIconUrls";
                    this.J$0 = j3;
                    this.J$1 = j4;
                    this.I$0 = 0;
                    long j8 = j4;
                    this.J$2 = 0L;
                    this.I$1 = 0;
                    this.label = 5;
                    xce0Var4.getClass();
                    d2 = zvj.d(new bde0(j7, zk3Var7, map, xce0Var4, null), this);
                    if (d2 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                    el3Var2 = el3Var5;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    zk3Var3 = zk3Var7;
                    j5 = j3;
                    dguVar2 = dguVar;
                    set3 = set8;
                    set4 = set2;
                    j6 = j8;
                    Trace.endSection();
                    wzsVar = this.$loadIcons;
                    this.L$0 = yvjVar2;
                    yvjVar = yvjVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = zk3Var3;
                    this.L$5 = dguVar2;
                    this.L$6 = el3Var2;
                    this.L$7 = null;
                    this.L$8 = map;
                    this.L$9 = null;
                    this.L$10 = set3;
                    this.L$11 = set4;
                    this.L$12 = ref$ObjectRef2;
                    this.L$13 = null;
                    this.J$0 = j5;
                    this.J$1 = j6;
                    this.label = 6;
                    if (wzsVar.invoke((Map) d2, this) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Set set9 = set3;
                    set5 = set4;
                    set6 = set9;
                    map2 = map;
                    dgu dguVar3 = dguVar2;
                    zvj.e(yvjVar);
                    L l5 = L.a;
                    l5.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l5, L.LogType.d, new Object[]{"allmarkers.size = " + ((Set) ref$ObjectRef2.element).size()});
                    }
                    Set<StringId> keySet = this.this$0.b().b().b.keySet();
                    Set l6 = bis.l(set6.size());
                    it3 = set6.iterator();
                    while (it3.hasNext()) {
                        l6.add(new StringId(((do00) it3.next()).b));
                    }
                    jo00 jo00Var = new jo00(izi0.j(keySet, l6), set6, set5, (Set) ref$ObjectRef2.element, zk3Var3, true, null);
                    L l7 = L.a;
                    l7.getClass();
                    loggerOutputTarget2 = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget2)) {
                        L.u(l7, L.LogType.d, new Object[]{"newState = " + jo00Var});
                    }
                    xce0 xce0Var5 = this.this$0;
                    l7.getClass();
                    if (!L.m(loggerOutputTarget2)) {
                        L.u(l7, L.LogType.d, new Object[]{"iconCache: " + xce0Var5.e});
                    }
                    Trace.endSection();
                    L.e("publishMarkers finish");
                    return new xce0.a(dguVar3, el3Var2, map2, zk3Var3, jo00Var);
                }
                return coroutineSingletons3;
            case 1:
                s470Var = null;
                kotlin.a.a(obj);
                s3q0 s3q0Var2 = s3q0.a;
                zvj.e(yvjVar2);
                eyxVar = (eyx) this.this$0.j.b.invoke();
                if (eyxVar != null) {
                }
                zvj.e(yvjVar2);
                if (this.this$0.b().b().g != null) {
                }
                L.e("publishMarkers start");
                Trace.beginSection("publishMarkers");
                GeoDataSet b3 = this.this$0.b();
                Map<StringId, do00> map42 = this.$newMarkers;
                do00Var = (do00) this.this$0.k.b.invoke();
                tqg0Var = b3.b().f;
                if (tqg0Var == null) {
                }
                if (do00Var != null) {
                }
                tqg0 tqg0Var32 = tqg0Var2;
                geoDataSet.b().f = tqg0Var32;
                L l22 = L.a;
                l22.getClass();
                loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                }
                iyx.e(yvjVar2.getCoroutineContext());
                Set<do00> set72 = this.this$0.b().b().a;
                Trace.beginSection("publishMarkers: clusterUseCase.executeSmartGrid");
                do00 do00Var22 = (do00) this.this$0.k.b.invoke();
                l22.getClass();
                if (!L.m(loggerOutputTarget)) {
                }
                zk3 zk3Var62 = new zk3(100);
                xce0 xce0Var6 = this.this$0;
                if (do00Var22 != null) {
                }
                if (str == null) {
                }
                xce0 xce0Var22 = this.this$0;
                CameraBounds cameraBounds2 = this.$cameraBounds;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = set72;
                this.L$3 = null;
                this.L$4 = zk3Var62;
                this.J$0 = 0L;
                this.J$1 = 0L;
                this.label = 3;
                a = xce0.a(xce0Var22, do00Var22, cameraBounds2, tqg0Var32, zk3Var62, this);
                if (a != coroutineSingletons3) {
                }
                return coroutineSingletons3;
            case 2:
                s470Var = null;
                kotlin.a.a(obj);
                s3q0 s3q0Var3 = s3q0.a;
                zvj.e(yvjVar2);
                if (this.this$0.b().b().g != null) {
                }
                L.e("publishMarkers start");
                Trace.beginSection("publishMarkers");
                GeoDataSet b32 = this.this$0.b();
                Map<StringId, do00> map422 = this.$newMarkers;
                do00Var = (do00) this.this$0.k.b.invoke();
                tqg0Var = b32.b().f;
                if (tqg0Var == null) {
                }
                if (do00Var != null) {
                }
                tqg0 tqg0Var322 = tqg0Var2;
                geoDataSet.b().f = tqg0Var322;
                L l222 = L.a;
                l222.getClass();
                loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                }
                iyx.e(yvjVar2.getCoroutineContext());
                Set<do00> set722 = this.this$0.b().b().a;
                Trace.beginSection("publishMarkers: clusterUseCase.executeSmartGrid");
                do00 do00Var222 = (do00) this.this$0.k.b.invoke();
                l222.getClass();
                if (!L.m(loggerOutputTarget)) {
                }
                zk3 zk3Var622 = new zk3(100);
                xce0 xce0Var62 = this.this$0;
                if (do00Var222 != null) {
                }
                if (str == null) {
                }
                xce0 xce0Var222 = this.this$0;
                CameraBounds cameraBounds22 = this.$cameraBounds;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = set722;
                this.L$3 = null;
                this.L$4 = zk3Var622;
                this.J$0 = 0L;
                this.J$1 = 0L;
                this.label = 3;
                a = xce0.a(xce0Var222, do00Var222, cameraBounds22, tqg0Var322, zk3Var622, this);
                if (a != coroutineSingletons3) {
                }
                return coroutineSingletons3;
            case 3:
                long j9 = this.J$0;
                zk3 zk3Var8 = (zk3) this.L$4;
                set = (Set) this.L$2;
                kotlin.a.a(obj);
                zk3Var = zk3Var8;
                j = j9;
                a = obj;
                dguVar = (dgu) a;
                this.this$0.getClass();
                boolean z32 = dguVar.c;
                ArrayList arrayList22 = dguVar.a;
                L.e("finish simplifying");
                Trace.endSection();
                zvj.e(yvjVar2);
                Trace.beginSection("publishMarkers: gridResult.clusterizeResult.clusters.forEach");
                el3Var = new el3(arrayList22.size());
                el3 el3Var32 = new el3(0);
                d = sni.d(arrayList22.size(), 2);
                el3 el3Var42 = new el3(0);
                it = arrayList22.iterator();
                while (it.hasNext()) {
                }
                CoroutineSingletons coroutineSingletons42 = coroutineSingletons3;
                Trace.endSection();
                j2 = izi0.j(izi0.g(set, el3Var32), this.$markersForRemove);
                g = izi0.g(el3Var32, j2);
                ref$ObjectRef = new Ref$ObjectRef();
                g2 = izi0.g(el3Var, set);
                ref$ObjectRef.element = g2;
                if (epx.f(g2, g)) {
                }
                L l42 = L.a;
                l42.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                }
                xce0 xce0Var32 = this.this$0;
                Trace.beginSection("publishMarkers: loadCategoriesJob?.join()");
                lktVar = xce0Var32.f;
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = zk3Var;
                this.L$5 = dguVar;
                this.L$6 = el3Var;
                this.L$7 = null;
                this.L$8 = d;
                this.L$9 = null;
                this.L$10 = j2;
                this.L$11 = g;
                this.L$12 = ref$ObjectRef;
                this.L$13 = "publishMarkers: loadCategoriesJob?.join()";
                this.J$0 = j;
                this.J$1 = 0L;
                this.I$0 = 0;
                this.J$2 = 0L;
                this.I$1 = 0;
                this.label = 4;
                coroutineSingletons = coroutineSingletons42;
                if (lktVar.invoke(this) != coroutineSingletons) {
                }
                break;
            case 4:
                j4 = this.J$1;
                long j10 = this.J$0;
                ref$ObjectRef = (Ref$ObjectRef) this.L$12;
                Set set10 = (Set) this.L$11;
                j2 = (Set) this.L$10;
                d = (Map) this.L$8;
                el3Var = (el3) this.L$6;
                dguVar = (dgu) this.L$5;
                zk3Var = (zk3) this.L$4;
                kotlin.a.a(obj);
                coroutineSingletons = coroutineSingletons3;
                set2 = set10;
                j3 = j10;
                zk3 zk3Var72 = zk3Var;
                Set set82 = j2;
                map = d;
                el3 el3Var52 = el3Var;
                s3q0 s3q0Var4 = s3q0.a;
                Trace.endSection();
                xce0 xce0Var42 = this.this$0;
                Trace.beginSection("publishMarkers: prefetchIconUrls");
                LinkedHashSet j72 = izi0.j(set2, (Iterable) ref$ObjectRef.element);
                this.L$0 = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = zk3Var72;
                this.L$5 = dguVar;
                this.L$6 = el3Var52;
                this.L$7 = null;
                this.L$8 = map;
                this.L$9 = null;
                this.L$10 = set82;
                this.L$11 = set2;
                this.L$12 = ref$ObjectRef;
                this.L$13 = "publishMarkers: prefetchIconUrls";
                this.J$0 = j3;
                this.J$1 = j4;
                this.I$0 = 0;
                long j82 = j4;
                this.J$2 = 0L;
                this.I$1 = 0;
                this.label = 5;
                xce0Var42.getClass();
                d2 = zvj.d(new bde0(j72, zk3Var72, map, xce0Var42, null), this);
                if (d2 != coroutineSingletons) {
                }
                break;
            case 5:
                long j11 = this.J$1;
                long j12 = this.J$0;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.L$12;
                set4 = (Set) this.L$11;
                set3 = (Set) this.L$10;
                Map map5 = (Map) this.L$8;
                el3 el3Var6 = (el3) this.L$6;
                dgu dguVar4 = (dgu) this.L$5;
                zk3Var3 = (zk3) this.L$4;
                kotlin.a.a(obj);
                ref$ObjectRef2 = ref$ObjectRef4;
                el3Var2 = el3Var6;
                j5 = j12;
                j6 = j11;
                coroutineSingletons = coroutineSingletons3;
                dguVar2 = dguVar4;
                map = map5;
                d2 = obj;
                Trace.endSection();
                wzsVar = this.$loadIcons;
                this.L$0 = yvjVar2;
                yvjVar = yvjVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = zk3Var3;
                this.L$5 = dguVar2;
                this.L$6 = el3Var2;
                this.L$7 = null;
                this.L$8 = map;
                this.L$9 = null;
                this.L$10 = set3;
                this.L$11 = set4;
                this.L$12 = ref$ObjectRef2;
                this.L$13 = null;
                this.J$0 = j5;
                this.J$1 = j6;
                this.label = 6;
                if (wzsVar.invoke((Map) d2, this) != coroutineSingletons) {
                }
                break;
            case 6:
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$12;
                Set set11 = (Set) this.L$11;
                Set set12 = (Set) this.L$10;
                map2 = (Map) this.L$8;
                el3Var2 = (el3) this.L$6;
                dguVar2 = (dgu) this.L$5;
                zk3 zk3Var9 = (zk3) this.L$4;
                kotlin.a.a(obj);
                set5 = set11;
                yvjVar = yvjVar2;
                zk3Var3 = zk3Var9;
                set6 = set12;
                dgu dguVar32 = dguVar2;
                zvj.e(yvjVar);
                L l52 = L.a;
                l52.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                }
                Set<StringId> keySet2 = this.this$0.b().b().b.keySet();
                Set l62 = bis.l(set6.size());
                it3 = set6.iterator();
                while (it3.hasNext()) {
                }
                jo00 jo00Var2 = new jo00(izi0.j(keySet2, l62), set6, set5, (Set) ref$ObjectRef2.element, zk3Var3, true, null);
                L l72 = L.a;
                l72.getClass();
                loggerOutputTarget2 = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget2)) {
                }
                xce0 xce0Var52 = this.this$0;
                l72.getClass();
                if (!L.m(loggerOutputTarget2)) {
                }
                Trace.endSection();
                L.e("publishMarkers finish");
                return new xce0.a(dguVar32, el3Var2, map2, zk3Var3, jo00Var2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
