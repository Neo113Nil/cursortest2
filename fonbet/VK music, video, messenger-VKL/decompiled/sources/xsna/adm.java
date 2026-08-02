package xsna;

import com.vk.im.engine.models.dialogs.DialogsCounters;

/* compiled from: OnDialogsCountUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class adm {
    public final DialogsCounters.Type a;
    public final int b;

    public adm(DialogsCounters.Type type, int i) {
        this.a = type;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adm)) {
            return false;
        }
        adm admVar = (adm) obj;
        return this.a == admVar.a && this.b == admVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogCounterUpdate(filter=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }
}
