package com.yandex.go.address.dto;

import com.yandex.go.address.models.AddressFinalizeTrigger;
import com.yandex.go.address.models.EditAction;
import com.yandex.go.panorama.api.data.PanoramaIdDataDto;
import defpackage.bgq0;
import defpackage.gtq0;
import defpackage.tb90;
import defpackage.tmx;
import defpackage.v7v0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.persuggest.api.EditActionDto;

/* loaded from: classes.dex */
public final class b {
    public static AddressDTO a(zzs zzsVar) {
        return new AddressDTO(zzsVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554430);
    }

    public static AddressDTO b(v7v0 v7v0Var) {
        PanoramaIdDataDto panoramaIdDataDto;
        zzs zzsVar = v7v0Var.a;
        String str = v7v0Var.k;
        String str2 = v7v0Var.n;
        String str3 = v7v0Var.c;
        String str4 = v7v0Var.g;
        String str5 = v7v0Var.d;
        String str6 = v7v0Var.l;
        String str7 = v7v0Var.t;
        String str8 = v7v0Var.p;
        String str9 = v7v0Var.b;
        String str10 = v7v0Var.w;
        String str11 = v7v0Var.x;
        String str12 = v7v0Var.y;
        String str13 = v7v0Var.z;
        bgq0 bgq0Var = v7v0Var.A;
        String str14 = v7v0Var.B;
        String str15 = v7v0Var.C;
        EditAction editAction = v7v0Var.K == EditActionDto.CLEAR ? EditAction.CLEAR : EditAction.EDIT;
        Integer num = v7v0Var.L;
        GeoObjectType geoObjectType = (GeoObjectType) gtq0.j(v7v0Var.u, ((tmx) AddressDTO.H.getValue()).a);
        if (geoObjectType == null) {
            geoObjectType = GeoObjectType.ADDRESS;
        }
        tb90 tb90Var = v7v0Var.P;
        GeoObjectType geoObjectType2 = geoObjectType;
        if (tb90Var != null) {
            String str16 = tb90Var.a;
            zzs zzsVar2 = tb90Var.b;
            Double d = tb90Var.c;
            panoramaIdDataDto = new PanoramaIdDataDto(str16, d != null ? d.doubleValue() : 0.0d, zzsVar2, tb90Var.d);
        } else {
            panoramaIdDataDto = null;
        }
        AddressDTO addressDTO = new AddressDTO(zzsVar, str, str2, str3, str4, str5, str6, geoObjectType2, str7, str8, str9, str10, str11, str12, str13, str14, str15, bgq0Var, editAction, num, panoramaIdDataDto, 16795656);
        addressDTO.A = v7v0Var.G;
        addressDTO.B = v7v0Var.e;
        addressDTO.z = v7v0Var.E.b;
        addressDTO.C = v7v0Var.H;
        addressDTO.D = v7v0Var.J;
        addressDTO.E = v7v0Var.D;
        List<String> list = v7v0Var.v;
        ArrayList arrayList = new ArrayList();
        for (String str17 : list) {
            AddressDTO.Companion.getClass();
            AddressFinalizeTrigger addressFinalizeTrigger = (AddressFinalizeTrigger) gtq0.j(str17, ((tmx) AddressDTO.I.getValue()).a);
            if (addressFinalizeTrigger != null) {
                arrayList.add(addressFinalizeTrigger);
            }
        }
        addressDTO.F = arrayList;
        return addressDTO;
    }

    public final KSerializer serializer() {
        return AddressDTO$$serializer.INSTANCE;
    }
}
