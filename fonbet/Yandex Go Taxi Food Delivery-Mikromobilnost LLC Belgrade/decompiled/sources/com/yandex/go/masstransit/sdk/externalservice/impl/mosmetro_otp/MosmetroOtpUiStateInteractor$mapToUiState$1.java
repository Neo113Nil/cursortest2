package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import android.content.Context;
import defpackage.aa30;
import defpackage.awh0;
import defpackage.ba30;
import defpackage.bms;
import defpackage.ca30;
import defpackage.cyh0;
import defpackage.da30;
import defpackage.f930;
import defpackage.fa30;
import defpackage.g8e;
import defpackage.g930;
import defpackage.h930;
import defpackage.ht10;
import defpackage.j930;
import defpackage.jl40;
import defpackage.jll0;
import defpackage.l930;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p930;
import defpackage.q930;
import defpackage.r930;
import defpackage.s411;
import defpackage.u2h0;
import defpackage.w511;
import defpackage.x830;
import defpackage.y930;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh930;", ClidProvider.STATE, "", "retrySecondsLeft", "expiresSecondsLeft", "Lea30;", "<anonymous>", "(Lh930;II)Lea30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.MosmetroOtpUiStateInteractor$mapToUiState$1", f = "MosmetroOtpUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpUiStateInteractor$mapToUiState$1 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpUiStateInteractor$mapToUiState$1(h hVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        MosmetroOtpUiStateInteractor$mapToUiState$1 mosmetroOtpUiStateInteractor$mapToUiState$1 = new MosmetroOtpUiStateInteractor$mapToUiState$1(this.this$0, (Continuation) obj4);
        mosmetroOtpUiStateInteractor$mapToUiState$1.L$0 = (h930) obj;
        mosmetroOtpUiStateInteractor$mapToUiState$1.I$0 = intValue;
        mosmetroOtpUiStateInteractor$mapToUiState$1.I$1 = intValue2;
        return mosmetroOtpUiStateInteractor$mapToUiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        h930 h930Var = (h930) this.L$0;
        int i = this.I$0;
        int i2 = this.I$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fa30 fa30Var = this.this$0.b;
        r930 r930Var = h930Var.a;
        String str4 = h930Var.c;
        boolean z = h930Var.d;
        Integer num2 = h930Var.e;
        boolean z2 = h930Var.f;
        x830 x830Var = fa30Var.a;
        Context context = fa30Var.b.a;
        if (jl40.l(r930Var, p930.a)) {
            return ca30.a;
        }
        if (!(r930Var instanceof q930)) {
            if (r930Var instanceof l930) {
                return new ba30(new f930(Integer.valueOf(u2h0.brick_sign), context.getString(cyh0.mt_mosmetro_otp_error_popup_title), context.getString(cyh0.mt_mosmetro_otp_error_popup_subtitle), new ht10(context.getString(cyh0.mt_mosmetro_otp_error_popup_button_text), new y930(((l930) r930Var).a), false, 9)));
            }
            w511.b();
            return null;
        }
        if (z2) {
            boolean z3 = (num2 != null ? num2.intValue() : 1) <= 0;
            boolean z4 = i2 <= 0;
            String string = context.getString(cyh0.mt_mosmetro_otp_error_invalid_code);
            jll0 a = ((s411) x830Var).a();
            jll0.a aVar = a != null ? a.a : null;
            if (aVar == null || (str = aVar.d) == null) {
                str = string;
            }
            if (aVar != null && (str3 = aVar.f) != null) {
                string = str3;
            }
            str2 = (z3 || z4) ? string : str;
        } else {
            str2 = null;
        }
        g930 g930Var = ((q930) r930Var).a;
        if (i < 0) {
            i = 0;
        }
        boolean z5 = i == 0 && !z;
        jll0 a2 = ((s411) x830Var).a();
        jll0.a aVar2 = a2 != null ? a2.a : null;
        String str5 = aVar2 != null ? aVar2.a : null;
        String str6 = aVar2 != null ? aVar2.c : null;
        String str7 = g930Var.e;
        j930 j930Var = g930Var.b;
        int intValue = (j930Var == null || (num = j930Var.c) == null) ? 6 : num.intValue();
        Integer num3 = j930Var != null ? j930Var.a : null;
        String str8 = j930Var != null ? j930Var.b : null;
        String str9 = g930Var.c;
        int i3 = i / 60;
        int i4 = i % 60;
        return new aa30(str5, str6, str7, Integer.valueOf(intValue), num3, str8, str9, aVar2 != null ? aVar2.e : null, str4, z5, z, str2, new da30(aVar2 != null ? aVar2.b : null, String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2)), g8e.p(context.getResources().getQuantityString(awh0.mt_date_format_in_minutes, i3, Integer.valueOf(i3)), " ", context.getResources().getQuantityString(awh0.mt_date_format_in_seconds, i4, Integer.valueOf(i4)))));
    }
}
