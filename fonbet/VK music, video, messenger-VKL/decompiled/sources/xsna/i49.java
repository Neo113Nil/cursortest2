package xsna;

import com.vk.log.L;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class i49 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i49(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                q49 q49Var = (q49) this.d;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49Var.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().r(this.c);
                }
                return s3q0.a;
            default:
                dsy dsyVar = (dsy) this.d;
                xqy xqyVar = (xqy) j5g.k0(dsyVar.i().f());
                return Boolean.valueOf(xqyVar != null && this.c && xqyVar.getIndex() >= dsyVar.i().d() + (-5));
        }
    }
}
