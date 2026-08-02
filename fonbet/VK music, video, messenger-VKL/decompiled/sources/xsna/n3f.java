package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.f9j0;

/* compiled from: ClipsShareRemoteStorage.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class n3f extends FunctionReferenceImpl implements izs<FriendsGetFieldsResponseDto, List<? extends f9j0.c.b>> {
    @Override // xsna.izs
    public final List<? extends f9j0.c.b> invoke(FriendsGetFieldsResponseDto friendsGetFieldsResponseDto) {
        ((p3f) this.receiver).getClass();
        List<UsersUserFullDto> d = friendsGetFieldsResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (UsersUserFullDto usersUserFullDto : d) {
            UserId s1 = usersUserFullDto.s1();
            String D0 = usersUserFullDto.D0();
            if (D0 == null && (D0 = usersUserFullDto.M()) == null) {
                D0 = "";
            }
            String r2 = usersUserFullDto.r2();
            arrayList.add(new f9j0.c.b(s1, (usersUserFullDto.j() == BaseBoolIntDto.YES || usersUserFullDto.D() == BaseBoolIntDto.NO) ? false : true, D0, (r2 == null && (r2 = usersUserFullDto.W1()) == null) ? "" : r2));
        }
        return arrayList;
    }
}
