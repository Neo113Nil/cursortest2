package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: PrimaryPlaybackAnalyticsBuffer.kt */
/* loaded from: classes3.dex */
public final class kad0 implements uw1<iwa0> {
    public final Object b;

    /* compiled from: PrimaryPlaybackAnalyticsBuffer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<o940<iwa0>, s940, List<? extends ax1>> {
        public static final a b = new a(2, o940.class, "clear", "clear(Lcom/vk/music/analytics/api/source/query/MusicAnalyticsQueryParams;)Ljava/util/List;", 0);

        @Override // xsna.wzs
        public final List<? extends ax1> invoke(o940<iwa0> o940Var, s940 s940Var) {
            return o940Var.f(s940Var);
        }
    }

    /* compiled from: PrimaryPlaybackAnalyticsBuffer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<o940<iwa0>, s940, List<? extends ax1>> {
        public static final b b = new b(2, o940.class, "read", "read(Lcom/vk/music/analytics/api/source/query/MusicAnalyticsQueryParams;)Ljava/util/List;", 0);

        @Override // xsna.wzs
        public final List<? extends ax1> invoke(o940<iwa0> o940Var, s940 s940Var) {
            return o940Var.e(s940Var);
        }
    }

    public kad0(khz khzVar, du70 du70Var) {
        this.b = msy.a(LazyThreadSafetyMode.NONE, new fg1(21, khzVar, du70Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList a(int i) {
        Map map = (Map) this.b.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if ((intValue & i) == intValue) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return c5g.v(linkedHashMap.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uw1
    public final void c(t940 t940Var) {
        iwa0 iwa0Var = (iwa0) t940Var;
        synchronized (this) {
            Iterator it = c5g.v(((Map) this.b.getValue()).values()).iterator();
            while (it.hasNext()) {
                ((o940) it.next()).g(iwa0Var);
            }
        }
    }

    @Override // xsna.bhz
    public final synchronized void d(ub4 ub4Var) {
        Iterator it = a(32).iterator();
        while (it.hasNext()) {
            o940 o940Var = (o940) it.next();
            if (o940Var instanceof bhz) {
                ((bhz) o940Var).d(ub4Var);
            }
        }
    }

    @Override // xsna.u940
    public final synchronized List<ax1> e(s940 s940Var) {
        return g(s940Var, b.b);
    }

    @Override // xsna.u940
    public final synchronized List<ax1> f(s940 s940Var) {
        return g(s940Var, a.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, xsna.s940] */
    public final List<ax1> g(s940 s940Var, wzs<? super o940<iwa0>, ? super s940, ? extends List<? extends ax1>> wzsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        i7z i7zVar = s940Var.a;
        int i = s940Var.b;
        ref$ObjectRef.element = new s940(i7zVar, i);
        ulp0 ulp0Var = new ulp0(new v2o0(new i5g(a(i)), new j5b0(ref$ObjectRef, 3)), new tn0(24, wzsVar, ref$ObjectRef));
        return ((s940) ref$ObjectRef.element).a.e ? rli0.A(dli0.d(new v2o0(ulp0Var, new jad0(ref$ObjectRef, 0)))) : rli0.A(dli0.d(ulp0Var));
    }
}
