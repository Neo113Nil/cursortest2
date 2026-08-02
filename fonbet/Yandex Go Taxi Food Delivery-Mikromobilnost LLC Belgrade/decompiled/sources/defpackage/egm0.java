package defpackage;

import android.os.CountDownTimer;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import defpackage.egm0;
import defpackage.qfm0;
import defpackage.sfm0;
import java.util.Date;
import kotlin.Pair;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class egm0 extends xc5 {
    public final dy40 A;
    public final dy40 B;
    public final ndl0 C;
    public final dy40 D;
    public CountDownTimer E;
    public final aye0 F;
    public final vv90 w;
    public final rwo x;
    public final dy40 y;
    public final dy40 z;

    public egm0(vv90 vv90Var, rwo rwoVar) {
        super(rwoVar);
        this.w = vv90Var;
        this.x = rwoVar;
        this.y = new dy40();
        this.z = new dy40();
        this.A = new dy40();
        this.B = new dy40();
        this.C = new ndl0(8, this);
        this.D = new dy40(qfm0.a);
        this.F = new aye0(28, this);
    }

    @Override // defpackage.xc5, defpackage.tc5
    public final void L() {
        sv90 sv90Var = qv90.a;
        String Z = Z();
        sv90Var.getClass();
        ((y22) this.x).a(y891.c("sbp_challenger_tap_on_close", vfc.i(0, "verification_id", Z, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь нажал на крестик на экране СБП Челленджера, verification_id = ".concat(Z))));
        super.L();
    }

    @Override // defpackage.xc5
    public final rwo W() {
        return this.x;
    }

    public final String Z() {
        SbpChallengeInfo sbpChallengeInfo;
        Pair pair = (Pair) this.z.d();
        String verificationId = (pair == null || (sbpChallengeInfo = (SbpChallengeInfo) pair.f()) == null) ? null : sbpChallengeInfo.getVerificationId();
        return verificationId == null ? "" : verificationId;
    }

    public final void a0(Long l) {
        Long valueOf = l != null ? Long.valueOf(l.longValue() - (new Date().getTime() / 1000)) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        if (longValue <= 0) {
            this.D.m(rfm0.a);
            return;
        }
        final long j = (longValue + 1) * 1000;
        CountDownTimer countDownTimer = this.E;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.E = new CountDownTimer(j) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerViewModel$startTimer$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                egm0 egm0Var = this;
                CountDownTimer countDownTimer2 = egm0Var.E;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                }
                egm0Var.E = null;
                egm0Var.D.m(qfm0.a);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                this.D.m(sfm0.a);
            }
        }.start();
    }

    public final void b0(String str) {
        PaymentMethod.SbpToken sbpToken;
        sv90 sv90Var = qv90.a;
        String Z = Z();
        sv90Var.getClass();
        ((y22) this.x).a(sv90.j0(Z));
        dy40 dy40Var = this.z;
        Pair pair = (Pair) dy40Var.d();
        if (pair != null) {
            nu5 nu5Var = ((yv90) this.w).j;
            Pair pair2 = (Pair) dy40Var.d();
            String id = (pair2 == null || (sbpToken = (PaymentMethod.SbpToken) pair2.c()) == null) ? null : sbpToken.getId();
            if (id == null) {
                id = "";
            }
            nu5Var.g(id, Z(), str, ((SbpChallengeInfo) pair.f()).getMethod(), this.C);
        }
    }
}
