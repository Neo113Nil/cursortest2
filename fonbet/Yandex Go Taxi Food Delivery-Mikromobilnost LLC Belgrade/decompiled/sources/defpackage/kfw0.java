package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.suggest.impl.view.error.a;

/* loaded from: classes14.dex */
public final class kfw0 extends pjm0 {
    public final /* synthetic */ a a;

    public kfw0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        return this.a.f();
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

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
