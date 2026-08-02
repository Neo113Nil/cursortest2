package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserNameCase;
import io.jsonwebtoken.JwtParser;

/* compiled from: Profile.kt */
/* loaded from: classes2.dex */
public interface qtd0 extends btx0 {
    public static final a y7 = a.a;

    /* compiled from: Profile.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final ImageList b = new ImageList(null, 1, 0 == true ? 1 : 0);
    }

    default UserSex B2() {
        return UserSex.UNKNOWN;
    }

    default String B3() {
        return "";
    }

    default Peer B7() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.a(id(), t8());
    }

    default boolean C6() {
        return false;
    }

    default ImageList C8() {
        y7.getClass();
        return a.b;
    }

    default ImageStatus E5() {
        return null;
    }

    default boolean E8() {
        return t8() == Peer.Type.CONTACT;
    }

    default long G3() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.e(id(), t8());
    }

    default String H5(UserNameCase userNameCase) {
        return "";
    }

    default boolean H7() {
        return false;
    }

    default String I9(UserNameCase userNameCase) {
        String str;
        String d6 = d6(userNameCase);
        String H5 = H5(userNameCase);
        if (H5.length() > 0) {
            str = " " + erm0.x0(H5) + JwtParser.SEPARATOR_CHAR;
        } else {
            str = "";
        }
        return fo8.a(d6, str);
    }

    default boolean K6() {
        return false;
    }

    default String La() {
        return name();
    }

    default boolean N0() {
        return false;
    }

    default String P5(UserNameCase userNameCase) {
        return name();
    }

    default String Q2(UserNameCase userNameCase) {
        return name();
    }

    default String Ra() {
        return "";
    }

    default boolean Va() {
        return t8() == Peer.Type.GROUP;
    }

    default boolean W1() {
        return true;
    }

    default String c5() {
        return "";
    }

    default String d6(UserNameCase userNameCase) {
        return name();
    }

    default String h8() {
        return "";
    }

    default String ha() {
        return I9(UserNameCase.NOM);
    }

    default boolean ib() {
        return false;
    }

    long id();

    default boolean ja() {
        return false;
    }

    default boolean k5() {
        return false;
    }

    default boolean ka() {
        return false;
    }

    default String m2() {
        return "";
    }

    default OnlineInfo mb() {
        return VisibleStatus.f;
    }

    default String n6() {
        return "";
    }

    default boolean n9() {
        return false;
    }

    default String name() {
        return "";
    }

    default VerifyInfo q9() {
        return new VerifyInfo(false, false, false, false, false, false, 63, null);
    }

    default boolean r5() {
        return false;
    }

    default long r8() {
        return B7().b;
    }

    default boolean t1() {
        return t8() == Peer.Type.USER;
    }

    default boolean t6() {
        return false;
    }

    default Peer.Type t8() {
        return Peer.Type.UNKNOWN;
    }

    default Long v5() {
        return null;
    }
}
