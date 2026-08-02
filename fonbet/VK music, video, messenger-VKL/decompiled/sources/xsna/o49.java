package xsna;

import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class o49 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o49(q49 q49Var, CallId callId, boolean z) {
        this.d = q49Var;
        this.e = callId;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                q49 q49Var = (q49) this.d;
                CallId callId = (CallId) this.e;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49Var.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().p(callId, this.c);
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(((Boolean) ((FunctionReferenceImpl) this.d).invoke()).booleanValue() ? ((Boolean) ((PropertyReference0Impl) this.e).get()).booleanValue() : this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o49(gzs gzsVar, PropertyReference0Impl propertyReference0Impl, boolean z) {
        this.d = (FunctionReferenceImpl) gzsVar;
        this.e = propertyReference0Impl;
        this.c = z;
    }
}
