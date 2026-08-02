package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes12.dex */
public final class am51 implements jbz {
    public final ast a;

    public am51(ast astVar, jlh jlhVar) {
        this.a = astVar;
    }

    @Override // defpackage.jbz
    public final Typeface a(Context context) {
        return this.a.d();
    }

    @Override // defpackage.jbz
    public final Integer b(boolean z) {
        return Integer.valueOf(z ? m2h0.ic_default_logo : m2h0.ic_default_logo_night);
    }
}
