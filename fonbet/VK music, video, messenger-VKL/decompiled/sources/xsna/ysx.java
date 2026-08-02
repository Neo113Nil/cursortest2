package xsna;

import android.content.Context;
import android.view.View;
import xsna.b5x;

/* compiled from: isInstanceOf.kt */
/* loaded from: classes18.dex */
public final class ysx extends gl10 {
    public final rfc b;

    public ysx(rfc rfcVar) {
        this.b = rfcVar;
    }

    @Override // xsna.gl10, xsna.el10
    public final boolean b(b5x.c cVar, Context context) {
        return this.b.c(cVar != null ? cVar.e : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gl10, xsna.el10
    public final boolean d(b5x b5xVar) {
        return b(b5xVar.getDesignInspectorParams(), ((View) b5xVar).getContext());
    }
}
