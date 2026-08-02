package com.ybsdk.feature.card.internal.presentation.cardlimit;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardLimitSettingScreenLoadResultResult;
import com.ybsdk.feature.card.internal.interactors.g;
import defpackage.gi8;
import defpackage.il8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qi8;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tm60;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitViewModel$invalidateData$2", f = "CardLimitViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardLimitViewModel$invalidateData$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLimitViewModel$invalidateData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardLimitViewModel$invalidateData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardLimitViewModel$invalidateData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [qi8] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object obj2;
        qi8 failure;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        Number number;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            g gVar = aVar2.D;
            String str2 = aVar2.E;
            this.L$0 = aVar2;
            this.label = 1;
            Object a = gVar.a(str2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(obj2);
        if (a2 == null) {
            failure = (qi8) obj2;
            ArrayList arrayList = failure.a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((il8) it.next()).g) {
                        break;
                    }
                }
            }
            failure = new Result.Failure(new Exception("Card limits can't be empty"));
        } else {
            failure = new Result.Failure(a2);
        }
        AppAnalyticsReporter appAnalyticsReporter = aVar.F;
        boolean z = failure instanceof Result.Failure;
        if (!z) {
            for (il8 il8Var : failure.a) {
                if (il8Var.g) {
                    qq7 qq7Var = appAnalyticsReporter.l;
                    String str3 = il8Var.a;
                    BigDecimal bigDecimal = il8Var.d;
                    if (bigDecimal != null) {
                        Locale locale = tm60.a;
                        str = tm60.b(bigDecimal);
                    } else {
                        str = null;
                    }
                    qq7.a(qq7Var, str3, str, CardMainScreenEvents$CardLimitSettingScreenLoadResultResult.OK, null, 8);
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return null;
        }
        Throwable a3 = Result.a(failure);
        if (a3 != null) {
            qq7.a(appAnalyticsReporter.l, null, null, CardMainScreenEvents$CardLimitSettingScreenLoadResultResult.ERROR, a3.getMessage(), 3);
        }
        a aVar3 = this.this$0;
        if (!z) {
            ArrayList arrayList2 = failure.a;
            Iterator it2 = arrayList2.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((il8) it2.next()).g) {
                    break;
                }
                i2++;
            }
            int i3 = i2;
            il8 il8Var2 = (il8) arrayList2.get(i3);
            pz40 Y = aVar3.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                Locale locale2 = tm60.a;
                number = il8Var2.d;
                if (number == null) {
                    number = 0;
                }
            } while (!r0Var2.k(value2, new r8j0(new gi8(i3, tm60.b(number), il8Var2.e, arrayList2, false), null, 14)));
        }
        a aVar4 = this.this$0;
        Throwable a4 = Result.a(failure);
        if (a4 != null) {
            pz40 Y2 = aVar4.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new s8j0(a4)));
            x4c.g("Can't load period limits info", a4, null, null, 12);
        }
        return zy11.a;
    }
}
