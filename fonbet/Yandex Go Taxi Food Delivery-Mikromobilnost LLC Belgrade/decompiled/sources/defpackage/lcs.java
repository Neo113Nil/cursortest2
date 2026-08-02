package defpackage;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes10.dex */
public final /* synthetic */ class lcs implements kds, bx60 {
    public final /* synthetic */ wls a;

    public /* synthetic */ lcs(wls wlsVar) {
        this.a = wlsVar;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        return (n751) this.a.invoke(view, n751Var);
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        this.a.invoke(str, bundle);
    }
}
