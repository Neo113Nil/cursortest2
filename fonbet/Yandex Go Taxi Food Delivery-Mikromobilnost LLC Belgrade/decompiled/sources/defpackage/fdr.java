package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public final class fdr {
    public final Context a;

    public fdr(Context context) {
        this.a = context;
    }

    public final String a() {
        long j;
        Context context = this.a;
        try {
            j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            j = 0;
        }
        return mpb1.c(j);
    }
}
