package com.yandex.payment.divkit.results;

import android.content.Context;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.usecases.j;
import defpackage.cnk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.scc;
import defpackage.tse;
import defpackage.vtf;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.results.DKResultViewModel$loadAndShowDivJson$1", f = "DKResultViewModel.kt", l = {48, 49}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKResultViewModel$loadAndShowDivJson$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isLightTheme;
    final /* synthetic */ ResultType $resultType;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ vtf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKResultViewModel$loadAndShowDivJson$1(vtf vtfVar, ResultType resultType, Context context, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vtfVar;
        this.$resultType = resultType;
        this.$context = context;
        this.$isLightTheme = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKResultViewModel$loadAndShowDivJson$1(this.this$0, this.$resultType, this.$context, this.$isLightTheme, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKResultViewModel$loadAndShowDivJson$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r2 == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            j jVar = this.this$0.b;
            boolean z = this.$resultType instanceof ResultType.Loading;
            this.label = 1;
            b = jVar.b(z, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var;
            }
            b.b(obj);
            b = obj;
        }
        vtf vtfVar = this.this$0;
        ResultType resultType = this.$resultType;
        Context context = this.$context;
        boolean z2 = this.$isLightTheme;
        omk omkVar = (omk) b;
        this.L$0 = b;
        this.L$1 = null;
        this.I$0 = 0;
        this.label = 2;
        vtfVar.getClass();
        ArrayList i2 = scc.i(new Pair("isLightTheme", String.valueOf(z2)), new Pair("result_screen_screen_type", resultType.getType()), new Pair("result_screen_has_back_button", String.valueOf(resultType.getIsBackButtonExist())), new Pair("result_screen_has_close_button", String.valueOf(resultType.getIsCloseButtonExist())), new Pair("result_screen_title_text", vtf.W(resultType.getTitle(), context)), new Pair("result_screen_subtitle_text", vtf.W(resultType.getSubtitle(), context)), new Pair("result_screen_main_button_text", vtf.W(resultType.getMainButtonText(), context)), new Pair("result_screen_complementary_button_text", vtf.W(resultType.getExtraButtonText(), context)));
        ResultScreenIdentifier identifier = resultType.getIdentifier();
        if (identifier != null) {
            i2.add(new Pair("result_screen_identifier", identifier.getDescription()));
        }
        Object emit = vtfVar.c.emit(new cnk(omkVar, i2), this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
