package xsna;

import com.vk.channels.api.Channel;

/* compiled from: OnChannelUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class r280 extends sxp {
    public final wpp<Long, Channel> b;
    public final Object c;

    public /* synthetic */ r280(wpp wppVar) {
        this(null, wppVar);
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r280)) {
            return false;
        }
        r280 r280Var = (r280) obj;
        return epx.f(this.b, r280Var.b) && epx.f(this.c, r280Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelUpdateEvent(channels=");
        sb.append(this.b);
        sb.append(", changerTag=");
        return k73.c(sb, this.c, ')');
    }

    public r280(Object obj, wpp wppVar) {
        this.b = wppVar;
        this.c = obj;
    }
}
