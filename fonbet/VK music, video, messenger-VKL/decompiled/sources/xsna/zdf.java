package xsna;

import android.util.SparseArray;
import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zdf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zdf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                SparseArray sparseArray = (SparseArray) this.c;
                Map.Entry entry = (Map.Entry) obj;
                if (((ClipsPersistentStore.PersistedUpload) entry.getValue()).zb().c() != null && !((ClipsPersistentStore.PersistedUpload) entry.getValue()).Cb()) {
                    sparseArray.append(((ClipsPersistentStore.PersistedUpload) entry.getValue()).zb().f(), ((ClipsPersistentStore.PersistedUpload) entry.getValue()).zb());
                }
                return s3q0.a;
            case 1:
                return ((Callable) this.c).call();
            case 2:
                return new fbo((b2a) obj, (gkt0) this.c);
            case 3:
                return new HeaderView.c((b2a) obj, (m7a) this.c);
            default:
                hiv hivVar = ((t260) this.c).l;
                if (((NetworkClient.ClientType) obj) == NetworkClient.ClientType.CLIENT_API) {
                    hiv.k.getClass();
                    if (!epx.f(hivVar, hiv.p)) {
                        return new iiv(hivVar, new zcx(), new rej(1));
                    }
                }
                return null;
        }
    }
}
