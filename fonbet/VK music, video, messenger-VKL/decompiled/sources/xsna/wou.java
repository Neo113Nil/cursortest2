package xsna;

import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.group.Group;

/* compiled from: Groups.java */
/* loaded from: classes5.dex */
public final class wou implements hx2, vq70, nto0 {
    public Object b;

    public /* synthetic */ wou(Object obj) {
        this.b = obj;
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        Group group = (Group) obj;
        uou uouVar = (uou) this.b;
        uouVar.f.getClass();
        epu.d(group);
        uouVar.d(group);
    }

    @Override // xsna.hx2
    public void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        com.vk.metrics.eventtracking.b.a.a(vKApiExecutionException);
    }

    @Override // xsna.vq70
    public void onNext(Object obj) {
        for (am8 am8Var : ((zh50) this.b).c) {
            am8Var.b(obj);
            am8Var.a();
        }
    }

    @Override // xsna.nto0
    public void seekTo(long j) {
        o5y0 o5y0Var = (o5y0) this.b;
        if (o5y0Var != null) {
            o5y0Var.c(o5y0Var.a, "seekTo", Long.valueOf(j / 1000));
        }
    }

    @Override // xsna.vq70
    public void onComplete() {
    }

    @Override // xsna.vq70
    public void a(hgn hgnVar) {
    }

    @Override // xsna.vq70
    public void onError(Throwable th) {
    }
}
