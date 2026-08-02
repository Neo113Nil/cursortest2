package xsna;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.vk.mediastore.storage.ClipsVideoStorage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsVideoStorage.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class nnf extends FunctionReferenceImpl implements wzs<DownloadRequest, a.b, androidx.media3.exoplayer.offline.d> {
    @Override // xsna.wzs
    public final androidx.media3.exoplayer.offline.d invoke(DownloadRequest downloadRequest, a.b bVar) {
        DownloadRequest downloadRequest2 = downloadRequest;
        a.b bVar2 = bVar;
        ClipsVideoStorage clipsVideoStorage = (ClipsVideoStorage) this.receiver;
        ClipsVideoStorage clipsVideoStorage2 = ClipsVideoStorage.a;
        clipsVideoStorage.getClass();
        if (y2r0.J(downloadRequest2.c, downloadRequest2.d) != 0) {
            return null;
        }
        Uri uri = downloadRequest2.c;
        List<StreamKey> list = downloadRequest2.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bpn0 bpn0Var = ClipsVideoStorage.b;
        ((pnf) bpn0Var.getValue()).getClass();
        long micros = timeUnit.toMicros(3000L);
        ((pnf) bpn0Var.getValue()).getClass();
        qb60 qb60Var = m63.b;
        if (qb60Var == null) {
            qb60Var = null;
        }
        return new xmk(uri, list, bVar2, micros, (efr) qb60Var.invoke());
    }
}
