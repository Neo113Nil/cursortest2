package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n60 implements io.reactivex.rxjava3.functions.a {
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "All actions successfully deleted."});
    }
}
