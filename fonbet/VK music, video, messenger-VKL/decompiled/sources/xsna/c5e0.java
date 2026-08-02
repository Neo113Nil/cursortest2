package xsna;

import android.app.Activity;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileEvent;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.nyd0;

/* compiled from: PromoFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class c5e0 implements huq {
    public final ouq0 b;
    public final lyd0 c;
    public io.reactivex.rxjava3.disposables.b d;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> e;

    /* compiled from: PromoFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: PromoFeatureDelegate.kt */
    public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public c5e0(ouq0 ouq0Var, lyd0 lyd0Var) {
        this.b = ouq0Var;
        this.c = lyd0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.e;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(ExtendedUserProfile extendedUserProfile) {
        nyd0.a m = this.c.m();
        m.getClass();
        m.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.HIDE_BIRTHDAY_BLOCK, null);
        UserId userId = extendedUserProfile.a.c;
        if (userId == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = this.b.u(userId).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new le50(new nl30(this, 20), 11), new ox80(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 6));
        io.reactivex.rxjava3.disposables.b bVar = this.d;
        (bVar != null ? bVar : null).b(subscribe);
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.d = bVar;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.e = r9c0Var;
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
    public final void onResume() {
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
