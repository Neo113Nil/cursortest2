package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: PriorityDataSource.java */
/* loaded from: classes12.dex */
public final class ubd0 implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final PriorityTaskManager b;
    public final int c;

    public ubd0(androidx.media3.datasource.a aVar, PriorityTaskManager priorityTaskManager, int i) {
        aVar.getClass();
        this.a = aVar;
        priorityTaskManager.getClass();
        this.b = priorityTaskManager;
        this.c = i;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        this.b.c(this.c);
        return this.a.open(evkVar);
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.b.c(this.c);
        return this.a.read(bArr, i, i2);
    }
}
