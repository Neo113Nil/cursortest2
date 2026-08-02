package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r43 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r43(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                w43 w43Var = (w43) obj2;
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                lou louVar = w43Var.N;
                if (louVar != null) {
                    louVar.C0(new jy(storiesContainer, 4));
                }
                lou louVar2 = w43Var.N;
                if (louVar2 != null && louVar2.getItemCount() == 0) {
                    w43Var.E.a().c(w43Var.r);
                    break;
                }
                break;
            default:
                as80 as80Var = (as80) obj;
                Iterator<rov> it = ((jrl0) obj2).b.iterator();
                while (it.hasNext()) {
                    rov next = it.next();
                    if (next != null) {
                        next.X3(as80Var);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        it.remove();
                    }
                }
                break;
        }
    }
}
