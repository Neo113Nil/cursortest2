package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: MsgClipProducts.kt */
/* loaded from: classes18.dex */
public final class uh30 {
    public final int a;
    public final UserId b;
    public final String c;
    public final ArrayList d;

    public uh30(int i, UserId userId, String str, ArrayList arrayList) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh30)) {
            return false;
        }
        uh30 uh30Var = (uh30) obj;
        return this.a == uh30Var.a && this.b.equals(uh30Var.b) && epx.f(this.c, uh30Var.c) && this.d.equals(uh30Var.d);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgClipProducts(clipId=");
        sb.append(this.a);
        sb.append(", clipOwnerId=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", products=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
