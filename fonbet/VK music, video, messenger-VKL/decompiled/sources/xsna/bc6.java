package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ActivityLauncher.kt */
/* loaded from: classes3.dex */
public final class bc6 implements u90 {
    public final Context a;
    public final wzs<Intent, Integer, s3q0> b;
    public final Activity c;

    /* JADX WARN: Multi-variable type inference failed */
    public bc6(Context context, wzs<? super Intent, ? super Integer, s3q0> wzsVar) {
        this.a = context;
        this.b = wzsVar;
        this.c = e3m.h(context);
    }

    @Override // xsna.u90
    public final Context B() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u90
    public final void D(Intent intent, int i, Bundle bundle) {
        Activity activity = this.c;
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        FragmentImpl u = Y != null ? Y.u() : null;
        if (u == null || !Y.q(i, intent, u)) {
            wzs<Intent, Integer, s3q0> wzsVar = this.b;
            if (wzsVar != null) {
                wzsVar.invoke(intent, Integer.valueOf(i));
            } else if (activity != 0) {
                activity.startActivityForResult(intent, i, bundle);
            } else {
                com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Context is not activity context. Can't start for result!"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u90
    public final void E(Intent intent) {
        Activity activity = this.c;
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (activity == 0) {
            this.a.startActivity(intent.addFlags(268435456), null);
        } else if (Y == null || !Y.r(intent)) {
            activity.startActivity(intent, null);
        }
    }
}
