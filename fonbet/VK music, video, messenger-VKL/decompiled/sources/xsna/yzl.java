package xsna;

import org.chromium.base.ThreadUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yzl implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ yzl(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                try {
                    com.vkontakte.android.data.b.m();
                    break;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return;
                }
            default:
                ThreadUtils.sThreadAssertsDisabledForTesting = false;
                break;
        }
    }
}
