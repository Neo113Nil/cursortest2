package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.voip.userid.CallsUserId;

/* compiled from: CallListGroup.kt */
/* loaded from: classes7.dex */
public final class w49 {
    public final CallsUserId.VkUserId a;
    public final String b;
    public final ImageList c;
    public final kr5 d;

    public w49(CallsUserId.VkUserId vkUserId, String str, ImageList imageList, kr5 kr5Var) {
        this.a = vkUserId;
        this.b = str;
        this.c = imageList;
        this.d = kr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w49)) {
            return false;
        }
        w49 w49Var = (w49) obj;
        return this.a.equals(w49Var.a) && this.b.equals(w49Var.b) && this.c.equals(w49Var.c) && this.d.equals(w49Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.b);
    }

    public final String toString() {
        return "CallListGroup(id=" + this.a + ", title=" + this.b + ", image=" + this.c + ", avatar=" + this.d + ')';
    }
}
