package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.tfw0;

/* compiled from: VoipAppAuthBridgeWrapperImpl.kt */
/* loaded from: classes7.dex */
public final class aew0 implements tfw0.a {
    public final b25 a;

    public aew0(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.tfw0.a
    public final boolean a(UserId userId) {
        return this.a.a(userId);
    }

    @Override // xsna.tfw0.a
    public final String b() {
        return this.a.o().b().e;
    }

    @Override // xsna.tfw0.a
    public final UserId c() {
        return this.a.c();
    }

    @Override // xsna.tfw0.a
    public final io.reactivex.rxjava3.core.q<Boolean> d() {
        return this.a.m(true);
    }

    @Override // xsna.tfw0.a
    public final void e() {
        this.a.e();
    }

    @Override // xsna.tfw0.a
    public final io.reactivex.rxjava3.core.a f(UserId userId) {
        return this.a.f(userId);
    }

    @Override // xsna.tfw0.a
    public final List<UserId> g() {
        return this.a.g();
    }

    @Override // xsna.tfw0.a
    public final boolean h() {
        return o25.b(this.a);
    }

    @Override // xsna.tfw0.a
    public final String i() {
        String str = this.a.o().c;
        return str == null ? "" : str;
    }
}
