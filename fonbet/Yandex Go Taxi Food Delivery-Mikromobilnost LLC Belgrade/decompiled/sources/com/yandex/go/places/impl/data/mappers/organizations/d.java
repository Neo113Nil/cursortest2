package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemDto$OrganizationPreviewItemDto;
import com.yandex.go.places.models.data.entities.network.BadgeDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextContainerDto;
import com.yandex.go.places.models.data.entities.network.s;
import defpackage.a65;
import defpackage.fr;
import defpackage.kwd;
import defpackage.nj4;
import defpackage.ny61;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class d {
    public final ru.yandex.taxi.widget.c a;
    public final com.yandex.go.places.models.data.mappers.a b;
    public final com.yandex.go.places.models.data.mappers.b c;
    public final com.yandex.go.places.models.data.mappers.d d;
    public final b e;

    public d(ru.yandex.taxi.widget.c cVar, com.yandex.go.places.models.data.mappers.a aVar, com.yandex.go.places.models.data.mappers.b bVar, com.yandex.go.places.models.data.mappers.d dVar, b bVar2) {
        this.a = cVar;
        this.b = aVar;
        this.c = bVar;
        this.d = dVar;
        this.e = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto, ContinuationImpl continuationImpl) {
        OrganizationsPreviewItemMapper$mapModel$1 organizationsPreviewItemMapper$mapModel$1;
        int i;
        fr frVar;
        Object b;
        OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto2;
        String str;
        Object i2;
        List list;
        fr frVar2;
        OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto3;
        String str2;
        CharSequence charSequence;
        CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto;
        List list2;
        CharSequence charSequence2;
        kwd kwdVar;
        CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto2;
        List list3;
        kwd kwdVar2;
        BadgeDto badgeDto;
        kwd kwdVar3;
        CharSequence charSequence3;
        List list4;
        nj4 nj4Var;
        fr frVar3;
        String str3;
        kwd kwdVar4;
        CharSequence charSequence4;
        List list5;
        String str4;
        fr frVar4;
        OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto4 = organizationItemDto$OrganizationPreviewItemDto;
        if (continuationImpl instanceof OrganizationsPreviewItemMapper$mapModel$1) {
            organizationsPreviewItemMapper$mapModel$1 = (OrganizationsPreviewItemMapper$mapModel$1) continuationImpl;
            int i3 = organizationsPreviewItemMapper$mapModel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                organizationsPreviewItemMapper$mapModel$1.label = i3 - Integer.MIN_VALUE;
                Object obj = organizationsPreviewItemMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsPreviewItemMapper$mapModel$1.label;
                com.yandex.go.places.models.data.mappers.d dVar = this.d;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        s sVar = organizationItemDto$OrganizationPreviewItemDto4.g;
                        if (sVar == null) {
                            frVar = null;
                            String str5 = organizationItemDto$OrganizationPreviewItemDto4.a;
                            List list6 = organizationItemDto$OrganizationPreviewItemDto4.c;
                            organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto4;
                            organizationsPreviewItemMapper$mapModel$1.L$1 = frVar;
                            organizationsPreviewItemMapper$mapModel$1.L$2 = str5;
                            organizationsPreviewItemMapper$mapModel$1.label = 2;
                            b = this.e.b(list6, frVar, null, organizationsPreviewItemMapper$mapModel$1);
                            if (b != coroutineSingletons) {
                                organizationItemDto$OrganizationPreviewItemDto2 = organizationItemDto$OrganizationPreviewItemDto4;
                                str = str5;
                                obj = b;
                                List list7 = (List) obj;
                                FormattedText formattedText = organizationItemDto$OrganizationPreviewItemDto2.b;
                                organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto2;
                                organizationsPreviewItemMapper$mapModel$1.L$1 = frVar;
                                organizationsPreviewItemMapper$mapModel$1.L$2 = str;
                                organizationsPreviewItemMapper$mapModel$1.L$3 = list7;
                                organizationsPreviewItemMapper$mapModel$1.label = 3;
                                i2 = ru.yandex.taxi.widget.c.i(this.a, formattedText, null, organizationsPreviewItemMapper$mapModel$1, 30);
                                if (i2 != coroutineSingletons) {
                                    fr frVar5 = frVar;
                                    list = list7;
                                    obj = i2;
                                    frVar2 = frVar5;
                                    organizationItemDto$OrganizationPreviewItemDto3 = organizationItemDto$OrganizationPreviewItemDto2;
                                    str2 = str;
                                    charSequence = (CharSequence) obj;
                                    compressionResistantAttributedTextContainerDto = organizationItemDto$OrganizationPreviewItemDto3.d;
                                    if (compressionResistantAttributedTextContainerDto == null) {
                                        organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto3;
                                        organizationsPreviewItemMapper$mapModel$1.L$1 = frVar2;
                                        organizationsPreviewItemMapper$mapModel$1.L$2 = str2;
                                        organizationsPreviewItemMapper$mapModel$1.L$3 = list;
                                        organizationsPreviewItemMapper$mapModel$1.L$4 = charSequence;
                                        organizationsPreviewItemMapper$mapModel$1.L$5 = null;
                                        organizationsPreviewItemMapper$mapModel$1.label = 4;
                                        obj = dVar.a(compressionResistantAttributedTextContainerDto, organizationsPreviewItemMapper$mapModel$1);
                                        break;
                                    } else {
                                        list2 = list;
                                        charSequence2 = charSequence;
                                        kwdVar = null;
                                        compressionResistantAttributedTextContainerDto2 = organizationItemDto$OrganizationPreviewItemDto3.e;
                                        if (compressionResistantAttributedTextContainerDto2 == null) {
                                            organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto3;
                                            organizationsPreviewItemMapper$mapModel$1.L$1 = frVar2;
                                            organizationsPreviewItemMapper$mapModel$1.L$2 = str2;
                                            organizationsPreviewItemMapper$mapModel$1.L$3 = list2;
                                            organizationsPreviewItemMapper$mapModel$1.L$4 = charSequence2;
                                            organizationsPreviewItemMapper$mapModel$1.L$5 = kwdVar;
                                            organizationsPreviewItemMapper$mapModel$1.L$6 = null;
                                            organizationsPreviewItemMapper$mapModel$1.label = 5;
                                            Object a = dVar.a(compressionResistantAttributedTextContainerDto2, organizationsPreviewItemMapper$mapModel$1);
                                            if (a != coroutineSingletons) {
                                                list3 = list2;
                                                obj = a;
                                                kwdVar2 = (kwd) obj;
                                                badgeDto = organizationItemDto$OrganizationPreviewItemDto3.f;
                                                if (badgeDto == null) {
                                                    kwdVar3 = kwdVar2;
                                                    charSequence3 = charSequence2;
                                                    list4 = list3;
                                                    nj4Var = null;
                                                    frVar3 = frVar2;
                                                    str3 = str2;
                                                    return new a65(str3, charSequence3, list4, kwdVar, kwdVar3, nj4Var, frVar3, false);
                                                }
                                                organizationsPreviewItemMapper$mapModel$1.L$0 = null;
                                                organizationsPreviewItemMapper$mapModel$1.L$1 = frVar2;
                                                organizationsPreviewItemMapper$mapModel$1.L$2 = str2;
                                                organizationsPreviewItemMapper$mapModel$1.L$3 = list3;
                                                organizationsPreviewItemMapper$mapModel$1.L$4 = charSequence2;
                                                organizationsPreviewItemMapper$mapModel$1.L$5 = kwdVar;
                                                organizationsPreviewItemMapper$mapModel$1.L$6 = kwdVar2;
                                                organizationsPreviewItemMapper$mapModel$1.L$7 = null;
                                                organizationsPreviewItemMapper$mapModel$1.label = 6;
                                                Object a2 = this.c.a(badgeDto, organizationsPreviewItemMapper$mapModel$1);
                                                if (a2 != coroutineSingletons) {
                                                    kwd kwdVar5 = kwdVar2;
                                                    obj = a2;
                                                    kwdVar4 = kwdVar5;
                                                    charSequence4 = charSequence2;
                                                    list5 = list3;
                                                    str4 = str2;
                                                    frVar4 = frVar2;
                                                    kwdVar3 = kwdVar4;
                                                    nj4Var = (nj4) obj;
                                                    charSequence3 = charSequence4;
                                                    list4 = list5;
                                                    str3 = str4;
                                                    frVar3 = frVar4;
                                                    return new a65(str3, charSequence3, list4, kwdVar, kwdVar3, nj4Var, frVar3, false);
                                                }
                                            }
                                        } else {
                                            list3 = list2;
                                            kwdVar2 = null;
                                            badgeDto = organizationItemDto$OrganizationPreviewItemDto3.f;
                                            if (badgeDto == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto4;
                        organizationsPreviewItemMapper$mapModel$1.L$1 = null;
                        organizationsPreviewItemMapper$mapModel$1.label = 1;
                        obj = this.b.a(sVar, null, organizationsPreviewItemMapper$mapModel$1);
                        break;
                    case 1:
                        organizationItemDto$OrganizationPreviewItemDto4 = (OrganizationItemDto$OrganizationPreviewItemDto) organizationsPreviewItemMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        frVar = (fr) obj;
                        String str52 = organizationItemDto$OrganizationPreviewItemDto4.a;
                        List list62 = organizationItemDto$OrganizationPreviewItemDto4.c;
                        organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto4;
                        organizationsPreviewItemMapper$mapModel$1.L$1 = frVar;
                        organizationsPreviewItemMapper$mapModel$1.L$2 = str52;
                        organizationsPreviewItemMapper$mapModel$1.label = 2;
                        b = this.e.b(list62, frVar, null, organizationsPreviewItemMapper$mapModel$1);
                        if (b != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        str = (String) organizationsPreviewItemMapper$mapModel$1.L$2;
                        frVar = (fr) organizationsPreviewItemMapper$mapModel$1.L$1;
                        organizationItemDto$OrganizationPreviewItemDto2 = (OrganizationItemDto$OrganizationPreviewItemDto) organizationsPreviewItemMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        List list72 = (List) obj;
                        FormattedText formattedText2 = organizationItemDto$OrganizationPreviewItemDto2.b;
                        organizationsPreviewItemMapper$mapModel$1.L$0 = organizationItemDto$OrganizationPreviewItemDto2;
                        organizationsPreviewItemMapper$mapModel$1.L$1 = frVar;
                        organizationsPreviewItemMapper$mapModel$1.L$2 = str;
                        organizationsPreviewItemMapper$mapModel$1.L$3 = list72;
                        organizationsPreviewItemMapper$mapModel$1.label = 3;
                        i2 = ru.yandex.taxi.widget.c.i(this.a, formattedText2, null, organizationsPreviewItemMapper$mapModel$1, 30);
                        if (i2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        List list8 = (List) organizationsPreviewItemMapper$mapModel$1.L$3;
                        String str6 = (String) organizationsPreviewItemMapper$mapModel$1.L$2;
                        fr frVar6 = (fr) organizationsPreviewItemMapper$mapModel$1.L$1;
                        OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto5 = (OrganizationItemDto$OrganizationPreviewItemDto) organizationsPreviewItemMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        organizationItemDto$OrganizationPreviewItemDto3 = organizationItemDto$OrganizationPreviewItemDto5;
                        frVar2 = frVar6;
                        str2 = str6;
                        list = list8;
                        charSequence = (CharSequence) obj;
                        compressionResistantAttributedTextContainerDto = organizationItemDto$OrganizationPreviewItemDto3.d;
                        if (compressionResistantAttributedTextContainerDto == null) {
                        }
                        break;
                    case 4:
                        charSequence = (CharSequence) organizationsPreviewItemMapper$mapModel$1.L$4;
                        list = (List) organizationsPreviewItemMapper$mapModel$1.L$3;
                        str2 = (String) organizationsPreviewItemMapper$mapModel$1.L$2;
                        frVar2 = (fr) organizationsPreviewItemMapper$mapModel$1.L$1;
                        organizationItemDto$OrganizationPreviewItemDto3 = (OrganizationItemDto$OrganizationPreviewItemDto) organizationsPreviewItemMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        List list9 = list;
                        charSequence2 = charSequence;
                        kwdVar = (kwd) obj;
                        list2 = list9;
                        compressionResistantAttributedTextContainerDto2 = organizationItemDto$OrganizationPreviewItemDto3.e;
                        if (compressionResistantAttributedTextContainerDto2 == null) {
                        }
                        break;
                    case 5:
                        kwdVar = (kwd) organizationsPreviewItemMapper$mapModel$1.L$5;
                        charSequence2 = (CharSequence) organizationsPreviewItemMapper$mapModel$1.L$4;
                        list3 = (List) organizationsPreviewItemMapper$mapModel$1.L$3;
                        str2 = (String) organizationsPreviewItemMapper$mapModel$1.L$2;
                        frVar2 = (fr) organizationsPreviewItemMapper$mapModel$1.L$1;
                        organizationItemDto$OrganizationPreviewItemDto3 = (OrganizationItemDto$OrganizationPreviewItemDto) organizationsPreviewItemMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        kwdVar2 = (kwd) obj;
                        badgeDto = organizationItemDto$OrganizationPreviewItemDto3.f;
                        if (badgeDto == null) {
                        }
                        break;
                    case 6:
                        kwdVar4 = (kwd) organizationsPreviewItemMapper$mapModel$1.L$6;
                        kwdVar = (kwd) organizationsPreviewItemMapper$mapModel$1.L$5;
                        charSequence4 = (CharSequence) organizationsPreviewItemMapper$mapModel$1.L$4;
                        list5 = (List) organizationsPreviewItemMapper$mapModel$1.L$3;
                        str4 = (String) organizationsPreviewItemMapper$mapModel$1.L$2;
                        frVar4 = (fr) organizationsPreviewItemMapper$mapModel$1.L$1;
                        kotlin.b.b(obj);
                        kwdVar3 = kwdVar4;
                        nj4Var = (nj4) obj;
                        charSequence3 = charSequence4;
                        list4 = list5;
                        str3 = str4;
                        frVar3 = frVar4;
                        return new a65(str3, charSequence3, list4, kwdVar, kwdVar3, nj4Var, frVar3, false);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        organizationsPreviewItemMapper$mapModel$1 = new OrganizationsPreviewItemMapper$mapModel$1(this, continuationImpl);
        Object obj2 = organizationsPreviewItemMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsPreviewItemMapper$mapModel$1.label;
        com.yandex.go.places.models.data.mappers.d dVar2 = this.d;
        switch (i) {
        }
    }
}
