package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import android.content.Context;
import android.content.SharedPreferences;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneBankCacheInitiatedReceiverType;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.permissions.RequestPermissionResult;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.di.modules.features.v;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionDeeplink;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.domain.entities.PartnerWithActionEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.a201;
import defpackage.afb0;
import defpackage.ai90;
import defpackage.aj01;
import defpackage.aj90;
import defpackage.bbv0;
import defpackage.bfb0;
import defpackage.bi90;
import defpackage.bj01;
import defpackage.bqg;
import defpackage.br51;
import defpackage.ci90;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.di8;
import defpackage.dl01;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.gj90;
import defpackage.gly0;
import defpackage.h791;
import defpackage.hn01;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.in01;
import defpackage.j3h;
import defpackage.jfb0;
import defpackage.jl01;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.kfb0;
import defpackage.kn01;
import defpackage.lqq0;
import defpackage.mn01;
import defpackage.ny61;
import defpackage.ohq0;
import defpackage.omy0;
import defpackage.orp0;
import defpackage.ou01;
import defpackage.pi90;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q791;
import defpackage.qoi0;
import defpackage.qu01;
import defpackage.qya0;
import defpackage.r8j0;
import defpackage.rje;
import defpackage.rm01;
import defpackage.ro01;
import defpackage.s8j0;
import defpackage.si90;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tg01;
import defpackage.ti90;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.ug01;
import defpackage.ury;
import defpackage.w511;
import defpackage.web0;
import defpackage.wi01;
import defpackage.wi91;
import defpackage.wlp;
import defpackage.wly0;
import defpackage.x4c;
import defpackage.xeb0;
import defpackage.xi01;
import defpackage.yeb0;
import defpackage.yi01;
import defpackage.zgz0;
import defpackage.zi01;
import defpackage.zm01;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 implements aj90, qya0 {
    public final com.ybsdk.core.transfer.utils.domain.a B;
    public final Context C;
    public final v D;
    public final ug01 E;
    public final tfl0 F;
    public final TransferPhoneInputFragment.Arguments G;
    public final rm01 H;
    public final ro01 I;
    public final j3h J;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a K;
    public pzt0 L;
    public PhoneInputSource M;
    public final com.ybsdk.feature.transfer.version2.internal.domain.b N;
    public final i3y O;
    public final com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a P;
    public final i3y Q;
    public boolean R;
    public boolean S;

    public c(com.ybsdk.core.transfer.utils.domain.a aVar, Context context, v vVar, tg01 tg01Var, a201 a201Var, ug01 ug01Var, kn01 kn01Var, tfl0 tfl0Var, TransferPhoneInputFragment.Arguments arguments, rm01 rm01Var, ro01 ro01Var, j3h j3hVar, com.ybsdk.feature.transfer.version2.internal.screens.a aVar2, ai90 ai90Var) {
        super(new zgz0(22, arguments), kn01Var);
        r0 r0Var;
        Object value;
        this.B = aVar;
        this.C = context;
        this.D = vVar;
        this.E = ug01Var;
        this.F = tfl0Var;
        this.G = arguments;
        this.H = rm01Var;
        this.I = ro01Var;
        this.J = j3hVar;
        this.K = aVar2;
        this.M = PhoneInputSource.MANUALLY;
        this.N = tg01Var.a(arguments.getScenario());
        this.O = kotlin.a.a(new i5y0(28, a201Var, this));
        String agreementId = arguments.getAgreementId();
        MoneyEntity money = arguments.getMoney();
        String comment = arguments.getComment();
        k5c a = ds31.a(this);
        String transferSessionId = arguments.getTransferSessionId();
        TransferScenario scenario = arguments.getScenario();
        String destinationCountry = arguments.getDestinationCountry();
        boolean isWithReceiverName = arguments.getCrossBorderScenario().isWithReceiverName();
        PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry = PartnerSelectionFeature$Companion$Entry.TRANSFER;
        ci90 ci90Var = (ci90) ai90Var;
        this.P = new com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a(ci90Var.c, ci90Var.d, ci90Var.e, ci90Var.f, ci90Var.g, ci90Var.h, ci90Var.b, ci90Var.i, ci90Var.j, ci90Var.k, agreementId, money, comment, this, this, a, transferSessionId, scenario, destinationCountry, isWithReceiverName, new jl01(5, this), new gj90(2, this), partnerSelectionFeature$Companion$Entry);
        this.Q = kotlin.a.a(new zgz0(23, this));
        tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$2(this, null), 3);
        tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$3(this, null), 3);
        tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$4(this, null), 3);
        String phone = arguments.getPhone();
        if (phone != null) {
            com.google.i18n.phonenumbers.a aVar3 = jfb0.h;
            jfb0 c = wi91.c(phone);
            if (c != null) {
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, new hn01(c, TransferPhoneInputState$SelectedPhone$Status.DEFAULT), null, null, null, null, null, 8175)));
            }
        }
        PhoneInputSource phoneInputSource = arguments.getPhoneInputSource();
        if (phoneInputSource != null) {
            this.M = phoneInputSource;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(c cVar, ContinuationImpl continuationImpl) {
        TransferPhoneInputViewModel$checkMyselfPhoneNumber$1 transferPhoneInputViewModel$checkMyselfPhoneNumber$1;
        int i;
        String str;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        cVar.getClass();
        if (continuationImpl instanceof TransferPhoneInputViewModel$checkMyselfPhoneNumber$1) {
            transferPhoneInputViewModel$checkMyselfPhoneNumber$1 = (TransferPhoneInputViewModel$checkMyselfPhoneNumber$1) continuationImpl;
            int i2 = transferPhoneInputViewModel$checkMyselfPhoneNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPhoneInputViewModel$checkMyselfPhoneNumber$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferPhoneInputViewModel$checkMyselfPhoneNumber$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPhoneInputViewModel$checkMyselfPhoneNumber$1.label;
                RequestStatus$Data$Source requestStatus$Data$Source = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v vVar = cVar.D;
                    transferPhoneInputViewModel$checkMyselfPhoneNumber$1.label = 1;
                    obj = vVar.a(transferPhoneInputViewModel$checkMyselfPhoneNumber$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                str = (String) obj;
                if (str == null) {
                    pz40 Y = cVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                        com.google.i18n.phonenumbers.a aVar = jfb0.h;
                    } while (!r0Var2.k(value2, in01.a((in01) value2, null, null, null, null, null, null, null, new r8j0(wi91.c(str), requestStatus$Data$Source, 14), null, null, 8063)));
                } else {
                    pz40 Y2 = cVar.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, new s8j0(new Exception("Myself phone null")), null, null, 8063)));
                }
                return zy11.a;
            }
        }
        transferPhoneInputViewModel$checkMyselfPhoneNumber$1 = new TransferPhoneInputViewModel$checkMyselfPhoneNumber$1(cVar, continuationImpl);
        Object obj2 = transferPhoneInputViewModel$checkMyselfPhoneNumber$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPhoneInputViewModel$checkMyselfPhoneNumber$1.label;
        RequestStatus$Data$Source requestStatus$Data$Source2 = null;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(c cVar, ContinuationImpl continuationImpl) {
        TransferPhoneInputViewModel$fetchSenderHistory$1 transferPhoneInputViewModel$fetchSenderHistory$1;
        int i;
        Object j;
        r0 r0Var;
        Object value;
        Throwable a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        in01 in01Var;
        Object obj;
        cVar.getClass();
        if (continuationImpl instanceof TransferPhoneInputViewModel$fetchSenderHistory$1) {
            transferPhoneInputViewModel$fetchSenderHistory$1 = (TransferPhoneInputViewModel$fetchSenderHistory$1) continuationImpl;
            int i2 = transferPhoneInputViewModel$fetchSenderHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPhoneInputViewModel$fetchSenderHistory$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferPhoneInputViewModel$fetchSenderHistory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPhoneInputViewModel$fetchSenderHistory$1.label;
                int i3 = 14;
                zy11 zy11Var = zy11.a;
                EmptyList emptyList = EmptyList.a;
                RequestStatus$Data$Source requestStatus$Data$Source = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!((CommonFeatureFlag) ((qu01) cVar.I).b.d(wlp.I).getData()).isEnabled()) {
                        pz40 Y = cVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, in01.a((in01) value, new r8j0(emptyList, requestStatus$Data$Source, i3), null, null, null, null, null, null, null, null, null, 8190)));
                        return zy11Var;
                    }
                    cVar.i0().m();
                    com.ybsdk.feature.transfer.version2.internal.domain.b bVar = cVar.N;
                    transferPhoneInputViewModel$fetchSenderHistory$1.label = 1;
                    j = bVar.j(transferPhoneInputViewModel$fetchSenderHistory$1);
                    if (j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    j = ((Result) obj2).getValue();
                }
                if (!(j instanceof Result.Failure)) {
                    Object obj3 = (dqg) j;
                    if (obj3 instanceof bqg) {
                        FailDataException failDataException = new FailDataException((ct11) obj3);
                        cVar.i0().i(false);
                        x4c.g("Can't get sender history", failDataException, null, Collections.singletonList(orp0.e), 4);
                    } else {
                        cVar.i0().i(true);
                    }
                    cqg cqgVar = obj3 instanceof cqg ? (cqg) obj3 : null;
                    lqq0 lqq0Var = cqgVar != null ? (lqq0) cqgVar.a : null;
                    pz40 Y2 = cVar.Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                        in01Var = (in01) value3;
                        obj = lqq0Var != null ? lqq0Var.a : null;
                        if (obj == null) {
                            obj = emptyList;
                        }
                    } while (!r0Var3.k(value3, in01.a(in01Var, new r8j0(obj, requestStatus$Data$Source, i3), null, null, null, null, null, null, null, null, null, 8190)));
                }
                a = Result.a(j);
                if (a != null) {
                    pz40 Y3 = cVar.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, in01.a((in01) value2, new s8j0(a), null, null, null, null, null, null, null, null, null, 8190)));
                    cVar.i0().i(false);
                }
                return zy11Var;
            }
        }
        transferPhoneInputViewModel$fetchSenderHistory$1 = new TransferPhoneInputViewModel$fetchSenderHistory$1(cVar, continuationImpl);
        Object obj22 = transferPhoneInputViewModel$fetchSenderHistory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPhoneInputViewModel$fetchSenderHistory$1.label;
        int i32 = 14;
        zy11 zy11Var2 = zy11.a;
        EmptyList emptyList2 = EmptyList.a;
        RequestStatus$Data$Source requestStatus$Data$Source2 = null;
        if (i != 0) {
        }
        if (!(j instanceof Result.Failure)) {
        }
        a = Result.a(j);
        if (a != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(c cVar, jfb0 jfb0Var, String str, ContinuationImpl continuationImpl) {
        TransferPhoneInputViewModel$getSuggestedPartners$1 transferPhoneInputViewModel$getSuggestedPartners$1;
        int i;
        Object h0;
        Throwable a;
        pz40 Y;
        r0 r0Var;
        Object value;
        jfb0 jfb0Var2 = jfb0Var;
        cVar.getClass();
        if (continuationImpl instanceof TransferPhoneInputViewModel$getSuggestedPartners$1) {
            transferPhoneInputViewModel$getSuggestedPartners$1 = (TransferPhoneInputViewModel$getSuggestedPartners$1) continuationImpl;
            int i2 = transferPhoneInputViewModel$getSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPhoneInputViewModel$getSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferPhoneInputViewModel$getSuggestedPartners$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPhoneInputViewModel$getSuggestedPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transferPhoneInputViewModel$getSuggestedPartners$1.L$0 = jfb0Var2;
                    transferPhoneInputViewModel$getSuggestedPartners$1.label = 1;
                    h0 = cVar.h0(jfb0Var2, str, transferPhoneInputViewModel$getSuggestedPartners$1);
                    if (h0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jfb0Var2 = (jfb0) transferPhoneInputViewModel$getSuggestedPartners$1.L$0;
                    kotlin.b.b(obj);
                    h0 = ((Result) obj).getValue();
                }
                if (!(h0 instanceof Result.Failure)) {
                    dqg dqgVar = (dqg) h0;
                    hn01 hn01Var = ((in01) cVar.X()).e;
                    if (jl40.l(hn01Var != null ? hn01Var.a : null, jfb0Var2)) {
                        cVar.a0(new dl01(4, dqgVar, cVar));
                    }
                }
                a = Result.a(h0);
                if (a != null && !(a instanceof CancellationException)) {
                    cVar.i0().a(a.getMessage());
                    Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, in01.a((in01) value, null, null, new s8j0(a), null, null, null, null, null, null, null, 8187)));
                }
                return h0;
            }
        }
        transferPhoneInputViewModel$getSuggestedPartners$1 = new TransferPhoneInputViewModel$getSuggestedPartners$1(cVar, continuationImpl);
        Object obj3 = transferPhoneInputViewModel$getSuggestedPartners$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPhoneInputViewModel$getSuggestedPartners$1.label;
        if (i != 0) {
        }
        if (!(h0 instanceof Result.Failure)) {
        }
        a = Result.a(h0);
        if (a != null) {
            cVar.i0().a(a.getMessage());
            Y = cVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, in01.a((in01) value, null, null, new s8j0(a), null, null, null, null, null, null, null, 8187)));
        }
        return h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(c cVar, jfb0 jfb0Var, String str, ContinuationImpl continuationImpl) {
        TransferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1 transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1;
        int i;
        Object h0;
        Throwable a;
        hn01 hn01Var;
        r0 r0Var;
        Object value;
        jfb0 jfb0Var2 = jfb0Var;
        TransferPhoneInputFragment.Arguments arguments = cVar.G;
        if (continuationImpl instanceof TransferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1) {
            transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1 = (TransferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1) continuationImpl;
            int i2 = transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.L$0 = jfb0Var2;
                    transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.label = 1;
                    h0 = cVar.h0(jfb0Var2, str, transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1);
                    if (h0 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jfb0Var2 = (jfb0) transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.L$0;
                    kotlin.b.b(obj);
                    h0 = ((Result) obj).getValue();
                }
                if (!(h0 instanceof Result.Failure)) {
                    Object obj3 = (dqg) h0;
                    hn01 hn01Var2 = ((in01) cVar.X()).e;
                    if (jl40.l(hn01Var2 != null ? hn01Var2.a : null, jfb0Var2)) {
                        if (obj3 instanceof bqg) {
                            cVar.j0(new FailDataException((ct11) obj3));
                        } else {
                            if (!(obj3 instanceof cqg)) {
                                w511.b();
                                return null;
                            }
                            bbv0 bbv0Var = (bbv0) ((cqg) obj3).a;
                            PartnerWithActionEntity partnerWithActionEntity = (PartnerWithActionEntity) kotlin.collections.a.R(bbv0Var.a);
                            zm01 i0 = cVar.i0();
                            ArrayList arrayList = bbv0Var.a;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((PartnerWithActionEntity) it.next()).getTitle());
                            }
                            i0.k(arrayList2);
                            pz40 Y = cVar.Y();
                            do {
                                r0Var = (r0) Y;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, in01.a((in01) value, null, null, null, bbv0Var.b, null, null, null, null, null, null, 8183)));
                            com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a aVar = cVar.P;
                            if (partnerWithActionEntity == null) {
                                aVar.i(jfb0Var2.b(), bbv0Var.b, arguments.getTransferType());
                            } else {
                                aVar.e(q791.n(partnerWithActionEntity), jfb0Var2.b(), bbv0Var.b, arguments.getTransferType(), true);
                            }
                        }
                    }
                }
                a = Result.a(h0);
                if (a != null && !(a instanceof CancellationException)) {
                    hn01Var = ((in01) cVar.X()).e;
                    if (jl40.l(hn01Var != null ? hn01Var.a : null, jfb0Var2)) {
                        cVar.j0(a);
                    }
                }
                return h0;
            }
        }
        transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1 = new TransferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1(cVar, continuationImpl);
        Object obj4 = transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPhoneInputViewModel$loadSuggestedPartnersForContactSkip$1.label;
        if (i != 0) {
        }
        if (!(h0 instanceof Result.Failure)) {
        }
        a = Result.a(h0);
        if (a != null) {
            hn01Var = ((in01) cVar.X()).e;
            if (jl40.l(hn01Var != null ? hn01Var.a : null, jfb0Var2)) {
            }
        }
        return h0;
    }

    public static final TransferEvents$TransferPhoneBankCacheInitiatedReceiverType f0(c cVar, xi01 xi01Var) {
        cVar.getClass();
        if (jl40.l(xi01Var, wly0.b)) {
            return TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.CONTACT_LIST;
        }
        if (jl40.l(xi01Var, gly0.b)) {
            return TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.CLIPBOARD;
        }
        if (jl40.l(xi01Var, omy0.b)) {
            return TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.MYSELF;
        }
        if (xi01Var == null) {
            return TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.MANUAL;
        }
        w511.b();
        return null;
    }

    public final void A0(boolean z, boolean z2) {
        jfb0 jfb0Var;
        hn01 hn01Var = ((in01) X()).e;
        if (hn01Var != null && (jfb0Var = hn01Var.a) != null) {
            D0(jfb0Var.b());
        }
        if (z2 || z || this.R) {
            return;
        }
        if (((SharedPreferences) this.Q.getValue()).getBoolean("phone_permission_was_disallowed", false)) {
            z0();
        } else {
            Z(new yeb0(false));
        }
    }

    public final void B0(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
        TransferPhoneInputFragment.Arguments arguments = this.G;
        String agreementId = arguments.getAgreementId();
        MoneyEntity money = arguments.getMoney();
        String comment = arguments.getComment();
        String transferSessionId = arguments.getTransferSessionId();
        TransferScenario scenario = arguments.getScenario();
        String destinationCountry = arguments.getDestinationCountry();
        this.K.getClass();
        TransitionPolicyType transitionPolicyType = TransitionPolicyType.POPUP;
        this.F.h(new FragmentScreen("TransferReceiverNameScreen", false, new TransferReceiverNameFragment.Arguments(selectedPartner, phoneInputSource, agreementId, money, comment, transferSessionId, scenario, destinationCountry), transitionPolicyType, qoi0.a(TransferReceiverNameFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
    }

    public final void C0() {
        D0(((in01) X()).f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r14.c() == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r14.c() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0(String str) {
        jfb0 c;
        pz40 Y;
        r0 r0Var;
        Object value;
        PhoneSelectionScenario phoneSelectionScenario = ((in01) X()).k;
        int[] iArr = mn01.b;
        int i = iArr[phoneSelectionScenario.ordinal()];
        if (i == 1) {
            com.google.i18n.phonenumbers.a aVar = jfb0.h;
            c = wi91.c(kfb0.a(str));
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            com.google.i18n.phonenumbers.a aVar2 = jfb0.h;
            c = wi91.c(str);
        }
        int i2 = iArr[((in01) X()).k.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return;
            }
            if (c != null) {
            }
            Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, null, null, 8187)));
        }
        if (c != null) {
            if (!c.d()) {
            }
            y0(c, null, null);
            return;
        }
        Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, null, null, 8187)));
    }

    public final void E0(boolean z) {
        if (!z || (((in01) X()).b instanceof r8j0)) {
            return;
        }
        tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$loadContacts$1(this, null), 3);
    }

    @Override // defpackage.aj90
    public final void N(u8j0 u8j0Var) {
        hn01 hn01Var = ((in01) X()).e;
        if ((hn01Var != null ? hn01Var.b : null) == TransferPhoneInputState$SelectedPhone$Status.CHECKING) {
            return;
        }
        a0(new di8((r8j0) u8j0Var, 3));
    }

    @Override // defpackage.qya0
    public final void c(RequestPermissionResult requestPermissionResult) {
        i0().c(requestPermissionResult);
        boolean z = true;
        this.R = true;
        int i = mn01.c[requestPermissionResult.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4 && i != 5) {
                w511.b();
                return;
            }
            z = false;
        }
        SharedPreferences.Editor edit = ((SharedPreferences) this.Q.getValue()).edit();
        edit.putBoolean("phone_permission_was_disallowed", z);
        edit.apply();
        if (requestPermissionResult.getIsGranted()) {
            tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$loadContacts$1(this, null), 3);
        } else {
            z0();
        }
    }

    @Override // defpackage.qya0
    public final void d() {
        i0().d();
    }

    @Override // defpackage.qya0
    public final void e() {
        i0().e();
    }

    @Override // defpackage.qya0
    public final void f() {
        i0().f();
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        String f = rje.f(this.C);
        if (f != null) {
            com.google.i18n.phonenumbers.a aVar = jfb0.h;
            jfb0 c = wi91.c(f);
            if (c != null) {
                RequestStatus$Data$Source requestStatus$Data$Source = null;
                if (!((Boolean) c.f.getValue()).booleanValue()) {
                    c = null;
                }
                if (c != null) {
                    pz40 Y = Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, in01.a((in01) value2, null, null, null, null, null, null, new r8j0(c, requestStatus$Data$Source, 14), null, null, null, 8127)));
                    return;
                }
            }
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, new s8j0(new Exception("Clipboard empty")), null, null, null, 8127)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(jfb0 jfb0Var, String str, ContinuationImpl continuationImpl) {
        TransferPhoneInputViewModel$fetchSuggestedPartners$1 transferPhoneInputViewModel$fetchSuggestedPartners$1;
        int i;
        if (continuationImpl instanceof TransferPhoneInputViewModel$fetchSuggestedPartners$1) {
            transferPhoneInputViewModel$fetchSuggestedPartners$1 = (TransferPhoneInputViewModel$fetchSuggestedPartners$1) continuationImpl;
            int i2 = transferPhoneInputViewModel$fetchSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPhoneInputViewModel$fetchSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferPhoneInputViewModel$fetchSuggestedPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPhoneInputViewModel$fetchSuggestedPartners$1.label;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = mn01.b[((in01) X()).k.ordinal()];
                TransferPhoneInputFragment.Arguments arguments = this.G;
                com.ybsdk.feature.transfer.version2.internal.domain.b bVar = this.N;
                if (i3 == 1) {
                    String destinationCountry = arguments.getDestinationCountry();
                    if (destinationCountry == null) {
                        destinationCountry = "UZ";
                    }
                    String b = jfb0Var.b();
                    transferPhoneInputViewModel$fetchSuggestedPartners$1.label = 1;
                    Object f = bVar.f(b, destinationCountry, str, transferPhoneInputViewModel$fetchSuggestedPartners$1);
                    if (f != coroutineSingletons) {
                        return f;
                    }
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    String agreementId = arguments.getAgreementId();
                    String b2 = jfb0Var.b();
                    transferPhoneInputViewModel$fetchSuggestedPartners$1.label = 2;
                    Object k = bVar.k(b2, agreementId, str, transferPhoneInputViewModel$fetchSuggestedPartners$1);
                    if (k != coroutineSingletons) {
                        return k;
                    }
                }
                return coroutineSingletons;
            }
        }
        transferPhoneInputViewModel$fetchSuggestedPartners$1 = new TransferPhoneInputViewModel$fetchSuggestedPartners$1(this, continuationImpl);
        Object obj2 = transferPhoneInputViewModel$fetchSuggestedPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPhoneInputViewModel$fetchSuggestedPartners$1.label;
        if (i == 0) {
        }
    }

    public final zm01 i0() {
        return (zm01) this.O.getValue();
    }

    public final void j0(Throwable th) {
        r0 r0Var;
        Object value;
        i0().a(th.getMessage());
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, null, null, 8175)));
        Z(new bfb0(th));
    }

    public final boolean k0() {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if (((in01) X()).j != null) {
            t0();
            return true;
        }
        hn01 hn01Var = ((in01) X()).e;
        if ((hn01Var != null ? hn01Var.b : null) == TransferPhoneInputState$SelectedPhone$Status.CHECKING) {
            pzt0 pzt0Var = this.L;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.L = null;
            this.P.b();
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, in01.a((in01) value2, null, null, null, null, null, null, null, null, null, null, 8175)));
        } else {
            if (((in01) X()).c == null) {
                q0();
                return true;
            }
            pz40 Y2 = Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, "", null, null, null, null, 8155)));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aj90
    public final u8j0 l() {
        r8j0 r8j0Var;
        ArrayList arrayList;
        PartnerWithAction$Status partnerWithAction$Status;
        u8j0 u8j0Var = ((in01) X()).c;
        int i = 14;
        RequestStatus$Data$Source requestStatus$Data$Source = null;
        EmptyList emptyList = EmptyList.a;
        if (u8j0Var != null) {
            List list = (List) u8j0Var.a();
            if (list != null) {
                List<wi01> list2 = list;
                arrayList = new ArrayList(tcc.n(list2, 10));
                for (wi01 wi01Var : list2) {
                    ti90 n = q791.n(wi01Var.a);
                    int i2 = bi90.a[wi01Var.b.ordinal()];
                    if (i2 == 1) {
                        partnerWithAction$Status = PartnerWithAction$Status.DEFAULT;
                    } else if (i2 == 2) {
                        partnerWithAction$Status = PartnerWithAction$Status.CHECKING;
                    } else if (i2 == 3) {
                        partnerWithAction$Status = PartnerWithAction$Status.NOT_FOUND;
                    } else {
                        if (i2 != 4) {
                            w511.b();
                            return null;
                        }
                        partnerWithAction$Status = PartnerWithAction$Status.FOUND;
                    }
                    arrayList.add(new si90(n, partnerWithAction$Status));
                }
            } else {
                arrayList = emptyList;
            }
            r8j0Var = new r8j0(arrayList, requestStatus$Data$Source, i);
        } else {
            r8j0Var = null;
        }
        return r8j0Var == null ? new r8j0(emptyList, requestStatus$Data$Source, i) : r8j0Var;
    }

    public final void l0(SelectedPartner selectedPartner) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, null, null, 8175)));
        if (this.G.getCrossBorderScenario().isWithReceiverName()) {
            Z(new xeb0(selectedPartner, this.M));
        } else {
            this.S = true;
            Z(new afb0(selectedPartner, this.M));
        }
    }

    public final void m0() {
        r0 r0Var;
        Object value;
        this.P.b();
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, null, null, 8175)));
    }

    public final void n0() {
        String supportUrl;
        u8j0 u8j0Var = ((in01) X()).c;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        ((ou01) this.H).a(supportUrl);
    }

    public final void o0() {
        this.S = true;
        this.F.e();
    }

    public final void p0() {
        this.S = true;
        boolean openedFromCrossBorderLanding = this.G.getOpenedFromCrossBorderLanding();
        tfl0 tfl0Var = this.F;
        if (openedFromCrossBorderLanding) {
            tfl0Var.l(this.K.a());
        } else {
            tfl0Var.e();
        }
    }

    public final void q0() {
        this.S = true;
        Z(web0.b);
    }

    public final void r0(boolean z) {
        r0 r0Var;
        Object value;
        PhonePlaceholder phonePlaceholder = z ? PhonePlaceholder.PHONE_OR_CONTACT : PhonePlaceholder.PHONE_ONLY;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, phonePlaceholder, null, 7935)));
    }

    public final void s0(String str) {
        jfb0 c;
        String str2;
        jfb0 jfb0Var;
        int i = mn01.b[((in01) X()).k.ordinal()];
        if (i == 1) {
            com.google.i18n.phonenumbers.a aVar = jfb0.h;
            c = wi91.c(kfb0.a(str));
            if (c == null || !c.d()) {
                c = null;
            }
            str2 = str;
            if ("+".concat(str2).length() != 12 || (jfb0Var = wi91.c(str2)) == null || !jfb0Var.c()) {
                jfb0Var = null;
            }
            if (c == null) {
                c = jfb0Var;
            }
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            com.google.i18n.phonenumbers.a aVar2 = jfb0.h;
            c = wi91.c(str);
            if (c == null || !c.c()) {
                str2 = str;
                c = null;
            } else {
                str2 = str;
            }
        }
        if (c != null) {
            if (((in01) X()).c == null) {
                if (((in01) X()).f.length() == 0) {
                    this.M = PhoneInputSource.COPY_PASTED;
                }
                y0(c, null, null);
                return;
            }
            return;
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            if (r0Var.k(value, in01.a((in01) value, null, null, null, null, null, str2, null, null, null, null, 8139))) {
                break;
            } else {
                str2 = str;
            }
        }
        this.M = PhoneInputSource.MANUALLY;
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        this.P.b();
    }

    public final void t0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, null, null, null, null, null, null, 7679)));
        Z(web0.c);
    }

    public final void u0() {
        ActionButtonEntity actionButtonEntity;
        String action;
        br51 br51Var = ((in01) X()).j;
        if (br51Var == null || (actionButtonEntity = br51Var.d) == null || (action = actionButtonEntity.getAction()) == null || h791.e(this.J, action, false, null, 14) == null) {
            t0();
        }
    }

    public final void v0() {
        ActionButtonEntity actionButtonEntity;
        String action;
        br51 br51Var = ((in01) X()).j;
        if (br51Var == null || (actionButtonEntity = br51Var.e) == null || (action = actionButtonEntity.getAction()) == null || h791.e(this.J, action, false, null, 14) == null) {
            t0();
        }
    }

    public final void w0() {
        Z(((((in01) X()).c instanceof s8j0) || this.S) ? web0.a : web0.c);
    }

    public final void x0(bj01 bj01Var, int i) {
        PhoneInputSource phoneInputSource;
        r0 r0Var;
        Object value;
        jfb0 jfb0Var;
        String b;
        ury uryVar = bj01Var.a;
        aj01 aj01Var = uryVar instanceof aj01 ? (aj01) uryVar : null;
        if (aj01Var == null) {
            return;
        }
        boolean z = aj01Var instanceof wi01;
        com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a aVar = this.P;
        if (z) {
            zm01 i0 = i0();
            PartnerWithActionEntity partnerWithActionEntity = ((wi01) aj01Var).a;
            i0.l(i, partnerWithActionEntity.getTitle());
            hn01 hn01Var = ((in01) X()).e;
            if (hn01Var == null || (jfb0Var = hn01Var.a) == null || (b = jfb0Var.b()) == null) {
                x4c.g("Try to check yb without phone", null, "filterText: " + ((in01) X()).f + "; is ybs null: " + (((in01) X()).c == null), null, 10);
                return;
            }
            TransferPhoneInputFragment.Arguments arguments = this.G;
            if (arguments.getCrossBorderScenario().isWithReceiverName()) {
                String action = partnerWithActionEntity.getAction();
                aVar.getClass();
                PartnerSelectionDeeplink a = action != null ? ((pi90) aVar.c).a(action) : null;
                if ((a instanceof PartnerSelectionDeeplink.SelectPartner) || (a instanceof PartnerSelectionDeeplink.SelectCrossBorderPartner)) {
                    PartnerEntity f = aVar.f(q791.n(partnerWithActionEntity));
                    if (f == null) {
                        return;
                    }
                    aVar.b();
                    l0(new SelectedPartner(f, null, null, b, null, ((in01) X()).d, null, 66, null));
                    return;
                }
            }
            aVar.e(q791.n(partnerWithActionEntity), b, ((in01) X()).d, arguments.getTransferType(), true);
            return;
        }
        if (!(aj01Var instanceof yi01)) {
            if (aj01Var.equals(zi01.a)) {
                Z(new yeb0(true));
                return;
            } else {
                w511.b();
                return;
            }
        }
        int i2 = mn01.b[((in01) X()).k.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return;
            }
            r3 = ((yi01) aj01Var).a.c();
        }
        if (r3) {
            yi01 yi01Var = (yi01) aj01Var;
            xi01 xi01Var = yi01Var.b;
            if (xi01Var.equals(gly0.b)) {
                phoneInputSource = PhoneInputSource.COPY_PASTED;
            } else {
                if (!xi01Var.equals(wly0.b) && !xi01Var.equals(omy0.b)) {
                    w511.b();
                    return;
                }
                phoneInputSource = PhoneInputSource.PHONEBOOK;
            }
            this.M = phoneInputSource;
            boolean isEnabled = ((CommonFeatureFlag) ((qu01) this.I).b.d(wlp.J).getData()).isEnabled();
            jfb0 jfb0Var2 = yi01Var.a;
            if (!isEnabled) {
                y0(jfb0Var2, xi01Var, Integer.valueOf(i));
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            pzt0 pzt0Var = this.L;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            aVar.b();
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, new hn01(jfb0Var2, TransferPhoneInputState$SelectedPhone$Status.CHECKING), null, null, null, null, null, 8175)));
            this.L = tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$onPhoneSelectedWithSkipBankCheck$2(this, xi01Var, valueOf, jfb0Var2, null), 3);
        }
    }

    public final void y0(jfb0 jfb0Var, xi01 xi01Var, Integer num) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, null, null, null, new hn01(jfb0Var, TransferPhoneInputState$SelectedPhone$Status.DEFAULT), null, null, null, null, null, 8175)));
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.P.b();
        if (this.G.getCrossBorderScenario() != CrossBorderScenario.PHONE_WITH_NAME) {
            this.L = tje.N(ds31.a(this), null, null, new TransferPhoneInputViewModel$onPhoneNumberSelected$2(this, xi01Var, num, jfb0Var, null), 3);
            return;
        }
        ohq0 ohq0Var = SelectedPartner.Companion;
        String b = jfb0Var.b();
        ohq0Var.getClass();
        l0(new SelectedPartner(new PartnerEntity("", "", null, null), null, null, b, null, null, null, 66, null));
    }

    public final void z0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, in01.a((in01) value, null, new s8j0(new Exception("Haven't contacts permission")), null, null, null, null, null, null, null, null, 8189)));
        if (this.S) {
            return;
        }
        Z(web0.c);
    }
}
