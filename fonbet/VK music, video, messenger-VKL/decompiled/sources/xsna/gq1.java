package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;

/* compiled from: AlbumsSettingsPagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class gq1 implements c.l<AlbumsRepository.a> {
    public final UserId b;
    public final AlbumsRepository c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final mb e;
    public final dr0 f;
    public final nq1 g;

    public gq1(UserId userId, AlbumsRepository albumsRepository, io.reactivex.rxjava3.disposables.b bVar, mb mbVar, dr0 dr0Var, nq1 nq1Var) {
        this.b = userId;
        this.c = albumsRepository;
        this.d = bVar;
        this.e = mbVar;
        this.f = dr0Var;
        this.g = nq1Var;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> hj(com.vk.lists.c cVar, boolean z) {
        int i = 2;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(this.c.c(cVar.k(), 0, this.b, z).U(new z7(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(cVar, i), i)), new h60(new a8(this, 3), i), io.reactivex.rxjava3.internal.functions.a.c);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> ui(int i, com.vk.lists.c cVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.c0(this.c.c(cVar.k(), i, this.b, false).U(new fq1(new com.vk.movika.sdk.base.observable.e(cVar, 3), 0)), new wf1(new x7(this, 2), 1), io.reactivex.rxjava3.internal.functions.a.c);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<AlbumsRepository.a> qVar, boolean z, com.vk.lists.c cVar) {
        this.d.b(qVar.subscribe(new xf1(new dq1(cVar, this, z, 0), 1), new az(new eq1(this, z, 0), 4)));
    }
}
