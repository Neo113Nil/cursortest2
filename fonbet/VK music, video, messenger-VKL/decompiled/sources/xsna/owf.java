package xsna;

import android.os.Parcelable;
import android.os.Trace;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.nwf;
import xsna.wbr;

/* compiled from: ClusterAlgorithm.kt */
@b6l(c = "com.vk.geo.impl.core.cluster.ClusterAlgorithm$generalize$2", f = "ClusterAlgorithm.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class owf extends SuspendLambda implements wzs<yvj, spj<? super List<? extends akt>>, Object> {
    final /* synthetic */ BoundingBox $bbox;
    final /* synthetic */ List<akt> $clusters;
    final /* synthetic */ wbr $fillStrategy;
    final /* synthetic */ Map<StringId, akt> $filtered;
    final /* synthetic */ List<gox> $intersections;
    final /* synthetic */ BoundingBox $originBbox;
    final /* synthetic */ String $selectedId;
    final /* synthetic */ int $style;
    final /* synthetic */ zk3<StringId, VisibleStyle> $styles;
    final /* synthetic */ double $visibleRate;
    final /* synthetic */ y5u0 $visualOptions;
    final /* synthetic */ float $zoomLevel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nwf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owf(wbr wbrVar, float f, int i, List<akt> list, Map<StringId, akt> map, List<gox> list2, BoundingBox boundingBox, y5u0 y5u0Var, String str, zk3<StringId, VisibleStyle> zk3Var, nwf nwfVar, double d, BoundingBox boundingBox2, spj<? super owf> spjVar) {
        super(2, spjVar);
        this.$fillStrategy = wbrVar;
        this.$zoomLevel = f;
        this.$style = i;
        this.$clusters = list;
        this.$filtered = map;
        this.$intersections = list2;
        this.$bbox = boundingBox;
        this.$visualOptions = y5u0Var;
        this.$selectedId = str;
        this.$styles = zk3Var;
        this.this$0 = nwfVar;
        this.$visibleRate = d;
        this.$originBbox = boundingBox2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        owf owfVar = new owf(this.$fillStrategy, this.$zoomLevel, this.$style, this.$clusters, this.$filtered, this.$intersections, this.$bbox, this.$visualOptions, this.$selectedId, this.$styles, this.this$0, this.$visibleRate, this.$originBbox, spjVar);
        owfVar.L$0 = obj;
        return owfVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends akt>> spjVar) {
        return ((owf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        int i;
        int i2;
        String str;
        yvj yvjVar2 = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$fillStrategy.c(an10.b(this.$zoomLevel), this.$style) == 0) {
            return this.$clusters;
        }
        wbr.c.a b = this.$fillStrategy.b();
        if (this.$fillStrategy.a(this.$filtered, this.$style, this.$bbox, an10.b(this.$zoomLevel), b)) {
            return this.$clusters;
        }
        y5u0 y5u0Var = this.$visualOptions;
        int i3 = y5u0Var.a;
        int i4 = y5u0Var.f;
        ArrayList arrayList = new ArrayList();
        Trace.beginSection("generalize.clusters.foreach");
        int size = this.$clusters.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            zvj.e(yvjVar2);
            akt aktVar = this.$clusters.get(i5);
            elb0 elb0Var = aktVar.b;
            if (!VisibleStyle.o(this.$style)) {
                if (!this.$visualOptions.j && VisibleStyle.l(this.$style) && VisibleStyle.e(this.$style)) {
                    arrayList.add(aktVar);
                } else if (this.$fillStrategy.f(b, an10.b(this.$zoomLevel), this.$style)) {
                    arrayList.add(aktVar);
                } else {
                    int i6 = this.$style;
                    if (!VisibleStyle.C(i6) && (elb0Var instanceof do00) && ((do00) elb0Var).n) {
                        i6 = VisibleStyle.M(268435464);
                    }
                    String str2 = this.$selectedId;
                    if (str2 != null) {
                        String str3 = elb0Var.b;
                        if (str3.equals(str2) && qqm0.a(this.$styles, str3) != null) {
                            VisibleStyle a = qqm0.a(this.$styles, str3);
                            i6 = a != null ? a.b : VisibleStyle.G(this.$style);
                        }
                    }
                    if (elb0Var instanceof do00) {
                        ((do00) elb0Var).getClass();
                    }
                    if (i4 > 0) {
                        double d = this.$visibleRate;
                        double a2 = elb0Var.e.a(i3);
                        i = size;
                        i2 = i5;
                        if (Math.abs(((d - a2) * 100) / ((d + a2) / 2)) > i4) {
                            arrayList.add(aktVar);
                            yvjVar = yvjVar2;
                            i5 = i2 + 1;
                            size = i;
                            yvjVar2 = yvjVar;
                        }
                    } else {
                        i = size;
                        i2 = i5;
                    }
                    nwf.a aVar = this.this$0.b;
                    String str4 = elb0Var.b;
                    BoundingBox a3 = aVar.a(i6, this.$originBbox, str4);
                    String str5 = this.this$0.g;
                    L l = L.a;
                    l.getClass();
                    if (L.m(LoggerOutputTarget.NONE)) {
                        yvjVar = yvjVar2;
                    } else {
                        L.LogType logType = L.LogType.d;
                        StringBuilder sb = new StringBuilder("avatarGeometry = ");
                        Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                        yvjVar = yvjVar2;
                        sb.append(a3.geoJsonString(true));
                        L.u(l, logType, new Object[]{str5, sb.toString()});
                    }
                    a3.getClass();
                    if (a3 != BoundingBox.e && this.$filtered.get(new StringId(str4)) == null) {
                        for (gox goxVar : this.$intersections) {
                            String str6 = goxVar.a;
                            BoundingBox boundingBox = goxVar.b;
                            iyx.e(yvjVar.getCoroutineContext());
                            akt aktVar2 = this.$filtered.get(new StringId(str6));
                            if (aktVar2 != null && !aktVar2.b.b.equals(str4)) {
                                if (VisibleStyle.p(i6) && (VisibleStyle.p(aktVar2.d) || VisibleStyle.l(aktVar2.d))) {
                                    break;
                                }
                                if (!VisibleStyle.g(aktVar2.d) || !VisibleStyle.g(i6) || VisibleStyle.j(aktVar2.d) == VisibleStyle.j(i6)) {
                                    int i7 = aktVar2.d;
                                    int j = VisibleStyle.j(i7);
                                    if (VisibleStyle.f(i7)) {
                                        j += 32;
                                    }
                                    if (VisibleStyle.e(i7)) {
                                        j += 128;
                                    }
                                    int j2 = VisibleStyle.j(i6);
                                    if (VisibleStyle.f(i6)) {
                                        j2 += 32;
                                    }
                                    if (VisibleStyle.e(i6)) {
                                        j2 += 128;
                                    }
                                    if (j == j2 && boundingBox.b(a3)) {
                                        str = str4;
                                        break;
                                    }
                                } else if (boundingBox.b(a3)) {
                                    str = str4;
                                    break;
                                }
                            }
                        }
                        str = null;
                        if (str != null) {
                            q7o.k(a3);
                            arrayList.add(aktVar);
                        } else {
                            this.$filtered.put(new StringId(str4), new akt(elb0Var, aktVar.c, i6));
                            this.$intersections.add(new gox(i6, a3, str4));
                            this.$fillStrategy.e(b);
                            if (this.$fillStrategy.f(b, an10.b(this.$zoomLevel), this.$style)) {
                                List<akt> list = this.$clusters;
                                int i8 = i2 + 1;
                                int size2 = list.size();
                                arrayList.addAll(i8 > size2 ? EmptyList.b : list.subList(i8, size2));
                            }
                        }
                    }
                    i5 = i2 + 1;
                    size = i;
                    yvjVar2 = yvjVar;
                }
            }
            yvjVar = yvjVar2;
            i = size;
            i2 = i5;
            i5 = i2 + 1;
            size = i;
            yvjVar2 = yvjVar;
        }
        this.$fillStrategy.g(b, an10.b(this.$zoomLevel), this.$style);
        Trace.endSection();
        return arrayList;
    }
}
