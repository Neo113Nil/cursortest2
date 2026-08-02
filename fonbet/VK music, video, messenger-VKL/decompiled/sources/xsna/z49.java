package xsna;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.userid.CallsUserId;

/* compiled from: CallListParticipant.kt */
/* loaded from: classes7.dex */
public final class z49 {
    public final CallsUserId.VkUserId a;
    public final String b;
    public final String c;
    public final ImageList d;
    public final UsersOnlineInfoDto e;
    public final kr5 f;
    public final String g;

    public z49(CallsUserId.VkUserId vkUserId, String str, String str2, ImageList imageList, UsersOnlineInfoDto usersOnlineInfoDto, kr5 kr5Var) {
        this.a = vkUserId;
        this.b = str;
        this.c = str2;
        this.d = imageList;
        this.e = usersOnlineInfoDto;
        this.f = kr5Var;
        this.g = v1v.a(' ', str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z49)) {
            return false;
        }
        z49 z49Var = (z49) obj;
        return this.a.equals(z49Var.a) && this.b.equals(z49Var.b) && this.c.equals(z49Var.c) && this.d.equals(z49Var.d) && this.e.equals(z49Var.e) && this.f.equals(z49Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + fw3.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.b)) * 31);
    }

    public final String toString() {
        return "CallListParticipant(id=" + this.a + ", firstName=" + this.b + ", lastName=" + this.c + ", image=" + this.d + ", onlineInfo=" + this.e + ", avatar=" + this.f + ')';
    }
}
