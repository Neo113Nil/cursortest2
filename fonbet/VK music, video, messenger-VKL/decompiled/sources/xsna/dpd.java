package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;

/* compiled from: ClipsDefaultCommentsThreadPaginator.kt */
/* loaded from: classes4.dex */
public final class dpd extends nfg {
    public final fae i;
    public boolean j;

    public dpd(fae faeVar, ListDataSet<cbg> listDataSet, dbg dbgVar, d9c0 d9c0Var) {
        super(listDataSet, dbgVar, d9c0Var);
        this.i = faeVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.nfg
    public final void c(int i, iag iagVar) {
        if (this.j) {
            return;
        }
        this.j = true;
        NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
        if (newsComment == null) {
            return;
        }
        CommentThread commentThread = ((NewsComment) iagVar).L;
        String str = commentThread != null ? commentThread.h : null;
        int b = b(newsComment);
        if (b >= 0) {
            this.a.c(b).d = Boolean.TRUE;
        }
        uft0 uft0Var = new uft0();
        int i2 = this.e;
        UserId userId = this.d;
        String str2 = this.g;
        Integer m = str != null ? arm0.m(10, str) : null;
        int i3 = newsComment.i;
        List<String> list = eae.b;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST;
        Boolean bool = Boolean.TRUE;
        dz2 x = yfb.x(tft0.C(uft0Var, i2, userId, str2, bool, m, 0, Integer.valueOf(i), videoGetCommentsExtendedSortDto, list, bool, Integer.valueOf(i3), 5, 8448));
        ahn.D(x);
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.y0(x, null, null, 3).U(new dg1(new w8(this, 24), 9));
        cpd cpdVar = new cpd(this, 0);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        this.c.a(new io.reactivex.rxjava3.internal.operators.observable.c0(U.E(lVar, lVar, kVar, cpdVar), lVar, new igb(this, 1)).subscribe(new defpackage.p(new defpackage.o(10, this, newsComment), 12), new sv(new tn0(7, this, newsComment), 15)));
    }
}
