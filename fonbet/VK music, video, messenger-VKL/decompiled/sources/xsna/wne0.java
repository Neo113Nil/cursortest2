package xsna;

import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.qrcode.QRStatsTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wne0 implements izs {
    public final /* synthetic */ xne0 b;
    public final /* synthetic */ MediaStoreEntry c;
    public final /* synthetic */ int d;

    public /* synthetic */ wne0(xne0 xne0Var, MediaStoreEntry mediaStoreEntry, int i) {
        this.b = xne0Var;
        this.c = mediaStoreEntry;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        xne0 xne0Var = this.b;
        MediaStoreEntry mediaStoreEntry = this.c;
        int i = this.d;
        Throwable th = (Throwable) obj;
        L.i(th);
        xne0Var.b.b();
        QRStatsTracker.a.b(null, th.getMessage());
        if (mediaStoreEntry != null) {
            mediaStoreEntry.i = false;
        }
        if (i >= 0) {
            xne0Var.d.notifyItemChanged(i);
        }
        return s3q0.a;
    }
}
