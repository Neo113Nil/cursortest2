package xsna;

import com.vk.dto.group.Group;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.lists.c;

/* compiled from: NewsfeedFilteredGroupsPagedDataProvider.kt */
/* loaded from: classes18.dex */
public final class ui60 implements c.m<cfr<Group>> {
    public final fz60 b;
    public final ed c;
    public final si60 d;
    public final io.reactivex.rxjava3.disposables.b e;

    public ui60(fz60 fz60Var, ed edVar, si60 si60Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = fz60Var;
        this.c = edVar;
        this.d = si60Var;
        this.e = bVar;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<cfr<Group>> O9(String str, com.vk.lists.c cVar) {
        return this.b.f(cVar.k(), str);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<cfr<Group>> hj(com.vk.lists.c cVar, boolean z) {
        return this.b.f(cVar.k(), null);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<cfr<Group>> qVar, boolean z, com.vk.lists.c cVar) {
        this.c.a(b.e.C1062b.b);
        this.e.b(qVar.K().subscribe(new pdw(new shh(cVar, this, z, 1), 10), new k2y(new w910(this, 9), 9)));
    }
}
