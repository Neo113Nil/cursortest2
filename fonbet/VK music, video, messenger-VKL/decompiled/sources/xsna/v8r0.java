package xsna;

import com.vk.lists.c;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.u8r0;

/* compiled from: VKAppsCatalogPresenter.kt */
/* loaded from: classes6.dex */
public final class v8r0 implements c.m<u8r0.a> {
    public final /* synthetic */ u8r0 b;

    public v8r0(u8r0 u8r0Var) {
        this.b = u8r0Var;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<u8r0.a> O9(String str, com.vk.lists.c cVar) {
        return u8r0.g(this.b, str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<u8r0.a> hj(com.vk.lists.c cVar, boolean z) {
        return u8r0.g(this.b, null);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<u8r0.a> qVar, boolean z, com.vk.lists.c cVar) {
        u8r0 u8r0Var = this.b;
        uk40 uk40Var = new uk40(new s8r0(u8r0Var, z), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        u8r0Var.j().b(qVar.E(uk40Var, lVar, kVar, kVar).F(new a960(new n99(xgx0.a, 11), 26)).subscribe(new qg60(new t8r0(u8r0Var, z, cVar), 19), new hu50(new whg0(u8r0Var, 17), 27)));
    }
}
