package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChannelMessagesUpdateFromServerTask.kt */
/* loaded from: classes2.dex */
public final class v3b extends b920 {
    public final long c;
    public final boolean d;
    public final Collection<Msg> e;

    public v3b(long j, Collection collection, boolean z) {
        this.c = j;
        this.d = z;
        this.e = collection;
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (((Msg) it.next()).H6()) {
                throw new IllegalArgumentException("All messages must be real");
            }
        }
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        if (this.e.isEmpty()) {
            return EmptyList.b;
        }
        xgl0 I0 = w2wVar.I0();
        return (List) I0.u(new vh9(this, w2wVar, I0, 1));
    }
}
