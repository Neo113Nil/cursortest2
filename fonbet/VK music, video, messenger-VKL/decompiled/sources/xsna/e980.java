package xsna;

import com.vk.im.engine.models.LongPollType;
import java.util.Collection;

/* compiled from: OnMsgAddEvent.kt */
/* loaded from: classes.dex */
public final class e980 extends q490 {
    public final Object c;
    public final long d;
    public final Collection<Integer> e;
    public final Collection<Integer> f;
    public final LongPollType g;

    public e980(Object obj, long j, Collection<Integer> collection, Collection<Integer> collection2, LongPollType longPollType) {
        this.c = obj;
        this.d = j;
        this.e = collection;
        this.f = collection2;
        this.g = longPollType;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e980)) {
            return false;
        }
        e980 e980Var = (e980) obj;
        return epx.f(this.c, e980Var.c) && this.d == e980Var.d && epx.f(this.e, e980Var.e) && epx.f(this.f, e980Var.f) && this.g == e980Var.g;
    }

    public final int hashCode() {
        Object obj = this.c;
        return this.g.hashCode() + s3j0.a(s3j0.a(bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.d), this.e, 31), this.f, 31);
    }

    public final String toString() {
        return "OnMsgAddEvent(changerTag=" + this.c + ", dialogId=" + this.d + ", msgLocalIds=" + this.e + ", silentMsgIds=" + this.f + ", fromLongPoll=" + this.g + ')';
    }
}
