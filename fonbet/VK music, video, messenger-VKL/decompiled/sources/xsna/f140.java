package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: MsgUpdateFromServerMergeTask.kt */
/* loaded from: classes2.dex */
public final class f140 extends b920 {
    public final Collection<Msg> c;

    /* JADX WARN: Multi-variable type inference failed */
    public f140(Collection<? extends Msg> collection) {
        this.c = collection;
        Collection<? extends Msg> collection2 = collection;
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
        return (List) w2wVar.I0().u(new zf1(18, w2wVar, this));
    }
}
