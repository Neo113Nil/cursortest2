package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PostingStatePostProcessor.kt */
/* loaded from: classes4.dex */
public final class wmc0 implements ouk0 {
    public final ArrayList a = new ArrayList();
    public final Object b = new Object();

    @Override // xsna.ouk0
    public final PostingState a(PostingState postingState) {
        synchronized (this.b) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                postingState = ((ouk0) it.next()).a(postingState);
            }
        }
        return postingState;
    }

    public final void b(ouk0 ouk0Var) {
        synchronized (this.b) {
            this.a.add(ouk0Var);
        }
    }
}
