package xsna;

import com.vk.superapp.api.dto.auth.InitPasswordCheckAccessFactor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.sdk.SharedKt;
import xsna.cs;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes11.dex */
public final class bit implements wen0 {
    public final bpn0 a = new bpn0(new l03(3));

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.single.y a(String str, InitPasswordCheckAccessFactor initPasswordCheckAccessFactor) {
        bx2 e = e370.e(wwf0.i(x1o0.a(), str, initPasswordCheckAccessFactor != null ? initPasswordCheckAccessFactor.h() : null));
        e.c = true;
        e.d = true;
        return rdx0.B(e).l(new dg1(new qr0((qp) this.a.getValue()), 21));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(long j) {
        ufx ufxVar = new ufx("account.getPhone", new nr(0), new defpackage.j0(1));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new qj4(new g53(20), 15));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.single.y c(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.zht
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str6 = str;
                String str7 = str3;
                String str8 = str2;
                String str9 = str4;
                String str10 = str5;
                ufx ufxVar = new ufx("account.checkPassword", new mr(0), new sn(1));
                ufx.n(ufxVar, LoginApiConstants.PARAM_NAME_PASSWORD, str6, 0, 12);
                if (str7 != null) {
                    ufx.n(ufxVar, "last_name", str7, 160, 4);
                }
                if (str8 != null) {
                    ufx.n(ufxVar, "first_name", str8, 160, 4);
                }
                if (str9 != null) {
                    ufx.n(ufxVar, "birthday", str9, 10, 4);
                }
                if (str10 != null) {
                    ufx.n(ufxVar, "phone", str10, 30, 4);
                }
                bx2 e = e370.e(ufxVar);
                e.c = true;
                e.d = true;
                return e;
            }
        }), new nb(new xht(0), 19)).l(new gv(new tw4((qp) this.a.getValue()), 22));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 d(wwu0 wwu0Var, String str) {
        if (str == null) {
            str = SharedKt.PARAM_ACCESS_TOKEN;
        }
        return px2.c(new zfx0(zr.a("https://", dgn0.a().c.invoke(), "/authorize"), wwu0Var, str), dgn0.c());
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.single.y e(String str, String str2, String str3) {
        bx2 e = e370.e(wwf0.e(x1o0.a(), str3, str2, str));
        e.c = true;
        e.d = true;
        return rdx0.B(e).l(new iu4(new g54(25), 13));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.single.y f(ArrayList arrayList) {
        if ((14 & 1) != 0) {
            arrayList = null;
        }
        bx2 e = e370.e(cs.a.d(null, null, null, arrayList));
        e.r = true;
        e.c = true;
        e.d = true;
        return rdx0.B(e).l(new yht(new ait(1, (qp) this.a.getValue(), qp.class, "mapToAccountAnonymousToggles", "mapToAccountAnonymousToggles(Lcom/vk/api/generated/account/dto/AccountGetTogglesResponseDto;)Lcom/vk/superapp/api/dto/account/AccountAnonymousToggles;", 0), 0));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 g(long j) {
        ufx ufxVar = new ufx("account.getEmail", new or(0), new pr(0));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new nz(new p60(25), 20));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.single.y h() {
        return rdx0.B(e370.e(new ufx("account.getProfileNavigationInfo", new rr(0), new zn(1)))).l(new pj4(new uw4((qp) this.a.getValue()), 22));
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 i() {
        EmptyList emptyList = EmptyList.b;
        ufx ufxVar = new ufx("account.getProfilesSwitcherInfo", new jr(0), new kr(0));
        ufxVar.h("access_tokens", emptyList);
        bx2 e = e370.e(ufxVar);
        e.d = true;
        e.h = true;
        e.f = true;
        return rdx0.B(e);
    }

    @Override // xsna.wen0
    public final io.reactivex.rxjava3.internal.operators.single.y j(String str) {
        ufx ufxVar = new ufx("account.validateBirthday", new ao(1), new bo(1));
        ufx.n(ufxVar, "birthday", str, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.B(e).l(new kf3(new xsq(3), 19));
    }
}
