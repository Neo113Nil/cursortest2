package defpackage;

import android.content.res.Resources;
import android.net.Uri;

/* loaded from: classes.dex */
public final class guj0 implements rv00 {
    @Override // defpackage.rv00
    public final Object a(Object obj, qg70 qg70Var) {
        int intValue = ((Number) obj).intValue();
        try {
            if (qg70Var.c().getResources().getResourceEntryName(intValue) == null) {
                return null;
            }
            return Uri.parse("android.resource://" + qg70Var.c().getPackageName() + '/' + intValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
