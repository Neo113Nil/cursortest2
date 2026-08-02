package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import java.util.List;

/* compiled from: PhotoTagPagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class wba0 implements c.m<List<? extends qba0>> {
    public final UserId b;
    public final oca0 c;
    public final int d;
    public final int e;
    public final hca0 f;
    public final bk30 g;

    public wba0(UserId userId, oca0 oca0Var, int i, int i2, hca0 hca0Var, bk30 bk30Var) {
        this.b = userId;
        this.c = oca0Var;
        this.d = i;
        this.e = i2;
        this.f = hca0Var;
        this.g = bk30Var;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<List<? extends qba0>> O9(String str, com.vk.lists.c cVar) {
        return this.c.c(this.d, this.e, this.b, false).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<qba0>> hj(com.vk.lists.c cVar, boolean z) {
        return this.c.c(z ? 100 : this.d, z ? 100 : this.e, this.b, z).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<qba0>> qVar, boolean z, com.vk.lists.c cVar) {
        this.f.e.b(qVar.subscribe(new xj50(new a5(18, cVar, this), 4), new x150(new uv20(this, 18), 3)));
    }
}
