package xsna;

import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f6r implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f6r(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((FeedbackListenerManagerImpl) this.d).tryToRemoveOld(this.c);
                break;
            default:
                zvr zvrVar = (zvr) this.d;
                if (this.c == zvrVar.h) {
                    zvrVar.b();
                    break;
                }
                break;
        }
    }
}
