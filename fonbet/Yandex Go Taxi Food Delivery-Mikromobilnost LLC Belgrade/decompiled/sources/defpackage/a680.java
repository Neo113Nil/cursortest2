package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public final /* synthetic */ class a680 implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ a680(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        AtomicReference atomicReference = this.b;
        switch (i) {
            case 0:
                ((l8x) atomicReference.get()).a(null);
                break;
            case 1:
                ((l8x) atomicReference.get()).a(null);
                break;
            case 2:
                ((l8x) atomicReference.get()).a(null);
                break;
            default:
                ((l8x) atomicReference.get()).a(null);
                break;
        }
    }
}
