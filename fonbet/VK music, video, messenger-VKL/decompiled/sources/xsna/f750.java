package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: MusicSocialModelImpl.kt */
/* loaded from: classes3.dex */
public final class f750 implements c750 {
    public final hx4 a;
    public final qxi b;

    public f750(hx4 hx4Var, qxi qxiVar) {
        this.a = hx4Var;
        this.b = qxiVar;
    }

    @Override // xsna.c750
    public final io.reactivex.rxjava3.internal.operators.observable.b0 a(Artist artist, String str) {
        tfx d;
        String str2 = artist.b;
        if (jnj.d(artist.m)) {
            this.b.getClass();
            d = new tfx("kidsCollection.addArtist", new com.vk.movika.sdk.base.model.n(16), new eq(17));
            tfx.o(d, "artist_id", str2, 0, 0, 12);
            if (str != null) {
                tfx.o(d, "ref", str, 0, 0, 12);
            }
        } else {
            d = this.a.d(str2, str);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(d), null, null, 3);
        pdw pdwVar = new pdw(new jjx(artist, 15), 8);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(pdwVar, lVar, kVar, kVar).F(new d750(new b40(28), 0));
    }

    @Override // xsna.c750
    public final io.reactivex.rxjava3.internal.operators.observable.b0 b(Artist artist, String str) {
        tfx h;
        String str2 = artist.b;
        if (jnj.d(artist.m)) {
            this.b.getClass();
            h = new tfx("kidsCollection.removeArtist", new com.vk.movika.sdk.base.model.history.b(15), new fq(17));
            tfx.o(h, "artist_id", str2, 0, 0, 12);
            if (str != null) {
                tfx.o(h, "ref", str, 0, 0, 12);
            }
        } else {
            h = this.a.h(str2, str);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(h), null, null, 3);
        j41 j41Var = new j41(new jq3(artist, 1), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(j41Var, lVar, kVar, kVar).F(new cx00(new quz(6), 6));
    }

    @Override // xsna.c750
    public final io.reactivex.rxjava3.internal.operators.observable.b0 c(Curator curator) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(this.a.B(curator.b)), null, null, 3);
        tmz tmzVar = new tmz(new f410(curator, 13), 5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(tmzVar, lVar, kVar, kVar).F(new wmz(new ehu(13), 7));
    }

    @Override // xsna.c750
    public final io.reactivex.rxjava3.internal.operators.observable.b0 d(UserId userId) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(this.a.f(userId)), null, null, 3);
        int i = 6;
        kjs kjsVar = new kjs(new mi10(userId, i), i);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(kjsVar, lVar, kVar, kVar).F(new zk30(new h2w(11), 4));
    }

    @Override // xsna.c750
    public final io.reactivex.rxjava3.internal.operators.observable.b0 e(UserId userId) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(this.a.m(userId)), null, null, 3);
        ow40 ow40Var = new ow40(new mgz(userId, 11), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(ow40Var, lVar, kVar, kVar).F(new pw40(new e750(0), 1));
    }

    @Override // xsna.c750
    public final io.reactivex.rxjava3.internal.operators.observable.b0 f(Curator curator) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(this.a.c(curator.b)), null, null, 3);
        q440 q440Var = new q440(new cvh(curator, 26), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(q440Var, lVar, kVar, kVar).F(new oo20(new e420(5), 4));
    }
}
