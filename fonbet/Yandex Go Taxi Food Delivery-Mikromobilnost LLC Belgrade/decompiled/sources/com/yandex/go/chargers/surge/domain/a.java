package com.yandex.go.chargers.surge.domain;

import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeInfoItemDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import defpackage.bvf0;
import defpackage.hwa;
import defpackage.pdc;
import defpackage.tcc;
import defpackage.wva;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final pdc a;
    public final e b;

    public a(pdc pdcVar, e eVar) {
        this.a = pdcVar;
        this.b = eVar;
    }

    public static hwa b(ChargersSurgeModalDto chargersSurgeModalDto) {
        if (chargersSurgeModalDto == null) {
            return null;
        }
        int i = chargersSurgeModalDto.a;
        String str = chargersSurgeModalDto.b;
        FormattedText formattedText = chargersSurgeModalDto.c;
        FormattedText formattedText2 = chargersSurgeModalDto.d;
        List<ChargersSurgeInfoItemDto> list = chargersSurgeModalDto.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ChargersSurgeInfoItemDto chargersSurgeInfoItemDto : list) {
            arrayList.add(new wva(chargersSurgeInfoItemDto.a, chargersSurgeInfoItemDto.b, chargersSurgeInfoItemDto.c));
        }
        return new hwa(i, str, formattedText, formattedText2, arrayList, chargersSurgeModalDto.f, chargersSurgeModalDto.g);
    }

    public final Object a(ChargersSurgeDto chargersSurgeDto, SuspendLambda suspendLambda) {
        if (chargersSurgeDto == null) {
            return null;
        }
        return bvf0.n(new ChargersSurgeMapper$map$2(this, chargersSurgeDto, null), suspendLambda);
    }
}
