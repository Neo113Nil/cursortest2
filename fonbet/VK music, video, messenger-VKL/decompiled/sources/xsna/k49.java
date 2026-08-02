package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k49 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k49(q49 q49Var, String str, boolean z, CallId callId) {
        this.d = q49Var;
        this.e = str;
        this.c = z;
        this.f = callId;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                q49 q49Var = (q49) this.d;
                String str = (String) this.e;
                CallId callId = (CallId) this.f;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49Var.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().a(str, this.c, callId);
                }
                break;
            default:
                wy50 wy50Var = (wy50) this.d;
                FragmentImpl fragmentImpl = (FragmentImpl) this.e;
                FragmentImpl fragmentImpl2 = (FragmentImpl) this.f;
                wy50Var.a.e(fragmentImpl, fragmentImpl2, this.c, new pd4(25));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k49(wy50 wy50Var, FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2, boolean z) {
        this.d = wy50Var;
        this.e = fragmentImpl;
        this.f = fragmentImpl2;
        this.c = z;
    }
}
