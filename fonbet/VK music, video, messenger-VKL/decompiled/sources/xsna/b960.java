package xsna;

import android.app.Activity;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: NewUserOnboardingFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class b960 implements huq {
    public final ouq0 b;
    public io.reactivex.rxjava3.disposables.b c;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> d;

    /* compiled from: NewUserOnboardingFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: NewUserOnboardingFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public b960(ouq0 ouq0Var) {
        this.b = ouq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.d;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(ExtendedUserProfile extendedUserProfile) {
        if (bwd0.d(extendedUserProfile)) {
            io.reactivex.rxjava3.disposables.c subscribe = this.b.n().subscribe(new iu1(new rop(this, 22), 28), new m3y(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 6));
            io.reactivex.rxjava3.disposables.b bVar = this.c;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(subscribe);
        }
    }

    public final void b() {
        io.reactivex.rxjava3.disposables.c subscribe = this.b.B().subscribe(new a960(new b810(this, 10), 0), new vk40(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 5));
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.c = bVar;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.d = r9c0Var;
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
