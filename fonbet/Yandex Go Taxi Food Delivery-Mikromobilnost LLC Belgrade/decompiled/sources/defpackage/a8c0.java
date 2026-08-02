package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public final class a8c0 extends mao implements nwy0 {
    public final g8c0 a;
    public final c8c0 b;
    public final x8c0 c;

    public a8c0(g8c0 g8c0Var, c8c0 c8c0Var, x8c0 x8c0Var) {
        this.a = g8c0Var;
        this.b = c8c0Var;
        this.c = x8c0Var;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        return this.b.a(viewGroup, new z7c0(this, 0), new z7c0(this, 1));
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
