package defpackage;

import com.google.android.material.progressindicator.BaseProgressIndicator;

/* loaded from: classes11.dex */
public final class k85 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseProgressIndicator b;

    public /* synthetic */ k85(BaseProgressIndicator baseProgressIndicator, int i) {
        this.a = i;
        this.b = baseProgressIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BaseProgressIndicator baseProgressIndicator = this.b;
        switch (i) {
            case 0:
                baseProgressIndicator.internalShow();
                break;
            default:
                baseProgressIndicator.internalHide();
                baseProgressIndicator.lastShowStartTime = -1L;
                break;
        }
    }
}
