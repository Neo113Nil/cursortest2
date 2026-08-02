package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;

/* compiled from: NewsfeedSettingsInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class gz60 implements fz60 {
    public final byt a;
    public final shb b;

    public gz60(byt bytVar, shb shbVar) {
        this.a = bytVar;
        this.b = shbVar;
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.core.a a(UserId userId) {
        return rsg0.Z(yfb.x(cz60.a(new dz60(), Collections.singletonList(userId), null, 2)));
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.core.a b(UserId userId) {
        xy2 j;
        j = new dz60().j((r12 & 1) != 0 ? null : Collections.singletonList(userId), (r12 & 2) != 0 ? null : null, null, null, (r12 & 16) != 0 ? null : NewsfeedAddBanTypeDto.ALWAYS);
        return rsg0.Z(yfb.x(j));
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.core.a c(UserId userId) {
        xy2 j;
        j = new dz60().j((r12 & 1) != 0 ? null : null, (r12 & 2) != 0 ? null : Collections.singletonList(userId), null, null, (r12 & 16) != 0 ? null : NewsfeedAddBanTypeDto.ALWAYS);
        return rsg0.Z(yfb.x(j));
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.internal.operators.single.r d() {
        byt bytVar = this.a;
        return new io.reactivex.rxjava3.internal.operators.single.r(bytVar.c(30, null).L(new u730(new u3u(bytVar, 19), 4), false).K(), new tp1(new d0w(this, 9), 20));
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.core.a e(UserId userId) {
        return rsg0.Z(yfb.x(cz60.a(new dz60(), null, Collections.singletonList(userId), 1)));
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.core.q f(int i, String str) {
        io.reactivex.rxjava3.core.q T;
        io.reactivex.rxjava3.internal.operators.observable.j1 c = this.a.c(i, str);
        if (str != null && str.length() != 0) {
            return c;
        }
        shb shbVar = this.b;
        cfr cfrVar = (cfr) shbVar.b;
        if (cfrVar == null) {
            T = io.reactivex.rxjava3.core.q.H(new IllegalStateException("There are no cached groups"));
        } else {
            shbVar.b = null;
            T = io.reactivex.rxjava3.core.q.T(cfrVar);
        }
        return T.c0(c);
    }

    @Override // xsna.fz60
    public final io.reactivex.rxjava3.core.q g(int i, String str) {
        io.reactivex.rxjava3.core.q T;
        io.reactivex.rxjava3.internal.operators.observable.j1 e = this.a.e(i, str);
        if (str != null && str.length() != 0) {
            return e;
        }
        shb shbVar = this.b;
        cfr cfrVar = (cfr) shbVar.a;
        if (cfrVar == null) {
            T = io.reactivex.rxjava3.core.q.H(new IllegalStateException("There are no cached profiles"));
        } else {
            shbVar.a = null;
            T = io.reactivex.rxjava3.core.q.T(cfrVar);
        }
        return T.c0(e);
    }
}
