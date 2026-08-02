package xsna;

import android.util.SparseArray;
import com.vk.im.engine.exceptions.CycleInvocationException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.vqo0;

/* compiled from: CycleInvocationDetector.kt */
/* loaded from: classes.dex */
public final class zpk {
    public static final /* synthetic */ qcy<Object>[] c;
    public static volatile boolean d;
    public final w2w a;
    public final wqo0 b = new wqo0(new nb8(1));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(zpk.class, "invocations", "getInvocations()Landroid/util/SparseArray;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public zpk(w2w w2wVar, zxc0 zxc0Var) {
        this.a = w2wVar;
    }

    public final SparseArray<mla> a() {
        qcy<Object> qcyVar = c[0];
        wqo0 wqo0Var = this.b;
        wqo0Var.getClass();
        return (SparseArray) vqo0.a.a(wqo0Var);
    }

    public final void b(e1w<?> e1wVar, mla mlaVar) {
        SparseArray<mla> a = a();
        u4q0 u4q0Var = zik0.a;
        String g0 = j5g.g0(new xik0(a), null, null, null, 0, new la2(20), 31);
        StringBuilder sb = new StringBuilder("Cycle Detected in ImEngine: ");
        sb.append("cause=" + mlaVar + ',');
        sb.append("cmd=" + e1wVar.getClass().getCanonicalName() + ',');
        StringBuilder sb2 = new StringBuilder("invoke_trace=");
        sb2.append(g0);
        sb.append(sb2.toString());
        String sb3 = sb.toString();
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        RuntimeException runtimeException = new RuntimeException(sb3);
        runtimeException.setStackTrace((StackTraceElement[]) rl3.H(5, Thread.currentThread().getStackTrace()).toArray(new StackTraceElement[0]));
        bVar.a(runtimeException);
        this.a.e1(this, new y580(rsr.x(aqw.p(mlaVar), new CycleInvocationException()), 10));
    }
}
