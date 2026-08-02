package xsna;

import android.util.LruCache;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import java.util.ArrayList;
import xsna.sew0;

/* compiled from: VoipDataProviderApiImpl.kt */
/* loaded from: classes7.dex */
public final class inw0 {
    public static final whr0 a(UserProfile userProfile) {
        String str;
        sew0.b a;
        ArrayList arrayList;
        String valueOf = String.valueOf(userProfile.c.b);
        Image image = userProfile.O;
        String str2 = null;
        fxj0 o = ixj0.o(image != null ? image.b : null);
        if (o != null) {
            LruCache<String, fxj0> lruCache = sew0.a;
            a = sew0.a.b(o.getUrl(), userProfile.Y, true);
        } else {
            LruCache<String, fxj0> lruCache2 = sew0.a;
            Image image2 = userProfile.O;
            if (image2 != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                str = Owner.a.a(100, image2);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            Image image3 = userProfile.O;
            if (image3 != null && (arrayList = image3.b) != null) {
                str2 = ixj0.h(arrayList);
            }
            a = sew0.a.a(str, str2, userProfile.Y);
        }
        String str3 = userProfile.d;
        String n = userProfile.n();
        String str4 = n == null ? "" : n;
        String string = userProfile.s.getString("first_name_dat");
        String str5 = string == null ? "" : string;
        String str6 = userProfile.f;
        boolean z = userProfile.i == UserSex.FEMALE;
        boolean z2 = userProfile.B.b;
        boolean f = epx.f(userProfile.y, Boolean.TRUE);
        int i = userProfile.v;
        return new whr0(valueOf, a, z, z2, false, f, i != 1 ? i != 2 ? i != 3 ? VoipFriendStatus.NOT_FRIENDS : VoipFriendStatus.FRIENDS : VoipFriendStatus.INCOME_FRIENDSHIP_REQUEST : VoipFriendStatus.FOLLOWING, str3, str6, str4, str5, "", false, false, null, false, null, null, 253952);
    }
}
