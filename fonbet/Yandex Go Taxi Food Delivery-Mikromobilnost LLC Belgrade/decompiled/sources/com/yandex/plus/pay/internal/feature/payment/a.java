package com.yandex.plus.pay.internal.feature.payment;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.di.d;
import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayTopupScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import defpackage.bmd;
import defpackage.c5t;
import defpackage.efd0;
import defpackage.fpd0;
import defpackage.gl41;
import defpackage.gt90;
import defpackage.k5t;
import defpackage.kyz0;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.xbt;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a implements fpd0 {
    public final efd0 a;
    public final mdd0 b;

    public a(d dVar, ndd0 ndd0Var) {
        this.a = dVar;
        this.b = ndd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        PlusTarifficatorServiceInternalImpl$getClosingOffer$1 plusTarifficatorServiceInternalImpl$getClosingOffer$1;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        mdd0 mdd0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusTarifficatorServiceInternalImpl$getClosingOffer$1) {
                plusTarifficatorServiceInternalImpl$getClosingOffer$1 = (PlusTarifficatorServiceInternalImpl$getClosingOffer$1) continuationImpl;
                int i2 = plusTarifficatorServiceInternalImpl$getClosingOffer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusTarifficatorServiceInternalImpl$getClosingOffer$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusTarifficatorServiceInternalImpl$getClosingOffer$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusTarifficatorServiceInternalImpl$getClosingOffer$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            c5t c5tVar = (c5t) ((d) this.a).e.C.getValue();
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$0 = offer;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$1 = mdd0Var2;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$2 = null;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$3 = null;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$4 = null;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$5 = null;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.I$0 = 0;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.I$1 = 0;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.I$2 = 0;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.I$3 = 0;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.I$4 = 0;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.I$5 = 0;
                            plusTarifficatorServiceInternalImpl$getClosingOffer$1.label = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.closing.a) c5tVar).a(offer, plusTarifficatorServiceInternalImpl$getClosingOffer$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            offer2 = offer;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            offer2 = offer;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            offer2 = offer;
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
                        mdd0Var = (mdd0) plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$1;
                        offer2 = (PlusPayCompositeOffers.Offer) plusTarifficatorServiceInternalImpl$getClosingOffer$1.L$0;
                        try {
                            b.b(obj2);
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
                    obj = (PlusPayClosingOffer) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayClosingOffer plusPayClosingOffer = (PlusPayClosingOffer) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getClosingOffer(" + offer2 + Extension.FIX_SPACE + plusPayClosingOffer + ")} = " + plusPayClosingOffer);
                    return plusPayClosingOffer;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayClosingOffer) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusTarifficatorServiceInternalImpl$getClosingOffer$1 = new PlusTarifficatorServiceInternalImpl$getClosingOffer$1(this, continuationImpl);
        Object obj22 = plusTarifficatorServiceInternalImpl$getClosingOffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorServiceInternalImpl$getClosingOffer$1.label;
        mdd0 mdd0Var22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, PlusPayOfferDetailsConfiguration plusPayOfferDetailsConfiguration, ContinuationImpl continuationImpl) {
        PlusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1 plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        mdd0 mdd0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1) {
                plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1 = (PlusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1) continuationImpl;
                int i2 = plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            bmd bmdVar = (bmd) ((d) this.a).e.u.getValue();
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$0 = offer;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$1 = plusPayOfferDetailsConfiguration;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$2 = mdd0Var2;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$3 = null;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$4 = null;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$5 = null;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$6 = null;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.I$0 = 0;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.I$1 = 0;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.I$2 = 0;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.I$3 = 0;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.I$4 = 0;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.I$5 = 0;
                            plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.label = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.offers.a) bmdVar).a(offer, plusPayOfferDetailsConfiguration, plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            offer2 = offer;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            offer2 = offer;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            offer2 = offer;
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
                        mdd0Var = (mdd0) plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$2;
                        plusPayOfferDetailsConfiguration = (PlusPayOfferDetailsConfiguration) plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$1;
                        offer2 = (PlusPayCompositeOffers.Offer) plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.L$0;
                        try {
                            b.b(obj2);
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
                    obj = (PlusPayCompositeOfferDetails) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getCompositeOfferDetails(" + offer2 + Extension.FIX_SPACE + plusPayOfferDetailsConfiguration + ")=" + plusPayCompositeOfferDetails);
                    return plusPayCompositeOfferDetails;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayCompositeOfferDetails) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1 = new PlusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1(this, continuationImpl);
        Object obj22 = plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorServiceInternalImpl$getCompositeOfferDetails$1.label;
        mdd0 mdd0Var22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayCompositeOffers.Offer offer, PlusPayCounterOffersReason plusPayCounterOffersReason, ContinuationImpl continuationImpl) {
        PlusTarifficatorServiceInternalImpl$getCounterOffers$1 plusTarifficatorServiceInternalImpl$getCounterOffers$1;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        mdd0 mdd0Var;
        k5t k5tVar;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusTarifficatorServiceInternalImpl$getCounterOffers$1) {
                plusTarifficatorServiceInternalImpl$getCounterOffers$1 = (PlusTarifficatorServiceInternalImpl$getCounterOffers$1) continuationImpl;
                int i2 = plusTarifficatorServiceInternalImpl$getCounterOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusTarifficatorServiceInternalImpl$getCounterOffers$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusTarifficatorServiceInternalImpl$getCounterOffers$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusTarifficatorServiceInternalImpl$getCounterOffers$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            try {
                                k5tVar = (k5t) ((d) this.a).e.D.getValue();
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$0 = offer;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$1 = null;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$2 = mdd0Var2;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$3 = null;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$4 = null;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$5 = null;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$6 = null;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.I$0 = 0;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.I$1 = 0;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.I$2 = 0;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.I$3 = 0;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.I$4 = 0;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.I$5 = 0;
                                plusTarifficatorServiceInternalImpl$getCounterOffers$1.label = 1;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                obj2 = ((com.yandex.plus.pay.internal.feature.counter_offers.a) k5tVar).a(offer, plusPayCounterOffersReason, plusTarifficatorServiceInternalImpl$getCounterOffers$1);
                                if (obj2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                offer2 = offer;
                                mdd0Var = mdd0Var2;
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                e = e;
                                offer2 = offer;
                                mdd0Var = mdd0Var2;
                                failure = new Result.Failure(e);
                                obj = failure;
                                a = Result.a(obj);
                                if (a == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                offer2 = offer;
                                mdd0Var = mdd0Var2;
                                failure = new Result.Failure(th);
                                obj = failure;
                                a = Result.a(obj);
                                if (a == null) {
                                }
                            }
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mdd0Var = (mdd0) plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$2;
                        offer2 = (PlusPayCompositeOffers.Offer) plusTarifficatorServiceInternalImpl$getCounterOffers$1.L$0;
                        try {
                            b.b(obj2);
                        } catch (TimeoutCancellationException e4) {
                            e = e4;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (PlusPayCounterOffers) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayCounterOffers plusPayCounterOffers = (PlusPayCounterOffers) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getCounterOffers(" + offer2 + Extension.FIX_SPACE + plusPayCounterOffers + ")} = " + plusPayCounterOffers);
                    return plusPayCounterOffers;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayCounterOffers) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e5) {
            throw e5;
        }
        plusTarifficatorServiceInternalImpl$getCounterOffers$1 = new PlusTarifficatorServiceInternalImpl$getCounterOffers$1(this, continuationImpl);
        Object obj22 = plusTarifficatorServiceInternalImpl$getCounterOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorServiceInternalImpl$getCounterOffers$1.label;
        mdd0 mdd0Var22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        PlusTarifficatorServiceInternalImpl$getPresale$1 plusTarifficatorServiceInternalImpl$getPresale$1;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        mdd0 mdd0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusTarifficatorServiceInternalImpl$getPresale$1) {
                plusTarifficatorServiceInternalImpl$getPresale$1 = (PlusTarifficatorServiceInternalImpl$getPresale$1) continuationImpl;
                int i2 = plusTarifficatorServiceInternalImpl$getPresale$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusTarifficatorServiceInternalImpl$getPresale$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusTarifficatorServiceInternalImpl$getPresale$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusTarifficatorServiceInternalImpl$getPresale$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            xbt a2 = ((d) this.a).a();
                            plusTarifficatorServiceInternalImpl$getPresale$1.L$0 = offer;
                            plusTarifficatorServiceInternalImpl$getPresale$1.L$1 = mdd0Var2;
                            plusTarifficatorServiceInternalImpl$getPresale$1.L$2 = null;
                            plusTarifficatorServiceInternalImpl$getPresale$1.L$3 = null;
                            plusTarifficatorServiceInternalImpl$getPresale$1.L$4 = null;
                            plusTarifficatorServiceInternalImpl$getPresale$1.L$5 = null;
                            plusTarifficatorServiceInternalImpl$getPresale$1.I$0 = 0;
                            plusTarifficatorServiceInternalImpl$getPresale$1.I$1 = 0;
                            plusTarifficatorServiceInternalImpl$getPresale$1.I$2 = 0;
                            plusTarifficatorServiceInternalImpl$getPresale$1.I$3 = 0;
                            plusTarifficatorServiceInternalImpl$getPresale$1.I$4 = 0;
                            plusTarifficatorServiceInternalImpl$getPresale$1.I$5 = 0;
                            plusTarifficatorServiceInternalImpl$getPresale$1.label = 1;
                            obj2 = a2.a(offer, plusTarifficatorServiceInternalImpl$getPresale$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            offer2 = offer;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            offer2 = offer;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            offer2 = offer;
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
                        mdd0Var = (mdd0) plusTarifficatorServiceInternalImpl$getPresale$1.L$1;
                        offer2 = (PlusPayCompositeOffers.Offer) plusTarifficatorServiceInternalImpl$getPresale$1.L$0;
                        try {
                            b.b(obj2);
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
                    obj = (PlusPayPresale) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayPresale plusPayPresale = (PlusPayPresale) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getPresale(" + offer2 + ") = " + plusPayPresale);
                    return plusPayPresale;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayPresale) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusTarifficatorServiceInternalImpl$getPresale$1 = new PlusTarifficatorServiceInternalImpl$getPresale$1(this, continuationImpl);
        Object obj22 = plusTarifficatorServiceInternalImpl$getPresale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorServiceInternalImpl$getPresale$1.label;
        mdd0 mdd0Var22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PlusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1 plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1;
        int i;
        mdd0 mdd0Var;
        kyz0 kyz0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1) {
                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1 = (PlusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1) continuationImpl;
                int i2 = plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            try {
                                kyz0Var = (kyz0) ((d) this.a).e.y.getValue();
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$0 = null;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$1 = mdd0Var2;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$2 = null;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$3 = null;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$4 = null;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$5 = null;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.I$0 = 0;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.I$1 = 0;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.I$2 = 0;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.I$3 = 0;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.I$4 = 0;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.I$5 = 0;
                                plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.label = 1;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                obj2 = kyz0Var.a.a(str, plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1);
                                if (obj2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                mdd0Var = mdd0Var2;
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                e = e;
                                mdd0Var = mdd0Var2;
                                failure = new Result.Failure(e);
                                obj = failure;
                                a = Result.a(obj);
                                if (a == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                mdd0Var = mdd0Var2;
                                failure = new Result.Failure(th);
                                obj = failure;
                                a = Result.a(obj);
                                if (a == null) {
                                }
                            }
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mdd0Var = (mdd0) plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.L$1;
                        try {
                            b.b(obj2);
                        } catch (TimeoutCancellationException e4) {
                            e = e4;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (PlusPayTopupScreenConfiguration) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayTopupScreenConfiguration plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getTopupScreenConfiguration()=" + plusPayTopupScreenConfiguration);
                    return plusPayTopupScreenConfiguration;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayTopupScreenConfiguration) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e5) {
            throw e5;
        }
        plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1 = new PlusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1(this, continuationImpl);
        Object obj22 = plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorServiceInternalImpl$getTopupScreenConfiguration$1.label;
        mdd0 mdd0Var22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams, ContinuationImpl continuationImpl) {
        PlusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1 plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1;
        int i;
        PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams2;
        mdd0 mdd0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1) {
                plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1 = (PlusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1) continuationImpl;
                int i2 = plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            gl41 gl41Var = (gl41) ((d) this.a).e.z.getValue();
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$0 = plusPayWebSuccessScreenParams;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$1 = mdd0Var2;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$2 = null;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$3 = null;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$4 = null;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$5 = null;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.I$0 = 0;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.I$1 = 0;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.I$2 = 0;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.I$3 = 0;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.I$4 = 0;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.I$5 = 0;
                            plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.label = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.success.a) gl41Var.a).a(plusPayWebSuccessScreenParams, plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            plusPayWebSuccessScreenParams2 = plusPayWebSuccessScreenParams;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            plusPayWebSuccessScreenParams2 = plusPayWebSuccessScreenParams;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            plusPayWebSuccessScreenParams2 = plusPayWebSuccessScreenParams;
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
                        mdd0Var = (mdd0) plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$1;
                        plusPayWebSuccessScreenParams2 = (PlusPayWebSuccessScreenParams) plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.L$0;
                        try {
                            b.b(obj2);
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
                    obj = (PlusPayWebSuccessScreenConfiguration) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayWebSuccessScreenConfiguration plusPayWebSuccessScreenConfiguration = (PlusPayWebSuccessScreenConfiguration) obj;
                    mdd0.c(mdd0Var2, gt90.b, this + ".getWebSuccessScreenConfiguration(" + plusPayWebSuccessScreenParams2 + ")=" + plusPayWebSuccessScreenConfiguration);
                    return plusPayWebSuccessScreenConfiguration;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayWebSuccessScreenConfiguration) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1 = new PlusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1(this, continuationImpl);
        Object obj22 = plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusTarifficatorServiceInternalImpl$getWebSuccessScreenConfiguration$1.label;
        mdd0 mdd0Var22 = this.b;
    }
}
