package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.BadgeDto;
import defpackage.kdc;
import defpackage.nj4;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.ufu;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class b {
    public final pdc a;
    public final ru.yandex.taxi.widget.c b;

    public b(pdc pdcVar, ru.yandex.taxi.widget.c cVar) {
        this.a = pdcVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BadgeDto badgeDto, ContinuationImpl continuationImpl) {
        BadgeMapper$mapModel$1 badgeMapper$mapModel$1;
        Object obj;
        int i;
        kdc b;
        if (continuationImpl instanceof BadgeMapper$mapModel$1) {
            badgeMapper$mapModel$1 = (BadgeMapper$mapModel$1) continuationImpl;
            int i2 = badgeMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                badgeMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                obj = badgeMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeMapper$mapModel$1.label;
                ru.yandex.taxi.widget.c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = badgeDto.a;
                    badgeMapper$mapModel$1.L$0 = badgeDto;
                    badgeMapper$mapModel$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, badgeMapper$mapModel$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b = (kdc) badgeMapper$mapModel$1.L$2;
                        kotlin.b.b(obj);
                        return new nj4((CharSequence) obj, b);
                    }
                    badgeDto = (BadgeDto) badgeMapper$mapModel$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((CharSequence) obj).length() != 0) {
                    b = ((ufu) this.a).b(badgeDto.b);
                    if (b != null) {
                        FormattedText formattedText2 = badgeDto.a;
                        badgeMapper$mapModel$1.L$0 = null;
                        badgeMapper$mapModel$1.L$1 = null;
                        badgeMapper$mapModel$1.L$2 = b;
                        badgeMapper$mapModel$1.label = 2;
                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, badgeMapper$mapModel$1, 30);
                    }
                }
                return null;
            }
        }
        badgeMapper$mapModel$1 = new BadgeMapper$mapModel$1(this, continuationImpl);
        obj = badgeMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeMapper$mapModel$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.b;
        if (i != 0) {
        }
        if (((CharSequence) obj).length() != 0) {
        }
        return null;
    }
}
