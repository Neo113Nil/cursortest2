package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class phx implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ phx(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r3 == null) goto L13;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        vx70.b h;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                shx shxVar = (shx) obj2;
                final gy70 gy70Var = (gy70) obj;
                vx70 vx70Var = shxVar.b;
                final mkx mkxVar = vx70Var instanceof mkx ? (mkx) vx70Var : null;
                if (mkxVar != null) {
                    final long j = shxVar.h;
                    h = (vx70.b) vhk0.h(mkxVar.j, "OkHttpExecutor", new izs() { // from class: xsna.gkx
                        @Override // xsna.izs
                        public final Object invoke(Object obj3) {
                            mkx mkxVar2 = mkxVar;
                            return (vx70.b) vhk0.h(mkxVar2.j, "OkHttpExecutor Method Stream", new com.vk.movika.sdk.base.ui.t0(j, mkxVar2, gy70Var), 6);
                        }
                    }, 4);
                    break;
                }
                h = vx70Var.h(gy70Var);
                shxVar.c(h.b(), gy70Var);
                return h;
            default:
                BridgeComponent bridgeComponent = (BridgeComponent) obj2;
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new pga0(bridgeComponent.id(), ((NewsFeedBridgeComponent) obj).Ad(), bridgeComponent.ob());
        }
    }
}
