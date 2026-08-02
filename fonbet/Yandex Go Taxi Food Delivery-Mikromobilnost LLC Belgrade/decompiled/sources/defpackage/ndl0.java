package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import com.yandex.payment.sdk.core.impl.ChallengeType;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class ndl0 implements ryj0, eqm0, yjn0, jg5 {
    public final /* synthetic */ int a;
    public Object b;

    public ndl0(ufg ufgVar) {
        this.a = 26;
        new ea20(ufgVar, "flutter/sensitivecontent", wzt0.b, null).b(new pgk0(21, this));
    }

    public static String a(List list) {
        mi31 mi31Var = (mi31) a.R(list);
        String str = mi31Var != null ? mi31Var.f : null;
        return str == null ? "" : str;
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        switch (this.a) {
            case 8:
                ((egm0) this.b).y.m(new zfm0());
                break;
            default:
                PaymentKitError paymentKitError = (PaymentKitError) obj;
                afq0 afq0Var = (afq0) this.b;
                if (!afq0Var.H) {
                    afq0Var.D.l(new eeq0(paymentKitError));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        SbpChallengeInfo sbpChallengeInfo;
        switch (this.a) {
            case 8:
                ffm0 ffm0Var = (ffm0) obj;
                egm0 egm0Var = (egm0) this.b;
                rwo rwoVar = egm0Var.x;
                dy40 dy40Var = egm0Var.y;
                SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus = ffm0Var.a;
                if (ffm0Var.b == 0 && !sbpChallengeResultInfo$SbpChallengeStatus.a()) {
                    sv90 sv90Var = qv90.a;
                    String Z = egm0Var.Z();
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.h0(Z));
                    dy40Var.m(agm0.a);
                    break;
                } else {
                    sv90 sv90Var2 = qv90.a;
                    boolean a = sbpChallengeResultInfo$SbpChallengeStatus.a();
                    String Z2 = egm0Var.Z();
                    sv90Var2.getClass();
                    ((y22) rwoVar).a(sv90.k0(Z2, a));
                    egm0Var.B.m(sbpChallengeResultInfo$SbpChallengeStatus);
                    if (!sbpChallengeResultInfo$SbpChallengeStatus.a()) {
                        Pair pair = (Pair) egm0Var.z.d();
                        dy40Var.m(n891.o((pair == null || (sbpChallengeInfo = (SbpChallengeInfo) pair.f()) == null) ? null : Boolean.valueOf(sbpChallengeInfo.isSmsChallenge())) ? wfm0.b : vfm0.b);
                        break;
                    } else {
                        dy40Var.m(bgm0.a);
                        break;
                    }
                }
                break;
            default:
                sm0 sm0Var = (sm0) obj;
                e4p e4pVar = e4p.a;
                afq0 afq0Var = (afq0) this.b;
                if (!afq0Var.H) {
                    if (!(sm0Var instanceof nm0)) {
                        if (!(sm0Var instanceof pm0)) {
                            if (!(sm0Var instanceof lm0)) {
                                if (!(sm0Var instanceof rm0)) {
                                    if (!(sm0Var instanceof mm0)) {
                                        if (!(sm0Var instanceof qm0)) {
                                            if (!(sm0Var instanceof om0)) {
                                                w511.b();
                                                break;
                                            }
                                        } else {
                                            ct20 ct20Var = ((qm0) sm0Var).a;
                                            if (!(ct20Var instanceof s89)) {
                                                if (ct20Var instanceof y89) {
                                                    y89 y89Var = (y89) ct20Var;
                                                    afq0Var.F.l(new g4p(y89Var.b, y89Var.c));
                                                    break;
                                                }
                                            } else {
                                                s89 s89Var = (s89) ct20Var;
                                                afq0Var.F.l(new h4p(s89Var.b, s89Var.c, s89Var.d));
                                                break;
                                            }
                                        }
                                    } else if (jl40.l(((mm0) sm0Var).a, ChallengeType.CHALLENGE_CVV.getChallengeName())) {
                                        ((afq0) this.b).F.l(f4p.a);
                                        ((afq0) this.b).F.l(e4pVar);
                                        break;
                                    }
                                } else {
                                    ny61.r("Sbp has its own fragment");
                                    break;
                                }
                            } else {
                                afq0Var.F.l(e4pVar);
                                break;
                            }
                        } else {
                            pm0 pm0Var = (pm0) sm0Var;
                            afq0Var.F.l(new g4p(pm0Var.a, pm0Var.b));
                            break;
                        }
                    } else {
                        xry0 xry0Var = yry0.a;
                        ((afq0) this.b).D.l(new jeq0(yry0.a.c));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        if (ig5Var instanceof aqq0) {
            ((j011) this.b).reload();
        }
    }

    public /* synthetic */ ndl0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ndl0(Field field) {
        this.a = 27;
        this.b = field;
        field.setAccessible(true);
    }
}
