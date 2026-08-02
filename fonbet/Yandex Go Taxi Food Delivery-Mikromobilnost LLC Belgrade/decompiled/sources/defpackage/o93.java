package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class o93 implements owq {
    @Override // defpackage.owq
    public final rwq a(Object obj, qg70 qg70Var) {
        Uri uri = (Uri) obj;
        if (m.d(uri)) {
            return new q93(uri, qg70Var, 0);
        }
        return null;
    }
}
