package xsna;

import com.vk.clips.sdk.shared.api.external.action.ClipExternalAction;

/* compiled from: ClipExternalUpdateEvent.kt */
/* loaded from: classes17.dex */
public final class qvc {
    public final String a;
    public final ClipExternalAction b;

    public qvc(String str, ClipExternalAction clipExternalAction) {
        this.a = str;
        this.b = clipExternalAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvc)) {
            return false;
        }
        qvc qvcVar = (qvc) obj;
        return epx.f(this.a, qvcVar.a) && epx.f(this.b, qvcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipExternalUpdateEvent(uniqueKey=" + this.a + ", action=" + this.b + ')';
    }
}
