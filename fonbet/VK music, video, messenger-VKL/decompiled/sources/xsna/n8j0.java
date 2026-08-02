package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.lists.c;

/* compiled from: ShareStoryNarrativePagedDataProvider.kt */
/* loaded from: classes16.dex */
public final class n8j0 implements c.m<VKList<Narrative>> {
    public final gzs<UserId> b;
    public final vu50 c;
    public final izs<VKList<Narrative>, s3q0> d;
    public final wzs<Throwable, izs<? super gzs<s3q0>, s3q0>, s3q0> e;
    public final io.reactivex.rxjava3.disposables.b f;

    /* JADX WARN: Multi-variable type inference failed */
    public n8j0(gzs<UserId> gzsVar, vu50 vu50Var, izs<? super VKList<Narrative>, s3q0> izsVar, wzs<? super Throwable, ? super izs<? super gzs<s3q0>, s3q0>, s3q0> wzsVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = gzsVar;
        this.c = vu50Var;
        this.d = izsVar;
        this.e = wzsVar;
        this.f = bVar;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<VKList<Narrative>> O9(String str, com.vk.lists.c cVar) {
        UserId invoke = this.b.invoke();
        return this.c.b(cVar.k(), invoke, str, true).F(new dh40(new ri0(26, this, cVar), 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8j0)) {
            return false;
        }
        n8j0 n8j0Var = (n8j0) obj;
        return epx.f(this.b, n8j0Var.b) && epx.f(this.c, n8j0Var.c) && epx.f(this.d, n8j0Var.d) && epx.f(this.e, n8j0Var.e) && epx.f(this.f, n8j0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + dq.c((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<Narrative>> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    public final String toString() {
        return "ShareStoryNarrativePagedDataProvider(ownerProvider=" + this.b + ", interactor=" + this.c + ", onNewNarrativesGet=" + this.d + ", onError=" + this.e + ", disposables=" + this.f + ')';
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<Narrative>> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.e(this.f, qVar.subscribe(new s520(new ufg0(2, cVar, this), 18)));
    }
}
