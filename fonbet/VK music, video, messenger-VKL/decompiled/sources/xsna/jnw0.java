package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.voip.OkApiDomain;
import java.util.Collections;
import kotlin.collections.EmptySet;
import xsna.wt2;

/* compiled from: VoipDtoConverter.kt */
/* loaded from: classes7.dex */
public final class jnw0 {

    /* compiled from: VoipDtoConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final zqk0 a(UserProfile userProfile, boolean z) {
        String str;
        ImageSize Cb;
        long j = userProfile.c.b;
        String str2 = userProfile.d;
        String str3 = userProfile.e;
        Image image = userProfile.O;
        if ((image == null || (Cb = image.Cb(iah0.f().widthPixels, true, false)) == null || (str = Cb.d.d) == null) && (str = userProfile.h) == null) {
            str = "";
        }
        return new zqk0(null, j, str2, str3, str, userProfile.i == UserSex.FEMALE, userProfile.B.b, Collections.singleton(String.valueOf(userProfile.c.b)), false, null, null, null, null, 0, false, null, null, null, z, false, userProfile.Y, 1572609);
    }

    public static final zqk0 b(wt2 wt2Var, boolean z, boolean z2) {
        wt2.a aVar = wt2Var.c;
        wt2.c cVar = wt2Var.a;
        wt2.b bVar = wt2Var.b;
        String str = bVar.a;
        String Db = bVar.b.Db();
        if (Db == null) {
            Db = "";
        }
        String str2 = Db;
        EmptySet emptySet = EmptySet.b;
        String str3 = cVar.b;
        String str4 = cVar.a;
        String str5 = cVar.c;
        String str6 = aVar.d;
        String str7 = aVar.b;
        String str8 = aVar.c;
        if (str8 == null) {
            str8 = OkApiDomain.PROD.h();
        }
        String str9 = aVar.a;
        return new zqk0(null, 0L, str, str, str2, false, false, emptySet, true, null, new xdw0(str3, str4, str5, cVar.d, str6, str7, str8, str9), null, null, 0, false, null, null, null, z, z2, false, 2618881);
    }

    public static final zqk0 c(qtd0 qtd0Var, boolean z) {
        long longValue;
        if (qtd0Var instanceof Contact) {
            Long l = ((Contact) qtd0Var).j;
            longValue = l != null ? l.longValue() : 0L;
        } else {
            longValue = qtd0Var.getId().longValue();
        }
        UserNameCase userNameCase = UserNameCase.NOM;
        String d6 = qtd0Var.d6(userNameCase);
        String Q2 = qtd0Var.Q2(userNameCase);
        String Db = qtd0Var.C8().Db();
        if (Db == null) {
            Db = "";
        }
        return new zqk0(null, longValue, d6, Q2, Db, qtd0Var.B2() == UserSex.FEMALE, qtd0Var.q9().b, Collections.singleton(qtd0Var.getId().toString()), false, null, null, null, null, 0, false, null, null, null, z, false, qtd0Var.n9(), 1572609);
    }
}
