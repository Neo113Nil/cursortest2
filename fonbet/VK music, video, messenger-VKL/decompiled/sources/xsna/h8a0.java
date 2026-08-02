package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.m7a0;

/* compiled from: PhotoFlowRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class h8a0 implements f8a0 {
    public final aha0 a = new aha0();
    public final ysg0<m7a0> b;
    public final aga0 c;

    public h8a0(ysg0 ysg0Var, aga0 aga0Var) {
        this.b = ysg0Var;
        this.c = aga0Var;
        new io.reactivex.rxjava3.subjects.f().M0();
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.core.x a(UserId userId, List list) {
        return list.isEmpty() ? io.reactivex.rxjava3.core.x.k(0) : this.c.a(userId, list);
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.internal.operators.completable.p b(Photo photo, UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.c.a(userId, Collections.singletonList(photo)));
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.core.x c(ArrayList arrayList, int i, UserId userId) {
        return this.c.b(userId, i, arrayList);
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 d(ArrayList arrayList) {
        this.a.getClass();
        tfx tfxVar = new tfx("photos.photoFeedEnableAlbum", new gp(28), new eq0(23));
        if (arrayList != null) {
            tfxVar.i("album_id", arrayList);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(tfxVar)));
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 e(UserId userId, Boolean bool, Boolean bool2, Integer num, String str) {
        this.a.getClass();
        tfx tfxVar = new tfx("photos.photoFeedGet", new k73(26), new pm0(26));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 200, "count");
        }
        if (bool2 != null) {
            tfxVar.j("photo_sizes", bool2.booleanValue());
        }
        return rsg0.T(yfb.x(tfxVar)).U(new pu50(new ou1(ufa0.a, 8), 5));
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 f(ArrayList arrayList) {
        this.a.getClass();
        tfx tfxVar = new tfx("photos.photoFeedDisableAlbum", new tf3(26), new uf3(23));
        if (arrayList != null) {
            tfxVar.i("album_id", arrayList);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(tfxVar)));
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.internal.operators.completable.w h(Photo photo) {
        return j(photo, true);
    }

    @Override // xsna.f8a0
    public final io.reactivex.rxjava3.internal.operators.completable.w i(Photo photo) {
        return j(photo, false);
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w j(final Photo photo, final boolean z) {
        int i = photo.c;
        UserId userId = photo.e;
        Boolean valueOf = Boolean.valueOf(z);
        this.a.getClass();
        tfx tfxVar = new tfx("photos.photoFeedPin", new up(25), new b690(2));
        tfx.l(tfxVar, "photo_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfxVar.j("unpin", valueOf.booleanValue());
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(tfxVar))).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.g8a0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                h8a0.this.b.a(new m7a0.d(photo, !z));
            }
        });
    }
}
