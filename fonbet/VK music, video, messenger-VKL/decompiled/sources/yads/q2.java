package yads;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class q2 implements f2 {
    public final Activity a;
    public final z9 b;

    public q2(Activity activity, z9 z9Var) {
        this.a = activity;
        this.b = z9Var;
    }

    public final void a(int i, Bundle bundle) {
        z9 z9Var = this.b;
        if (z9Var != null) {
            z9Var.a(i, bundle);
        }
    }

    public final void a(int i) {
        try {
            this.a.setRequestedOrientation(i);
        } catch (Exception unused) {
        }
    }
}
