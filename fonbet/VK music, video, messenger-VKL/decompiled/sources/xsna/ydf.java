package xsna;

import android.view.View;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ydf implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ydf(AtomicInteger atomicInteger, UserId userId, int i, jed jedVar) {
        this.d = atomicInteger;
        this.e = userId;
        this.c = i;
        this.f = jedVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.d;
                UserId userId = (UserId) this.e;
                jed jedVar = (jed) this.f;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                int i = atomicInteger.get();
                if ((!clipVideoFile.O && !clipVideoFile.isEmpty()) || i >= 15) {
                    return io.reactivex.rxjava3.core.q.T(clipVideoFile);
                }
                atomicInteger.incrementAndGet();
                io.reactivex.rxjava3.internal.operators.completable.a0 r = io.reactivex.rxjava3.core.a.r(3000L, TimeUnit.MILLISECONDS);
                com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
                xr0 xr0Var = new xr0(17);
                cVar.getClass();
                return r.d(com.vk.clips.upload.vk.impl.uploader.c.k(userId, this.c, jedVar, xr0Var));
            default:
                jm00 jm00Var = (jm00) this.d;
                jm00Var.c(new k3v0(new azj((izs) this.f), (wh50) this.e, this.c));
                return (View) jm00Var;
        }
    }

    public /* synthetic */ ydf(jm00 jm00Var, wh50 wh50Var, izs izsVar, int i) {
        this.d = jm00Var;
        this.e = wh50Var;
        this.f = izsVar;
        this.c = i;
    }
}
