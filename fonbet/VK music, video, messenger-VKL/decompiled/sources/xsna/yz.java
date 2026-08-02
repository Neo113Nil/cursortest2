package xsna;

import com.vk.superapp.api.dto.group.WebGroup;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.aex0;

/* compiled from: ActionController.kt */
/* loaded from: classes6.dex */
public final class yz implements aex0.d {
    public final /* synthetic */ com.vk.superapp.browser.internal.ui.shortcats.a a;
    public final /* synthetic */ WebGroup b;

    public yz(com.vk.superapp.browser.internal.ui.shortcats.a aVar, WebGroup webGroup) {
        this.a = aVar;
        this.b = webGroup;
    }

    @Override // xsna.aex0.d
    public final void a() {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 b = vdx0Var.j().b(this.b.b);
        ez ezVar = new ez(new dz(0), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = b.E(ezVar, lVar, kVar, kVar);
        new com.vk.movika.sdk.base.observable.i(1);
        ((ggu0) this.a.a.b).r.b(E.subscribe(new fz(), new hz(new x4(1), 0)));
    }

    @Override // xsna.aex0.d
    public final void b() {
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
    }
}
