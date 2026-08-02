package defpackage;

import com.yandex.go.image.domain.requests.a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class itk implements hxy {
    public final /* synthetic */ int a = 0;
    public final AtomicReference b;

    public itk(a aVar, ltk ltkVar) {
        this.b = new AtomicReference(new Pair(aVar, ltkVar));
    }

    @Override // defpackage.hxy
    public final void cancel() {
        int i = this.a;
        AtomicReference atomicReference = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) atomicReference.getAndSet(null);
                if (pair != null) {
                    a aVar = (a) pair.getFirst();
                    ((ltk) pair.getSecond()).a.set(null);
                    aVar.cancel();
                    break;
                }
                break;
            default:
                Pair pair2 = (Pair) atomicReference.getAndSet(null);
                if (pair2 != null) {
                    g18 g18Var = (g18) pair2.getFirst();
                    ((ktk) pair2.getSecond()).a.set(null);
                    g18Var.cancel();
                    break;
                }
                break;
        }
    }

    public itk(tac tacVar, ktk ktkVar) {
        this.b = new AtomicReference(new Pair(tacVar, ktkVar));
    }
}
