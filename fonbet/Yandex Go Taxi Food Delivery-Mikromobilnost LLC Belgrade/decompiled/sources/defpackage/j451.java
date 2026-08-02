package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;

/* loaded from: classes8.dex */
public final class j451 extends n451 {
    public final tls b;
    public final Space c;

    public j451(Context context, tls tlsVar) {
        this.b = tlsVar;
        this.c = new Space(context);
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    @Override // defpackage.n451
    public final /* bridge */ /* synthetic */ void c(eg20 eg20Var) {
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    public final String toString() {
        return "Spacer";
    }
}
