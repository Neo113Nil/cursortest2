package xsna;

import java.util.List;

/* compiled from: OnMembersFromRootConversationUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class d980 extends sxp {
    public final List<qtd0> b;

    public d980() {
        throw null;
    }

    public d980(List list) {
        this.b = list;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d980) && epx.f(this.b, ((d980) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return vp.b(", changerTag=null)", new StringBuilder("OnMembersFromRootConversationUpdateEvent(fromOtherConversation="), this.b);
    }
}
