package xsna;

import java.util.List;

/* compiled from: ClipsInterestsUserRecomRemoteStorageImpl.kt */
/* loaded from: classes16.dex */
public final class hie implements phe {
    public final amf a;
    public final bpn0 b = new bpn0(new x5(9));

    public hie(amf amfVar) {
        this.a = amfVar;
    }

    @Override // xsna.phe
    public final io.reactivex.rxjava3.internal.operators.single.y a() {
        return rsg0.w0(yfb.x(((daf0) this.b.getValue()).d())).l(new d22(new gie(1, this.a, amf.class, "map", "map(Lcom/vk/api/generated/recomSettings/dto/RecomSettingsGetAvailableRecomThemesResponseDto;)Ljava/util/List;", 0), 11));
    }

    @Override // xsna.phe
    public final io.reactivex.rxjava3.internal.operators.single.y b() {
        return rsg0.w0(yfb.x(((daf0) this.b.getValue()).a(null))).l(new qs6(new xr0(13), 6));
    }

    @Override // xsna.phe
    public final io.reactivex.rxjava3.internal.operators.observable.b1 c(List list) {
        dz2 x = yfb.x(((daf0) this.b.getValue()).c("clips_choice_interests", list));
        x.n = true;
        x.q = Integer.MAX_VALUE;
        return rsg0.Z(x);
    }

    @Override // xsna.phe
    public final io.reactivex.rxjava3.internal.operators.single.y d() {
        return rsg0.w0(yfb.x(((daf0) this.b.getValue()).a(null))).l(new sn(12, new io3(7)));
    }
}
