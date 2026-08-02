package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: AlbumDetailsRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class zh1 implements xh1 {
    public final aha0 a = new aha0();
    public final aga0 b;

    public zh1(aga0 aga0Var) {
        this.b = aga0Var;
    }

    @Override // xsna.xh1
    public final io.reactivex.rxjava3.core.x<Integer> a(UserId userId, List<? extends Photo> list) {
        return this.b.a(userId, list);
    }

    @Override // xsna.xh1
    public final io.reactivex.rxjava3.core.x<Integer> b(UserId userId, int i, List<? extends Photo> list) {
        return this.b.b(userId, i, list);
    }

    @Override // xsna.xh1
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(UserId userId, int i, int i2, String str, boolean z) {
        aha0 aha0Var = this.a;
        if (i != -9000) {
            return rsg0.T(yfb.x(zga0.b(aha0Var, userId, String.valueOf(i), Boolean.valueOf(z), null, Integer.valueOf(i2), str, 1738))).U(new yh1(new com.vk.movika.sdk.base.observable.s(2), 0));
        }
        String str2 = !z ? "1" : "0";
        Integer valueOf = Integer.valueOf(i2);
        aha0Var.getClass();
        tfx tfxVar = new tfx("photos.getUserPhotos", new j8(23), new jh(20));
        if (userId != null) {
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
        }
        tfxVar.f(valueOf.intValue(), 0, 1000, "count");
        tfxVar.j("extended", true);
        tfx.o(tfxVar, "sort", str2, 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfxVar.j("cursor_pagination", true);
        return rsg0.T(yfb.x(tfxVar)).U(new dg1(new com.vk.movika.sdk.base.observable.u(1), 1));
    }
}
