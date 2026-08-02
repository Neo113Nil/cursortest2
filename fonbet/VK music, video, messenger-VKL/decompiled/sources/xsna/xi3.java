package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import java.util.List;

/* compiled from: ArchiveRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class xi3 implements vi3 {
    public final aha0 a;
    public final AlbumsRepository b;
    public final aga0 c;

    public xi3(aha0 aha0Var, AlbumsRepository albumsRepository, aga0 aga0Var) {
        this.a = aha0Var;
        this.b = albumsRepository;
        this.c = aga0Var;
    }

    @Override // xsna.vi3
    public final io.reactivex.rxjava3.internal.operators.single.o a(UserId userId, int i, List list) {
        return new io.reactivex.rxjava3.internal.operators.single.o(this.c.b(userId, i, list), new st0(new zx(this, 5), 1));
    }

    @Override // xsna.vi3
    public final io.reactivex.rxjava3.core.x<Integer> b(List<? extends Photo> list) {
        return this.c.b(((Photo) j5g.Y(list)).e, -185, list);
    }

    @Override // xsna.vi3
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(String str) {
        this.a.getClass();
        tfx tfxVar = new tfx("photos.photoFeedArchive", new com.vk.movika.sdk.base.model.n(23), new eq(26));
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfxVar.f(30, 0, 200, "count");
        return rsg0.T(yfb.x(tfxVar)).U(new rf1(new wi3(ufa0.a, 0), 2));
    }
}
