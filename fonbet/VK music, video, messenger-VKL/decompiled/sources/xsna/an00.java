package xsna;

import android.os.Bundle;
import com.vk.api.generated.auth.dto.AuthRefreshAccessTokenDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokenDto;
import com.vk.api.generated.auth.dto.AuthRefreshUserSessionDto;
import com.vk.api.sdk.auth.UtilityToken;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.usi0;

/* compiled from: Mappers.kt */
/* loaded from: classes.dex */
public final class an00 {
    public static final AuthResult a(usi0.a aVar, Bundle bundle) {
        return new AuthResult(aVar.a().e(), null, aVar.c().b(), false, aVar.a().d(), null, null, null, null, 0, null, 0, null, null, null, aVar.a().c(), bundle, aVar.d, null, null, null, null, null, 8159208, null);
    }

    public static final h7r0 b(usi0.a aVar) {
        String e = aVar.a().e();
        return new h7r0(aVar.a().d(), aVar.a().c(), aVar.d, aVar.c().b(), e, null);
    }

    public static final ArrayList c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((usi0.a) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList d(List list) {
        String str;
        UtilityTokens utilityTokens;
        List<AuthRefreshTokenDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (AuthRefreshTokenDto authRefreshTokenDto : list2) {
            UserId userId = authRefreshTokenDto.getUserId();
            AuthRefreshAccessTokenDto d = authRefreshTokenDto.d();
            if (d == null || (str = d.e()) == null) {
                str = "";
            }
            String str2 = str;
            AuthRefreshAccessTokenDto d2 = authRefreshTokenDto.d();
            int d3 = d2 != null ? d2.d() : 0;
            long currentTimeMillis = System.currentTimeMillis();
            List<AuthRefreshUserSessionDto> k = authRefreshTokenDto.k();
            if (k != null) {
                List<AuthRefreshUserSessionDto> list3 = k;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (AuthRefreshUserSessionDto authRefreshUserSessionDto : list3) {
                    arrayList2.add(new UtilityToken(authRefreshUserSessionDto.d(), authRefreshUserSessionDto.e()));
                }
                utilityTokens = new UtilityTokens(arrayList2);
            } else {
                UtilityTokens.CREATOR.getClass();
                utilityTokens = UtilityTokens.c;
            }
            arrayList.add(new com.vk.api.sdk.auth.a(d3, currentTimeMillis, utilityTokens, userId, str2, null));
        }
        return arrayList;
    }
}
