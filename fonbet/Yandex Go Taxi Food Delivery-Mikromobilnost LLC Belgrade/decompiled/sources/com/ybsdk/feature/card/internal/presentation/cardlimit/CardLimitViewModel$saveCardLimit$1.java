package com.ybsdk.feature.card.internal.presentation.cardlimit;

import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardLimitSettingScreenLoadResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardLimitSettingScreenSaveResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.interactors.g;
import defpackage.ayp0;
import defpackage.dgy;
import defpackage.dzh0;
import defpackage.egy;
import defpackage.fgy;
import defpackage.g8e;
import defpackage.gao;
import defpackage.ggy;
import defpackage.gi8;
import defpackage.il8;
import defpackage.jl40;
import defpackage.ki8;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tm60;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xxp0;
import defpackage.yxp0;
import defpackage.zxp0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitViewModel$saveCardLimit$1", f = "CardLimitViewModel.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardLimitViewModel$saveCardLimit$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLimitViewModel$saveCardLimit$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardLimitViewModel$saveCardLimit$1 cardLimitViewModel$saveCardLimit$1 = new CardLimitViewModel$saveCardLimit$1(this.this$0, this.$verificationToken, continuation);
        cardLimitViewModel$saveCardLimit$1.L$0 = obj;
        return cardLimitViewModel$saveCardLimit$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardLimitViewModel$saveCardLimit$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gi8 gi8Var;
        r0 r0Var;
        Object value;
        Object t8j0Var;
        il8 il8Var;
        Object obj2;
        BigDecimal bigDecimal;
        r0 r0Var2;
        Object value2;
        Object t8j0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            Object X = this.this$0.X();
            r8j0 r8j0Var = X instanceof r8j0 ? (r8j0) X : null;
            if (r8j0Var != null && (gi8Var = (gi8) r8j0Var.a) != null) {
                il8 il8Var2 = (il8) kotlin.collections.a.S(gi8Var.d, gi8Var.a);
                if (il8Var2 == null) {
                    x4c.g("[CardLimits] Limit is not selected", null, gi8Var, null, 10);
                    return zy11Var;
                }
                String str = gi8Var.b;
                Locale locale = tm60.a;
                BigDecimal g = tm60.g(str);
                if (g == null) {
                    x4c.g("[CardLimits] Invalid amount format", null, gi8Var, null, 10);
                    return zy11Var;
                }
                this.this$0.F.l.a.a("card.limit_setting_screen.save.initiated", g8e.w(1, "selected_limit", il8Var2.a));
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    u8j0 u8j0Var = (u8j0) value;
                    if (u8j0Var instanceof r8j0) {
                        r8j0 r8j0Var2 = (r8j0) u8j0Var;
                        t8j0Var = new r8j0(gi8.a((gi8) r8j0Var2.a, null, null, 0, true, 15), r8j0Var2.b, r8j0Var2.c, r8j0Var2.d);
                    } else if (u8j0Var instanceof s8j0) {
                        t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                    } else {
                        if (!(u8j0Var instanceof t8j0)) {
                            w511.b();
                            return null;
                        }
                        t8j0Var = new t8j0();
                    }
                } while (!r0Var.k(value, t8j0Var));
                a aVar = this.this$0;
                g gVar = aVar.D;
                String str2 = aVar.E;
                String str3 = this.$verificationToken;
                this.L$0 = il8Var2;
                this.L$1 = g;
                this.label = 1;
                Object b = gVar.b(str2, il8Var2, g, aVar, str3, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                il8Var = il8Var2;
                obj2 = b;
                bigDecimal = g;
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bigDecimal = (BigDecimal) this.L$1;
        il8Var = (il8) this.L$0;
        b.b(obj);
        obj2 = ((Result) obj).getValue();
        a aVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            ayp0 ayp0Var = (ayp0) obj2;
            if (ayp0Var instanceof xxp0) {
                qn8 qn8Var = aVar2.C;
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                int i2 = dzh0.ybsdk_card_card_period_limit_title;
                bVar.getClass();
                new Text.Resource(i2);
                aVar2.B.h(((mf8) qn8Var).b(((xxp0) ayp0Var).a, CardSecondFactorHelper$Request.PERIOD_LIMIT));
            } else if (ayp0Var instanceof yxp0) {
                qq7.b(aVar2.F.l, null, null, CardMainScreenEvents$CardLimitSettingScreenSaveResultResult.ERROR, "Authorization Denied", 3);
                x4c.g("Authorization Denied for setting card limits", null, null, null, 14);
                aVar2.Z(new ki8(gao.e(null, null, null, 7)));
            } else {
                if (!(ayp0Var instanceof zxp0)) {
                    w511.b();
                    return null;
                }
                ggy ggyVar = (ggy) ((zxp0) ayp0Var).a;
                if (jl40.l(ggyVar, fgy.a)) {
                    qq7 qq7Var = aVar2.F.l;
                    CardMainScreenEvents$CardLimitSettingScreenSaveResultResult cardMainScreenEvents$CardLimitSettingScreenSaveResultResult = CardMainScreenEvents$CardLimitSettingScreenSaveResultResult.OK;
                    String str4 = il8Var.a;
                    Locale locale2 = tm60.a;
                    qq7.b(qq7Var, str4, tm60.b(bigDecimal), cardMainScreenEvents$CardLimitSettingScreenSaveResultResult, null, 8);
                    aVar2.B.e();
                } else if (ggyVar instanceof dgy) {
                    qq7 qq7Var2 = aVar2.F.l;
                    CardMainScreenEvents$CardLimitSettingScreenSaveResultResult cardMainScreenEvents$CardLimitSettingScreenSaveResultResult2 = CardMainScreenEvents$CardLimitSettingScreenSaveResultResult.ERROR;
                    dgy dgyVar = (dgy) ggyVar;
                    String str5 = dgyVar.a;
                    qq7.b(qq7Var2, null, null, cardMainScreenEvents$CardLimitSettingScreenSaveResultResult2, dgyVar.a, 3);
                    x4c.g("Set card limits ends with failure", null, str5, null, 10);
                    aVar2.Z(new ki8(str5 == null ? gao.e(null, null, null, 7) : new n0t0(g8e.i(Text.Companion, str5))));
                } else if (!jl40.l(ggyVar, egy.a)) {
                    w511.b();
                    return null;
                }
            }
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(obj2);
        if (a != null) {
            qq7.a(aVar3.F.l, null, null, CardMainScreenEvents$CardLimitSettingScreenLoadResultResult.ERROR, a.getMessage(), 3);
            x4c.g("Exception during saveCardLimit() in CardLimitViewModel", a, null, null, 12);
            aVar3.Z(new ki8(gao.e(null, null, a, 3)));
        }
        pz40 Y2 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
            u8j0 u8j0Var2 = (u8j0) value2;
            if (u8j0Var2 instanceof r8j0) {
                r8j0 r8j0Var3 = (r8j0) u8j0Var2;
                t8j0Var2 = new r8j0(gi8.a((gi8) r8j0Var3.a, null, null, 0, false, 15), r8j0Var3.b, r8j0Var3.c, r8j0Var3.d);
            } else if (u8j0Var2 instanceof s8j0) {
                t8j0Var2 = new s8j0(((s8j0) u8j0Var2).a);
            } else {
                if (!(u8j0Var2 instanceof t8j0)) {
                    w511.b();
                    return null;
                }
                t8j0Var2 = new t8j0();
            }
        } while (!r0Var2.k(value2, t8j0Var2));
        return zy11Var;
    }
}
