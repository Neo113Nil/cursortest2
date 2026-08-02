package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main;

import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import com.yandex.go.scooters.promocodes.data.e;
import defpackage.dms;
import defpackage.g92;
import defpackage.ha2;
import defpackage.mvg;
import defpackage.nrj;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$attachView$1", f = "DiscountsViewPresenter.kt", l = {HProv.ALG_SID_SHA3_256, 80}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsViewPresenter$attachView$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$attachView$1$1", f = "DiscountsViewPresenter.kt", l = {101}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $zoneName;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lrmf0;", "sections", "Ldno0;", "promoLinks", "Lnrj;", "referralsInfo", "", "editModeEnabled", "Lzy11;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Lnrj;Z)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$attachView$1$1$2", f = "DiscountsViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$attachView$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements dms {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(a aVar, Continuation continuation) {
                super(5, continuation);
                this.this$0 = aVar;
            }

            @Override // defpackage.dms
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj5);
                anonymousClass2.L$0 = (List) obj;
                anonymousClass2.L$1 = (List) obj2;
                anonymousClass2.L$2 = (nrj) obj3;
                anonymousClass2.Z$0 = booleanValue;
                zy11 zy11Var = zy11.a;
                anonymousClass2.invokeSuspend(zy11Var);
                return zy11Var;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r26) {
                /*
                    Method dump skipped, instructions count: 773
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$attachView$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.$zoneName = str;
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$zoneName, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = this.$zoneName;
                if (str != null) {
                    tje.N(tseVar, null, null, new DiscountsViewPresenter$attachView$1$1$1$1(this.this$0, str, null), 3);
                }
                a aVar = this.this$0;
                d dVar = aVar.z;
                String str2 = this.$zoneName;
                if (str2 == null) {
                    str2 = "";
                }
                List list = aVar.G;
                c cVar = dVar.a;
                com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.b bVar = new com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.b(cVar.l, cVar, str2, list);
                tpr dVar2 = list.contains("scooters") ? new com.yandex.go.scooters.promocodes.data.d(ru.yandex.taxi.experiments.d.b(((e) dVar.c).a)) : new g92(2, EmptyList.a);
                m0 a = this.this$0.C.a();
                a aVar2 = this.this$0;
                ha2 m = kotlinx.coroutines.flow.e.m(bVar, dVar2, a, aVar2.I, new AnonymousClass2(aVar2, null));
                this.L$0 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.j(m, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsViewPresenter$attachView$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsViewPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscountsViewPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (defpackage.bvf0.n(r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c cVar = this.this$0.A;
            this.label = 1;
            a = cVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        if (a instanceof Result.Failure) {
            a = null;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (String) a, null);
        this.L$0 = null;
        this.label = 2;
    }
}
