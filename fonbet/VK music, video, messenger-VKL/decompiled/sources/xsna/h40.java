package xsna;

import com.vk.channels.impl.reactions.model.ActionParamsStatus;

/* compiled from: BillingEvent.kt */
/* loaded from: classes16.dex */
public final class h40 {
    public final ActionParamsStatus a;

    public h40(ActionParamsStatus actionParamsStatus) {
        this.a = actionParamsStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h40) && this.a == ((h40) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionParams(status=" + this.a + ')';
    }

    public h40() {
        this(ActionParamsStatus.UNKNOWN);
    }
}
