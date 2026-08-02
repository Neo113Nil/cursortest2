package xsna;

import com.vk.api.comments.CommentsOrder;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommentsOrderState.kt */
/* loaded from: classes3.dex */
public final class yfg {
    public int a;
    public int b;
    public String c;
    public List<CommentsOrder.Item> d;
    public final wzs<? super String, ? super yfg, s3q0> e;

    public yfg() {
        throw null;
    }

    public yfg(wzs wzsVar) {
        EmptyList emptyList = EmptyList.b;
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = emptyList;
        this.e = wzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfg)) {
            return false;
        }
        yfg yfgVar = (yfg) obj;
        return this.a == yfgVar.a && this.b == yfgVar.b && epx.f(this.c, yfgVar.c) && epx.f(this.d, yfgVar.d) && epx.f(this.e, yfgVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fw3.a(urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "CommentsOrderState(comments=" + this.a + ", currentLevelCount=" + this.b + ", current=" + this.c + ", options=" + this.d + ", callback=" + this.e + ')';
    }
}
