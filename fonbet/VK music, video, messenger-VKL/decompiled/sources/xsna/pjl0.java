package xsna;

import com.vk.dto.hints.HintId;

/* compiled from: StorefrontAction.kt */
/* loaded from: classes18.dex */
public final class pjl0 implements hjl0 {
    public final HintId b;

    public pjl0(HintId hintId) {
        this.b = hintId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjl0) && this.b == ((pjl0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TooltipDispose(hintId=" + this.b + ')';
    }
}
