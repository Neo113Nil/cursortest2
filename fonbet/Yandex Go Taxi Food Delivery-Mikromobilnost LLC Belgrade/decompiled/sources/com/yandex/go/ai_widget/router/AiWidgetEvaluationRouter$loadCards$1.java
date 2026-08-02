package com.yandex.go.ai_widget.router;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorErrorType;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationCompletionScreen;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemDto;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemType;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationResponse;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.b1;
import defpackage.b64;
import defpackage.bo1;
import defpackage.co1;
import defpackage.do1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo1;
import defpackage.qo1;
import defpackage.scc;
import defpackage.so1;
import defpackage.to1;
import defpackage.tse;
import defpackage.uo1;
import defpackage.up1;
import defpackage.vo1;
import defpackage.vp1;
import defpackage.w511;
import defpackage.wls;
import defpackage.wp1;
import defpackage.x4e;
import defpackage.xn1;
import defpackage.yp1;
import defpackage.yp2;
import defpackage.zp1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.router.AiWidgetEvaluationRouter$loadCards$1", f = "AiWidgetEvaluationRouter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationRouter$loadCards$1 extends SuspendLambda implements wls {
    final /* synthetic */ qo1 $currentPayload;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationRouter$loadCards$1(b bVar, qo1 qo1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentPayload = qo1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationRouter$loadCards$1(this.this$0, this.$currentPayload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiWidgetEvaluationRouter$loadCards$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i;
        int i2;
        Object up1Var;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection;
        Object co1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            com.yandex.go.ai_widget.data.a aVar = this.this$0.I;
            qo1 qo1Var = this.$currentPayload;
            String str = qo1Var.a;
            Boolean bool = qo1Var.b;
            this.label = 1;
            a = aVar.a(str, bool, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        vo1 vo1Var = (vo1) a;
        zp1 zp1Var = this.this$0.L;
        yp1 yp1Var = (yp1) zp1Var.b;
        yp1Var.getClass();
        if (jl40.l(vo1Var, so1.a)) {
            up1Var = new vp1(false);
        } else if (jl40.l(vo1Var, to1.a)) {
            up1Var = new vp1(true);
        } else {
            if (!(vo1Var instanceof uo1)) {
                w511.b();
                return null;
            }
            AiWidgetEvaluationResponse aiWidgetEvaluationResponse = ((uo1) vo1Var).a;
            yp2 yp2Var = yp1Var.a;
            List<AiWidgetEvaluationItemDto> list = aiWidgetEvaluationResponse.c;
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (AiWidgetEvaluationItemDto aiWidgetEvaluationItemDto : list) {
                AiWidgetEvaluationItemType aiWidgetEvaluationItemType = aiWidgetEvaluationItemDto.b;
                String str2 = aiWidgetEvaluationItemDto.d;
                int i5 = oo1.a[aiWidgetEvaluationItemType.ordinal()];
                if (i5 == 1) {
                    if (str2 != null && (aiWidgetEvaluationSwipeDirection = aiWidgetEvaluationItemDto.f) != null) {
                        String str3 = aiWidgetEvaluationItemDto.a;
                        String uuid = UUID.randomUUID().toString();
                        AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
                        String str4 = aiWidgetEvaluationItemDto.c;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = aiWidgetEvaluationItemDto.e;
                        co1Var = new co1(str3, uuid, appColor$Palette, str5, str2, str6 == null ? "" : str6, aiWidgetEvaluationSwipeDirection);
                    }
                    co1Var = null;
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return null;
                    }
                    co1Var = str2 == null ? null : new bo1(aiWidgetEvaluationItemDto.a, UUID.randomUUID().toString(), yp2Var.a(aiWidgetEvaluationItemDto.g, AppColor$Palette.BgMinor), str2, aiWidgetEvaluationItemDto.h, aiWidgetEvaluationItemDto.i, i4);
                    if (co1Var != null) {
                        i4++;
                    }
                    co1Var = null;
                }
                if (co1Var != null) {
                    arrayList.add(co1Var);
                }
            }
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it = arrayList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    if ((((do1) it.next()) instanceof co1) && (i6 = i6 + 1) < 0) {
                        scc.l();
                        throw null;
                    }
                }
                i = i6;
            }
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    if ((((do1) it2.next()) instanceof bo1) && (i7 = i7 + 1) < 0) {
                        scc.l();
                        throw null;
                    }
                }
                i2 = i7;
            }
            boolean isEmpty = arrayList.isEmpty();
            AiWidgetEvaluationCompletionScreen aiWidgetEvaluationCompletionScreen = aiWidgetEvaluationResponse.b;
            String str7 = aiWidgetEvaluationResponse.a;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = aiWidgetEvaluationCompletionScreen != null ? aiWidgetEvaluationCompletionScreen.a : null;
            String str9 = str8 == null ? "" : str8;
            String str10 = aiWidgetEvaluationCompletionScreen != null ? aiWidgetEvaluationCompletionScreen.b : null;
            String str11 = str10 == null ? "" : str10;
            String str12 = aiWidgetEvaluationCompletionScreen != null ? aiWidgetEvaluationCompletionScreen.c : null;
            up1Var = new up1(str7, arrayList, str9, str11, str12 == null ? "" : str12, i, i2, isEmpty ? 0 : i2, isEmpty);
        }
        r0 r0Var = (r0) zp1Var.c;
        r0Var.getClass();
        r0Var.m(null, up1Var);
        wp1 wp1Var = wp1.a;
        if (!up1Var.equals(wp1Var)) {
            if (up1Var instanceof vp1) {
                zp1Var.a = 0;
                zp1Var.x = null;
                zp1Var.y = null;
            } else {
                if (!(up1Var instanceof up1)) {
                    w511.b();
                    return null;
                }
                zp1Var.a = 0;
                zp1Var.x = Long.valueOf(SystemClock.elapsedRealtime());
                zp1Var.y = null;
            }
        }
        b bVar = this.this$0;
        qo1 qo1Var2 = this.$currentPayload;
        zp1 zp1Var2 = bVar.L;
        xn1 xn1Var = bVar.J;
        if (!up1Var.equals(wp1Var)) {
            boolean z = up1Var instanceof vp1;
            String str13 = Constants.DEEPLINK;
            if (z) {
                vp1 vp1Var = (vp1) up1Var;
                b1 b1Var = xn1Var.a;
                String str14 = qo1Var2.c;
                if (str14 != null) {
                    str13 = str14;
                }
                AIWidgetAnalytics$TextsEvaluatorErrorType aIWidgetAnalytics$TextsEvaluatorErrorType = vp1Var.a ? AIWidgetAnalytics$TextsEvaluatorErrorType.NotFound : AIWidgetAnalytics$TextsEvaluatorErrorType.Other;
                String str15 = qo1Var2.a;
                b1Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("open_reason", str13);
                if (str15 != null) {
                    hashMap.put("batch_id", str15);
                }
                hashMap.put("error_type", aIWidgetAnalytics$TextsEvaluatorErrorType.getEventValue());
                b1Var.a.a("AIWidget.TextsEvaluator.ErrorShown", hashMap, 1, new HashMap());
            } else {
                if (!(up1Var instanceof up1)) {
                    w511.b();
                    return null;
                }
                b1 b1Var2 = xn1Var.a;
                String str16 = qo1Var2.c;
                if (str16 != null) {
                    str13 = str16;
                }
                int j = zp1Var2.j();
                up1 i8 = zp1Var2.i();
                int i9 = (i8 != null ? i8.g : 0) + j;
                int j2 = zp1Var2.j();
                up1 i10 = zp1Var2.i();
                int i11 = i10 != null ? i10.g : 0;
                String str17 = qo1Var2.a;
                b1Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("open_reason", str13);
                if (str17 != null) {
                    hashMap2.put("batch_id", str17);
                }
                b64.B(i9, hashMap2, "cards_count", j2, "onboarding_cards_count");
                b1Var2.a.a("AIWidget.TextsEvaluator.Shown", hashMap2, 1, x4e.n(i11, hashMap2, "evaluation_cards_count"));
                if (((up1) up1Var).i) {
                    xn1Var.b(qo1Var2, zp1Var2, 0);
                } else {
                    zp1Var2.y = zp1Var2.a == 0 ? (Long) zp1Var2.x : Long.valueOf(SystemClock.elapsedRealtime());
                    xn1Var.a(qo1Var2, zp1Var2);
                }
            }
        }
        return zy11.a;
    }
}
