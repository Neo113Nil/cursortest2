package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import xsna.a7f0;

/* compiled from: UploadFormDelegate.kt */
/* loaded from: classes18.dex */
public final class lbq0 {
    public final z4c a;
    public final b8c b;
    public final io.reactivex.rxjava3.subjects.f<Triple<UserId, Long, com.vk.ecomm.cart.impl.checkout.feature.state.f>> c;
    public volatile boolean d;

    public lbq0(z4c z4cVar, c8c c8cVar) {
        this.a = z4cVar;
        this.b = c8cVar;
        io.reactivex.rxjava3.subjects.f<Triple<UserId, Long, com.vk.ecomm.cart.impl.checkout.feature.state.f>> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        a7f0.a.e(z4cVar, fVar.y(3L, TimeUnit.SECONDS).h0(Long.MAX_VALUE), null, new xvl0(this, 7), null, null, 13);
    }

    public final void a(UserId userId, Long l, com.vk.ecomm.cart.impl.checkout.feature.state.f fVar, izs<? super com.vk.ecomm.cart.impl.checkout.feature.state.f, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        z4c z4cVar = this.a;
        this.d = true;
        a7f0.a.f(z4cVar, this.b.a(userId, fVar, l, false), new z5a(28, izsVar, this), new hmj0(2, izsVar2, this), 1);
    }
}
