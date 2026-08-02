package xsna;

import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipHistoryFriend.kt */
/* loaded from: classes7.dex */
public final class gpw0 {
    public final CallsUserId.VkUserId a;
    public final String b;
    public final String c;
    public final ImageList d;
    public final UsersOnlineInfoDto e;
    public final boolean f;
    public final boolean g;
    public final kr5 h;

    /* compiled from: VoipHistoryFriend.kt */
    public static final class a {
        public static gpw0 a(UsersUserFullDto usersUserFullDto) {
            UserId s1 = usersUserFullDto.s1();
            if (s1 == null) {
                throw new IllegalStateException("User without id: " + usersUserFullDto);
            }
            Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
            CallsUserId.VkUserId vkUserId = new CallsUserId.VkUserId(s1);
            String D0 = usersUserFullDto.D0();
            String str = D0 == null ? "" : D0;
            String x1 = usersUserFullDto.x1();
            String str2 = x1 == null ? "" : x1;
            Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
            ImageList a = ImageList.a.a(usersUserFullDto.r2());
            UsersOnlineInfoDto U1 = usersUserFullDto.U1();
            UsersOnlineInfoDto usersOnlineInfoDto = U1 == null ? new UsersOnlineInfoDto(false, null, null, null, null, null, 62, null) : U1;
            boolean z = usersUserFullDto.L2() == BaseSexDto.FEMALE;
            Boolean o = usersUserFullDto.o();
            return new gpw0(vkUserId, str, str2, a, usersOnlineInfoDto, z, o != null ? o.booleanValue() : false, qp5.a(usersUserFullDto));
        }
    }

    public gpw0(CallsUserId.VkUserId vkUserId, String str, String str2, ImageList imageList, UsersOnlineInfoDto usersOnlineInfoDto, boolean z, boolean z2, kr5 kr5Var) {
        this.a = vkUserId;
        this.b = str;
        this.c = str2;
        this.d = imageList;
        this.e = usersOnlineInfoDto;
        this.f = z;
        this.g = z2;
        this.h = kr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpw0)) {
            return false;
        }
        gpw0 gpw0Var = (gpw0) obj;
        return this.a.equals(gpw0Var.a) && this.b.equals(gpw0Var.b) && this.c.equals(gpw0Var.c) && this.d.equals(gpw0Var.d) && this.e.equals(gpw0Var.e) && this.f == gpw0Var.f && this.g == gpw0Var.g && this.h.equals(gpw0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b(qoy.b((this.e.hashCode() + fw3.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.b)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "VoipHistoryFriend(id=" + this.a + ", firstName=" + this.b + ", lastName=" + this.c + ", image=" + this.d + ", onlineInfo=" + this.e + ", isFemale=" + this.f + ", canCall=" + this.g + ", avatar=" + this.h + ')';
    }
}
