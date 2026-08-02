package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import java.util.Iterator;
import java.util.List;
import xsna.d110;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wi6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wi6(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                yi6 yi6Var = (yi6) this.d;
                List list = (List) this.e;
                return ((zi50) yi6Var.f.getValue()).a(cj50.a((List) obj, new o8(yi6Var.d, 1))).l(new nb(new xi6(list, this.c, 0), 2));
            case 1:
                k110 k110Var = (k110) this.d;
                n010 n010Var = (n010) this.e;
                if (((Boolean) obj).booleanValue()) {
                    Iterator<T> it = k110Var.d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((BoardComment) obj2).b == this.c) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    BoardComment boardComment = (BoardComment) obj2;
                    if (boardComment != null) {
                        boardComment.s = false;
                    }
                    n010Var.T(new d110.c(k110Var.d));
                }
                return s3q0.a;
            default:
                final vh40 vh40Var = (vh40) this.d;
                final UserId userId = (UserId) this.e;
                final List list2 = (List) obj;
                final int i = this.c;
                return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.sh40
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        vh40 vh40Var2 = vh40.this;
                        fq40 fq40Var = vh40Var2.b;
                        int i2 = i;
                        UserId userId2 = userId;
                        AudioBook y = fq40Var.y(i2, userId2);
                        if (y != null) {
                            sg40 sg40Var = vh40Var2.c;
                            sg40Var.n.submit(new og40(sg40Var, userId2, y));
                            for (AudioBookChapter audioBookChapter : list2) {
                                MusicTrack d = com.vk.dto.music.audiobook.a.d(y, audioBookChapter);
                                MusicTrack a = kq40.a(com.vk.dto.music.audiobook.a.d(y, audioBookChapter));
                                r5v0 r5v0Var = k840.a.h;
                                if (r5v0Var == null) {
                                    r5v0Var = null;
                                }
                                r5v0Var.b(new ib50(d, a));
                            }
                        }
                    }
                });
        }
    }
}
