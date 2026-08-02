package xsna;

import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.newsfeed.entries.Post;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DraftsListNotificationsDelegate.kt */
/* loaded from: classes18.dex */
public final class deo {
    public static final void a(ydo ydoVar, Post post) {
        Iterator<Post> it = ((DraftsListState) ydoVar.b.getCurrentState()).c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().n == post.n) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            rdi.y(ydoVar, new k0j(post, 8));
        }
        if (post.Z1()) {
            rdi.y(ydoVar, new mmf(post, 26));
        }
    }

    public static final ArrayList b(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Post) obj).n != i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
