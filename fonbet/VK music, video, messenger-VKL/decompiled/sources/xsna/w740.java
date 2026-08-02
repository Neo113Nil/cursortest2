package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.multiplecoownership.model.MultipleCoownershipType;
import java.util.ArrayList;

/* compiled from: MultipleCoownershipState.kt */
/* loaded from: classes3.dex */
public final class w740 implements km50 {
    public final ArrayList b;
    public final MultipleCoownershipType c;
    public final UserId d;

    public w740(ArrayList arrayList, MultipleCoownershipType multipleCoownershipType, UserId userId) {
        this.b = arrayList;
        this.c = multipleCoownershipType;
        this.d = userId;
    }

    public static w740 a(w740 w740Var, UserId userId, int i) {
        ArrayList arrayList = w740Var.b;
        MultipleCoownershipType multipleCoownershipType = w740Var.c;
        if ((i & 4) != 0) {
            userId = w740Var.d;
        }
        w740Var.getClass();
        return new w740(arrayList, multipleCoownershipType, userId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w740)) {
            return false;
        }
        w740 w740Var = (w740) obj;
        return this.b.equals(w740Var.b) && this.c == w740Var.c && epx.f(this.d, w740Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d.b) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleCoownershipState(users=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", selectedUserId=");
        return gp.b(sb, this.d, ')');
    }
}
