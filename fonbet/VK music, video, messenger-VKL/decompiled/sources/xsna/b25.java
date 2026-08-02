package xsna;

import android.content.Context;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.api.sdk.exceptions.RefreshFailCause;
import com.vk.bridges.ProfileType;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.common.account.ProfilerConfig;
import com.vk.dto.common.account.VideoConfig;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserNameType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NotImplementedError;
import xsna.n6r0;
import xsna.yj;

/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public interface b25 {

    /* compiled from: AuthBridge.kt */
    public interface a {
        void d(tbu0 tbu0Var);
    }

    default n6r0 A() {
        return n6r0.a.a.getSTUB();
    }

    void B(a aVar);

    default io.reactivex.rxjava3.internal.operators.observable.l2 C() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new x15(this)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.y15
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b25.this.c();
            }
        })).r0(io.reactivex.rxjava3.schedulers.a.b());
    }

    default Image D() {
        return null;
    }

    ProfilerConfig E();

    default long F() {
        return 0L;
    }

    default s2r G() {
        return null;
    }

    void H(AudioAdConfig audioAdConfig);

    default int I() {
        return 0;
    }

    default int J() {
        return 0;
    }

    boolean K(long j);

    default UserId L() {
        return c();
    }

    default or00 M() {
        return null;
    }

    default void N() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (!BuildInfo.a.a(context.getPackageName())) {
            throw new IllegalStateException("Illegal access");
        }
    }

    void O(t200 t200Var);

    default String P() {
        return null;
    }

    default pv8 T() {
        return null;
    }

    default boolean U(String str) {
        return false;
    }

    AudioAdConfig V();

    default io.reactivex.rxjava3.internal.operators.completable.m W(l7r0 l7r0Var) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new u15(0, this, l7r0Var));
    }

    default long X() {
        return 0L;
    }

    default void Y(l7r0 l7r0Var) {
        zx2 zx2Var;
        if (!b()) {
            throw new IllegalStateException("User is not logged in to refresh tokens");
        }
        yj yjVar = (yj) l7r0Var.a.E.getValue();
        if (yjVar == null) {
            throw new IllegalStateException("You must set AccessTokenRefresher for ApiConfig");
        }
        yj.a refresh = yjVar.refresh();
        if (((ArrayList) refresh.a()).isEmpty() && (zx2Var = l7r0Var.i) != null) {
            zx2Var.a(refresh.c());
        }
        for (UserId userId : refresh.b()) {
            j7r0 j7r0Var = l7r0Var.g;
            if (j7r0Var != null) {
                j7r0Var.a("refresh token", null, userId, new RefreshFailCause.EmptyTokenLoggedUser());
            }
        }
    }

    default String Z() {
        return null;
    }

    default boolean a(UserId userId) {
        return userId.equals(c());
    }

    void a0(UserNameType userNameType);

    default boolean b() {
        return fkq0.c(c());
    }

    void b0(a aVar);

    default UserId c() {
        return UserId.d;
    }

    default ProfileType c0() {
        return ProfileType.NORMAL;
    }

    default boolean d() {
        return false;
    }

    VideoConfig d0();

    void e();

    default io.reactivex.rxjava3.core.a f(UserId userId) {
        return io.reactivex.rxjava3.core.a.k(new NotImplementedError());
    }

    default List<UserId> g() {
        return Collections.singletonList(c());
    }

    default String h() {
        return "";
    }

    ms i();

    default String j() {
        return "";
    }

    void k(long j, boolean z);

    void l(boolean z);

    default io.reactivex.rxjava3.internal.operators.observable.l2 m(boolean z) {
        io.reactivex.rxjava3.core.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.v15
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                final d25 d25Var = new d25(rVar);
                final b25 b25Var = b25.this;
                rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.z15
                    @Override // io.reactivex.rxjava3.functions.e
                    public final void cancel() {
                        b25.this.B(d25Var);
                    }
                });
                b25Var.b0(d25Var);
            }
        });
        if (z) {
            qVar = qVar.o0(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.w15
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(b25.this.b());
                }
            }));
        }
        return qVar.r0(io.reactivex.rxjava3.schedulers.a.b());
    }

    default int n() {
        return 0;
    }

    cn o();

    default String p() {
        return "";
    }

    default String q() {
        return null;
    }

    default long r() {
        return 0L;
    }

    default String s(UserId userId) {
        if (userId.equals(c())) {
            return h();
        }
        return null;
    }

    default ihq0 u() {
        return new ihq0(I(), r(), c(), h(), "");
    }

    default UtilityTokens v() {
        UtilityTokens.CREATOR.getClass();
        return UtilityTokens.c;
    }

    boolean w();

    void x();

    default long z() {
        return 0L;
    }

    default void Q(or00 or00Var) {
    }

    default void S(boolean z) {
    }

    default void t(h7r0 h7r0Var) {
    }

    default void y(boolean z) {
    }

    default void R(String str, String str2, boolean z) {
    }
}
