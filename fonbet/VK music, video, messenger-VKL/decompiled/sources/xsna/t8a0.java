package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import java.util.List;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsPagedDataProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class t8a0 implements c.l<AlbumsRepository.a> {
    public final UserId b;
    public final AlbumsRepository c;
    public final jed0 d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final el1 f;
    public final jkg g;
    public final nx7 h;

    /* compiled from: PhotoFlowSettingsPagedDataProviderDelegate.kt */
    public static final class a {
        public final List<q8a0.a> a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends q8a0.a> list, boolean z) {
            this.a = list;
            this.b = z;
        }
    }

    public t8a0(UserId userId, AlbumsRepository albumsRepository, jed0 jed0Var, io.reactivex.rxjava3.disposables.b bVar, el1 el1Var, jkg jkgVar, nx7 nx7Var) {
        this.b = userId;
        this.c = albumsRepository;
        this.d = jed0Var;
        this.e = bVar;
        this.f = el1Var;
        this.g = jkgVar;
        this.h = nx7Var;
        new hk1();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> hj(com.vk.lists.c cVar, boolean z) {
        return this.c.f(cVar.k(), 0, this.b, false).U(new ie40(new hyu(13), 5)).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<AlbumsRepository.a> ui(int i, com.vk.lists.c cVar) {
        return this.c.f(cVar.k(), i, this.b, false).U(new ie40(new hyu(13), 5)).a0(asu0.a.d());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<AlbumsRepository.a> qVar, boolean z, com.vk.lists.c cVar) {
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.o0(qVar, new je40(new r8a0(this, 0), 4)).a0(asu0.a.d()).subscribe(new bdz(new evg(cVar, this, z, 1), 12), new m1r(new s8a0(this, z), 14)));
    }
}
