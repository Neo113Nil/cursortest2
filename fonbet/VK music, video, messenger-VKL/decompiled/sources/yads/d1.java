package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;
import xsna.epx;

/* loaded from: classes10.dex */
public final class d1 implements l1, ir2 {
    public final e1 a;
    public WeakReference b;
    public String c;

    public d1(e1 e1Var) {
        this.a = e1Var;
    }

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !string.equals(this.c)) {
            return;
        }
        this.a.b();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        Objects.toString(activity);
        qu2 a = gx2.a().a(activity);
        boolean z = false;
        boolean z2 = a != null && a.i();
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
            z = true;
        }
        WeakReference weakReference = this.b;
        if ((weakReference == null || !activity.equals((Activity) weakReference.get()) || z2) && (!z2 || z)) {
            return;
        }
        this.a.b();
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        Objects.toString(activity);
        if (this.b == null) {
            this.b = new WeakReference(activity);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        if (bundle == null || (weakReference = this.b) == null || !epx.f(activity, (Activity) weakReference.get())) {
            return;
        }
        String uuid = UUID.randomUUID().toString();
        this.c = uuid;
        bundle.putString("monetization_ads_activity_id", uuid);
    }
}
