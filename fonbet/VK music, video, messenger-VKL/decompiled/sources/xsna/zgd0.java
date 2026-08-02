package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: ProcessText.android.kt */
/* loaded from: classes11.dex */
public final class zgd0 {
    public static final void a(tco0 tco0Var, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (qko0.c(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) rdi.e.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        tco0Var.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            tco0Var.a.j(new edo0(new xgd0(i), resolveInfo.loadLabel(packageManager).toString(), 0, new izs() { // from class: xsna.ygd0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    rdi.f.invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, new qko0(j));
                    ((jdo0) obj).close();
                    return s3q0.a;
                }
            }));
        }
        tco0Var.a();
    }
}
