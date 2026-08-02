package com.yandex.plus.pay.internal.feature.mailing;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.repository.api.model.mailingads.MailingAdsAgreement;
import defpackage.gt90;
import defpackage.i3y;
import defpackage.m300;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.pdd0;
import defpackage.qxz;
import defpackage.ums;
import defpackage.v200;
import defpackage.xyz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a implements v200 {
    public final m300 a;
    public final mdd0 b;
    public final i3y c;
    public final i3y d;

    public a(m300 m300Var, mdd0 mdd0Var) {
        this.a = m300Var;
        this.b = mdd0Var;
        int i = 4;
        this.c = kotlin.a.a(new qxz(i));
        this.d = kotlin.a.a(new xyz(i, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, ContinuationImpl continuationImpl) {
        MailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1 mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1;
        int i;
        if (continuationImpl instanceof MailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1) {
            mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1 = (MailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1) continuationImpl;
            int i2 = mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (plusPayMailingAdsAgreement != null) {
                        mdd0.c(this.b, gt90.b, "Start change mailing ads agreement status");
                        pdd0 pdd0Var = (pdd0) this.d.getValue();
                        boolean isAgreementsChecked = plusPayMailingAdsAgreement.isAgreementsChecked();
                        PlusPayMailingAdsAgreement.TextLogic textLogic = plusPayMailingAdsAgreement.getTextLogic();
                        pdd0Var.getClass();
                        MailingAdsAgreement.Status status = (isAgreementsChecked && textLogic == PlusPayMailingAdsAgreement.TextLogic.DIRECT) ? MailingAdsAgreement.Status.ALLOW : (isAgreementsChecked || textLogic != PlusPayMailingAdsAgreement.TextLogic.INVERTED) ? MailingAdsAgreement.Status.REFUSE : MailingAdsAgreement.Status.ALLOW;
                        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.L$0 = null;
                        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.L$1 = plusPayMailingAdsAgreement;
                        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.L$2 = null;
                        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.L$3 = null;
                        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.I$0 = 0;
                        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.label = 1;
                        if (((com.yandex.plus.pay.graphql.offers.b) this.a).a(status, mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1 = new MailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1(this, continuationImpl);
        Object obj2 = mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mailingAdsAgreementInteractorImpl$changeMailingAdsAgreementStatus$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1 mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1;
        int i;
        mdd0 mdd0Var;
        pdd0 pdd0Var;
        Object failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof MailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1) {
                mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1 = (MailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1) continuationImpl;
                int i2 = mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.label;
                    mdd0 mdd0Var2 = this.b;
                    ums umsVar = gt90.b;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        mdd0.c(mdd0Var2, umsVar, "Start loading mailing ads agreement");
                        try {
                            pdd0 pdd0Var2 = (pdd0) this.d.getValue();
                            m300 m300Var = this.a;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$0 = mdd0Var2;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$1 = null;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$2 = null;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$3 = null;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$4 = null;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$5 = pdd0Var2;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.I$0 = 0;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.I$1 = 0;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.I$2 = 0;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.I$3 = 0;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.I$4 = 0;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.I$5 = 0;
                            mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.label = 1;
                            Object b = ((com.yandex.plus.pay.graphql.offers.b) m300Var).b(mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj2 = b;
                            pdd0Var = pdd0Var2;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pdd0Var = (pdd0) mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$5;
                        mdd0Var = (mdd0) mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = pdd0Var.a((MailingAdsAgreement) obj2);
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) obj;
                    mdd0.c(mdd0Var2, umsVar, "getMailingAdsAgreement() result=" + plusPayMailingAdsAgreement);
                    return plusPayMailingAdsAgreement;
                }
            }
            if (i != 0) {
            }
            obj = pdd0Var.a((MailingAdsAgreement) obj2);
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1 = new MailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1(this, continuationImpl);
        Object obj22 = mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mailingAdsAgreementInteractorImpl$getMailingAdsAgreement$1.label;
        mdd0 mdd0Var22 = this.b;
        ums umsVar2 = gt90.b;
    }
}
