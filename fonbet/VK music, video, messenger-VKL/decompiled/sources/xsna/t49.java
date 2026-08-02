package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.userid.CallsUserId;

/* compiled from: CallListContact.kt */
/* loaded from: classes7.dex */
public final class t49 {
    public final Serializer.StreamParcelableAdapter a;
    public final int b;
    public final String c;
    public final ImageList d;
    public final kr5 e;

    /* JADX WARN: Multi-variable type inference failed */
    public t49(CallsUserId callsUserId, int i, String str, ImageList imageList, kr5 kr5Var) {
        this.a = (Serializer.StreamParcelableAdapter) callsUserId;
        this.b = i;
        this.c = str;
        this.d = imageList;
        this.e = kr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t49)) {
            return false;
        }
        t49 t49Var = (t49) obj;
        return this.a.equals(t49Var.a) && this.b == t49Var.b && epx.f(this.c, t49Var.c) && epx.f(this.d, t49Var.d) && this.e.equals(t49Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fw3.a(urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d.b);
    }

    public final String toString() {
        return "CallListContact(id=" + this.a + ", contactId=" + this.b + ", name=" + this.c + ", image=" + this.d + ", avatar=" + this.e + ')';
    }
}
