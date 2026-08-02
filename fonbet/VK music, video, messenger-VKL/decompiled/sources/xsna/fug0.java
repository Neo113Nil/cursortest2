package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.dug0;

/* compiled from: RxFileDownloader.java */
/* loaded from: classes17.dex */
public final class fug0 extends cas {
    public long b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ dug0.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fug0(dug0.d dVar, bn8 bn8Var, AtomicBoolean atomicBoolean) {
        super(bn8Var);
        this.d = dVar;
        this.c = atomicBoolean;
        this.b = 0L;
    }

    @Override // xsna.cas, xsna.agk0
    public final long read(vl8 vl8Var, long j) throws IOException {
        long read = super.read(vl8Var, j);
        AtomicBoolean atomicBoolean = this.c;
        boolean z = atomicBoolean.get();
        dug0.d dVar = this.d;
        if (z) {
            atomicBoolean.set(false);
            if (!dVar.e.h()) {
                dVar.e.onNext(new dug0.c(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null));
            }
        }
        this.b += read != -1 ? read : 0L;
        if (dVar.e.h()) {
            throw new dug0.b();
        }
        if (dVar.d.contentLength() == 0) {
            dVar.e.onNext(new dug0.c());
            return read;
        }
        dVar.e.onNext(dug0.c.b(this.b / dVar.d.contentLength()));
        return read;
    }
}
