package xsna;

import com.vk.log.L;
import com.vk.vmoji.storage.api.VmojiStorageException;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class et0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ et0(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                qgi0.q((tgi0) obj, this.c);
                return s3q0.a;
            case 2:
                mol0 mol0Var = (mol0) obj;
                return mol0.a(mol0Var, null, null, null, null, ggr.a(mol0Var.g, false, this.c, null, 111), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            default:
                L.i(new VmojiStorageException(go9.b("Can't unregister accessor of a loader for ", this.c), (Throwable) obj));
                return s3q0.a;
        }
    }
}
