package defpackage;

import android.net.Uri;
import coil.fetch.a;
import com.adjust.sdk.Constants;

/* loaded from: classes.dex */
public final class iwu implements owq {
    public final i3y a;
    public final i3y b;
    public final boolean c;

    public iwu(i3y i3yVar, i3y i3yVar2, boolean z) {
        this.a = i3yVar;
        this.b = i3yVar2;
        this.c = z;
    }

    @Override // defpackage.owq
    public final rwq a(Object obj, qg70 qg70Var) {
        Uri uri = (Uri) obj;
        if (!jl40.l(uri.getScheme(), "http") && !jl40.l(uri.getScheme(), Constants.SCHEME)) {
            return null;
        }
        return new a(uri.toString(), qg70Var, this.a, this.b, this.c);
    }
}
