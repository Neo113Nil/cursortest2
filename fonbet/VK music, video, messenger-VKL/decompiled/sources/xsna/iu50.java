package xsna;

import android.graphics.RectF;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import java.util.Collection;
import kotlin.Pair;

/* compiled from: NarrativeControllerImpl.kt */
/* loaded from: classes3.dex */
public final class iu50 implements gu50 {
    public final vu50 a;
    public final ysg0<Pair<UserId, d5v>> b = new ysg0<>();

    public iu50(vu50 vu50Var) {
        this.a = vu50Var;
    }

    @Override // xsna.gu50
    public final ysg0<Pair<UserId, d5v>> a() {
        return this.b;
    }

    @Override // xsna.gu50
    public final String c(Narrative narrative) {
        return "https://" + a0a.d + "/narrative" + narrative.c + '_' + narrative.b;
    }

    @Override // xsna.gu50
    public final io.reactivex.rxjava3.internal.operators.single.o d(UserId userId, int i, String str, Iterable iterable, RectF rectF, Integer num, Integer num2) {
        return new io.reactivex.rxjava3.internal.operators.single.o(this.a.d(userId, i, str, iterable, new ju50(rectF, num, num2)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new wnt(new defpackage.c(25, this, userId), 10));
    }

    @Override // xsna.gu50
    public final io.reactivex.rxjava3.internal.operators.completable.p f(int i, UserId userId, int i2) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(new ku50(userId, i2, i)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new uk40(new ml1(15, this, userId), 1)));
    }

    @Override // xsna.gu50
    public final io.reactivex.rxjava3.internal.operators.single.o g(UserId userId, String str, Collection collection, RectF rectF, Integer num, Integer num2) {
        return new io.reactivex.rxjava3.internal.operators.single.o(this.a.c(userId, str, collection, new ju50(rectF, num, num2)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new m5y(new com.vk.libvideo.b(22, this, userId), 7));
    }

    @Override // xsna.gu50
    public final io.reactivex.rxjava3.internal.operators.completable.p h(int i, UserId userId, int i2) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(new eu50(userId, i, i2)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new vk40(new zf1(20, this, userId), 4)));
    }

    @Override // xsna.gu50
    public final io.reactivex.rxjava3.internal.operators.single.o i(int i, UserId userId) {
        tfx tfxVar = new tfx("narratives.delete", new kr(29), new lr(24));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "narrative_id", i, 0, 0, 12);
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(tfxVar)).l(new ps2(new vsq(17), 28)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new hu50(new x4w(this, userId, i), 0));
    }
}
