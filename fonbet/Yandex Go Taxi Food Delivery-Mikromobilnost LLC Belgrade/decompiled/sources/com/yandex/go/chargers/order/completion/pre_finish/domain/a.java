package com.yandex.go.chargers.order.completion.pre_finish.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishProgressResponse;
import defpackage.a1a;
import defpackage.cy9;
import defpackage.h3y;
import defpackage.l1a;
import defpackage.m1a;
import defpackage.ny61;
import defpackage.o1a;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v1a;
import defpackage.w511;
import defpackage.yx9;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final e b;
    public final h3y c;
    public final f d;
    public final v1a e;

    public a(tt2 tt2Var, e eVar, h3y h3yVar, f fVar, v1a v1aVar) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = h3yVar;
        this.d = fVar;
        this.e = v1aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ChargersFinishProgressResponse chargersFinishProgressResponse, String str, ContinuationImpl continuationImpl) {
        ChargersFinishInteractor$pushFinishingState$1 chargersFinishInteractor$pushFinishingState$1;
        int i;
        FormattedText formattedText;
        Object x;
        int i2;
        Object l1aVar;
        aVar.getClass();
        if (continuationImpl instanceof ChargersFinishInteractor$pushFinishingState$1) {
            chargersFinishInteractor$pushFinishingState$1 = (ChargersFinishInteractor$pushFinishingState$1) continuationImpl;
            int i3 = chargersFinishInteractor$pushFinishingState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersFinishInteractor$pushFinishingState$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersFinishInteractor$pushFinishingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFinishInteractor$pushFinishingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    formattedText = chargersFinishProgressResponse != null ? chargersFinishProgressResponse.b : null;
                    e eVar = aVar.b;
                    chargersFinishInteractor$pushFinishingState$1.L$0 = chargersFinishProgressResponse;
                    chargersFinishInteractor$pushFinishingState$1.L$1 = str;
                    chargersFinishInteractor$pushFinishingState$1.L$2 = formattedText;
                    chargersFinishInteractor$pushFinishingState$1.label = 1;
                    x = eVar.x(formattedText, chargersFinishInteractor$pushFinishingState$1);
                    if (x == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    FormattedText formattedText2 = (FormattedText) chargersFinishInteractor$pushFinishingState$1.L$2;
                    str = (String) chargersFinishInteractor$pushFinishingState$1.L$1;
                    ChargersFinishProgressResponse chargersFinishProgressResponse2 = (ChargersFinishProgressResponse) chargersFinishInteractor$pushFinishingState$1.L$0;
                    kotlin.b.b(obj);
                    formattedText = formattedText2;
                    chargersFinishProgressResponse = chargersFinishProgressResponse2;
                    x = obj;
                }
                String str2 = str;
                CharSequence charSequence = (CharSequence) x;
                v1a v1aVar = aVar.e;
                ChargersFinishProgressResponse.ProgressState progressState = chargersFinishProgressResponse == null ? chargersFinishProgressResponse.a : null;
                i2 = progressState != null ? -1 : a1a.a[progressState.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        l1aVar = new m1a(charSequence);
                    } else if (i2 == 2) {
                        l1aVar = new o1a(charSequence);
                    } else if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    v1aVar.a.g(l1aVar);
                    return zy11.a;
                }
                yx9.a(ChargersError.Companion, ChargersError.Finishing, null, 6);
                if (formattedText == null) {
                    formattedText = FormattedText.c;
                }
                l1aVar = new l1a(new cy9(3, null, str2, null, formattedText));
                v1aVar.a.g(l1aVar);
                return zy11.a;
            }
        }
        chargersFinishInteractor$pushFinishingState$1 = new ChargersFinishInteractor$pushFinishingState$1(aVar, continuationImpl);
        Object obj2 = chargersFinishInteractor$pushFinishingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFinishInteractor$pushFinishingState$1.label;
        if (i != 0) {
        }
        String str22 = str;
        CharSequence charSequence2 = (CharSequence) x;
        v1a v1aVar2 = aVar.e;
        if (chargersFinishProgressResponse == null) {
        }
        if (progressState != null) {
        }
        if (i2 != -1) {
        }
        yx9.a(ChargersError.Companion, ChargersError.Finishing, null, 6);
        if (formattedText == null) {
        }
        l1aVar = new l1a(new cy9(3, null, str22, null, formattedText));
        v1aVar2.a.g(l1aVar);
        return zy11.a;
    }

    public final Object b(kotlinx.serialization.json.b bVar, Continuation continuation) {
        this.a.getClass();
        Object k0 = tje.k0(uyj.a, new ChargersFinishInteractor$finish$2(this, bVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
