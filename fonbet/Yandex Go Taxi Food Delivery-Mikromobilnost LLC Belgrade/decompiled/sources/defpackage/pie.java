package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class pie implements owq {
    @Override // defpackage.owq
    public final rwq a(Object obj, qg70 qg70Var) {
        Uri uri = (Uri) obj;
        if (jl40.l(uri.getScheme(), "content")) {
            return new q93(uri, qg70Var, 1);
        }
        return null;
    }
}
