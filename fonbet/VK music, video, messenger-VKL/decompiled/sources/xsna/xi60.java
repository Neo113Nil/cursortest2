package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.lists.c;

/* compiled from: NewsfeedFilteredProfilesPagedDataProvider.kt */
/* loaded from: classes18.dex */
public final class xi60 implements c.m<cfr<UserProfile>> {
    public final fz60 b;
    public final ed c;
    public final si60 d;
    public final io.reactivex.rxjava3.disposables.b e;

    public xi60(fz60 fz60Var, ed edVar, si60 si60Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = fz60Var;
        this.c = edVar;
        this.d = si60Var;
        this.e = bVar;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<cfr<UserProfile>> O9(String str, com.vk.lists.c cVar) {
        return this.b.g(cVar.k(), str);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<cfr<UserProfile>> hj(com.vk.lists.c cVar, boolean z) {
        return this.b.g(cVar.k(), null);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<cfr<UserProfile>> qVar, boolean z, com.vk.lists.c cVar) {
        this.c.a(b.e.C1062b.b);
        this.e.b(qVar.K().subscribe(new qw40(new wi60(cVar, this, z), 3), new rkz(new aj50(this, 2), 11)));
    }
}
