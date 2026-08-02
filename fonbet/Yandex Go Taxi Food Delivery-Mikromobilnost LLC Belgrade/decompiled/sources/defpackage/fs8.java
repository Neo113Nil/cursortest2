package defpackage;

import android.app.Activity;

/* loaded from: classes13.dex */
public final class fs8 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ fs8(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                if (activity != null) {
                    kf91.c(activity);
                    break;
                }
                break;
            default:
                if (activity != null) {
                    kf91.c(activity);
                    break;
                }
                break;
        }
    }
}
