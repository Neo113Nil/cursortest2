package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.medianative.MediaNative;
import xsna.s8k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d60 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ d60(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Successfully subscribed to sync events."});
                    break;
                }
                break;
            case 1:
                MediaNative.checkOrLoadCallEffects();
                break;
            default:
                new s8k.e(false);
                break;
        }
    }
}
