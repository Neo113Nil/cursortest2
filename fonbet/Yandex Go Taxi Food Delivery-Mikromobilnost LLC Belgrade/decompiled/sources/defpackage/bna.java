package defpackage;

import android.graphics.PointF;
import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesListResponse;
import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesObjectItemDto;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$OrganizationPreviewPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final class bna {
    public final k7x0 a;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList a(FavoritesListResponse favoritesListResponse) {
        MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;
        String str;
        String a;
        PointF pointF;
        List list = favoritesListResponse.b;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : list) {
            linkedHashMap.put(((FavoritesObjectItemDto) obj).a, obj);
        }
        List list2 = favoritesListResponse.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof MapObjectItemDto$OrganizationPreviewPinDto) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MapObjectItemDto$OrganizationPreviewPinDto mapObjectItemDto$OrganizationPreviewPinDto = (MapObjectItemDto$OrganizationPreviewPinDto) it.next();
            FavoritesObjectItemDto favoritesObjectItemDto = (FavoritesObjectItemDto) linkedHashMap.get(mapObjectItemDto$OrganizationPreviewPinDto.a);
            pgp pgpVar = null;
            String str2 = favoritesObjectItemDto != null ? favoritesObjectItemDto.b : null;
            if (str2 != null && (mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto = mapObjectItemDto$OrganizationPreviewPinDto.e) != null) {
                String str3 = mapObjectItemDto$OrganizationPreviewPinDto.a;
                zzs zzsVar = mapObjectItemDto$OrganizationPreviewPinDto.b;
                ImageDto imageDto = mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.b;
                String str4 = imageDto.a;
                if (str4 != null) {
                    if (evu0.J(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        a = String.format(str4, Arrays.copyOf(new Object[]{"XXL"}, 1));
                        str = a;
                        if (str != null) {
                            float[] fArr = mapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.a;
                            if (fArr != null) {
                                if (fArr.length != 2) {
                                    fArr = null;
                                }
                                if (fArr != null) {
                                    pointF = new PointF(fArr[0], fArr[1]);
                                    if (pointF != null) {
                                        pgpVar = new pgp(str3, zzsVar, str2, str, pointF);
                                    }
                                }
                            }
                            pointF = null;
                            if (pointF != null) {
                            }
                        }
                    }
                }
                String str5 = imageDto.b;
                if (str5 != null) {
                    a = ((m7x0) this.a).a(str5);
                    str = a;
                    if (str != null) {
                    }
                } else {
                    str = null;
                    if (str != null) {
                    }
                }
            }
            if (pgpVar != null) {
                arrayList2.add(pgpVar);
            }
        }
        return arrayList2;
    }
}
