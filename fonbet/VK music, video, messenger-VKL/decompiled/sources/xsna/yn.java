package xsna;

import com.vk.lists.c;

/* compiled from: AccountGetBannedPagedDataProvider.kt */
/* loaded from: classes18.dex */
public final class yn implements c.l<u06> {
    public final ee7 b;
    public final v34 c;
    public final e40 d;
    public final io.reactivex.rxjava3.disposables.b e;

    public yn(ee7 ee7Var, v34 v34Var, e40 e40Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = ee7Var;
        this.c = v34Var;
        this.d = e40Var;
        this.e = bVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<u06> hj(com.vk.lists.c cVar, boolean z) {
        return this.b.b(0, cVar.k());
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<u06> ui(int i, com.vk.lists.c cVar) {
        return this.b.b(i, cVar.k());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<u06> qVar, boolean z, com.vk.lists.c cVar) {
        int i = 0;
        this.e.b(qVar.K().subscribe(new wn(new vn(cVar, this, z, i), 0), new xn(new p1(this, 2), i)));
    }
}
