package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import io.antmedia.rtmp_client.RtmpClient;
import java.io.IOException;

/* compiled from: RtmpDataSource.java */
/* loaded from: classes12.dex */
public final class gqg0 extends gc6 {
    public static final /* synthetic */ int t = 0;

    @Nullable
    public RtmpClient r;

    @Nullable
    public Uri s;

    /* compiled from: RtmpDataSource.java */
    public static final class a implements a.InterfaceC0045a {
        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new gqg0();
        }
    }

    static {
        nr10.a("media3.datasource.rtmp");
    }

    public gqg0() {
        super(true);
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        if (this.s != null) {
            this.s = null;
            transferEnded();
        }
        RtmpClient rtmpClient = this.r;
        if (rtmpClient != null) {
            rtmpClient.a();
            this.r = null;
        }
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.s;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws RtmpClient.RtmpIOException {
        transferInitializing(evkVar);
        RtmpClient rtmpClient = new RtmpClient();
        this.r = rtmpClient;
        rtmpClient.b(evkVar.a.toString());
        this.s = evkVar.a;
        transferStarted(evkVar);
        return -1L;
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        RtmpClient rtmpClient = this.r;
        String str = y2r0.a;
        int c = rtmpClient.c(bArr, i, i2);
        if (c == -1) {
            return -1;
        }
        bytesTransferred(c);
        return c;
    }
}
