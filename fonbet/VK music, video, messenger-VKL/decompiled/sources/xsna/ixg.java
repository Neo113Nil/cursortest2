package xsna;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;

/* compiled from: CommunityAddContactsViewState.kt */
/* loaded from: classes5.dex */
public final class ixg implements fm50<CommunityAddContactsState> {
    public final yzt0<com.vk.profile.community.details.impl.contacts.i> a;

    public ixg(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixg) && epx.f(this.a, ((ixg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("CommunityContactsRender(viewData="), this.a, ')');
    }
}
