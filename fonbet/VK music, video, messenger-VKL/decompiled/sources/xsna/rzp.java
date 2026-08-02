package xsna;

import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.search.ui.impl.catalog.GlobalSearchVideosCatalogFragment;
import java.util.Queue;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventHubServiceClient.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class rzp extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzp(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                final Queue queue = (Queue) this.receiver;
                return new Executor() { // from class: xsna.tzp
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        queue.add(new Result(runnable));
                    }
                };
            case 1:
                xz70 xz70Var = (xz70) this.receiver;
                z1h0 z1h0Var = xz70Var.a;
                if (z1h0Var instanceof GlobalSearchVideosCatalogFragment) {
                    GlobalSearchVideosCatalogFragment globalSearchVideosCatalogFragment = (GlobalSearchVideosCatalogFragment) z1h0Var;
                    s6y s6yVar = new s6y(xz70Var, 19);
                    if (globalSearchVideosCatalogFragment.P != null) {
                        s6yVar.invoke();
                    } else {
                        globalSearchVideosCatalogFragment.V = s6yVar;
                    }
                } else if (z1h0Var instanceof vxh0) {
                    ((vxh0) z1h0Var).qb();
                } else if (xz70Var.g != null) {
                    swh0 swh0Var = z1h0Var instanceof swh0 ? (swh0) z1h0Var : null;
                    if (swh0Var != null) {
                        swh0Var.bd();
                    }
                    xz70Var.b(false);
                }
                return s3q0.a;
            default:
                return ((VkFastLoginView) this.receiver).getTrackingElement();
        }
    }
}
