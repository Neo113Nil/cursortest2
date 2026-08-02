package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.e6a;
import defpackage.k6a;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final k7x0 a;
    public final c b;

    public a(k7x0 k7x0Var, c cVar) {
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
    public final Object a(ChargersOfferResponseDto.Notification notification, ContinuationImpl continuationImpl) {
        ChargersOfferNotificationMapper$map$1 chargersOfferNotificationMapper$map$1;
        int i;
        if (continuationImpl instanceof ChargersOfferNotificationMapper$map$1) {
            chargersOfferNotificationMapper$map$1 = (ChargersOfferNotificationMapper$map$1) continuationImpl;
            int i2 = chargersOfferNotificationMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferNotificationMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOfferNotificationMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferNotificationMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = notification.b;
                    chargersOfferNotificationMapper$map$1.L$0 = notification;
                    chargersOfferNotificationMapper$map$1.label = 1;
                    obj = c.i(this.b, formattedText, null, chargersOfferNotificationMapper$map$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    notification = (ChargersOfferResponseDto.Notification) chargersOfferNotificationMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                String str = notification.a;
                String a = str == null ? ((m7x0) this.a).a(str) : null;
                return new k6a(charSequence, a != null ? new e6a(a) : null, 0);
            }
        }
        chargersOfferNotificationMapper$map$1 = new ChargersOfferNotificationMapper$map$1(this, continuationImpl);
        Object obj2 = chargersOfferNotificationMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferNotificationMapper$map$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        String str2 = notification.a;
        if (str2 == null) {
        }
        return new k6a(charSequence2, a != null ? new e6a(a) : null, 0);
    }
}
