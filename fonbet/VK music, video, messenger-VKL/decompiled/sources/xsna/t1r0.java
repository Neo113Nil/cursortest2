package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersSearchSexDto;
import com.vk.api.generated.users.dto.UsersSearchStatusDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: UsersService.kt */
/* loaded from: classes11.dex */
public interface t1r0 extends r1r0 {

    /* compiled from: UsersService.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static ufx a(String str, Integer num, Integer num2, List list, Integer num3, Integer num4, UsersSearchSexDto usersSearchSexDto, UsersSearchStatusDto usersSearchStatusDto, Integer num5, Integer num6, String str2) {
            ArrayList arrayList;
            ufx ufxVar = new ufx("users.search", new tq(27), new jgj0(5));
            if (str != null) {
                ufx.n(ufxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 12);
                s3q0 s3q0Var = s3q0.a;
            }
            ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 8);
            s3q0 s3q0Var2 = s3q0.a;
            ufxVar.f(num2.intValue(), 0, 1000, "count");
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UsersFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ufxVar.h("fields", arrayList);
                s3q0 s3q0Var3 = s3q0.a;
            }
            if (num3 != null) {
                ufx.k(ufxVar, "city", num3.intValue(), 0, 8);
                s3q0 s3q0Var4 = s3q0.a;
            }
            if (num4 != null) {
                ufx.k(ufxVar, "country", num4.intValue(), 0, 8);
                s3q0 s3q0Var5 = s3q0.a;
            }
            if (usersSearchSexDto != null) {
                ufx.k(ufxVar, "sex", usersSearchSexDto.i(), 0, 12);
                s3q0 s3q0Var6 = s3q0.a;
            }
            if (usersSearchStatusDto != null) {
                ufx.k(ufxVar, "status", usersSearchStatusDto.i(), 0, 12);
                s3q0 s3q0Var7 = s3q0.a;
            }
            if (num5 != null) {
                ufx.k(ufxVar, "age_from", num5.intValue(), 0, 8);
                s3q0 s3q0Var8 = s3q0.a;
            }
            if (num6 != null) {
                ufx.k(ufxVar, "age_to", num6.intValue(), 0, 8);
                s3q0 s3q0Var9 = s3q0.a;
            }
            if (str2 != null) {
                ufx.n(ufxVar, "screen_ref", str2, 0, 12);
                s3q0 s3q0Var10 = s3q0.a;
            }
            return ufxVar;
        }
    }

    ufx a(String str, Integer num, Integer num2, List list, Integer num3, Integer num4, UsersSearchSexDto usersSearchSexDto, UsersSearchStatusDto usersSearchStatusDto, Integer num5, Integer num6, String str2);
}
