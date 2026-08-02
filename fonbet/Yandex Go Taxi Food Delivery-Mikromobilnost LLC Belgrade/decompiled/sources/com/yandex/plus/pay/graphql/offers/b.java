package com.yandex.plus.pay.graphql.offers;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.CHANGE_VOLUNTARY_AGREEMENT_STATUS;
import com.yandex.plus.pay.repository.api.model.mailingads.MailingAdsAgreement;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import defpackage.a300;
import defpackage.b300;
import defpackage.c300;
import defpackage.d300;
import defpackage.db9;
import defpackage.eb9;
import defpackage.f300;
import defpackage.gby;
import defpackage.m300;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.vo2;
import defpackage.w511;
import defpackage.x200;
import defpackage.y200;
import defpackage.z200;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements m300 {
    public final qo2 a;
    public final p5z b;
    public final y200 c;

    public b(qo2 qo2Var, p5z p5zVar) {
        this.a = qo2Var;
        this.b = p5zVar;
        new gby();
        this.c = new y200();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(1:15)|16|(3:18|(1:20)|21)|22|23))|38|6|7|(0)(0)|12|13|(0)|16|(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0038, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MailingAdsAgreement.Status status, ContinuationImpl continuationImpl) {
        GraphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1 graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1;
        int i;
        Object obj;
        Throwable a;
        if (continuationImpl instanceof GraphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1) {
            graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1 = (GraphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1) continuationImpl;
            int i2 = graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    skd0.g(PlusLogTag.SDK, "changeMailingAdsAgreementStatus() status=" + status);
                    qo2 qo2Var = this.a;
                    this.c.getClass();
                    eb9 eb9Var = new eb9(y200.a(status));
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.L$0 = null;
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.L$1 = null;
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.L$2 = null;
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.L$3 = null;
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.I$0 = 0;
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.I$1 = 0;
                    graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.label = 1;
                    obj2 = com.yandex.plus.core.graphql.internal.a.a(qo2Var, eb9Var, graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                vo2 vo2Var = (vo2) obj2;
                rya1.b(vo2Var);
                obj = vo2Var;
                a = Result.a(obj);
                if (a != null) {
                    skd0.g(PlusLogTag.SDK, "changeMailingAdsAgreementStatus() error=" + a);
                }
                if (!(obj instanceof Result.Failure)) {
                    db9 db9Var = (db9) ((vo2) obj).c;
                    CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status = db9Var != null ? db9Var.a.a : null;
                    skd0.g(PlusLogTag.SDK, "changeMailingAdsAgreementStatus() success with result=" + change_voluntary_agreement_status);
                }
                return zy11.a;
            }
        }
        graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1 = new GraphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1(this, continuationImpl);
        Object obj22 = graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLMailingAdsAgreementRepository$changeMailingAdsAgreementStatus$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj22;
        rya1.b(vo2Var2);
        obj = vo2Var2;
        a = Result.a(obj);
        if (a != null) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        GraphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1 graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1;
        int i;
        a300 a300Var;
        MailingAdsAgreement.Status status;
        MailingAdsAgreement.TextLogic textLogic;
        b300 b300Var;
        if (continuationImpl instanceof GraphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1) {
            graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1 = (GraphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1) continuationImpl;
            int i2 = graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String upperCase = this.b.getLocale().getLanguage().toUpperCase(Locale.ROOT);
                    skd0.g(PlusLogTag.SDK, "getMailingAdsAgreement() language=".concat(upperCase));
                    f300 f300Var = new f300(upperCase);
                    graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.L$0 = null;
                    graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.label = 1;
                    obj = com.yandex.plus.core.graphql.internal.a.d(this.a, f300Var, graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1);
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
                vo2 vo2Var = (vo2) obj;
                rya1.b(vo2Var);
                skd0.g(PlusLogTag.SDK, "getMailingAdsAgreement() response=" + vo2Var);
                a300Var = (a300) vo2Var.c;
                if (a300Var != null) {
                    throw new GraphQLParseException("getMailingAdsAgreement() response data is null", null);
                }
                this.c.getClass();
                z200 z200Var = a300Var.a.a;
                if (z200Var == null) {
                    return null;
                }
                d300 d300Var = z200Var.c;
                String str = d300Var.a;
                ArrayList<c300> arrayList = d300Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (c300 c300Var : arrayList) {
                    LegalInfo.Item.Link link = (c300Var == null || (b300Var = c300Var.b) == null) ? null : new LegalInfo.Item.Link(b300Var.a, b300Var.b, b300Var.c);
                    if (link != null) {
                        arrayList2.add(link);
                    }
                }
                LegalInfo legalInfo = new LegalInfo(str, arrayList2);
                int i3 = x200.b[z200Var.a.ordinal()];
                if (i3 == 1) {
                    status = MailingAdsAgreement.Status.ALLOW;
                } else {
                    if (i3 != 2 && i3 != 3) {
                        w511.b();
                        return null;
                    }
                    status = MailingAdsAgreement.Status.REFUSE;
                }
                int i4 = x200.c[z200Var.b.ordinal()];
                if (i4 == 1) {
                    textLogic = MailingAdsAgreement.TextLogic.INVERTED;
                } else {
                    if (i4 != 2 && i4 != 3) {
                        w511.b();
                        return null;
                    }
                    textLogic = MailingAdsAgreement.TextLogic.DIRECT;
                }
                return new MailingAdsAgreement(legalInfo, status, textLogic);
            }
        }
        graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1 = new GraphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1(this, continuationImpl);
        Object obj2 = graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLMailingAdsAgreementRepository$getMailingAdsAgreement$1.label;
        if (i != 0) {
        }
        vo2 vo2Var2 = (vo2) obj2;
        rya1.b(vo2Var2);
        skd0.g(PlusLogTag.SDK, "getMailingAdsAgreement() response=" + vo2Var2);
        a300Var = (a300) vo2Var2.c;
        if (a300Var != null) {
        }
    }
}
