package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import java.util.Set;

/* compiled from: SelectAlbumPagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class k6i0 implements c.l<AlbumsRepository.a> {
    public final UserId b;
    public final AlbumsRepository c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final Set<Integer> e;
    public final bl30 f;
    public final yd4 g;
    public final yde h;

    public k6i0(UserId userId, AlbumsRepository albumsRepository, io.reactivex.rxjava3.disposables.b bVar, Set set, bl30 bl30Var, yd4 yd4Var, yde ydeVar) {
        this.b = userId;
        this.c = albumsRepository;
        this.d = bVar;
        this.e = set;
        this.f = bl30Var;
        this.g = yd4Var;
        this.h = ydeVar;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(int i, com.vk.lists.c cVar, boolean z) {
        UserId userId = this.b;
        return this.c.f(cVar.k(), i, userId, z).U(new nh40(new af50(this, 26), 14)).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> hj(com.vk.lists.c cVar, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.c0(a(0, cVar, z), new b0y(new el30(this, 25), 22), io.reactivex.rxjava3.internal.functions.a.c);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> ui(int i, com.vk.lists.c cVar) {
        return a(i, cVar, false);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<AlbumsRepository.a> qVar, boolean z, com.vk.lists.c cVar) {
        this.d.b(qVar.subscribe(new o7y(new lo70(cVar, this, z, 1), 15), new fsq(new pf0(this, z), 25)));
    }
}
