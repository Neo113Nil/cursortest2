package xsna;

import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.Iterator;
import xsna.ej90;

/* compiled from: NewsCommentObsceneTextChanger.kt */
/* loaded from: classes4.dex */
public final class t960 {
    public static io.reactivex.rxjava3.disposables.c a(io.reactivex.rxjava3.internal.operators.single.v vVar, ListDataSet listDataSet) {
        return io.reactivex.rxjava3.subjects.c.b(asu0.a, vVar).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new c2y(new rlh(listDataSet, 29), 13), new q440(new jnb(com.vk.metrics.eventtracking.b.a, 9), 4));
    }

    public static boolean b(NewsComment newsComment, ej90.b bVar, ej90.c cVar) {
        String str = newsComment.b;
        if (!newsComment.Z || str == null || str.length() == 0) {
            return false;
        }
        newsComment.I = ej90.a.a(str, bVar, cVar);
        return true;
    }

    public static boolean c(NewsComment newsComment, ej90.b bVar, ej90.c cVar) {
        boolean b = b(newsComment, bVar, cVar);
        CommentThread commentThread = newsComment.L;
        if (commentThread != null) {
            Iterator<T> it = commentThread.f.iterator();
            while (it.hasNext()) {
                if (c((NewsComment) it.next(), bVar, cVar)) {
                    b = true;
                }
            }
        }
        return b;
    }
}
