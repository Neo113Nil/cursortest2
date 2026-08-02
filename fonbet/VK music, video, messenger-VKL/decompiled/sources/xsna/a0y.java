package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.LazyThreadSafetyMode;

/* compiled from: JoinCommunityByUrlInteractorImpl.kt */
/* loaded from: classes14.dex */
public final class a0y implements zzx {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new xs6(13));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zzx
    public final io.reactivex.rxjava3.internal.operators.single.l a(UserId userId, String str) {
        return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(((y11) this.a.getValue()).b(userId, str))), new rx0(new gmj(userId, 19), 28)).m(asu0.a.d()), new bqs(new c4r(11), 3)).h(new mp0(new n9b(j03.a, 5), 27));
    }
}
