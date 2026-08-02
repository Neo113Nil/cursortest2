package com.yandex.go.multimodal_route.ui.rate_route.mappers;

import com.yandex.go.multimodal_route.network.models.CommentFieldDto;
import com.yandex.go.multimodal_route.network.models.CompleteResponseDto;
import com.yandex.go.multimodal_route.network.models.DoneButtonDto;
import com.yandex.go.multimodal_route.network.models.FeedbackHintDto;
import com.yandex.go.multimodal_route.network.models.MultimodalFeedbackDto;
import com.yandex.go.multimodal_route.network.models.RatingSelectorDto;
import defpackage.emc;
import defpackage.ny61;
import defpackage.or40;
import defpackage.ssq;
import defpackage.tcc;
import defpackage.u8i0;
import defpackage.z3m;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, CompleteResponseDto completeResponseDto, ContinuationImpl continuationImpl) {
        CompleteRoutesDtoToUiStateMapper$map$1 completeRoutesDtoToUiStateMapper$map$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        MultimodalFeedbackDto multimodalFeedbackDto;
        String str2;
        u8i0 u8i0Var;
        String str3;
        emc emcVar;
        CompleteResponseDto completeResponseDto2;
        String str4;
        z3m z3mVar;
        emc emcVar2;
        u8i0 u8i0Var2;
        MultimodalFeedbackDto multimodalFeedbackDto2;
        CompleteResponseDto completeResponseDto3;
        String str5;
        Object i2;
        CharSequence charSequence;
        z3m z3mVar2;
        emc emcVar3;
        u8i0 u8i0Var3;
        if (continuationImpl instanceof CompleteRoutesDtoToUiStateMapper$map$1) {
            completeRoutesDtoToUiStateMapper$map$1 = (CompleteRoutesDtoToUiStateMapper$map$1) continuationImpl;
            int i3 = completeRoutesDtoToUiStateMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                completeRoutesDtoToUiStateMapper$map$1.label = i3 - Integer.MIN_VALUE;
                obj = completeRoutesDtoToUiStateMapper$map$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = completeRoutesDtoToUiStateMapper$map$1.label;
                c cVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    multimodalFeedbackDto = completeResponseDto.a;
                    RatingSelectorDto ratingSelectorDto = multimodalFeedbackDto.c;
                    List<FeedbackHintDto> list = ratingSelectorDto.c;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (FeedbackHintDto feedbackHintDto : list) {
                        arrayList.add(new ssq(feedbackHintDto.a, feedbackHintDto.b, feedbackHintDto.c));
                    }
                    u8i0 u8i0Var4 = new u8i0(ratingSelectorDto.a, ratingSelectorDto.b, arrayList);
                    CommentFieldDto commentFieldDto = multimodalFeedbackDto.d;
                    emc emcVar4 = new emc(commentFieldDto.a, commentFieldDto.b, commentFieldDto.c, commentFieldDto.d, commentFieldDto.e);
                    DoneButtonDto doneButtonDto = multimodalFeedbackDto.e;
                    String str6 = doneButtonDto.a;
                    String str7 = doneButtonDto.b;
                    FormattedText formattedText = doneButtonDto.c;
                    str2 = str;
                    completeRoutesDtoToUiStateMapper$map$1.L$0 = str2;
                    completeRoutesDtoToUiStateMapper$map$1.L$1 = completeResponseDto;
                    completeRoutesDtoToUiStateMapper$map$1.L$2 = multimodalFeedbackDto;
                    completeRoutesDtoToUiStateMapper$map$1.L$3 = u8i0Var4;
                    completeRoutesDtoToUiStateMapper$map$1.L$4 = emcVar4;
                    completeRoutesDtoToUiStateMapper$map$1.L$5 = null;
                    completeRoutesDtoToUiStateMapper$map$1.L$6 = str7;
                    completeRoutesDtoToUiStateMapper$map$1.L$7 = str6;
                    completeRoutesDtoToUiStateMapper$map$1.label = 1;
                    obj = c.i(cVar, formattedText, null, completeRoutesDtoToUiStateMapper$map$1, 30);
                    if (obj != coroutineSingletons) {
                        u8i0Var = u8i0Var4;
                        str3 = str7;
                        emcVar = emcVar4;
                        completeResponseDto2 = completeResponseDto;
                        str4 = str6;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence2 = (CharSequence) completeRoutesDtoToUiStateMapper$map$1.L$7;
                        str5 = (String) completeRoutesDtoToUiStateMapper$map$1.L$6;
                        z3m z3mVar3 = (z3m) completeRoutesDtoToUiStateMapper$map$1.L$5;
                        emc emcVar5 = (emc) completeRoutesDtoToUiStateMapper$map$1.L$4;
                        u8i0 u8i0Var5 = (u8i0) completeRoutesDtoToUiStateMapper$map$1.L$3;
                        multimodalFeedbackDto2 = (MultimodalFeedbackDto) completeRoutesDtoToUiStateMapper$map$1.L$2;
                        b.b(obj);
                        charSequence = charSequence2;
                        z3mVar2 = z3mVar3;
                        emcVar3 = emcVar5;
                        u8i0Var3 = u8i0Var5;
                        return new or40(str5, charSequence, (CharSequence) obj, u8i0Var3, emcVar3, z3mVar2, multimodalFeedbackDto2.f, multimodalFeedbackDto2.g);
                    }
                    str5 = (String) completeRoutesDtoToUiStateMapper$map$1.L$6;
                    z3mVar = (z3m) completeRoutesDtoToUiStateMapper$map$1.L$5;
                    emcVar2 = (emc) completeRoutesDtoToUiStateMapper$map$1.L$4;
                    u8i0Var2 = (u8i0) completeRoutesDtoToUiStateMapper$map$1.L$3;
                    MultimodalFeedbackDto multimodalFeedbackDto3 = (MultimodalFeedbackDto) completeRoutesDtoToUiStateMapper$map$1.L$2;
                    completeResponseDto3 = (CompleteResponseDto) completeRoutesDtoToUiStateMapper$map$1.L$1;
                    b.b(obj);
                    multimodalFeedbackDto2 = multimodalFeedbackDto3;
                    CharSequence charSequence3 = (CharSequence) obj;
                    FormattedText formattedText2 = completeResponseDto3.a.b;
                    completeRoutesDtoToUiStateMapper$map$1.L$0 = null;
                    completeRoutesDtoToUiStateMapper$map$1.L$1 = null;
                    completeRoutesDtoToUiStateMapper$map$1.L$2 = multimodalFeedbackDto2;
                    completeRoutesDtoToUiStateMapper$map$1.L$3 = u8i0Var2;
                    completeRoutesDtoToUiStateMapper$map$1.L$4 = emcVar2;
                    completeRoutesDtoToUiStateMapper$map$1.L$5 = z3mVar;
                    completeRoutesDtoToUiStateMapper$map$1.L$6 = str5;
                    completeRoutesDtoToUiStateMapper$map$1.L$7 = charSequence3;
                    completeRoutesDtoToUiStateMapper$map$1.label = 3;
                    i2 = c.i(cVar, formattedText2, null, completeRoutesDtoToUiStateMapper$map$1, 30);
                    if (i2 != coroutineSingletons) {
                        charSequence = charSequence3;
                        z3mVar2 = z3mVar;
                        emcVar3 = emcVar2;
                        u8i0Var3 = u8i0Var2;
                        obj = i2;
                        return new or40(str5, charSequence, (CharSequence) obj, u8i0Var3, emcVar3, z3mVar2, multimodalFeedbackDto2.f, multimodalFeedbackDto2.g);
                    }
                    return coroutineSingletons;
                }
                str4 = (String) completeRoutesDtoToUiStateMapper$map$1.L$7;
                str3 = (String) completeRoutesDtoToUiStateMapper$map$1.L$6;
                emcVar = (emc) completeRoutesDtoToUiStateMapper$map$1.L$4;
                u8i0Var = (u8i0) completeRoutesDtoToUiStateMapper$map$1.L$3;
                multimodalFeedbackDto = (MultimodalFeedbackDto) completeRoutesDtoToUiStateMapper$map$1.L$2;
                completeResponseDto2 = (CompleteResponseDto) completeRoutesDtoToUiStateMapper$map$1.L$1;
                str2 = (String) completeRoutesDtoToUiStateMapper$map$1.L$0;
                b.b(obj);
                z3m z3mVar4 = new z3m((CharSequence) obj, str4, str3);
                FormattedText formattedText3 = completeResponseDto2.a.a;
                completeRoutesDtoToUiStateMapper$map$1.L$0 = null;
                completeRoutesDtoToUiStateMapper$map$1.L$1 = completeResponseDto2;
                completeRoutesDtoToUiStateMapper$map$1.L$2 = multimodalFeedbackDto;
                completeRoutesDtoToUiStateMapper$map$1.L$3 = u8i0Var;
                completeRoutesDtoToUiStateMapper$map$1.L$4 = emcVar;
                completeRoutesDtoToUiStateMapper$map$1.L$5 = z3mVar4;
                completeRoutesDtoToUiStateMapper$map$1.L$6 = str2;
                completeRoutesDtoToUiStateMapper$map$1.L$7 = null;
                completeRoutesDtoToUiStateMapper$map$1.label = 2;
                obj = c.i(cVar, formattedText3, null, completeRoutesDtoToUiStateMapper$map$1, 30);
                if (obj != coroutineSingletons) {
                    z3mVar = z3mVar4;
                    emcVar2 = emcVar;
                    u8i0Var2 = u8i0Var;
                    multimodalFeedbackDto2 = multimodalFeedbackDto;
                    completeResponseDto3 = completeResponseDto2;
                    str5 = str2;
                    CharSequence charSequence32 = (CharSequence) obj;
                    FormattedText formattedText22 = completeResponseDto3.a.b;
                    completeRoutesDtoToUiStateMapper$map$1.L$0 = null;
                    completeRoutesDtoToUiStateMapper$map$1.L$1 = null;
                    completeRoutesDtoToUiStateMapper$map$1.L$2 = multimodalFeedbackDto2;
                    completeRoutesDtoToUiStateMapper$map$1.L$3 = u8i0Var2;
                    completeRoutesDtoToUiStateMapper$map$1.L$4 = emcVar2;
                    completeRoutesDtoToUiStateMapper$map$1.L$5 = z3mVar;
                    completeRoutesDtoToUiStateMapper$map$1.L$6 = str5;
                    completeRoutesDtoToUiStateMapper$map$1.L$7 = charSequence32;
                    completeRoutesDtoToUiStateMapper$map$1.label = 3;
                    i2 = c.i(cVar, formattedText22, null, completeRoutesDtoToUiStateMapper$map$1, 30);
                    if (i2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        completeRoutesDtoToUiStateMapper$map$1 = new CompleteRoutesDtoToUiStateMapper$map$1(this, continuationImpl);
        obj = completeRoutesDtoToUiStateMapper$map$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = completeRoutesDtoToUiStateMapper$map$1.label;
        c cVar2 = this.a;
        if (i != 0) {
        }
        z3m z3mVar42 = new z3m((CharSequence) obj, str4, str3);
        FormattedText formattedText32 = completeResponseDto2.a.a;
        completeRoutesDtoToUiStateMapper$map$1.L$0 = null;
        completeRoutesDtoToUiStateMapper$map$1.L$1 = completeResponseDto2;
        completeRoutesDtoToUiStateMapper$map$1.L$2 = multimodalFeedbackDto;
        completeRoutesDtoToUiStateMapper$map$1.L$3 = u8i0Var;
        completeRoutesDtoToUiStateMapper$map$1.L$4 = emcVar;
        completeRoutesDtoToUiStateMapper$map$1.L$5 = z3mVar42;
        completeRoutesDtoToUiStateMapper$map$1.L$6 = str2;
        completeRoutesDtoToUiStateMapper$map$1.L$7 = null;
        completeRoutesDtoToUiStateMapper$map$1.label = 2;
        obj = c.i(cVar2, formattedText32, null, completeRoutesDtoToUiStateMapper$map$1, 30);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
