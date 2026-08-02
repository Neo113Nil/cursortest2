package xsna;

import android.view.OrientationEventListener;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eki0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ eki0(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                OrientationEventListener orientationEventListener = (OrientationEventListener) this.c.element;
                if (orientationEventListener != null) {
                    orientationEventListener.disable();
                    break;
                }
                break;
            default:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c.element;
                if (cVar != null) {
                    cVar.dispose();
                    break;
                }
                break;
        }
    }
}
