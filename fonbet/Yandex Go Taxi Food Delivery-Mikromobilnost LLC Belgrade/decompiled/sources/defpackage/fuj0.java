package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class fuj0 implements ov00 {
    @Override // defpackage.ov00
    public final Object a(Object obj, lg70 lg70Var) {
        int intValue = ((Number) obj).intValue();
        Context context = lg70Var.a;
        try {
            if (context.getResources().getResourceEntryName(intValue) == null) {
                return null;
            }
            return yri0.g("android.resource://" + context.getPackageName() + "/" + intValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
