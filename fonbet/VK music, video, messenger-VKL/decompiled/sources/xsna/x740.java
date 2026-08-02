package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: MultipleCoownershipUiDto.kt */
/* loaded from: classes3.dex */
public final class x740 {
    public final String a;
    public final String b;
    public final String c;
    public final UserId d;
    public final ArrayList e;

    public x740(String str, String str2, String str3, UserId userId, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = userId;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x740)) {
            return false;
        }
        x740 x740Var = (x740) obj;
        return epx.f(this.a, x740Var.a) && epx.f(this.b, x740Var.b) && epx.f(this.c, x740Var.c) && epx.f(this.d, x740Var.d) && this.e.equals(x740Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleCoownershipUiDto(statusTitle=");
        sb.append(this.a);
        sb.append(", summary=");
        sb.append(this.b);
        sb.append(", buttonText=");
        sb.append(this.c);
        sb.append(", selectedUserId=");
        sb.append(this.d);
        sb.append(", items=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
