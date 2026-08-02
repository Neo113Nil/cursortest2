package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.suggest.impl.view.error.a;

/* loaded from: classes14.dex */
public final class jfw0 extends mao {
    public final /* synthetic */ a a;

    public jfw0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        return a.a(this.a, viewGroup);
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        a aVar = this.a;
        pzt0 pzt0Var = aVar.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.i = null;
        aVar.e();
        aVar.b.d = false;
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
