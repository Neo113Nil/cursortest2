package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.ArrayList;
import java.util.List;
import xsna.g1e0;

/* compiled from: PeersLoadById.kt */
/* loaded from: classes2.dex */
public final class gu90 extends le6<ContactsList> {
    public final List<Peer.Member> b;
    public final Source c;
    public final SortOrder d;

    public gu90() {
        throw null;
    }

    public gu90(ArrayList arrayList, Source source) {
        SortOrder sortOrder = SortOrder.BY_NAME;
        this.b = arrayList;
        this.c = source;
        this.d = sortOrder;
    }

    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        g1e0.a aVar = new g1e0.a();
        aVar.h(this.b);
        aVar.b = this.c;
        ProfilesSimpleInfo Ob = ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)))).Ob();
        Object obj = nbj.a;
        return new ContactsList(nbj.a(Ob, this.d), Ob, new sbj(null, 0L, 0L, null, null, null, null, null, false, !r1.Fb(), false, 0, 0, this.d, 30719), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu90)) {
            return false;
        }
        gu90 gu90Var = (gu90) obj;
        return epx.f(this.b, gu90Var.b) && this.c == gu90Var.c && this.d == gu90Var.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "PeersLoadById(peers=" + this.b + ", source=" + this.c + ", sortOrder=" + this.d + ')';
    }
}
