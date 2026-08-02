package xsna;

import com.vk.im.engine.models.lp_events.ReactionsLpEventSubType;
import java.util.ArrayList;

/* compiled from: ReactionsLpEvent.kt */
/* loaded from: classes2.dex */
public final class s5f0 implements e900 {
    public final ReactionsLpEventSubType a;
    public final long b;
    public final int c;
    public final Integer d;
    public final boolean e;
    public final ArrayList f;

    public s5f0(ReactionsLpEventSubType reactionsLpEventSubType, long j, int i, Integer num, boolean z, ArrayList arrayList) {
        this.a = reactionsLpEventSubType;
        this.b = j;
        this.c = i;
        this.d = num;
        this.e = z;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5f0)) {
            return false;
        }
        s5f0 s5f0Var = (s5f0) obj;
        return this.a == s5f0Var.a && this.b == s5f0Var.b && this.c == s5f0Var.c && epx.f(this.d, s5f0Var.d) && this.e == s5f0Var.e && this.f.equals(s5f0Var.f);
    }

    public final int hashCode() {
        int a = shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        return this.f.hashCode() + qoy.b((a + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsLpEvent(subType=");
        sb.append(this.a);
        sb.append(", dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", myReaction=");
        sb.append(this.d);
        sb.append(", myReactionChanged=");
        sb.append(this.e);
        sb.append(", reactions=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.f);
    }
}
