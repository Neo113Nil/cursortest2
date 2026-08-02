package xsna;

import com.vk.dto.newsfeed.PostAuthor;
import com.vk.im.design.view.comments.VkCommentView;
import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: BindDelegate.kt */
/* loaded from: classes4.dex */
public final class v27 {
    public static final VkCommentView.c.a a(iag iagVar) {
        if (fkq0.d(iagVar.getUid())) {
            throw null;
        }
        throw null;
    }

    public static final void b(iag iagVar, cbg cbgVar, boolean z, aa aaVar) {
        PostAuthor postAuthor;
        iagVar.C();
        c(iagVar, cbgVar);
        if ((iagVar instanceof NewsComment) && !c(iagVar, cbgVar)) {
            NewsComment newsComment = (NewsComment) iagVar;
            if (newsComment.G || newsComment.C) {
                PostAuthor postAuthor2 = newsComment.F;
                if (postAuthor2 != null && postAuthor2.a(cn70.b(16)) != null) {
                    boolean z2 = newsComment.C;
                    boolean z3 = newsComment.G;
                    if (z3 && z2) {
                        throw null;
                    }
                    if (!z3) {
                        throw null;
                    }
                    throw null;
                }
            } else if (newsComment.B && (postAuthor = newsComment.E) != null && postAuthor.a(cn70.b(16)) != null) {
                throw null;
            }
        }
        throw null;
    }

    public static final boolean c(iag iagVar, cbg cbgVar) {
        bbg bbgVar;
        NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
        if (newsComment != null ? newsComment.t : false) {
            if ((cbgVar == null || (bbgVar = cbgVar.e) == null || !bbgVar.b) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
