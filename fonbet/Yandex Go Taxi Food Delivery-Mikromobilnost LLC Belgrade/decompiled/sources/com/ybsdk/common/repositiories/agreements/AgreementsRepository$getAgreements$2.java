package com.ybsdk.common.repositiories.agreements;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.Agreement;
import com.ybsdk.network.dto.AgreementListResponse;
import com.ybsdk.network.dto.common.Product;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.quz;
import defpackage.si;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vj1;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xj1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "", "Lxj1;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.agreements.AgreementsRepository$getAgreements$2", f = "AgreementsRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AgreementsRepository$getAgreements$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/AgreementListResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.common.repositiories.agreements.AgreementsRepository$getAgreements$2$1", f = "AgreementsRepository.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.common.repositiories.agreements.AgreementsRepository$getAgreements$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                Api api = this.this$0.a;
                this.label = 1;
                e = api.e(this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                e = ((Result) obj).getValue();
            }
            return new Result(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementsRepository$getAgreements$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AgreementsRepository$getAgreements$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AgreementsRepository$getAgreements$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        YBProduct yBProduct;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            Object c = c.c(anonymousClass1, this);
            arrayList = c;
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            arrayList = ((Result) obj).getValue();
        }
        if (!(arrayList instanceof Result.Failure)) {
            List<Agreement> agreements = ((AgreementListResponse) arrayList).getAgreements();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : agreements) {
                Agreement agreement = (Agreement) obj2;
                boolean z = (agreement.getProduct() == null || agreement.getProduct() == Product.UNKNOWN) ? false : true;
                if (!z) {
                    x4c.g("Product type were not expected", null, String.valueOf(agreement.getProduct()), null, 10);
                }
                if (z) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Agreement agreement2 = (Agreement) it.next();
                String agreementId = agreement2.getAgreementId();
                List<Agreement.Accessor> accessors = agreement2.getAccessors();
                ArrayList arrayList3 = new ArrayList(tcc.n(accessors, 10));
                Iterator<T> it2 = accessors.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new si(((Agreement.Accessor) it2.next()).getAccessorId()));
                }
                Product product = agreement2.getProduct();
                switch (product == null ? -1 : vj1.a[product.ordinal()]) {
                    case -1:
                    case 7:
                        quz.m("Unsupported product ", agreement2.getProduct(), " should've been filtered out before mapping");
                        return null;
                    case 0:
                    default:
                        w511.b();
                        return null;
                    case 1:
                        yBProduct = YBProduct.PRO;
                        break;
                    case 2:
                        yBProduct = YBProduct.WALLET;
                        break;
                    case 3:
                        yBProduct = YBProduct.SPLIT;
                        break;
                    case 4:
                        yBProduct = YBProduct.CREDIT;
                        break;
                    case 5:
                        yBProduct = YBProduct.CREDIT_LIMIT;
                        break;
                    case 6:
                        yBProduct = YBProduct.CREDIT_ACCOUNT;
                        break;
                }
                arrayList.add(new xj1(agreementId, arrayList3, yBProduct));
            }
        }
        return new Result(arrayList);
    }
}
