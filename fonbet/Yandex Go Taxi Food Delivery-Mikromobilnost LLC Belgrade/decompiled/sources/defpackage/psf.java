package defpackage;

import android.os.CountDownTimer;
import com.yandex.payment.divkit.usecases.e;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import defpackage.isf;
import defpackage.psf;
import java.util.Date;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class psf extends yr31 {
    public SbpChallengeInfo C;
    public PaymentMethod.SbpToken D;
    public CountDownTimer I;
    public final e b;
    public final rwo c;
    public final g99 w;
    public final vv90 x;
    public final dy40 y = new dy40();
    public final u2l z = new u2l(new px(2, this));
    public boolean A = true;
    public final n0 B = ffx.c(1, 1, null, 4);
    public final dy40 E = new dy40();
    public final dy40 F = new dy40(isf.b);
    public final zgf G = new zgf(3, this);
    public final gyc H = new gyc(this);

    public psf(e eVar, rwo rwoVar, g99 g99Var, vv90 vv90Var) {
        this.b = eVar;
        this.c = rwoVar;
        this.w = g99Var;
        this.x = vv90Var;
    }

    public final String W() {
        SbpChallengeInfo sbpChallengeInfo = this.C;
        String verificationId = sbpChallengeInfo != null ? sbpChallengeInfo.getVerificationId() : null;
        return verificationId == null ? "" : verificationId;
    }

    public final void X(Long l) {
        Long valueOf = l != null ? Long.valueOf(l.longValue() - (new Date().getTime() / 1000)) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        if (longValue <= 0) {
            this.F.m(isf.c);
            return;
        }
        final long j = (longValue + 1) * 1000;
        CountDownTimer countDownTimer = this.I;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.I = new CountDownTimer(j) { // from class: com.yandex.payment.divkit.challenger.DKChallengerViewModel$startTimer$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                psf psfVar = this;
                CountDownTimer countDownTimer2 = psfVar.I;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                }
                psfVar.I = null;
                psfVar.F.m(isf.b);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                this.F.m(isf.d);
            }
        }.start();
    }

    public final void Y() {
        dy40 dy40Var = this.F;
        if (jl40.l(dy40Var.d(), isf.b)) {
            sv90 sv90Var = qv90.a;
            String W = W();
            sv90Var.getClass();
            ((y22) this.c).a(sv90.l0(W));
            dy40Var.m(isf.d);
            nu5 nu5Var = ((yv90) this.x).j;
            PaymentMethod.SbpToken sbpToken = this.D;
            String id = sbpToken != null ? sbpToken.getId() : null;
            if (id == null) {
                id = "";
            }
            nu5Var.d(id, W(), this.H);
        }
    }

    public final void Z(String str) {
        SbpChallengeInfo.SbpChallengeMethod method;
        sv90 sv90Var = qv90.a;
        String W = W();
        sv90Var.getClass();
        ((y22) this.c).a(sv90.j0(W));
        SbpChallengeInfo sbpChallengeInfo = this.C;
        if (sbpChallengeInfo == null || (method = sbpChallengeInfo.getMethod()) == null) {
            return;
        }
        nu5 nu5Var = ((yv90) this.x).j;
        PaymentMethod.SbpToken sbpToken = this.D;
        String id = sbpToken != null ? sbpToken.getId() : null;
        if (id == null) {
            id = "";
        }
        nu5Var.g(id, W(), str, method, this.G);
    }
}
