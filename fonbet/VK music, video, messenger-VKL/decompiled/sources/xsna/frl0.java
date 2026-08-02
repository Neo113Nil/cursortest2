package xsna;

import com.vk.dto.stories.model.StoryEntry;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class frl0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ frl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                List<? extends StoryEntry> list = (List) obj;
                Iterator<rov> it = ((jrl0) obj2).b.iterator();
                while (it.hasNext()) {
                    rov next = it.next();
                    if (next != null) {
                        next.E1(list);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        it.remove();
                    }
                }
                break;
            default:
                ((nhj) obj2).invoke(Integer.valueOf(i), Integer.valueOf(i2), (String) obj);
                break;
        }
    }
}
