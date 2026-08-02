package xsna;

import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import org.webrtc.BreakpadBridge;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class odd implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ odd(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                qdd.e.compareAndSet(true, false);
                break;
            default:
                String[] strArr = DebugDevSettingsFragment.t0;
                BreakpadBridge.crash();
                break;
        }
    }
}
