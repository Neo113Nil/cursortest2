package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.List;
import xsna.sdo;

/* compiled from: DraftsListNotificationsListener.kt */
/* loaded from: classes18.dex */
public final class eeo implements bd70<Object> {
    public static final List<Integer> c = e43.l(105, 100, 152, 102, 101);
    public final wcj b;

    public eeo(wcj wcjVar) {
        this.b = wcjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // xsna.bd70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(int i, int i2, Object obj) {
        Object aVar;
        Object obj2 = null;
        if (i != 105) {
            if (i != 152) {
                switch (i) {
                    case 100:
                        Post post = obj instanceof Post ? (Post) obj : null;
                        if (post != null) {
                            aVar = new sdo.g.b(post.n);
                            break;
                        } else {
                            return;
                        }
                    case 101:
                    case 102:
                        Post post2 = obj instanceof Post ? (Post) obj : null;
                        if (post2 != null) {
                            aVar = new sdo.g.c(post2);
                            break;
                        } else {
                            return;
                        }
                }
            } else {
                NewsfeedExternalAction.c.w wVar = obj instanceof NewsfeedExternalAction.c.w ? (NewsfeedExternalAction.c.w) obj : null;
                if (wVar == null) {
                    return;
                } else {
                    obj2 = new sdo.g.b(wVar.b);
                }
            }
            if (obj2 == null) {
                this.b.invoke(obj2);
                return;
            }
            return;
        }
        Post post3 = obj instanceof Post ? (Post) obj : null;
        if (post3 == null) {
            return;
        } else {
            aVar = new sdo.g.a(post3);
        }
        obj2 = aVar;
        if (obj2 == null) {
        }
    }
}
