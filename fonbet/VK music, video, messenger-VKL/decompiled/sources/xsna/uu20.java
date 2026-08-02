package xsna;

import com.vk.debug.design.MockType;
import java.util.List;

/* compiled from: DebugMockApiResponsesScreen.kt */
/* loaded from: classes17.dex */
public final class uu20 {
    public final String a;
    public final MockType b;
    public final String c;
    public final String d;
    public final List<rh90> e;

    public uu20() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uu20 a(uu20 uu20Var, String str, MockType mockType, String str2, String str3, wow wowVar, int i) {
        if ((i & 1) != 0) {
            str = uu20Var.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            mockType = uu20Var.b;
        }
        MockType mockType2 = mockType;
        if ((i & 4) != 0) {
            str2 = uu20Var.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = uu20Var.d;
        }
        String str6 = str3;
        List list = wowVar;
        if ((i & 16) != 0) {
            list = uu20Var.e;
        }
        uu20Var.getClass();
        return new uu20(str4, mockType2, str5, str6, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu20)) {
            return false;
        }
        uu20 uu20Var = (uu20) obj;
        return epx.f(this.a, uu20Var.a) && this.b == uu20Var.b && epx.f(this.c, uu20Var.c) && epx.f(this.d, uu20Var.d) && epx.f(this.e, uu20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MockUi(method=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", fileName=");
        sb.append(this.d);
        sb.append(", params=");
        return ms9.a(')', sb, this.e);
    }

    public uu20(String str, MockType mockType, String str2, String str3, List<rh90> list) {
        this.a = str;
        this.b = mockType;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public uu20(int i) {
        this("", MockType.TEXT, "", "", new wow(rl3.u0(new rh90[0])));
    }
}
