package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Iterator;

/* compiled from: ImItemListMviState.kt */
/* loaded from: classes2.dex */
public final class o6w implements lm50 {
    public final Peer b;
    public final n5w c;
    public final i8w d;
    public final f8w e;
    public final p8w f;
    public final int g;

    public o6w(Peer peer, n5w n5wVar, i8w i8wVar, f8w f8wVar, p8w p8wVar, int i) {
        this.b = peer;
        this.c = n5wVar;
        this.d = i8wVar;
        this.e = f8wVar;
        this.f = p8wVar;
        this.g = i;
    }

    public static o6w a(o6w o6wVar, n5w n5wVar, i8w i8wVar, f8w f8wVar, p8w p8wVar, int i, int i2) {
        n5w n5wVar2 = n5wVar;
        Peer peer = o6wVar.b;
        if ((i2 & 2) != 0) {
            n5wVar2 = o6wVar.c;
        }
        if ((i2 & 4) != 0) {
            i8wVar = o6wVar.d;
        }
        if ((i2 & 8) != 0) {
            f8wVar = o6wVar.e;
        }
        if ((i2 & 16) != 0) {
            p8wVar = o6wVar.f;
        }
        if ((i2 & 32) != 0) {
            i = o6wVar.g;
        }
        int i3 = i;
        o6wVar.getClass();
        p8w p8wVar2 = p8wVar;
        f8w f8wVar2 = f8wVar;
        return new o6w(peer, n5wVar2, i8wVar, f8wVar2, p8wVar2, i3);
    }

    public final Dialog c(Peer peer) {
        Object obj;
        Iterator<T> it = this.c.b.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a5w a5wVar = (a5w) obj;
            if ((a5wVar instanceof Dialog) && epx.f(((Dialog) a5wVar).Zb(), peer)) {
                break;
            }
        }
        if (obj instanceof Dialog) {
            return (Dialog) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6w)) {
            return false;
        }
        o6w o6wVar = (o6w) obj;
        return epx.f(this.b, o6wVar.b) && epx.f(this.c, o6wVar.c) && epx.f(this.d, o6wVar.d) && epx.f(this.e, o6wVar.e) && epx.f(this.f, o6wVar.f) && this.g == o6wVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + v11.a((this.e.a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31)) * 31)) * 31, 31, this.f.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemListMviState(currentMember=");
        sb.append(this.b);
        sb.append(", itemList=");
        sb.append(this.c);
        sb.append(", itemsMeta=");
        sb.append(this.d);
        sb.append(", itemsHeader=");
        sb.append(this.e);
        sb.append(", itemsStories=");
        sb.append(this.f);
        sb.append(", version=");
        return vu5.b(sb, this.g, ')');
    }
}
