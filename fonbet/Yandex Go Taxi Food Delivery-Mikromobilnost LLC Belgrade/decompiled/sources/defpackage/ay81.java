package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.a;

/* loaded from: classes11.dex */
public final class ay81 implements uz81 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ a d;

    public ay81(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = aVar;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // defpackage.uz81
    public final int zaa() {
        return 0;
    }

    @Override // defpackage.uz81
    public final void zab() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
