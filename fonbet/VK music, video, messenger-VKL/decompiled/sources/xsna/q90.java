package xsna;

import android.app.Activity;
import android.content.Context;

/* compiled from: PermissionHost.kt */
/* loaded from: classes4.dex */
public final class q90 implements xx90 {
    public final Activity a;
    public final Integer b;

    public q90(Activity activity, Integer num) {
        this.a = activity;
        this.b = num;
    }

    @Override // xsna.xx90
    public final Activity a() {
        return this.a;
    }

    @Override // xsna.xx90
    public final Context b() {
        Activity activity = this.a;
        Integer num = this.b;
        return num != null ? new l7s(activity, num.intValue()) : activity;
    }
}
