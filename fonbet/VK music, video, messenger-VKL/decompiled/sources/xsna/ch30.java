package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import com.vk.im.engine.models.attaches.AttachVideo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: MsgAttachCollectionUploadCmd.kt */
/* loaded from: classes2.dex */
public final class ch30 extends le6<List<? extends Attach>> {
    public final Set<Peer> b;
    public final Collection<Attach> c;
    public final AttachUploadingEndpoint d;
    public final Long e;

    public /* synthetic */ ch30(Set set, Collection collection, AttachUploadingEndpoint attachUploadingEndpoint) {
        this(set, collection, attachUploadingEndpoint, null);
    }

    @Override // xsna.le6
    public final List<? extends Attach> e(w2w w2wVar) {
        Collection<Attach> collection = this.c;
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        Collection<Attach> collection2 = collection;
        boolean z = collection2 instanceof Collection;
        if (!z || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((Attach) it.next()) instanceof AttachImage)) {
                    if (!z || !collection2.isEmpty()) {
                        Iterator<T> it2 = collection2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (!(((Attach) it2.next()) instanceof AttachVideo)) {
                                if (!z || !collection2.isEmpty()) {
                                    Iterator<T> it3 = collection2.iterator();
                                    while (it3.hasNext() && (((Attach) it3.next()) instanceof AttachDoc)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        otn.a.getClass();
        otn.b.setLength(0);
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it4 = collection2.iterator();
        while (it4.hasNext()) {
            arrayList.add(w2wVar.J0(this, new eh30(this.b, (Attach) it4.next(), this.d, this.e, 8)));
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add((Attach) ((fz3) it5.next()).await());
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch30)) {
            return false;
        }
        ch30 ch30Var = (ch30) obj;
        return epx.f(this.b, ch30Var.b) && epx.f(this.c, ch30Var.c) && this.d == ch30Var.d && epx.f(this.e, ch30Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = (this.d.hashCode() + s3j0.a(this.b.hashCode() * 31, this.c, 31)) * 31;
        Long l = this.e;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgAttachCollectionUploadCmd(dialogs=");
        sb.append(this.b);
        sb.append(", attaches=");
        sb.append(this.c);
        sb.append(", endpoint=");
        sb.append(this.d);
        sb.append(", channelId=");
        return iq.b(sb, this.e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ch30(Set<? extends Peer> set, Collection<? extends Attach> collection, AttachUploadingEndpoint attachUploadingEndpoint, Long l) {
        this.b = set;
        this.c = collection;
        this.d = attachUploadingEndpoint;
        this.e = l;
    }
}
