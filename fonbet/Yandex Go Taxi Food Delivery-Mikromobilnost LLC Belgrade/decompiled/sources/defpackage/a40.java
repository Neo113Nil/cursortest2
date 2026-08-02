package defpackage;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class a40 implements upr {
    public final Activity a;

    @Override // defpackage.upr
    public void e(int i, Intent intent) {
        Activity activity = this.a;
        activity.setResult(i, intent);
        activity.finish();
    }
}
