package xsna;

import com.vk.im.engine.models.messages.Msg;

/* compiled from: DialogWithLastMessageApiModel.kt */
/* loaded from: classes2.dex */
public final class pmm implements nuu {
    public final com.vk.im.engine.models.dialogs.a a;
    public final Msg b;

    public pmm(com.vk.im.engine.models.dialogs.a aVar, Msg msg) {
        this.a = aVar;
        this.b = msg;
    }

    @Override // xsna.nuu
    public final Msg G0() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmm)) {
            return false;
        }
        pmm pmmVar = (pmm) obj;
        return epx.f(this.a, pmmVar.a) && epx.f(this.b, pmmVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Msg msg = this.b;
        return hashCode + (msg == null ? 0 : msg.hashCode());
    }

    public final String toString() {
        return "DialogWithLastMessageApiModel(dialog=" + this.a + ", lastMessage=" + this.b + ')';
    }
}
