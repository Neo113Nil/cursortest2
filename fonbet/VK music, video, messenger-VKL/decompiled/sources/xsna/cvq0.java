package xsna;

import android.app.Activity;
import com.vk.api.generated.wall.dto.WallGetResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;

/* compiled from: UserProfileUnpublishedPostsDelegate.kt */
/* loaded from: classes5.dex */
public final class cvq0 implements huq {
    public io.reactivex.rxjava3.disposables.b b;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> c;
    public ExtendedUserProfile d;
    public io.reactivex.rxjava3.disposables.c e;

    /* compiled from: UserProfileUnpublishedPostsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<WallGetResponseDto, it80<WallGetResponseDto>> {
        @Override // xsna.izs
        public final it80<WallGetResponseDto> invoke(WallGetResponseDto wallGetResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(wallGetResponseDto);
        }
    }

    /* compiled from: UserProfileUnpublishedPostsDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<WallGetResponseDto, it80<WallGetResponseDto>> {
        @Override // xsna.izs
        public final it80<WallGetResponseDto> invoke(WallGetResponseDto wallGetResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(wallGetResponseDto);
        }
    }

    public static io.reactivex.rxjava3.internal.operators.observable.f0 a(UserId userId, String str) {
        return rsg0.W(yfb.x(lax0.j(new max0(), userId, str, 65522)), 7);
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.c;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void b(UserId userId) {
        this.e.dispose();
        io.reactivex.rxjava3.internal.operators.observable.f0 a2 = a(userId, "postponed");
        it80.a aVar = it80.b;
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.x.B(a2.l(new sqk0(new b(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 5)), a(userId, "drafts").l(new gwn0(new a(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 3)), new khc0(new gqg((byte) 0, 7), 10)).subscribe(new tmz(new l850(this, 27), 23));
        io.reactivex.rxjava3.disposables.b bVar = this.b;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
        this.e = subscribe;
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.huq
    public final void onResume() {
        ExtendedUserProfile extendedUserProfile = this.d;
        if (extendedUserProfile != null && bwd0.d(extendedUserProfile)) {
            b(bwd0.i(extendedUserProfile));
        }
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.c = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
