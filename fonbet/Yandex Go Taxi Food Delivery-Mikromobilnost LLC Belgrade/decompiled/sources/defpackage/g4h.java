package defpackage;

import com.yandex.quark.lite.b;
import com.yandex.quark.utils.Disposable;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes8.dex */
public final class g4h implements rig0 {
    public final e4h a;
    public final e4h b;

    public g4h() {
        e4h e4hVar = new e4h();
        this.a = e4hVar;
        this.b = e4hVar;
    }

    @Override // defpackage.rig0
    public final CompletableFuture a(b bVar) {
        return CompletableFuture.completedFuture(q5z.N());
    }

    @Override // defpackage.rig0
    public final CompletableFuture b(b bVar) {
        bVar.e(this.a);
        return CompletableFuture.completedFuture(q5z.N());
    }

    @Override // defpackage.rig0
    public final String getName() {
        return "DeeplinksModule";
    }

    @Override // defpackage.rig0
    public final CompletableFuture init() {
        return CompletableFuture.completedFuture(new lyj0(zy11.a));
    }

    @Override // defpackage.rig0
    public final CompletableFuture stop() {
        e4h e4hVar = this.a;
        synchronized (e4hVar) {
            try {
                Disposable disposable = e4hVar.B;
                if (disposable != null) {
                    disposable.dispose();
                }
                e4hVar.B = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return CompletableFuture.completedFuture(q5z.N());
    }
}
