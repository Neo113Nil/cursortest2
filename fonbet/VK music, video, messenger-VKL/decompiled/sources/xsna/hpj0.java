package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.ObsceneTextFilter;

/* compiled from: SimpleAuthBridgeImpl.kt */
/* loaded from: classes18.dex */
public final class hpj0 implements gpj0 {
    public final b25 a;

    public hpj0(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.gpj0
    public final String a() {
        return this.a.o().c;
    }

    @Override // xsna.gpj0
    public final ObsceneTextFilter b() {
        return this.a.i().U;
    }

    @Override // xsna.gpj0
    public final String c() {
        return this.a.o().b;
    }

    @Override // xsna.gpj0
    public final boolean d() {
        return this.a.d();
    }

    @Override // xsna.gpj0
    public final String e() {
        return this.a.o().a();
    }

    @Override // xsna.gpj0
    public final ImageList f() {
        return this.a.o().i;
    }

    @Override // xsna.gpj0
    public final String getName() {
        return this.a.o().b;
    }

    @Override // xsna.gpj0
    public final UserId getUid() {
        return this.a.c();
    }

    @Override // xsna.gpj0
    public final Owner s() {
        return this.a.o().b().l0();
    }
}
