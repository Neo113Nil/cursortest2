package defpackage;

import android.app.Activity;

/* loaded from: classes13.dex */
public final class js8 implements i1k {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ int b;

    public js8(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        Activity activity = this.a;
        if (activity != null) {
            activity.setRequestedOrientation(this.b);
        }
    }
}
