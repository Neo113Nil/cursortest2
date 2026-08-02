package com.yandex.passport.data.mapper;

import com.yandex.passport.common.core.Partition;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.common.core.b;
import com.yandex.passport.data.models.UserInfoData;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.sbx;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class a {
    public final sbx a;

    public a(sbx sbxVar) {
        this.a = sbxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public static UserInfo a(UserInfoData userInfoData) {
        ArrayList arrayList;
        if (userInfoData.getPartitions().isEmpty()) {
            Partition.Companion.getClass();
            arrayList = b.a();
        } else {
            List<String> partitions = userInfoData.getPartitions();
            ArrayList arrayList2 = new ArrayList(tcc.n(partitions, 10));
            Iterator it = partitions.iterator();
            while (it.hasNext()) {
                arrayList2.add(Partition.m249boximpl(Partition.m250constructorimpl((String) it.next())));
            }
            arrayList = arrayList2;
        }
        String body = userInfoData.getBody();
        String eTag = userInfoData.getETag();
        long m295getRetrievalTimeR7zlAxo = userInfoData.m295getRetrievalTimeR7zlAxo();
        long uidValue = userInfoData.getUidValue();
        String displayName = userInfoData.getDisplayName();
        String publicName = userInfoData.getPublicName();
        String securePhoneNumber = userInfoData.getSecurePhoneNumber();
        return new UserInfo(body, eTag, m295getRetrievalTimeR7zlAxo, uidValue, displayName, publicName, userInfoData.getNormalizedDisplayLogin(), userInfoData.getPrimaryAliasType(), userInfoData.getNativeDefaultEmail(), userInfoData.getAvatarUrl(), userInfoData.isAvatarEmpty(), userInfoData.getSocialProviderCode(), userInfoData.getHasPassword(), userInfoData.getYandexoidLogin(), userInfoData.isBetaTester(), userInfoData.getHasPlus(), userInfoData.getHasMusicSubscription(), userInfoData.getFirstName(), userInfoData.getLastName(), userInfoData.getBirthday(), userInfoData.getXTokenIssuedAt(), userInfoData.getDisplayLogin(), userInfoData.getPublicId(), userInfoData.isChild(), userInfoData.getMachineReadableLogin(), userInfoData.is2faEnabled(), userInfoData.isSms2faEnabled(), userInfoData.isRfc2faEnabled(), arrayList, userInfoData.isPictureLoginForbidden(), userInfoData.isXtokenTrusted(), userInfoData.getHasPlusCard(), userInfoData.getHasProCard(), userInfoData.getHasFamily(), userInfoData.isDriveUser(), userInfoData.isTaxiCompanyBound(), userInfoData.getLocationId(), securePhoneNumber, userInfoData.getFilterParameters(), userInfoData.getMuidValue(), userInfoData.getHasMasterToken(), userInfoData.isBrowserAccount(), userInfoData.getHasWebAuthNCredential(), null);
    }

    public static Pair b(String str) {
        if (str != null) {
            List Y = evu0.Y(str, new char[]{':'}, 0, 6);
            if (Y.size() != 2) {
                Y = null;
            }
            if (Y != null) {
                String e = com.yandex.passport.common.util.a.e((String) Y.get(1));
                Integer l = bvu0.l(10, (String) Y.get(0));
                return new Pair(e, new com.yandex.passport.common.time.a(com.yandex.passport.common.time.a.c(0, l != null ? l.intValue() : 0, 0, 11)));
            }
        }
        return new Pair(null, new com.yandex.passport.common.time.a(0L));
    }

    public static String c(long j, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((int) (j / 1000));
        sb.append(':');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
