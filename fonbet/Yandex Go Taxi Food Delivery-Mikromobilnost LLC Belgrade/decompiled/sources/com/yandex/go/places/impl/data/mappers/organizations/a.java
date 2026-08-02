package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.ButtonDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsEmptyScreenConfigDto;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.dbv;
import defpackage.fm80;
import defpackage.k7v;
import defpackage.ky6;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.widget.c a;
    public final dbv b;
    public final com.yandex.go.places.models.data.mappers.c c;

    public a(ru.yandex.taxi.widget.c cVar, dbv dbvVar, com.yandex.go.places.models.data.mappers.c cVar2) {
        this.a = cVar;
        this.b = dbvVar;
        this.c = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto, ContinuationImpl continuationImpl) {
        OrganizationsEmptyScreenConfigMapper$mapModel$1 organizationsEmptyScreenConfigMapper$mapModel$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object a;
        CharSequence charSequence4;
        k7v k7vVar;
        if (continuationImpl instanceof OrganizationsEmptyScreenConfigMapper$mapModel$1) {
            organizationsEmptyScreenConfigMapper$mapModel$1 = (OrganizationsEmptyScreenConfigMapper$mapModel$1) continuationImpl;
            int i2 = organizationsEmptyScreenConfigMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsEmptyScreenConfigMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsEmptyScreenConfigMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsEmptyScreenConfigMapper$mapModel$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = organizationsEmptyScreenConfigDto.b;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$0 = organizationsEmptyScreenConfigDto;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$1 = null;
                    organizationsEmptyScreenConfigMapper$mapModel$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, organizationsEmptyScreenConfigMapper$mapModel$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k7vVar = (k7v) organizationsEmptyScreenConfigMapper$mapModel$1.L$3;
                            charSequence2 = (CharSequence) organizationsEmptyScreenConfigMapper$mapModel$1.L$2;
                            charSequence4 = (CharSequence) organizationsEmptyScreenConfigMapper$mapModel$1.L$1;
                            kotlin.b.b(obj);
                            return new fm80((ky6) obj, charSequence4, charSequence2, k7vVar);
                        }
                        charSequence3 = (CharSequence) organizationsEmptyScreenConfigMapper$mapModel$1.L$1;
                        organizationsEmptyScreenConfigDto2 = (OrganizationsEmptyScreenConfigDto) organizationsEmptyScreenConfigMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence5 = (CharSequence) obj;
                        charSequence = charSequence3;
                        charSequence2 = charSequence5;
                        ImageDto imageDto = organizationsEmptyScreenConfigDto2.d;
                        k7v a2 = imageDto != null ? this.b.a(imageDto) : null;
                        ButtonDto buttonDto = organizationsEmptyScreenConfigDto2.a;
                        organizationsEmptyScreenConfigMapper$mapModel$1.L$0 = null;
                        organizationsEmptyScreenConfigMapper$mapModel$1.L$1 = charSequence;
                        organizationsEmptyScreenConfigMapper$mapModel$1.L$2 = charSequence2;
                        organizationsEmptyScreenConfigMapper$mapModel$1.L$3 = a2;
                        organizationsEmptyScreenConfigMapper$mapModel$1.label = 3;
                        a = this.c.a(buttonDto, organizationsEmptyScreenConfigMapper$mapModel$1);
                        if (a != coroutineSingletons) {
                            charSequence4 = charSequence;
                            obj = a;
                            k7vVar = a2;
                            return new fm80((ky6) obj, charSequence4, charSequence2, k7vVar);
                        }
                        return coroutineSingletons;
                    }
                    organizationsEmptyScreenConfigDto = (OrganizationsEmptyScreenConfigDto) organizationsEmptyScreenConfigMapper$mapModel$1.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                formattedText = organizationsEmptyScreenConfigDto.c;
                if (formattedText != null) {
                    organizationsEmptyScreenConfigDto2 = organizationsEmptyScreenConfigDto;
                    charSequence2 = null;
                    ImageDto imageDto2 = organizationsEmptyScreenConfigDto2.d;
                    if (imageDto2 != null) {
                    }
                    ButtonDto buttonDto2 = organizationsEmptyScreenConfigDto2.a;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$0 = null;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$1 = charSequence;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$2 = charSequence2;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$3 = a2;
                    organizationsEmptyScreenConfigMapper$mapModel$1.label = 3;
                    a = this.c.a(buttonDto2, organizationsEmptyScreenConfigMapper$mapModel$1);
                    if (a != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                organizationsEmptyScreenConfigMapper$mapModel$1.L$0 = organizationsEmptyScreenConfigDto;
                organizationsEmptyScreenConfigMapper$mapModel$1.L$1 = charSequence;
                organizationsEmptyScreenConfigMapper$mapModel$1.L$2 = null;
                organizationsEmptyScreenConfigMapper$mapModel$1.label = 2;
                Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, organizationsEmptyScreenConfigMapper$mapModel$1, 30);
                if (i3 != coroutineSingletons) {
                    organizationsEmptyScreenConfigDto2 = organizationsEmptyScreenConfigDto;
                    charSequence3 = charSequence;
                    obj = i3;
                    CharSequence charSequence52 = (CharSequence) obj;
                    charSequence = charSequence3;
                    charSequence2 = charSequence52;
                    ImageDto imageDto22 = organizationsEmptyScreenConfigDto2.d;
                    if (imageDto22 != null) {
                    }
                    ButtonDto buttonDto22 = organizationsEmptyScreenConfigDto2.a;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$0 = null;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$1 = charSequence;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$2 = charSequence2;
                    organizationsEmptyScreenConfigMapper$mapModel$1.L$3 = a2;
                    organizationsEmptyScreenConfigMapper$mapModel$1.label = 3;
                    a = this.c.a(buttonDto22, organizationsEmptyScreenConfigMapper$mapModel$1);
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        organizationsEmptyScreenConfigMapper$mapModel$1 = new OrganizationsEmptyScreenConfigMapper$mapModel$1(this, continuationImpl);
        Object obj2 = organizationsEmptyScreenConfigMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsEmptyScreenConfigMapper$mapModel$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = organizationsEmptyScreenConfigDto.c;
        if (formattedText != null) {
        }
    }
}
