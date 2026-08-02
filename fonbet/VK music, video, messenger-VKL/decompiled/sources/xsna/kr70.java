package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;

/* compiled from: ObsoleteCommentsListThreadPaginator.kt */
/* loaded from: classes4.dex */
public final class kr70 extends nfg {
    public final fae i;
    public boolean j;

    public kr70(fae faeVar, ListDataSet<cbg> listDataSet, dbg dbgVar, d9c0 d9c0Var) {
        super(listDataSet, dbgVar, d9c0Var);
        this.i = faeVar;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.nfg
    public final void c(int i, iag iagVar) {
        int i2;
        io.reactivex.rxjava3.core.q y0;
        if (this.j) {
            return;
        }
        this.j = true;
        NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
        if (newsComment == null) {
            return;
        }
        CommentThread commentThread = newsComment.L;
        if (commentThread != null) {
            List<NewsComment> list = commentThread.f;
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                NewsComment newsComment2 = list.get(i4);
                if (!newsComment2.u && !newsComment2.y) {
                    i3++;
                }
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        int b = b(newsComment);
        if (b >= 0) {
            this.a.c(b).d = Boolean.TRUE;
        }
        int i5 = this.f;
        if (i5 == 6) {
            uft0 uft0Var = new uft0();
            int i6 = this.e;
            UserId userId = this.d;
            String str = this.g;
            int i7 = newsComment.i;
            List<String> list2 = eae.b;
            VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST;
            Boolean bool = Boolean.TRUE;
            y0 = rsg0.y0(yfb.x(tft0.C(uft0Var, i6, userId, str, bool, null, Integer.valueOf(i2), Integer.valueOf(i), videoGetCommentsExtendedSortDto, list2, bool, Integer.valueOf(i7), 5, 8464)), null, null, 3).U(new vx6(new w910(this, 10), 26));
        } else {
            com.vk.newsfeed.common.requests.a aVar = new com.vk.newsfeed.common.requests.a(this.d, this.e, i2, i, i5, true, this.g, false, this.h);
            aVar.I = Integer.valueOf(newsComment.i);
            y0 = rsg0.y0(aVar, null, null, 3);
        }
        ul0 ul0Var = new ul0(this, 3);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        this.c.a(new io.reactivex.rxjava3.internal.operators.observable.c0(y0.E(lVar, lVar, kVar, ul0Var), lVar, new tra(this, 4)).subscribe(new rkz(new b1a(24, this, newsComment), 14), new bqs(new na7(20, this, newsComment), 13)));
    }
}
