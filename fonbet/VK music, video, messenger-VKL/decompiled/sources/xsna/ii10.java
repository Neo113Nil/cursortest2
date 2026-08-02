package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.masks.dto.MasksMaskDisabledReasonDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.masks.dto.MasksMaskGeoDto;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskDisableReason;
import com.vk.dto.masks.MaskGeo;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MasksToMaskMapper.kt */
/* loaded from: classes3.dex */
public final class ii10 {
    public static Mask a(MasksMaskDto masksMaskDto, Map map, Map map2) {
        ArrayList arrayList;
        NotificationImage notificationImage;
        boolean z;
        MaskGeo maskGeo;
        NotificationImage notificationImage2;
        Iterator it;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        if (masksMaskDto == null) {
            return null;
        }
        UserProfile userProfile = map != null ? (UserProfile) map.get(masksMaskDto.q()) : null;
        Group group = map2 != null ? (Group) map2.get(fkq0.e(masksMaskDto.q())) : null;
        int id = masksMaskDto.getId();
        UserId q = masksMaskDto.q();
        String k = masksMaskDto.k();
        Integer n = masksMaskDto.n();
        int intValue = n != null ? n.intValue() : 0;
        long intValue2 = masksMaskDto.o() != null ? r0.intValue() : 0L;
        long intValue3 = masksMaskDto.e() != null ? r0.intValue() : 0L;
        String url = masksMaskDto.getUrl();
        List<BaseImageDto> l = masksMaskDto.l();
        if (l != null) {
            List<BaseImageDto> list = l;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (Iterator it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                BaseImageDto baseImageDto = (BaseImageDto) it2.next();
                arrayList.add(new NotificationImage.ImageInfo(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl()));
            }
        } else {
            arrayList = null;
        }
        NotificationImage notificationImage3 = new NotificationImage(arrayList);
        Boolean B = masksMaskDto.B();
        boolean booleanValue = B != null ? B.booleanValue() : false;
        Integer g = masksMaskDto.g();
        int intValue4 = g != null ? g.intValue() : 0;
        Integer p = masksMaskDto.p();
        int intValue5 = p != null ? p.intValue() : 0;
        MasksMaskDisabledReasonDto f = masksMaskDto.f();
        MaskDisableReason maskDisableReason = f != null ? new MaskDisableReason(f.getTitle(), f.d(), f.getUrl()) : null;
        String j = masksMaskDto.j();
        List<List<MasksMaskGeoDto>> i = masksMaskDto.i();
        if (i != null) {
            ArrayList v = c5g.v(i);
            ArrayList arrayList2 = new ArrayList(c5g.u(v, 10));
            Iterator it3 = v.iterator();
            while (it3.hasNext()) {
                MasksMaskGeoDto masksMaskGeoDto = (MasksMaskGeoDto) it3.next();
                Float d7 = masksMaskGeoDto.d();
                if (d7 != null) {
                    notificationImage2 = notificationImage3;
                    it = it3;
                    d = d7.floatValue();
                } else {
                    notificationImage2 = notificationImage3;
                    it = it3;
                    d = 0.0d;
                }
                Float e = masksMaskGeoDto.e();
                if (e != null) {
                    d2 = d;
                    d3 = e.floatValue();
                } else {
                    d2 = d;
                    d3 = 0.0d;
                }
                Integer f2 = masksMaskGeoDto.f();
                if (f2 != null) {
                    d5 = d2;
                    d6 = d3;
                    d4 = f2.intValue();
                } else {
                    d4 = 0.0d;
                    d5 = d2;
                    d6 = d3;
                }
                arrayList2.add(new MaskGeo.MaskLocation(d5, d6, d4));
                notificationImage3 = notificationImage2;
                it3 = it;
            }
            notificationImage = notificationImage3;
            z = false;
            maskGeo = new MaskGeo((MaskGeo.MaskLocation[]) arrayList2.toArray(new MaskGeo.MaskLocation[0]));
        } else {
            notificationImage = notificationImage3;
            z = false;
            maskGeo = null;
        }
        Boolean C = masksMaskDto.C();
        boolean booleanValue2 = C != null ? C.booleanValue() : z;
        boolean z2 = masksMaskDto.getId() < 0 ? true : z;
        Boolean u = masksMaskDto.u();
        return new Mask(userProfile, group, id, q, false, k, intValue, intValue2, intValue3, url, notificationImage, booleanValue, intValue4, intValue5, maskDisableReason, j, maskGeo, booleanValue2, false, z2, false, u != null ? u.booleanValue() : z, masksMaskDto.d(), 0L, 8388608, null);
    }
}
