package com.yandex.go.tariffcard.ui;

import com.yandex.go.summary.analytics.SummaryAnalytics$UnsupportedRequirementSource;
import defpackage.bxi0;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.iev0;
import defpackage.iix0;
import defpackage.mdh;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.q421;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yjj0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardPresenter$unsupportedRequirementClicked$1", f = "TariffOptionsCardPresenter.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardPresenter$unsupportedRequirementClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ q421 $data;
    int label;
    final /* synthetic */ iix0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardPresenter$unsupportedRequirementClicked$1$1", f = "TariffOptionsCardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffOptionsCardPresenter$unsupportedRequirementClicked$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ q421 $data;
        int label;
        final /* synthetic */ iix0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iix0 iix0Var, q421 q421Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iix0Var;
            this.$data = q421Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$data, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pex0 pex0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.z).n();
            mi31 mi31Var = n != null ? n.a : null;
            iix0 iix0Var = this.this$0;
            q421 q421Var = this.$data;
            if (mi31Var != null) {
                iev0 iev0Var = iix0Var.S;
                String str = q421Var.a;
                SummaryAnalytics$UnsupportedRequirementSource summaryAnalytics$UnsupportedRequirementSource = SummaryAnalytics$UnsupportedRequirementSource.Header;
                String str2 = q421Var.b;
                iev0Var.d(str, summaryAnalytics$UnsupportedRequirementSource, str2 != null ? Collections.singletonList(str2) : null, null, mi31Var.f, mi31Var.b, mi31Var.g);
            } else {
                iix0Var.getClass();
            }
            iix0 iix0Var2 = this.this$0;
            q421 q421Var2 = this.$data;
            iix0Var2.getClass();
            String str3 = q421Var2.b;
            iix0Var2.J.e(q421Var2.a, (str3 == null || evu0.J(str3)) ? EmptyList.a : Collections.singletonList(q421Var2.b), RequirementRemoveSource.LIST, null);
            bxi0 bxi0Var = this.this$0.G;
            q421 q421Var3 = this.$data;
            String str4 = q421Var3.a;
            String str5 = q421Var3.b;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = (mi31Var == null || (pex0Var = mi31Var.a) == null) ? null : pex0Var.b;
            String str7 = mi31Var != null ? mi31Var.b : null;
            ((yjj0) bxi0Var).a(str4, str5, str6, str7 != null ? str7 : "");
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardPresenter$unsupportedRequirementClicked$1(iix0 iix0Var, q421 q421Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iix0Var;
        this.$data = q421Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsCardPresenter$unsupportedRequirementClicked$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardPresenter$unsupportedRequirementClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.H.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$data, null);
            this.label = 1;
            if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
