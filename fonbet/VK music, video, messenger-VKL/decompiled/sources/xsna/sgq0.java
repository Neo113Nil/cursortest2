package xsna;

import android.database.Cursor;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import com.vk.im.engine.models.users.UserStorageModel;
import java.util.HashMap;

/* compiled from: UserContentReader.kt */
/* loaded from: classes2.dex */
public final class sgq0 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UserStorageModel a(Cursor cursor) {
        ImageList imageList;
        OnlineInfo invisibleStatus;
        long C = fl3.C(cursor, "id");
        Long D = fl3.D(cursor, "contact_id");
        String E = fl3.E(cursor, X3.j.D);
        UserSex.a aVar = UserSex.Companion;
        Integer valueOf = Integer.valueOf(fl3.A(cursor, "sex"));
        aVar.getClass();
        UserSex a = UserSex.a.a(valueOf);
        byte[] v = fl3.v(cursor, "avatar");
        ImageStatus imageStatus = null;
        if (v != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            imageList = (ImageList) Serializer.b.a(v, ImageList.class.getClassLoader());
        }
        imageList = new ImageList(null, 1, null);
        boolean x = fl3.x(cursor, "blocked");
        boolean x2 = fl3.x(cursor, "blocked_by_me");
        UserDeactivationStatus.a aVar2 = UserDeactivationStatus.Companion;
        Integer valueOf2 = Integer.valueOf(fl3.A(cursor, "deactivated"));
        aVar2.getClass();
        UserDeactivationStatus a2 = UserDeactivationStatus.a.a(valueOf2);
        boolean x3 = fl3.x(cursor, "verified");
        int A = fl3.A(cursor, "online_type");
        long C2 = fl3.C(cursor, "online_last_seen");
        int A2 = fl3.A(cursor, "online_app_id");
        if (A == -1 || C2 < 0) {
            InvisibleLastSeenStatus.Companion.getClass();
            invisibleStatus = new InvisibleStatus(InvisibleLastSeenStatus.a.a((int) C2));
        } else {
            invisibleStatus = new VisibleStatus(C2, A > 0, A2, A > 1 ? Platform.MOBILE : Platform.WEB);
        }
        OnlineInfo onlineInfo = invisibleStatus;
        String E2 = fl3.E(cursor, "first_name_nom");
        String E3 = fl3.E(cursor, "last_name_nom");
        String E4 = fl3.E(cursor, "first_name_acc");
        String E5 = fl3.E(cursor, "last_name_acc");
        String E6 = fl3.E(cursor, "first_name_gen");
        String E7 = fl3.E(cursor, "last_name_gen");
        String E8 = fl3.E(cursor, "first_name_dat");
        String E9 = fl3.E(cursor, "last_name_dat");
        boolean x4 = fl3.x(cursor, "can_call");
        boolean x5 = fl3.x(cursor, "is_service");
        boolean x6 = fl3.x(cursor, "is_service_account");
        int A3 = fl3.A(cursor, "friend_status");
        String E10 = fl3.E(cursor, "mobile_phone");
        boolean x7 = fl3.x(cursor, "is_closed");
        boolean x8 = fl3.x(cursor, "can_access_closed");
        boolean x9 = fl3.x(cursor, "can_be_invited_to_chats");
        long C3 = fl3.C(cursor, "sync_time_overall");
        long C4 = fl3.C(cursor, "sync_time_online");
        byte[] v2 = fl3.v(cursor, "image_status");
        if (v2 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            imageStatus = (ImageStatus) Serializer.b.a(v2, ImageStatus.class.getClassLoader());
        }
        ImageStatus imageStatus2 = imageStatus;
        String E11 = fl3.E(cursor, "country");
        String E12 = fl3.E(cursor, "city");
        OccupationType.a aVar3 = OccupationType.Companion;
        int A4 = fl3.A(cursor, "occupation_type");
        aVar3.getClass();
        OccupationType a3 = OccupationType.a.a(A4);
        String E13 = fl3.E(cursor, "occupation_name");
        Integer B = fl3.B(cursor, "birthday_day");
        Integer B2 = fl3.B(cursor, "birthday_month");
        Integer B3 = fl3.B(cursor, "birthday_year");
        boolean x10 = fl3.x(cursor, "can_send_friend_request");
        boolean x11 = fl3.x(cursor, "avatar_is_nft");
        boolean x12 = fl3.x(cursor, "is_oauth_verified");
        SocialButtonType.a aVar4 = SocialButtonType.Companion;
        String E14 = fl3.E(cursor, "social_button_type");
        aVar4.getClass();
        SocialButtonType a4 = SocialButtonType.a.a(E14);
        if (a4 == null) {
            a4 = SocialButtonType.ADD;
        }
        return new UserStorageModel(C, D, E, a, imageList, x, x2, a2, x3, x12, onlineInfo, E2, E3, E4, E5, E6, E7, E8, E9, x4, x5, x6, A3, E10, x7, x8, x9, C3, C4, imageStatus2, E11, E12, a3, E13, B, B2, B3, x10, x11, a4, fl3.x(cursor, "can_write_private_message"), fl3.x(cursor, "is_adult"));
    }
}
