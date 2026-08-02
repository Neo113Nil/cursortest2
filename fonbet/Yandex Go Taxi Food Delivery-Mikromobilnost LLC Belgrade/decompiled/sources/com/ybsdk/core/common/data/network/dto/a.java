package com.ybsdk.core.common.data.network.dto;

import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoItemDto;
import defpackage.btc;
import defpackage.quc;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class a {
    public static final CommunicationsShownInfoDto a(List list) {
        CommunicationsShownInfoItemDto.CommunicationTypeDto communicationTypeDto;
        List<btc> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (btc btcVar : list2) {
            String str = btcVar.b;
            String str2 = btcVar.a;
            String str3 = btcVar.c.a;
            int i = quc.a[btcVar.d.ordinal()];
            if (i == 1) {
                communicationTypeDto = CommunicationsShownInfoItemDto.CommunicationTypeDto.FULLSCREEN;
            } else if (i == 2) {
                communicationTypeDto = CommunicationsShownInfoItemDto.CommunicationTypeDto.EDUCATION;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                communicationTypeDto = CommunicationsShownInfoItemDto.CommunicationTypeDto.SMALL_TOOLTIP;
            }
            arrayList.add(new CommunicationsShownInfoItemDto(str, str2, str3, communicationTypeDto));
        }
        return new CommunicationsShownInfoDto(arrayList);
    }
}
