package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.li7;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class yi7 extends beg0 {
    public final /* synthetic */ BoardTopicViewFragment d;
    public final /* synthetic */ BoardComment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi7(BoardTopicViewFragment boardTopicViewFragment, BoardComment boardComment) {
        super(boardTopicViewFragment);
        this.d = boardTopicViewFragment;
        this.e = boardComment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.beg0
    public final void r() {
        BoardComment boardComment = this.e;
        int i = boardComment.b;
        BoardTopicViewFragment boardTopicViewFragment = this.d;
        if (i == boardTopicViewFragment.C0) {
            boardTopicViewFragment.vo();
        }
        yh7 yh7Var = boardTopicViewFragment.r0;
        if (yh7Var != null) {
            BoardTopicViewFragment boardTopicViewFragment2 = yh7Var.n;
            int g = yh7.g(yh7Var.e, boardComment);
            Iterator<LinkedList<BoardComment>> it = yh7Var.d.iterator();
            while (it.hasNext()) {
                yh7.g(it.next(), boardComment);
            }
            yh7Var.c--;
            boardTopicViewFragment2.qo();
            ArrayList arrayList = new ArrayList(yh7Var.e);
            BoardTopicViewFragment.b bVar = boardTopicViewFragment2.o0;
            bVar.x0(arrayList, false);
            bVar.notifyItemRemoved(g);
        }
        ((ysg0) boardTopicViewFragment.f0.getValue()).a(new li7.c(boardTopicViewFragment.ro()));
    }
}
