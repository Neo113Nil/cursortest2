package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;

/* compiled from: AlbumsPagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class hp1 implements c.l<AlbumsRepository.a> {
    public final UserId b;
    public final AlbumsRepository c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final AlbumsFragment.f e;

    public hp1(UserId userId, AlbumsRepository albumsRepository, io.reactivex.rxjava3.disposables.b bVar, AlbumsFragment.f fVar) {
        this.b = userId;
        this.c = albumsRepository;
        this.d = bVar;
        this.e = fVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> hj(com.vk.lists.c cVar, boolean z) {
        a.j jVar = a.j.b;
        AlbumsFragment.f fVar = this.e;
        fVar.invoke(jVar);
        fVar.invoke(new a.g(true));
        int k = cVar.k();
        return this.c.c(k, 0, this.b, z).U(new r41(new gp1(k, 0), 2));
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> ui(int i, com.vk.lists.c cVar) {
        this.e.invoke(new a.g(false));
        int k = cVar.k();
        return this.c.c(k, i, this.b, false).U(new r41(new gp1(k, 0), 2));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<AlbumsRepository.a> qVar, boolean z, com.vk.lists.c cVar) {
        int i = 2;
        this.d.b(qVar.subscribe(new p41(new ep1(cVar, this, z, 0), i), new wn(new fp1(this, z), i)));
    }
}
