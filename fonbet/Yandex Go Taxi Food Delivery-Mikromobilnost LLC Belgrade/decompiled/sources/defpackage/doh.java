package defpackage;

import com.yandex.quark.lite.b;
import com.yandex.quark.utils.Disposable;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes8.dex */
public final class doh implements rig0 {
    public final coh a;
    public final coh b;

    public doh() {
        coh cohVar = new coh();
        this.a = cohVar;
        this.b = cohVar;
    }

    @Override // defpackage.rig0
    public final CompletableFuture a(b bVar) {
        syj0 e = bVar.e(this.b);
        if (e instanceof lyj0) {
            return CompletableFuture.completedFuture(q5z.N());
        }
        if (e instanceof jyj0) {
            return CompletableFuture.completedFuture(new jyj0(new p530(g8e.o("Failed to register yango feature: ", ((jhg0) ((jyj0) e).a).b))));
        }
        w511.b();
        return null;
    }

    @Override // defpackage.rig0
    public final CompletableFuture b(b bVar) {
        return CompletableFuture.completedFuture(new lyj0(zy11.a));
    }

    @Override // defpackage.rig0
    public final String getName() {
        return "YangoModule";
    }

    @Override // defpackage.rig0
    public final CompletableFuture init() {
        return CompletableFuture.completedFuture(new lyj0(zy11.a));
    }

    @Override // defpackage.rig0
    public final CompletableFuture stop() {
        coh cohVar = this.a;
        synchronized (cohVar) {
            try {
                Disposable disposable = cohVar.c;
                if (disposable != null) {
                    disposable.dispose();
                }
                cohVar.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return CompletableFuture.completedFuture(q5z.N());
    }
}
