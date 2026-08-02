package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserProfile;
import xsna.kr5;

/* compiled from: AvatarApiExtensions.kt */
/* loaded from: classes15.dex */
public final class qp5 {
    public static kr5 a(UsersUserFullDto usersUserFullDto) {
        String W1 = usersUserFullDto != null ? usersUserFullDto.W1() : null;
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
        kr5.a aVar = new kr5.a(new og0(ImageList.a.a(usersUserFullDto != null ? usersUserFullDto.r2() : null), W1));
        s3q0 s3q0Var = s3q0.a;
        return aVar.a();
    }

    public static kr5 b(UserProfile userProfile) {
        kr5.a aVar = new kr5.a(new dqz0(userProfile));
        s3q0 s3q0Var = s3q0.a;
        return aVar.a();
    }
}
