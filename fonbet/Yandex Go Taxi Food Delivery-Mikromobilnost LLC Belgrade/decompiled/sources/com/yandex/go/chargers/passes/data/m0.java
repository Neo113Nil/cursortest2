package com.yandex.go.chargers.passes.data;

import defpackage.e6a;
import defpackage.k6a;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class m0 {
    public final k7x0 a;
    public final ru.yandex.taxi.widget.c b;

    public m0(k7x0 k7x0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = k7x0Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersPassNotificationDto chargersPassNotificationDto, ContinuationImpl continuationImpl) {
        ChargersPassesNotificationMapper$map$1 chargersPassesNotificationMapper$map$1;
        int i;
        if (continuationImpl instanceof ChargersPassesNotificationMapper$map$1) {
            chargersPassesNotificationMapper$map$1 = (ChargersPassesNotificationMapper$map$1) continuationImpl;
            int i2 = chargersPassesNotificationMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesNotificationMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesNotificationMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesNotificationMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersPassNotificationDto.c;
                    chargersPassesNotificationMapper$map$1.L$0 = chargersPassNotificationDto;
                    chargersPassesNotificationMapper$map$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.b, formattedText, null, chargersPassesNotificationMapper$map$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chargersPassNotificationDto = (ChargersPassNotificationDto) chargersPassesNotificationMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                String str = chargersPassNotificationDto.b;
                String a = str == null ? ((m7x0) this.a).a(str) : null;
                return new k6a(charSequence, a != null ? new e6a(a) : null, 0);
            }
        }
        chargersPassesNotificationMapper$map$1 = new ChargersPassesNotificationMapper$map$1(this, continuationImpl);
        Object obj2 = chargersPassesNotificationMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesNotificationMapper$map$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        String str2 = chargersPassNotificationDto.b;
        if (str2 == null) {
        }
        return new k6a(charSequence2, a != null ? new e6a(a) : null, 0);
    }
}
