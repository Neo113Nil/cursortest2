package xsna;

import android.util.SparseArray;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: CheckClipsInMessagesCmd.kt */
/* loaded from: classes2.dex */
public final class k0c extends le6<Boolean> {
    public final Collection<Integer> b;

    public k0c(Collection<Integer> collection) {
        this.b = collection;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        ArrayList<Attach> arrayList;
        SparseArray<Msg> T = w2wVar.I0().o().T(this.b);
        u4q0 u4q0Var = zik0.a;
        int size = T.size();
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= size) {
                break;
            }
            T.keyAt(i);
            Msg valueAt = T.valueAt(i);
            if ((valueAt instanceof MsgFromUser) && ((arrayList = ((MsgFromUser) valueAt).H) == null || !arrayList.isEmpty())) {
                for (Attach attach : arrayList) {
                    if ((attach instanceof AttachVideo) && ((AttachVideo) attach).b.C2()) {
                        z = true;
                        break loop0;
                    }
                }
            }
            i++;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0c) && epx.f(this.b, ((k0c) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "CheckClipsInMessagesCmd(msgLocalIdsCount=" + this.b.size() + ')';
    }
}
