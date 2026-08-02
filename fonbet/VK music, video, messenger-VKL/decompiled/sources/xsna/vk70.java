package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: NotifyContentLoadFromCache.kt */
/* loaded from: classes2.dex */
public final class vk70 extends le6<s3q0> {
    public final UserId b;
    public final Collection<Msg> c;
    public w2w d;

    /* compiled from: NotifyContentLoadFromCache.kt */
    public static final class a {
        public final LinkedHashSet a = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vk70(UserId userId, Collection<? extends Msg> collection) {
        this.b = userId;
        this.c = collection;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        this.d = w2wVar;
        ux40 ux40Var = new ux40(this, 7);
        a aVar = new a();
        ux40Var.invoke(aVar);
        LinkedHashSet linkedHashSet = aVar.a;
        if (!linkedHashSet.isEmpty()) {
            MsgIdType msgIdType = MsgIdType.LOCAL_ID;
            ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).b));
            }
            dj30 dj30Var = new dj30(msgIdType, arrayList, null, Source.NETWORK, true, "NotifyContentLoadFromCache", 4);
            w2w w2wVar2 = this.d;
            if (w2wVar2 == null) {
                w2wVar2 = null;
            }
            w2wVar2.L0(this, dj30Var);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk70)) {
            return false;
        }
        vk70 vk70Var = (vk70) obj;
        return epx.f(this.b, vk70Var.b) && epx.f(this.c, vk70Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyContentLoadFromCache(dialogId=");
        sb.append(this.b);
        sb.append(", msgs=");
        return l4.h(sb, this.c, ')');
    }
}
