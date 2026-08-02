package xsna;

import com.vk.clips.internal.nps.api.InternalNpsStateHolder$NpsEventType;

/* compiled from: InternalNpsStateHolder.kt */
/* loaded from: classes16.dex */
public final class xjx {
    public final String a;
    public final InternalNpsStateHolder$NpsEventType b;

    public xjx(String str, InternalNpsStateHolder$NpsEventType internalNpsStateHolder$NpsEventType) {
        this.a = str;
        this.b = internalNpsStateHolder$NpsEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjx)) {
            return false;
        }
        xjx xjxVar = (xjx) obj;
        return epx.f(this.a, xjxVar.a) && this.b == xjxVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NpsEvent(questionnaireId=" + this.a + ", type=" + this.b + ')';
    }
}
