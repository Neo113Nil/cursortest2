package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Message;
import defpackage.n920;
import defpackage.uf10;
import defpackage.wzy;
import defpackage.xe10;
import defpackage.xzy;

/* loaded from: classes10.dex */
final class MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback implements Handler.Callback {
    private static final int ERROR_POLL_INTERVAL_MS = 100;
    private xe10 mediaPeriod;
    private uf10 mediaSource;
    private final k mediaSourceCaller = new k(this);
    final /* synthetic */ n920 this$0;

    public MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback(n920 n920Var) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            int i2 = n920.a;
            throw null;
        }
        if (i == 2) {
            try {
                xe10 xe10Var = this.mediaPeriod;
                if (xe10Var == null) {
                    uf10 uf10Var = this.mediaSource;
                    uf10Var.getClass();
                    uf10Var.maybeThrowSourceInfoRefreshError();
                } else {
                    xe10Var.j();
                }
                int i3 = n920.a;
                throw null;
            } catch (Exception unused) {
                int i4 = n920.a;
                throw null;
            }
        }
        if (i == 3) {
            xe10 xe10Var2 = this.mediaPeriod;
            xe10Var2.getClass();
            wzy wzyVar = new wzy();
            wzyVar.a = 0L;
            xe10Var2.n(new xzy(wzyVar));
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (this.mediaPeriod != null) {
            uf10 uf10Var2 = this.mediaSource;
            uf10Var2.getClass();
            uf10Var2.releasePeriod(this.mediaPeriod);
        }
        uf10 uf10Var3 = this.mediaSource;
        uf10Var3.getClass();
        uf10Var3.releaseSource(this.mediaSourceCaller);
        int i5 = n920.a;
        throw null;
    }
}
